package vu0;

import ip0.xh0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f292171a;

    static {
        int[] iArr = new int[xh0.values().length];
        try {
            iArr[xh0.PRIMARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xh0.NEUTRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xh0.NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f292171a = iArr;
    }
}
