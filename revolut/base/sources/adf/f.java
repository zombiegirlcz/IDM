package adf;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogController;
import com.revolut.feature_market_data_api.navigation.FeeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalExchangeFeesDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TotalExchangeFeesDialogController totalExchangeFeesDialogController, Continuation continuation) {
        super(2, continuation);
        this.v = totalExchangeFeesDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.V.getValue();
        Intrinsics.h(model);
        h hVar = (h) aVar2;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51787l;
        OrderQuote orderQuote = obj3 instanceof OrderQuote ? (OrderQuote) obj3 : null;
        if (orderQuote != null) {
            hVar.C1(u0.c(new FeeBreakdownFeatureConfig(t0.E(orderQuote), orderQuote.f104755g.f104731a, c4i.a.EXCHANGE, (AnalyticsProduct.Retail) null, (xi0.b) null, false, hVar.o.f91693b, (HtmlLocalisedClause) null, 1784)));
        }
        return Unit.f186387a;
    }
}
