package ydc;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.shared.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements y6c.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static TextLocalisedClause a() {
        int i = R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_link_commodities_terms;
        Intrinsics.checkNotNullParameter("https://www.revolut.com/legal/precious-metals/", "url");
        return new TextLocalisedClause(i, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) new x6c.a("https://www.revolut.com/legal/precious-metals/"), "COMMODITIES_TERMS_CLAUSE", false), 10);
    }

    public static TextLocalisedClause b(String url2) {
        int i = R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_link_cryptocurrency_terms;
        Intrinsics.checkNotNullParameter(url2, "url");
        return new TextLocalisedClause(i, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) new x6c.a(url2), "CRYPTO_TERMS_CLAUSE", false), 10);
    }

    public static TextLocalisedClause c(String url2) {
        int i = R$string.revolut_pay_order_summary_payment_breakdown_disclaimer_link_personal_terms;
        Intrinsics.checkNotNullParameter(url2, "url");
        return new TextLocalisedClause(i, null, new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) new x6c.a(url2), "PERSONAL_TERMS_CLAUSE", false), 10);
    }
}
