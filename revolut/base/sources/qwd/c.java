package qwd;

import cli.y;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StakeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(StakeController stakeController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = stakeController;
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
        StakeController stakeController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.staking.impl.stake.v2.b) stakeController.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.staking.impl.stake.v2.b bVar = (com.revolut.feature.staking.impl.stake.v2.b) stakeController.R2();
                y yVar = bVar.K;
                io3.d dVar = (io3.d) ((m) ((j2) yVar.f22677a).getValue()).f249866g.getContent();
                bVar.n2(new qd8.e(dVar != null ? z92.f.l(dVar) : null, bVar, ((m) ((j2) yVar.f22677a).getValue()).f.f249861b.d, (Continuation) null, 13), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
