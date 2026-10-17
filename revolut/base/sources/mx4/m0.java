package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.l3;
import ip0.yt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 {
    public static List a(l3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120664a;
        j8 j8Var = new j8(item.d.T1(), yt.TOP);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_list_cell_title, zhm.u.c(item.f120665b), null, 12);
        String str2 = item.f120666c;
        return zhm.u.c(new ListCellDelegate.Model(str, j8Var, textLocalisedClause, str2 != null ? new TextLocalisedClause(R$string.credit_application_constructor_list_cell_description, prk.o.v(0, 30, null, null, str2), null, 12) : null, false, null, new AnalyticsContext(zw4.a.a(item.f120664a)), 0, 0, 0, 0, 3936));
    }
}
