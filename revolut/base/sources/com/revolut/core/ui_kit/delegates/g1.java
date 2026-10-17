package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f54176c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ip0.w2.values().length];
        try {
            iArr[ip0.w2.ONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ip0.w2.MANY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f54174a = iArr;
        int[] iArr2 = new int[ip0.u2.values().length];
        try {
            iArr2[ip0.u2.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ip0.u2.UNLIMITED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f54175b = iArr2;
        int[] iArr3 = new int[ip0.v2.values().length];
        try {
            iArr3[ip0.v2.BIG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ip0.v2.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f54176c = iArr3;
        int[] iArr4 = new int[d1.values().length];
        try {
            iArr4[d1.HEALTHY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[d1.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[d1.CRITICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
    }
}
