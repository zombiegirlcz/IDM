package gs4;

import ql4.q0;
import ql4.t;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f146315b;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.SETTLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f146314a = iArr;
        int[] iArr2 = new int[q0.values().length];
        try {
            iArr2[q0.STATEMENT_DEFERRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[q0.INTEREST_FREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[q0.POST_PURCHASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[q0.DEBIT_POST_PURCHASE_PLAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[q0.PRE_PURCHASE.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[q0.UNSUPPORTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        f146315b = iArr2;
    }
}
