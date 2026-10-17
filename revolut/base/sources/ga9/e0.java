package ga9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ wi0.b f142068x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(com.revolut.feature.onboarding.impl.onboarding.v vVar, wi0.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f142067w = vVar;
        this.f142068x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(this.f142067w, this.f142068x, continuation, 0);
            default:
                return new e0(this.f142067w, this.f142068x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q89.e eVar = this.f142067w.v;
                    t89.a aVar2 = t89.a.TERMS;
                    this.v = 1;
                    if (((db9.d) eVar).b(this.f142068x, aVar2, this) == aVar) {
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
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.onboarding.impl.onboarding.v vVar = this.f142067w;
                    e0 e0Var = new e0(vVar, this.f142068x, null, 0);
                    this.v = 1;
                    if (vVar.p2(this, e0Var) == aVar3) {
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
