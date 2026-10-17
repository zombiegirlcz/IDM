package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a implements u0 {
    protected int memoizedHashCode;

    public abstract int a(g1 g1Var);

    public final String b(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract y c();

    public final byte[] d() {
        try {
            int iA = ((b0) this).a(null);
            byte[] bArr = new byte[iA];
            n nVar = new n(bArr, iA);
            e(nVar);
            if (iA - nVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(b("byte array"), e);
        }
    }

    public abstract void e(n nVar);
}
