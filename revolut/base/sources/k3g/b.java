package k3g;

import aii.r;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.travel.experiences.api.models.search.TravelRecentSearchType;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchExperience;
import com.revolut.feature.travel.experiences.api.models.search.recent.TravelRecentSearchLocation;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.travel.experiences.models.TravelExperiencesSummary;
import jsl.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelExperiencesSearchScreen travelExperiencesSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r gVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVar = (l) this.v.g0.getValue();
        Intrinsics.h(model);
        o oVar = (o) lVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        int i = 26;
        Continuation continuation = null;
        if (Intrinsics.f(model.f53228a, "NEAR_ME_ITEM_ID")) {
            oVar.l2(new n(oVar, null, 1), new yi5.b(26));
        } else {
            Object obj3 = model.u;
            if (obj3 instanceof TravelSearchExperience) {
                oVar.n2(new t0(oVar, (TravelSearchExperience) obj3, continuation, 27), new whi.b(6));
            } else if (obj3 instanceof TravelSearchDestination) {
                oVar.n2(new t0(oVar, (TravelSearchDestination) obj3, continuation, i), new whi.b(6));
            } else if (obj3 instanceof TravelRecentSearchLocation) {
                TravelRecentSearchLocation travelRecentSearchLocation = (TravelRecentSearchLocation) obj3;
                String str = travelRecentSearchLocation.f92903c;
                TravelRecentSearchType travelRecentSearchType = travelRecentSearchLocation.f;
                String value = travelRecentSearchLocation.f92901a;
                if (travelRecentSearchType instanceof TravelRecentSearchType.Destination) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    gVar = new j(value, ((TravelRecentSearchType.Destination) travelRecentSearchType).f92883a, str, a1g.g.a(travelRecentSearchLocation));
                } else if (travelRecentSearchType instanceof TravelRecentSearchType.Attraction) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    gVar = new i(value, str, a1g.g.a(travelRecentSearchLocation));
                } else {
                    if (!(travelRecentSearchType instanceof TravelRecentSearchType.Experience)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = new g(value);
                }
                oVar.v2(gVar);
            } else if (obj3 instanceof TravelExperiencesSummary) {
                oVar.v2(new g(((TravelExperiencesSummary) obj3).f93201a));
            } else if (obj3 instanceof TravelSearchAttraction) {
                oVar.n2(new t0(oVar, (TravelSearchAttraction) obj3, continuation, 25), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
