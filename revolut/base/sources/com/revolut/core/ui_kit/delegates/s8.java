package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54697b;

    static {
        int[] iArr = new int[r8.values().length];
        try {
            iArr[r8.FillCrop.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8.FitTopAlignToTitle.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f54696a = iArr;
        int[] iArr2 = new int[q8.values().length];
        try {
            iArr2[q8.Default.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[q8.AddNew.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f54697b = iArr2;
    }
}
