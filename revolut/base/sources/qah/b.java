package qah;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import i9h.p;
import i9h.s;
import i9h.u;
import i9h.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof MostTradedAssetsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        v vVar;
        u uVar;
        Parcelable cfd2;
        MostTradedAssetsFeatureConfig config = (MostTradedAssetsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        s.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = p.f159872b;
        int i = a.f244034a[config.getF95208a().ordinal()];
        if (i == 1) {
            vVar = v.ONE_DAY;
        } else if (i == 2) {
            vVar = v.ONE_WEEK;
        } else if (i == 3) {
            vVar = v.ONE_MONTH;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vVar = v.ONE_YEAR;
        }
        int i2 = a.f244035b[config.getF95209b().ordinal()];
        if (i2 == 1) {
            uVar = u.MOST_TRADED;
        } else if (i2 == 2) {
            uVar = u.MOST_BOUGHT;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            uVar = u.MOST_SOLD;
        }
        if (config instanceof MostTradedAssetsFeatureConfig.Crypto) {
            cfd2 = new MostTradedAssetsScreenContract$Configuration.Crypto(vVar, uVar, true, ((MostTradedAssetsFeatureConfig.Crypto) config).f95207c);
        } else if (config instanceof MostTradedAssetsFeatureConfig.Trading) {
            cfd2 = new MostTradedAssetsScreenContract$Configuration.Stock(vVar, uVar, false);
        } else {
            if (!(config instanceof MostTradedAssetsFeatureConfig.Cfd)) {
                throw new NoWhenBranchMatchedException();
            }
            cfd2 = new MostTradedAssetsScreenContract$Configuration.Cfd(vVar, uVar, false);
        }
        navigator.c(new ActivityNavigateCommand(explicitActivityDestination, cfd2, null, null, 0, null, null, null, null, false, 1020));
    }
}
