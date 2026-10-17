package hbg;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesFeatureConfig;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsBookingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (kotlin.text.a0.H(model.f53609a, "SUGGESTED_EXPERIENCES_VOUCHER_ITEM_ID_", false)) {
            Object obj3 = model.f53623w;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_travel_hotels_models.experiences.TravelHotelsExperience");
            bVar.C1(new BridgeDestination(new FeatureCommand(new TravelExperiencesFeatureConfig.ExperienceDetails(((cfi.a) obj3).f23692a))));
        }
        return Unit.f186387a;
    }
}
