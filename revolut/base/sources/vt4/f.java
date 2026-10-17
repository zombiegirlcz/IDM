package vt4;

import ll4.k;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f291904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f291905c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.TOTAL_WEALTH_WITHOUT_ACTIVE_PRODUCT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.ADD_MONEY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.GET_CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.DISCOVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k.TOTAL_WEALTH_ACTIVE_PRODUCT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f291903a = iArr;
        int[] iArr2 = new int[yw4.h.values().length];
        try {
            iArr2[yw4.h.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yw4.h.SECURED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[yw4.h.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f291904b = iArr2;
        int[] iArr3 = new int[yw4.c.values().length];
        try {
            iArr3[yw4.c.WITHDRAWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[yw4.c.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f291905c = iArr3;
        int[] iArr4 = new int[xw4.a.values().length];
        try {
            iArr4[xw4.a.HEALTHY.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[xw4.a.OVERDUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[xw4.a.LIMIT_EXCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[xw4.a.TERMINATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        d = iArr4;
    }
}
