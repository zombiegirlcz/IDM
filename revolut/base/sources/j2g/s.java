package j2g;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ ListSubheaderDelegate.Model u;
    public final /* synthetic */ y v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ListSubheaderDelegate.Model model, y yVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ListSubheaderDelegate.Model model = this.u;
        boolean zF = Intrinsics.f(model.f52708a, "RECOMMENDED_CATEGORIES_SUBHEADER_ITEM_ID");
        y yVar = this.v;
        if (zF) {
            Object obj3 = model.f52715m;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceDestinationWithCategories");
            TravelSearchDestination travelSearchDestination = ((myf.i) obj3).f210475b;
            yVar.C1(new TravelExperiencesDestination.ExperiencesSearchResults(travelSearchDestination.f92888a, travelSearchDestination.f92889b, TravelExperienceDatesSelection.NoDatesSelection.f92906a));
        } else {
            l2g.a aVar2 = yVar.f170886p;
            iv0.p onSeeAllBookings = new iv0.p(yVar, 11);
            ((l2g.c) aVar2).getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(onSeeAllBookings, "onSeeAllBookings");
            if (Intrinsics.f(model.f52708a, "UPCOMING_BOOKINGS_SUB_HEADER_ITEM_ID")) {
                onSeeAllBookings.invoke();
            } else {
                int i = jli.h.f175850a;
            }
        }
        return Unit.f186387a;
    }
}
