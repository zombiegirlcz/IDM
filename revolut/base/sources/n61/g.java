package n61;

import com.revolut.domain.models.banktransfer.AccountFieldType;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f212684a;

    static {
        int[] iArr = new int[AccountFieldType.values().length];
        try {
            iArr[AccountFieldType.SORT_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AccountFieldType.IBAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AccountFieldType.BSB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AccountFieldType.CLABE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AccountFieldType.BRAZIL_CPF_ID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AccountFieldType.BRAZIL_CNPJ_ID.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AccountFieldType.CARD_LAST_FOUR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AccountFieldType.BRAZIL_ACCOUNT_TYPE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AccountFieldType.COLOMBIA_ACH_ACCOUNT_TYPE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f212684a = iArr;
    }
}
