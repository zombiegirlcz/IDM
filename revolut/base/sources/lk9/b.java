package lk9;

import zh9.q0;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f196307b;

    static {
        int[] iArr = new int[zh9.o.values().length];
        try {
            iArr[zh9.o.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zh9.o.OUTSTANDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zh9.o.OVERDUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zh9.o.REPAID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zh9.o.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f196306a = iArr;
        int[] iArr2 = new int[q0.values().length];
        try {
            iArr2[q0.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[q0.OVERDUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[q0.OUTSTANDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[q0.REPAID.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[q0.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f196307b = iArr2;
    }
}
