package di5;

import aii.u;
import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.onboarding.api.CryptoOnboardingApi$Toggles;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoOnboardingErrorSheetDestination;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoWorkflowOnboardingDestination;
import com.revolut.feature.crypto.onboarding.impl.R$string;
import com.revolut.feature.crypto.onboarding.impl.ui.eligibility.CryptoOnboardingWorkflowFlow;
import com.revolut.feature.crypto.onboarding.impl.ui.fca.screen.learn.CryptoFcaLearnScreen;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof zh5.a)) {
            return null;
        }
        zh5.a aVar = (zh5.a) descriptor;
        return aVar.a(new CryptoFcaLearnScreen(aVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return CryptoOnboardingApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoFcaRisksDestination) {
            return new CryptoFcaLearnScreen(((CryptoFcaRisksDestination) destination).f70887a);
        }
        if (destination instanceof CryptoWorkflowOnboardingDestination) {
            return new CryptoOnboardingWorkflowFlow(new oi5.c(((CryptoWorkflowOnboardingDestination) destination).getF70889a()));
        }
        if (!(destination instanceof CryptoOnboardingErrorSheetDestination)) {
            return null;
        }
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.crypto_onboarding_not_available_title, null, null, 14), null, null, null, false, 30);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_action_ok, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_onboarding_not_available_description, null, null, 14);
        k9 value = k9.ProductUnspecified;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, new AnalyticsProduct.Retail(value), (AnalyticsContext) null, textLocalisedClause));
    }
}
