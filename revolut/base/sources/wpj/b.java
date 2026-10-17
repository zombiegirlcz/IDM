package wpj;

import ael.e1;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ara.p;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.models.DigitizedCards;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.spending_analytics.impl.ui.rev10.rev_iq.models.ScoreCardType;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsScreen;
import efm.r;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import lzi.q;
import m1c.z;
import mwg.i;
import nel.n;
import nya.b0;
import om4.x2;
import om4.z1;
import org.joda.time.LocalDate;
import qtc.f;
import tsk.t;
import wh3.h;
import wp5.v;
import wr1.s;
import wr1.u;
import wrj.l;
import wvg.o;
import wvg.v0;
import xs4.g;
import ysj.j;
import ysj.k;
import ysj.y;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f299345b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f299344a = i;
        this.f299345b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List list;
        j jVar;
        int i;
        List list2;
        y yVar;
        String str;
        int i2 = this.f299344a;
        boolean z = true;
        z = true;
        int i3 = 26;
        Continuation continuation = null;
        Object obj3 = this.f299345b;
        switch (i2) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (q) ((e) obj3).f299348b.get("budget_suggestion_config");
            case 1:
                String juniorId = (String) obj2;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                return (List) ((wq8.c) obj3).f299422b.get(wq8.c.b(juniorId));
            case 2:
                com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d dVar = (com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.d) obj3;
                p output = (p) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                jmc.e eVar = new jmc.e(output, null, 25);
                output.getClass();
                dVar.l2(new wih.c(dVar, "CardOwnerMainInfoScreenContract_BUTTON_TAG", eVar, (Continuation) null), new yi5.b(i3));
                return Unit.f186387a;
            case 3:
                wqd.c update = (wqd.c) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String strName = ((ScoreCardType) obj3).name();
                List pagerItems = update.f299437a;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new wqd.c(pagerItems, strName);
            case 4:
                u uVar = (u) obj3;
                h1j.b bVar = (h1j.b) obj2;
                if (bVar instanceof h1j.d) {
                    uVar.l2(new h((h1j.d) bVar, uVar, (Continuation) null, 4), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 5:
                Unit it9 = (Unit) obj2;
                KProperty[] kPropertyArr = UpcomingPaymentsScreen.f101528d0;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((l) ((wrj.b) ((UpcomingPaymentsScreen) obj3).f101529a0.getValue())).u2();
                return Unit.f186387a;
            case 6:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.a aVar = (com.revolut.feature.credit.card.impl.ui.instalment.repay.custom_amount.a) obj3;
                g output2 = (g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.C2(ws4.c.f299653a);
                return Unit.f186387a;
            case 7:
                wsj.d dVar2 = (wsj.d) obj3;
                dVar2.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM income_sorter_executions");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "incomeSorterId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sourceTransactionId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "destinations");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remainderDestination");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        xsj.b bVarC = dVar2.c();
                        if (text5 != null) {
                            Json json = bVarC.f308548a;
                            json.getClass();
                            list = (List) json.b(new qlm.e(j.Companion.serializer()), text5);
                        } else {
                            bVarC.getClass();
                            list = null;
                        }
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        List list3 = list;
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        xsj.c cVarD = dVar2.d();
                        if (text6 != null) {
                            Json json2 = cVarD.f308549a;
                            json2.getClass();
                            jVar = (j) json2.b(j.Companion.serializer(), text6);
                        } else {
                            cVarD.getClass();
                            jVar = null;
                        }
                        arrayList.add(new k(text, text2, text3, text4, j2, list3, jVar));
                        break;
                    }
                    return arrayList;
                } finally {
                }
            case 8:
                wsj.g gVar = (wsj.g) obj3;
                gVar.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM income_sorters");
                try {
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "walletId");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "baseTransactionId");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "state");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "type");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "createdDate");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "updatedDate");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "destinations");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "sortMethod");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "remainingBalanceDestinationId");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text7 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow8) ? continuation : sQLiteStatementPrepare2.getText(columnIndexOrThrow8);
                        String text8 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? continuation : sQLiteStatementPrepare2.getText(columnIndexOrThrow9);
                        String text9 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow10) ? continuation : sQLiteStatementPrepare2.getText(columnIndexOrThrow10);
                        String text10 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? continuation : sQLiteStatementPrepare2.getText(columnIndexOrThrow11);
                        String text11 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? continuation : sQLiteStatementPrepare2.getText(columnIndexOrThrow12);
                        long j3 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow13);
                        long j5 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow14);
                        String text12 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? continuation : sQLiteStatementPrepare2.getText(columnIndexOrThrow15);
                        xsj.a aVarF = gVar.f();
                        if (text12 != 0) {
                            Json json3 = aVarF.f308547a;
                            json3.getClass();
                            i = columnIndexOrThrow8;
                            list2 = (List) json3.b(new qlm.e(ysj.c.Companion.serializer()), text12);
                        } else {
                            i = columnIndexOrThrow8;
                            aVarF.getClass();
                            list2 = null;
                        }
                        if (list2 == null) {
                            list2 = f0.f322471a;
                        }
                        List list4 = list2;
                        String text13 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow16);
                        String text14 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17);
                        xsj.d dVarG = gVar.g();
                        if (text14 != null) {
                            Json json4 = dVarG.f308550a;
                            json4.getClass();
                            yVar = (y) json4.b(y.Companion.serializer(), text14);
                        } else {
                            dVarG.getClass();
                            yVar = null;
                        }
                        arrayList2.add(new ysj.g(text7, text8, text9, text10, text11, j3, j5, list4, text13, yVar));
                        columnIndexOrThrow8 = i;
                        continuation = null;
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 9:
                n instrument = (n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "it");
                toh.c cVar = ((wsk.c) obj3).f299756n;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                r rVarJ = (!io3.h.k(instrument.f214597c) || (str = instrument.f214600j) == null || str.length() == 0) ? zi0.c.j(f0.f322471a) : ybl.b.b(cVar.f273213a, null, null, new e1(instrument, 11), 3);
                vsk.a aVar2 = vsk.a.f;
                r map = rVarJ.map(new vf0.q(9));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 10:
                yw4.p facility = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(facility, "facility");
                return nim.a.v(((x2) ((wt4.n) obj3).f299782p).i(facility, w4l.j.f294644c), new z1(facility, z ? 1 : 0));
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                DigitizedCards digitizedCards = (DigitizedCards) pair.f186385a;
                List list5 = (List) pair.f186386b;
                Object obj4 = ((v60.g) obj3).f286252c;
                List digitizedCards2 = digitizedCards.f85404a;
                Intrinsics.checkNotNullParameter(digitizedCards2, "digitizedCards");
                List list6 = digitizedCards2;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it10 = list6.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            DigitizedCard digitizedCard = (DigitizedCard) it10.next();
                            if (digitizedCard.f85398g == null) {
                                DigitizedCard.Merchant merchant = digitizedCard.f85399h;
                                String str2 = merchant != null ? merchant.f85403b : null;
                                if (str2 == null || str2.length() == 0) {
                                    if (digitizedCard.f85400j != f.CLICK_TO_PAY) {
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
                return new vuc.d(list5, digitizedCards, z);
            case 12:
                cuc.g gVar2 = (cuc.g) obj3;
                List limits = (List) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                if (gVar2 == null) {
                    return limits;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : limits) {
                    cuc.g gVar3 = ((OutboundTransactionLimit) obj5).d;
                    if (gVar3 == null) {
                        gVar3 = cuc.g.DAILY;
                    }
                    if (gVar3 == gVar2) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            case 13:
                com.revolut.feature.workflow.engine.product_closures.screen.a aVar3 = (com.revolut.feature.workflow.engine.product_closures.screen.a) obj3;
                sil.g productClosures = (sil.g) obj2;
                Intrinsics.checkNotNullParameter(productClosures, "productClosures");
                if (productClosures.f263662a.isEmpty()) {
                    aVar3.l2(new s(aVar3, continuation, 7), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 14:
                return wtk.h.a((wtk.h) obj2, null, null, (fuk.h) obj3, null, 11);
            case 15:
                hul.n output3 = (hul.n) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                ((com.revolut.trading.orders.ui.invest.placement.flow.a) obj3).C2(new wtl.d(output3.f155749a, output3.f155750b));
                return Unit.f186387a;
            case 16:
                wu.h hVar = (wu.h) obj3;
                File it11 = (File) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                try {
                    long length = it11.length();
                    if (it11.delete()) {
                        hVar.f300045a += length;
                        Unit unit = Unit.f186387a;
                    }
                    break;
                } catch (Throwable unused) {
                }
                return Unit.f186387a;
            case 17:
                wu4.a aVar4 = (wu4.a) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                z zVar = (z) pair2.f186385a;
                hha.d dVar3 = (hha.d) pair2.f186386b;
                int i5 = 2;
                if (zVar instanceof m1c.y) {
                    nyb.j jVar2 = aVar4.f300066c;
                    return nim.a.v(rd0.e.b(nim.a.w(((jxb.l) jVar2.f220800a).f179127g.e(Unit.f186387a, w4l.h.f294642c), new b0(jVar2, i5))), new v(dVar3, zVar, 24));
                }
                if (zVar instanceof z.a) {
                    return new go.g(new Data(new em4.b(dVar3, zVar, null), null, false, 6, null), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 18:
                return wuk.j.f((wuk.j) obj2, null, (ksk.d) obj3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388605);
            case 19:
                return wuk.j.f((wuk.j) obj2, null, null, null, (psk.e) obj3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388599);
            case 20:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                a12.j jVar3 = ((wv1.f) obj3).f300266a;
                TextLocalisedClause title = new TextLocalisedClause(R$string.bre_b_area_qr_widget_title, null, null, 14);
                Intrinsics.checkNotNullParameter(title, "title");
                return zhm.u.c(new PaymentLinkWidgetLoadingDelegate.Model(title, "ID_QR_WIDGET"));
            case 21:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) ((wvd.b) obj3).f300313b.get("AUTO_STAKING_MEMORY_CACHE_KEY");
            case 22:
                uvg.b it13 = (uvg.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                boolean z3 = ((wvg.a) obj3).f300322c;
                Intrinsics.checkNotNullParameter(it13, "<this>");
                iwg.a aVarZ = kotlin.jvm.internal.s.z(it13.getAssetType());
                dj0.d dVarO = mo3.a.o(it13.getTotalValue());
                List<uvg.g> listC = it13.getCash();
                ArrayList arrayList4 = new ArrayList(w.t(listC, 10));
                for (uvg.g gVar4 : listC) {
                    arrayList4.add(new mwg.d(gVar4.getAsset(), mo3.a.o(gVar4.getValue()), gVar4.getAllocation()));
                }
                List<uvg.d> listB = it13.getAssets();
                ArrayList arrayList5 = new ArrayList(w.t(listB, 10));
                for (uvg.d dVar4 : listB) {
                    String strB = dVar4.getAsset();
                    String strG = dVar4.getQuantity();
                    BigDecimal bigDecimal = strG != null ? new BigDecimal(strG) : BigDecimal.ZERO;
                    Intrinsics.h(bigDecimal);
                    dj0.d dVarO2 = mo3.a.o(dVar4.getValue());
                    float fA = dVar4.getAllocation();
                    String strH = dVar4.getRef();
                    ko3.a aVarE = dVar4.getOpeningPrice();
                    ej0.b bVarQ = aVarE != null ? cj9.c.Q(aVarE) : null;
                    ko3.a aVarC = dVar4.getCurrentPrice();
                    ej0.b bVarQ2 = aVarC != null ? cj9.c.Q(aVarC) : null;
                    String strF = dVar4.getPositionId();
                    String strD = dVar4.getLeverage();
                    arrayList5.add(new mwg.c(strB, bigDecimal, dVarO2, fA, strH, bVarQ, bVarQ2, strF, strD != null ? new BigDecimal(strD) : null));
                }
                return new mwg.a(aVarZ, z3, dVarO, arrayList4, arrayList5);
            case 23:
                wvg.c params = (wvg.c) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (mwg.e) hx7.q.p(((wvg.j) obj3).f300398b, params);
            case 24:
                wvg.d params2 = (wvg.d) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (List) hx7.q.p(((wvg.k) obj3).f300405b, params2);
            case 25:
                wvg.l params3 = (wvg.l) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (PerformanceChart) ((o) obj3).f300431b.get(params3.f300415g);
            case 26:
                wvg.p params4 = (wvg.p) obj2;
                Intrinsics.checkNotNullParameter(params4, "params");
                return (i) ((wvg.q) obj3).f300452b.get(params4.e);
            case 27:
                wvg.r params5 = (wvg.r) obj2;
                Intrinsics.checkNotNullParameter(params5, "params");
                return (List) ((wvg.s) obj3).f300468b.get(params5.f300462h);
            case 28:
                wvg.e params6 = (wvg.e) obj2;
                Intrinsics.checkNotNullParameter(params6, "params");
                return (TotalValueChartFacade) ((wvg.v) obj3).f300480b.get(params6.f300361g);
            default:
                v0 v0Var = (v0) obj3;
                uvg.i dto = (uvg.i) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                List<uvg.h> items = dto.getItems();
                ArrayList arrayList6 = new ArrayList(w.t(items, 10));
                for (uvg.h hVar2 : items) {
                    iwg.a analyticsProductType = v0Var.f300483b;
                    boolean z4 = v0Var.f;
                    Intrinsics.checkNotNullParameter(hVar2, "<this>");
                    Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
                    String asset = hVar2.getAsset();
                    dj0.d dVarO3 = mo3.a.o(hVar2.getPnl());
                    float returns = hVar2.getReturns();
                    Float returnOnInitialMargin = hVar2.getReturnOnInitialMargin();
                    LocalDate closedOn = hVar2.getClosedOn();
                    String ref2 = hVar2.getRef();
                    ko3.a openingPrice = hVar2.getOpeningPrice();
                    ej0.b bVarQ3 = openingPrice != null ? cj9.c.Q(openingPrice) : null;
                    String positionId = hVar2.getPositionId();
                    String quantity = hVar2.getQuantity();
                    arrayList6.add(new mwg.f(analyticsProductType, z4, asset, dVarO3, returns, returnOnInitialMargin, closedOn, ref2, bVarQ3, positionId, quantity != null ? new BigDecimal(quantity) : null));
                }
                return arrayList6;
        }
    }

    public /* synthetic */ b(t tVar, wu.h hVar) {
        this.f299344a = 16;
        this.f299345b = hVar;
    }
}
