package sdl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f261987c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f261988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int[] f261989h;
    public static final /* synthetic */ int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int[] f261990j;
    public static final /* synthetic */ int[] k;

    static {
        int[] iArr = new int[cfl.c.values().length];
        try {
            iArr[cfl.c.TOPUP_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.c.WITHDRAWAL_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.c.TOPUP_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cfl.c.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f261985a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.TOPUP_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o.WITHDRAWAL_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[o.TOPUP_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[o.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f261986b = iArr2;
        int[] iArr3 = new int[cfl.d.values().length];
        try {
            iArr3[cfl.d.BUY_SELL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[cfl.d.SELL_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[cfl.d.CLOSE_POSITION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[cfl.d.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        f261987c = iArr3;
        int[] iArr4 = new int[q.values().length];
        try {
            iArr4[q.BUY_SELL.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[q.SELL_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[q.CLOSE_POSITION_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[q.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        d = iArr4;
        int[] iArr5 = new int[com.revolut.shared.feature.wealth.models.trading_accounts.a.values().length];
        try {
            iArr5[com.revolut.shared.feature.wealth.models.trading_accounts.a.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[com.revolut.shared.feature.wealth.models.trading_accounts.a.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[com.revolut.shared.feature.wealth.models.trading_accounts.a.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused22) {
        }
        e = iArr5;
        int[] iArr6 = new int[w.values().length];
        try {
            iArr6[w.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr6[w.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr6[w.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr6[w.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[w.OFFBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[w.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused28) {
        }
        f = iArr6;
        int[] iArr7 = new int[cfl.b.values().length];
        try {
            iArr7[cfl.b.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr7[cfl.b.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr7[cfl.b.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr7[cfl.b.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr7[cfl.b.OFFBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr7[cfl.b.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused34) {
        }
        f261988g = iArr7;
        int[] iArr8 = new int[m.values().length];
        try {
            iArr8[m.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr8[m.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr8[m.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr8[m.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr8[m.OFFBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr8[m.TERMINATED.ordinal()] = 6;
        } catch (NoSuchFieldError unused40) {
        }
        f261989h = iArr8;
        int[] iArr9 = new int[cfl.v.values().length];
        try {
            iArr9[cfl.v.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr9[cfl.v.AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr9[cfl.v.ONBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr9[cfl.v.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr9[cfl.v.REMEDIATION_REQUIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr9[cfl.v.OFFBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr9[cfl.v.OFFBOARDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused47) {
        }
        i = iArr9;
        int[] iArr10 = new int[i0.values().length];
        try {
            iArr10[i0.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr10[i0.AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr10[i0.ONBOARDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr10[i0.ACTIVE.ordinal()] = 4;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr10[i0.REMEDIATION_REQUIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr10[i0.OFFBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr10[i0.OFFBOARDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused54) {
        }
        f261990j = iArr10;
        int[] iArr11 = new int[cfl.a.values().length];
        try {
            iArr11[cfl.a.SELF.ordinal()] = 1;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr11[cfl.a.DEPENDANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused56) {
        }
        k = iArr11;
    }
}
