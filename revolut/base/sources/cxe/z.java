package cxe;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c f109978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ pi3.r f109979x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f109980y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar, pi3.r rVar, b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f109978w = cVar;
        this.f109979x = rVar;
        this.f109980y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f109978w, this.f109979x, this.f109980y, continuation, 0);
            default:
                return new z(this.f109978w, this.f109979x, this.f109980y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = this.f109978w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    sh3.a aVar2 = cVar.v;
                    pi3.r rVar = this.f109979x;
                    e93.j0 j0Var = rVar.f236419c;
                    this.v = 1;
                    Object objUpdatePreorder = ((hi3.i) ((ei3.m) aVar2).f126385a).f152488a.updatePreorder(rVar.f236417a, new ii3.a(mo3.a.p(j0Var.f123876a), mo3.a.p(j0Var.f123877b), rVar.f236418b), this);
                    if (objUpdatePreorder != aVar) {
                        objUpdatePreorder = Unit.f186387a;
                    }
                    if (objUpdatePreorder != aVar) {
                        objUpdatePreorder = Unit.f186387a;
                    }
                    if (objUpdatePreorder == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                cVar.K2(this.f109980y);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar2 = this.f109978w;
                    z zVar = new z(cVar2, this.f109979x, this.f109980y, null, 0);
                    this.v = 1;
                    if (cVar2.p2(this, zVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
