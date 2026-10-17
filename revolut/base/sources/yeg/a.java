package yeg;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.sorting.TravelHotelsSortingOptionSelectorScreen;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsSortingOptionSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TravelHotelsSortingOptionSelectorScreen travelHotelsSortingOptionSelectorScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsSortingOptionSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = (d) this.v.T.getValue();
        Intrinsics.h(model);
        g gVar = (g) dVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        TravelHotelsSortingOption travelHotelsSortingOption = obj3 instanceof TravelHotelsSortingOption ? (TravelHotelsSortingOption) obj3 : null;
        if (travelHotelsSortingOption != null) {
            gVar.n2(new f(travelHotelsSortingOption, gVar, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
