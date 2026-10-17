package f2k;

import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferEntryPoint;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131853a;

    static {
        int[] iArr = new int[BankTransferEntryPoint.values().length];
        try {
            iArr[BankTransferEntryPoint.REGULAR_TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BankTransferEntryPoint.REMITTANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f131853a = iArr;
    }
}
