package m3g;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategory;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.kompot.common.ModalDestination;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesSearchResultsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item actionItem = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarI3 = this.v.T2();
        Intrinsics.h(actionItem);
        com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) rVarI3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(actionItem, "actionItem");
        Object obj3 = actionItem.f58324n;
        if (Intrinsics.f(actionItem.f58316a, "QUICK_FILTER_ID_ALL_CATEGORIES")) {
            bVar.f2(new TravelExperiencesCategoriesFiltersScreen(new TravelExperiencesCategoriesFiltersScreenContract$InputData(((n) bVar.t2()).f202545g.f92822c, com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b.y2(((n) bVar.t2()).f202542a))), ModalDestination.Style.POPUP.f98311a, new w(bVar, 0));
        } else if (obj3 instanceof TravelExperienceCategory) {
            Set setH1 = d0.h1(((n) bVar.t2()).f202545g.f92822c);
            String str = ((TravelExperienceCategory) obj3).f92807a;
            if (setH1.contains(str)) {
                setH1.remove(str);
            } else {
                setH1.add(str);
            }
            bVar.x2(new imk.e(9, setH1));
            bVar.A2();
        }
        return Unit.f186387a;
    }
}
