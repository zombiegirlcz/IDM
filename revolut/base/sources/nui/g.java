package nui;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreenContract$ModalStep;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.manage_booking.AsftManageBookingPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftPassDetailsLegacyScreen f219314w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219314w = asftPassDetailsLegacyScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f219314w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f219314w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((AsftManageBookingPayload) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen = this.f219314w;
        switch (i) {
            case 0:
                String passId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) asftPassDetailsLegacyScreen.R2();
                bVar.getClass();
                Intrinsics.checkNotNullParameter(passId, "passId");
                bVar.l2(new n0(bVar, passId, null, 22), new yi5.b(26));
                break;
            default:
                AsftManageBookingPayload payload = (AsftManageBookingPayload) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b bVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) asftPassDetailsLegacyScreen.R2();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(payload, "payload");
                oki.h.v2(bVar2.u, new AsftPassDetailsLegacyScreenContract$ModalStep.ManageBooking(payload), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
        }
        return Unit.f186387a;
    }
}
