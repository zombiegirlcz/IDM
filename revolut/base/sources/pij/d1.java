package pij;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.background.VideoBackgroundView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.ui.india.netbanking.screen.webview.IndiaNetBankingWebViewScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.payments.air.widget.impl.ui.chat.ResolvedRecipient;
import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionsEmptyDisplay;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.WaitlistControllerFlowContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.suspicious_transaction.api.navigation.SuspiciousTransactionFeatureConfig;
import ip0.gu;
import ip0.w40;
import ip0.w60;
import ip0.x60;
import ip0.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pkf.u1;
import vkm.j2;
import wok.f;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f236540b;

    public /* synthetic */ d1(Object obj2, int i) {
        this.f236539a = i;
        this.f236540b = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Flow flowI;
        int i = this.f236539a;
        int i2 = 7;
        int i3 = 5;
        int i5 = 3;
        int i6 = 2;
        Continuation continuation = null;
        Object obj3 = this.f236540b;
        switch (i) {
            case 0:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (EsimSubscriptionsEmptyDisplay) obj3, null, 1572863);
            case 1:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) obj3).f103255r);
                return Boolean.TRUE;
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ((pk9.l) obj3).getClass();
                return zhm.u.c(new x60("LOADING_STATE_ID", w60.CIRCLE_ASSET, null));
            case 3:
                vke.d dVar = (vke.d) obj3;
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                List list = it10;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList.add(oi0.d.O((oke.b) it11.next(), dVar));
                }
                return arrayList;
            case 4:
                pkf.i0 i0Var = (pkf.i0) obj3;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.c) {
                    i0Var.A2(zh9.u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("question.how-much-do-i-pay-to-use-revolut-ramp", 2))));
                }
                return Unit.f186387a;
            case 5:
                ((pkf.q0) obj3).f237118r.a();
                return Unit.f186387a;
            case 6:
                ((pkf.w0) obj3).f237149r.a();
                return Unit.f186387a;
            case 7:
                pkf.a1 a1Var = (pkf.a1) obj3;
                lo5.e result = (lo5.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, lo5.d.f197398a)) {
                    a1Var.f237018p.a();
                }
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                ((u1) obj3).getClass();
                List listK = zhm.v.k(new gu("PROGRESS_SUBHEADER_LIST_ID", 0, 0, 30), new w40("REQUESTED_PROGRESS_STEP_LIST_ID"), new w40("COMPLETED_PROGRESS_STEP_LIST_ID"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 9:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return pkg.j.b(((jkg.f) obj3).f175168b, it12, false);
            case 10:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                int i21 = ((jkg.e) obj3).f175165b;
                List list2 = it13;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(((pkg.g) it14.next()).f237175a);
                }
                List listB = pkg.j.b(i21, arrayList2, true);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it15 = list2.iterator();
                while (it15.hasNext()) {
                    arrayList3.add(((pkg.g) it15.next()).f237176b);
                }
                return zhm.d0.E0(pkg.j.b(i21, arrayList3, false), zhm.b0.L(listB));
            case 11:
                String it16 = (String) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (List) v1.c.s("BENCHMARKS_", it16, ((plc.b) obj3).f237323b);
            case 12:
                String templateId = (String) obj2;
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                return (RiskMetrics) ((ne0.d) ((frk.b) obj3).e).get(frk.b.a(templateId));
            case 13:
                String it17 = (String) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return (alc.n) ((plc.f) obj3).f237334c.get(it17);
            case 14:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                List list3 = it18;
                vlc.g gVar = ((plc.l) obj3).f237345b;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it19 = list3.iterator();
                while (it19.hasNext()) {
                    arrayList4.add(vlc.g.d((vlc.d) it19.next()));
                }
                return arrayList4;
            case 15:
                plj.e update = (plj.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return plj.e.a(update, null, ((tkj.e) obj3).f271964a, null, null, null, 17);
            case 16:
                String url2 = (String) obj2;
                Intrinsics.checkNotNullParameter(url2, "it");
                pm6.f fVar = (pm6.f) ((IndiaNetBankingWebViewScreen) obj3).R.getValue();
                fVar.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                fVar.C2(new pm6.d(url2));
                return Unit.f186387a;
            case 17:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                return new pmb.i(zhm.u.c(new xc("VIEW_PAGER_ITEM_ID_LOADING", (List) loadingItems.invoke(), 0, null, null, 0, 0, 0, 1020)), zhm.f0.f322471a, new pmb.b(13), ((pmb.d) obj3).d);
            case 18:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a aVar = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_product_selection.a) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list4 = (List) rVar.f314201a;
                xi0.b baseCurrency = (xi0.b) rVar.f314202b;
                wi0.b bVar = (wi0.b) rVar.f314203c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : list4) {
                    Pair pair = (Pair) obj4;
                    hha.d dVar2 = (hha.d) pair.f186385a;
                    Object arrayList5 = linkedHashMap.get(dVar2);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(dVar2, arrayList5);
                    }
                    ((List) arrayList5).add(obj4);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zhm.q0.b(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List<Pair> list5 = (List) entry.getValue();
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list5, 10));
                    for (Pair pair2 : list5) {
                        arrayList6.add((SavingsProductData) pair2.f186386b);
                    }
                    linkedHashMap2.put(key, arrayList6);
                }
                TreeMap treeMapF = zhm.q0.f(linkedHashMap2, new hha.f0(null));
                if (treeMapF.isEmpty()) {
                    throw new IllegalStateException("Products and Plans should not be empty");
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(zhm.q0.b(treeMapF.size()));
                for (Map.Entry entry2 : treeMapF.entrySet()) {
                    Object key2 = entry2.getKey();
                    List list6 = (List) entry2.getValue();
                    Intrinsics.h(list6);
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    for (Object obj5 : list6) {
                        xi0.b bVar2 = ((SavingsProductData) obj5).f86683a.f86618b;
                        Object arrayList7 = linkedHashMap4.get(bVar2);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            linkedHashMap4.put(bVar2, arrayList7);
                        }
                        ((List) arrayList7).add(obj5);
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                        SavingsProductData savingsProductDataC = opg.a.c((List) entry3.getValue());
                        if (savingsProductDataC != null) {
                            linkedHashMap5.put(entry3.getKey(), savingsProductDataC);
                        }
                    }
                    linkedHashMap3.put(key2, zhm.d0.d1(linkedHashMap5.values()));
                }
                Set setKeySet = treeMapF.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
                Object objH = zhm.r0.h(zhm.d0.a0(setKeySet), treeMapF);
                Intrinsics.checkNotNullExpressionValue(objH, "getValue(...)");
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : (Iterable) objH) {
                    if (!opg.a.h((SavingsProductData) obj6)) {
                        arrayList8.add(obj6);
                    }
                }
                SavingsProductData savingsProductData = ((pmb.d) ((j2) aVar.u.f22677a).getValue()).f237530b;
                if (savingsProductData == null) {
                    pmb.a aVar2 = pmb.j.Companion;
                    List list7 = (List) zhm.r0.h(zhm.d0.a0(linkedHashMap3.keySet()), linkedHashMap3);
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(list7, "<this>");
                    Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                    savingsProductData = (SavingsProductData) zhm.d0.b0(zhm.d0.P0(list7, new k2j.d(new c2d.v0(i5, baseCurrency), 28)));
                }
                return new Pair(savingsProductData, new pmb.c(linkedHashMap3, arrayList8, baseCurrency, bVar));
            case 19:
                List<nel.n> instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                ((pmh.u) obj3).getClass();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (nel.n nVar : instruments) {
                    jel.w wVarI = ifk.b.i(nVar);
                    if (wVarI != null) {
                        Object arrayList9 = linkedHashMap6.get(wVarI);
                        if (arrayList9 == null) {
                            arrayList9 = new ArrayList();
                            linkedHashMap6.put(wVarI, arrayList9);
                        }
                        ((List) arrayList9).add(nVar);
                    }
                }
                k2j.d dVar3 = new k2j.d(new pmh.s(), 29);
                List<Map.Entry> listP0 = zhm.d0.P0(linkedHashMap6.entrySet(), new pmh.t());
                int iB = zhm.q0.b(zhm.w.t(listP0, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(iB);
                for (Map.Entry entry4 : listP0) {
                    linkedHashMap7.put((jel.w) entry4.getKey(), zhm.d0.P0((List) entry4.getValue(), dVar3));
                }
                ArrayList arrayListU = zhm.w.u(linkedHashMap7.values());
                ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayListU, 10));
                Iterator it20 = arrayListU.iterator();
                while (it20.hasNext()) {
                    arrayList10.add(new p5d.b(((nel.n) it20.next()).f214596b, "instrument", null));
                }
                return new pmh.f(arrayList10, linkedHashMap7);
            case 20:
                pn6.l lVar = (pn6.l) obj3;
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                ServerError serverErrorA = lVar.f237675q.a(e);
                if (serverErrorA != null) {
                    v60.c cVarB = ((ao0.a) lVar.f237676r).b(Integer.valueOf(serverErrorA.f51362a));
                    if (cVarB != null) {
                        yji.l.a1(lVar, lVar.X1(new nii.y0(null, new nii.z(ofm.q.O(cVarB), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), null, null, new pn6.j(lVar, continuation, i6), 3);
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 21:
                com.revolut.feature.payinstore.impl.ui.flow.a aVar3 = (com.revolut.feature.payinstore.impl.ui.flow.a) obj3;
                qn9.k it21 = (qn9.k) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                if (Intrinsics.f(it21, qn9.j.f247885a)) {
                    aVar3.C1(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, TopUpConfig.PreselectedTopUpMethod.ExternalOneOff.f90476a, null, null, 29)));
                } else if (Intrinsics.f(it21, qn9.g.f247882a)) {
                    aVar3.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)))));
                } else if (it21 instanceof qn9.h) {
                    String str = ((qn9.h) it21).f247883a;
                    aVar3.C1(new BridgeDestination(str != null ? com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), null, null, null, 126))) : new FinishCommand(null, null, null, 7)));
                } else {
                    if (!(it21 instanceof qn9.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.C1(new BridgeDestination(new FeatureCommand(new SuspiciousTransactionFeatureConfig(new SuspiciousTransactionFeatureConfig.SuspiciousTransaction(((qn9.i) it21).f247884a)))));
                }
                return Unit.f186387a;
            case 22:
                com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a aVar4 = (com.revolut.feature.user_declarations.shared.flows.address_suggestion.flow.a) obj3;
                qng.h output2 = (qng.h) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof qng.g) {
                    ivh.c.c3(aVar4.f94617q, "AddressSuggestionFlow", new png.d(aVar4, output2, null), null, null, 28);
                } else {
                    if (!(output2 instanceof qng.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ivh.c.c3(aVar4.f94617q, "AddressSuggestionFlow", new p40.v(aVar4, continuation, 8), null, null, 28);
                }
                return Unit.f186387a;
            case 23:
                com.revolut.feature.wealth.ui.impl.trades.b bVar3 = (com.revolut.feature.wealth.ui.impl.trades.b) obj3;
                kp3.b event = (kp3.b) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                go.g gVarI = zi0.c.i(event);
                iel.i iVarA = event.a();
                iel.s sVar = iVarA instanceof iel.s ? (iel.s) iVarA : null;
                if (sVar != null) {
                    ybl.b bVar4 = bVar3.f96054s;
                    List listA = sVar.a();
                    ArrayList arrayList11 = new ArrayList(zhm.w.t(listA, 10));
                    Iterator it22 = listA.iterator();
                    while (it22.hasNext()) {
                        arrayList11.add(((iel.t) it22.next()).f160815b);
                    }
                    flowI = rd0.e.e(((ael.k) bVar4).l(zhm.d0.i1(arrayList11)), zhm.h0.f322473a, new otd.a(i5, 11, continuation));
                } else {
                    flowI = zi0.c.i(zhm.f0.f322471a);
                }
                return zh9.u0.m(gVarI, flowI);
            case 24:
                VideoBackgroundView videoBackgroundView = (VideoBackgroundView) obj3;
                jv0.m mVar = (jv0.m) obj2;
                int i22 = VideoBackgroundView.f51501c;
                if ((mVar instanceof jv0.o) && ((jv0.o) mVar).f178755a) {
                    VideoBackgroundView.a(videoBackgroundView.f51502a, true);
                }
                return Unit.f186387a;
            case 25:
                po1.e update2 = (po1.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String label = ((po1.h) ((po1.k) obj3)).f237879a;
                update2.getClass();
                Intrinsics.checkNotNullParameter(label, "label");
                return new po1.e(label);
            case 26:
                PaymentWidget paymentWidget = (PaymentWidget) obj3;
                ResolvedRecipient recipient = (ResolvedRecipient) obj2;
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                return new po9.y(paymentWidget, recipient, paymentWidget.f79073b == oo9.a.EXPIRED);
            case 27:
                ((poe.j) obj3).x2(new pnh.d0((Data) obj2, i3));
                return Unit.f186387a;
            case 28:
                com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.a aVar5 = (com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.a) obj3;
                wok.f result2 = (wok.f) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!Intrinsics.f(result2, f.a.f298943a)) {
                    if (!(result2 instanceof wok.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wok.g gVar2 = (wok.g) result2;
                    gok.a aVar6 = gVar2.f298944a;
                    int i32 = pok.c.f238046a[aVar6.ordinal()];
                    if (i32 == 1 || i32 == 2 || i32 == 3) {
                        oki.h.t2(aVar5, aVar5.f103691q, new WaitlistControllerFlowContract$Step.Error(aVar6, gVar2.f298945b), false, null, false, 12);
                    } else {
                        if (i32 != 4 && i32 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar5.l2(new pnf.f(aVar5, result2, continuation, i2), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            default:
                com.revolut.sso.impl.ui.phone.enter_phone.a aVar7 = (com.revolut.sso.impl.ui.phone.enter_phone.a) obj3;
                s7a.a0 data = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                aVar7.H2(aVar7.u, new pj3.b(data, aVar7, 9));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d1(pkg.j jVar, jkg.g gVar, int i) {
        this.f236539a = i;
        this.f236540b = gVar;
    }
}
