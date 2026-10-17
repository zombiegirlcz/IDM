package dfj;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nfj.x0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f113905b;

    public /* synthetic */ a2(b2 b2Var, int i) {
        this.f113904a = i;
        this.f113905b = b2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hha.d currentPricingPlan = (hha.d) obj2;
        switch (this.f113904a) {
            case 0:
                Intrinsics.checkNotNullParameter(currentPricingPlan, "currentPricingPlan");
                nfj.v0 v0Var = this.f113905b.f113915a;
                String currentPricingPlanId = currentPricingPlan.f152287a;
                nfj.z0 z0Var = (nfj.z0) v0Var;
                z0Var.getClass();
                Intrinsics.checkNotNullParameter(currentPricingPlanId, "currentPricingPlanId");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return z0Var.e.b(new nfj.y0(currentPricingPlanId, x0.a.f215067a), loadingStrategy);
            default:
                Intrinsics.checkNotNullParameter(currentPricingPlan, "currentPlan");
                nfj.v0 v0Var2 = this.f113905b.f113915a;
                String currentPricingPlanId2 = currentPricingPlan.f152287a;
                nfj.z0 z0Var2 = (nfj.z0) v0Var2;
                z0Var2.getClass();
                Intrinsics.checkNotNullParameter(currentPricingPlanId2, "currentPricingPlanId");
                w4l.i loadingStrategy2 = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                return z0Var2.e.b(new nfj.y0(currentPricingPlanId2, x0.b.f215068a), loadingStrategy2);
        }
    }
}
