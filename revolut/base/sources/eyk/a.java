package eyk;

import a0.d;
import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.RemediationType;
import fyk.c;
import fyk.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final OnboardingPart a(f fVar) {
        String str;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str2 = fVar.f139029a;
        c cVar = fVar.f139030b;
        if (Intrinsics.f(str2, "RISK_DISCLOSURE_SIGNED")) {
            return OnboardingPart.RiskDisclosureSigned.f104086a;
        }
        if (Intrinsics.f(str2, "COMPLEX_BONDS_COOLDOWN")) {
            return OnboardingPart.ComplexBondsCooldown.f104073a;
        }
        if (Intrinsics.f(str2, "COMPLEX_BONDS_SURVEY")) {
            return OnboardingPart.ComplexBondsSurvey.f104074a;
        }
        if (Intrinsics.f(str2, "RISK_DISCLOSURE")) {
            return OnboardingPart.RiskDisclosure.f104085a;
        }
        if (Intrinsics.f(str2, "KYC_DETAILS")) {
            return OnboardingPart.KycDetails.f104077a;
        }
        if (Intrinsics.f(str2, "KYC_NATIONALITIES")) {
            return OnboardingPart.KycNationalities.f104080a;
        }
        if (Intrinsics.f(str2, "KYC_DOCUMENTS")) {
            return OnboardingPart.KycDocuments.f104079a;
        }
        if (Intrinsics.f(str2, "KYC_DOCUMENTATION")) {
            return OnboardingPart.KycDocumentation.f104078a;
        }
        if (Intrinsics.f(str2, "SURVEY")) {
            return OnboardingPart.Survey.f104090a;
        }
        if (Intrinsics.f(str2, "ROBO_RISK_SURVEY")) {
            return OnboardingPart.RoboRiskSurvey.f104087a;
        }
        if (Intrinsics.f(str2, "ROBO_SURVEY")) {
            return OnboardingPart.RoboSurvey.f104088a;
        }
        if (Intrinsics.f(str2, "PERIODIC_REVIEW")) {
            return OnboardingPart.PeriodicReview.f104084a;
        }
        if (Intrinsics.f(str2, "FATCA")) {
            return OnboardingPart.FATCA.f104076a;
        }
        if (Intrinsics.f(str2, "ACKNOWLEDGEMENTS")) {
            return OnboardingPart.Acknowledgements.f104071a;
        }
        if (Intrinsics.f(str2, "W8BEN")) {
            return OnboardingPart.W8BEN.f104091a;
        }
        if (Intrinsics.f(str2, "SPOUSAL_CONSENT")) {
            return OnboardingPart.SpousalConsent.f104089a;
        }
        if (Intrinsics.f(str2, "WORKFLOW")) {
            if (cVar == null || (str = cVar.f139024a) == null) {
                throw new IllegalArgumentException("Onboarding part workflow but ID is missing");
            }
            return new OnboardingPart.Workflow(str);
        }
        if (Intrinsics.f(str2, "COMPLETED")) {
            return OnboardingPart.Completed.f104072a;
        }
        if (Intrinsics.f(str2, "MARGIN_SURVEY")) {
            return OnboardingPart.MarginSurvey.f104081a;
        }
        if (Intrinsics.f(str2, "MARGIN_DISCLAIMER_PROMPT")) {
            return OnboardingPart.MarginSurveyWithPrompt.f104082a;
        }
        if (Intrinsics.f(str2, "OTP")) {
            return OnboardingPart.OTP.f104083a;
        }
        if (Intrinsics.f(str2, "COMPLEX_ETP_SURVEY")) {
            return OnboardingPart.ComplexEtpSurvey.f104075a;
        }
        throw new IllegalArgumentException(d.s("Unknown onboarding part mapping value: next=", fVar.f139029a, ", workflowId=", cVar != null ? cVar.f139024a : null));
    }

    public static final String b(OnboardingPart onboardingPart) {
        Intrinsics.checkNotNullParameter(onboardingPart, "<this>");
        return onboardingPart.getName();
    }

    public static final String c(RemediationType remediationType) {
        Intrinsics.checkNotNullParameter(remediationType, "<this>");
        if (remediationType instanceof RemediationType.Generic) {
            return ((RemediationType.Generic) remediationType).f104102a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
