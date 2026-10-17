package wuh;

import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.core.account.region.domain.model.AccountRegion;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreen;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsScreen;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoController;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountScreen;
import com.revolut.feature.invest.smart_notifications.api.domain.InsightPublicationPriceDescriptor;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreen;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreenContract$ModalStep;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreen;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreenContract$ModalStep;
import com.revolut.feature.rev_points.models.IssuedPoints;
import com.revolut.feature.topup_screen.impl.screens.external_card_details.ExternalCardDetailsScreen;
import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesLimit;
import com.revolut.feature.trading_orders.api.ui.widgets.free_trades_incentive.FreeTradesIncentiveContract$FreeTradesWidgetParcel;
import com.revolut.kompot.common.ModalDestination;
import h93.l0;
import io.fotoapparat.exception.camera.CameraException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import kp0.w0;
import nvg.h0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import pvg.y;
import wim.z;
import wvg.b2;
import wvg.d1;
import wvg.e0;
import wvg.f1;
import wvg.g0;
import wvg.r1;
import wvg.t0;
import wvg.v;
import wxe.f0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f300163w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f300163w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((com.revolut.feature.workflow.engine.sdk_flow.f) this.f300163w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q((wv4.i) this.f300163w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q((wvg.j) this.f300163w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q((wvg.k) this.f300163w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
            case 4:
                q qVar5 = new q((wvg.o) this.f300163w, continuation, 4);
                qVar5.v = obj2;
                return qVar5;
            case 5:
                q qVar6 = new q((wvg.q) this.f300163w, continuation, 5);
                qVar6.v = obj2;
                return qVar6;
            case 6:
                q qVar7 = new q((wvg.s) this.f300163w, continuation, 6);
                qVar7.v = obj2;
                return qVar7;
            case 7:
                q qVar8 = new q((v) this.f300163w, continuation, 7);
                qVar8.v = obj2;
                return qVar8;
            case 8:
                q qVar9 = new q((e0) this.f300163w, continuation, 8);
                qVar9.v = obj2;
                return qVar9;
            case 9:
                q qVar10 = new q((g0) this.f300163w, continuation, 9);
                qVar10.v = obj2;
                return qVar10;
            case 10:
                q qVar11 = new q((t0) this.f300163w, continuation, 10);
                qVar11.v = obj2;
                return qVar11;
            case 11:
                q qVar12 = new q((wvk.j) this.f300163w, continuation, 11);
                qVar12.v = obj2;
                return qVar12;
            case 12:
                q qVar13 = new q((wvl.d) this.f300163w, continuation, 12);
                qVar13.v = obj2;
                return qVar13;
            case 13:
                q qVar14 = new q((wvl.g) this.f300163w, continuation, 13);
                qVar14.v = obj2;
                return qVar14;
            case 14:
                q qVar15 = new q((wwi.q) this.f300163w, continuation, 14);
                qVar15.v = obj2;
                return qVar15;
            case 15:
                q qVar16 = new q((LocalGlobalCardInfoController) this.f300163w, continuation, 15);
                qVar16.v = obj2;
                return qVar16;
            case 16:
                q qVar17 = new q((wx6.j) this.f300163w, continuation, 16);
                qVar17.v = obj2;
                return qVar17;
            case 17:
                q qVar18 = new q((f0) this.f300163w, continuation, 17);
                qVar18.v = obj2;
                return qVar18;
            case 18:
                q qVar19 = new q((wz6.g) this.f300163w, continuation, 18);
                qVar19.v = obj2;
                return qVar19;
            case 19:
                q qVar20 = new q((RevPointsExpiryHomeScreen) this.f300163w, continuation, 19);
                qVar20.v = obj2;
                return qVar20;
            case 20:
                q qVar21 = new q((ExternalCardDetailsScreen) this.f300163w, continuation, 20);
                qVar21.v = obj2;
                return qVar21;
            case 21:
                q qVar22 = new q((x0l.i) this.f300163w, continuation, 21);
                qVar22.v = obj2;
                return qVar22;
            case 22:
                q qVar23 = new q((SmartFeedScreen) this.f300163w, continuation, 22);
                qVar23.v = obj2;
                return qVar23;
            case 23:
                q qVar24 = new q((QrScanningScreen) this.f300163w, continuation, 23);
                qVar24.v = obj2;
                return qVar24;
            case 24:
                q qVar25 = new q((com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d) this.f300163w, continuation, 24);
                qVar25.v = obj2;
                return qVar25;
            case 25:
                q qVar26 = new q((DeFiExchangeAmountScreen) this.f300163w, continuation, 25);
                qVar26.v = obj2;
                return qVar26;
            case 26:
                q qVar27 = new q((TransferSettingsScreen) this.f300163w, continuation, 26);
                qVar27.v = obj2;
                return qVar27;
            case 27:
                q qVar28 = new q((x46.b) this.f300163w, continuation, 27);
                qVar28.v = obj2;
                return qVar28;
            case 28:
                return new q((x4l.c) this.f300163w, this.v, continuation);
            default:
                return new q((x60.c) this.v, (String) this.f300163w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v120, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v135, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        int i = 16;
        int i2 = 17;
        int i3 = 2;
        int i5 = 11;
        int i6 = 6;
        ArrayList arrayList = null;
        switch (this.u) {
            case 0:
                com.revolut.feature.workflow.engine.sdk_flow.f fVar = (com.revolut.feature.workflow.engine.sdk_flow.f) this.f300163w;
                Integer num = (Integer) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (num != null && num.intValue() == 30000) {
                    fVar.C2(c.f300148a);
                } else {
                    com.revolut.feature.workflow.engine.sdk_flow.f.P2(fVar);
                }
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wv4.i iVar = (wv4.i) this.f300163w;
                iVar.H2(iVar.f300297s, new wug.i(data, i5));
                return Unit.f186387a;
            case 2:
                wvg.c cVar = (wvg.c) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                yhm.r rVarF = ((wvg.j) this.f300163w).f300399c.f(cVar.f, cVar.f300339c.f306286a, cVar.d);
                pvg.g gVar = (pvg.g) rVarF.f314201a;
                List<pvg.f> cashEntities = (List) rVarF.f314202b;
                List<pvg.e> assetEntities = (List) rVarF.f314203c;
                if (gVar == null) {
                    return null;
                }
                List analyticsProductTypes = cVar.f300338b;
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Intrinsics.checkNotNullParameter(cashEntities, "cashEntities");
                Intrinsics.checkNotNullParameter(assetEntities, "assetEntities");
                Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
                boolean z = gVar.f240132b;
                dj0.d dVarV = hx7.a.v(gVar.d);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (pvg.f fVar2 : cashEntities) {
                    iwg.a aVar4 = fVar2.f240122b;
                    Object arrayList2 = linkedHashMap.get(aVar4);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(aVar4, arrayList2);
                    }
                    ((List) arrayList2).add(new mwg.d(fVar2.e, hx7.a.v(fVar2.f), fVar2.f240124g));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (pvg.e eVar : assetEntities) {
                    iwg.a aVar5 = eVar.f240111b;
                    Object obj3 = linkedHashMap2.get(aVar5);
                    Object obj4 = obj3;
                    if (obj3 == null) {
                        ArrayList arrayList3 = new ArrayList();
                        linkedHashMap2.put(aVar5, arrayList3);
                        obj4 = arrayList3;
                    }
                    List list = (List) obj4;
                    String str = eVar.e;
                    BigDecimal bigDecimal = new BigDecimal(eVar.f);
                    dj0.d dVarV2 = hx7.a.v(eVar.f240113g);
                    float f = eVar.f240114h;
                    String str2 = eVar.i;
                    ko3.b bVar = eVar.f240115j;
                    ej0.b bVarI = bVar != null ? cp5.c.I(bVar) : null;
                    ko3.b bVar2 = eVar.k;
                    ej0.b bVarI2 = bVar2 != null ? cp5.c.I(bVar2) : null;
                    String str3 = eVar.f240116l;
                    String str4 = eVar.f240117m;
                    list.add(new mwg.c(str, bigDecimal, dVarV2, f, str2, bVarI, bVarI2, str3, str4 != null ? new BigDecimal(str4) : null));
                }
                return new mwg.e(analyticsProductTypes, z, dVarV, linkedHashMap, linkedHashMap2);
            case 3:
                wvg.d dVar = (wvg.d) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listD = ((wvg.k) this.f300163w).f300406c.d(dVar.f300348c, dVar.f300347b, dVar.e, dVar.f, dVar.d.f306286a);
                Intrinsics.checkNotNullParameter(listD, "<this>");
                List<pvg.h> list2 = listD;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                for (pvg.h hVar : list2) {
                    iwg.a aVar7 = hVar.f240139a;
                    boolean z3 = hVar.d;
                    String str5 = hVar.f;
                    dj0.d dVarV3 = hx7.a.v(hVar.f240142g);
                    float f4 = hVar.f240143h;
                    Float f5 = hVar.i;
                    LocalDate localDate = hVar.f240144j;
                    String str6 = hVar.k;
                    ko3.b bVar3 = hVar.f240145l;
                    ej0.b bVarI3 = bVar3 != null ? cp5.c.I(bVar3) : null;
                    String str7 = hVar.f240146m;
                    String str8 = hVar.f240147n;
                    arrayList4.add(new mwg.f(aVar7, z3, str5, dVarV3, f4, f5, localDate, str6, bVarI3, str7, str8 != null ? new BigDecimal(str8) : null));
                }
                if (arrayList4.isEmpty()) {
                    return null;
                }
                return arrayList4;
            case 4:
                wvg.l lVar = (wvg.l) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nvg.n nVar = ((wvg.o) this.f300163w).f300432c;
                String strK0 = d0.k0(lVar.f300414c, "_", null, null, 0, null, 62);
                eel.c cVar2 = lVar.f300413b;
                String str9 = lVar.d.f306286a;
                iwg.c cVar3 = lVar.e;
                String str10 = lVar.f;
                if (str10 == null) {
                    str10 = "";
                }
                return jb3.l.A(nVar.d(strK0, cVar2, str9, cVar3, str10));
            case 5:
                wvg.p pVar = (wvg.p) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listD2 = ((wvg.q) this.f300163w).f300453c.d(pVar.f300443c, pVar.f300441a, d0.k0(pVar.f300442b, "_", null, null, 0, null, 62), pVar.d.f306286a);
                Intrinsics.checkNotNullParameter(listD2, "<this>");
                pvg.l lVar2 = (pvg.l) d0.d0(listD2);
                if (lVar2 == null) {
                    return null;
                }
                DateTime dateTime = lVar2.e;
                DateTime dateTime2 = lVar2.f;
                List<pvg.l> list3 = listD2;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                for (pvg.l lVar3 : list3) {
                    DateTime dateTime3 = lVar3.e;
                    DateTime dateTime4 = lVar3.f;
                    dj0.d dVarV4 = hx7.a.v(lVar3.f240181g);
                    jo3.b bVar4 = lVar3.f240182h;
                    arrayList5.add(new mwg.j(dateTime3, dateTime4, dVarV4, bVar4 != null ? hx7.a.v(bVar4) : null, hx7.a.v(lVar3.i)));
                }
                return new mwg.i(dateTime, dateTime2, arrayList5, null);
            case 6:
                wvg.r rVar = (wvg.r) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List listD3 = ((wvg.s) this.f300163w).f300469c.d(rVar.f300461g, rVar.f300460c, rVar.e.f306286a);
                Intrinsics.checkNotNullParameter(listD3, "<this>");
                if (listD3.isEmpty()) {
                    return null;
                }
                List<pvg.o> list4 = listD3;
                ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
                for (pvg.o oVar : list4) {
                    iwg.a aVar11 = oVar.f240192b;
                    String str11 = oVar.e;
                    LocalDate localDate2 = oVar.f;
                    dj0.d dVarV5 = hx7.a.v(oVar.f240194g);
                    dj0.d dVarV6 = hx7.a.v(oVar.f240195h);
                    String str12 = oVar.i;
                    ko3.b bVar5 = oVar.f240196j;
                    ej0.b bVarI4 = bVar5 != null ? cp5.c.I(bVar5) : null;
                    String str13 = oVar.k;
                    arrayList6.add(new mwg.k(aVar11, str11, localDate2, dVarV5, dVarV6, str12, bVarI4, str13 != null ? new BigDecimal(str13) : null));
                }
                return arrayList6;
            case 7:
                wvg.e eVar2 = (wvg.e) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return knm.b.E(((v) this.f300163w).d.d(eVar2.f300358a, wvg.w.a(eVar2.f300359b), eVar2.f300360c, eVar2.e.f306286a, eVar2.f));
            case 8:
                d1 d1Var = (d1) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nvg.e0 e0Var = ((e0) this.f300163w).f300364c;
                iwg.a aVar14 = d1Var.f300354b;
                eel.c cVar4 = d1Var.f300355c;
                String str14 = d1Var.e.f306286a;
                iwg.c cVar5 = d1Var.f;
                String str15 = d1Var.f300356g;
                String str16 = d1Var.f300357h;
                if (str16 == null) {
                    str16 = "LOCAL_PORTFOLIO_ID";
                }
                return w0.v(e0Var.d(aVar14, cVar4, str14, cVar5, str15, str16));
            case 9:
                f1 f1Var = (f1) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0 h0Var = ((g0) this.f300163w).f300377c;
                iwg.a aVar16 = f1Var.f300370c;
                eel.c cVar6 = f1Var.d;
                String str17 = f1Var.f.f306286a;
                String str18 = f1Var.f300369b;
                if (str18 == null) {
                    str18 = "LOCAL_PORTFOLIO_ID";
                }
                List listD4 = h0Var.d(aVar16, cVar6, str17, str18, f1Var.f300371g);
                Intrinsics.checkNotNullParameter(listD4, "<this>");
                y yVar = (y) d0.d0(listD4);
                if (yVar == null) {
                    return null;
                }
                DateTime dateTime5 = yVar.f;
                DateTime dateTime6 = yVar.f240251g;
                List<y> list5 = listD4;
                ArrayList arrayList7 = new ArrayList(w.t(list5, 10));
                for (y yVar2 : list5) {
                    DateTime dateTime7 = yVar2.f;
                    DateTime dateTime8 = yVar2.f240251g;
                    dj0.d dVarV7 = hx7.a.v(yVar2.k);
                    jo3.b bVar6 = yVar2.f240254l;
                    arrayList7.add(new mwg.j(dateTime7, dateTime8, dVarV7, bVar6 != null ? hx7.a.v(bVar6) : null, hx7.a.v(yVar2.f240255m)));
                }
                return new mwg.i(dateTime5, dateTime6, arrayList7, yVar.f240252h);
            case 10:
                b2 b2Var = (b2) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nvg.t0 t0Var = ((t0) this.f300163w).f300475c;
                iwg.a aVar18 = b2Var.f300333b;
                eel.c cVar7 = b2Var.f300334c;
                String str19 = b2Var.e.f306286a;
                String str20 = b2Var.f;
                if (str20 == null) {
                    str20 = "LOCAL_PORTFOLIO_ID";
                }
                return md6.s.r(t0Var.d(aVar18, cVar7, str19, str20, b2Var.f300335g));
            case 11:
                awk.h hVar2 = (awk.h) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wvk.j jVar = (wvk.j) this.f300163w;
                jVar.H2(jVar.f300550p, new uvk.m(hVar2, 1));
                return Unit.f186387a;
            case 12:
                FreeTradesIncentiveContract$FreeTradesWidgetParcel freeTradesIncentiveContract$FreeTradesWidgetParcel = (FreeTradesIncentiveContract$FreeTradesWidgetParcel) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wvl.d) this.f300163w).d.b3(freeTradesIncentiveContract$FreeTradesWidgetParcel);
                return Unit.f186387a;
            case 13:
                wvl.g gVar2 = (wvl.g) this.f300163w;
                vki.a aVar21 = gVar2.f300560p;
                Pair pair = (Pair) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qdf.c cVar8 = (qdf.c) pair.f186385a;
                long jLongValue = ((Number) pair.f186386b).longValue();
                FreeTradesIncentiveContract$FreeTradesLimit freeTradesIncentiveContract$FreeTradesLimit = (FreeTradesIncentiveContract$FreeTradesLimit) cVar8.f244952a.getContent();
                zonedDateTime = freeTradesIncentiveContract$FreeTradesLimit != null ? freeTradesIncentiveContract$FreeTradesLimit.d : 0;
                if (zonedDateTime == 0 || pu7.a.I(zonedDateTime) <= jLongValue) {
                    gVar2.X2(aVar21, new r1(5));
                } else {
                    gVar2.X2(aVar21, new fvk.v(cVar8, i3));
                }
                return Unit.f186387a;
            case 14:
                wwi.f fVar3 = (wwi.f) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wwi.q) this.f300163w).x2(new wvg.d0(fVar3, 9));
                return Unit.f186387a;
            case 15:
                ty0.a aVar24 = (ty0.a) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wx2.e eVar3 = (wx2.e) ((LocalGlobalCardInfoController) this.f300163w).S.getValue();
                String id10 = aVar24.f275445a;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                switch (id10.hashCode()) {
                    case -1543572789:
                        if (id10.equals("ID_GO_TO_GLOBAL_INDIA_CARD_CLAUSE")) {
                            eVar3.I2(l0.INDIA_GLOBAL, new r1(i2));
                        }
                        break;
                    case -671951311:
                        if (id10.equals("ID_GO_TO_LOCAL_INDIA_CARD_CLAUSE")) {
                            eVar3.I2(l0.INDIA_LOCAL, new r1(i));
                        }
                        break;
                    case 374675286:
                        if (id10.equals("ID_GO_TO_GLOBAL_BRAZIL_CARD_CLAUSE")) {
                            eVar3.I2(l0.BRAZIL_GLOBAL, new r1(15));
                        }
                        break;
                    case 1625137328:
                        if (id10.equals("ID_GO_TO_LOCAL_BRAZIL_CARD_CLAUSE")) {
                            eVar3.I2(l0.BRAZIL_LOCAL, new r1(14));
                        }
                        break;
                }
                return Unit.f186387a;
            case 16:
                Data data2 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wx6.j jVar2 = (wx6.j) this.f300163w;
                jVar2.H2(jVar2.f300765q, new wug.i(data2, i));
                return Unit.f186387a;
            case 17:
                Data data3 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) this.f300163w;
                f0Var.H2(f0Var.f300906q, new wug.i(data3, i2));
                return Unit.f186387a;
            case 18:
                Data data4 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wz6.g gVar3 = (wz6.g) this.f300163w;
                gVar3.H2(gVar3.f301377q, new wug.i(data4, gVar3));
                return Unit.f186387a;
            case 19:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wzb.g gVarE3 = ((RevPointsExpiryHomeScreen) this.f300163w).d();
                Intrinsics.h(clickData);
                com.revolut.feature.rev_points.impl.ui.points_expiry.home.a aVar30 = (com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) gVarE3;
                aVar30.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj5 = clickData.f54722b.f51596l;
                List list6 = obj5 instanceof List ? (List) obj5 : null;
                if (list6 != null) {
                    arrayList = new ArrayList();
                    for (Object obj6 : list6) {
                        if (obj6 instanceof IssuedPoints) {
                            arrayList.add(obj6);
                        }
                    }
                }
                if (arrayList != null) {
                    oki.h.v2(aVar30.f83835s, new RevPointsExpiryHomeScreenContract$ModalStep.RevPointsExpiryDetails(arrayList, true), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    aVar30.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenEarnHub(2)));
                }
                return Unit.f186387a;
            case 20:
                ty0.a aVar31 = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (aVar31.f275447c instanceof HtmlClause) {
                    x0f.p pVarE3 = ((ExternalCardDetailsScreen) this.f300163w).e3();
                    String additionalInfoUrl = aVar31.f275445a;
                    x0f.y yVar3 = (x0f.y) pVarE3;
                    yVar3.getClass();
                    Intrinsics.checkNotNullParameter(additionalInfoUrl, "additionalInfoUrl");
                    yVar3.n2(new wtj.f(yVar3, additionalInfoUrl, zonedDateTime, i5), new whi.b(i6));
                }
                return Unit.f186387a;
            case 21:
                Data data5 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0l.i iVar2 = (x0l.i) this.f300163w;
                iVar2.H2(iVar2.f301661q, new wug.i(data5, 28));
                return Unit.f186387a;
            case 22:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x18.p pVarE32 = ((SmartFeedScreen) this.f300163w).d();
                Intrinsics.h(clickData2);
                com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar7 = (com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) pVarE32;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj7 = clickData2.d;
                InsightPublicationPriceDescriptor insightPublicationPriceDescriptor = obj7 instanceof InsightPublicationPriceDescriptor ? (InsightPublicationPriceDescriptor) obj7 : null;
                if (insightPublicationPriceDescriptor != null) {
                    oki.h.v2(bVar7.z, new SmartFeedScreenContract$ModalStep.PublicationPrice(insightPublicationPriceDescriptor), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 23:
                CameraException error = (CameraException) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x32.d dVar2 = (x32.d) ((QrScanningScreen) this.f300163w).P.getValue();
                Intrinsics.h(error);
                com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d dVar3 = (com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d) dVar2;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(error, "error");
                dVar3.K2(error.getCause());
                return Unit.f186387a;
            case 24:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.d) this.f300163w).K2(th10);
                return Unit.f186387a;
            case 25:
                a46.d suggestionType = (a46.d) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x36.y yVar4 = (x36.y) ((DeFiExchangeAmountScreen) this.f300163w).d();
                yVar4.getClass();
                Intrinsics.checkNotNullParameter(suggestionType, "suggestionType");
                yVar4.n2(new wtj.f(yVar4, suggestionType, zonedDateTime, 20), new whi.b(i6));
                return Unit.f186387a;
            case 26:
                x42.c data6 = (x42.c) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x42.g gVar4 = (x42.g) ((TransferSettingsScreen) this.f300163w).S.getValue();
                Intrinsics.h(data6);
                x42.l lVar4 = (x42.l) gVar4;
                cli.y yVar5 = lVar4.f302783p;
                Intrinsics.checkNotNullParameter(data6, "data");
                if (data6 instanceof x42.d) {
                    lVar4.H2(yVar5, new x29.a(12));
                } else {
                    if (!(data6 instanceof x42.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVar4.H2(yVar5, new x29.a(13));
                }
                return Unit.f186387a;
            case 27:
                Set set = (Set) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (set.isEmpty()) {
                    return zhm.f0.f322471a;
                }
                Set set2 = set;
                ArrayList arrayList8 = new ArrayList(w.t(set2, 10));
                Iterator it8 = set2.iterator();
                while (it8.hasNext()) {
                    arrayList8.add(((xi0.b) ((Pair) it8.next()).f186385a).f306286a);
                }
                ArrayList arrayList9 = new ArrayList(w.t(set2, 10));
                Iterator it9 = set2.iterator();
                while (it9.hasNext()) {
                    arrayList9.add(((xi0.b) ((Pair) it9.next()).f186386b).f306286a);
                }
                v46.a aVar40 = ((x46.b) this.f300163w).f302799b;
                aVar40.getClass();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("SELECT * FROM defi_fiat_rates WHERE assetId IN (");
                int size = arrayList8.size();
                StringUtil.appendPlaceholders(sb6, size);
                sb6.append(") AND toCurrency IN (");
                List<w46.b> list7 = (List) DBUtil.performBlocking(aVar40.f285981a, true, false, new fpk.a(arrayList8, arrayList9, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList9, sb6, ")"), size, 1));
                ArrayList arrayList10 = new ArrayList(w.t(list7, 10));
                for (w46.b bVar8 : list7) {
                    Intrinsics.checkNotNullParameter(bVar8, "<this>");
                    xi0.b bVar9 = new xi0.b(6, bVar8.f294514a, null);
                    xi0.a aVar41 = xi0.b.Companion;
                    String str21 = bVar8.f294515b;
                    aVar41.getClass();
                    xi0.b bVarA = xi0.a.a(str21);
                    BigDecimal bigDecimal2 = new BigDecimal(bVar8.f294516c);
                    String str22 = bVar8.d;
                    arrayList10.add(new qta.c(bVar9, bVarA, bigDecimal2, str22 != null ? new BigDecimal(str22) : null, null, null, null));
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj8 : arrayList10) {
                    if (set.contains(((qta.c) obj8).f249050h)) {
                        arrayList11.add(obj8);
                    }
                }
                if (arrayList11.size() < set.size()) {
                    return null;
                }
                return arrayList11;
            case 28:
                fim.a aVar42 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x4l.c) this.f300163w).f302896a.h(this.v);
                return Unit.f186387a;
            default:
                fim.a aVar43 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x60.c cVar9 = (x60.c) this.v;
                String str23 = (String) this.f300163w;
                synchronized (cVar9) {
                    cVar9.f303005a.G(str23, "ACCOUNT_REGION", z.d(o0.b(String.class)));
                    cVar9.f303006b.set(new AccountRegion(str23));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x4l.c cVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f300163w = cVar;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x60.c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 29;
        this.v = cVar;
        this.f300163w = str;
    }
}
