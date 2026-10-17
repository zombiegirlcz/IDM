package gvi;

import cli.y;
import gvi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((gui.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar = this.v;
        y yVar = rVar.f147200t;
        gui.f fVar = (gui.f) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (fVar instanceof gui.c) {
            rVar.H2(yVar, new gul.f(29));
        } else if (fVar instanceof gui.d) {
            rVar.H2(yVar, new p(0));
            gui.d dVar = (gui.d) fVar;
            rVar.C2(new i(dVar.f146948a, dVar.f146949b, dVar.f146950c, dVar.d));
        } else if (fVar instanceof gui.e) {
            rVar.H2(yVar, new p(1));
            rVar.C2(j.a.f147186a);
        } else if (fVar instanceof gui.b) {
            rVar.H2(yVar, new p(2));
            hx7.e.h(new IllegalStateException("Purchase from this point could be only for zero price"));
        } else {
            if (!(fVar instanceof gui.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rVar.H2(yVar, new p(3));
        }
        return Unit.f186387a;
    }
}
