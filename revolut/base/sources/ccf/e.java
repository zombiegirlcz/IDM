package ccf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.goodbye_screen.AddOnsGoodbyeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddOnsGoodbyeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AddOnsGoodbyeScreen addOnsGoodbyeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addOnsGoodbyeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarJ3 = this.v.T2();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.trading_add_ons.domain.model.addon.TradingAddOnFeature");
        lbf.k tradingAddOnFeature = (lbf.k) obj3;
        t tVar = (t) pVarJ3;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(tradingAddOnFeature, "tradingAddOnFeature");
        lbf.p pVar = (lbf.p) ((q) tVar.t2()).f23080a.getContent();
        if (pVar != null) {
            ProductArticleDestination productArticleDestinationB = ((acf.j) tVar.f23092w).b(tradingAddOnFeature, pVar.f193684a);
            if (productArticleDestinationB != null) {
                tVar.C1(productArticleDestinationB);
            }
        }
        return Unit.f186387a;
    }
}
