package b58;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n38.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.invite_flow.d f12459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d0 f12460x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.joint.impl.ui.invite_flow.d dVar, d0 d0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12459w = dVar;
        this.f12460x = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f12459w, this.f12460x, continuation, 0);
            default:
                return new k(this.f12459w, this.f12460x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar = this.f12459w;
                j jVar = new j(dVar, this.f12460x, null, 0);
                this.v = 1;
                Object objP2 = dVar.p2(this, jVar);
                return objP2 == aVar ? aVar : objP2;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.joint.impl.ui.invite_flow.d dVar2 = this.f12459w;
                j jVar2 = new j(dVar2, this.f12460x, null, 2);
                this.v = 1;
                Object objP22 = dVar2.p2(this, jVar2);
                return objP22 == aVar2 ? aVar2 : objP22;
        }
    }
}
