package zqd;

import a0j.f0;
import a0j.m;
import a0j.p;
import a0j.q;
import a0j.t;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f324467c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.SPENDING_PACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.PROJECTED_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.RECURRING_PAYMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.SAVING_PACE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m.EMERGENCY_FUND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m.INVESTING_PACE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[m.PORTFOLIO_RISK.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[m.TOTAL_WEALTH.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f324465a = iArr;
        int[] iArr2 = new int[t.values().length];
        try {
            iArr2[t.HIGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[t.GOOD.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[t.POSITIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[t.GROWING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[t.CAUTIOUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[t.LOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        f324466b = iArr2;
        int[] iArr3 = new int[f0.values().length];
        try {
            iArr3[f0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[f0.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[f0.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[f0.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        f324467c = iArr3;
        int[] iArr4 = new int[p.values().length];
        try {
            iArr4[p.IMPROVE_YOUR_CHANCES.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[p.UNLOCK_BETTER_OFFERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        d = iArr4;
        int[] iArr5 = new int[q.values().length];
        try {
            iArr5[q.GOOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[q.NEEDS_ATTENTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        e = iArr5;
    }
}
