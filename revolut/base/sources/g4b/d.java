package g4b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsControllerContract$Modal;
import com.revolut.feature.retail.cfd.impl.screens.review.CfdOrderReviewScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.trading.core.domain.orders.TradingOrderExitStrategies;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CfdPositionsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CfdPositionsController cfdPositionsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cfdPositionsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            case 2:
                return new d(this.v, continuation, 2);
            default:
                return new d(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y49.b bVar;
        y49.e eVar;
        BigDecimal bigDecimal;
        g5b.e eVar2;
        g5b.e eVar3;
        nel.a0 a0Var;
        InstrumentTicker instrumentTicker;
        int i = this.u;
        CfdPositionsController cfdPositionsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cfd.impl.screens.positions.a) cfdPositionsController.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.positions.a aVar3 = (com.revolut.feature.retail.cfd.impl.screens.positions.a) cfdPositionsController.R2();
                n nVar = aVar3.f82267q;
                if (nVar.d) {
                    aVar3.C1(new AssetDetailsDestination(nVar.f140452a, null, false, null, null, null, 62));
                }
                break;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.positions.a aVar5 = (com.revolut.feature.retail.cfd.impl.screens.positions.a) cfdPositionsController.R2();
                aVar5.C1(new AssetDetailsDestination(aVar5.f82267q.f140452a, null, false, null, null, null, 62));
                break;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.positions.a aVar7 = (com.revolut.feature.retail.cfd.impl.screens.positions.a) cfdPositionsController.R2();
                cli.y yVar = aVar7.f82270t;
                com.revolut.kompot.navigable.vc.modal.a aVar8 = aVar7.u;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                Data data = ((l) j2Var.getValue()).f140447b;
                TradingOrderExitStrategies tradingOrderExitStrategies = null;
                if (pd.b.j((data == null || (a0Var = (nel.a0) data.getContent()) == null || (instrumentTicker = a0Var.f214561b) == null) ? null : Boolean.valueOf(nel.x.a(instrumentTicker)))) {
                    Data data2 = ((l) j2Var2.getValue()).f140448c;
                    k kVar = data2 != null ? (k) data2.getContent() : null;
                    j jVar = kVar instanceof j ? (j) kVar : null;
                    if (jVar != null && (bVar = jVar.f140441a) != null && (bigDecimal = (eVar = bVar.f310833b).f310842j) != null) {
                        String str = aVar7.f82267q.f140453b;
                        nel.n nVar2 = bVar.f310832a;
                        String str2 = eVar.f310837a;
                        bfl.g gVar = e1.G(bigDecimal) ? bfl.g.SELL : bfl.g.BUY;
                        BigDecimal bigDecimalAbs = bigDecimal.abs();
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
                        e2b.a aVar9 = e2b.a.MARKET;
                        BigDecimal ZERO = BigDecimal.ZERO;
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        Data data3 = ((l) j2Var2.getValue()).f140446a;
                        List list = (data3 == null || (eVar3 = (g5b.e) data3.getContent()) == null) ? null : eVar3.f140725c;
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        List list2 = list;
                        Data data4 = ((l) j2Var2.getValue()).f140446a;
                        if (data4 != null && (eVar2 = (g5b.e) data4.getContent()) != null) {
                            tradingOrderExitStrategies = eVar2.d;
                        }
                        oki.h.v2(aVar8, new CfdPositionsControllerContract$Modal.OrderReview(new CfdOrderReviewScreenContract$InputData(str, null, nVar2, str2, str2, gVar, bigDecimalAbs, aVar9, ZERO, null, list2, tradingOrderExitStrategies)), ModalDestination.Style.POPUP.f98311a);
                    }
                } else {
                    oki.h.v2(aVar8, CfdPositionsControllerContract$Modal.MarketClosed.f82263a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
