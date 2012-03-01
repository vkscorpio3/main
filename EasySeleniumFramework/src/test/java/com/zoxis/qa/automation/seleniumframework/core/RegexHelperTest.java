package com.zoxis.qa.automation.seleniumframework.core;

import org.testng.annotations.Test;

import com.zoxis.qa.automation.seleniumframework.core.utilities.RegexHelper;

public class RegexHelperTest {
	
	public static final String HTML = "<!DOCTYPE HTML PUBLIC \"~//W3C//DTD HTML 4.01 Transitional//EN http://www.w3.org/TR/html4/loose.dtd\">"
			+"	<html>"
			+"	<head>"
			+"		<title> Technische Unie - Zoeken </title>"
			+"		"
			+"		<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js\"></script>"
			+"		<script type=\"text/javascript\" src=\"/static/js/ajax/jquery.forms.js\"></script>"
			+"    	"
			+"		<script type=\"text/javascript\" src=\"/static/js/tunie_main.js\"></script>"
			+"		<script type=\"text/javascript\" src=\"/static/js/tunie_search.js\"></script>"
			+"		<script type=\"text/javascript\" src=\"/static/js/lightbox/jquery.lightbox-0.5.min.js\"></script>"
			+"		"
			+"        <link rel=\"stylesheet\" href=\"/static/css/tunie_main.css\" type=\"text/css\" media=\"screen\" />"
			+"		<link rel=\"stylesheet\" href=\"/static/css/tunie_search.css\" type=\"text/css\" media=\"screen\" />"
			+"		<link rel=\"stylesheet\" href=\"/static/css/lightbox/jquery.lightbox-0.5.css\" type=\"text/css\" media=\"screen\" />"
			+"	</head>"
			+"	<body onload=\"setFocusInSearchBox()\">"
			+"				<a href=\"/login.jsp?_DARGS=/search.jsp_A&_DAV=logout&_dynSessConf=-6148448723382341021\">"
			+"				Logout"
			+"				</a>"
			+"	"
			+"    <div id=\"headerBasket\">"
			+"		<strong>"
			+"			"
			+"			"
			+"			"
			+"			<a href=\"/cart/cartOverview.jsp?_DARGS=/cart/gadgets/miniCart.jsp_A&_DAV=true&_dynSessConf=-6148448723382341021\">"
			+"			Your cart</a>"
			+"		</strong>"
			+"		<br/>"
			+"		<span id=\"basketItems\">0</span> items: "
			+"		"
			+"		"
			+"		<span id=\"basketItems\">√õ 0,00</span><br/>"
			+"	</div>"
			+"	"
			+"	"
			+"	 "
			+"		"
			+"		"
			+"		  "
			+"		  "
			+"		"
			+"		  "
			+"		  "
			+"			"
			+"			   "
			+"			   "
			+"			   "
			+"			  "
			+"			"
			+"			   "
			+"			   "
			+"			   <div id=\"errorpanel\">"
			+"			   "
			+"			   "
			+"			  "
			+"			"
			+"			   "
			+"			   "
			+"			   "
			+"				  <li>atg.search.routing.RoutingRepositoryException: javax.ejb.ObjectNotFoundException - No Search Environment found for content label &#39;Catalog&#39; and target type &#39;Production&#39;</li>"
			+"			  "
			+"			  "
			+"			"
			+"			   "
			+"			   "
			+"			   "
			+"			  "
			+"			  </div>"
			+"			   "
			+"			"
			+"		  "
			+"		"
			+"		"
			+"			"
			+"		<div id=\"search_searchpage\">"
			+"			<div id=\"search_searchinnerpage\">"
			+"			"
			+"		"
			+"		  "
			+"		  "
			+"			"
			+"			"
			+"			<div id=\"search_searchbox\">"
			+"				"
			+"				<form id=\"searchForm\" name=\"searchForm\" action=\"search.jsp?_DARGS=/search.jsp.searchForm\" method=\"post\"><input name=\"_dyncharset\" value=\"UTF-8\" type=\"hidden\"></input><input name=\"_dynSessConf\" value=\"-6148448723382341021\" type=\"hidden\"></input>"
			+"					"
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.successURL\" value=\"/search.jsp\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.successURL\" value=\" \" type=\"hidden\">"
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.errorURL\" value=\"/search.jsp\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.errorURL\" value=\" \" type=\"hidden\">"
			+"					<input id=\"language\" name=\"language\" value=\"dutch\" type=\"hidden\"><input name=\"_D:language\" value=\" \" type=\"hidden\">"
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.searchRequest.responseNumberSettingsString\" value=\"\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.searchRequest.responseNumberSettingsString\" value=\" \" type=\"hidden\">"
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.searchRequest.optimize\" value=\"1\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.searchRequest.optimize\" value=\" \" type=\"hidden\">"
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.searchRequest.pageSize\" value=\"50\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.searchRequest.pageSize\" value=\" \" type=\"hidden\">"
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.searchRequest.pageNum\" value=\"0\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.searchRequest.pageNum\" value=\" \" type=\"hidden\">"
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.searchRequest.docSortOrder\" value=\"ascending\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.searchRequest.docSortOrder\" value=\" \" type=\"hidden\">  "
			+"					<input name=\"/atg/commerce/search/catalog/QueryFormHandler.searchRequest.docSort\" value=\"predicate\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.searchRequest.docSort\" value=\" \" type=\"hidden\">"
			+"				 	<input name=\"/atg/commerce/search/catalog/QueryFormHandler.searchRequest.docSortPred\" value=\"strprop:ascending:type|numprop:descending:childSKUs.salesQuantityLast12Months|strprop:ascending:childSKUs.skuSubgroupCode\" type=\"hidden\"><input name=\"_D:/atg/commerce/search/catalog/QueryFormHandler.searchRequest.docSortPred\" value=\" \" type=\"hidden\">"
			+"				 	<input name=\"qfh_rct\" value=\"\" type=\"hidden\"><input name=\"_D:qfh_rct\" value=\" \" type=\"hidden\">"
			+"					<input name=\"fh_sr\" value=\"true\" type=\"hidden\"><input name=\"_D:fh_sr\" value=\" \" type=\"hidden\">"
			+"					<input name=\"qfh_fsr\" value=\"true\" type=\"hidden\"><input name=\"_D:qfh_fsr\" value=\" \" type=\"hidden\">"
			+"					<input name=\"qfh_ft\" value=\"\" type=\"hidden\"><input name=\"_D:qfh_ft\" value=\" \" type=\"hidden\">"
			+"					"
			+"				 	<input name=\"qfh_nl\" value=\"true\" type=\"hidden\"><input name=\"_D:qfh_nl\" value=\" \" type=\"hidden\">"
			+"					<input name=\"qfh_zma\" value=\"false\" type=\"hidden\"><input name=\"_D:qfh_zma\" value=\" \" type=\"hidden\">"
			+"					<input name=\"qfh_bcfc\" value=\"false\" type=\"hidden\"><input name=\"_D:qfh_bcfc\" value=\" \" type=\"hidden\">"
			+"					<input name=\"qfh_bcfr\" value=\"false\" type=\"hidden\"><input name=\"_D:qfh_bcfr\" value=\" \" type=\"hidden\">"
			+"					<input name=\"qfh_bclr\" value=\"\" type=\"hidden\"><input name=\"_D:qfh_bclr\" value=\" \" type=\"hidden\">"
			+"					<input name=\"qfh_bcfa\" value=\"false\" type=\"hidden\"><input name=\"_D:qfh_bcfa\" value=\" \" type=\"hidden\">"
			+"					"
			+"					<input type=\"hidden\" value=\"\" name=\"trail\"/>"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"							"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"					"
			+"	"
			+"					"
			+"					"
			+"					"
			+"		"
			+"		"
			+"			<!-- pass in facet trail from previous request -->"
			+"			"
			+"			<!-- add the facet selection to the trail; also include the SRCH facet -->"
			+"			<!-- if there is search text and the SRCH facet hasn't been added yet -->"
			+"			"
			+"			"
			+"				"
			+"			"
			+"			"
			+"		"
			+"			<!-- pass in facet trail from previous request -->"
			+"			"
			+"			<!-- add the facet selection to the trail; also include the SRCH facet -->"
			+"			<!-- if there is search text and the SRCH facet hasn't been added yet -->"
			+"			"
			+"			"
			+"				"
			+"			"
			+"			"
			+"				"
			+"				"
			+"			"
			+"									"
			+"		"
			+"		"
			+"		"
			+"		"
			+"			"
			+"				<div class=\"search_searchbox_header\"> Zoeken </div>"
			+"				<div>"
			+"					<!-- input box -->"
			+"					<input id=\"question\" name=\"question\" value=\"kabel\" type=\"text\" size=\"30\"><input name=\"_D:question\" value=\" \" type=\"hidden\">"
			+"					"
			+"					<!-- search button -->"
			+"					"
			+"					<input id=\"submitSearchBTN\" name=\"submitSearchBTN\" value=\"Zoeken\" action=\"search.jsp\" type=\"submit\"><input name=\"_D:submitSearchBTN\" value=\" \" type=\"hidden\">"
			+"					<input id=\"submitZMASearchBTN\" name=\"submitZMASearchBTN\" value=\"ZMA\" action=\"search.jsp\" type=\"submit\"><input name=\"_D:submitZMASearchBTN\" value=\" \" type=\"hidden\">"
			+"				</div>				"
			+"				<div class=\"search_searchbox_priorinput\">"
			+"				</div>				"
			+"				<div class=\"search_searchbox_resultinfo\">"
			+"					"
			+"					"
			+"					"
			+"					"
			+"				</div>"
			+"			<input name=\"_DARGS\" value=\"/search.jsp.searchForm\" type=\"hidden\"></input></form>"
			+"			</div>"
			+"			"
			+"			"
			+"			<div id=\"search_searchbreadcrumb\">"
			+"				"
			+"			</div>"
			+"			"
			+"			"
			+"			"
			+"			"
			+"			"
			+"	"
			+"	"
			+"			"
			+"	<script type=\"text/javascript\">"
			+"		$(function() {"
			+"			$('a.search_searchresult_prodimage_anchor').lightBox({"
			+"				imageLoading: '/static/images/lightbox/lightbox-ico-loading.gif',"
			+"				imageBtnClose: '/static/images/lightbox/lightbox-btn-close.gif',"
			+"				imageBtnPrev: '/static/images/lightbox/lightbox-btn-prev.gif',"
			+"				imageBtnNext: '/static/images/lightbox/lightbox-btn-next.gif',"
			+"			   });"
			+"			"
			+"			"
			+"			$(\"#compareProductsBtn\").click(function() {"
			+"				var noOfProductsSelected = $(\"input:checked[name=productIdCheckBox]\").length;"
			+"				if(noOfProductsSelected <= 1) {"
			+"					alert(\"Select atleast two products for comparision\");"
			+"				} else if(noOfProductsSelected > 10){"
			+"					alert(\"You cannot select more than 10 products for comparision\");"
			+"				} else {"
			+"					var compareProductIds = $(\"input:checked[name=productIdCheckBox]\").map(function() {"
			+"						return $(this).val();"
			+"					}).get().join();"
			+"					$(\"#compareProductIds\").val(compareProductIds);"
			+"					$(\"#compareProductsForm\").submit();"
			+"				}"
			+"			});"
			+"			"
			+"			"
			+"			$(\"a.replacementProduct\").click(function() {"
			+"				$(\"#sourceSkuToCompare\").val($(\"input:hidden[name=source\"+this.id+\"]\").val());"
			+"				$(\"#destinationSkuToCompare\").val($(\"input:hidden[name=destination\"+this.id+\"]\").val());"
			+"				$(\"#replacementProductsForm\").submit();"
			+"			});"
			+"			"
			+"		});	"
			+"	</script>"
			+"	"
			+"</body>"
			+"</html>";
	
	@Test(testName="RegexMatchTest")
	public void testRegex() throws Exception{
		boolean result = RegexHelper.match("Exception", RegexHelperTest.HTML);
		if(!result){
			throw new Exception("Failed");
		}
	}
	
}