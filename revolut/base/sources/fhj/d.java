package fhj;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(EsimAutoRenewalTerms esimAutoRenewalTerms, boolean z) {
        CellDetailsSwitcherDelegate.Model model = new CellDetailsSwitcherDelegate.Model("ID_AUTO_RENEWAL_TOGGLE_ITEM", new TextLocalisedClause(R$string.esim_checkout_autorenewal_title, null, null, 14), z, true, 0, null, null, null, 4080);
        Object textLocalisedClause = esimAutoRenewalTerms != null ? new TextLocalisedClause(R$string.esim_checkout_autorenewal_links_learn_more, null, new Click(28, (Integer) null, (Object) esimAutoRenewalTerms, "ID_AUTO_RENEWAL_LEARN_MORE_CLAUSE", false), 10) : null;
        int i = R$string.esim_checkout_autorenewal_subtitle;
        if (textLocalisedClause == null) {
            textLocalisedClause = "";
        }
        return v.k(model, new PlainTextDelegate.Model("ID_AUTO_RENEWAL_DESCRIPTION_ITEM", (UrlImage) null, (Clause) null, new TextLocalisedClause(i, u.c(textLocalisedClause), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 30568));
    }
}
