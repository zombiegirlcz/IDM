package hd4;

import av3.c;
import av3.d;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final PromptMarketingScreenContract$InputData a(d dVar, CreditApplicationPluginFlowContract$Configuration pluginConfig) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(pluginConfig, "pluginConfig");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.linked_accounts_v2_intro_title, u.c(dVar.f9890a), null, 12);
        int i = R$string.linked_accounts_v2_intro_description;
        String str = dVar.f9891b;
        if (str == null) {
            str = "";
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(str), null, 12);
        UrlImage urlImage = new UrlImage(dVar.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        c cVar = dVar.f9894h;
        TextLocalisedClause textLocalisedClause3 = cVar != null ? new TextLocalisedClause(R$string.linked_accounts_v2_intro_info_popup_label, u.c(new TextClause(cVar.f9887a, (Style) new Click(30, (Integer) null, (Object) null, "INTRO_LINK_CLICK_ID", false), (Integer) null, false, (o9) null, (List) null, 124)), null, 12) : null;
        String str2 = dVar.f9892c;
        TextLocalisedClause textLocalisedClause4 = str2 != null ? new TextLocalisedClause(R$string.linked_accounts_v2_intro_footer, u.c(str2), null, 12) : null;
        PromptMarketingContentDelegate.Model.Button button = new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.linked_accounts_v2_intro_button, u.c(dVar.e), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62);
        String str3 = dVar.f;
        return iy4.a.d(textLocalisedClause, textLocalisedClause2, urlImage, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new AnalyticsContext(v7.m(pluginConfig, AnalyticsContext.INSTANCE)), null, button, str3 != null ? new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(R$string.linked_accounts_v2_intro_secondary_button, u.c(str3), null, 12), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62) : null, textLocalisedClause4, textLocalisedClause3, 1248);
    }
}
