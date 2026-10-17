package wvg;

import android.content.res.Configuration;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.ManageEcommercePluginFlowContract$State;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ReferralCampaignV4;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.impl.ui.account.AccountsStatementsContract$SelectableCurrency;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.retail.core.navigation.IntentCommand;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import jel.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import tof.i7;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f300352b;

    public /* synthetic */ d0(Object obj2, int i) {
        this.f300351a = i;
        this.f300352b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f300351a;
        Continuation continuation = null;
        Object obj3 = this.f300352b;
        switch (i) {
            case 0:
                d1 params = (d1) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (PerformanceChart) ((e0) obj3).f300363b.get(params.i);
            case 1:
                f1 params2 = (f1) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (mwg.i) ((g0) obj3).f300376b.get(params2.f300372h);
            case 2:
                g1 g1Var = (g1) obj3;
                uvg.r dto = (uvg.r) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                List<uvg.s> items = dto.getItems();
                ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
                for (uvg.s sVar : items) {
                    iwg.a analyticsProductType = g1Var.f300379b;
                    Intrinsics.checkNotNullParameter(sVar, "<this>");
                    Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                    String asset = sVar.getAsset();
                    LocalDate sellDate = sVar.getSellDate();
                    dj0.d dVarO = mo3.a.o(sVar.getPnlFifo());
                    dj0.d dVarO2 = mo3.a.o(sVar.getPnlAverage());
                    String ref2 = sVar.getRef();
                    ko3.a openingPrice = sVar.getOpeningPrice();
                    ej0.b bVarQ = openingPrice != null ? cj9.c.Q(openingPrice) : null;
                    String quantity = sVar.getQuantity();
                    arrayList.add(new mwg.k(analyticsProductType, asset, sellDate, dVarO, dVarO2, ref2, bVarQ, quantity != null ? new BigDecimal(quantity) : null));
                }
                return arrayList;
            case 3:
                uvg.a0 it8 = (uvg.a0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                a3 sector = ((y1) obj3).f300506c;
                Intrinsics.checkNotNullParameter(it8, "<this>");
                Intrinsics.checkNotNullParameter(sector, "sector");
                iwg.a aVarZ = kotlin.jvm.internal.s.z(it8.getAssetType());
                dj0.d dVarO3 = mo3.a.o(it8.getTotalValue());
                List<uvg.d> assets = it8.getAssets();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(assets, 10));
                for (uvg.d dVar : assets) {
                    String asset2 = dVar.getAsset();
                    String quantity2 = dVar.getQuantity();
                    BigDecimal bigDecimal = quantity2 != null ? new BigDecimal(quantity2) : BigDecimal.ZERO;
                    Intrinsics.h(bigDecimal);
                    arrayList2.add(new mwg.c(asset2, bigDecimal, mo3.a.o(dVar.getValue()), dVar.getAllocation(), dVar.getRef(), null, null, null, null));
                }
                return new mwg.l(aVarZ, sector, dVarO3, arrayList2);
            case 4:
                z1 z1Var = (z1) obj3;
                uvg.i dto2 = (uvg.i) obj2;
                Intrinsics.checkNotNullParameter(dto2, "dto");
                List<uvg.h> items2 = dto2.getItems();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(items2, 10));
                for (uvg.h hVar : items2) {
                    iwg.a analyticsProductType2 = z1Var.f300511b;
                    a3 sector2 = z1Var.f;
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    Intrinsics.checkNotNullParameter(analyticsProductType2, "analyticsProductType");
                    Intrinsics.checkNotNullParameter(sector2, "sector");
                    arrayList3.add(new mwg.m(analyticsProductType2, sector2, hVar.getAsset(), mo3.a.o(hVar.getPnl()), hVar.getReturns(), hVar.getClosedOn(), hVar.getRef()));
                }
                return arrayList3;
            case 5:
                b2 params3 = (b2) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (TotalValueChartFacade) ((t0) obj3).f300474b.get(params3.f300336h);
            case 6:
                ((ww0.b) obj3).f(h01.d.GESTURE);
                return Unit.f186387a;
            case 7:
                ManageEcommercePluginFlowContract$State manageEcommercePluginFlowContract$State = (ManageEcommercePluginFlowContract$State) obj3;
                Set enabledPlugins = manageEcommercePluginFlowContract$State.f73792a;
                Set installedPlugins = manageEcommercePluginFlowContract$State.f73793b;
                ((ManageEcommercePluginFlowContract$State) obj2).getClass();
                Intrinsics.checkNotNullParameter(enabledPlugins, "enabledPlugins");
                Intrinsics.checkNotNullParameter(installedPlugins, "installedPlugins");
                return new ManageEcommercePluginFlowContract$State(enabledPlugins, installedPlugins);
            case 8:
                owa.b it9 = (owa.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new pwa.m((ReferralCampaignV4) obj3, it9.f230433a, pwa.c.BENEFITS_SECTION);
            case 9:
                return wwi.h.a((wwi.h) obj2, null, (wwi.f) obj3, 1);
            case 10:
                wwj.f fVar = (wwj.f) obj3;
                com.revolut.kompot.common.flow.permissions.a output = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof sii.c;
                p0j.c cVar = p0j.c.f231546a;
                if (z || Intrinsics.f(output, a.C0596a.f98352a)) {
                    fVar.C2(cVar);
                } else {
                    if (!(output instanceof sii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    knm.b.j(fVar.l1(), new BridgeDestination(new IntentCommand(((s70.b) fVar.o).b(), null)));
                    fVar.C2(cVar);
                }
                return Unit.f186387a;
            case 11:
                int i2 = wx0.e.f;
                Intrinsics.checkNotNullParameter((Configuration) obj2, "it");
                ((wx0.e) obj3).c();
                return Unit.f186387a;
            case 12:
                ufm.g gVar = (ufm.g) obj3;
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                return enabled.booleanValue() ? ((u6k.h) ((vv9.c) gVar.f279885b)).d(true) : te0.w.h(new Data(zhm.f0.f322471a, null, false, 2, null));
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return com.revolut.domain.interactors.transactions.a.b(((wx9.d) obj3).f300793a, (i7) pair.f186385a, (List) pair.f186386b, null, null, null, 28).x().map(new wsg.k(new r1(22), 28)).startWith(new Data(zhm.f0.f322471a, null, true, 2, null));
            case 14:
                b21.a aVar = ((wxf.c) obj3).f300935c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_booking");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "image");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address_streetLine1");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address_streetLine2");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address_region");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address_city");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address_country");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "address_postcode");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        java.time.LocalDate localDateQ = b21.a.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        int i3 = columnIndexOrThrow;
                        arrayList4.add(new oxf.b(text, text2, text3, text4, localDateQ, text5, text6 != null ? LocalTime.parse(text6) : null, b21.a.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), (sQLiteStatementPrepare.isNull(columnIndexOrThrow9) && sQLiteStatementPrepare.isNull(columnIndexOrThrow10) && sQLiteStatementPrepare.isNull(columnIndexOrThrow11) && sQLiteStatementPrepare.isNull(columnIndexOrThrow12) && sQLiteStatementPrepare.isNull(columnIndexOrThrow13) && sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) ? null : new oxf.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14))));
                        columnIndexOrThrow = i3;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList4;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 15:
                wxh.j jVar = (wxh.j) obj3;
                if (Intrinsics.f((dii.g) obj2, dii.f.f115069a)) {
                    efm.r rVarX = ((yua.q) jVar.f300994n).k(jVar.f300992l.f96658a, null).x();
                    Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                    yji.n.j2(jVar, rd0.e.b(rVarX), null, new wkg.e(jVar, continuation, 21), 3);
                }
                return Unit.f186387a;
            case 16:
                sy9.b result = (sy9.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ((com.revolut.feature.payments.send_from_clipboard.impl.flow.a) obj3).C2(result);
                return Unit.f186387a;
            case 17:
                wyd.d0 d0Var = (wyd.d0) obj3;
                wyd.x update = (wyd.x) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Set<AccountsStatementsContract$SelectableCurrency> set = update.f301266b;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(set, 10));
                for (AccountsStatementsContract$SelectableCurrency accountsStatementsContract$SelectableCurrency : set) {
                    boolean zContains = d0Var.f301248a.contains(accountsStatementsContract$SelectableCurrency.f88284a);
                    xi0.b currency = accountsStatementsContract$SelectableCurrency.f88284a;
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    arrayList5.add(new AccountsStatementsContract$SelectableCurrency(currency, zContains));
                }
                return wyd.x.a(update, null, zhm.d0.i1(arrayList5), null, null, null, 29);
            case 18:
                return wyd.x.a((wyd.x) obj2, null, null, null, null, (wyd.u) obj3, 15);
            case 19:
                AccountStatementProduct accountStatementProduct = (AccountStatementProduct) obj3;
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : pockets) {
                    xi0.b bVarL = z92.f.l((io3.d) obj4);
                    if (Intrinsics.f(accountStatementProduct, AccountStatementProduct.Commodities.f88234a) ? cp5.d.y(bVarL) : cp5.d.A(bVarL)) {
                        arrayList6.add(obj4);
                    }
                }
                return arrayList6;
            case 20:
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) obj3;
                Optional selectedBenchmarkRefOptional = (Optional) obj2;
                Intrinsics.checkNotNullParameter(selectedBenchmarkRefOptional, "selectedBenchmarkRefOptional");
                jpc.e eVar = aVar2.o;
                cli.y yVar = aVar2.f95110w;
                WidgetisedAnalyticsType widgetisedAnalyticsType = ((wyg.a) ((j2) yVar.f22677a).getValue()).f301273b;
                j2 j2Var = (j2) yVar.f22677a;
                return eVar.S(widgetisedAnalyticsType, ((wyg.a) j2Var.getValue()).f301272a, ((wyg.a) j2Var.getValue()).f301275g, (String) gj7.b.m(selectedBenchmarkRefOptional));
            case 21:
                wyg.a update2 = (wyg.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return wyg.a.a(update2, null, null, null, (iwg.c) obj3, null, null, null, null, null, 32703);
            case 22:
                wyg.a update3 = (wyg.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return wyg.a.a(update3, null, null, null, null, null, null, null, (vyg.e) obj3, null, 28671);
            case 23:
                wyk.b bVar = (wyk.b) obj3;
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                yji.l.a1(bVar, bVar.X1(new nii.y0(null, bVar.f301305q.g(it10), false, 5)), null, null, new wkg.e(bVar, continuation, 24), 3);
                return Boolean.TRUE;
            case 24:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) ((wz1.f) obj3).f301345c.get("PENDING_TOPUP_REQUESTS_KEY");
            case 25:
                wz6.d update4 = (wz6.d) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data perksData = update4.f301372a;
                Intrinsics.checkNotNullParameter(perksData, "perksData");
                return new wz6.d(perksData, (cgc.g) obj3);
            case 26:
                x03.q qVar = (x03.q) obj3;
                Boolean juniorWallet = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(juniorWallet, "juniorWallet");
                return juniorWallet.booleanValue() ? qVar.f : qVar.e;
            case 27:
                com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b bVar2 = (com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b) obj3;
                til.r output2 = (til.r) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if ((output2 instanceof til.n) || (output2 instanceof til.q)) {
                    bVar2.l2(new x07.e(bVar2, null), new yi5.b(26));
                } else {
                    oki.h.D2(bVar2.f74070r);
                }
                return Unit.f186387a;
            case 28:
                g0b.c update5 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return g0b.c.a(update5, null, null, null, null, null, null, null, null, null, false, (c1b.e) obj3, null, null, 2064383);
            default:
                g0b.c update6 = (g0b.c) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return g0b.c.a(update6, (c1b.h) obj3, null, null, null, null, null, null, null, null, false, null, null, null, 2097116);
        }
    }
}
