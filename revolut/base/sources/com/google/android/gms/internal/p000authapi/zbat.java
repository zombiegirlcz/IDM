package com.google.android.gms.internal.p000authapi;

import android.util.Base64;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes16.dex */
public final class zbat {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    private static final SecureRandom f38853zba = new SecureRandom();

    public static String zba() {
        byte[] bArr = new byte[16];
        f38853zba.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
