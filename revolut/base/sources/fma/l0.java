package fma;

import android.content.Context;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.feature.profile.api.ProfileApi$Toggles$EsimEntryPointInHeader;
import com.revolut.feature.profile.api.ProfileApi$Toggles$FincrimeTestingFlows;
import com.revolut.feature.profile.api.ProfileApi$Toggles$GenericPlanWidgetTextWithChevron;
import com.revolut.feature.profile.api.ProfileApi$Toggles$GenericPlanWidgetTextWithHighlight;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfileDetailsConfirmationBEDrivenUserDetails;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfileEmailMigration;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfileInsuranceDocumentsEntryPoint;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfilePlanWidgetV3Design;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RemoveHelpCenterFromProfile;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileScreen;
import com.revolut.feature.profile.api.ProfileApi$Toggles$RevampedProfileUltraWidget;
import com.revolut.feature.profile.api.ProfileApi$Toggles$StudentBenefitsUnderReferrals;
import com.revolut.feature.profile.api.ProfileAppApi$Toggles$RevolutXCloseAccountEntrypoint;
import com.revolut.feature.profile.api.ProfileAppApi$Toggles$RevolutXPublicExperimentsEntrypoint;
import com.revolut.feature.profile.api.ProfileAppApi$Toggles$RevolutXSimpleTrading;
import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import com.revolut.feature.profile.impl.ui.details.emailverification.EmailVerificationFlowContract$Configuration;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Root;
import com.revolut.feature.terms.api.navigation.TnCListDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l0 implements uri.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f136205a;

    public l0(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f136205a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ProfileFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        NaviCommand activityNavigateCommand;
        ProfileFeatureConfig config = (ProfileFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof ProfileFeatureConfig.EmailVerification) {
            yma.f.Companion.getClass();
            activityNavigateCommand = new ActivityNavigateCommand(yma.a.f314891b, new EmailVerificationFlowContract$Configuration(((ProfileFeatureConfig.EmailVerification) config).f81348a), null, null, 0, null, null, null, null, false, 1020);
        } else {
            boolean z = config instanceof ProfileFeatureConfig.Documents;
            gte.a aVar = this.f136205a;
            if (z) {
                activityNavigateCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, ((jte.d) aVar).c(StatementsApi$FeatureToggles.DocumentsHub.f88209c) ? DocumentsHubDestination$Root.f88253a : new KompotProfileFeatureConfig.DocumentsDestination(0), false, (Integer) null, 0, 61));
            } else if (config instanceof ProfileFeatureConfig.Terms) {
                activityNavigateCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) TnCListDestination.f90391a, false, (Integer) null, 0, 61));
            } else {
                if (!(config instanceof ProfileFeatureConfig.DetailsConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((jte.d) aVar).c(ProfileApi$Toggles$ProfileDetailsConfirmationBEDrivenUserDetails.f81316c)) {
                    activityNavigateCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) UserDetailsDestination.f26226a, false, (Integer) null, 0, 61));
                } else {
                    oma.f.Companion.getClass();
                    activityNavigateCommand = new ActivityNavigateCommand(oma.a.f226780b, null, null, null, 0, null, null, null, null, false, 1022);
                }
            }
        }
        navigator.c(activityNavigateCommand);
    }

    @Override // nte.a
    public final List e() {
        return zhm.d0.E0(zhm.v.k(ProfileAppApi$Toggles$RevolutXCloseAccountEntrypoint.f81324c, ProfileAppApi$Toggles$RevolutXPublicExperimentsEntrypoint.f81325c, ProfileAppApi$Toggles$RevolutXSimpleTrading.f81326c), zhm.v.k(ProfileApi$Toggles$ProfileEmailMigration.f81317c, ProfileApi$Toggles$FincrimeTestingFlows.f81313c, ProfileApi$Toggles$RevampedProfileScreen.f81321c, ProfileApi$Toggles$RevampedProfileUltraWidget.f81322c, ProfileApi$Toggles$GenericPlanWidgetTextWithChevron.f81314c, ProfileApi$Toggles$GenericPlanWidgetTextWithHighlight.f81315c, ProfileApi$Toggles$ProfileInsuranceDocumentsEntryPoint.f81318c, ProfileApi$Toggles$ProfilePlanWidgetV3Design.f81319c, ProfileApi$Toggles$EsimEntryPointInHeader.f81312c, ProfileApi$Toggles$ProfileDetailsConfirmationBEDrivenUserDetails.f81316c, ProfileApi$Toggles$RemoveHelpCenterFromProfile.f81320c, ProfileApi$Toggles$StudentBenefitsUnderReferrals.f81323c));
    }
}
