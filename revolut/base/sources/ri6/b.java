package ri6;

import com.revolut.domain.models.openbanking.OpenBankingFundsConfirmation$Scheme;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f254558a;

    static {
        int[] iArr = new int[OpenBankingFundsConfirmation$Scheme.values().length];
        try {
            iArr[OpenBankingFundsConfirmation$Scheme.IBAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OpenBankingFundsConfirmation$Scheme.SortCodeAccountNumber.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f254558a = iArr;
    }
}
