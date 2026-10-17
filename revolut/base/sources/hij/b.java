package hij;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import fij.m;
import fij.p;
import ip0.xc;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nij.h f152608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nij.c f152609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ynj.e f152610c;
    public final cej.b d;

    public b(nij.h planItemBuilder, nij.c highestPointsOptionMapper, ynj.e commonUiBuilder, cej.b mobilePlansFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(planItemBuilder, "planItemBuilder");
        Intrinsics.checkNotNullParameter(highestPointsOptionMapper, "highestPointsOptionMapper");
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f152608a = planItemBuilder;
        this.f152609b = highestPointsOptionMapper;
        this.f152610c = commonUiBuilder;
        this.d = mobilePlansFeatureAvailabilityInteractor;
    }

    public static EsimDataPlan c(EsimGetPlanScreenContract$DomainState esimGetPlanScreenContract$DomainState, m mVar) {
        p pVarC = esimGetPlanScreenContract$DomainState.c(mVar);
        if (pVarC == null) {
            pVarC = esimGetPlanScreenContract$DomainState.c(m.ALL);
        }
        if (pVarC != null) {
            return pVarC.f135452b;
        }
        return null;
    }

    public final List a(EsimGetPlanScreenContract$DomainState domainState, List dataPlans) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(dataPlans, "dataPlans");
        m mVar = m.COUNTRY;
        Intrinsics.checkNotNullParameter(dataPlans, "<this>");
        List list = dataPlans;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((EsimDataPlan) obj2).f100221p instanceof EsimCoverage.Country) {
                arrayList.add(obj2);
            }
        }
        xc xcVarB = b(mVar, arrayList, domainState);
        m mVar2 = m.REGIONAL;
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("<this>", dataPlans);
        for (Object obj3 : list) {
            if (((EsimDataPlan) obj3).f100221p instanceof EsimCoverage.Regional) {
                arrayListY.add(obj3);
            }
        }
        xc xcVarB2 = b(mVar2, arrayListY, domainState);
        m mVar3 = m.GLOBAL;
        ArrayList arrayListY2 = com.google.android.gms.internal.mlkit_vision_face.a.y("<this>", dataPlans);
        for (Object obj4 : list) {
            if (((EsimDataPlan) obj4).f100221p instanceof EsimCoverage.Global) {
                arrayListY2.add(obj4);
            }
        }
        xc[] elements = {xcVarB, xcVarB2, b(mVar3, arrayListY2, domainState)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ip0.xc b(fij.m r43, java.util.ArrayList r44, com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState r45) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hij.b.b(fij.m, java.util.ArrayList, com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState):ip0.xc");
    }
}
