package com.revolut.core.ui_kit.delegates;

import ip0.vd0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f54482b;

    static {
        int[] iArr = new int[kg.values().length];
        try {
            iArr[kg.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kg.LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f54481a = iArr;
        int[] iArr2 = new int[vd0.values().length];
        try {
            iArr2[vd0.CHECKBOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vd0.RADIO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f54482b = iArr2;
    }
}
