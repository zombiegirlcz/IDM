package myk;

import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$TradingFatcaSkipIntro;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$TradingOnboardingBackendFlowKompotWrapper;
import com.revolut.retail.feature.trading_onboarding.api.TradingOnboardingRevampApi$Toggles$TradingOnboardingNationalIdentifiersKompotMigration;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.cfd_onboarding.CfdOnboardingDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.completed.CompletedContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.helper_next.NextContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityContract$KycDetailsNationalityDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.NationalIdentifiersContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.kompot.flow.NationalIdentifiersFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Configuration;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_backend_flow.TradingOnboardingBackendFlowContract$Destination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow.OnboardingWorkflowContract$OnboardingWorkflowDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.partner_consent_request.PartnerConsentRequestDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning.RiskWarningContract$Destination;
import gzk.c;
import h0l.f;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xzk.e;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f210553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dkf.a f210554b;

    public b(gte.a featureToggleInteractor, dkf.a tradingOnboardingBackendFlowControllerToggleProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingBackendFlowControllerToggleProvider, "tradingOnboardingBackendFlowControllerToggleProvider");
        this.f210553a = featureToggleInteractor;
        this.f210554b = tradingOnboardingBackendFlowControllerToggleProvider;
    }

    public static ActivityNavigateCommand b(OnboardingPart onboardingPart, TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig) {
        c.Companion.getClass();
        return new ActivityNavigateCommand(gzk.a.f148158b, new NextContract$Configuration(onboardingPart, tradingOnboardingFeatureConfig), null, null, 0, null, null, null, null, false, 1020);
    }

    public final NaviCommand a(TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig, OnboardingPart onboardingPart, String str) {
        boolean zC = ((d) this.f210554b.f115504a).c(TradingOnboardingRevampApi$Toggles$TradingOnboardingBackendFlowKompotWrapper.f104069c);
        TradingOnboardingBackendFlowContract$Configuration.Regular regular = new TradingOnboardingBackendFlowContract$Configuration.Regular(tradingOnboardingFeatureConfig, onboardingPart, new BackendFlowContract$Configuration(22, tradingOnboardingFeatureConfig.getE(), str), zC);
        if (zC) {
            return u0.f(new TradingOnboardingBackendFlowContract$Destination(regular));
        }
        f.Companion.getClass();
        return new ActivityNavigateCommand(h0l.a.f148430b, regular, null, null, 0, null, null, null, null, false, 1020);
    }

    public final NaviCommand c(OnboardingPart onboardingPart, TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig) {
        if (Intrinsics.f(onboardingPart, OnboardingPart.RiskDisclosure.f104085a)) {
            return u0.f(new RiskWarningContract$Destination(tradingOnboardingFeatureConfig, b(onboardingPart, tradingOnboardingFeatureConfig)));
        }
        boolean z = false;
        if (Intrinsics.f(onboardingPart, OnboardingPart.KycDetails.f104077a)) {
            return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new KycDetailsNationalityContract$KycDetailsNationalityDestination(tradingOnboardingFeatureConfig, false), false, (Integer) null, 0, 61));
        }
        boolean zF = Intrinsics.f(onboardingPart, OnboardingPart.KycDocuments.f104079a);
        gte.a aVar = this.f210553a;
        if (zF) {
            if (((d) aVar).c(TradingOnboardingRevampApi$Toggles$TradingOnboardingNationalIdentifiersKompotMigration.f104070c)) {
                return u0.f(new NationalIdentifiersFlowContract$Destination(tradingOnboardingFeatureConfig, b(onboardingPart, tradingOnboardingFeatureConfig)));
            }
            e.Companion.getClass();
            return new ActivityNavigateCommand(xzk.a.f310040b, new NationalIdentifiersContract$Configuration(tradingOnboardingFeatureConfig), null, null, 0, null, null, null, null, false, 1020);
        }
        if (Intrinsics.f(onboardingPart, OnboardingPart.KycDocumentation.f104078a)) {
            return new FeatureCommand(new KycFeatureConfig.InitKyc(b(onboardingPart, tradingOnboardingFeatureConfig), z, 29));
        }
        if (Intrinsics.f(onboardingPart, OnboardingPart.KycNationalities.f104080a)) {
            return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new KycDetailsNationalityContract$KycDetailsNationalityDestination(tradingOnboardingFeatureConfig, true), false, (Integer) null, 0, 61));
        }
        OnboardingPart.RiskDisclosureSigned riskDisclosureSigned = OnboardingPart.RiskDisclosureSigned.f104086a;
        if (Intrinsics.f(onboardingPart, riskDisclosureSigned)) {
            return a(tradingOnboardingFeatureConfig, riskDisclosureSigned, "TRADING_ONBOARDING_RISK_DISCLOSURE_SIGNED_FLOW");
        }
        OnboardingPart.Survey survey = OnboardingPart.Survey.f104090a;
        if (Intrinsics.f(onboardingPart, survey)) {
            return a(tradingOnboardingFeatureConfig, survey, "TRADING_ONBOARDING_SURVEY_FLOW");
        }
        OnboardingPart.RoboRiskSurvey roboRiskSurvey = OnboardingPart.RoboRiskSurvey.f104087a;
        if (Intrinsics.f(onboardingPart, roboRiskSurvey)) {
            return a(tradingOnboardingFeatureConfig, roboRiskSurvey, "TRADING_ONBOARDING_ROBO_RISK_SURVEY_FLOW");
        }
        OnboardingPart.RoboSurvey roboSurvey = OnboardingPart.RoboSurvey.f104088a;
        if (Intrinsics.f(onboardingPart, roboSurvey)) {
            return a(tradingOnboardingFeatureConfig, roboSurvey, "TRADING_ONBOARDING_ROBO_SURVEY_FLOW");
        }
        OnboardingPart.PeriodicReview periodicReview = OnboardingPart.PeriodicReview.f104084a;
        if (Intrinsics.f(onboardingPart, periodicReview)) {
            return a(tradingOnboardingFeatureConfig, periodicReview, "TRADING_ONBOARDING_SURVEY_FLOW");
        }
        OnboardingPart.Acknowledgements acknowledgements = OnboardingPart.Acknowledgements.f104071a;
        if (Intrinsics.f(onboardingPart, acknowledgements)) {
            return a(tradingOnboardingFeatureConfig, acknowledgements, "TRADING_ONBOARDING_ACKNOWLEDGEMENTS_FLOW");
        }
        OnboardingPart.W8BEN w8ben = OnboardingPart.W8BEN.f104091a;
        if (Intrinsics.f(onboardingPart, w8ben)) {
            return a(tradingOnboardingFeatureConfig, w8ben, "TRADING_ONBOARDING_W8BEN_FLOW");
        }
        OnboardingPart.ComplexBondsCooldown complexBondsCooldown = OnboardingPart.ComplexBondsCooldown.f104073a;
        if (Intrinsics.f(onboardingPart, complexBondsCooldown)) {
            return a(tradingOnboardingFeatureConfig, complexBondsCooldown, "TRADING_ONBOARDING_COMPLEX_BONDS_COOLDOWN_FLOW");
        }
        OnboardingPart.ComplexBondsSurvey complexBondsSurvey = OnboardingPart.ComplexBondsSurvey.f104074a;
        if (Intrinsics.f(onboardingPart, complexBondsSurvey)) {
            return a(tradingOnboardingFeatureConfig, complexBondsSurvey, "TRADING_ONBOARDING_COMPLEX_BONDS_SURVEY_FLOW");
        }
        if (Intrinsics.f(onboardingPart, OnboardingPart.SpousalConsent.f104089a)) {
            return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new PartnerConsentRequestDestination(tradingOnboardingFeatureConfig, b(onboardingPart, tradingOnboardingFeatureConfig)), false, (Integer) null, 0, 61));
        }
        if (Intrinsics.f(onboardingPart, OnboardingPart.FATCA.f104076a)) {
            return new FeatureCommand(new TaxResidencyFeatureConfig.TaxResidencyTrading(b(onboardingPart, tradingOnboardingFeatureConfig), tradingOnboardingFeatureConfig.getE(), ((d) aVar).c(TradingOnboardingRevampApi$Toggles$TradingFatcaSkipIntro.f104068c)));
        }
        if (onboardingPart instanceof OnboardingPart.Workflow) {
            return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new OnboardingWorkflowContract$OnboardingWorkflowDestination(tradingOnboardingFeatureConfig, ((OnboardingPart.Workflow) onboardingPart).f104092a, b(onboardingPart, tradingOnboardingFeatureConfig)), false, (Integer) null, 0, 61));
        }
        if (Intrinsics.f(onboardingPart, OnboardingPart.Completed.f104072a)) {
            syk.d.Companion.getClass();
            return new ActivityNavigateCommand(syk.a.f266684b, new CompletedContract$Configuration(tradingOnboardingFeatureConfig), null, null, 0, null, null, null, null, false, 1020);
        }
        OnboardingPart.MarginSurvey marginSurvey = OnboardingPart.MarginSurvey.f104081a;
        if (Intrinsics.f(onboardingPart, marginSurvey)) {
            return a(tradingOnboardingFeatureConfig, marginSurvey, "TRADING_ONBOARDING_MARGIN_SURVEY_FLOW");
        }
        if (Intrinsics.f(onboardingPart, OnboardingPart.MarginSurveyWithPrompt.f104082a)) {
            return vhi.c.c(new CfdOnboardingDestination(tradingOnboardingFeatureConfig.getE(), b(onboardingPart, tradingOnboardingFeatureConfig)), yhi.b.SOLID, null, false, 12);
        }
        OnboardingPart.OTP otp = OnboardingPart.OTP.f104083a;
        if (Intrinsics.f(onboardingPart, otp)) {
            return a(tradingOnboardingFeatureConfig, otp, "TRADING_ONBOARDING_OTP_FLOW");
        }
        OnboardingPart.ComplexEtpSurvey complexEtpSurvey = OnboardingPart.ComplexEtpSurvey.f104075a;
        if (Intrinsics.f(onboardingPart, complexEtpSurvey)) {
            return a(tradingOnboardingFeatureConfig, complexEtpSurvey, "TRADING_ONBOARDING_COMPLEX_ETP_SURVEY_FLOW");
        }
        throw new NoWhenBranchMatchedException();
    }
}
