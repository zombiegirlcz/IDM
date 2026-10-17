package ueg;

import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsSearchResultsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((BannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BannerDelegate.Model model = (BannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0VarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) f0VarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof TravelHotelsPromotion) {
            bVar.n2(new v0(bVar, obj3, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
