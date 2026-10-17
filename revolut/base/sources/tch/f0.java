package tch;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a f269825b;

    public /* synthetic */ f0(com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar, int i) {
        this.f269824a = i;
        this.f269825b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f269824a) {
            case 0:
                PortfolioRecurringOrder recurringOrder = (PortfolioRecurringOrder) obj2;
                Intrinsics.checkNotNullParameter(recurringOrder, "recurringOrder");
                h1h.b bVar = this.f269825b.f95642s;
                InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
                String standingOrderId = recurringOrder.f104649a;
                companion.getClass();
                Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
                InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImpl = new InvestTransactionsFilter.InvestTransactionsFilterImpl(null, null, null, null, standingOrderId, null, null, LDSFile.EF_DG15_TAG);
                InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
                break;
            case 1:
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar = this.f269825b;
                rbh.r rVar = aVar.u;
                PortfolioRecurringOrder recurringOrder2 = (PortfolioRecurringOrder) obj2;
                Intrinsics.checkNotNullParameter(recurringOrder2, "recurringOrder");
                String str = recurringOrder2.f104651c;
                if (str == null) {
                }
                break;
            case 2:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar2 = this.f269825b;
                aVar2.X1(new y0(null, (nii.z) aVar2.f95646y.getValue(), false, 5));
                break;
            default:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar3 = this.f269825b;
                aVar3.X1(new y0(null, (nii.z) aVar3.f95646y.getValue(), false, 5));
                break;
        }
        return Boolean.TRUE;
    }
}
