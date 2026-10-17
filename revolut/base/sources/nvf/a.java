package nvf;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static CompositeClause a(PurchasedTransitTicket ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        TextClause[] elements = {new TextClause(ticket.getF92687j(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), !ticket.getF92685g().isEmpty() ? new TextClause(d0.k0(ticket.getF92685g(), ", ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
    }

    public static TextClause b(List tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        if (tags.isEmpty()) {
            return null;
        }
        List list = tags;
        m70.a.a(t0.f186434a);
        return new TextClause(d0.k0(list, " · ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextLocalisedClause c(com.revolut.feature.transport.models.transit.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status instanceof com.revolut.feature.transport.models.transit.a) {
            return new TextLocalisedClause(R$string.transport_hub_tab_tickets_section_purchased_action, null, null, 14);
        }
        if (status instanceof com.revolut.feature.transport.models.transit.c) {
            return new TextLocalisedClause(R$string.transport_hub_tab_tickets_section_purchased_action_scan, null, null, 14);
        }
        if (status instanceof com.revolut.feature.transport.models.transit.b) {
            return new TextLocalisedClause(R$string.transport_hub_tab_tickets_section_purchased_action, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static TextLocalisedClause d(com.revolut.feature.transport.models.transit.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (status instanceof com.revolut.feature.transport.models.transit.a) {
            return null;
        }
        if (status instanceof com.revolut.feature.transport.models.transit.c) {
            return new TextLocalisedClause(R$string.transport_hub_tab_tickets_section_purchased_description_scan, u.c(new TimeClause(((com.revolut.feature.transport.models.transit.c) status).f92736a.toMillis(), new TimeClause.Format.Duration(0), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 8);
        }
        if (status instanceof com.revolut.feature.transport.models.transit.b) {
            return new TextLocalisedClause(R$string.transport_hub_tab_tickets_section_purchased_description_locked, u.c(new TimeClause(((com.revolut.feature.transport.models.transit.b) status).f92735a.toMillis(), new TimeClause.Format.Duration(0), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorStatusWarning), false, null, false, null, 254), 8);
        }
        throw new NoWhenBranchMatchedException();
    }
}
