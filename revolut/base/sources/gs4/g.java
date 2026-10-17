package gs4;

import ql4.q0;
import ql4.t;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f146318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f146319c;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.STATEMENT_DEFERRAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.INTEREST_FREE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.POST_PURCHASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q0.DEBIT_POST_PURCHASE_PLAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q0.PRE_PURCHASE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[q0.UNSUPPORTED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f146317a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[t.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[t.SETTLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[t.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        f146318b = iArr2;
        int[] iArr3 = new int[ql4.m.values().length];
        try {
            iArr3[ql4.m.FORBEARANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[ql4.m.CUSTOMER_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[ql4.m.MAX_TDPD_EXCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[ql4.m.FACILITY_TERMINATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[ql4.m.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        f146319c = iArr3;
    }
}
