package hij;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import dej.m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f152611a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f152611a = featureToggleInteractor;
    }

    public final boolean a(EsimDataPlan selectedPlan, List allPlans) {
        Intrinsics.checkNotNullParameter(selectedPlan, "selectedPlan");
        Intrinsics.checkNotNullParameter(allPlans, "allPlans");
        if (!((jte.d) this.f152611a).c(EsimApi$Toggles.EsimPurchaseScreenRedesign.f100181c) || !bfj.a.c(selectedPlan)) {
            return false;
        }
        Iterator it8 = allPlans.iterator();
        boolean z = false;
        boolean z3 = false;
        while (it8.hasNext()) {
            EsimDataPlan esimDataPlan = (EsimDataPlan) it8.next();
            if (esimDataPlan.f100214c == m.DATA_PLAN) {
                if (esimDataPlan.f100217j) {
                    z = true;
                } else {
                    z3 = true;
                }
                if (z && z3) {
                    return true;
                }
            }
        }
        return false;
    }
}
