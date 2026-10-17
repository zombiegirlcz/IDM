package es;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d f128758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vr.l f128759x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, vr.l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128758w = dVar;
        this.f128759x = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f128758w, this.f128759x, continuation, 0);
            case 1:
                return new k(this.f128758w, this.f128759x, continuation, 1);
            default:
                return new k(this.f128758w, this.f128759x, continuation, 2);
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
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = this.f128758w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.biometric_verification.impl.ui.flow.launcher.d.I2(dVar, this.f128759x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.biometric_verification.impl.ui.flow.launcher.d.M2(dVar, (vr.i) obj2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar2 = this.f128758w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.biometric_verification.impl.ui.flow.launcher.d.I2(dVar2, this.f128759x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                vr.i iVar = (vr.i) obj2;
                if (!(iVar instanceof vr.h)) {
                    dVar2.f50485s.getClass();
                    return yji.l.a1(dVar2, dVar2.V2(ds.a.f()), null, null, new eif.j(dVar2, iVar, null, 26), 3);
                }
                this.v = 2;
                if (com.revolut.biometric_verification.impl.ui.flow.launcher.d.M2(dVar2, iVar, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar3 = this.f128758w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.biometric_verification.impl.ui.flow.launcher.d.J2(dVar3, this.f128759x, this);
                    if (obj2 == aVar3) {
                        return aVar3;
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
                if (com.revolut.biometric_verification.impl.ui.flow.launcher.d.M2(dVar3, (vr.i) obj2, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }
}
