package wj9;

import zh9.r1;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298032a;

    static {
        int[] iArr = new int[r1.values().length];
        try {
            iArr[r1.Outstanding.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r1.CancelledAndOutstanding.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r1.Overdue.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r1.CancelledAndOverdue.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[r1.CancelledAndWithdrawal.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[r1.Cancelled.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[r1.Healthy.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[r1.CancelledPendingClosure.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[r1.TerminatedAndOverdue.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[r1.TerminatedPendingClosure.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f298032a = iArr;
    }
}
