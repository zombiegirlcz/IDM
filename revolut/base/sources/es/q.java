package es;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.z1;

/* JADX INFO: loaded from: classes17.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d f128767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128767w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f128767w, continuation, 0);
            case 1:
                return new q(this.f128767w, continuation, 1);
            default:
                return new q(this.f128767w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objY;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = this.f128767w.G;
                    this.v = 1;
                    if (z1Var.emit(c0.f128750a, this) == aVar) {
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
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = this.f128767w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    a0 a0Var = dVar.I;
                    this.v = 1;
                    skm.r rVar = a0Var.d;
                    if (rVar == null || (objY = rVar.y(this)) != aVar2) {
                        objY = Unit.f186387a;
                    }
                    if (objY == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                dVar.l2(new eif.j(dVar, null, 29), new d(dVar, 0));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    zr.e eVar = this.f128767w.v;
                    this.v = 1;
                    Object objEmit = eVar.f324506a.emit(zr.b.f324504a, this);
                    if (objEmit != aVar3) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
