package ct6;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements jr6.r {
    public final PromptMarketingScreen b(int i, boolean z) {
        PromptMarketingScreenContract$InputData promptMarketingScreenContract$InputData;
        if (z) {
            promptMarketingScreenContract$InputData = new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.freelancer_onboarding_pending_application_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_onboarding_pending_application_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", null, null, null, 30), null, null, new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368);
        } else {
            promptMarketingScreenContract$InputData = new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.freelancer_onboarding_pending_verification_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_onboarding_pending_verification_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D028", null, null, null, 30), null, null, new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368);
        }
        return new PromptMarketingScreen(promptMarketingScreenContract$InputData);
    }
}
