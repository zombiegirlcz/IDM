package e68;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior.account_activation.impl.R$string;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static final WrapperFlowImpl a() {
        return gc0.c.b(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.youth_company_mismatch_prompt_title, null, null, 14), new TextLocalisedClause(R$string.youth_company_mismatch_prompt_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D194", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.youth_company_mismatch_prompt_action, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368)), new c());
    }
}
