package lhk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ e0 u;
    public final /* synthetic */ zfk.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f195325w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, zfk.m mVar, k kVar, Continuation continuation) {
        super(2, continuation);
        this.u = e0Var;
        this.v = mVar;
        this.f195325w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c0(this.u, this.v, this.f195325w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0Var = this.u;
        e0Var.T2(new lb0.b0(e0Var, this.v, this.f195325w, (Continuation) null, 11), new l3l.m(1, e0Var, e0.class, "handlePlanChangeError", "handlePlanChangeError(Ljava/lang/Throwable;)Z", 0, 23));
        return Unit.f186387a;
    }
}
