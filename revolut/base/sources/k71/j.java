package k71;

import com.revolut.domain.models.transactions.SavingsDirection;
import com.revolut.domain.models.transactions.SavingsTransactionLeg;
import tof.a1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f181788c;

    static {
        int[] iArr = new int[SavingsTransactionLeg.values().length];
        try {
            iArr[SavingsTransactionLeg.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SavingsTransactionLeg.COUNTERPART.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SavingsTransactionLeg.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f181786a = iArr;
        int[] iArr2 = new int[SavingsDirection.values().length];
        try {
            iArr2[SavingsDirection.TOPUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SavingsDirection.WITHDRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SavingsDirection.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f181787b = iArr2;
        int[] iArr3 = new int[a1.values().length];
        try {
            iArr3[a1.CORE_LEDGER.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[a1.EXCHANGE_LEDGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f181788c = iArr3;
    }
}
