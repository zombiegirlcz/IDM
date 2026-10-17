package lj9;

import zh9.r1;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f195614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f195615b;

    static {
        int[] iArr = new int[zh9.e.values().length];
        try {
            iArr[zh9.e.Active.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zh9.e.Cancelled.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zh9.e.Terminated.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f195614a = iArr;
        int[] iArr2 = new int[r1.values().length];
        try {
            iArr2[r1.Healthy.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r1.Outstanding.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r1.CancelledAndWithdrawal.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[r1.CancelledAndOutstanding.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[r1.Overdue.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[r1.CancelledAndOverdue.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[r1.CancelledPendingClosure.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[r1.Cancelled.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[r1.TerminatedAndOverdue.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[r1.TerminatedPendingClosure.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        f195615b = iArr2;
    }
}
