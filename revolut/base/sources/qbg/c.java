package qbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$CancellationConfirmationData;
import com.revolut.kompot.common.ModalDestination;
import i9g.v;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsCancellationPolicyScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsCancellationPolicyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar;
        TravelHotelsCancellationConfirmationContract$CancellationConfirmationData travelHotelsCancellationConfirmationContract$CancellationConfirmationData;
        int i = this.u;
        TravelHotelsCancellationPolicyScreen travelHotelsCancellationPolicyScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a) ((g) travelHotelsCancellationPolicyScreen.P.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a aVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.a) ((g) travelHotelsCancellationPolicyScreen.P.getValue());
                TravelHotelsCancellationPolicyScreenContract$Mode travelHotelsCancellationPolicyScreenContract$Mode = aVar3.o.f93869a;
                if ((travelHotelsCancellationPolicyScreenContract$Mode instanceof TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation) && (fVar = (f) ((e) ((j2) aVar3.f93884t.f22677a).getValue()).f244269a.getContent()) != null && (travelHotelsCancellationConfirmationContract$CancellationConfirmationData = fVar.f244273c) != null) {
                    oki.h.y2(aVar3.f93883s, new TravelHotelsCancellationPolicyScreenContract$ModalStep.Confirmation(((TravelHotelsCancellationPolicyScreenContract$Mode.ManageCancellation) travelHotelsCancellationPolicyScreenContract$Mode).f93876a, ((v) aVar3.f93881q).b() ? d.REFUND_BREAKDOWN : d.CANCELLATION_DETAILS, travelHotelsCancellationConfirmationContract$CancellationConfirmationData), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
