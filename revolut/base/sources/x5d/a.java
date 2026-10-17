package x5d;

import yvh.f;
import yvh.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f302938b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.SPARE_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.DAILY_SAVINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.SPENDING_PERCENTAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.BALANCE_ROUNDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f302937a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.SAVINGS_POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[h.VAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[h.HOLDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[h.CHARITY_POCKET.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[h.CURRENT_POCKET.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[h.LOYALTY_PROFILE.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[h.WEALTH_PORTFOLIO.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f302938b = iArr2;
    }
}
