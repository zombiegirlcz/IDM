package com.revolut.feature.onboarding.impl.qes_terms;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsAcknowledgementSection;
import com.revolut.feature.onboarding.api.esignature.models.QesTermsConfiguration;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsAuthenticationMethod;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFeatureConfig;
import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsStep;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.kompot.FeatureFlowStep;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends ohi.b implements nte.a {
    @Override // ohi.b
    public final com.revolut.kompot.navigable.a a(FeatureFlowStep featureFlowStep, dki.g flowModel) {
        QesTermsStep step = (QesTermsStep) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.qes_terms_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.qes_terms_subtitle, null, null, 14);
        int i = R$string.qes_terms_disclaimers_infocert_consents;
        List listK = v.k(new TextLocalisedClause(R$string.qes_terms_disclaimers_accuracy_and_conditions_acknoledgement, null, null, 14), new TextLocalisedClause(R$string.qes_terms_disclaimers_non_withdrawal_acknoledgement, null, null, 14), new TextLocalisedClause(R$string.qes_terms_disclaimers_read_acknowledgement, null, null, 14));
        TermsScope.INSTANCE.getClass();
        return new QesTermsFlow(new QesTermsFlowInputData(new QesTermsConfiguration(textLocalisedClause, textLocalisedClause2, i, listK, (QesTermsAuthenticationMethod) new QesTermsAuthenticationMethod.Otp(0), false, u.c(TermsScope.Companion.c()), (List) null, u.c(TermsScope.Companion.a()), (Set) null, new TextLocalisedClause(R$string.qes_terms_accept, null, null, 14), (TextLocalisedClause) null, new TextLocalisedClause(R$string.qes_terms_passcode_disclaimers_title, null, null, 14), (QesTermsAcknowledgementSection) null, 22176), y89.d.NONE, 94));
    }

    @Override // ohi.b
    public final nhi.c c(aii.u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof QesTermsFeatureConfig.QesTermsDestination) {
            return new nhi.c(QesTermsStep.Terms.f78552a);
        }
        return null;
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }
}
