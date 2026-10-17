package eul;

import aw0.c7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.R$plurals;
import d9.e1;
import eu4.b0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cul.v f129635b;

    public /* synthetic */ e(Object obj2, cul.v vVar, int i) {
        this.f129634a = i;
        this.f129635b = vVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List listK;
        Instant instant;
        LocalDate localDate;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        int i = this.f129634a;
        cul.v vVar = this.f129635b;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                SourcePocketWrapper sourcePocketWrapper = (SourcePocketWrapper) pair.f186386b;
                if (!zBooleanValue) {
                    return null;
                }
                if (e1.G(vVar.e.f106844a)) {
                    return (bw0.m) iii.c.f(vVar.f109183n, new d(1), new b0(9), new et6.a(5));
                }
                Amount amount = sourcePocketWrapper.f91795b;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return new bw0.m(e4i.c.a(Amount.a(amount, ZERO), null, null, null, null, o9.NON_SENSITIVE, 31), bw0.l.INFO, null, false, null, 28);
            default:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                nel.n nVar = (nel.n) pair2.f186385a;
                e0 e0Var = (e0) pair2.f186386b;
                int i2 = k.f129643a[nVar.f214597c.ordinal()];
                if (i2 == 1) {
                    k4l.c cVar = e0Var.f180960m;
                    if (cVar == null) {
                        return null;
                    }
                    int i3 = k.f129644b[vVar.f109175a.ordinal()];
                    if (i3 == 1) {
                        listK = zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_orders_item_cancellation_deadline, null, null, 14), new TimeClause(cVar.f180950a.toEpochMilli(), new TimeClause.Format.DateMedium(n0.DEFAULT), null, null, 12));
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Instant instant2 = cVar.f;
                        if (instant2 == null) {
                            return null;
                        }
                        listK = zhm.v.k(new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_estimated_settlement_date_short, null, null, 14), new TimeClause(instant2.toEpochMilli(), new TimeClause.Format.DateMedium(n0.DEFAULT), null, null, 12));
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                return null;
                            }
                            Float fValueOf = Float.valueOf(12.0f);
                            nel.d dVarF = ifk.b.f(nVar);
                            if ((dVarF != null ? dVarF.d : null) != nel.b.NON_FRACTIONAL || (bigDecimal = e0Var.f180957h) == null || (bigDecimal2 = e0Var.i) == null) {
                                return null;
                            }
                            if (!e1.D(bigDecimal2)) {
                                bigDecimal2 = null;
                            }
                            if (bigDecimal2 == null) {
                                return null;
                            }
                            int iIntValue = bigDecimal.divide(bigDecimal2, 0, RoundingMode.UP).intValue();
                            return new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_info_outline, (Integer) null, fValueOf, fValueOf, 18), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_hint_minimum_lots_amount, Integer.valueOf(iIntValue), zhm.u.c(Integer.valueOf(iIntValue)), (Style) null, 24)), null, new Click(14, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Object) null, "CLICK_ID_MINIMUM_LOTS", false), null, 10);
                        }
                        int i5 = k.f129644b[vVar.f109175a.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                return null;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        nel.a aVar = nVar.f214599h;
                        nel.e0 e0Var2 = aVar instanceof nel.e0 ? (nel.e0) aVar : null;
                        if (e0Var2 == null || (localDate = e0Var2.f214568g) == null) {
                            return null;
                        }
                        int i6 = com.revolut.trading.orders.R$string.wealth_orders_structured_note_expected_trade;
                        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                        LocalDateClause$DateFormat.INSTANCE.getClass();
                        LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
                        jVar.getClass();
                        return new TextLocalisedClause(i6, zhm.u.c(com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, null)), null, 12);
                    }
                    k4l.c cVar2 = e0Var.f180960m;
                    if (cVar2 == null || oi0.d.B(vVar.f109176b) || (instant = cVar2.f) == null) {
                        return null;
                    }
                    listK = zhm.v.k(new TextLocalisedClause(com.revolut.trading.orders.R$string.wealth_trading_orders_estimated_settlement_date_short, null, null, 14), new TimeClause(instant.toEpochMilli(), new TimeClause.Format.DateMedium(n0.DEFAULT), null, null, 12));
                }
                return v1.c.f(listK, null);
        }
    }
}
