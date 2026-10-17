package a2g;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.reviews.TravelExperiencesReviewsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelExperiencesDetailsScreen travelExperiencesDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) kVarI3;
        TravelExperiencesDetailsScreenContract$InputData travelExperiencesDetailsScreenContract$InputData = rVar.f852p;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        int iHashCode = str.hashCode();
        if (iHashCode != 1280733363) {
            if (iHashCode != 1514086902) {
                if (iHashCode == 2050679675 && str.equals("RATING_REVIEW_TITLE_ITEM_ID")) {
                    yji.l.j2(rVar, new TravelExperiencesReviewsScreen(new TravelExperiencesReviewsScreenContract$InputData(travelExperiencesDetailsScreenContract$InputData.f93059a)), ModalDestination.Style.POPUP.f98311a, null, 2);
                }
            } else if (str.equals("DESCRIPTION_ITEM_SUBHEADER_ID")) {
                rVar.y2(travelExperiencesDetailsScreenContract$InputData.f93059a, l1g.c.DESCRIPTION);
            }
        } else if (str.equals("FEATURES_SUBHEADER_ITEM_ID")) {
            rVar.y2(travelExperiencesDetailsScreenContract$InputData.f93059a, l1g.c.FEATURES);
        }
        return Unit.f186387a;
    }
}
