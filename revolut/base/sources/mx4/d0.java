package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.a2;
import dx4.y1;
import ip0.ak0;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d0 {
    public static List a(a2 item) {
        int i;
        com.fasterxml.jackson.core.m ck0Var;
        Intrinsics.checkNotNullParameter(item, "item");
        y1 y1Var = item.d;
        int i2 = y1Var == null ? -1 : c0.f210169a[y1Var.ordinal()];
        if (i2 == -1) {
            i = R$attr.uikit_dp16;
        } else {
            if (i2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_dp32;
        }
        int i3 = i;
        String str = item.f120543a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_footer_text, zhm.u.c(new HtmlClause(0, 14, (Integer) null, item, item.f120544b)), null, 12);
        int i5 = c0.f210170b[item.f120545c.ordinal()];
        if (i5 == 1) {
            ck0Var = new ck0(yj0.CENTER_HORIZONTAL);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ck0Var = new ak0(null, null, 3);
        }
        return zhm.u.c(new TextDelegate.Model(str, textLocalisedClause, false, ck0Var, null, new AnalyticsContext(zw4.a.a(item.f120543a)), 0, 0, i3, i3, 436));
    }
}
