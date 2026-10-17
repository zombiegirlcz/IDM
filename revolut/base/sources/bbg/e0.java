package bbg;

import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.v, continuation);
        e0Var.u = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        cgi.f fVar;
        cgi.g gVar;
        cgi.l lVar;
        Data beds = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar2 = this.v;
        wbg.e eVar = aVar2.f93826p;
        aVar2.z.Z2(beds, new z(1, aVar2, 0 == true ? 1 : 0));
        List list = (List) beds.getContent();
        TravelHotelsBookingAmendmentCost travelHotelsBookingAmendmentCost = (list == null || (fVar = (cgi.f) zhm.d0.d0(list)) == null || (gVar = fVar.f23992a) == null || (lVar = gVar.f23996c) == null) ? null : lVar.f24000c;
        TravelHotelsBookingAmendmentCost.AmountOwed amountOwed = travelHotelsBookingAmendmentCost instanceof TravelHotelsBookingAmendmentCost.AmountOwed ? (TravelHotelsBookingAmendmentCost.AmountOwed) travelHotelsBookingAmendmentCost : null;
        HotelsPointsRedeemOption hotelsPointsRedeemOption = amountOwed != null ? (HotelsPointsRedeemOption) zhm.d0.o0(amountOwed.f97845a.f97844c) : null;
        aVar2.H2(aVar2.D, new b58.f(beds, hotelsPointsRedeemOption, 24));
        wbg.s sVar = (wbg.s) eVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(beds, "beds");
        sVar.f.setValue(beds);
        od0.i.Companion.getClass();
        ((wbg.s) eVar).b(od0.h.a(hotelsPointsRedeemOption));
        return Unit.f186387a;
    }
}
