package bw3;

import android.content.Context;
import com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig$RecommendedValuators$NavigationDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import hha.i;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CreditApplicationFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        Object next;
        CreditApplicationFeatureConfig config = (CreditApplicationFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CreditApplicationFeatureConfig.StartApplication) {
            CreditApplicationFeatureConfig.StartApplication startApplication = (CreditApplicationFeatureConfig.StartApplication) config;
            navigator.c(vhi.c.c(new CreditApplicationKompotFeatureConfig.StartApplication(startApplication.f66203a, startApplication.f66204b, startApplication.k, startApplication.f66205c, startApplication.d, startApplication.e, startApplication.f, startApplication.f66206g, startApplication.f66207h, startApplication.i, startApplication.f66208j, startApplication.f66209l).f98274b, yhi.b.SOLID, null, false, 12));
            return;
        }
        if (config instanceof CreditApplicationFeatureConfig.CancelApplication) {
            CreditApplicationFeatureConfig.CancelApplication cancelApplication = (CreditApplicationFeatureConfig.CancelApplication) config;
            navigator.c(vhi.c.c(new CreditApplicationKompotFeatureConfig.CancelApplication(cancelApplication.f66197a, cancelApplication.f66198b, cancelApplication.f66199c, cancelApplication.d).f98274b, yhi.b.SOLID, null, false, 12));
            return;
        }
        if (!(config instanceof CreditApplicationFeatureConfig.CreditPostRetailOnboarding)) {
            if (config instanceof CreditApplicationFeatureConfig.RecommendedValuators) {
                navigator.c(vhi.c.c(CreditApplicationKompotFeatureConfig$RecommendedValuators$NavigationDestination.f66799a, yhi.b.SOLID, null, false, 12));
                return;
            } else {
                if (!(config instanceof CreditApplicationFeatureConfig.CreditPostActivationWaiting)) {
                    throw new NoWhenBranchMatchedException();
                }
                navigator.c(vhi.c.c(CreditApplicationKompotFeatureConfig$CreditPostActivationWaiting$NavigationDestination.f66614a, yhi.b.SOLID, null, false, 12));
                return;
            }
        }
        dt3.d dVar = ((CreditApplicationFeatureConfig.CreditPostRetailOnboarding) config).f66201a;
        String str = dVar.f117357a;
        Iterator<E> it8 = i.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((i) next).name(), dVar.f117358b)) {
                    break;
                }
            }
        }
        i iVar = (i) next;
        if (iVar == null) {
            iVar = i.MONTHLY;
        }
        navigator.c(vhi.c.c(new CreditApplicationKompotFeatureConfig$CreditCardPostOnboarding$NavigationDestination(new IntendedPricingPlan(iVar, str, dVar.f117359c), dVar.d), yhi.b.SOLID, null, false, 12));
    }

    @Override // nte.a
    public final List e() {
        return CreditApplicationApi$Toggles.a();
    }
}
