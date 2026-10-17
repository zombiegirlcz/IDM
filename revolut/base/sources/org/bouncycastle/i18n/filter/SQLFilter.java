package org.bouncycastle.i18n.filter;

/* JADX INFO: loaded from: classes14.dex */
public class SQLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i;
        String str2;
        StringBuilder sb6 = new StringBuilder(str);
        int i2 = 0;
        while (i2 < sb6.length()) {
            char cCharAt = sb6.charAt(i2);
            if (cCharAt == '\n') {
                i = i2 + 1;
                str2 = "\\n";
            } else if (cCharAt == '\r') {
                i = i2 + 1;
                str2 = "\\r";
            } else if (cCharAt == '\"') {
                i = i2 + 1;
                str2 = "\\\"";
            } else if (cCharAt == '\'') {
                i = i2 + 1;
                str2 = "\\'";
            } else if (cCharAt == '-') {
                i = i2 + 1;
                str2 = "\\-";
            } else if (cCharAt == '/') {
                i = i2 + 1;
                str2 = "\\/";
            } else if (cCharAt == ';') {
                i = i2 + 1;
                str2 = "\\;";
            } else if (cCharAt == '=') {
                i = i2 + 1;
                str2 = "\\=";
            } else if (cCharAt != '\\') {
                i2++;
            } else {
                i = i2 + 1;
                str2 = "\\\\";
            }
            sb6.replace(i2, i, str2);
            i2 = i;
            i2++;
        }
        return sb6.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
