package com.revolut.core.ui_kit.views;

import mx0.cb;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59583a;

    static {
        int[] iArr = new int[cb.values().length];
        try {
            iArr[cb.TOP_TO_BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cb.BOTTOM_TO_TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f59583a = iArr;
    }
}
