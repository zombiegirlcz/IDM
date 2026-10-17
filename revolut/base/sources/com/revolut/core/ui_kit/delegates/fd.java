package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f54161c;

    static {
        int[] iArr = new int[cd.values().length];
        try {
            iArr[cd.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cd.CAPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f54159a = iArr;
        int[] iArr2 = new int[xc.values().length];
        try {
            iArr2[xc.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[xc.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f54160b = iArr2;
        int[] iArr3 = new int[aw0.v1.values().length];
        try {
            iArr3[aw0.v1.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[aw0.v1.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f54161c = iArr3;
    }
}
