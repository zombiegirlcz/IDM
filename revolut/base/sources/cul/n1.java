package cul;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.time.b;

/* JADX INFO: loaded from: classes12.dex */
public final class n1 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n1(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n1) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.v;
        BigDecimal bigDecimal = eVar.q0;
        cli.y yVar = eVar.m0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (!((v) ((vkm.j2) yVar.f22677a).getValue()).G) {
                eVar.H2(yVar, new p0(14));
                b.Companion companion = kotlin.time.b.INSTANCE;
                long jH = kotlin.time.c.h(150L, pkm.e.MILLISECONDS);
                this.u = 1;
                if (skm.k0.c(jH, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        eVar.f106931t0.set(bigDecimal);
        eVar.n2(new cn0.d(eVar, bigDecimal, (Continuation) null, 17), new whi.b(6));
        return Unit.f186387a;
    }
}
