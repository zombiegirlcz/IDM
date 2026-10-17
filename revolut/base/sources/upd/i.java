package upd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f281974b;

    public i(dj0.d balanceInWalletBaseCurrency, dj0.d balanceInPortfolioBaseCurrency) {
        Intrinsics.checkNotNullParameter(balanceInWalletBaseCurrency, "balanceInWalletBaseCurrency");
        Intrinsics.checkNotNullParameter(balanceInPortfolioBaseCurrency, "balanceInPortfolioBaseCurrency");
        this.f281973a = balanceInWalletBaseCurrency;
        this.f281974b = balanceInPortfolioBaseCurrency;
    }
}
