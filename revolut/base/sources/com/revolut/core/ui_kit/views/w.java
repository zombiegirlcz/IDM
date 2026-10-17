package com.revolut.core.ui_kit.views;

import mx0.jc;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f59766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f59767b;

    static {
        int[] iArr = new int[jc.values().length];
        try {
            iArr[jc.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jc.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f59766a = iArr;
        int[] iArr2 = new int[s.values().length];
        try {
            iArr2[s.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[s.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f59767b = iArr2;
    }
}
