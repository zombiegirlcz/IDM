package zuj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.api.travel_trips.R$string;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.TravelItineraryScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelItineraryScreen f325493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(TravelItineraryScreen travelItineraryScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325493w = travelItineraryScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f325493w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f325493w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f325493w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelItineraryScreen travelItineraryScreen = this.f325493w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str, "MENU_ITEM_EDIT_ID")) {
                    l0.f(((com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) travelItineraryScreen.R2()).f101614w, "MENU_ITEM_EDIT_ID", zi0.c.d(zhm.u.c(new PopupMenuItem.Cell("POPUP_ITEM_EDIT_DATES", new TextLocalisedClause(R$string.travel_trip_itinerary_edit_dates_menu_item, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, null, null, 1016))), null, null, 12);
                }
                break;
            case 1:
                String dateId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE3 = travelItineraryScreen.R2();
                Intrinsics.h(dateId);
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar3 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) uVarE3;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(dateId, "dateId");
                aVar3.H2(aVar3.z, new x(dateId, 0));
                break;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE32 = travelItineraryScreen.R2();
                String actionId = aVar4.f275445a;
                com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a aVar6 = (com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.a) uVarE32;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(actionId, "actionId");
                if (Intrinsics.f(actionId, "DISCLAIMER_CLAUSE_CLICK_ID")) {
                    aVar6.C1(new ExternalDestination.Browser("https://www.revolut.com/legal/rita-disclaimer/?geo-redirect=true", null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
