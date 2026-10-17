package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.credit.core.R$string;
import dx4.d5;
import dx4.e5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.t5;
import mx0.u5;

/* JADX INFO: loaded from: classes22.dex */
public final class g1 {
    public static List a(e5 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120585a;
        d5 d5Var = item.d;
        String str2 = item.f120586b;
        return zhm.u.c(new PlainTextDelegate.Model(str, (Clause) (str2 != null ? new TextLocalisedClause(R$string.credit_application_constructor_text_item_title, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null), (Clause) new TextLocalisedClause(R$string.credit_application_constructor_text_item_text, zhm.u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, item.f120587c)), null, 12), d5Var != null ? new u5(0, new TextLocalisedClause(R$string.credit_application_constructor_text_item_button, zhm.u.c(new TextClause(d5Var.f120577a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12)) : t5.e, (UrlImage) null, false, str2 == null ? pa.LIGHT : pa.NORMAL, (Object) (d5Var != null ? d5Var.f120578b : null), new AnalyticsContext(zw4.a.a(item.f120585a)), 0, 0, 0, 0, 61898));
    }
}
