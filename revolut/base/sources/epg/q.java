package epg;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f128188w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f128188w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f128188w, continuation, 0);
            case 1:
                return new q(this.f128188w, continuation, 1);
            default:
                return new q(this.f128188w, continuation, 2);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    u uVar = this.f128188w;
                    cpg.a aVar2 = uVar.f128194p;
                    String str = ((l) uVar.t2()).f128182a;
                    this.v = 1;
                    if (aVar2.d(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    u uVar2 = this.f128188w;
                    q qVar = new q(uVar2, null, 0);
                    this.v = 1;
                    if (do3.q.t(uVar2, qVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                u uVar3 = this.f128188w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ack.n nVar = new ack.n(19);
                    q qVar2 = new q(uVar3, null, 1);
                    this.v = 1;
                    obj2 = n14.k.Q(uVar3, null, null, nVar, qVar2, this, 3);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nii.e eVar = (nii.e) obj2;
                if (eVar instanceof nii.c) {
                    throw ((nii.c) eVar).f216123a;
                }
                if (!(eVar instanceof nii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                uVar3.v2(new n(((l) uVar3.t2()).f128182a));
                return Unit.f186387a;
        }
    }
}
