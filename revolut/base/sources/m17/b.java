package m17;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import jr6.t;
import k17.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import xr6.i;
import xr6.j;
import xr6.k;
import xr6.l;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f201250a;

    public b(t saleItemMapper) {
        Intrinsics.checkNotNullParameter(saleItemMapper, "saleItemMapper");
        this.f201250a = saleItemMapper;
    }

    public static TextLocalisedClause b(l lVar) {
        String str;
        if (!(lVar instanceof i)) {
            if (lVar instanceof j) {
                return new TextLocalisedClause(R$string.freelancer_sale_timeline_event_footer_customer_email_placeholder, u.c(((j) lVar).f308263a), null, 12);
            }
            if (lVar instanceof k) {
                return new TextLocalisedClause(R$string.freelancer_sale_timeline_event_footer_customer_full_name_placeholder, u.c(((k) lVar).f308264a), null, 12);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i = R$string.freelancer_sale_timeline_event_footer_customer_card_template;
        i iVar = (i) lVar;
        switch (a.f201249a[iVar.f308262b.ordinal()]) {
            case 1:
                str = "American Express";
                break;
            case 2:
                str = "Discover";
                break;
            case 3:
                str = "JCB";
                break;
            case 4:
                str = "Mastercard";
                break;
            case 5:
                str = "Private Label";
                break;
            case 6:
                str = "Visa";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = iVar.f308261a;
        if (str2 == null) {
            str2 = "";
        }
        return new TextLocalisedClause(i, v.k(textClause, str2), null, 12);
    }

    public final TextLocalisedClause a(FreelancerOrder freelancerOrder) {
        return new TextLocalisedClause(R$string.freelancer_sale_timeline_event_footer_template, v.k(((c) this.f201250a).c(freelancerOrder), new TextLocalisedClause(R$string.freelancer_sale_timeline_event_footer_amount_placeholder, u.c(new MoneyClause(freelancerOrder.f73294j, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }
}
