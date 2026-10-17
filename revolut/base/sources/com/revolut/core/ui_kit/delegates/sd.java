package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class sd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f54715c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[id.values().length];
        try {
            iArr[id.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[id.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f54713a = iArr;
        int[] iArr2 = new int[md.values().length];
        try {
            iArr2[md.BELOW_BUTTONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f54714b = iArr2;
        int[] iArr3 = new int[ld.values().length];
        try {
            iArr3[ld.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[ld.CAPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f54715c = iArr3;
        int[] iArr4 = new int[kd.values().length];
        try {
            iArr4[kd.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr4[kd.HIGH_CONTRAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        d = iArr4;
    }
}
