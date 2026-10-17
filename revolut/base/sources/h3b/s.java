package h3b;

import com.revolut.feature.retail.cfd.impl.screens.cash_balance.CfdCashBalanceControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdCashBalanceControllerContract$InputData f149097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f149098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1b.a f149099c;
    public final ybl.k d;

    public s(CfdCashBalanceControllerContract$InputData inputData, ybl.d portfolioInteractor, y1b.a cfdInteractor, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f149097a = inputData;
        this.f149098b = portfolioInteractor;
        this.f149099c = cfdInteractor;
        this.d = tradingAccountsInteractor;
    }
}
