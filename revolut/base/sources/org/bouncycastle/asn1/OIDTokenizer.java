package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes14.dex */
public class OIDTokenizer {
    private int index = 0;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private String f228148oid;

    public OIDTokenizer(String str) {
        this.f228148oid = str;
    }

    public boolean hasMoreTokens() {
        return this.index != -1;
    }

    public String nextToken() {
        int i = this.index;
        if (i == -1) {
            return null;
        }
        int iIndexOf = this.f228148oid.indexOf(46, i);
        if (iIndexOf == -1) {
            String strSubstring = this.f228148oid.substring(this.index);
            this.index = -1;
            return strSubstring;
        }
        String strSubstring2 = this.f228148oid.substring(this.index, iIndexOf);
        this.index = iIndexOf + 1;
        return strSubstring2;
    }
}
