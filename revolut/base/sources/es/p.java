package es;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import nq.i0;
import nq.j0;

/* JADX INFO: loaded from: classes17.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.biometric_verification.impl.ui.flow.launcher.d f128765w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f128766x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, j0 j0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128765w = dVar;
        this.f128766x = j0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f128765w, this.f128766x, continuation, 0);
                pVar.v = obj2;
                return pVar;
            default:
                p pVar2 = new p(this.f128765w, this.f128766x, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable th10 = (Throwable) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(th10, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        final j0 j0Var = this.f128766x;
        final com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = this.f128765w;
        switch (i) {
            case 0:
                final Throwable th10 = (Throwable) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final int i2 = 0;
                return Boolean.valueOf(dVar.R2(th10, new Function0() { // from class: es.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                Throwable th11 = th10;
                                dVar.U2((i0) j0Var, th11);
                                break;
                            default:
                                Throwable th12 = th10;
                                dVar.U2((i0) j0Var, th12);
                                break;
                        }
                        return Unit.f186387a;
                    }
                }));
            default:
                final Throwable th11 = (Throwable) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                final int i3 = 1;
                return Boolean.valueOf(dVar.R2(th11, new Function0() { // from class: es.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                Throwable th112 = th11;
                                dVar.U2((i0) j0Var, th112);
                                break;
                            default:
                                Throwable th12 = th11;
                                dVar.U2((i0) j0Var, th12);
                                break;
                        }
                        return Unit.f186387a;
                    }
                }));
        }
    }
}
