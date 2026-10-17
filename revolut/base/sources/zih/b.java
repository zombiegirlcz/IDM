package zih;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4f.b f322563a;

    public b(m4f.b wealthAddMoneyCommandProvider) {
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        this.f322563a = wealthAddMoneyCommandProvider;
    }

    public final BridgeDestination a(String portfolioId, WealthAccountType wealthAccountType, kel.b cashHolding, Long l2) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(wealthAccountType, "wealthAccountType");
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        kel.a aVar = cashHolding.f183148a;
        return u0.b(b3f.b.b(this.f322563a, new TransferSubjectId.CashHolding(portfolioId, aVar.f183145a, aVar.e, cashHolding.f183150c), wealthAccountType, null, l2, 4));
    }
}
