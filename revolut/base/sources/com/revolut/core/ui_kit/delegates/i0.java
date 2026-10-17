package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54269b;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h0.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f54268a = iArr;
        int[] iArr2 = new int[g0.values().length];
        try {
            iArr2[g0.GRADIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g0.ACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f54269b = iArr2;
    }
}
