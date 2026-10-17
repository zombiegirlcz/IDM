package n1g;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.voucher.TravelExperiencesBookingVoucherScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.voucher.TravelExperiencesBookingVoucherScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesBookingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TravelExperiencesBookingDetailsScreen travelExperiencesBookingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVar = (f) this.v.f93017e0.getValue();
        Intrinsics.h(model);
        r rVar = (r) fVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "EXPERIENCE_TICKET_BUTTON_ITEM")) {
            Object obj3 = model.i;
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
            yji.l.g2(rVar, new TravelExperiencesBookingVoucherScreen(new TravelExperiencesBookingVoucherScreenContract$InputData((String) obj3)), null, null, 3);
        }
        return Unit.f186387a;
    }
}
