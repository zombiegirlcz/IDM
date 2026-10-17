package f4h;

import android.os.Parcelable;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import d9.t0;
import ip0.xk;
import java.math.BigDecimal;
import java.time.LocalDate;
import jel.b0;
import jel.e;
import jel.g;
import jel.h1;
import jel.m;
import jel.m1;
import jel.q;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import psk.j;
import psk.k;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132230a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f132231b;

    public /* synthetic */ b(n nVar) {
        this.f132231b = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Clause percentageClause;
        Clause textLocalisedClause;
        Clause timeClause;
        Clause timeClause2;
        CounterTextDelegate.Model model;
        CounterTextDelegate.Model model2;
        LocalDate localDate;
        Clause textLocalisedClause2;
        switch (this.f132230a) {
            case 0:
                InstrumentTicker instrumentTicker = (InstrumentTicker) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
                ej0.b bVar = instrumentTicker.f;
                return new MoneyClause(bVar != null ? t0.D(bVar, this.f132231b) : instrumentTicker.e, new MoneyClause.Format.Defaults(null, c.f132232a[instrumentTicker.d.ordinal()] != 1 ? ScaleMode.PrettyFormat.f51440a : null, false, false, 13), null, null, 12);
            default:
                jel.c detailsContent = (jel.c) obj2;
                ((Boolean) obj3).getClass();
                j.a aVar = j.Companion;
                Intrinsics.checkNotNullParameter(detailsContent, "detailsContent");
                if (!(detailsContent instanceof m)) {
                    if ((detailsContent instanceof h1) || (detailsContent instanceof q) || (detailsContent instanceof jel.n) || (detailsContent instanceof b0) || (detailsContent instanceof w2) || (detailsContent instanceof m1)) {
                        return f0.f322471a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                m mVar = (m) detailsContent;
                Clause timeClause3 = j.f239510a;
                jel.d dVar = mVar.i;
                e eVar = mVar.f;
                boolean z = dVar != null && dVar.f173427a;
                ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("ATTRS_WIDGET_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.trading_bonds_attributes_screen_title, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) this.f132231b, (Parcelable) null, 0, 0, 0, 0, 64426);
                int i = R$attr.uikit_dp0;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.trading_bonds_attributes_dictionary_coupon_current_coupon, null, null, 14);
                BigDecimal bigDecimal = eVar.f173436a;
                if (bigDecimal != null) {
                    ytk.c.Companion.getClass();
                    percentageClause = new PercentageClause(bigDecimal, ytk.c.f316835a, (Style) null, 4);
                } else {
                    percentageClause = timeClause3;
                }
                CounterTextDelegate.Model model4 = new CounterTextDelegate.Model("ATTRS_WIDGET_GRID_ITEM_CURRENT_COUPON", textLocalisedClause3, null, percentageClause, false, null, null, 0, 0, 0, 0, 2032);
                yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.trading_bonds_attributes_dictionary_coupon_coupon_type, null, null, 14);
                g gVar = eVar.f173437b;
                int i2 = gVar == null ? -1 : k.f239511a[gVar.ordinal()];
                if (i2 == -1) {
                    tuk.k.Companion.getClass();
                    textLocalisedClause = tuk.e.f274624b;
                } else if (i2 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.trading_bonds_coupon_coupon_type_fixed, null, null, 14);
                } else if (i2 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.trading_bonds_coupon_coupon_type_floating, null, null, 14);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(R$string.trading_bonds_coupon_coupon_type_step_up_step_down, null, null, 14);
                }
                CounterTextDelegate.Model model5 = new CounterTextDelegate.Model("ATTRS_WIDGET_GRID_ITEM_COUPON_TYPE", textLocalisedClause4, null, textLocalisedClause, false, null, null, 0, 0, 0, 0, 2032);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.trading_bonds_attributes_dictionary_coupon_next_coupon_date, null, null, 14);
                LocalDate localDate2 = eVar.f173438c;
                if (localDate2 != null) {
                    long jP = ebm.a.P(localDate2);
                    TimeClause.Format.INSTANCE.getClass();
                    timeClause = new TimeClause(jP, TimeClause.Format.f57959a, null, null, 12);
                } else {
                    timeClause = timeClause3;
                }
                CounterTextDelegate.Model model6 = new CounterTextDelegate.Model("ATTRS_WIDGET_GRID_ITEM_NEXT_COUPON_DATE", textLocalisedClause5, null, timeClause, false, null, null, 0, 0, 0, 0, 2032);
                yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(R$string.trading_bonds_attributes_dictionary_bond_issue_maturity, null, null, 14);
                LocalDate localDate3 = mVar.d.f173454c;
                if (localDate3 != null) {
                    long jP2 = ebm.a.P(localDate3);
                    TimeClause.Format.INSTANCE.getClass();
                    timeClause2 = new TimeClause(jP2, TimeClause.Format.f57959a, null, null, 12);
                } else {
                    timeClause2 = timeClause3;
                }
                CounterTextDelegate.Model model7 = new CounterTextDelegate.Model("ATTRS_WIDGET_GRID_ITEM_MATURITY", textLocalisedClause6, null, timeClause2, false, null, null, 0, 0, 0, 0, 2032);
                yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
                if (z) {
                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(R$string.trading_bonds_attributes_dictionary_bond_callability_callable, null, null, 14);
                    if (dVar != null) {
                        textLocalisedClause2 = new TextLocalisedClause(dVar.f173427a ? com.revolut.retail.common.ui.R$string.common_action_yes : com.revolut.retail.common.ui.R$string.common_action_no, null, null, 14);
                    } else {
                        textLocalisedClause2 = timeClause3;
                    }
                    model = new CounterTextDelegate.Model("ATTRS_WIDGET_GRID_ITEM_CALLABLE", textLocalisedClause7, null, textLocalisedClause2, false, null, null, 0, 0, 0, 0, 2032);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                } else {
                    model = null;
                }
                if (z) {
                    TextLocalisedClause textLocalisedClause8 = new TextLocalisedClause(R$string.trading_bonds_attributes_dictionary_bond_callability_next_call_date, null, null, 14);
                    if (dVar != null && (localDate = dVar.f173428b) != null) {
                        long jP3 = ebm.a.P(localDate);
                        TimeClause.Format.INSTANCE.getClass();
                        timeClause3 = new TimeClause(jP3, TimeClause.Format.f57959a, null, null, 12);
                    }
                    model2 = new CounterTextDelegate.Model("ATTRS_WIDGET_GRID_ITEM_NEXT_CALL_DATE", textLocalisedClause8, null, timeClause3, false, null, null, 0, 0, 0, 0, 2032);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                } else {
                    model2 = null;
                }
                CounterTextDelegate.Model[] elements = {model4, model5, model6, model7, model, model2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return v.k(model3, new xk("ATTRS_WIDGET_GRID", kotlin.collections.d.L(elements), 2, null, null, i, 0, 0, 0, 65400));
        }
    }

    public /* synthetic */ b(j jVar, n nVar) {
        this.f132231b = nVar;
    }
}
