package hbg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesFeatureConfig;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsBookingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE3;
        bVar.getClass();
        cli.y yVar = bVar.P;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        Object obj3 = model.f52715m;
        if (Intrinsics.f(str, "SUGGESTED_EXPERIENCES_SUBHEADER_ITEM_ID")) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_travel_hotels_models.experiences.TravelHotelsExperienceDestination");
            cfi.g gVar = (cfi.g) obj3;
            rei.g gVar2 = (rei.g) ((l) ((j2) yVar.f22677a).getValue()).f150703a.getContent();
            if (gVar2 != null) {
                rei.e eVar = gVar2.e;
                bVar.C1(new BridgeDestination(new FeatureCommand(new TravelExperiencesFeatureConfig.SearchResults(gVar.f23707a, gVar.f23708b, new TravelExperienceDatesSelection.RangeDateSelection(new DateTime(oc.c.F(eVar.f253602a)), new DateTime(oc.c.F(eVar.f253603b)))))));
            }
        } else if (Intrinsics.f(str, "ROOM_ITEMS_TITLE_ITEM_ID")) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_travel_hotels_models.booking.details.HotelsPropertyBookingRoom");
            rei.k kVar = (rei.k) obj3;
            rei.g gVar3 = (rei.g) ((l) ((j2) yVar.f22677a).getValue()).f150703a.getContent();
            if (gVar3 != null) {
                bVar.n2(new gsh.w(bVar, gVar3, kVar, null, 21), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
