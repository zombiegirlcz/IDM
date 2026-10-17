package pfk;

import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f235654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f235655x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(p0 p0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235654w = p0Var;
        this.f235655x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l0(this.f235654w, this.f235655x, continuation, 0);
            default:
                return new l0(this.f235654w, this.f235655x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PricingPlanService pricingPlanService = this.f235654w.f235668a;
                    gfk.q qVar = new gfk.q(gfk.p.DOWNLOADED);
                    this.v = 1;
                    if (pricingPlanService.postTermsDownloaded(this.f235655x, qVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PricingPlanService pricingPlanService2 = this.f235654w.f235668a;
                    this.v = 1;
                    if (pricingPlanService2.prepareDurableMediumsTerms(this.f235655x, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
