package cr8;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.junior_transfer.impl.R$string;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import gc0.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final WrapperFlowImpl a(String walletId, boolean z) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        return c.b(new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.junior_transfer_topup_suggestion_prompt_title, null, null, 14), new TextLocalisedClause(R$string.junior_transfer_topup_suggestion_prompt_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D271", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.junior_transfer_topup_suggestion_prompt_action_make_transfer, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.junior_transfer_topup_suggestion_prompt_action_not_now, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) LargeActionButton.ButtonStyle.f58726b, false, (String) null, 54), null, null, null, null, null, 65112)), new b(walletId, z));
    }
}
