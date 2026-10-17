package i9c;

import android.os.Parcelable;
import aw0.c7;
import aw0.ka;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import ip0.a40;
import ip0.d40;
import ip0.e40;
import ip0.h40;
import ip0.i40;
import ip0.qd0;
import ip0.vd0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ox0.b0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        String str;
        char c2;
        aim.e eVarA;
        boolean z;
        Iterator it8;
        int i;
        Clause clauseB;
        PayLaterOffer payLaterOffer;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PaymentScheduleSelection paymentScheduleSelection = domainState.f159621c;
        List list = domainState.f159620b;
        aim.e eVarB = u.b();
        dj0.d total = domainState.f159619a;
        boolean z3 = paymentScheduleSelection instanceof PaymentScheduleSelection.PayNow;
        Intrinsics.checkNotNullParameter(total, "total");
        vd0 vd0Var = vd0.RADIO;
        qd0 qd0Var = z3 ? qd0.SELECTED : qd0.UNSELECTED;
        RowDelegate.Model model = new RowDelegate.Model("PAY_NOW_ROW_ITEM_LIST_ID", null, new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_schedule_cell_subtitle, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_payment_schedule_pay_now_cell_subtitle, u.c(new MoneyClause(total, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874);
        SelectableDelegate.b.C0424b c0424b = SelectableDelegate.b.C0424b.f53319a;
        SelectableDelegate.Model model2 = new SelectableDelegate.Model("PAY_NOW_SELECTABLE_ITEM_LIST_ID", model, qd0Var, c0424b, vd0Var, false, null, PaymentScheduleSelection.PayNow.f84446a, null, false, 32480);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        if (!list.isEmpty()) {
            eVarB.add(new ListSubheaderDelegate.Model("PAY_LATER_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_pay_payment_schedule_pay_later_cell_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        }
        PaymentScheduleSelection.PayLater payLater = paymentScheduleSelection instanceof PaymentScheduleSelection.PayLater ? (PaymentScheduleSelection.PayLater) paymentScheduleSelection : null;
        String str2 = (payLater == null || (payLaterOffer = payLater.f84445a) == null) ? null : payLaterOffer.f84353a;
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            PayLaterOffer schedule = (PayLaterOffer) it9.next();
            boolean zF = Intrinsics.f(str2, schedule.f84353a);
            Intrinsics.checkNotNullParameter(schedule, "schedule");
            t6c.b bVar = schedule.f84354b;
            BigDecimal bigDecimal = schedule.f;
            String str3 = schedule.f84353a;
            int i2 = d.f159626a[bVar.ordinal()];
            e40 e40Var = e40.f164020a;
            Iterator it10 = it9;
            if (i2 == 1) {
                str = str2;
                aim.e eVarB2 = u.b();
                Intrinsics.checkNotNullParameter(schedule, "schedule");
                String str4 = "PAY_LATER_SELECTABLE_ITEM_LIST_ID_" + str3;
                vd0 vd0Var2 = vd0.RADIO;
                qd0 qd0Var2 = zF ? qd0.SELECTED : qd0.UNSELECTED;
                String strQ = j6.a.q("PAY_LATER_ROW_ITEM_LIST_ID_", str3);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_schedule_pay_in_30_days, null, null, 14);
                int i3 = R$string.revolut_pay_order_summary_payment_schedule_pay_in_30_days_subtitle;
                dj0.d dVar = schedule.d;
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 7);
                o9 o9Var = o9.NON_SENSITIVE;
                c2 = '\f';
                eVarB2.add(new SelectableDelegate.Model(str4, new RowDelegate.Model(strQ, null, textLocalisedClause, null, 0, new TextLocalisedClause(i3, u.c(new MoneyClause(dVar, defaults, null, o9Var, 4)), null, 12), null, null, 0, d9c.a.a(bigDecimal), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850), qd0Var2, c0424b, vd0Var2, false, null, new PaymentScheduleSelection.PayLater(schedule), null, false, 32480));
                if (zF) {
                    Intrinsics.checkNotNullParameter(schedule, "schedule");
                    eVarB2.add(new a40(j6.a.q("PAY_LATER_SCHEDULE_ITEM_LIST_ID_", str3), v.k(new h40(p.a.p("PAY_LATER_SCHEDULE_ITEM_LIST_ID_", str3, "_STEP_TODAY"), new MoneyClause(schedule.a(), new MoneyClause.Format.Defaults(null, null, false, true, 7), null, o9Var, 4), new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_schedule_cell_today, null, null, 14), new d40(i40.NORMAL)), new h40(p.a.p("PAY_LATER_SCHEDULE_ITEM_LIST_ID_", str3, "_STEP_IN_30_DAYS"), new MoneyClause(schedule.d, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9Var, 4), new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_schedule_in_30_days, null, null, 14), e40Var)), null, R$attr.uikit_dp0, R$attr.uikit_dp16, 4));
                }
                eVarA = u.a(eVarB2);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aim.e eVarB3 = u.b();
                Intrinsics.checkNotNullParameter(schedule, "schedule");
                ArrayList arrayList = schedule.f84356g;
                String strQ2 = j6.a.q("PAY_LATER_SELECTABLE_ITEM_LIST_ID_", str3);
                vd0 vd0Var3 = vd0.RADIO;
                qd0 qd0Var3 = zF ? qd0.SELECTED : qd0.UNSELECTED;
                String strQ3 = j6.a.q("PAY_LATER_ROW_ITEM_LIST_ID_", str3);
                str = str2;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.revolut_pay_payment_schedule_pay_later_cell_title, u.c(new NumberClause(arrayList.size(), (NumberClause.Format.Compact) null, (Custom) null, 6)), null, 12);
                int i5 = R$string.revolut_pay_payment_schedule_pay_later_cell_amount_subtitle;
                dj0.d dVar2 = schedule.d;
                MoneyClause.Format.Defaults defaults2 = new MoneyClause.Format.Defaults(null, null, false, false, 7);
                o9 o9Var2 = o9.NON_SENSITIVE;
                eVarB3.add(new SelectableDelegate.Model(strQ2, new RowDelegate.Model(strQ3, null, textLocalisedClause2, null, 0, new TextLocalisedClause(i5, u.c(new MoneyClause(dVar2, defaults2, null, o9Var2, 4)), null, 12), null, null, 0, d9c.a.a(bigDecimal), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850), qd0Var3, c0424b, vd0Var3, false, null, new PaymentScheduleSelection.PayLater(schedule), null, false, 32480));
                if (zF) {
                    Intrinsics.checkNotNullParameter(schedule, "schedule");
                    String strQ4 = j6.a.q("PAY_LATER_SCHEDULE_ITEM_LIST_ID_", str3);
                    aim.e eVarB4 = u.b();
                    boolean z4 = schedule.f84355c;
                    if (!z4) {
                        eVarB4.add(new h40(p.a.p("PAY_LATER_SCHEDULE_ITEM_LIST_ID_", str3, "_STEP_TODAY"), new MoneyClause(schedule.a(), new MoneyClause.Format.Defaults(null, null, false, true, 7), null, o9Var2, 4), new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_schedule_cell_today, null, null, 14), new d40(i40.NORMAL)));
                    }
                    Iterator it11 = arrayList.iterator();
                    int i6 = 0;
                    while (it11.hasNext()) {
                        Object next = it11.next();
                        int i21 = i6 + 1;
                        if (i6 < 0) {
                            v.s();
                            throw null;
                        }
                        PayLaterOffer.Instalment instalment = (PayLaterOffer.Instalment) next;
                        boolean z6 = z4 && i6 == 0;
                        String strT = v1.c.t(i6, "PAY_LATER_SCHEDULE_ITEM_LIST_ID_", str3, "_STEP_");
                        MoneyClause moneyClause = new MoneyClause(instalment.f84358b, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4);
                        if (z6) {
                            z = z4;
                            it8 = it11;
                            i = i21;
                            clauseB = new TextLocalisedClause(R$string.revolut_pay_order_summary_payment_schedule_cell_today, null, null, 14);
                        } else {
                            z = z4;
                            it8 = it11;
                            i = i21;
                            clauseB = com.revolut.core.ui_kit.models.j.b(c7.Companion, instalment.f84357a, new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT));
                        }
                        eVarB4.add(new h40(strT, moneyClause, clauseB, z6 ? new d40(i40.NORMAL) : e40Var));
                        z4 = z;
                        it11 = it8;
                        i6 = i;
                    }
                    eVarB3.add(new a40(strQ4, u.a(eVarB4), null, R$attr.uikit_dp0, R$attr.uikit_dp16, 4));
                }
                eVarA = u.a(eVarB3);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                c2 = '\f';
            }
            eVarB.addAll(eVarA);
            it9 = it10;
            str2 = str;
        }
        aim.e eVarA2 = u.a(eVarB);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.revolut_pay_payment_schedule_title, null, null, 14);
        Integer numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
        PaymentScheduleSelection paymentScheduleSelection2 = domainState.f159621c;
        Intrinsics.checkNotNullParameter(paymentScheduleSelection2, "<this>");
        return new c(eVarA2, textLocalisedClause3, numValueOf, new aw0.e(false, paymentScheduleSelection2 instanceof PaymentScheduleSelection.PayLater ? new TextLocalisedClause(R$string.revolut_pay_payment_schedule_pay_later_disclaimer, null, null, 14) : null, b0.ABOVE_BUTTONS, new n6(new TextLocalisedClause(R$string.revolut_pay_common_action_select, null, null, 14), LargeActionButton.ButtonStyle.e, null, "SELECT_PAYMENT_SCHEDULE_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, 49));
    }
}
