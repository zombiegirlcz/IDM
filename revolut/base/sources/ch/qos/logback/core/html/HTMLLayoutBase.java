package ch.qos.logback.core.html;

import a0.d;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.ScanException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HTMLLayoutBase<E> extends LayoutBase<E> {
    protected CssBuilder cssBuilder;
    protected Converter<E> head;
    protected String pattern;
    protected String title = "Logback Log Messages";
    protected long counter = 0;

    private void buildHeaderRowForTable(StringBuilder sb6) {
        sb6.append("<tr class=\"header\">");
        sb6.append(CoreConstants.LINE_SEPARATOR);
        for (Converter<E> next = this.head; next != null; next = next.getNext()) {
            if (computeConverterName(next) != null) {
                sb6.append("<td class=\"");
                sb6.append(computeConverterName(next));
                sb6.append("\">");
                sb6.append(computeConverterName(next));
                sb6.append("</td>");
                sb6.append(CoreConstants.LINE_SEPARATOR);
            }
        }
        sb6.append("</tr>");
        sb6.append(CoreConstants.LINE_SEPARATOR);
    }

    public String computeConverterName(Converter<E> converter) {
        String simpleName = converter.getClass().getSimpleName();
        int iIndexOf = simpleName.indexOf("Converter");
        return iIndexOf == -1 ? simpleName : simpleName.substring(0, iIndexOf);
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getContentType() {
        return "text/html";
    }

    public CssBuilder getCssBuilder() {
        return this.cssBuilder;
    }

    public abstract Map<String, String> getDefaultConverterMap();

    public Map<String, String> getEffectiveConverterMap() {
        Map map;
        HashMap map2 = new HashMap();
        Map<String, String> defaultConverterMap = getDefaultConverterMap();
        if (defaultConverterMap != null) {
            map2.putAll(defaultConverterMap);
        }
        Context context = getContext();
        if (context != null && (map = (Map) context.getObject("PATTERN_RULE_REGISTRY")) != null) {
            map2.putAll(map);
        }
        return map2;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileFooter() {
        return a.i(new StringBuilder(), CoreConstants.LINE_SEPARATOR, "</body></html>");
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileHeader() {
        StringBuilder sbS = p.a.s("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        String str = CoreConstants.LINE_SEPARATOR;
        j6.a.D(sbS, str, "<html>", str, "  <head>");
        sbS.append(str);
        sbS.append("    <title>");
        d.C(sbS, this.title, "</title>", str);
        this.cssBuilder.addCss(sbS);
        sbS.append(str);
        sbS.append("  </head>");
        sbS.append(str);
        return a.i(sbS, "<body>", str);
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationFooter() {
        return "</table>";
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        StringBuilder sbS = p.a.s("<hr/>");
        String str = CoreConstants.LINE_SEPARATOR;
        sbS.append(str);
        sbS.append("<p>Log session start time ");
        sbS.append(new Date());
        sbS.append("</p><p></p>");
        sbS.append(str);
        d.C(sbS, str, "<table cellspacing=\"0\">", str);
        buildHeaderRowForTable(sbS);
        return sbS.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public void setCssBuilder(CssBuilder cssBuilder) {
        this.cssBuilder = cssBuilder;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        try {
            Parser parser = new Parser(this.pattern);
            parser.setContext(getContext());
            Converter<E> converterCompile = parser.compile(parser.parse(), getEffectiveConverterMap());
            this.head = converterCompile;
            ConverterUtil.startConverters(converterCompile);
            this.started = true;
        } catch (ScanException e) {
            addError("Incorrect pattern found", e);
        }
    }

    public void startNewTableIfLimitReached(StringBuilder sb6) {
        if (this.counter >= 10000) {
            this.counter = 0L;
            sb6.append("</table>");
            String str = CoreConstants.LINE_SEPARATOR;
            j6.a.D(sb6, str, "<p></p>", "<table cellspacing=\"0\">", str);
            buildHeaderRowForTable(sb6);
        }
    }
}
