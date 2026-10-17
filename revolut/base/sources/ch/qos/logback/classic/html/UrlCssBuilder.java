package ch.qos.logback.classic.html;

import ch.qos.logback.core.html.CssBuilder;

/* JADX INFO: loaded from: classes16.dex */
public class UrlCssBuilder implements CssBuilder {

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    String f24053url = "http://logback.qos.ch/css/classic.css";

    @Override // ch.qos.logback.core.html.CssBuilder
    public void addCss(StringBuilder sb6) {
        sb6.append("<link REL=StyleSheet HREF=\"");
        sb6.append(this.f24053url);
        sb6.append("\" TITLE=\"Basic\" />");
    }

    public String getUrl() {
        return this.f24053url;
    }

    public void setUrl(String str) {
        this.f24053url = str;
    }
}
