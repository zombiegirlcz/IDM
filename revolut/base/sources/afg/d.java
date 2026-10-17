package afg;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.travel.experiences.api.navigation.TravelExperiencesDestination;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.suggested_experiences.TravelHotelsSuggestedExperiencesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsSuggestedExperiencesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelHotelsSuggestedExperiencesScreen travelHotelsSuggestedExperiencesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsSuggestedExperiencesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((VoucherSmallTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        VoucherSmallTileDelegate.Model model = (VoucherSmallTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        i iVar = (i) fVarE3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (a0.H(model.f53609a, "SUGGESTED_EXPERIENCES_VOUCHER_ITEM_ID_", false)) {
            Object obj3 = model.f53623w;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_travel_hotels_models.experiences.TravelHotelsExperience");
            iVar.C1(new TravelExperiencesDestination.ExperienceDetails(((cfi.a) obj3).f23692a, null));
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
