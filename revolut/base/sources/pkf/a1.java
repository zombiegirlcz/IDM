package pkf;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.deposit.tfr_banners.CryptoDepositSenderDetailsParcel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends yji.n implements elf.s0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fof.a f237016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sj5.a f237017n;
    public final fbj.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f237018p;

    public a1(klf.h0 commonDataSource, fof.a bannerProvider, sj5.a depositTransactionStateChecker, fbj.a cryptoDepositsInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(bannerProvider, "bannerProvider");
        Intrinsics.checkNotNullParameter(depositTransactionStateChecker, "depositTransactionStateChecker");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        this.f237015l = commonDataSource;
        this.f237016m = bannerProvider;
        this.f237017n = depositTransactionStateChecker;
        this.o = cryptoDepositsInteractor;
        this.f237018p = new vii.b();
    }

    public final void Z2(CryptoDepositSenderDetailsParcel cryptoDepositSenderDetailsParcel, lo5.b bVar) {
        N2(o2(new lo5.a(new CryptoAddBeneficiaryInput.SubmitCounterpartyDetails(cryptoDepositSenderDetailsParcel.f92092a, bVar, cryptoDepositSenderDetailsParcel.f92093b, null))), ModalDestination.Style.POPUP.f98311a, new pij.d1(this, 7));
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (Intrinsics.f(str, "ID_CRYPTO_DEPOSIT_MYSELF_ACTION") && (obj2 instanceof CryptoDepositSenderDetailsParcel)) {
            Z2((CryptoDepositSenderDetailsParcel) obj2, lo5.b.MY_WALLET);
            return Boolean.TRUE;
        }
        String[] elements = {"ID_CRYPTO_DEPOSIT_SOMEONE_ELSE_ACTION", "ID_CRYPTO_DEPOSIT_PROVIDE_INFO_ACTION"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!kotlin.collections.d.y0(elements).contains(str) || !(obj2 instanceof CryptoDepositSenderDetailsParcel)) {
            return Boolean.FALSE;
        }
        Z2((CryptoDepositSenderDetailsParcel) obj2, lo5.b.SOMEONE_ELSE);
        return Boolean.TRUE;
    }
}
