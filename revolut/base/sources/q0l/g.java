package q0l;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        PromptMarketingContentDelegate.Model model;
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = h.f241306a[domainState.f241301a.ordinal()];
        if (i == 1) {
            model = new PromptMarketingContentDelegate.Model("PROMPT", new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_chose_partner_again_prompt_title, null, null, 14), new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_chose_partner_again_prompt_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D087", null, null, null, 30)), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_chose_partner_again_prompt_primary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, null, null, null, null, null, 2096560);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            model = new PromptMarketingContentDelegate.Model("PROMPT", new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_partner_declined_application_prompt_title, null, null, 14), new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_partner_declined_application_prompt_description, null, null, 14), new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D076", null, null, null, 30)), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_partner_declined_application_prompt_primary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.trading_onboarding_spouse_consent_partner_declined_application_prompt_secondary_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.o, false, (String) null, 54), null, null, null, null, null, null, null, null, null, null, 2095536);
        }
        return new d(u.c(model));
    }
}
