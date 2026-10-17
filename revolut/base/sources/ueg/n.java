package ueg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsSearchResultsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0VarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) f0VarR2;
        d dVar = bVar.f94060p;
        Intrinsics.checkNotNullParameter(model, "model");
        String str2 = model.f52373a;
        int iHashCode = str2.hashCode();
        if (iHashCode != -1798304149) {
            if (iHashCode != 375053131) {
                if (iHashCode == 1811985586 && str2.equals("ERROR_STATE_SEARCH_RESULTS_PAGE_ITEM_ID")) {
                    ((e) dVar).a();
                }
            } else if (str2.equals("ERROR_STATE_SMART_SEARCH_ITEM_ID") && (str = bVar.Q) != null) {
                bVar.O2(str);
            }
        } else if (str2.equals("ERROR_STATE_GENERAL_ITEM_ID")) {
            bVar.L.a();
            ((e) dVar).a();
        }
        return Unit.f186387a;
    }
}
