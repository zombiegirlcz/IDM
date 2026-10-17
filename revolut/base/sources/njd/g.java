package njd;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shops.impl.R$string;
import ip0.bk0;
import ip0.ck0;
import ip0.qe0;
import ip0.we0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        we0 we0Var = new we0("SHOPS_ADS_NOTIFICATIONS_SIMPLE_MEDIA_LIST_ID", new qe0(88, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D153", null, null, null, 30)));
        yp0.b.r(we0Var, R$attr.uikit_dp24, 0, 0, 0, 14);
        TextDelegate.Model model = new TextDelegate.Model("SHOPS_ADS_NOTIFICATIONS_TITLE_LIST_ID", new TextLocalisedClause(R$string.lifestyle_ads_prompts_email_and_push_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new bk0(0), null, null, 0, R$attr.uikit_dp8, 0, 0, 1780);
        TextDelegate.Model model2 = new TextDelegate.Model("SHOPS_ADS_NOTIFICATIONS_SUBTITLE_LIST_ID", new TextLocalisedClause(R$string.lifestyle_ads_prompts_email_and_push_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, 0, 0, 0, 0, 2036);
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("SHOPS_ADS_NOTIFICATIONS_ACCEPT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.lifestyle_ads_prompts_cta_accept_title, null, null, 14), false, "SHOPS_ADS_NOTIFICATIONS_ACCEPT_BUTTON", null, null, null, 936);
        yp0.b.r(model3, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, 12);
        LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("SHOPS_ADS_NOTIFICATIONS_REJECT_BUTTON", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(R$string.lifestyle_ads_prompts_cta_decline_title, null, null, 14), false, "SHOPS_ADS_NOTIFICATIONS_REJECT_BUTTON", null, null, null, 936);
        yp0.b.r(model4, 0, R$attr.uikit_dp24, 0, 0, 13);
        return new d(v.k(we0Var, model, model2, model3, model4));
    }
}
