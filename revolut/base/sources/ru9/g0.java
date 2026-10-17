package ru9;

import tof.v6;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257474a;

    static {
        int[] iArr = new int[v6.values().length];
        try {
            iArr[v6.REVERTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v6.DECLINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v6.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[v6.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f257474a = iArr;
    }
}
