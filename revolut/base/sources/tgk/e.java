package tgk;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checkout.models.CheckoutParams;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pi3.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ b93.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f271194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a f271195x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b93.f fVar, h hVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f271194w = hVar;
        this.f271195x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f271194w, this.f271195x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a aVar = this.f271195x;
        d dVar = aVar.o;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CheckoutParams.CardOrder cardOrder = new CheckoutParams.CardOrder(this.v, this.f271194w, dVar.f271192g);
            qh3.c cVar = aVar.f102975p;
            AnalyticsProduct analyticsProduct = dVar.f271193h;
            this.u = 1;
            if (cVar.Z2(cardOrder, null, analyticsProduct, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
