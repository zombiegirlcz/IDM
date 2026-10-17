package vi9;

import zh9.q0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f289554b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.REPAID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q0.OVERDUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q0.OUTSTANDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f289553a = iArr;
        int[] iArr2 = new int[zh9.o.values().length];
        try {
            iArr2[zh9.o.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[zh9.o.OUTSTANDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[zh9.o.OVERDUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[zh9.o.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[zh9.o.REPAID.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f289554b = iArr2;
    }
}
