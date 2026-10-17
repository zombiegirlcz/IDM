package sdg;

import cli.y;
import com.fasterxml.jackson.core.m;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.ja0;
import ip0.la0;
import ip0.na0;
import ip0.oa0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsPropertyGuestsReviewsScreen f261878w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TravelHotelsPropertyGuestsReviewsScreen travelHotelsPropertyGuestsReviewsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261878w = travelHotelsPropertyGuestsReviewsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f261878w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f261878w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((la0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsPropertyGuestsReviewsScreen travelHotelsPropertyGuestsReviewsScreen = this.f261878w;
        switch (i) {
            case 0:
                String menuId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE3 = travelHotelsPropertyGuestsReviewsScreen.e3();
                Intrinsics.h(menuId);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a) iVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (menuId.equals("REVIEW_VERIFICATION_MENU_ITEM_ID")) {
                    oki.h.v2(aVar2.u, TravelHotelsPropertyGuestsReviewsScreenContract$ModalStep.Disclaimer.f93990a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                }
                break;
            default:
                la0 model = (la0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVarE32 = travelHotelsPropertyGuestsReviewsScreen.e3();
                Intrinsics.h(model);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a aVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.a) iVarE32;
                y yVar = aVar4.f93995t;
                Intrinsics.checkNotNullParameter(model, "model");
                m mVar = model.f165158j;
                boolean z = mVar instanceof ja0;
                if (z && (((ja0) mVar).d instanceof na0)) {
                    aVar4.H2(yVar, new i3g.h(model, 2));
                } else if (z && (((ja0) mVar).d instanceof oa0)) {
                    aVar4.H2(yVar, new i3g.h(model, 3));
                }
                break;
        }
        return Unit.f186387a;
    }
}
