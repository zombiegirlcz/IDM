package k64;

import com.revolut.feature.credit.api.navigation.CreditApplicationDashboardFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import cqi.j;
import ft3.g1;
import grl.r2;
import kotlin.jvm.internal.Intrinsics;
import zc0.y2;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements efm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f181623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f181624c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f181622a = i;
        this.f181623b = obj2;
        this.f181624c = obj3;
    }

    @Override // efm.f
    public final void d(efm.d it8) {
        switch (this.f181622a) {
            case 0:
                j64.a aVar = (j64.a) this.f181623b;
                ln.a aVar2 = ((h) this.f181624c).f181630b;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!v.k(r2.CREDIT_APPLICATION_DASHBOARD, r2.CREDIT_APPLICATION_CHECKLIST).contains(aVar.f171669a.f66893c)) {
                    CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = aVar.f171669a;
                    aVar2.b(new FeatureCommand(new CreditApplicationDashboardFeatureConfig(creditApplicationPluginFlowContract$Configuration.f66892b, g1.e(creditApplicationPluginFlowContract$Configuration.d, creditApplicationPluginFlowContract$Configuration.e, creditApplicationPluginFlowContract$Configuration.k))));
                } else {
                    aVar2.b(FinishFlowCommand.f98647a);
                }
                break;
            default:
                y2 y2Var = (y2) this.f181623b;
                cqi.f fVar = (cqi.f) this.f181624c;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((j) y2Var.f321170s).R(fVar);
                break;
        }
    }
}
