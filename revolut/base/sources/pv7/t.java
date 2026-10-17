package pv7;

import android.os.Bundle;
import android.os.Parcelable;
import aw0.c7;
import aw0.d7;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentDayChangeTerms;
import com.revolut.feature.retail.restaurants.impl.R$plurals;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.tracking.v3.IdContext;
import ip0.ak0;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import m1c.r0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239999a;

    public /* synthetic */ t(int i) {
        this.f239999a = i;
    }

    private final Object a(Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        CellDetailsDelegate.Model model;
        TextDelegate.Model model2;
        LoanRepaymentDayChangeTerms newRepaymentSchedule = (LoanRepaymentDayChangeTerms) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(newRepaymentSchedule, "newRepaymentSchedule");
        aim.e eVarB = zhm.u.b();
        aim.e eVarB2 = zhm.u.b();
        eVarB2.add(new CellDetailsDelegate.Model("NEW_REPAYMENT_AMOUNT_ID", new TextLocalisedClause(R$string.loan_management_change_payday_summary_next_repayment_amount, null, null, 14), new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), sx4.f.b(1, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, newRepaymentSchedule.f70078c)), sx4.g.e(2), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        n35.c cVar = newRepaymentSchedule.f70080h;
        int[] iArr = q65.o.f242508a;
        int i3 = iArr[cVar.ordinal()];
        if (i3 != 1) {
            i = 2;
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 14;
            model = new CellDetailsDelegate.Model("final-repayment-amount-decreasing-repayment", new TextLocalisedClause(R$string.loan_management_change_payday_final_repayment_amount, null, null, 14), sx4.f.b(3, null, null, newRepaymentSchedule.d), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        } else {
            i = 2;
            i2 = 14;
            model = new CellDetailsDelegate.Model("new-repayment-day-other-payments-amount", new TextLocalisedClause(R$string.loan_management_change_payday_summary_other_repayments, null, null, 14), sx4.f.b(3, null, null, newRepaymentSchedule.f70076a), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        eVarB2.add(model);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_schedule_next_repayment_date, null, null, i2);
        long jF = oc.c.F(newRepaymentSchedule.f70077b);
        TimeClause.Format.INSTANCE.getClass();
        TimeClause.Format.DateMedium dateMedium = TimeClause.Format.f57959a;
        eVarB2.add(new CellDetailsDelegate.Model("new-repayment-day-next-repayment", textLocalisedClause, new TimeClause(jF, dateMedium, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        eVarB2.add(new CellDetailsDelegate.Model("new-repayment-day-final-repayment", new TextLocalisedClause(R$string.loan_management_schedule_final_repayment_date, null, null, i2), new TimeClause(oc.c.F(newRepaymentSchedule.e), dateMedium, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        LocalDate localDate = newRepaymentSchedule.f;
        Long lValueOf = localDate != null ? Long.valueOf(oc.c.F(localDate)) : null;
        if (lValueOf != null) {
            eVarB2.add(new CellDetailsDelegate.Model("new-repayment-day-next-rate-update", new TextLocalisedClause(R$string.credit_loan_account_next_interest_rate_update, null, null, i2), new TimeClause(lValueOf.longValue(), dateMedium, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        }
        eVarB.addAll(yp0.b.g(zhm.u.a(eVarB2), new ListSubheaderDelegate.Model("new-repayment-day-header", (Image) null, (Clause) new TextLocalisedClause(R$string.loan_management_change_payday_summary_title, null, null, i2), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        int i5 = iArr[cVar.ordinal()];
        if (i5 == 1) {
            model2 = null;
        } else {
            if (i5 != i) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_change_payday_decreasing_instalment_footer, null, null, i2);
            ak0 ak0Var = new ak0(null, null, 3);
            int i6 = R$attr.uikit_dp16;
            int i21 = R$attr.uikit_dp32;
            model2 = new TextDelegate.Model("decreasing-instalment-footer", textLocalisedClause2, false, ak0Var, null, null, i6, i21, i21, i21, 116);
        }
        n14.e.b(eVarB, model2);
        return zhm.u.a(eVarB);
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List<cj0.a> list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (cj0.a aVar : list) {
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(aVar.f24569c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 62);
            TextClause textClause = new TextClause(aVar.f24567a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new RowDelegate.Model("ACTION_LIST_ID", image40, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar, new AnalyticsContext(kii.e.d(IdContext.newBuilder(), aVar.f24568b, AnalyticsContext.INSTANCE)), 0, 0, 0, 0, 524287992));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Boolean nlEnabled = (Boolean) obj2;
        Boolean gbEnabled = (Boolean) obj3;
        Boolean frEnabled = (Boolean) obj4;
        Intrinsics.checkNotNullParameter(nlEnabled, "nlEnabled");
        Intrinsics.checkNotNullParameter(gbEnabled, "gbEnabled");
        Intrinsics.checkNotNullParameter(frEnabled, "frEnabled");
        p97.a[] elements = {nlEnabled.booleanValue() ? t97.c.a(t97.d.ACCOUNT_SWITCH_NL) : null, gbEnabled.booleanValue() ? t97.c.a(t97.d.ACCOUNT_SWITCH_GB) : null, frEnabled.booleanValue() ? t97.c.a(t97.d.ACCOUNT_SWITCH_FR) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        g95.c availability = (g95.c) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(availability, "availability");
        return Boolean.valueOf(availability instanceof g95.a);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter((lbf.p) obj2, "<unused var>");
        return Boolean.TRUE;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        lbf.p content = (lbf.p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        od0.i.Companion.getClass();
        return od0.h.a(content);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        MoneyClause moneyClause;
        BigDecimal bigDecimal;
        List items = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("GO_TO_ALL_CRYPTO_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto.newlyadded.api.R$string.crypto_newly_added_screen_empty_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.crypto.newlyadded.api.R$string.crypto_newly_added_screen_empty_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D128", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.feature.crypto.newlyadded.api.R$string.crypto_newly_added_screen_empty_button_title, null, null, 14), false, null, null, false, 0, 0, 32704);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return zhm.u.c(model);
        }
        List<haj.a> list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (haj.a aVar : list) {
            xi0.b bVar = aVar.f150521a;
            xi0.b bVar2 = aVar.f150521a;
            String strQ = j6.a.q("LIST_ID_ASSET_", cp5.d.J(bVar));
            CurrencyClause currencyClause = new CurrencyClause(bVar2, null, null, 6);
            CurrencyClause currencyClause2 = new CurrencyClause(bVar2, CurrencyClause.Format.Ticker.f57756a, null, 4);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            n9l.a aVar2 = aVar.f150522b;
            if (aVar2 != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(aVar2.f213663c);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                moneyClause = new MoneyClause(u80.q.a(bigDecimalValueOf, aVar2.f213662b), new MoneyClause.Format.Defaults(null, ScaleMode.CryptoHoldingFormat.f51439a, false, false, 13), null, null, 12);
            } else {
                moneyClause = null;
            }
            vel.a aVar3 = aVar.f150523c;
            arrayList.add(new RowDelegate.Model(strQ, image40, currencyClause, null, 0, currencyClause2, null, null, 1, new RowDelegate.Model.c.b(moneyClause, (aVar3 == null || (bigDecimal = aVar3.f288346c) == null) ? null : xqi.a.b(bigDecimal, false, 7), null, false, 124), false, null, false, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532675288));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Bundle bundle = (Bundle) obj2;
        String key = (String) obj3;
        BackendFlow backendFlow = (BackendFlow) obj4;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        m70.a.r(bundle, key, backendFlow);
        return Unit.f186387a;
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        List walletProfilesExtended = (List) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(walletProfilesExtended, "walletProfilesExtended");
        List<vf8.b> list = walletProfilesExtended;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (vf8.b bVar : list) {
            linkedHashMap.put(bVar.f288535a.f239484a, bVar.f288536b.f77099b);
        }
        return linkedHashMap;
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        r0 optInState = (r0) obj2;
        ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(optInState, "optInState");
        return optInState.f201447a;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        List subscriptions = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        if (subscriptions.isEmpty()) {
            return null;
        }
        return new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.subscription_block_confirm_subtitle, null, null, 14);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        String it8 = (String) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(it8, "it");
        od0.i.Companion.getClass();
        return od0.h.a(it8);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        String it8 = (String) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(it8, "it");
        od0.i.Companion.getClass();
        return od0.h.a(it8);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        xdb.r details = (xdb.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(details, "details");
        aim.e eVarB = zhm.u.b();
        Reservation reservation = details.f304405a;
        CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
        x4 x4Var = new x4(new TextLocalisedClause(com.revolut.feature.retail.restaurants.impl.R$string.retail_restaurants_reservation_details_cells_reservation_details_title, null, null, 14));
        boolean z = false;
        TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, reservation.f82811c, new LocalDateClause$DateFormat.DayAndMonth(0));
        int i = R$plurals.retail_restaurants_reservation_details_cells_reservation_details_description;
        int i2 = reservation.f;
        List listC = zhm.u.c(CounterTextDelegate.Model.Companion.a(companion, "reservation_details_details", x4Var, timeClauseB, new TextLocalisedQuantityClause(i, Integer.valueOf(i2), zhm.v.k(com.revolut.core.ui_kit.models.k.a(d7.Companion, reservation.d), Integer.valueOf(i2)), (Style) null, 24), null, null, 0, 0, 4080));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        List listC2 = zhm.u.c(new RowDelegate.Model("reservation_details_address", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_location_pin, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(com.revolut.feature.retail.restaurants.impl.R$string.retail_restaurants_reservation_details_cells_restaurant_location_title, null, null, 14), null, 0, new TextClause(o51.a.b(reservation.e.d, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        eVarB.addAll(listC2);
        return zhm.u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Type inference failed for: r10v10, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r74, java.lang.Object r75, java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 3432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pv7.t.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ t(Object obj2, int i) {
        this.f239999a = i;
    }
}
