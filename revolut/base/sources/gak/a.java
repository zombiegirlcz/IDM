package gak;

import android.content.Context;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.pda.api.navigation.PdaFeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lak.f;
import sri.m;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PdaFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        PdaFeatureConfig config = (PdaFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof PdaFeatureConfig.SetUpPda) {
            f.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(lak.a.f193412b, null, null, null, 0, null, null, null, null, false, 1022));
        } else {
            if (!(config instanceof PdaFeatureConfig.SetUpPdaWithResult)) {
                throw new NoWhenBranchMatchedException();
            }
            f.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(lak.a.f193412b, null, null, Integer.valueOf(((PdaFeatureConfig.SetUpPdaWithResult) config).f102376a), 0, null, null, null, null, false, 1014));
        }
    }
}
