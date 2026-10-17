package weg;

import ueg.h0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f296788a;

    static {
        int[] iArr = new int[h0.values().length];
        try {
            iArr[h0.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h0.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h0.IDLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f296788a = iArr;
    }
}
