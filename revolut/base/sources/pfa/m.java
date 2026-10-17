package pfa;

import com.revolut.feature.credit.api.navigation.EmptyStateFeatureConfig;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.retail.core.navigation.CompositeCommand;
import ft3.a1;
import ft3.v0;
import grl.r2;

/* JADX INFO: loaded from: classes5.dex */
public final class m {
    public final CompositeCommand a() {
        gt3.c cVar = gt3.c.PREMIUM;
        it3.k kVar = null;
        int i = 2;
        return com.revolut.retail.core.navigation.a.c(gc0.c.f(new EmptyStateFeatureConfig(new ft3.g(cVar, kVar, i))), gc0.c.f(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.RETAIL_ONBOARDING, null, null, v0.f137882a, null, 22), new ft3.g(cVar, kVar, i), null, null, null, yp3.f.SKIP_ALL, yp3.c.FORCE_SKIP, null, yp3.b.SKIP, null, 1692)));
    }
}
