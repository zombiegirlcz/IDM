package ojd;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.tracking.v3.AdsSourceContext;
import ip0.bk0;
import ip0.ck0;
import ip0.qe0;
import ip0.we0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsAdsPersonalizedOffersOptInScreenContract$InputData f225765a;

    public i(ShopsAdsPersonalizedOffersOptInScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f225765a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        we0 we0Var = new we0("SHOPS_ADS_PERSONALIZED_OFFERS_SIMPLE_MEDIA_LIST_ID", new qe0(88, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D153", null, null, null, 30)));
        yp0.b.r(we0Var, R$attr.uikit_dp24, 0, 0, 0, 14);
        TextDelegate.Model model = new TextDelegate.Model("SHOPS_ADS_PERSONALIZED_OFFERS_TITLE_LIST_ID", new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new bk0(0), null, null, 0, R$attr.uikit_dp8, 0, 0, 1780);
        TextDelegate.Model model2 = new TextDelegate.Model("SHOPS_ADS_PERSONALIZED_OFFERS_SUBTITLE_LIST_ID", new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_subtitle_with_link, u.c(new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "ID_PROMOTION_STATUS_THIRD_PARTY_LEARN_MORE", false), 10)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_cta_accept_title, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        AdsSourceContext.a aVarNewBuilder = AdsSourceContext.newBuilder();
        String str = this.f225765a.f87240a;
        aVarNewBuilder.c();
        ((AdsSourceContext) aVarNewBuilder.f49761b).setSource(str);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("SHOPS_ADS_PERSONALIZED_OFFERS_ACCEPT_BUTTON", defaultFilledButton, null, textLocalisedClause, false, "SHOPS_ADS_PERSONALIZED_OFFERS_ACCEPT_BUTTON", null, null, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)), 424);
        yp0.b.r(model3, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, 12);
        LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("SHOPS_ADS_PERSONALIZED_OFFERS_REJECT_BUTTON", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.lifestyle_ads_prompts_personalised_offers_cta_decline_title, null, null, 14), false, "SHOPS_ADS_PERSONALIZED_OFFERS_REJECT_BUTTON", null, null, null, 936);
        yp0.b.r(model4, 0, R$attr.uikit_dp24, 0, 0, 13);
        return new d(v.k(we0Var, model, model2, model3, model4));
    }
}
