package age;

import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4817b;

    static {
        int[] iArr = new int[oie.a.values().length];
        try {
            iArr[oie.a.SAVINGS_DEPOSITS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oie.a.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oie.a.SAVINGS_MMF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[oie.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f4816a = iArr;
        int[] iArr2 = new int[ProductId.values().length];
        try {
            iArr2[ProductId.FAVORITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ProductId.TOTAL_WEALTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ProductId.CURRENCY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ProductId.ON_HOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ProductId.CREDIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ProductId.CREDIT_HUB.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ProductId.JOINT.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ProductId.BEREAVEMENT.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ProductId.PRO.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ProductId.TEEN.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ProductId.YOUTH.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ProductId.LINKED.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ProductId.SUBACCOUNT.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[ProductId.SAVINGS.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        f4817b = iArr2;
    }
}
