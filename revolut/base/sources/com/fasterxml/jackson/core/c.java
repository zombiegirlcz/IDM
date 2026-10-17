package com.fasterxml.jackson.core;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes16.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f26164a;

    static {
        b bVar = new b("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f26164a = new b(bVar);
        byte[] bArr = bVar.f26161c;
        System.arraycopy(bArr, 0, new byte[64], 0, bArr.length);
        char[] cArr = bVar.f26160b;
        System.arraycopy(cArr, 0, new char[64], 0, cArr.length);
        int[] iArr = bVar.f26159a;
        System.arraycopy(iArr, 0, new int[128], 0, iArr.length);
        StringBuilder sb6 = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb6.setCharAt(sb6.indexOf("+"), CoreConstants.DASH_CHAR);
        sb6.setCharAt(sb6.indexOf("/"), '_');
        new b("MODIFIED-FOR-URL", sb6.toString(), false, (char) 0, Integer.MAX_VALUE);
    }
}
