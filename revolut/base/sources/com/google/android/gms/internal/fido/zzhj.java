package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhj extends IOException {
    public zzhj(String str) {
        super(str);
    }

    public zzhj(String str, Throwable th10) {
        super("Error in decoding CborValue from bytes", th10);
    }
}
