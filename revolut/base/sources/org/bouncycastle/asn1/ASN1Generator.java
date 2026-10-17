package org.bouncycastle.asn1;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ASN1Generator {
    protected OutputStream _out;

    public ASN1Generator(OutputStream outputStream) {
        this._out = outputStream;
    }

    public static int inheritConstructedFlag(int i, int i2) {
        return (i2 & 32) != 0 ? i | 32 : i & (-33);
    }

    public abstract OutputStream getRawOutputStream();
}
