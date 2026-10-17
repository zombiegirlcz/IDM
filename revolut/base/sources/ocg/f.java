package ocg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.TravelHotelsFavoritesScreenV2;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreenContract$InputData;
import com.revolut.feature_travel_hotels_models.favorites.HotelsFavoriteDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsFavoritesScreenV2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelHotelsFavoritesScreenV2 travelHotelsFavoritesScreenV2, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsFavoritesScreenV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarD3 = this.v.d();
        Intrinsics.h(model);
        r rVar = (r) lVarD3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        HotelsFavoriteDestination hotelsFavoriteDestination = obj3 instanceof HotelsFavoriteDestination ? (HotelsFavoriteDestination) obj3 : null;
        if (hotelsFavoriteDestination != null) {
            rVar.C2(new h(new TravelHotelsFavoritesGridScreenContract$InputData(new TextClause(hotelsFavoriteDestination.f97942b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), hotelsFavoriteDestination.f97941a)));
        }
        return Unit.f186387a;
    }
}
