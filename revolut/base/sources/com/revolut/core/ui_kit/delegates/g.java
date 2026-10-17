package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54173b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.CAPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f54172a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.HORIZONTAL_RECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f54173b = iArr2;
    }
}
