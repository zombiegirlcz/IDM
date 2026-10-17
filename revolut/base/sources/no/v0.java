package no;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.analytics.tracking.v3.f u;
    public final /* synthetic */ AnalyticsProduct v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.revolut.analytics.tracking.v3.f fVar, AnalyticsProduct analyticsProduct, Continuation continuation) {
        super(1, continuation);
        this.u = fVar;
        this.v = analyticsProduct;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v0(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return this.u.f50315b.a(this.v);
    }
}
