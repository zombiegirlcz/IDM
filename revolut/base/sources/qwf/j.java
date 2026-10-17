package qwf;

import com.revolut.core.ui_kit.delegates.bg;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransitCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(TransitCheckoutScreen transitCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transitCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            case 1:
                return new j(this.v, continuation, 1);
            case 2:
                return new j(this.v, continuation, 2);
            default:
                return new j(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j) create((bg) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 7;
        TransitCheckoutScreen transitCheckoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                transitCheckoutScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar = (z) transitCheckoutScreen.T2();
                String str = ((o) zVar.t2()).f249916a.f92706a;
                long j2 = ((o) zVar.t2()).f249917b;
                ArrayList arrayListZ2 = zVar.z2(((o) zVar.t2()).f249918c.f266203a);
                ArrayList arrayListZ22 = zVar.z2(((o) zVar.t2()).d);
                p pVar = (p) ((o) zVar.t2()).f249919g.getContent();
                TransitTicketRevPointOption transitTicketRevPointOption = pVar != null ? pVar.f249923b : null;
                ivf.g gVar = (ivf.g) ((o) zVar.t2()).f249920h.getContent();
                zVar.y2(new bxf.e(str, j2, arrayListZ22, arrayListZ2, transitTicketRevPointOption, gVar != null ? ((ivf.f) gVar).f168845a.f84376a : null), new AtomicBoolean(false));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar2 = (z) transitCheckoutScreen.T2();
                long j3 = ((o) zVar2.t2()).f249917b + 1;
                if (1 <= j3 && j3 < 21) {
                    zVar2.x2(new nxc.a(j3, i2));
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar3 = (z) transitCheckoutScreen.T2();
                long j5 = ((o) zVar3.t2()).f249917b - 1;
                if (1 <= j5 && j5 < 21) {
                    zVar3.x2(new nxc.a(j5, i2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
