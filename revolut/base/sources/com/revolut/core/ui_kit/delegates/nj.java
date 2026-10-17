package com.revolut.core.ui_kit.delegates;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54523a;

    static {
        int[] iArr = new int[op0.q.values().length];
        try {
            iArr[op0.q.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[op0.q.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[op0.q.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[op0.q.DYNAMIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f54523a = iArr;
    }
}
