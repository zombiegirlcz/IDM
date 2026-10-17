package ik5;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.crypto.remittance.impl.R$string;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FinishCommand;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements uj5.b {
    public final ActivityNavigateCommand a() {
        return os2.b.a(os2.e.Companion, new TextLocalisedClause(R$string.crypto_restrictions_withdraw_title, null, null, 14), new TextLocalisedClause(R$string.crypto_restrictions_withdraw_subtitle, null, null, 14), new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new TextLocalisedClause(R$string.crypto_restrictions_button, null, null, 14), null, new FinishCommand(null, null, null, 7), null, 1048408);
    }

    public final PromptMarketingScreenContract$InputData b() {
        return new PromptMarketingScreenContract$InputData(new TextLocalisedClause(R$string.crypto_restrictions_withdraw_title, null, null, 14), new TextLocalisedClause(R$string.crypto_restrictions_withdraw_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), null, null, null, null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.crypto_restrictions_button, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, AnalyticsProduct.Shared.Crypto.f, null, 61272);
    }
}
