package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import mt0.y;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f57087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f57088b;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.EXPAND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.CONTENT_AND_EXPAND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f57087a = iArr;
        int[] iArr2 = new int[y.values().length];
        try {
            iArr2[y.SOLID.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[y.FLOATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f57088b = iArr2;
    }
}
