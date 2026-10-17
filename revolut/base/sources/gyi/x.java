package gyi;

import com.revolut.retail.feature.airportlounges.api.model.AirportLoungesDisclaimer;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import gyi.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import svi.s0;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AirportLoungesPassListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(AirportLoungesPassListScreen airportLoungesPassListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = airportLoungesPassListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.v, continuation, 0);
            default:
                return new x(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        svi.r rVarJ2;
        int i = this.u;
        AirportLoungesPassListScreen airportLoungesPassListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((d0) airportLoungesPassListScreen.k3()).C2(b.a.f147866a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d0 d0Var = (d0) airportLoungesPassListScreen.k3();
                cli.y yVar = d0Var.f147882y;
                AirportLoungesDisclaimer airportLoungesDisclaimer = ((a) ((j2) yVar.f22677a).getValue()).e;
                if (airportLoungesDisclaimer != null && (rVarJ2 = d0.J2((a) ((j2) yVar.f22677a).getValue())) != null && rVarJ2.f265970b == svi.q.UNLIMITED && airportLoungesDisclaimer.d == s0.STRICT && !airportLoungesDisclaimer.f98914c) {
                    d0Var.C2(new e(airportLoungesDisclaimer));
                }
                break;
        }
        return Unit.f186387a;
    }
}
