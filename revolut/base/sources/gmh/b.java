package gmh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.ui.impl.trade_redesign.popular_commodities.PopularCommoditiesController;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PopularCommoditiesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PopularCommoditiesController popularCommoditiesController, Continuation continuation) {
        super(2, continuation);
        this.v = popularCommoditiesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = (c) this.v.Q.getValue();
        Intrinsics.h(model);
        h hVar = (h) cVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        klh.b bVar2 = obj3 instanceof klh.b ? (klh.b) obj3 : null;
        if (bVar2 != null && (bVar = bVar2.f185626a) != null) {
            hVar.C1(u0.c(new CryptoCommodityDetailsFeatureConfig(bVar, null, null, null, 62)));
        }
        return Unit.f186387a;
    }
}
