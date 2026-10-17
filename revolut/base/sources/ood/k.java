package ood;

import android.webkit.WebView;
import androidx.room.RoomDatabase;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContainerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.FullScreenStateWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d1;
import com.revolut.core.ui_kit.delegates.widgets.e2;
import com.revolut.core.ui_kit.delegates.widgets.i2;
import com.revolut.core.ui_kit.delegates.widgets.s4;
import com.revolut.core.ui_kit.delegates.widgets.v4;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f227053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f227054c;

    public /* synthetic */ k(Object obj2, Object obj3, int i) {
        this.f227052a = i;
        this.f227053b = obj2;
        this.f227054c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        fod.c cVar;
        Trip trip;
        ps6.l lVar;
        int i = this.f227052a;
        int i2 = 2;
        int i3 = 4;
        String str = null;
        String text = null;
        ps6.o oVar = null;
        String text2 = null;
        ps6.i iVar = null;
        String text3 = null;
        ps6.b bVar = null;
        str = null;
        str = null;
        Object obj3 = this.f227054c;
        Object obj4 = this.f227053b;
        switch (i) {
            case 0:
                TripsListController tripsListController = (TripsListController) obj4;
                WebView webView = (WebView) obj3;
                qod.h it8 = (qod.h) obj2;
                TripsListController.Companion aVar = TripsListController.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof qod.g) {
                    BasicNavBar basicNavBar = tripsListController.e3().f153695b;
                    Intrinsics.checkNotNullExpressionValue(basicNavBar, "basicNavBar");
                    if (!basicNavBar.isLaidOut() || basicNavBar.isLayoutRequested()) {
                        basicNavBar.addOnLayoutChangeListener(new bx0.v(tripsListController, webView, 11));
                    } else {
                        String str2 = tripsListController.Z;
                        if (str2 != null) {
                            qod.d dVar = qod.d.HIGH;
                            List list = tripsListController.Y;
                            if (list == null) {
                                list = zhm.f0.f322471a;
                            }
                            List list2 = list;
                            Boolean bool = tripsListController.f87633a0;
                            ngm.n.s(webView, new qod.c(dVar, list2, str2, bool != null ? bool.booleanValue() : false, Integer.valueOf(TripsListController.d3(tripsListController))));
                        }
                    }
                } else {
                    if (!Intrinsics.f(it8, qod.f.f248164a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "globe_html", "Globe initialization error", null, h0Var);
                }
                return Unit.f186387a;
            case 1:
                q0 q0Var = (q0) obj4;
                AccountId accountId = (AccountId) obj3;
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                String str3 = (String) kVar.f288454a;
                List list3 = (List) kVar.f288455b;
                List trips = (List) kVar.f288456c;
                amd.i spendingFilter = (amd.i) kVar.d;
                Set set = (Set) kVar.e;
                fod.k kVar2 = q0Var.f227069p;
                CoroutineScope coroutineScope = q0Var.f227076y;
                Object content = ((a) ((j2) q0Var.C.f22677a).getValue()).f227028a.getContent();
                g gVar = content instanceof g ? (g) content : null;
                if (gVar != null && (cVar = gVar.f227040c) != null && (trip = cVar.f136925a) != null) {
                    str = trip.f99263a;
                }
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(trips, "trips");
                Intrinsics.checkNotNullParameter(spendingFilter, "spendingFilter");
                return nim.a.v(zh9.u0.m(boh.f.e(kVar2.e(trips), new a5b.a(str, (Object) trips, (Object) kVar2, (Object) coroutineScope, (Object) spendingFilter, 14)), new olf.e(q0Var.f227070q.f227093a, i3)), new kwg.e(list3, accountId, str3, set, q0Var, spendingFilter));
            case 2:
                return a.a((a) ((j2) ((q0) obj4).C.f22677a).getValue(), null, null, null, false, false, ((Trip) obj3).d, 31);
            case 3:
                wi0.b bVar2 = (wi0.b) obj4;
                oog.g update = (oog.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data country = zi0.c.P(bVar2, false, null, 3);
                oog.h cityFieldType = ((com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) obj3).I2(bVar2);
                update.getClass();
                Intrinsics.checkNotNullParameter(country, "country");
                Intrinsics.checkNotNullParameter("", "city");
                Intrinsics.checkNotNullParameter(cityFieldType, "cityFieldType");
                return new oog.g(country, "", cityFieldType);
            case 4:
                Data data = (Data) obj4;
                return oog.g.a((oog.g) obj2, data, null, ((com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) obj3).I2((wi0.b) data.getContent()), 2);
            case 5:
                com.revolut.core.ui_kit.delegates.widgets.o0 holder = (com.revolut.core.ui_kit.delegates.widgets.o0) obj2;
                Intrinsics.checkNotNullParameter(holder, "holder");
                return ((ContainerWidgetDelegate) obj4).t((BaseRecyclerViewDelegate) obj3, new o10.c(holder, 25));
            case 6:
                BaseDraggableWidgetDelegate.a event = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                ((ContainerWidgetDelegate) obj4).r((ContainerWidgetDelegate.Model) obj3, event);
                return Unit.f186387a;
            case 7:
                FullScreenStateWidgetDelegate.Model model = (FullScreenStateWidgetDelegate.Model) obj3;
                FullScreenStateDelegate.Model model2 = (FullScreenStateDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                ((FullScreenStateWidgetDelegate) obj4).r(model, new com.revolut.core.ui_kit.delegates.widgets.x0(model.e, model2));
                return Unit.f186387a;
            case 8:
                GoalProgressWidgetDelegate.Model model3 = (GoalProgressWidgetDelegate.Model) obj3;
                ty0.a it9 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((GoalProgressWidgetDelegate) obj4).r(model3, new d1(model3.f55144b, it9));
                return Unit.f186387a;
            case 9:
                e2 holder2 = (e2) obj2;
                Intrinsics.checkNotNullParameter(holder2, "holder");
                return ((GridWidgetDelegate) obj4).w((List) obj3, new o10.c(holder2, 26));
            case 10:
                BaseDraggableWidgetDelegate.a event2 = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event2, "event");
                ((GridWidgetDelegate) obj4).r((GridWidgetDelegate.Model) obj3, event2);
                return Unit.f186387a;
            case 11:
                i2 holder3 = (i2) obj2;
                Intrinsics.checkNotNullParameter(holder3, "holder");
                return ((HorizontalScrollerWidgetDelegate) obj4).w((List) obj3, new o10.c(holder3, 27));
            case 12:
                BaseDraggableWidgetDelegate.a event3 = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event3, "event");
                ((HorizontalScrollerWidgetDelegate) obj4).r((HorizontalScrollerWidgetDelegate.Model) obj3, event3);
                return Unit.f186387a;
            case 13:
                BaseDraggableWidgetDelegate.a event4 = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event4, "event");
                ((PhotoBannerWidgetDelegate) obj4).r((PhotoBannerWidgetDelegate.Model) obj3, event4);
                return Unit.f186387a;
            case 14:
                BaseDraggableWidgetDelegate.a event5 = (BaseDraggableWidgetDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(event5, "event");
                ((TilePaginatedGridWidgetDelegate) obj4).r((TilePaginatedGridWidgetDelegate.Model) obj3, event5);
                return Unit.f186387a;
            case 15:
                TravelModeWidgetDelegate.Model model4 = (TravelModeWidgetDelegate.Model) obj3;
                v4 product = (v4) obj2;
                TravelModeWidgetDelegate.Companion aVar2 = TravelModeWidgetDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(product, "product");
                ((TravelModeWidgetDelegate) obj4).r(model4, new s4(model4.f55280b, product));
                return Unit.f186387a;
            case 16:
                opi.b bVar3 = (opi.b) obj4;
                rp0.y yVar = (rp0.y) obj3;
                if (((cr0.h) obj2) != cr0.h.HIDDEN) {
                    bVar3.b0(yVar);
                } else {
                    bVar3.Z(yVar);
                }
                return Unit.f186387a;
            case 17:
                oq3.m mVar = (oq3.m) obj4;
                pfm.h hVar = (pfm.h) obj3;
                Boolean isCreditCardLimitIncreaseOfferAvailable = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isCreditCardLimitIncreaseOfferAvailable, "isCreditCardLimitIncreaseOfferAvailable");
                return isCreditCardLimitIncreaseOfferAvailable.booleanValue() ? new pfm.a(mVar.f227724c.a(), new oq3.f(i2, new oq3.g(hVar, 0)), i3).D(Boolean.TRUE) : efm.d0.m(Boolean.FALSE);
            case 18:
                oq3.m mVar2 = (oq3.m) obj4;
                ds3.c configuration = (ds3.c) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                hz3.c cVar2 = mVar2.f227726h;
                String invitationId = ((pq3.h) obj3).f238677b.e(4);
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(invitationId, "invitationId");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                aj4.c.Companion.getClass();
                return mVar2.i(new ActivityNavigateCommand(aj4.a.f5397b, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.DeclineInvitationPopup(invitationId, configuration, null).f98274b), null, Integer.valueOf(RoomDatabase.MAX_BIND_PARAMETER_CNT), 0, null, null, null, null, false, 1012));
            case 19:
                ((Ref$IntRef) obj4).f186408a = ((Integer) obj2).intValue();
                ((CountDownLatch) obj3).countDown();
                return Unit.f186387a;
            case 20:
                orb.c cVar3 = (orb.c) obj4;
                OrderQuote exchangeOrderQuote = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchangeOrderQuote, "exchangeOrderQuote");
                Amount amountV = e1.v(exchangeOrderQuote);
                return nim.a.v(cVar3.a((nel.n) obj3, bfl.g.BUY, qrb.b.AMOUNT, amountV.f104717a), new orb.a(cVar3, amountV));
            case 21:
                os6.b bVar4 = (os6.b) obj4;
                String str4 = (String) obj3;
                js6.i iVar2 = bVar4.f229242c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM tax_hub_calendar_event WHERE id = ?");
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str4);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tax_type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "period");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accounting_start_date");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accounting_end_date");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completed_date");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "filing_start_date");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "filing_end_date");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "steps");
                    if (sQLiteStatementPrepare.step()) {
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        LocalDate localDateC = iVar2.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        LocalDate localDateC2 = iVar2.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        LocalDate localDateC3 = iVar2.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        LocalDate localDateC4 = iVar2.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        LocalDate localDateC5 = iVar2.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            text3 = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        }
                        bVar4.d.getClass();
                        bVar = new ps6.b(text4, text5, text6, text7, localDateC, localDateC2, localDateC3, localDateC4, localDateC5, ns6.a.a(text3));
                    }
                    sQLiteStatementPrepare.close();
                    return bVar;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 22:
                return Long.valueOf(((os6.b) obj4).f229241b.insertAndReturnId((SQLiteConnection) obj2, (ps6.b) obj3));
            case 23:
                os6.d dVar2 = (os6.d) obj4;
                String str5 = (String) obj3;
                dVar2.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM tax_hub_tax_profile WHERE id = ?");
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str5);
                    }
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "tax_type");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "notifications_enabled");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "state");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "scheduling_options_period");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "scheduling_options_next_payment_date");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "scheduling_options_closing_month");
                    if (sQLiteStatementPrepare2.step()) {
                        String text8 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow11);
                        String text9 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12);
                        boolean z = ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow13)) != 0;
                        String text10 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow14);
                        String text11 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow15);
                        LocalDate localDateC6 = dVar2.f229248c.c(sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow16));
                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow17)) {
                            text2 = sQLiteStatementPrepare2.getText(columnIndexOrThrow17);
                        }
                        iVar = new ps6.i(text8, text9, new ps6.h(text11, text2, localDateC6), z, text10);
                    }
                    sQLiteStatementPrepare2.close();
                    return iVar;
                } finally {
                }
            case 24:
                return Long.valueOf(((os6.d) obj4).f229247b.insertAndReturnId((SQLiteConnection) obj2, (ps6.i) obj3));
            case 25:
                return ((os6.e) obj4).f229250b.insertAndReturnIdsList((SQLiteConnection) obj2, (ArrayList) obj3);
            case 26:
                return Long.valueOf(((os6.e) obj4).f229250b.insertAndReturnId((SQLiteConnection) obj2, (ps6.j) obj3));
            case 27:
                os6.f fVar = (os6.f) obj4;
                String str6 = (String) obj3;
                fVar.getClass();
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM vat_summary WHERE vat_reminder_id = ?");
                try {
                    if (str6 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str6);
                    }
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "vat_reminder_id");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "assessment_period");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "next_vat_return_due_date");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "summary_total_sales_amount");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "summary_total_sales_currency");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "summary_tax_rate_type");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "summary_tax_rate_value");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "summary_total_tax_amount");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "summary_total_tax_currency");
                    if (sQLiteStatementPrepare3.step()) {
                        String text12 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow18);
                        String text13 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow19);
                        LocalDate localDateC7 = fVar.f229253c.c(sQLiteStatementPrepare3.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow20));
                        ps6.m mVar3 = new ps6.m(sQLiteStatementPrepare3.getLong(columnIndexOrThrow21), sQLiteStatementPrepare3.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow22));
                        if (sQLiteStatementPrepare3.isNull(columnIndexOrThrow23) && sQLiteStatementPrepare3.isNull(columnIndexOrThrow24)) {
                            lVar = null;
                        } else {
                            lVar = new ps6.l(sQLiteStatementPrepare3.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow23), sQLiteStatementPrepare3.getDouble(columnIndexOrThrow24));
                        }
                        long j2 = sQLiteStatementPrepare3.getLong(columnIndexOrThrow25);
                        if (!sQLiteStatementPrepare3.isNull(columnIndexOrThrow26)) {
                            text = sQLiteStatementPrepare3.getText(columnIndexOrThrow26);
                        }
                        oVar = new ps6.o(text12, text13, new ps6.k(mVar3, lVar, new ps6.n(j2, text)), localDateC7);
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return oVar;
                } finally {
                }
            case 28:
                return Long.valueOf(((os6.f) obj4).f229252b.insertAndReturnId((SQLiteConnection) obj2, (ps6.o) obj3));
            default:
                do3.n nVar = (do3.n) obj3;
                List groupMembersRemindersInvite = (List) obj2;
                Intrinsics.checkNotNullParameter(groupMembersRemindersInvite, "groupMembersRemindersInvite");
                Intrinsics.h(nVar);
                return new os9.k((PaymentGroup) obj4, nVar, groupMembersRemindersInvite);
        }
    }
}
