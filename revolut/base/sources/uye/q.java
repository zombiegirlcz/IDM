package uye;

import com.revolut.feature.topup_screen.common.TopUpTarget;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kye.u f284317w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, kye.u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = iVar;
        this.f284317w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.v, this.f284317w, continuation, 0);
            default:
                return new q(this.v, this.f284317w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((q) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        kye.u uVar = this.f284317w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kye.z zVar = (kye.z) uVar;
                TopUpTarget topUpTarget = zVar.f190884b;
                io3.d dVar = zVar.f190885c;
                boolean z = topUpTarget instanceof TopUpTarget.Joint;
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.v;
                if (z) {
                    iVar.l2(new n0(iVar, ((TopUpTarget.Joint) topUpTarget).f90572a, zVar.f190883a, dVar.f163145a, null), new yi5.b(26));
                } else if (topUpTarget instanceof TopUpTarget.Pro) {
                    iVar.l2(new uvf.b(iVar, zVar.f190883a, dVar.f163145a, (Continuation) null, 4), new yi5.b(26));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Unsupported target for top-up from Revolut account " + topUpTarget);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                this.v.P2(((kye.p) uVar).f190811a);
                break;
        }
        return Unit.f186387a;
    }
}
