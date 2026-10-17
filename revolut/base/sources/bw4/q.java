package bw4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.c0;
import om4.r1;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a f19234w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f19234w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f19234w, continuation, 0);
            default:
                return new q(this.f19234w, continuation, 1);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar2 = this.f19234w;
                    al4.m mVar = aVar2.f69734p;
                    String str = aVar2.o.f69731a;
                    int i2 = aVar2.I2().f19222a.f68801a;
                    dj0.d dVar = aVar2.I2().f19222a.f68802b;
                    this.v = 1;
                    if (((r1) mVar).g(str, i2, dVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar4 = this.f19234w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    aVar4.f69736r.getClass();
                    c0 c0VarB = vt4.b.b();
                    a3b.h hVar = new a3b.h(aVar4, 6);
                    ack.n nVar = new ack.n(2);
                    q qVar = new q(aVar4, null, 0);
                    this.v = 1;
                    obj2 = n14.k.S(aVar4.X(), c0VarB, hVar, nVar, qVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    aVar4.C2(h.f19227a);
                }
                return Unit.f186387a;
        }
    }
}
