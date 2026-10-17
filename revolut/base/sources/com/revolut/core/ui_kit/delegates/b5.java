package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f53709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f53710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f53711c;

    static {
        int[] iArr = new int[w4.values().length];
        try {
            iArr[w4.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w4.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f53709a = iArr;
        int[] iArr2 = new int[ip0.pd.values().length];
        try {
            iArr2[ip0.pd.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ip0.pd.SUBTLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f53710b = iArr2;
        int[] iArr3 = new int[ip0.rd.values().length];
        try {
            iArr3[ip0.rd.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ip0.rd.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f53711c = iArr3;
    }
}
