package wuk;

import com.revolut.core.ui_kit.delegates.CandleStickGraphDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.y1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartPointFacade;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChartPoint;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.c2;
import ip0.nb0;
import ip0.pb0;
import ip0.qt;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import le.u1;
import org.joda.time.DateTime;
import qv0.c;
import z0h.k0;
import z0h.p1;
import z0h.t1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300176a;

    public /* synthetic */ c(int i) {
        this.f300176a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f300176a) {
            case 0:
                CandleStickGraphDelegate.a state = (CandleStickGraphDelegate.a) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                od0.h hVar = od0.i.Companion;
                y1 y1Var = state instanceof y1 ? (y1) state : null;
                hVar.getClass();
                return od0.h.a(y1Var);
            case 1:
                j it8 = (j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f300182a;
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                nel.n nVar = (nel.n) pair.f186385a;
                t1 t1Var = (t1) pair.f186386b;
                Links links = t1Var.f318563a;
                hel.b bVar = t1Var.f318564b;
                return new p1(zhm.u.c(new k0(links, bVar, nVar.f214597c, nVar.i)), bVar);
            case 3:
                j it9 = (j) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f300182a;
            case 4:
                j it10 = (j) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f300182a;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return m.f300201a;
            case 6:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new ResourceImage(R$drawable.uikit_icn_circle_background, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone5), (List) null, (ImageTransformations) null, (Clause) null, 246);
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(2);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ContactsWidgetDelegate.Model.Companion companion = ContactsWidgetDelegate.Model.INSTANCE;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_area_recents_title, null, null, 14);
                c2 c2Var = c2.CIRCLE;
                companion.getClass();
                return zhm.u.c(ContactsWidgetDelegate.Model.Companion.a("ApmAreaContactsMapper_widget", textLocalisedClause, c2Var, null, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.u.c(RowsWidgetDelegate.Model.Companion.g(RowsWidgetDelegate.Model.INSTANCE, "ApmAreaTransactionsMapper_header", new TextLocalisedClause(R$string.apm_area_transactions_title, null, null, 14)));
            case 11:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new wv2.g(4, new TextLocalisedClause(com.revolut.feature.card.view_pin.api.R$string.card_view_pin_title, null, null, 14), (List) getDefaultLoadingItems.invoke());
            case 12:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new wv4.e((zm4.a) pair2.f186385a, (um4.a) pair2.f186386b);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = zhm.u.b();
                Intrinsics.checkNotNullParameter("statement_bottom_sheet_linear_progress_loading_id", "listId");
                int i = R$attr.uikit_dp16;
                qt qtVar = new qt();
                qtVar.f166054a = c.d.f249513a;
                qtVar.f166055b = null;
                qtVar.f166056c = null;
                qtVar.d = null;
                qtVar.e = null;
                qtVar.f = i;
                qtVar.f166057g = i;
                qtVar.f166058h = i;
                qtVar.i = i;
                yp0.b.l(qtVar, 0, 0, 0, 0, null, false, 63);
                eVarB.add(qtVar);
                vim.f it11 = new IntRange(1, 2, 1).iterator();
                while (it11.f289625c) {
                    pb0 pb0VarB = nb0.b(pb0.Companion, a0.d.n("statement_bottom_sheet_loading_row_", it11.nextInt()), false, 0, false, 22);
                    yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                    eVarB.add(pb0VarB);
                }
                return new wv4.h(zhm.u.a(eVarB), null);
            case 14:
                Optional chartFacadeOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional, "chartFacadeOptional");
                return chartFacadeOptional.map(new bpd.a(new c(15), 24));
            case 15:
                TotalValueChartFacade totalValueChartFacade = (TotalValueChartFacade) obj2;
                DateTime dateTime = totalValueChartFacade.f94985a;
                DateTime dateTime2 = totalValueChartFacade.f94986b;
                List<TotalValueChartPointFacade> list = totalValueChartFacade.f94987c;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (TotalValueChartPointFacade totalValueChartPointFacade : list) {
                    DateTime dateTime3 = totalValueChartPointFacade.f94988a;
                    dj0.d dVar = totalValueChartPointFacade.f94989b;
                    dj0.d dVar2 = totalValueChartPointFacade.f94990c;
                    if (dVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList.add(new TotalValueChartPoint(dVar, dVar2, dateTime3));
                }
                dj0.d dVar3 = totalValueChartFacade.d;
                if (dVar3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dj0.d dVar4 = totalValueChartFacade.e;
                if (dVar4 != null) {
                    return new TotalValueChart(dVar3, dVar4, arrayList, dateTime, dateTime2);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 16:
                Optional chartFacadeOptional2 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional2, "chartFacadeOptional");
                return chartFacadeOptional2.map(new bpd.a(new c(17), 25));
            case 17:
                TotalValueChartFacade totalValueChartFacade2 = (TotalValueChartFacade) obj2;
                DateTime dateTime4 = totalValueChartFacade2.f94985a;
                DateTime dateTime5 = totalValueChartFacade2.f94986b;
                List<TotalValueChartPointFacade> list2 = totalValueChartFacade2.f94987c;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (TotalValueChartPointFacade totalValueChartPointFacade2 : list2) {
                    arrayList2.add(new SimpleTotalValueChartPoint(totalValueChartPointFacade2.f94989b, totalValueChartPointFacade2.f94988a));
                }
                return new SimpleTotalValueChart(dateTime4, dateTime5, arrayList2);
            case 18:
                iwg.a it12 = (iwg.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.toString();
            case 19:
                uvg.j dto = (uvg.j) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                List<uvg.k> items = dto.getItems();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(items, 10));
                for (uvg.k kVar : items) {
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    LocalDate localDate = LocalDate.parse(kVar.getDate());
                    Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
                    arrayList3.add(new mwg.g(localDate, kVar.getSymbol(), kVar.getRef(), mo3.a.o(kVar.getAmount())));
                }
                return arrayList3;
            case 20:
                Optional chartFacadeOptional3 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional3, "chartFacadeOptional");
                return chartFacadeOptional3.map(new bpd.a(new c(21), 26));
            case 21:
                TotalValueChartFacade totalValueChartFacade3 = (TotalValueChartFacade) obj2;
                DateTime dateTime6 = totalValueChartFacade3.f94985a;
                DateTime dateTime7 = totalValueChartFacade3.f94986b;
                List<TotalValueChartPointFacade> list3 = totalValueChartFacade3.f94987c;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                for (TotalValueChartPointFacade totalValueChartPointFacade3 : list3) {
                    DateTime dateTime8 = totalValueChartPointFacade3.f94988a;
                    dj0.d dVar5 = totalValueChartPointFacade3.f94989b;
                    dj0.d dVar6 = totalValueChartPointFacade3.f94990c;
                    if (dVar6 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    arrayList4.add(new TotalValueChartPoint(dVar5, dVar6, dateTime8));
                }
                dj0.d dVar7 = totalValueChartFacade3.d;
                if (dVar7 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                dj0.d dVar8 = totalValueChartFacade3.e;
                if (dVar8 != null) {
                    return new TotalValueChart(dVar7, dVar8, arrayList4, dateTime6, dateTime7);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 22:
                Optional chartFacadeOptional4 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(chartFacadeOptional4, "chartFacadeOptional");
                return chartFacadeOptional4.map(new bpd.a(new c(23), 27));
            case 23:
                TotalValueChartFacade totalValueChartFacade4 = (TotalValueChartFacade) obj2;
                DateTime dateTime9 = totalValueChartFacade4.f94985a;
                DateTime dateTime10 = totalValueChartFacade4.f94986b;
                List<TotalValueChartPointFacade> list4 = totalValueChartFacade4.f94987c;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list4, 10));
                for (TotalValueChartPointFacade totalValueChartPointFacade4 : list4) {
                    arrayList5.add(new SimpleTotalValueChartPoint(totalValueChartPointFacade4.f94989b, totalValueChartPointFacade4.f94988a));
                }
                return new SimpleTotalValueChart(dateTime9, dateTime10, arrayList5);
            case 24:
                Pair it13 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return u1.a(it13.f186385a);
            case 25:
                Pair it14 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return u1.a(it14.f186385a);
            case 26:
                Optional facadeOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(facadeOptional, "facadeOptional");
                return facadeOptional.map(new com.google.android.material.color.utilities.f(11, new c(27)));
            case 27:
                return ((xvg.a) obj2).f309262a;
            case 28:
                Optional facadeOptional2 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(facadeOptional2, "facadeOptional");
                return facadeOptional2.map(new com.google.android.material.color.utilities.f(12, new c(29)));
            default:
                return ((xvg.a) obj2).f309262a;
        }
    }
}
