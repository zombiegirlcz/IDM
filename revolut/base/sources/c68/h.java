package c68;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f f21704w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f21704w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f21704w, continuation, 0);
            case 1:
                return new h(this.f21704w, continuation, 1);
            case 2:
                return new h(this.f21704w, continuation, 2);
            default:
                return new h(this.f21704w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar = this.f21704w;
                    g gVar = new g(fVar, null);
                    this.v = 1;
                    if (fVar.p2(this, gVar) == aVar) {
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
                    com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar2 = this.f21704w;
                    r58.d dVar = new r58.d(fVar2.o.f76633a.f77101g);
                    q58.a aVar3 = fVar2.f76646p;
                    this.v = 1;
                    if (((a68.e) aVar3).d(dVar, this) == aVar2) {
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
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f fVar3 = this.f21704w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    h hVar = new h(fVar3, null, 1);
                    this.v = 1;
                    if (fVar3.p2(this, hVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f.J2(fVar3, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objO2 = this.f21704w.O2(this);
                return objO2 == aVar5 ? aVar5 : objO2;
        }
    }
}
