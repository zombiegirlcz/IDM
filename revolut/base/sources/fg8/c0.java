package fg8;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    @NotNull
    private static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f134911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd8.x f134912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te8.z f134913c;
    public final gte.a d;

    public c0(sri.m navigator, kd8.x juniorConsentRequestInteractor, te8.z juniorProductsInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorConsentRequestInteractor, "juniorConsentRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f134911a = navigator;
        this.f134912b = juniorConsentRequestInteractor;
        this.f134913c = juniorProductsInteractor;
        this.d = featureToggleInteractor;
    }

    public static FeatureCommand a(FeatureCommand featureCommand) {
        return gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), null, featureCommand, 2)));
    }
}
