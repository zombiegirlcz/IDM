package ocg;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.TravelHotelsFavoritesScreenV2;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsFavoritesScreenV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV2, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsFavoritesScreenV2;
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
        l lVarD3 = this.v.d();
        Intrinsics.h(model);
        r rVar = (r) lVarD3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f53623w;
        HotelsProperty hotelsProperty = obj3 instanceof HotelsProperty ? (HotelsProperty) obj3 : null;
        if (hotelsProperty != null) {
            rVar.f224244q.Z2(new p(rVar, hotelsProperty, null));
        }
        return Unit.f186387a;
    }
}
