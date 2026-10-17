package yui;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import java.time.LocalDate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftTimeSlotBookingScreen f317027w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(AsftTimeSlotBookingScreen asftTimeSlotBookingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f317027w = asftTimeSlotBookingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f317027w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f317027w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftTimeSlotBookingScreen asftTimeSlotBookingScreen = this.f317027w;
        switch (i) {
            case 0:
                r action = (r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a) asftTimeSlotBookingScreen.d();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                cli.y yVar = aVar2.f98893x;
                AsftConfig asftConfig = (AsftConfig) ((l) ((j2) yVar.f22677a).getValue()).d.getContent();
                j2 j2Var = (j2) yVar.f22677a;
                AsftTimeSlot asftTimeSlot = ((l) j2Var.getValue()).f317031g;
                LocalDate localDate = ((l) j2Var.getValue()).f;
                AsftTerminal asftTerminal = (AsftTerminal) ((l) j2Var.getValue()).f317030c.getContent();
                boolean zJ = pd.b.j(asftTerminal != null ? Boolean.valueOf(asftTerminal.f) : null);
                String str = ((l) j2Var.getValue()).f317032h;
                String str2 = ((l) j2Var.getValue()).i;
                AsftTerminal asftTerminal2 = (AsftTerminal) ((l) j2Var.getValue()).f317030c.getContent();
                boolean zJ2 = pd.b.j(asftTerminal2 != null ? Boolean.valueOf(asftTerminal2.f98741h) : null);
                if (asftConfig != null && asftTimeSlot != null && localDate != null && ((!zJ || str != null) && str2 != null)) {
                    int i2 = x.f317055a[action.ordinal()];
                    if (i2 == 1) {
                        aVar2.C2(new n(((l) j2Var.getValue()).e, localDate, asftTimeSlot, zJ2, zJ, str, str2, aVar2.s0(), asftConfig.f98712c));
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar2.v.d3(new bti.i(str2, f0.f322471a, null, zJ ? str : null, null));
                    }
                }
                return Unit.f186387a;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = asftTimeSlotBookingScreen.d();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a aVar4 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.a) pVarE3;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof HyperTextClickData) {
                    HyperTextTarget hyperTextTarget = ((HyperTextClickData) obj3).f74762a;
                    if (hyperTextTarget instanceof HyperTextTarget.Link) {
                        aVar4.C1(new ExternalDestination.Browser(((HyperTextTarget.Link) hyperTextTarget).f74757a, null));
                    }
                } else {
                    r6.b.D("Parcel must be HyperTextClickData");
                }
                return Unit.f186387a;
        }
    }
}
