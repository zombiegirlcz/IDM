package nvf;

import aw0.o9;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.vg;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.models.transit.TransitTicket;
import com.revolut.feature.transport.models.transit.TransitTicketEligibility;
import ip0.nf0;
import ip0.of0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static hg a(int i) {
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList.add(new nf0(a0.d.n("LOADING_CARD_ID_", it8.nextInt()), of0.ACCENT));
        }
        SmallCardDelegate.INSTANCE.getClass();
        return new hg("LOADING_BOX_ID", arrayList, 2, new y4(SmallCardDelegate.f53351j), null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28608);
    }

    public static SmallStockCardDelegate.Model b(TransitTicket ticket) {
        TextClause textClause;
        List list;
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        String str = ticket.f92706a;
        TextClause textClause2 = new TextClause(ticket.f92707b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        vg vgVar = new vg(ruf.d.a(ticket.f92708c));
        List list2 = ticket.e;
        List list3 = ticket.f;
        TextClause textClause3 = !list2.isEmpty() ? new TextClause(d0.k0(list2, ", ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(ticket.d.f92720a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause4 = null;
        if (list3.isEmpty()) {
            textClause = null;
        } else {
            m70.a.a(t0.f186434a);
            textClause = new TextClause(d0.k0(list3, " · ", null, null, 0, null, 62), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        TextClause[] elements = {textClause3, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        MoneyClause moneyClause = new MoneyClause(ticket.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        TransitTicketEligibility transitTicketEligibility = ticket.f92716q;
        if (transitTicketEligibility != null && (list = transitTicketEligibility.f92724b) != null) {
            textClause4 = new TextClause(d0.k0(list, ", ", null, null, 0, null, 62), (Style) null, Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, (o9) null, (List) null, 122);
        }
        SmallStockCardDelegate.Model model = new SmallStockCardDelegate.Model(str, vgVar, textClause2, new SmallStockCardDelegate.b.a(compositeClause, null, new SmallStockCardDelegate.Model.a(moneyClause, textClause4), null, 10), ticket, null, null, null, null, 8160);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
