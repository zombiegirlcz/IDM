package rcg;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreen;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsFavoritesGridScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelHotelsFavoritesGridScreen travelHotelsFavoritesGridScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsFavoritesGridScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.k3();
        Intrinsics.h(model);
        q qVar = (q) lVarE3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53623w;
        HotelsProperty hotelsProperty = obj3 instanceof HotelsProperty ? (HotelsProperty) obj3 : null;
        if (hotelsProperty != null) {
            qVar.f253264q.Z2(new n(qVar, hotelsProperty, null));
        }
        return Unit.f186387a;
    }
}
