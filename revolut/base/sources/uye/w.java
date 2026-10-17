package uye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f284327x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, xi0.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284326w = iVar;
        this.f284327x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.f284326w, this.f284327x, continuation, 0);
            case 1:
                return new w(this.f284326w, this.f284327x, continuation, 1);
            case 2:
                return new w(this.f284326w, this.f284327x, continuation, 2);
            default:
                return new w(this.f284326w, this.f284327x, continuation, 3);
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.f284326w;
                    v vVar = new v(iVar, this.f284327x, null, 0);
                    this.v = 1;
                    if (iVar.p2(this, vVar) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar2 = this.f284326w;
                    v vVar2 = new v(iVar2, this.f284327x, null, 1);
                    this.v = 1;
                    if (iVar2.p2(this, vVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    xi0.b bVar = this.f284327x;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar3 = this.f284326w;
                    x xVar = new x(iVar3, bVar, null);
                    this.v = 1;
                    if (iVar3.p2(this, xVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xi0.b bVar2 = this.f284327x;
                com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar4 = this.f284326w;
                i0 i0Var = new i0(iVar4, bVar2, null);
                this.v = 1;
                Object objP2 = iVar4.p2(this, i0Var);
                return objP2 == aVar4 ? aVar4 : objP2;
        }
    }
}
