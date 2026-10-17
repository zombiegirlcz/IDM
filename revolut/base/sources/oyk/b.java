package oyk;

import android.content.Context;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.trading_onboarding.api.navigation.ImmediateFamilyMemberFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.immediatefamilymember.ImmediateFamilyMemberScreenContract$Configuration;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ImmediateFamilyMemberFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ImmediateFamilyMemberFeatureConfig config = (ImmediateFamilyMemberFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        kzk.d.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(kzk.b.f191127b, new ImmediateFamilyMemberScreenContract$Configuration("TRADING_IMMEDIATE_FAMILY_MEMBER_FLOW"), null, null, 0, null, null, null, null, false, 1020));
    }
}
