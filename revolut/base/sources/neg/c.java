package neg;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.TravelHotelsFiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TravelHotelsFiltersScreen travelHotelsFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.R2();
        Intrinsics.h(textData);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c cVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) nVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        if (Intrinsics.f(textData.f52597a, "SMART_FILTERS_INPUT")) {
            cVar.H2(cVar.f94039x, new nc1.j(textData, cVar, 5));
        }
        return Unit.f186387a;
    }
}
