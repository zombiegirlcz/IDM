package t58;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.junior.account_activation.api.JuniorAccountActivationApi$Toggles$JuniorActivationDeeplinkRefactoring;
import com.revolut.feature.junior.account_activation.api.JuniorAccountActivationApi$Toggles$JuniorAsyncClaimProcessing;
import com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig;
import com.revolut.feature.junior.account_activation.impl.R$string;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlow;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData;
import com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlow;
import com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink.AccountActivationDeeplinkFlowContract$InputData;
import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreen;
import com.revolut.feature.junior.account_activation.impl.ui.screen.terms_conditions.TermsAndConditionsDetailsScreenContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oyk.d;
import s58.b;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a, p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f268047a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f268047a = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof b)) {
            return null;
        }
        b bVar = (b) descriptor;
        return bVar.a(new TermsAndConditionsDetailsScreen(new TermsAndConditionsDetailsScreenContract$InputData(bVar.f260050a)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(JuniorAccountActivationApi$Toggles$JuniorAsyncClaimProcessing.f76617c, JuniorAccountActivationApi$Toggles$JuniorActivationDeeplinkRefactoring.f76616c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorAccountActivationFeatureConfig.RequestNavigationDestination) {
            JuniorAccountActivationFeatureConfig.RequestNavigationDestination requestNavigationDestination = (JuniorAccountActivationFeatureConfig.RequestNavigationDestination) destination;
            return new AccountActivationFlow(new AccountActivationFlowContract$InputData(requestNavigationDestination.f76629a, requestNavigationDestination.f76630b, requestNavigationDestination.f76631c));
        }
        if (destination instanceof JuniorAccountActivationFeatureConfig.AccountApprovedAlreadyDestination) {
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(R$string.junior_signup_prompt_already_approved_title, null, null, 14), new TextLocalisedClause(R$string.junior_signup_prompt_already_approved_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D145", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, false, null, null, null, false, 16759756));
            d block = new d(fullScreenPromptScreen, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            fullScreenPromptScreen.H = block;
            return fullScreenPromptScreen;
        }
        if (destination instanceof JuniorAccountActivationFeatureConfig.CountryMismatchDestination) {
            return e68.b.a();
        }
        if (destination instanceof JuniorAccountActivationFeatureConfig.CompanyMismatchDestination) {
            return e68.a.a();
        }
        if (destination instanceof JuniorAccountActivationFeatureConfig.ClaimDestination) {
            return new AccountActivationDeeplinkFlow(new AccountActivationDeeplinkFlowContract$InputData(((JuniorAccountActivationFeatureConfig.ClaimDestination) destination).f76620a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f268047a;
    }
}
