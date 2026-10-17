package com.revolut.core.ui_kit.internal.views.fanchart;

import aw0.o7;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f57022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f57023b;

    static {
        int[] iArr = new int[o7.values().length];
        try {
            iArr[o7.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f57022a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.INCREASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[c.NEUTRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c.REDUCTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f57023b = iArr2;
    }
}
