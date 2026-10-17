package i2i;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import com.revolut.retail.common.ui.activity.delegate.keyboardsuggestions.KeyboardSuggestionsDelegate;
import com.revolut.tracking.v3.RatesSourceContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157965a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a f157966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f157967c;

    public /* synthetic */ n(com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar, k kVar) {
        this.f157966b = aVar;
        this.f157967c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f157965a) {
            case 0:
                List list = (List) obj2;
                Intrinsics.h(list);
                ((MarketOrderActivityV2) this.f157967c).setItems(list);
                this.f157966b.H.set(false);
                break;
            default:
                wd6.c currencyMode = (wd6.c) obj2;
                Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
                int i = s.f157975c[currencyMode.ordinal()];
                AnalyticsContext analyticsContext = null;
                grl.g0 g0Var = i != 1 ? i != 2 ? (i == 3 || i == 4) ? grl.g0.FIAT : null : grl.g0.COMMODITY : grl.g0.CRYPTO;
                if (g0Var != null) {
                    AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                    RatesSourceContext.a aVarNewBuilder = RatesSourceContext.newBuilder();
                    aVarNewBuilder.h(g0Var);
                    w0 w0VarA = aVarNewBuilder.a();
                    companion.getClass();
                    analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
                }
                com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar = this.f157966b;
                od0.i iVar = aVar.G;
                if (iVar == null || !Intrinsics.f((AnalyticsContext) iVar.f224257a, analyticsContext)) {
                    od0.i.Companion.getClass();
                    aVar.G = od0.h.a(analyticsContext);
                    ((MarketOrderActivityV2) this.f157967c).f96939t0 = analyticsContext;
                    ((com.revolut.feature_exchange.impl.ui.exchange.order_type_dialog.a) aVar.f96953s).f96931n = analyticsContext;
                    j2i.d dVar = (j2i.d) aVar.z;
                    dVar.f170904l = analyticsContext;
                    ((KeyboardSuggestionsDelegate) dVar.f170902h).i = analyticsContext;
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ n(k kVar, com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar) {
        this.f157967c = kVar;
        this.f157966b = aVar;
    }
}
