package pkf;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import com.revolut.kompot.common.ModalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d2 extends yji.n implements elf.s0 {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f237040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e2 f237041n;
    public final wnf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final elf.b0 f237042p;

    public d2(klf.h0 commonDataSource, vlf.b commonUiMapper, e2 cryptoWithdrawDetailsItemsMapper, wnf.b commonTransactionContentMapper, elf.b0 confirmationClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDetailsItemsMapper, "cryptoWithdrawDetailsItemsMapper");
        Intrinsics.checkNotNullParameter(commonTransactionContentMapper, "commonTransactionContentMapper");
        Intrinsics.checkNotNullParameter(confirmationClickHandler, "confirmationClickHandler");
        this.f237039l = commonDataSource;
        this.f237040m = commonUiMapper;
        this.f237041n = cryptoWithdrawDetailsItemsMapper;
        this.o = commonTransactionContentMapper;
        this.f237042p = confirmationClickHandler;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_EXTRAS_CRYPTO_WITHDRAW_FEE")) {
            gof.a aVar = obj2 instanceof gof.a ? (gof.a) obj2 : null;
            if (aVar == null) {
                throw new IllegalStateException("Parcel is not TransactionDetailsCryptoWithdrawFeeDetails");
            }
            yji.n.P2(this, o2(new lo5.k(new CryptoFeeBreakdownDialogInput.WithTransactionId(aVar.f145155a, aVar.f145156b))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
