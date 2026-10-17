package htl;

import com.revolut.feature.trading_orders.api.ui.details.InvestOrderDetailsContract$InputData;
import com.revolut.feature.trading_orders.api.ui.details_pager.InvestOrderDetailsPagerFeatureContract$Descriptor;
import com.revolut.feature.trading_orders.api.ui.details_pager.InvestOrderDetailsPagerFeatureContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrderExtended;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import vrl.m;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f155464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vrl.g f155465m;

    public j(l navigationProvider, vrl.g investOrdersInteractor) {
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        this.f155464l = navigationProvider;
        this.f155465m = investOrdersInteractor;
    }

    @Override // htl.d
    public final void Z2(Object parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        boolean z = parcel instanceof InvestOrderExtended;
        l lVar = this.f155464l;
        if (z) {
            lVar.getClass();
            A2(l.a((InvestOrderExtended) parcel));
            return;
        }
        if (parcel instanceof e) {
            m mVar = (m) this.f155465m;
            mVar.getClass();
            if (((jte.d) mVar.f291658h).c(TradingOrdersApi$Toggles.InvestOrdersHorizontalDetails.f106790c)) {
                e eVar = (e) parcel;
                n.P2(this, o2(new InvestOrderDetailsPagerFeatureContract$Descriptor(new InvestOrderDetailsPagerFeatureContract$InputData(eVar.f155460a.getOrder(), eVar.f155461b))), ModalDestination.Style.FullscreenPaged.f98310a, null, 2);
                return;
            }
            e eVar2 = (e) parcel;
            InvestOrderExtended investOrder = eVar2.f155460a;
            if (!eVar2.f155462c) {
                lVar.getClass();
                A2(l.a(investOrder));
                return;
            }
            lVar.getClass();
            Intrinsics.checkNotNullParameter(investOrder, "investOrder");
            InvestOrder investOrder2 = investOrder.getOrder();
            Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
            n.P2(this, o2(new ldf.a(new InvestOrderDetailsContract$InputData(investOrder2.getF104631b()))), null, null, 3);
        }
    }
}
