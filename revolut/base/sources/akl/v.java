package akl;

import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.feature.advised_components.network.AdvisedComponentsService;
import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import com.revolut.feature.support.impl.data.network.service.SupportService;
import com.revolut.retail.feature.pricing_plans.impl.network.PricingPlanService;
import com.revolut.sso.impl.network.services.ConfigurationService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes13.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6100w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new v((z) this.f6100w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            case 1:
                v vVar = new v(3, (Continuation) obj4);
                vVar.f6100w = (FlowCollector) obj2;
                return vVar.invokeSuspend(Unit.f186387a);
            case 2:
                return new v((pfk.p0) this.f6100w, (Continuation) obj4, 2).invokeSuspend(Unit.f186387a);
            case 3:
                return new v((vj1.b) this.f6100w, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
            case 4:
                return new v((xce.f) this.f6100w, (Continuation) obj4, 4).invokeSuspend(Unit.f186387a);
            default:
                return new v((xr3.k) this.f6100w, (Continuation) obj4, 5).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z zVar = (z) this.f6100w;
                    ConfigurationService configurationService = zVar.f6121a;
                    String str = ((rqk.k) zVar.f6122b).f256593p;
                    this.v = 1;
                    obj2 = configurationService.getConfig(str, mkl.a.f206500a, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yjl.t.a((jkl.n0) obj2);
            case 1:
                FlowCollector flowCollector = (FlowCollector) this.f6100w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    od0.i.Companion.getClass();
                    this.f6100w = null;
                    this.v = 1;
                    if (flowCollector.emit(od0.i.f224256b, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    PricingPlanService pricingPlanService = ((pfk.p0) this.f6100w).f235668a;
                    this.v = 1;
                    obj2 = pricingPlanService.getPlanCampaigns(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return kotlin.jvm.internal.s.F((gfk.u) obj2);
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    vj1.b bVar = (vj1.b) this.f6100w;
                    AdvisedComponentsService advisedComponentsService = bVar.f289629a;
                    String str2 = ((jte.d) bVar.d).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? "p4uRevamp" : null;
                    this.v = 1;
                    obj2 = advisedComponentsService.getAdvisedComponents(str2, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return cp5.d.R((uj1.d) obj2);
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    SupportService supportService = ((xce.f) this.f6100w).f304119a;
                    this.v = 1;
                    obj2 = supportService.getTroubleshootingSuggestions(this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return hx7.i.M((bde.s) obj2);
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    CreditOnboardingService creditOnboardingService = ((xr3.k) this.f6100w).f308224b;
                    this.v = 1;
                    obj2 = creditOnboardingService.getCreditConfiguration(this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return v13.d.x((gr3.a) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f6100w = obj2;
    }
}
