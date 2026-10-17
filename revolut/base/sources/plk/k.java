package plk;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.plan_metal_short_name, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.prompt_travel_insurance_removal_offer_title, v.k(textLocalisedClause, new TextLocalisedClause(R$string.plan_premium_short_name, null, null, 14)), null, 12);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.prompt_travel_insurance_removal_offer_subtitle, u.c(textLocalisedClause), null, 12);
        PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent backgroundMediaContent = new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(new CdnImage("metal_premium_price_prompt_image", "mobile/premium/promotions", null, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), null, null, Constants.TAG_F4));
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.prompt_travel_insurance_removal_offer_action_see_plan_benefits, u.c(textLocalisedClause), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.prompt_travel_insurance_removal_offer_action_no_thanks, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        return new g(u.c(new PromptMarketingContentDelegate.Model("UPGRADE_TO_METAL_PROMPT", textLocalisedClause2, textLocalisedClause3, backgroundMediaContent, PromptMarketingContentDelegate.Model.BackgroundType.Dialog.f53101a, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, button2, null, null, null, null, null, null, null, null, null, null, 2095520)));
    }
}
