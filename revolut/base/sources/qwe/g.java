package qwe;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$State;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e u;
    public final /* synthetic */ AnalyticsProduct v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f249895w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, AnalyticsProduct analyticsProduct, boolean z, Continuation continuation) {
        super(1, continuation);
        this.u = eVar;
        this.v = analyticsProduct;
        this.f249895w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.u, this.v, this.f249895w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar = this.u;
        qh3.a aVar2 = eVar.f90707w;
        CheckoutParams checkoutParams = ((CheckoutFlowContract$State) ((j2) eVar.L.f22677a).getValue()).f90671a;
        if (checkoutParams == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        qh3.a.b3(aVar2, checkoutParams, this.v, eVar.o.d, this.f249895w, 12);
        return Unit.f186387a;
    }
}
