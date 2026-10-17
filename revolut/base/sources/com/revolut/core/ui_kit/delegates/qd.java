package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54633b;

    static {
        int[] iArr = new int[nd.values().length];
        try {
            iArr[nd.LINEAR_REVEAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f54632a = iArr;
        int[] iArr2 = new int[jd.values().length];
        try {
            iArr2[jd.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[jd.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f54633b = iArr2;
    }
}
