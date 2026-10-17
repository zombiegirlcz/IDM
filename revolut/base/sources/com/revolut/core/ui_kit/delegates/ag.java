package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f53681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f53682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f53683c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[ef.values().length];
        try {
            iArr[ef.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ef.ACTIONABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f53681a = iArr;
        int[] iArr2 = new int[of.values().length];
        try {
            iArr2[of.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[of.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f53682b = iArr2;
        int[] iArr3 = new int[hf.values().length];
        try {
            iArr3[hf.ARROW_RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[hf.ARROW_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f53683c = iArr3;
        int[] iArr4 = new int[wf.values().length];
        try {
            iArr4[wf.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[wf.BOLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        d = iArr4;
        int[] iArr5 = new int[sf.values().length];
        try {
            iArr5[sf.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr5[sf.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        e = iArr5;
        int[] iArr6 = new int[kf.values().length];
        try {
            iArr6[kf.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr6[kf.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        f = iArr6;
    }
}
