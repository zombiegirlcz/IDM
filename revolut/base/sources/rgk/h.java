package rgk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import ffk.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfk.p0;
import rfm.f0;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PricingPlanAction.ApplyDiscount f254210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.b bVar, PricingPlanAction.ApplyDiscount applyDiscount, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f254210w = applyDiscount;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f254210w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        t tVar = this.v.f102970p;
        PricingPlanAction.ApplyDiscount applyDiscount = this.f254210w;
        String planId = applyDiscount.f102792a;
        hha.i billingCode = applyDiscount.f102793b;
        String offerToken = applyDiscount.f102794c;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        p0 p0Var = (p0) tVar.f134850a;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        f0 f0VarF = w.g0(p0Var.f235668a.applyDiscount(planId, new gfk.a(cp5.d.X(billingCode), offerToken))).f(p0Var.e());
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        this.u = 1;
        Object objB = nim.a.b(f0VarF, this);
        return objB == aVar ? aVar : objB;
    }
}
