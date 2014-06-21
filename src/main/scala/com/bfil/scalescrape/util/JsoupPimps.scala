package com.bfil.scalescrape.util

import scala.collection.JavaConversions.asScalaIterator

import org.jsoup.nodes.{Document, Element}
import org.jsoup.select.Elements

trait JsoupPimps {
  implicit class RichDocument(doc: Document) {
    def $(selector: String) = doc.select(selector)
  }
  
  implicit class RichElements(els: Elements) extends Iterable[Element] {
    def iterator = els.iterator
    def $(selector: String) = els.select(selector)
    def value = els.`val`
  }
}