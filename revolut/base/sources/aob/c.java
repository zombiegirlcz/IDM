package aob;

import pcd.i0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f7955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f7956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f7957c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[pcd.b.values().length];
        try {
            iArr[pcd.b.PERSONAL_JOINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pcd.b.YOUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pcd.b.PERSONAL_UNDER_18.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f7955a = iArr;
        int[] iArr2 = new int[ncd.h.values().length];
        try {
            iArr2[ncd.h.PERSONAL_JOINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ncd.h.PERSONAL_UNDER_18.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ncd.h.PERSONAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ncd.h.YOUTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ncd.h.BUSINESS.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f7956b = iArr2;
        int[] iArr3 = new int[i0.values().length];
        try {
            iArr3[i0.AWAITING_CUSTOMER.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[i0.AWAITING_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f7957c = iArr3;
        int[] iArr4 = new int[jjb.c.values().length];
        try {
            iArr4[jjb.c.REJECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[jjb.c.UNDER_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[jjb.c.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[jjb.c.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
        int[] iArr5 = new int[ncd.g.values().length];
        try {
            iArr5[ncd.g.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[ncd.g.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[ncd.g.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        e = iArr5;
    }
}
