package bfb;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$LifestyleReverywhere;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereAirportTransfers;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereLocationSharing;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereLuggageStorage;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereOnboardingConfiguration;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereProductArticle;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereSafeAreaEnabled;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereShimmeringState;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereStations;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereTermsJSBridge;
import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import com.revolut.feature.retail.reverywhere.api.navigation.ReverywhereWebApp;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlow;
import com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreen;
import com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p, nte.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f14939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f14940b;

    public d(ImmutableSet deeplinkGateways, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f14939a = deeplinkGateways;
        this.f14940b = featureToggleInteractor;
    }

    @Override // nte.a
    public final List e() {
        return v.k(ReverywhereApi$Toggles$LifestyleReverywhere.f82877c, ReverywhereApi$Toggles$ReverywhereAirportTransfers.f82878c, ReverywhereApi$Toggles$ReverywhereStations.f82885c, ReverywhereApi$Toggles$ReverywhereLuggageStorage.f82880c, ReverywhereApi$Toggles$ReverywhereShimmeringState.f82884c, ReverywhereApi$Toggles$ReverywhereProductArticle.f82882c, ReverywhereApi$Toggles$ReverywhereOnboardingConfiguration.f82881c, ReverywhereApi$Toggles$ReverywhereTermsJSBridge.f82886c, ReverywhereApi$Toggles$ReverywhereLocationSharing.f82879c, ReverywhereApi$Toggles$ReverywhereSafeAreaEnabled.f82883c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        ReverywhereWebAppScreenContract$InputData url2;
        ReverywhereOnboardingFlowContract$InputData url3;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof ReverywhereWebApp)) {
            return null;
        }
        ReverywhereWebApp reverywhereWebApp = (ReverywhereWebApp) destination;
        boolean z = reverywhereWebApp instanceof ReverywhereWebApp.AppConfiguration;
        gte.a aVar = this.f14940b;
        if (z) {
            ReverywhereWebApp.AppConfiguration appConfiguration = (ReverywhereWebApp.AppConfiguration) reverywhereWebApp;
            String prefixedAppName = appConfiguration.f82893b;
            if (!appConfiguration.d) {
                ReverywhereApi$Toggles$ReverywhereOnboardingConfiguration reverywhereApi$Toggles$ReverywhereOnboardingConfiguration = ReverywhereApi$Toggles$ReverywhereOnboardingConfiguration.f82881c;
                jte.d dVar = (jte.d) aVar;
                if (dVar.c(reverywhereApi$Toggles$ReverywhereOnboardingConfiguration) || (Intrinsics.f(d0.v0(prefixedAppName, "REVERYWHERE:", ""), "AIRPORT_TRANSFERS") && dVar.c(ReverywhereApi$Toggles$ReverywhereProductArticle.f82882c))) {
                    boolean zC = dVar.c(reverywhereApi$Toggles$ReverywhereOnboardingConfiguration);
                    boolean z3 = zC && dVar.c(ReverywhereApi$Toggles$ReverywhereTermsJSBridge.f82886c);
                    ReverywhereMiniAppName.INSTANCE.getClass();
                    Intrinsics.checkNotNullParameter(prefixedAppName, "prefixedAppName");
                    ReverywhereMiniAppName reverywhereMiniAppNameA = ReverywhereMiniAppName.Companion.a(d0.v0(prefixedAppName, "REVERYWHERE:", prefixedAppName));
                    boolean zC2 = dVar.c(ReverywhereApi$Toggles$ReverywhereSafeAreaEnabled.f82883c);
                    if (z) {
                        url3 = new ReverywhereOnboardingFlowContract$InputData.AppConfiguration(appConfiguration.f82892a, appConfiguration.f82893b, reverywhereMiniAppNameA, zC, z3, zC2, appConfiguration.f82894c, appConfiguration.e);
                    } else {
                        if (!(reverywhereWebApp instanceof ReverywhereWebApp.Url)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ReverywhereWebApp.Url url4 = (ReverywhereWebApp.Url) reverywhereWebApp;
                        url3 = new ReverywhereOnboardingFlowContract$InputData.Url(url4.f82895a, url4.f82896b, reverywhereMiniAppNameA, zC, z3, zC2);
                    }
                    return new ReverywhereOnboardingFlow(url3);
                }
            }
        }
        jte.d dVar2 = (jte.d) aVar;
        boolean z4 = dVar2.c(ReverywhereApi$Toggles$ReverywhereOnboardingConfiguration.f82881c) && dVar2.c(ReverywhereApi$Toggles$ReverywhereTermsJSBridge.f82886c);
        boolean zC3 = dVar2.c(ReverywhereApi$Toggles$ReverywhereSafeAreaEnabled.f82883c);
        if (z) {
            ReverywhereWebApp.AppConfiguration appConfiguration2 = (ReverywhereWebApp.AppConfiguration) reverywhereWebApp;
            url2 = new ReverywhereWebAppScreenContract$InputData.AppConfiguration(appConfiguration2.f82892a, appConfiguration2.f82893b, appConfiguration2.f82894c, z4, zC3);
        } else {
            if (!(reverywhereWebApp instanceof ReverywhereWebApp.Url)) {
                throw new NoWhenBranchMatchedException();
            }
            ReverywhereWebApp.Url url5 = (ReverywhereWebApp.Url) reverywhereWebApp;
            url2 = new ReverywhereWebAppScreenContract$InputData.Url(url5.f82895a, url5.f82896b, z4, zC3);
        }
        return new ReverywhereWebAppScreen(url2);
    }

    @Override // aii.p
    public final Set h() {
        return this.f14939a;
    }
}
