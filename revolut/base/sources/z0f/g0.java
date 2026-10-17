package z0f;

import com.revolut.domain.models.topup.methods.TopupMethodType;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f318261a;

    static {
        int[] iArr = new int[TopupMethodType.values().length];
        try {
            iArr[TopupMethodType.BANK_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TopupMethodType.CASH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TopupMethodType.CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TopupMethodType.SALARY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TopupMethodType.MOVE_MONEY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TopupMethodType.DIRECT_DEPOSIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TopupMethodType.CONNECT_NEW_BANK_DIRECT_LINK.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TopupMethodType.CONNECT_NEW_BANK_OAUTH_ONCE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TopupMethodType.PAYNOW.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TopupMethodType.GMO_PG_BANK_DIRECT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f318261a = iArr;
    }
}
