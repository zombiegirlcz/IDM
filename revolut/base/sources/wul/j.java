package wul;

import aw0.ka;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.trading.orders.R$string;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f300238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f300239b;

    public j(o tradingOrderMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f300238a = tradingOrderMapper;
        this.f300239b = dateProvider;
    }

    public final TextLocalisedClause a(LocalDate localDate, sel.a aVar) {
        boolean zF = Intrinsics.f(localDate, ((l80.f) this.f300239b).e());
        o oVar = this.f300238a;
        return zF ? new TextLocalisedClause(R$string.trading_orders_recurring_buy_frequency_settings_title_today, u.c(oVar.k(aVar)), null, 12) : new TextLocalisedClause(R$string.trading_orders_recurring_buy_frequency_settings_title_other, v.k(oVar.k(aVar), new TimeClause(oc.c.F(localDate), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12);
    }

    public final qv0.i b(LocalDate startDate, sel.a period, boolean z) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(period, "period");
        return z ? new CellDetailsActionDelegate.Model("SET_SCHEDULE_SETTINGS_ITEM", new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_repeat, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), a(startDate, period), null, false, false, null, null, null, 0, 0, 0, 0, 4192228) : new CellDetailsDelegate.Model("SET_SCHEDULE_SETTINGS_ITEM", new t0((Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_orders_repeat, null, null, 14), (Image) null, 0, false, 30), a(startDate, period), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
