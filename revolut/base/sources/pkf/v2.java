package pkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class v2 extends yji.n implements elf.s0 {

    @NotNull
    public static final r2 Companion = new r2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237141l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fbj.a f237142m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final pak.h f237143n;
    public final ap5.b o;

    public v2(klf.h0 commonDataSource, fbj.a cryptoDepositsInteractor, pak.h returnCryptoDepositBannerProvider, ap5.b cryptoWithdrawInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(returnCryptoDepositBannerProvider, "returnCryptoDepositBannerProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        this.f237141l = commonDataSource;
        this.f237142m = cryptoDepositsInteractor;
        this.f237143n = returnCryptoDepositBannerProvider;
        this.o = cryptoWithdrawInteractor;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "CryptoDepositTransactionDetails_ReturnDepositBanner_Action_Return")) {
            return Boolean.FALSE;
        }
        V2(new pe2.l(this, null, 15), new yi5.b(29));
        return Boolean.TRUE;
    }
}
