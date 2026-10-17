package com.revolut.core.ui_kit.delegates;

import ip0.lh0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54562a;

    static {
        int[] iArr = new int[lh0.values().length];
        try {
            iArr[lh0.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lh0.SEMIACCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lh0.TRANSPARENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lh0.BLACK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lh0.GREY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f54562a = iArr;
    }
}
