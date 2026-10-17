package com.revolut.feature.apm.core.impl.crypto;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f61867a;

    static {
        int[] iArr = new int[e02.c.values().length];
        try {
            iArr[e02.c.DOUBLE_BASE64.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e02.c.SINGLE_BASE64.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e02.c.PEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f61867a = iArr;
    }
}
