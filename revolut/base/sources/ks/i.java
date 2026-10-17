package ks;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f189054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c f189055x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(boolean z, com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f189054w = z;
        this.f189055x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f189054w, this.f189055x, continuation, 0);
            default:
                return new i(this.f189054w, this.f189055x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    boolean z = this.f189054w;
                    com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar = this.f189055x;
                    if (z) {
                        h hVar = new h(cVar, null, 0);
                        this.v = 1;
                        if (u0.c0(cVar, "RETAKE_BUTTON_LOADING_TAG", hVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        this.v = 2;
                        if (com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c.I2(cVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    boolean z3 = this.f189054w;
                    com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c cVar2 = this.f189055x;
                    if (z3) {
                        h hVar2 = new h(cVar2, null, 1);
                        this.v = 1;
                        if (u0.b0(cVar2.X(), "SUBMIT_BUTTON_LOADING_TAG", hVar2, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        this.v = 2;
                        if (com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c.J2(cVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
