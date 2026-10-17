package zjh;

import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements dtl.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBalanceController f322832a;

    public d(CashBalanceController cashBalanceController) {
        this.f322832a = cashBalanceController;
    }

    @Override // dtl.d
    public final Flow B0() {
        return rd0.e.b(this.f322832a.V.f);
    }
}
