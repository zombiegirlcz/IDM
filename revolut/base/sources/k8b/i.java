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
import iel.v;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        v event = (v) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_spin_off_title, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (TextLocalisedClause) null, new InstrumentImage(event.d, 30, null, null), new WhiteCircleBadge(dw0.a.ArrowExchange), 18);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        int i;
        CellDetailsDelegate.Model model;
        v event = (v) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", event.f160818a), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, j8b.k.h(event, instruments), null, null, 0, null, false, false, null, null, 32696);
        List list = event.e;
        String str = event.f160818a;
        if (j8b.k.a(list, instruments)) {
            i = 14;
            model = new CellDetailsDelegate.Model(a0.d.r(str, "_details"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_event_type_spin_off_details_key, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.feature_corporate_events_event_type_spin_off_details_value, zhm.v.k(new CompositeClause(j8b.k.i(list, instruments, new k7c.d(17)), null, null, null, 14), new CompositeClause(j8b.k.i(list, instruments, new k7c.d(18)), null, null, null, 14)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        } else {
            i = 14;
            model = null;
        }
        CellDetailsDelegate.Model[] elements = {model2, model, new CellDetailsDelegate.Model(a0.d.r(str, "_date"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_event_type_spin_off_date_key, null, null, i), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, event.f160819b, LocalDateClause$DateFormat.DateLong.f57804a), null, null, null, null, 0, null, false, false, null, null, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((v) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        TextLocalisedClause textLocalisedClause;
        v event = (v) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        int i = R$string.feature_corporate_events_bubble_spin_off_title;
        String str = event.f160820c;
        List list = event.e;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_spin_off_description_after_event, u.c(new TextLocalisedClause(R$string.feature_corporate_events_event_type_spin_off_details_value, zhm.v.k(new CompositeClause(j8b.k.i(list, instruments, new k7c.d(19)), null, null, null, 14), new CompositeClause(j8b.k.i(list, instruments, new k7c.d(20)), null, null, null, 14)), null, 12)), null, 12);
        } else {
            int i2 = R$string.wealth_trading_banner_corporate_events_spin_off_description_before_event;
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDate localDate = event.f160819b;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i2, zhm.v.k(com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b), new TextClause(event.f160820c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        BannerDelegate.Model model = new BannerDelegate.Model(j6.a.q("CORPORATE_EVENT_BANNER_LIST_ID_", event.f160818a), j8b.k.b(R$drawable.uikit_icn_24_arrow_exchange, R$attr.uikit_colorYellow), textLocalisedClause2, textLocalisedClause, false, z, j8b.k.h(event, instruments), null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
