package utg;

import wtg.t;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f283099a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.HAS_CASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.HAS_OPEN_POSITIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.HAS_NON_TRADEABLE_STOCKS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t.HAS_PENDING_STOCK_TRANSFERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[t.HAS_TRANSFER_OUT_REQUESTS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[t.HAS_WARRANTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[t.HAS_MARGIN_LOAN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[t.HAS_ROBO_OR_FLEXIBLE_ACCOUNT_ONBOARDED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[t.HAS_OTHER_ACCOUNT_ONBOARDED.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[t.HAS_JOINT_GIA_ONBOARDED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f283099a = iArr;
    }
}
