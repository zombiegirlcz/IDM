package c1f;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements e {

    @NotNull
    public static final f Companion = new f();

    public g(sze.f navigationFactory, bze.b remittancePromotionDelegate, v60.e serverErrorsProvider, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory) {
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(remittancePromotionDelegate, "remittancePromotionDelegate");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullExpressionValue(d0.m(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)))), "just(...)");
    }
}
