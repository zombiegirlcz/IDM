package kjk;

import bjk.f2;
import bjk.g2;
import com.revolut.retail.feature.pricing_plans.ui.impl.network.PricingPlanUiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f184426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f184427x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(f0 f0Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f184427x = f0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f184427x, continuation, 0);
                d0Var.f184426w = str;
                return d0Var.invokeSuspend(Unit.f186387a);
            default:
                d0 d0Var2 = new d0(this.f184427x, continuation, 1);
                d0Var2.f184426w = str;
                return d0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.f184426w;
                Object kVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PricingPlanUiService pricingPlanUiService = this.f184427x.f184433a;
                    this.f184426w = null;
                    this.v = 1;
                    obj2 = pricingPlanUiService.getPlanBenefitsSuggestions(str, this);
                    if (obj2 != kVar) {
                    }
                    return kVar;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                bjk.l lVar = (bjk.l) obj2;
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                g2.d.s highlightedBenefits = lVar.getHighlightedBenefits();
                kVar = new ggk.k(highlightedBenefits != null ? mjk.r.i(highlightedBenefits) : null);
                return kVar;
            default:
                String str2 = this.f184426w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PricingPlanUiService pricingPlanUiService2 = this.f184427x.f184433a;
                    String strL = m70.a.l(str2);
                    this.f184426w = null;
                    this.v = 1;
                    obj2 = pricingPlanUiService2.getPlanUnlockableBenefitsLayout(strL, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return mjk.o.a((f2) obj2);
        }
    }
}
