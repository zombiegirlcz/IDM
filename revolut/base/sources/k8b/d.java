package k8b;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
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
import d9.e1;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        iel.d event = (iel.d) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_cash_dividend_title, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.feature_corporate_events_bubble_dividends_description, null, null, 14), new InstrumentImage(event.d, 30, null, null), new WhiteCircleBadge(dw0.a.Fees), 16);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        iel.d event = (iel.d) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        String str = event.f160775a;
        dj0.d dVar = event.f;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", str), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, j8b.k.h(event, instruments), null, null, 0, null, false, false, null, null, 32696);
        String str2 = event.f160775a;
        String strR = a0.d.r(str2, "_payment_date");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_payment_date, null, null, 14), (Image) null, 0, false, 30);
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDate = event.f160776b;
        LocalDateClause$DateFormat.DateLong dateLong = LocalDateClause$DateFormat.DateLong.f57804a;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model(strR, t0Var, com.revolut.core.ui_kit.models.j.b(jVar, localDate, dateLong), null, null, null, null, 0, null, false, false, null, null, 32760);
        LocalDate localDate2 = event.e;
        CellDetailsDelegate.Model[] elements = {model, model2, localDate2 != null ? new CellDetailsDelegate.Model(a0.d.r(str2, "_ex_dividend_date"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_ex_dividend_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.a(localDate2, dateLong, null), null, null, null, null, 0, null, false, false, null, null, 32760) : null, new CellDetailsDelegate.Model(a0.d.r(str2, "_amount"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_amount, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.feature_corporate_events_bubble_amount_value, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), (e1.D(userOwnership) ? userOwnership : null) != null ? new CellDetailsDelegate.Model(a0.d.r(str2, "_you_get"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_you_get, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(pyd.c.V(dVar, userOwnership), new MoneyClause.Format.Asset(0), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((iel.d) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        iel.d event = (iel.d) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        LocalDate localDate = event.e;
        boolean z3 = localDate != null ? currentDate.isBefore(localDate) || z : z;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_cash_dividend_title, u.c(new TextClause(event.f160777c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        int i = z ? R$string.wealth_trading_banner_corporate_events_dividend_description_after_event : R$string.wealth_trading_banner_corporate_events_dividend_description_before_event;
        MoneyClause moneyClause = new MoneyClause(event.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        TextClause textClause = new TextClause(event.f160777c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        if (localDate == null) {
            localDate = event.f160776b;
        }
        LocalDateClause$DateFormat.INSTANCE.getClass();
        BannerDelegate.Model model = new BannerDelegate.Model(j6.a.q("CORPORATE_EVENT_BANNER_LIST_ID_", event.f160775a), j8b.k.b(R$drawable.uikit_icn_24_fees, z ? R$attr.uikit_colorLightGreen : R$attr.uikit_colorLime), textLocalisedClause, new TextLocalisedClause(i, v.k(moneyClause, textClause, com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b)), null, 12), false, z3, j8b.k.h(event, instruments), null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
