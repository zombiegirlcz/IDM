package na6;

import android.content.Context;
import com.revolut.feature.donations.api.navigation.DonationsFeatureConfig;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof DonationsFeatureConfig;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        DonationsFeatureConfig config = (DonationsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof DonationsFeatureConfig.CharityDonationConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        DonationsFeatureConfig.CharityDonationConfig charityDonationConfig = (DonationsFeatureConfig.CharityDonationConfig) config;
        navigator.c(u0.f(new DonationsKompotFeatureConfig.OneTimeDonationDestination(charityDonationConfig.f71971b, charityDonationConfig.f71972c, charityDonationConfig.f71970a, charityDonationConfig.d)));
    }
}
