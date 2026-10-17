package hzj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f157204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f157205b;

    static {
        int[] iArr = new int[com.revolut.feature.wallets.api.module.a.values().length];
        try {
            iArr[com.revolut.feature.wallets.api.module.a.TRANSFER_DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.TRANSFER_WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.TRANSFER_YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.INBOUND_TRANSFER_YEARLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.BRL_TO_USD_EXCHANGE_YEARLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.STOCK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.FLOW.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.ATM_ROLLING_DAY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.ATM_ROLLING_MONTH.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.DIRECT_DEBIT_MONTHLY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.ANNUAL_LRS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.BALANCE_MCY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.DAILY_INBOUND_MCY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.MX_FCY_BALANCE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.a.MONETISATION.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f157204a = iArr;
        int[] iArr2 = new int[zyj.a.values().length];
        try {
            iArr2[zyj.a.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        f157205b = iArr2;
    }
}
