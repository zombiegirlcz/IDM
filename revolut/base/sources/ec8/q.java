package ec8;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import aw0.t0;
import aw0.x4;
import bu7.g0;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.ej;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.gj;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.r0;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.zi;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressExtKt;
import com.revolut.feature.rev_points.models.RevPointsRichText;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPacPortOutCredentials;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberStacPortOutCredentials;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$ExchangeBreakdownData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.R$plurals;
import com.revolut.trading.orders.R$string;
import ev4.r;
import ev4.s;
import ev4.t;
import ip0.go0;
import ip0.jo0;
import ip0.pr;
import ip0.rr;
import ip0.tc0;
import j19.c2;
import j19.d2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ll4.c0;
import m1c.i1;
import m1c.j1;
import m1c.k1;
import nel.z;
import tof.a3;
import vkm.j2;
import yp0.e0;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f124473b;

    public /* synthetic */ q(Object obj2, int i) {
        this.f124472a = i;
        this.f124473b = obj2;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) throws Throwable {
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        TextLocalisedClause textLocalisedClause;
        Clause textLocalisedQuantityClause2;
        o7.b bVar = (o7.b) this.f124473b;
        zsl.k fieldAttribute = (zsl.k) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(fieldAttribute, "attribute");
        ((ysl.b) ((wdf.a) bVar.f222639b)).getClass();
        Intrinsics.checkNotNullParameter(fieldAttribute, "fieldAttribute");
        if (fieldAttribute == null) {
            throw new IllegalArgumentException(("Non-stock field error " + fieldAttribute + " in " + ysl.b.class).toString());
        }
        zsl.j jVar = zsl.j.f324971a;
        if (fieldAttribute.equals(jVar)) {
            return new bw0.m(new TextLocalisedClause(R$string.wealth_stock_orders_error_whole_shares_only, null, null, 14), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, jVar);
        }
        zsl.g gVar = zsl.g.f324968a;
        if (fieldAttribute.equals(gVar)) {
            return new bw0.m(new TextLocalisedClause(R$string.wealth_orders_bonds_hint_fractional_error, null, null, 14), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, gVar);
        }
        zsl.i iVar = zsl.i.f324970a;
        if (fieldAttribute.equals(iVar)) {
            return new bw0.m(new TextLocalisedClause(R$string.wealth_orders_structured_note_hint_fractional_error, null, null, 14), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, iVar);
        }
        zsl.h hVar = zsl.h.f324969a;
        if (fieldAttribute.equals(hVar)) {
            return new bw0.m(new TextLocalisedClause(R$string.wealth_orders_hint_fractional_lot_error, null, null, 14), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, hVar);
        }
        if (fieldAttribute instanceof zsl.b) {
            zsl.b bVar2 = (zsl.b) fieldAttribute;
            int i = bVar2.f324956c ? ysl.a.f316515a[bVar2.d.ordinal()] == 1 ? R$string.wealth_invest_order_edit_sell_structured_note_max_order_warning : R$string.wealth_stock_orders_error_maximum_order_value_or_sell_all : bVar2.f324955b ? R$string.wealth_stock_orders_error_maximum_order_value_with_fees : R$string.wealth_stock_orders_error_maximum_order_value;
            Amount amount = bVar2.f324954a;
            BigDecimal bigDecimal = amount.f104717a;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            Comparable comparableC = kotlin.ranges.f.c(bigDecimal, ZERO);
            Intrinsics.checkNotNullExpressionValue(comparableC, "coerceAtLeast(...)");
            return new bw0.m(new TextLocalisedClause(i, u.c(e4i.c.a(Amount.a(amount, (BigDecimal) comparableC), null, null, null, null, null, 63)), null, 12), bw0.l.ERROR, null, false, null, 28);
        }
        if (fieldAttribute instanceof zsl.a) {
            zsl.a aVar = (zsl.a) fieldAttribute;
            int i2 = aVar.f324953c ? ysl.a.f316515a[aVar.d.ordinal()] == 1 ? R$string.wealth_invest_order_edit_sell_structured_note_min_order_warning : com.revolut.retail.wealth.resources.R$string.wealth_stock_sell_min_order_warning : aVar.f324952b ? R$string.wealth_stock_orders_error_minimum_order_value_with_fees : R$string.wealth_stock_orders_error_minimum_order_value;
            Amount amount2 = aVar.f324951a;
            BigDecimal bigDecimal2 = amount2.f104717a;
            BigDecimal ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            Comparable comparableC2 = kotlin.ranges.f.c(bigDecimal2, ZERO2);
            Intrinsics.checkNotNullExpressionValue(comparableC2, "coerceAtLeast(...)");
            return new bw0.m(new TextLocalisedClause(i2, u.c(e4i.c.a(Amount.a(amount2, (BigDecimal) comparableC2), null, null, null, null, null, 63)), null, 12), bw0.l.ERROR, null, false, null, 28);
        }
        if (fieldAttribute instanceof zsl.f) {
            zsl.f fVar = (zsl.f) fieldAttribute;
            Float fValueOf = Float.valueOf(12.0f);
            TradingAccount.TaxAdvantage taxAdvantage = fVar.f324966a;
            if (taxAdvantage instanceof TradingAccount.TaxAdvantage.Pea) {
                Intrinsics.checkNotNullParameter("An operation is not implemented: WNTCA-1264", "message");
                throw new NotImplementedError("An operation is not implemented: WNTCA-1264");
            }
            if (taxAdvantage instanceof TradingAccount.TaxAdvantage.Isa) {
                i = R$string.wealth_trading_orders_error_isa_top_up_limit;
            } else if (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                i = R$string.wealth_trading_orders_error_jisa_top_up_limit;
            } else if (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
                i = R$string.wealth_trading_orders_error_personal_jisa_top_up_limit;
            } else if (!(taxAdvantage instanceof TradingAccount.TaxAdvantage.Unknown)) {
                throw new NoWhenBranchMatchedException();
            }
            return new bw0.m(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i, u.c(new MoneyClause(fVar.f324967b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorRed), fValueOf, fValueOf, 16))), bw0.l.ERROR, null, true, fVar, 4);
        }
        if (fieldAttribute instanceof zsl.d) {
            zsl.d dVar = (zsl.d) fieldAttribute;
            xdf.f fVar2 = dVar.f324961b;
            BigDecimal bigDecimal3 = dVar.f324962c;
            int i3 = dVar.f324960a;
            z zVar = fVar2.f304432a;
            switch (zVar != null ? ysl.a.f316515a[zVar.ordinal()] : -1) {
                case -1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_stock_orders_error_maximum_shares_amount, u.c(Integer.valueOf(i3)), null, 12);
                    textLocalisedQuantityClause2 = textLocalisedClause;
                    return new bw0.m(textLocalisedQuantityClause2, bw0.l.ERROR, null, false, null, 28);
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_order_edit_sell_structured_note_max_quantity_warning, u.c(Integer.valueOf(i3)), null, 12);
                    textLocalisedQuantityClause2 = textLocalisedClause;
                    return new bw0.m(textLocalisedQuantityClause2, bw0.l.ERROR, null, false, null, 28);
                case 2:
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i3);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    if (bigDecimal3 != null) {
                        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimal3, RoundingMode.HALF_EVEN);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                        if (bigDecimalDivide != null) {
                            bigDecimalValueOf = bigDecimalDivide;
                        }
                    }
                    int iIntValue = bigDecimalValueOf.setScale(0, RoundingMode.DOWN).intValue();
                    textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(bigDecimal3 != null ? R$plurals.wealth_trading_orders_error_maximum_lots_amount : R$plurals.wealth_trading_orders_error_maximum_units_amount, Integer.valueOf(iIntValue), u.c(Integer.valueOf(iIntValue)), (Style) null, 24);
                    return new bw0.m(textLocalisedQuantityClause2, bw0.l.ERROR, null, false, null, 28);
            }
        }
        if (!(fieldAttribute instanceof zsl.c)) {
            if (!(fieldAttribute instanceof zsl.e)) {
                throw new NoWhenBranchMatchedException();
            }
            zsl.e eVar = (zsl.e) fieldAttribute;
            int i5 = eVar.f324963a;
            return new bw0.m(new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_error_sell_limits, Integer.valueOf(i5), v.k(Integer.valueOf(i5), Integer.valueOf(eVar.f324965c)), (Style) null, 24), bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, eVar);
        }
        zsl.c cVar = (zsl.c) fieldAttribute;
        z zVar2 = cVar.f324958b.f304432a;
        BigDecimal bigDecimal4 = cVar.f324959c;
        BigDecimal bigDecimal5 = cVar.f324957a;
        switch (zVar2 != null ? ysl.a.f316515a[zVar2.ordinal()] : -1) {
            case -1:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                hx7.e.n(new IllegalStateException("min order quantity is not supported for type " + zVar2));
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.wealth_trading_orders_error_minimum_units_amount, Integer.valueOf(bigDecimal5.setScale(0, RoundingMode.UP).intValue()), u.c((bigDecimal5.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal5.stripTrailingZeros()).toPlainString()), (Style) null, 24);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 2:
                if (bigDecimal4 != null) {
                    BigDecimal bigDecimalDivide2 = bigDecimal5.divide(bigDecimal4, RoundingMode.HALF_EVEN);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide2, "divide(...)");
                    if (bigDecimalDivide2 != null) {
                        bigDecimal5 = bigDecimalDivide2;
                    }
                }
                int iIntValue2 = bigDecimal5.setScale(0, RoundingMode.UP).intValue();
                textLocalisedQuantityClause = new TextLocalisedQuantityClause(bigDecimal4 != null ? R$plurals.wealth_trading_orders_error_minimum_lots_amount : R$plurals.wealth_trading_orders_error_minimum_units_amount, Integer.valueOf(iIntValue2), u.c(Integer.valueOf(iIntValue2)), (Style) null, 24);
                break;
        }
        return new bw0.m(textLocalisedQuantityClause, bw0.l.ERROR, null, false, null, 28);
    }

    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final Object b(Object obj2, Object obj3, Object obj4) {
        ?? r2;
        TimeClause timeClause;
        s sVar;
        TextLocalisedClause textLocalisedClause;
        ?? r112;
        int i;
        String str;
        String str2;
        int i2;
        ev4.g gVar = (ev4.g) this.f124473b;
        ev4.f model = (ev4.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        ev4.j jVarB = r.b();
        aim.e eVarB = u.b();
        wi0.b bVar = model.e;
        xi0.b bVar2 = model.f129707b;
        c0 c0Var = model.f129708c;
        wi0.b.Companion.getClass();
        List listC = bVar.equals(wi0.b.O) ? u.c(cl4.p.PRINTABLE) : v.k(cl4.p.PRINTABLE, cl4.p.SPREADSHEET);
        int i3 = 1;
        if (listC.size() > 1) {
            int i5 = t.f129736a[gVar.f129709a.ordinal()];
            int i6 = 2;
            if (i5 == 1) {
                str = "id_tab_pdf";
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "id_tab_excel";
            }
            List list = listC;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                cl4.p pVar = (cl4.p) it8.next();
                int[] iArr = t.f129736a;
                int i21 = iArr[pVar.ordinal()];
                if (i21 == i3) {
                    str2 = "id_tab_pdf";
                } else {
                    if (i21 != i6) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = "id_tab_excel";
                }
                int i22 = iArr[pVar.ordinal()];
                if (i22 == i3) {
                    i2 = com.revolut.feature.credit.core.R$string.statement_format_pdf;
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = com.revolut.feature.statements.R$string.statement_format_csv;
                }
                Iterator it9 = it8;
                arrayList.add(new FixedTabs.Item(str2, new TextLocalisedClause(i2, null, null, 14), (AnalyticsContext) null, 12));
                it8 = it9;
                i3 = 1;
                i6 = 2;
            }
            eVarB.add(new FixedTabsDelegate.Model("id_section_tabs", arrayList, str, false, null, SyslogConstants.LOG_CLOCK));
        }
        List list2 = model.d;
        if (c0Var != null) {
            r2 = 0;
            timeClause = new TimeClause(pyd.c.f0(c0Var.f196508a), new TimeClause.Format.MonthAndYear((ka) null, 3), null, null, 12);
        } else {
            r2 = 0;
            timeClause = null;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_month, r2, r2, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_calendar_date, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        if (c0Var != null) {
            YearMonth yearMonthH0 = pyd.c.h0(((c0) d0.b0(list2)).f196508a);
            Intrinsics.checkNotNullExpressionValue(yearMonthH0, "toYearMonth(...)");
            YearMonth yearMonthH02 = pyd.c.h0(((c0) d0.m0(list2)).f196508a);
            Intrinsics.checkNotNullExpressionValue(yearMonthH02, "toYearMonth(...)");
            YearMonth yearMonthH03 = pyd.c.h0(c0Var.f196508a);
            Intrinsics.checkNotNullExpressionValue(yearMonthH03, "toYearMonth(...)");
            sVar = new s(yearMonthH0, yearMonthH02, yearMonthH03);
        } else {
            sVar = null;
        }
        InputTextDelegate.Model model2 = new InputTextDelegate.Model("id_cell_action_month", timeClause, textLocalisedClause2, null, false, null, false, null, null, null, null, resourceImage, null, false, null, null, false, c0Var != null, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, sVar, null, null, 0, 0, 0, 0, -33820680, 65023);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        if (c0Var != null) {
            dj0.d dVar = new dj0.d(c0Var.d, bVar2);
            dj0.d dVar2 = new dj0.d(c0Var.f196510c, bVar2);
            wi0.b.Companion.getClass();
            eVarB.addAll(yp0.b.g(v.k(bVar.equals(wi0.b.O) ? new CellDetailsDelegate.Model("id_cell_action_statement_balance", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_total_payment_incl_charges, null, null, 14), sx4.f.b(3, null, null, dVar2), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : new CellDetailsActionDelegate.Model("id_cell_action_statement_balance", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_balance_incl_charges, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), sx4.f.b(3, null, null, dVar2), false, false, null, null, 0, 0, 32736), new CellDetailsDelegate.Model("id_cell_action_statement_minimum", new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_minimum_due, null, null, 14), sx4.f.b(3, null, null, dVar), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)), new ListSubheaderDelegate.Model("id_list_subheader_preview", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_preview, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        }
        aim.e eVarA = u.a(eVarB);
        wi0.b.Companion.getClass();
        if (bVar.equals(wi0.b.O)) {
            textLocalisedClause = null;
            r112 = 0;
            i = 14;
        } else {
            r112 = 0;
            i = 14;
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_limit_credit_description, null, null, 14);
        }
        return new ev4.k(jVarB, eVarA, textLocalisedClause, new ev4.i(new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_statement_button_title, r112, r112, i), c0Var != null, true));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        int i;
        ev7.e eVar = (ev7.e) this.f124473b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        od0.i iVar = (od0.i) pair.f186386b;
        aim.e eVarB = u.b();
        bu7.n nVar = (bu7.n) iVar.f224257a;
        if (nVar != null) {
            BannerDelegate.Model model = new BannerDelegate.Model("ID_BANNER", new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D129", null, null, null, 30)), new TextClause(nVar.f18726a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(nVar.f18727b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, null, null, null, null, 65472);
            yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
            eVarB.add(model);
        }
        wi0.b bVar = (wi0.b) eVar.f129752c.getContent();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i2 = 0;
        for (Object obj5 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            g0 g0Var = (g0) obj5;
            bu7.c0 key = g0Var.getKey();
            Intrinsics.checkNotNullParameter(key, "<this>");
            switch (ev7.k.f129759a[key.ordinal()]) {
                case 1:
                    i = com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_details_guide_to_benefits_title;
                    break;
                case 2:
                    i = com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_documents_product_information_document_title;
                    break;
                case 3:
                    i = com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_documents_statement_of_insurance_title;
                    break;
                case 4:
                    wi0.b.Companion.getClass();
                    i = (!Intrinsics.f(bVar, wi0.b.f297756l) && !Intrinsics.f(bVar, wi0.b.l2)) ? com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_documents_full_coverage_wording_title : com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_documents_full_coverage_wording_title_au;
                    break;
                case 5:
                    i = com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_documents_demands_and_needs_title;
                    break;
                case 6:
                    i = com.revolut.feature.insurance_embedded.impl.R$string.embedded_insurance_documents_claims_eligibility_statement_title;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            arrayList.add(new RowDelegate.Model(a0.d.n("ID_DOCUMENT_PREFIX", i2), xu7.c.a(R$drawable.uikit_icn_24_document), textLocalisedClause, null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), true, null, false, null, null, null, null, null, null, new ev7.d(textLocalisedClause, g0Var), null, 0, 0, 0, 0, 532673528));
            i2 = i3;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        a0.x(arrayList, eVarB);
        return new ev7.g(u.a(eVarB));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        evi.d dVar = (evi.d) this.f124473b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((AsftTerminal) obj2, "<unused var>");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_time_slot_header_title, null, null, 14);
        int i = com.revolut.retail.feature.airport.security_fast_track.impl.R$string.asft_time_slot_header_subtitle;
        AsftTimeSlot asftTimeSlot = dVar.f129961c;
        String[] elements = {asftTimeSlot != null ? asftTimeSlot.f98749a : null, asftTimeSlot != null ? asftTimeSlot.f98750b : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new lw0.a(textLocalisedClause, new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12), null, null, false, 28);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 ew4.t, still in use, count: 2, list:
          (r3v5 ew4.t) from 0x016d: MOVE (r53v0 ew4.t) = (r3v5 ew4.t)
          (r3v5 ew4.t) from 0x0117: MOVE (r53v2 ew4.t) = (r3v5 ew4.t)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object e(java.lang.Object r82, java.lang.Object r83, java.lang.Object r84) {
        /*
            Method dump skipped, instruction units count: 1771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec8.q.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        ewc.c cVar = (ewc.c) this.f124473b;
        List<WalletLimit.CounterLimit> walletLimits = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        ArrayList arrayList = new ArrayList();
        for (WalletLimit.CounterLimit counterLimit : walletLimits) {
            int i = ewc.b.f130158a[counterLimit.f94844a.ordinal()];
            RowDelegate.Model modelA = i != 1 ? i != 2 ? null : cVar.a("BRAZIL_ANNUAL_LIST_ITEM_ID", com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_annual_title, R$drawable.uikit_icn_24_arrow_bulk_request, counterLimit) : cVar.a("BRAZIL_EXCHANGE_YEARLY_LIST_ITEM_ID", com.revolut.feature.security_hub.api.R$string.security_hub_transactions_limits_brazil_fx_title, R$drawable.uikit_icn_24_rates_converter, counterLimit);
            if (modelA != null) {
                arrayList.add(modelA);
            }
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        Iterator it8;
        VoucherSmallTileDelegate.Model model;
        TextClause textClauseA;
        LayeredImage layeredImage;
        LayeredImage layeredImageJ;
        LinkedHashMap linkedHashMap;
        k1 k1Var;
        f0c.h hVar = (f0c.h) this.f124473b;
        f19.g content = (f19.g) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f131192b;
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : list) {
            if (obj5 instanceof d2) {
                arrayList.add(obj5);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            d2 d2Var = (d2) it9.next();
            c2 c2Var = d2Var.f;
            if (c2Var != null) {
                String strQ = j6.a.q("REWARDS_FOR_YOU_ITEM_PREFIX", d2Var.f170188a);
                zi ziVar = new zi(new UrlImage(c2Var.f170177a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), go0.PROGRESSIVE_BLUR);
                gj gjVar = new gj(2);
                ej ejVar = new ej(1);
                TextClause textClause = new TextClause(c2Var.f170178b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                k19.j jVar = c2Var.i;
                if (jVar != null) {
                    String str = jVar.f180157a;
                    Map map = jVar.f180158b;
                    if (map != null) {
                        linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            k19.i iVar = (k19.i) entry.getValue();
                            int i = f0c.g.f131076a[iVar.f180153a.ordinal()];
                            Iterator it10 = it9;
                            if (i == 1) {
                                k1Var = k1.REV_POINTS;
                            } else {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                k1Var = k1.UNKNOWN;
                            }
                            linkedHashMap.put(key, new RevPointsRichText.Placeholder(k1Var, iVar.f180154b, iVar.f180155c));
                            it9 = it10;
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    it8 = it9;
                    textClauseA = i1c.d.a(new RevPointsRichText(linkedHashMap, str));
                } else {
                    it8 = it9;
                    textClauseA = null;
                }
                Float f = c2Var.f170182j;
                jo0 jo0Var = f != null ? new jo0((int) (f.floatValue() * 100)) : null;
                k19.a0 a0Var = c2Var.e;
                if (a0Var != null) {
                    String str2 = a0Var.f180144a;
                    int iA = hVar.f131077a.a(str2);
                    if (iA == 0) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str2, " not found"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        layeredImage = null;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    } else {
                        layeredImageJ = LayeredImage.INSTANCE.j(iA, new Color.Solid(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorOnAccentNeutral));
                        VoucherSmallTileDelegate.Model model2 = new VoucherSmallTileDelegate.Model(strQ, ziVar, textClause, gjVar, ejVar, textClauseA, layeredImageJ, null, jo0Var, null, null, false, null, null, new f0c.e(c2Var.f.f180147a), 261440);
                        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                        model = model2;
                    }
                } else {
                    layeredImage = null;
                }
                layeredImageJ = layeredImage;
                VoucherSmallTileDelegate.Model model22 = new VoucherSmallTileDelegate.Model(strQ, ziVar, textClause, gjVar, ejVar, textClauseA, layeredImageJ, null, jo0Var, null, null, false, null, null, new f0c.e(c2Var.f.f180147a), 261440);
                yp0.b.l(model22, 0, 0, 0, 0, null, false, 63);
                model = model22;
            } else {
                it8 = it9;
                model = null;
            }
            if (model != null) {
                arrayList2.add(model);
            }
            it9 = it8;
        }
        return arrayList2.size() >= 2 ? v.k(f0c.h.b(), f0c.h.a(arrayList2)) : f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    private final Object i(Object obj2, Object obj3, Object obj4) {
        f0c.o oVar = (f0c.o) this.f124473b;
        Map items = (Map) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        oVar.getClass();
        EnumEntries enumEntriesA = i1.a();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it8 = enumEntriesA.iterator();
        while (it8.hasNext()) {
            od0.i iVar = (od0.i) items.get((i1) it8.next());
            RowDelegate.Model model = null;
            if (iVar != null) {
                if (!iVar.d()) {
                    iVar = null;
                }
                if (iVar != null) {
                    j1 j1Var = (j1) iVar.c();
                    i1 i1Var = j1Var.f201379a;
                    String id10 = i1Var.getId();
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(j1Var.f201380b, null, null, false, null, false, 62);
                    ?? r92 = j1Var.f201381c;
                    TextLocalisedClause textLocalisedClause = j1Var.d;
                    tf tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
                    boolean z = j1Var.e;
                    model = new RowDelegate.Model(id10, image40, r92, null, 0, textLocalisedClause, null, null, 0, tfVar, z, null, false, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, new c0c.c(i1Var), null, 0, 0, 0, 0, 532657112);
                }
            }
            if (model != null) {
                arrayList.add(model);
            }
        }
        e0 e0Var = e0.OUTSIDE_BOX;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return !arrayList.isEmpty() ? yp0.b.d(arrayList, f0c.o.a(), e0Var, i, i, i2, i2) : arrayList;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        int i;
        fa8.f fVar = (fa8.f) this.f124473b;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        com.revolut.feature.junior_profile.api.models.a aVar = (com.revolut.feature.junior_profile.api.models.a) pair.f186385a;
        Address address = fVar.f133251b;
        InputTextDelegate.Model modelA = fa8.k.a("FIRST_NAME_INPUT_LIST_ID", new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_details_review_item_input_text, u.c(aVar.getF77099b()), null, 12), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_creation_item_first_name_label, null, null, 14), (24 & 8) != 0 ? rr.f166227a : pr.f165860a, false);
        InputTextDelegate.Model modelA2 = fa8.k.a("LAST_NAME_INPUT_LIST_ID", new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_details_review_item_input_text, u.c(aVar.getF77100c()), null, 12), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_creation_item_last_name_label, null, null, 14), (24 & 8) != 0 ? rr.f166227a : pr.f165860a, false);
        InputTextDelegate.Model modelA3 = fa8.k.a("DATE_OF_BIRTH_INPUT_LIST_ID", new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_details_review_item_input_text, u.c(new TimeClause(oc.c.F(aVar.getI()), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_details_review_item_birth_date_title, null, null, 14), (24 & 8) != 0 ? rr.f166227a : pr.f165860a, false);
        int i2 = fa8.l.f133260a[aVar.getD().ordinal()];
        if (i2 == 1) {
            i = com.revolut.feature.junior.isa.impl.R$string.junior_trading_gender_male;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.junior.isa.impl.R$string.junior_trading_gender_female;
        }
        InputTextDelegate.Model[] elements = {modelA, modelA2, modelA3, yp0.r.a(fa8.k.a("GENDER_INPUT_LIST_ID", new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_details_review_item_gender_title, null, null, 14), (24 & 8) != 0 ? rr.f166227a : pr.f165860a, false)), address != null ? fa8.k.a("HOME_ADDRESS_INPUT_LIST_ID", new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_details_review_item_input_text, u.c(AddressExtKt.format(address)), null, 12), new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_child_details_review_item_home_address_title, null, null, 14), pr.f165860a, true) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new fa8.h(kotlin.collections.d.L(elements), true);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.b bVar = (com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.b) this.f124473b;
        List transactions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        if (transactions.isEmpty()) {
            return f0.f322471a;
        }
        List<a3> list = transactions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (a3 a3Var : list) {
            thf.g gVar = bVar.f89411a;
            k71.q.Companion.getClass();
            arrayList.add(RowDelegate.Model.x(((anf.k) gVar).p(a3Var, k71.p.a(), new thf.f(false, 3)), null, null, null, null, null, 0, null, true, null, a3Var, 0, 0, 0, 0, null, -4196353, 15));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        EsimUserPocket esimUserPocket = (EsimUserPocket) this.f124473b;
        EsimCheckoutPrice checkoutPrice = (EsimCheckoutPrice) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_summary_exchanged_amount, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20);
        MoneyClause moneyClause = new MoneyClause(checkoutPrice.f100197b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
        PaymentMethod.Pocket pocket = esimUserPocket.f100532b;
        return new CellDetailsDelegate.Model("ID_EXCHANGE_AMOUNT_ITEM", t0Var, moneyClause, null, new EsimCheckoutScreenContract$ExchangeBreakdownData(pocket != null ? pocket.f84379g : null, checkoutPrice), null, null, 0, null, false, false, null, null, 32696);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.revolut.core.ui_kit.delegates.r0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r24v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ip0.tc0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    private final Object m(Object obj2, Object obj3, Object obj4) {
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = (EsimMobilePlanPointsOption) this.f124473b;
        Optional pointsOptions = (Optional) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        EsimMobilePlanPointsOptions esimMobilePlanPointsOptions = (EsimMobilePlanPointsOptions) u1.l(pointsOptions);
        if (esimMobilePlanPointsOptions != null) {
            ArrayList arrayList = esimMobilePlanPointsOptions.f100309c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Style style = null;
            int i = 0;
            String str = null;
            for (Object obj5 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    ?? r242 = style;
                    v.s();
                    throw r242;
                }
                EsimMobilePlanPointsOption esimMobilePlanPointsOption2 = (EsimMobilePlanPointsOption) obj5;
                String strN = a0.d.n("ID_POINTS_OPTION_", i);
                boolean zF = Intrinsics.f(esimMobilePlanPointsOption2, esimMobilePlanPointsOption);
                if (zF) {
                    str = strN;
                }
                Style style2 = style;
                AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(strN, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_revpoints_amount_off, u.c(new MoneyClause(esimMobilePlanPointsOption2.f100305b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), style, 12), nub.a.n(esimMobilePlanPointsOption2.f100304a, o9.SENSITIVE, 12.0f, Integer.valueOf(R$attr.uikit_colorForeground), 38), zF ? new r0(v.k(Integer.valueOf(nub.a.f219273b), Integer.valueOf(nub.a.f219274c))) : style2, null, false, esimMobilePlanPointsOption2, null, 432);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                arrayList2.add(model);
                style = style2;
                i = i2;
            }
            Style style3 = style;
            List listC = u.c(new hg("ID_POINTS_OPTIONS_SCROLLER", arrayList2, 3, x4.c.f10604a, str != null ? new tc0(str, false, 6) : style3, new gg.b(false, 3), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28608));
            if (listC != null) {
                return listC;
            }
        }
        return f0.f322471a;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        String str;
        Object next;
        com.revolut.feature.shops.impl.ui.home.a aVar = (com.revolut.feature.shops.impl.ui.home.a) this.f124473b;
        List list = (List) obj2;
        ((Boolean) obj3).getClass();
        ShopsCategory shopsCategory = ((fjd.o) ((j2) aVar.Q.f22677a).getValue()).f135583g;
        if ((shopsCategory == null || (str = shopsCategory.f87040a) == null) && (str = aVar.E.f87184a) == null) {
            str = aVar.G.f135578b;
        }
        if (str != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((ShopsCategory) next).f87040a, str)) {
                    break;
                }
            }
            ShopsCategory shopsCategory2 = (ShopsCategory) next;
            if (shopsCategory2 != null) {
                return shopsCategory2;
            }
        }
        return (ShopsCategory) d0.e0(0, list);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        List listC;
        fkj.i iVar = (fkj.i) this.f124473b;
        EsimPhoneNumberPortOutCredentials content = (EsimPhoneNumberPortOutCredentials) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int i = fkj.h.f135854a[iVar.f135855a.f101223b.ordinal()];
        if (i == 1) {
            EsimPhoneNumberPacPortOutCredentials esimPhoneNumberPacPortOutCredentials = content.f100329a;
            String str = esimPhoneNumberPacPortOutCredentials != null ? esimPhoneNumberPacPortOutCredentials.f100328a : null;
            TextClause textClause = new TextClause(str == null ? "" : str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            String str2 = esimPhoneNumberPacPortOutCredentials != null ? esimPhoneNumberPacPortOutCredentials.f100328a : null;
            listC = u.c(new RowDelegate.Model("ID_PAC_CODE", null, textClause, null, 0, null, null, null, 0, new tf(new yy0.h(new TextClause(str2 == null ? "" : str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), resourceImage)), true, null, false, null, null, null, null, null, null, esimPhoneNumberPacPortOutCredentials != null ? esimPhoneNumberPacPortOutCredentials.f100328a : null, null, 0, 0, 0, 0, 532673530));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            EsimPhoneNumberStacPortOutCredentials esimPhoneNumberStacPortOutCredentials = content.f100330b;
            String str3 = esimPhoneNumberStacPortOutCredentials != null ? esimPhoneNumberStacPortOutCredentials.f100414a : null;
            TextClause textClause2 = new TextClause(str3 == null ? "" : str3, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
            ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            String str4 = esimPhoneNumberStacPortOutCredentials != null ? esimPhoneNumberStacPortOutCredentials.f100414a : null;
            if (str4 == null) {
                str4 = "";
            }
            listC = u.c(new RowDelegate.Model("ID_STAC_CODE", null, textClause2, null, 0, null, null, null, 0, new tf(new yy0.h(new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), resourceImage2)), true, null, false, null, null, null, null, null, null, esimPhoneNumberStacPortOutCredentials != null ? esimPhoneNumberStacPortOutCredentials.f100414a : null, null, 0, 0, 0, 0, 532673530));
        }
        List list = listC;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0482  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r66, java.lang.Object r67, java.lang.Object r68) {
        /*
            Method dump skipped, instruction units count: 3576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec8.q.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ q(Object obj2, Object obj3, int i) {
        this.f124472a = i;
        this.f124473b = obj3;
    }
}
