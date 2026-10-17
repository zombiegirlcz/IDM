package jta;

import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RaffleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RaffleScreen raffleScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = raffleScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RaffleScreen raffleScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((v) raffleScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v vVar = (v) raffleScreen.e3();
                com.revolut.feature.raffle.impl.data.models.b bVar = (com.revolut.feature.raffle.impl.data.models.b) ((e) ((j2) vVar.f178467t.f22677a).getValue()).f178441b.getContent();
                if (bVar != null) {
                    vVar.l2(new t(vVar, bVar, null, 1), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
