package rnh;

import dfl.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f255693b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q0.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q0.DECLINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f255692a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f255693b = iArr2;
    }
}
