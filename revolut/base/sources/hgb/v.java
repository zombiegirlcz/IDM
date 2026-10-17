package hgb;

import com.revolut.feature.retail.salary_account.impl.salary_hub.SalaryHubControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import hha.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.salary_hub.a f152159b;

    public /* synthetic */ v(com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar, int i) {
        this.f152158a = i;
        this.f152159b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f152158a) {
            case 0:
                oki.h.v2(this.f152159b.v, SalaryHubControllerContract$ModalStep.PrioritySupport.f82989a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            case 1:
                this.f152159b.C2(n.f152149a);
                break;
            case 2:
                this.f152159b.C1(u0.c(new PricingPlanFeatureConfig.DashboardFromPlanTier(w0.PREMIUM, xfa.b.SALARY_HUB)));
                break;
            default:
                this.f152159b.C2(n.f152149a);
                break;
        }
        return Unit.f186387a;
    }
}
