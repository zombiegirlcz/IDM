package te8;

import com.revolut.data.model.Data;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.features.api.exception.JuniorAccountFeatureDisabledException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kbb.c f270068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f270069c;

    public /* synthetic */ h(kbb.c cVar, boolean z, int i) {
        this.f270067a = i;
        this.f270068b = cVar;
        this.f270069c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f270067a) {
            case 0:
                Boolean juniorFeatureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorFeatureEnabled, "juniorFeatureEnabled");
                if (!juniorFeatureEnabled.booleanValue()) {
                    return te0.w.h(new Data(null, new JuniorAccountFeatureDisabledException(0), false, 5, null));
                }
                kbb.c cVar = this.f270068b;
                ffk.t tVar = (ffk.t) cVar.f182550c;
                boolean z = this.f270069c;
                return pd.b.r(tVar.v(z ? w4l.i.f294643c : w4l.h.f294642c), new h(cVar, z, 1));
            default:
                PricingPlanSubscription planSubscription = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(planSubscription, "planSubscription");
                ff8.e eVar = (ff8.e) this.f270068b.f182549b;
                String planId = planSubscription.f81129a.f152287a;
                w4l.k loadingStrategy = this.f270069c ? w4l.i.f294643c : w4l.h.f294642c;
                ff8.i iVar = (ff8.i) eVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(planId, "planId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(nim.a.v(iVar.e.b(Unit.f186387a, loadingStrategy), new f9g.l(planId, 7)), kotlin.coroutines.g.f186406a);
        }
    }
}
