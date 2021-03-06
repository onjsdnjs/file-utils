package br.com.newbesources.pfu.sample;

import java.util.List;

import br.com.newbesources.pfu.core.annotations.Footer;
import br.com.newbesources.pfu.core.annotations.Header;
import br.com.newbesources.pfu.core.annotations.Lines;


/**
 * @author gabriel
 * 
 * Oct 10, 2013
 */
public class CompleteModelSample {
	@Header
	private HeaderSample header;
	@Footer
	private FooterSample footer;
	@Lines
	private List<ModelSample> lines;

	public HeaderSample getHeader() {
		return header;
	}

	public void setHeader(HeaderSample header) {
		this.header = header;
	}

	public FooterSample getFooter() {
		return footer;
	}

	public void setFooter(FooterSample footer) {
		this.footer = footer;
	}

	public List<ModelSample> getLines() {
		return lines;
	}

	public void setLines(List<ModelSample> lines) {
		this.lines = lines;
	}

	@Override
	public String toString() {
		return "CompleteModel [header=" + header + ", footer=" + footer
				+ ", lines=" + lines + "]";
	}
}