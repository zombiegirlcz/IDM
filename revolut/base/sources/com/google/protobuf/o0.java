package com.google.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f49754a;

    static {
        int[] iArr = new int[l4.values().length];
        f49754a = iArr;
        try {
            iArr[l4.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f49754a[l4.ENUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
