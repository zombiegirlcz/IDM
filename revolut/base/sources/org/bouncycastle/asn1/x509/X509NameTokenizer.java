package org.bouncycastle.asn1.x509;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes14.dex */
public class X509NameTokenizer {

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    private StringBuffer f228235buf;
    private int index;
    private char separator;
    private String value;

    public X509NameTokenizer(String str) {
        this(str, CoreConstants.COMMA_CHAR);
    }

    public boolean hasMoreTokens() {
        return this.index < this.value.length();
    }

    public String nextToken() {
        if (this.index >= this.value.length()) {
            return null;
        }
        int i = this.index + 1;
        this.f228235buf.setLength(0);
        boolean z = false;
        boolean z3 = false;
        while (i != this.value.length()) {
            char cCharAt = this.value.charAt(i);
            if (cCharAt != '\"') {
                if (!z && !z3) {
                    if (cCharAt == '\\') {
                        this.f228235buf.append(cCharAt);
                        z = true;
                    } else {
                        if (cCharAt == this.separator) {
                            break;
                        }
                        this.f228235buf.append(cCharAt);
                    }
                }
                i++;
            } else if (!z) {
                z3 = !z3;
            }
            this.f228235buf.append(cCharAt);
            z = false;
            i++;
        }
        this.index = i;
        return this.f228235buf.toString();
    }

    public X509NameTokenizer(String str, char c2) {
        this.f228235buf = new StringBuffer();
        this.value = str;
        this.index = str.length() < 1 ? 0 : -1;
        this.separator = c2;
    }
}
