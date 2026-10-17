package org.bouncycastle.asn1.x500.style;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes14.dex */
public class X500NameTokenizer {
    private int index;
    private final char separator;
    private final String value;

    public X500NameTokenizer(String str) {
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
        boolean z = false;
        boolean z3 = false;
        while (true) {
            int i2 = this.index + 1;
            this.index = i2;
            if (i2 < this.value.length()) {
                char cCharAt = this.value.charAt(this.index);
                if (z) {
                    z = false;
                } else if (cCharAt == '\"') {
                    z3 = !z3;
                } else if (z3) {
                    continue;
                } else if (cCharAt == '\\') {
                    z = true;
                } else if (cCharAt == this.separator) {
                    break;
                }
            } else if (z || z3) {
                throw new IllegalArgumentException("badly formatted directory string");
            }
        }
        return this.value.substring(i, this.index);
    }

    public X500NameTokenizer(String str, char c2) {
        str.getClass();
        if (c2 == '\"' || c2 == '\\') {
            throw new IllegalArgumentException("reserved separator character");
        }
        this.value = str;
        this.separator = c2;
        this.index = str.length() < 1 ? 0 : -1;
    }
}
