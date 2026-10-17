package k8b;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import iel.r;
import iel.t;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        r event = (r) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_merger_title, u.c(!instruments.isEmpty() ? new CompositeClause(j8b.k.j(event.e, instruments), null, null, null, 14) : new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (TextLocalisedClause) null, new InstrumentImage(event.d, 30, null, null), new WhiteCircleBadge(dw0.a.Merge), 18);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        int i;
        CellDetailsDelegate.Model model;
        r event = (r) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", event.f160811a), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, j8b.k.h(event, instruments), null, null, 0, null, false, false, null, null, 32696);
        List list = event.e;
        String str = event.f160811a;
        if (!j8b.k.a(list, instruments) || instruments.size() <= 1) {
            i = 14;
            model = null;
        } else {
            i = 14;
            model = new CellDetailsDelegate.Model(a0.d.r(str, "_stocks_merging"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_event_type_merger_detail_key, null, null, 14), (Image) null, 0, false, 30), new CompositeClause(j8b.k.j(list, instruments), null, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        CellDetailsDelegate.Model[] elements = {model2, model, j8b.k.a(list, instruments) ? new CellDetailsDelegate.Model(a0.d.r(str, "_details"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_event_type_merger_details_key, null, null, i), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.wealth_trading_corporate_events_merger_details_amount, v.k(new CompositeClause(j8b.k.i(list, instruments, new k7c.d(11)), null, null, null, 14), new CompositeClause(j8b.k.i(list, instruments, new k7c.d(12)), null, null, null, 14)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null, new CellDetailsDelegate.Model(a0.d.r(str, "_date"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_event_type_merger_effective_date_key, null, null, i), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, event.f160812b, LocalDateClause$DateFormat.DateLong.f57804a), null, null, null, null, 0, null, false, false, null, null, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((r) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        TextLocalisedClause textLocalisedClause;
        r event = (r) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        List list = event.e;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.f(((t) obj2).f160815b, event.d)) {
                arrayList.add(obj2);
            }
        }
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_merger_title_after_event, v.k(new TextClause(event.f160813c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CompositeClause(j8b.k.j(arrayList, instruments), null, null, null, 14)), null, 12) : new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_merger_title_before_event, v.k(new TextClause(event.f160813c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CompositeClause(j8b.k.j(arrayList, instruments), null, null, null, 14)), null, 12);
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_merger_description_after_event, v.k(new TextClause(event.f160813c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CompositeClause(j8b.k.i(list, instruments, new k7c.d(13)), null, null, null, 14), new CompositeClause(j8b.k.i(list, instruments, new k7c.d(14)), null, null, null, 14)), null, 12);
        } else {
            int i = R$string.wealth_trading_banner_corporate_events_merger_description_before_event;
            TextClause textClause = new TextClause(event.f160813c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDate = event.f160812b;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i, v.k(textClause, com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b), new CompositeClause(j8b.k.i(list, instruments, new k7c.d(15)), null, null, null, 14), new CompositeClause(j8b.k.i(list, instruments, new k7c.d(16)), null, null, null, 14)), null, 12);
        }
        BannerDelegate.Model model = new BannerDelegate.Model(j6.a.q("CORPORATE_EVENT_BANNER_LIST_ID_", event.f160811a), j8b.k.b(R$drawable.uikit_icn_24_merge_branch, R$attr.uikit_colorLightBlue), textLocalisedClause2, textLocalisedClause, false, z, j8b.k.h(event, instruments), null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
