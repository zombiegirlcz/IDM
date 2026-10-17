package z3b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3b.c f319236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3b.f f319237b;

    public c(m3b.c expiryDateClauseMapper, m3b.f expiryDateTypeMapper) {
        Intrinsics.checkNotNullParameter(expiryDateClauseMapper, "expiryDateClauseMapper");
        Intrinsics.checkNotNullParameter(expiryDateTypeMapper, "expiryDateTypeMapper");
        this.f319236a = expiryDateClauseMapper;
        this.f319237b = expiryDateTypeMapper;
    }

    public final List a(ExpiryDate expiryDate, Object obj2) {
        Clause clauseA;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_review_expiry, null, null, 14);
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_pencil, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28);
        l3b.a type = expiryDate.f82206a;
        if (type == l3b.a.CUSTOM) {
            clauseA = ((m3b.e) this.f319236a).a(expiryDate);
        } else {
            ((m3b.h) this.f319237b).getClass();
            Intrinsics.checkNotNullParameter(type, "type");
            int i = m3b.g.f202320a[type.ordinal()];
            if (i == 1) {
                clauseA = m3b.h.a(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_expiry_dialog_days, f0.f322471a);
            } else if (i == 2) {
                clauseA = m3b.h.a(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_expiry_dialog_today, f0.f322471a);
            } else if (i == 3) {
                clauseA = m3b.h.a(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_expiry_dialog_months, f0.f322471a);
            } else if (i == 4) {
                clauseA = m3b.h.a(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_expiry_dialog_custom, u.c("3"));
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseA = m3b.h.a(com.revolut.feature.retail.cfd.impl.R$string.wealth_margin_cfd_expiry_dialog_never, f0.f322471a);
            }
        }
        return u.c(new CellDetailsActionDelegate.Model("EXPIRY_DATE_ID", textLocalisedClause, 0, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(imageClause, clauseA)), false, false, null, obj2, 0, 0, 32224));
    }
}
