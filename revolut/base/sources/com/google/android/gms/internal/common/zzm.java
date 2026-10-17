package com.google.android.gms.internal.common;

import a0.d;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes16.dex */
final class zzm extends zzl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final char f39248zza;

    public zzm(char c2) {
        this.f39248zza = c2;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = CoreConstants.ESCAPE_CHAR;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f39248zza;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return d.u(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.common.zzp
    public final boolean zza(char c2) {
        return c2 == this.f39248zza;
    }
}
