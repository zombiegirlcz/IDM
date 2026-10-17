package iv8;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.external.ExternalKycPromptConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static PromptMarketingScreenContract$InputData a(ExternalKycPromptConfiguration promptConfiguration) {
        Intrinsics.checkNotNullParameter(promptConfiguration, "promptConfiguration");
        return new PromptMarketingScreenContract$InputData(promptConfiguration.f77646a, promptConfiguration.f77647b, com.revolut.core.ui_kit_core.displayers.image.models.b.c(promptConfiguration.f77648c, null, null, null, 30), null, null, null, null, promptConfiguration.d ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.kyc_vendors_common_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.kyc_vendors_common_action_try_again, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, 65112);
    }
}
