package e60;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f122871w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f122871w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f122871w, continuation, 0);
            case 1:
                return new w(this.f122871w, continuation, 1);
            case 2:
                return new w(this.f122871w, continuation, 2);
            default:
                return new w(this.f122871w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        y yVar = this.f122871w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vkm.d dVarB = rd0.e.b(yVar.v);
                d4f.m mVar = new d4f.m(i2, 8, iVar);
                this.v = 1;
                Object objY = vkm.q.y(dVarB, mVar, this);
                return objY == aVar ? aVar : objY;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    throw null;
                }
                if (i6 == 1) {
                    yhm.o.b(obj2);
                    if (!((Boolean) obj2).booleanValue()) {
                        throw null;
                    }
                    yVar.v.onNext(xg0.q.f305476a);
                } else {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    x xVar = new x(yVar, iVar, 0);
                    this.v = 1;
                    if (yVar.Y2(this, xVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                h hVar = yVar.f122877q;
                yVar.k3(new d(hVar != null ? hVar.a() : 0));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    x xVar2 = new x(yVar, iVar, i3);
                    this.v = 1;
                    obj2 = yVar.Y2(this, xVar2);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                xg0.u uVar = (xg0.u) obj2;
                if (uVar instanceof xg0.t) {
                    uh0.b bVar = ((xg0.t) uVar).f305479a;
                    h hVar2 = yVar.f122877q;
                    yVar.k3(new g(hVar2 != null ? hVar2.a() : null, bVar));
                } else {
                    yVar.i3();
                }
                return Unit.f186387a;
        }
    }
}
