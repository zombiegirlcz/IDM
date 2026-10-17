package neg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.TravelHotelsFiltersScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.TravelHotelsFiltersScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ TravelHotelsFiltersScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelHotelsFiltersScreen travelHotelsFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelHotelsFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        oki.h.v2(((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) this.u.R2()).f94040y, TravelHotelsFiltersScreenContract$ModalStep.SmartFiltersInfo.f94028a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
