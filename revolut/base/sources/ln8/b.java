package ln8;

import android.content.Context;
import android.os.Parcelable;
import aw0.db;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsFeatureConfig;
import com.revolut.feature.junior_settings.api.navigation.JuniorSettingsKompotFeatureConfig;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms2.g;
import sri.m;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f197131a;

    public b(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f197131a = uriHelper;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof JuniorSettingsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        JuniorSettingsFeatureConfig config = (JuniorSettingsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof JuniorSettingsFeatureConfig.ReferralCampaignAccess)) {
            throw new NoWhenBranchMatchedException();
        }
        JuniorSettingsFeatureConfig.ReferralCampaignAccess referralCampaignAccess = (JuniorSettingsFeatureConfig.ReferralCampaignAccess) config;
        FeatureCommand featureCommand = new FeatureCommand(new JuniorSettingsKompotFeatureConfig.SecurityAndPrivacy(referralCampaignAccess.f77255a));
        com.revolut.feature.blue_prompt.fullscreen.a aVar = g.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rev_u18_account_settings_rev_u18_referral_prompt_title, u.c(referralCampaignAccess.f77256b), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.rev_u18_account_settings_rev_u18_referral_prompt_subtitle, u.c(new MoneyClause(referralCampaignAccess.f77257c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, db.BODY2, false, null, Constants.TAG_SUPPORTED_LOCALE_LIST), 8);
        BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D022", null, null, null, 30));
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.rev_u18_account_settings_rev_u18_referral_prompt_action, null, null, 14);
        CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), featureCommand);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.rev_u18_account_settings_rev_u18_referral_prompt_terms_and_conditions_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        BrowserCommand browserCommand = new BrowserCommand(((f80.b) this.f197131a).f(referralCampaignAccess.d));
        FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
        k9 k9Var = k9.Junior;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        navigator.c(com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, textLocalisedClause4, textLocalisedClause3, null, compositeCommandC, null, browserCommand, null, finishCommand, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33225377));
    }
}
