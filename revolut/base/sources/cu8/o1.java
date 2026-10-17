package cu8;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFeatureConfig;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowInputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f108881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q89.e f108882b;

    public o1(e1 kycAutomaticEventsConfigurationProvider, q89.e onboardingInteractor) {
        Intrinsics.checkNotNullParameter(kycAutomaticEventsConfigurationProvider, "kycAutomaticEventsConfigurationProvider");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        this.f108881a = kycAutomaticEventsConfigurationProvider;
        this.f108882b = onboardingInteractor;
    }

    public final FeatureCommand a(wi0.b bVar, wi0.b bVar2, wi0.b bVar3, boolean z) {
        AnalyticsProduct.Retail retail = ((eu8.b) this.f108881a).f129532a;
        return new FeatureCommand(new SubmitCitizenshipFeatureConfig(new SubmitCitizenshipFlowInputData(true, z, bVar, bVar2, ((db9.d) this.f108882b).c() ? rbl.a.CLOSE : rbl.a.NONE, null, bVar3 != null ? bVar3.f297794a : null, new TextLocalisedClause(R$string.kyc_nationality_search_hint, null, null, 14), null, retail, 1104), 9008));
    }
}
