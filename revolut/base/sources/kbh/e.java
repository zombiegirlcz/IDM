package kbh;

import cfl.j;
import com.revolut.shared.feature.wealth.models.transaction.FeeType;
import dfl.a0;
import dfl.j0;
import dfl.q0;
import k1h.n;
import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f182585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f182586c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f182587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int[] f182588h;
    public static final /* synthetic */ int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int[] f182589j;

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
        f182584a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f182585b = iArr2;
        int[] iArr3 = new int[z.values().length];
        try {
            iArr3[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[z.STRUCTURED_NOTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[z.FUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        f182586c = iArr3;
        int[] iArr4 = new int[dfl.f.values().length];
        try {
            iArr4[dfl.f.DIVIDEND_CORRECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[dfl.f.WHT_CORRECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
        int[] iArr5 = new int[FeeType.values().length];
        try {
            iArr5[FeeType.TRADING_PRO_FEE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[FeeType.PRIVATE_MARKETS_CUSTODY_FEE.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        e = iArr5;
        int[] iArr6 = new int[a0.values().length];
        try {
            iArr6[a0.INVEST_WITHOUT_LOSSES_REIMBURSEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr6[a0.TRADING_PRO_FEE_REFUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[a0.REWARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[a0.REFERRAL_REWARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[a0.FREE_STOCKS_REWARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr6[a0.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        f = iArr6;
        int[] iArr7 = new int[j.values().length];
        try {
            iArr7[j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr7[j.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr7[j.YOUTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        f182587g = iArr7;
        int[] iArr8 = new int[j0.values().length];
        try {
            iArr8[j0.ISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr8[j0.JISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr8[j0.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused26) {
        }
        f182588h = iArr8;
        int[] iArr9 = new int[n.values().length];
        try {
            iArr9[n.DATETIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr9[n.ONLY_TIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr9[n.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused29) {
        }
        i = iArr9;
        int[] iArr10 = new int[bel.b.values().length];
        try {
            iArr10[bel.b.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr10[bel.b.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr10[bel.b.PRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr10[bel.b.COMMODITIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr10[bel.b.JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr10[bel.b.PERSONAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr10[bel.b.CREDIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr10[bel.b.SAVINGS.ordinal()] = 8;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr10[bel.b.JOINT_SAVINGS.ordinal()] = 9;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr10[bel.b.VAULT.ordinal()] = 10;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr10[bel.b.JOINT_VAULT.ordinal()] = 11;
        } catch (NoSuchFieldError unused40) {
        }
        f182589j = iArr10;
    }
}
