package vvf;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.ef;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List list = domainState.f292532a;
        String str = domainState.f292533b;
        List<PurchasedTransitTicket.ToBeActivated> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (PurchasedTransitTicket.ToBeActivated toBeActivated : list2) {
            String str2 = toBeActivated.f92682a;
            arrayList.add(new SelectableDelegate.Model(str2, new RowDelegate.Model(j6.a.q("INNER_ITEM_", toBeActivated.f92682a), new RowDelegate.Model.MainImage.Image40(ruf.d.a(toBeActivated.e), null, null, false, null, false, 60), new TextClause(toBeActivated.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, nvf.a.a(toBeActivated), nvf.a.b(toBeActivated.f92686h), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870808), Intrinsics.f(str2, str) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, toBeActivated, null, false, 32488));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList);
        RowDelegate.Model model = new RowDelegate.Model("BUY_NEW_TICKET_LIST_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_voucher, null, null, 6), null, null, false, null, false, 60), new TextLocalisedClause(R$string.transport_ticket_extend_buy_new_ticket_action, null, null, 14), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, ef.ACTIONABLE, null, null, null, 0, 0, 0, 0, 535820280);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        return new h(u.a(eVarB), !(str == null || str.length() == 0));
    }
}
