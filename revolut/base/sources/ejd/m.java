package ejd;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shops.api.navigation.AdsFullScreenPromptType;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.tracking.v3.AdsSourceContext;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements p {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsPromptScreenContract$InputData f126868a;

    public m(ShopsPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f126868a = inputData;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        PromptMarketingContentDelegate.Model model;
        e domainState = (e) iVar;
        String str = this.f126868a.f87178b;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CdnImage cdnImageB = com.revolut.core.ui_kit_core.displayers.image.models.b.b("3D042");
        AdsFullScreenPromptType adsFullScreenPromptType = domainState.f126856a;
        if (adsFullScreenPromptType instanceof AdsFullScreenPromptType.AdsPersonalizedOffers) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_title, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_subtitle_with_link, u.c(new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ID_PROMOTION_STATUS_THIRD_PARTY_LEARN_MORE", false), 10)), null, 12);
            PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent = new PromptMarketingContentDelegate.Model.Content.MediaContent(cdnImageB, null);
            PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_cta_accept_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "PRIMARY_PROMPT_BUTTON_LOADING_TAG", 30);
            PromptMarketingContentDelegate.Model.Button button2 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_cta_decline_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "SECONDARY_PROMPT_BUTTON_LOADING_TAG", 30);
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            AdsSourceContext.a aVarNewBuilder = AdsSourceContext.newBuilder();
            aVarNewBuilder.c();
            ((AdsSourceContext) aVarNewBuilder.f49761b).setSource(str);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            model = new PromptMarketingContentDelegate.Model("LIST_ID_ADS_CONSENT_MARKETING_PROMPT", textLocalisedClause, textLocalisedClause2, mediaContent, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button, button2, null, null, null, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), null, null, null, null, null, null, 2079152);
        } else {
            if (!Intrinsics.f(adsFullScreenPromptType, AdsFullScreenPromptType.AdsEmailAndPush.f87079a)) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.lifestyle_ads_prompts_email_and_push_title, null, null, 14);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.lifestyle_ads_prompts_email_and_push_subtitle, null, null, 14);
            PromptMarketingContentDelegate.Model.Content.MediaContent mediaContent2 = new PromptMarketingContentDelegate.Model.Content.MediaContent(cdnImageB, null);
            PromptMarketingContentDelegate.Model.Button button3 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.lifestyle_ads_prompts_cta_accept_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "PRIMARY_PROMPT_BUTTON_LOADING_TAG", 30);
            PromptMarketingContentDelegate.Model.Button button4 = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.lifestyle_ads_prompts_cta_decline_title, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, "SECONDARY_PROMPT_BUTTON_LOADING_TAG", 30);
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            AdsSourceContext.a aVarNewBuilder2 = AdsSourceContext.newBuilder();
            aVarNewBuilder2.c();
            ((AdsSourceContext) aVarNewBuilder2.f49761b).setSource(str);
            w0 w0VarA2 = aVarNewBuilder2.a();
            companion2.getClass();
            model = new PromptMarketingContentDelegate.Model("LIST_ID_ADS_CONSENT_MARKETING_PROMPT", textLocalisedClause3, textLocalisedClause4, mediaContent2, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, button3, button4, null, null, null, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA2)), null, null, null, null, null, null, 2079152);
        }
        return new g(u.c(model));
    }
}
