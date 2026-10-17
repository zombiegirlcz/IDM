package k8b;

import aw0.c7;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
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
import d9.e1;
import iel.w;
import iel.y;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements a {
    @Override // k8b.a
    public final m8b.e a(iel.a aVar, String assetName, List instruments, Data data) {
        y event = (y) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new m8b.e(new TextLocalisedClause(R$string.feature_corporate_events_bubble_stock_split_title, u.c(new TextClause(assetName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.feature_corporate_events_bubble_stock_split_description, null, null, 14), new InstrumentImage(event.d, 30, null, null), new WhiteCircleBadge(dw0.a.ArrowSplit), 16);
    }

    @Override // k8b.a
    public final List b(iel.a aVar, BigDecimal userOwnership, boolean z, List instruments) {
        Clause textClause;
        Iterable iterableK;
        w wVar;
        int i;
        y event = (y) aVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(userOwnership, "userOwnership");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model(j6.a.q("CORPORATE_EVENT_DESCRIPTION_ID__", event.f160826a), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_type, null, null, 14), (Image) null, 0, false, 30), j8b.k.f(event, z), null, j8b.k.h(event, instruments), null, null, 0, null, false, false, null, null, 32696);
        String str = event.f160826a;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model(a0.d.r(str, "_payment_date"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_payment_date, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.j.b(c7.Companion, event.f, LocalDateClause$DateFormat.DateLong.f57804a), null, null, null, null, 0, null, false, false, null, null, 32760);
        String strR = a0.d.r(str, "_amount");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_amount, null, null, 14), (Image) null, 0, false, 30);
        TextLocalisedClause textLocalisedClauseA = j8b.i.a(event);
        if (textLocalisedClauseA == null) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = textLocalisedClauseA;
        }
        List listK = v.k(model, model2, new CellDetailsDelegate.Model(strR, t0Var, textClause, null, null, null, null, 0, null, false, false, null, null, 32760));
        if (!e1.D(userOwnership) || (i = (wVar = event.f160829g).f160821a) <= 0) {
            iterableK = f0.f322471a;
        } else {
            BigDecimal bigDecimalDivide = new BigDecimal(wVar.f160822b).divide(new BigDecimal(i), MathContext.DECIMAL128);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            BigDecimal bigDecimalMultiply = userOwnership.multiply(bigDecimalDivide);
            CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model(a0.d.r(str, "_before"), new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_previously_owned, null, null, 14), (Image) null, 0, false, 30), new AssetClause(userOwnership, new AssetClauseType.Stock(0), event.f160828c, null, null, 24), null, null, null, null, 0, null, false, false, null, null, 32760);
            String strR2 = a0.d.r(str, "_after");
            t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.feature_corporate_events_bubble_now_owned, null, null, 14), (Image) null, 0, false, 30);
            Intrinsics.h(bigDecimalMultiply);
            iterableK = v.k(model3, new CellDetailsDelegate.Model(strR2, t0Var2, new AssetClause(bigDecimalMultiply, new AssetClauseType.Stock(0), event.f160828c, null, null, 24), null, null, null, null, 0, null, false, false, null, null, 32760));
        }
        return d0.E0(iterableK, listK);
    }

    @Override // k8b.a
    public final /* bridge */ qv0.i c(iel.a aVar) {
        super.c((y) aVar);
        return null;
    }

    @Override // k8b.a
    public final qv0.i d(iel.a aVar, boolean z, LocalDate currentDate, ArrayList instruments) {
        TextLocalisedClause textLocalisedClause;
        y event = (y) aVar;
        LocalDate localDate = event.f160827b;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_trading_banner_corporate_events_stock_split_title, u.c(new TextClause(event.f160828c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        w wVar = event.f160829g;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(wVar.f160821a < wVar.f160822b ? R$string.feature_corporate_events_stock_split_forward_name : R$string.feature_corporate_events_stock_split_reverse_name, null, null, 14);
        if (z) {
            int i = R$string.wealth_trading_banner_corporate_events_stock_split_description_after_event;
            com.revolut.core.ui_kit.models.j jVar = c7.Companion;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i, v.k(com.revolut.core.ui_kit.models.j.b(jVar, localDate, LocalDateClause$DateFormat.Companion.f57815b), new TextClause(event.f160828c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause3), null, 12);
        } else {
            int i2 = R$string.wealth_trading_banner_corporate_events_stock_split_description_before_event;
            com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
            LocalDateClause$DateFormat.INSTANCE.getClass();
            textLocalisedClause = new TextLocalisedClause(i2, v.k(com.revolut.core.ui_kit.models.j.b(jVar2, localDate, LocalDateClause$DateFormat.Companion.f57815b), new TextClause(event.f160828c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause3), null, 12);
        }
        BannerDelegate.Model model = new BannerDelegate.Model(j6.a.q("CORPORATE_EVENT_BANNER_LIST_ID_", event.f160826a), j8b.k.b(R$drawable.uikit_icn_24_arrow_split, R$attr.uikit_colorCyan), textLocalisedClause2, textLocalisedClause, false, z, j8b.k.h(event, instruments), null, null, null, null, 65424);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
