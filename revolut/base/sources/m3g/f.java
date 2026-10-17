package m3g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreen;
import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import com.revolut.kompot.common.ModalDestination;
import ip0.ku;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesSearchResultsScreen f202535w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f202535w = travelExperiencesSearchResultsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f202535w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f202535w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f202535w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ku) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesSearchResultsScreen travelExperiencesSearchResultsScreen = this.f202535w;
        switch (i) {
            case 0:
                ku kuVar = (ku) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarI3 = travelExperiencesSearchResultsScreen.T2();
                Object obj3 = kuVar.f165086x;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.models.TravelExperiencesSummary");
                TravelExperiencesSummary experience = (TravelExperiencesSummary) obj3;
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) rVarI3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(experience, "experience");
                String str = experience.f93201a;
                String str2 = (String) d0.d0(experience.f93203c);
                bVar.v2(new q(str2 != null ? new TravelExperiencePreview(experience.f93202b, str2, experience.e) : null, ((n) bVar.t2()).f202543b, str));
                break;
            case 1:
                String menuItemId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarI32 = travelExperiencesSearchResultsScreen.T2();
                Intrinsics.h(menuItemId);
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar2 = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) rVarI32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("MENU_ITEM_FILTER_ID")) {
                    yji.l.g2(bVar2, new TravelExperiencesFilterScreen(new TravelExperiencesFilterScreenContract$InputData(((n) bVar2.t2()).f202545g, com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b.y2(((n) bVar2.t2()).f202542a))), null, new w(bVar2, 1), 1);
                }
                break;
            default:
                com.revolut.core.ui_kit.delegates.t model = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarI33 = travelExperiencesSearchResultsScreen.T2();
                Intrinsics.h(model);
                com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b bVar3 = (com.revolut.feature.travel.experiences.impl.ui.screen.search_results.b) rVarI33;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f54722b.f51590a, "REV_POINTS_RATE_BANNER_ID")) {
                    yji.l.j2(bVar3, bVar3.e1(new hub.c(e0.EXPERIENCES)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                }
                break;
        }
        return Unit.f186387a;
    }
}
