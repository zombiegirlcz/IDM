package m3g;

import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelExperiencesSearchResultsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelExperiencesSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            default:
                return new e(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                travelExperiencesSearchResultsScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) travelExperiencesSearchResultsScreen.T2();
                int i2 = y.f202564a[((n) bVar.t2()).f.ordinal()];
                int i3 = 2;
                if (i2 == 1) {
                    yji.l.g2(bVar, new TravelExperiencesSearchScreen(new TravelExperiencesSearchScreenContract$InputData(((n) bVar.t2()).f202543b)), null, new w(bVar, i3), 1);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.x2(new m30.c(15));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar2 = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) travelExperiencesSearchResultsScreen.T2();
                bVar2.getClass();
                yji.l.g2(bVar2, new TravelExperiencesDatesSelectionScreen(new TravelExperiencesDatesSelectionScreenContract$InputData(((n) bVar2.t2()).f202543b, o3g.e.RANGE, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy.All.f93159a)), null, new w(bVar2, 3), 1);
                return Unit.f186387a;
        }
    }
}
