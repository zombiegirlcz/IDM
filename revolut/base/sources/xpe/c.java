package xpe;

import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$Step;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.address_change.AddressChangePriceReviewActivity;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.data.network.services.PaymentsGroupsService;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$Step;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.TransferReasonsAdditionalInfoScreenContract$ModalStep;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import cr9.e;
import er9.x;
import ft3.d1;
import ip0.pb0;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.d0;
import oq9.c0;
import rp0.k1;
import tof.a3;
import vc.o;
import vf0.y;
import xpk.m;
import xsf.n;
import xsf.r;
import xsf.s;
import xsf.t;
import yki.l;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f307934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f307935c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f307933a = i;
        this.f307934b = obj2;
        this.f307935c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v7, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v114, types: [java.lang.Object[], java.util.List[]] */
    /* JADX WARN: Type inference failed for: r3v35, types: [ne0.j] */
    /* JADX WARN: Type inference failed for: r5v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v25, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object[], java.util.List[]] */
    /* JADX WARN: Type inference failed for: r9v14, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ?? arrayList;
        cr9.e aVar;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        xy7.c cVar;
        TextLocalisedClause textLocalisedClause;
        switch (this.f307933a) {
            case 0:
                com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar2 = (com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f307934b;
                TaxResidencyFlowContract$Step.DirectTin directTin = (TaxResidencyFlowContract$Step.DirectTin) this.f307935c;
                qpe.e output = (qpe.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, qpe.c.f248374a)) {
                    com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a.M2(aVar2, directTin.f90299b, 2);
                } else {
                    if (!(output instanceof qpe.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.I2(((qpe.d) output).f248375a);
                }
                return Unit.f186387a;
            case 1:
                com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar3 = (com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a) this.f307934b;
                TaxResidencyFlowContract$Step.Crs crs = (TaxResidencyFlowContract$Step.Crs) this.f307935c;
                ope.g output2 = (ope.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof ope.f) {
                    aVar3.O2(null, null, ((ope.f) output2).f227593a);
                } else if (Intrinsics.f(output2, ope.d.f227589a)) {
                    com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a.M2(aVar3, crs.f90296b, 2);
                } else if (output2 instanceof ope.e) {
                    ope.e eVar = (ope.e) output2;
                    aVar3.O2(new MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement(eVar.f227590a, eVar.f227591b, eVar.f227592c), null, null);
                } else {
                    if (!(output2 instanceof ope.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.I2(((ope.c) output2).f227588a);
                }
                return Unit.f186387a;
            case 2:
                xpf.h hVar = (xpf.h) this.f307934b;
                jli.c cVar2 = (jli.c) this.f307935c;
                xpf.a updateState = (xpf.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return xpf.a.a(updateState, TransferScheduleData.a(((xpf.a) hVar.t2()).f307958a, 0L, cVar2, cVar2 == jli.c.PERIOD_SELECTION_NONE ? TransferScheduleEndsOn.Never.f104289a : ((xpf.a) hVar.t2()).f307958a.f104287c, 1));
            case 3:
                return xpk.h.a((xpk.h) obj2, false, false, ((m) this.f307934b).f307998p.f103729c && ((Boolean) this.f307935c).booleanValue(), null, null, null, false, 503);
            case 4:
                xq3.j jVar = (xq3.j) this.f307934b;
                d1 productClassification = (d1) this.f307935c;
                if (((Boolean) obj2).booleanValue()) {
                    xr3.k kVar = jVar.f308077a;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(productClassification, "productClassification");
                    return kVar.f308227h.b(new xr3.i(productClassification), kVar.f.c("EligibilityCache", w4l.i.f294643c));
                }
                it3.g gVar = it3.i.Companion;
                it3.h hVar2 = it3.h.MAINTENANCE;
                gVar.getClass();
                return zi0.c.i(it3.g.a(hVar2));
            case 5:
                com.revolut.feature.junior_transfer.impl.ui.add_money.c cVar3 = (com.revolut.feature.junior_transfer.impl.ui.add_money.c) this.f307934b;
                yki.b bVar = (yki.b) this.f307935c;
                s8k.j it8 = (s8k.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                cVar3.n2(new xq8.f(cVar3, null, 1), new whi.b(6));
                oki.h.D2(bVar);
                return Unit.f186387a;
            case 6:
                xqg.e eVar2 = (xqg.e) this.f307934b;
                l lVar = (l) this.f307935c;
                ccb.l result = (ccb.l) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                eVar2.l2(new xqg.c(result, eVar2, lVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 7:
                xra.h hVar3 = (xra.h) this.f307934b;
                List cardOwners = (List) this.f307935c;
                List recentsStats = (List) obj2;
                Intrinsics.checkNotNullParameter(recentsStats, "recentsStats");
                hVar3.d.getClass();
                Intrinsics.checkNotNullParameter(cardOwners, "cardOwners");
                Intrinsics.checkNotNullParameter(recentsStats, "recentsStats");
                List list = recentsStats;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list) {
                    linkedHashMap.put(((pra.a) obj3).f238970a, obj3);
                }
                List<CardOwner> list2 = cardOwners;
                ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
                for (CardOwner cardOwner : list2) {
                    pra.a aVar4 = (pra.a) linkedHashMap.get(cardOwner.f81490a);
                    arrayList6.add(aVar4 == null ? new CardOwnerWithStats(cardOwner, 0, 0L) : new CardOwnerWithStats(cardOwner, aVar4.f238971b, aVar4.f238972c));
                }
                return zi0.c.P(arrayList6, false, null, 3);
            case 8:
                xra.h hVar4 = (xra.h) this.f307934b;
                String str = (String) this.f307935c;
                List cardOwnersList = (List) obj2;
                Intrinsics.checkNotNullParameter(cardOwnersList, "cardOwnersList");
                return new pfm.h(new r2d.e(hVar4, 29, cardOwnersList, str), 2);
            case 9:
                xra.h hVar5 = (xra.h) this.f307934b;
                ?? r3 = (ne0.j) this.f307935c;
                String id10 = (String) obj2;
                Intrinsics.checkNotNullParameter(id10, "id");
                hVar5.f308313b.a(id10);
                List list3 = (List) r3.get("CardOwnersListKey");
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list3) {
                        if (!Intrinsics.f(((CardOwner) obj4).f81490a, id10)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                r3.f("CardOwnersListKey", arrayList);
                return Unit.f186387a;
            case 10:
                ryc.a aVar5 = (ryc.a) this.f307934b;
                PaymentGroup paymentGroup = (PaymentGroup) this.f307935c;
                List requests = (List) obj2;
                Intrinsics.checkNotNullParameter(requests, "requestsList");
                mq9.f fVar = (mq9.f) aVar5.f258289a;
                String groupId = paymentGroup.f79285a;
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(requests, "requests");
                x xVar = (x) ((mr9.a) fVar).f208082a;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(groupId, "groupId");
                Intrinsics.checkNotNullParameter(requests, "requests");
                PaymentsGroupsService paymentsGroupsService = xVar.f128599g;
                Intrinsics.checkNotNullParameter(requests, "<this>");
                List<qq9.c> list4 = requests;
                ArrayList arrayList7 = new ArrayList(w.t(list4, 10));
                for (qq9.c cVar4 : list4) {
                    Intrinsics.checkNotNullParameter(cVar4, "<this>");
                    if (cVar4 instanceof qq9.b) {
                        qq9.b bVar2 = (qq9.b) cVar4;
                        String strB = bVar2.f248509b.b();
                        String str2 = bVar2.f248508a;
                        ArrayList arrayListD = x5d.b.D(bVar2.f248510c);
                        List list5 = bVar2.d;
                        aVar = new e.b(strB, str2, bVar2.e, bVar2.f, arrayListD, list5 != null ? o.D(list5) : null);
                    } else {
                        if (!(cVar4 instanceof qq9.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qq9.a aVar6 = (qq9.a) cVar4;
                        String strB2 = aVar6.f248506c.b();
                        String str3 = aVar6.f248504a;
                        dj0.d dVar = aVar6.f248505b;
                        long j2 = dVar.f115082a;
                        String str4 = dVar.f115083b.f306286a;
                        ArrayList arrayListD2 = x5d.b.D(aVar6.d);
                        List list6 = aVar6.e;
                        aVar = new e.a(strB2, str3, j2, str4, arrayListD2, list6 != null ? o.D(list6) : null, aVar6.f, aVar6.f248507g);
                    }
                    arrayList7.add(aVar);
                }
                ufm.i iVar = new ufm.i(new ufm.i(te0.w.H0(paymentsGroupsService.addBills(groupId, new cr9.f(arrayList7)), xVar.c(groupId)), new er9.k(1, new er9.i(xVar, groupId, 6)), 1), new er9.k(2, new er9.i(xVar, groupId, 7)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return te0.w.i0(iVar);
            case 11:
                AdditionalInfoField additionalInfoField = (AdditionalInfoField) this.f307934b;
                t tVar = (t) this.f307935c;
                xsf.m update = (xsf.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return xsf.m.a(update, r0.q(update.f308472c, new Pair(additionalInfoField, tVar)));
            case 12:
                AdditionalInfoField additionalInfoField2 = (AdditionalInfoField) this.f307934b;
                r rVar = (r) this.f307935c;
                xsf.m update2 = (xsf.m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xsf.m.a(update2, r0.q(update2.f308472c, new Pair(additionalInfoField2, rVar)));
            case 13:
                n nVar = (n) this.f307934b;
                s sVar = (s) this.f307935c;
                xsf.m update3 = (xsf.m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xsf.m.a(update3, r0.q(update3.f308472c, new Pair(nVar.f308474b, sVar)));
            case 14:
                TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDropdownSelection additionalInfoDropdownSelection = (TransferReasonsAdditionalInfoScreenContract$ModalStep.AdditionalInfoDropdownSelection) this.f307934b;
                com.revolut.feature.transfer_reasons.impl.ui.additional_info.a aVar7 = (com.revolut.feature.transfer_reasons.impl.ui.additional_info.a) this.f307935c;
                btf.d result2 = (btf.d) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar7.H2(aVar7.f92381q, new c(additionalInfoDropdownSelection.f92378a, result2, 15));
                return Unit.f186387a;
            case 15:
                AdditionalInfoField additionalInfoField3 = (AdditionalInfoField) this.f307934b;
                btf.d dVar2 = (btf.d) this.f307935c;
                xsf.m update4 = (xsf.m) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return xsf.m.a(update4, r0.q(update4.f308472c, new Pair(additionalInfoField3, new t(dVar2.f18573a.f92411a))));
            case 16:
                xsh.r rVar2 = (xsh.r) this.f307934b;
                String str5 = (String) this.f307935c;
                dsh.l output3 = (dsh.l) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                rVar2.l2(new xsh.o(rVar2, str5, output3, null), new yi5.b(26));
                return Unit.f186387a;
            case 17:
                xti.j jVar2 = (xti.j) this.f307934b;
                String searchQuery = (String) this.f307935c;
                bti.b airportsList = (bti.b) obj2;
                Intrinsics.checkNotNullParameter(airportsList, "airportsList");
                zti.d dVar3 = jVar2.f308831p;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                Intrinsics.checkNotNullParameter(airportsList, "airportsList");
                Regex regex = new Regex("\\s+");
                m70.a.t(t0.f186434a);
                String strE = jli.g.e(d0.F0(regex.replace(searchQuery, " ")).toString());
                return new bti.b(dVar3.a(strE, airportsList.f18585a), dVar3.a(strE, airportsList.f18586b), airportsList.f18587c);
            case 18:
                xv0.m mVar = (xv0.m) this.f307934b;
                Function1 function1 = (Function1) this.f307935c;
                Drawable drawable = (Drawable) obj2;
                mVar.setItemRenderState(xv0.h.f309151a);
                if (function1 != null) {
                    function1.invoke(drawable);
                }
                return Unit.f186387a;
            case 19:
                Data data = (Data) this.f307934b;
                xvf.m mVar2 = (xvf.m) this.f307935c;
                xvf.f update5 = (xvf.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                axf.a aVar8 = (axf.a) data.getContent();
                long millis = aVar8 != null ? Duration.between(((l80.f) mVar2.f309256q).f(), aVar8.f10935c).toMillis() : 0L;
                update5.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                return new xvf.f(data, millis);
            case 20:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a aVar9 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) this.f307934b;
                CryptoCommodityBuyCollectionFlowContract$Step cryptoCommodityBuyCollectionFlowContract$Step = (CryptoCommodityBuyCollectionFlowContract$Step) this.f307935c;
                vrc.j result3 = (vrc.j) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3.f291576a) {
                    ((k1) aVar9.v).d(aVar9.f71535w.a());
                }
                aVar9.E2(new CryptoCommodityBuyCollectionFlowContract$Step.Confirmation(((CryptoCommodityBuyCollectionFlowContract$Step.CryptoScaPrompt) cryptoCommodityBuyCollectionFlowContract$Step).f71533b), false, null, false);
                return Unit.f186387a;
            case 21:
                Function2 function2 = (Function2) ((com.google.firebase.messaging.t) this.f307934b).d;
                Intrinsics.h(obj2);
                function2.invoke(this.f307935c, obj2);
                return Unit.f186387a;
            case 22:
                xx5.c cVar5 = (xx5.c) this.f307934b;
                zx5.a aVar10 = (zx5.a) this.f307935c;
                String query = (String) obj2;
                Intrinsics.checkNotNullParameter(query, "query");
                return nim.a.w(cVar5.a(aVar10), new c(query, cVar5, 23)).toFlowable(efm.a.LATEST);
            case 23:
                String str6 = (String) this.f307934b;
                xx5.c cVar6 = (xx5.c) this.f307935c;
                List currencies = (List) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                Intrinsics.h(str6);
                cVar6.getClass();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj5 : currencies) {
                    xi0.b bVar3 = (xi0.b) obj5;
                    boolean zJ = d0.J(bVar3.f306286a, str6, true);
                    String strA = cVar6.f309404c.a(bVar3);
                    boolean zJ2 = strA != null ? d0.J(strA, str6, true) : false;
                    if (zJ || zJ2) {
                        arrayList8.add(obj5);
                    }
                }
                return new vx5.h(str6, arrayList8);
            case 24:
                do3.n nVar2 = (do3.n) this.f307934b;
                hx9.c cVar7 = ((xx9.r) this.f307935c).f309449a;
                y yVar = (y) obj2;
                Intrinsics.checkNotNullParameter(yVar, "<destruct>");
                List list7 = (List) yVar.f288491a;
                List list8 = (List) yVar.f288492b;
                List list9 = (List) yVar.f288493c;
                mq9.e eVar3 = (mq9.e) yVar.d;
                List list10 = (List) yVar.e;
                List list11 = (List) yVar.f;
                ArrayList arrayList9 = new ArrayList();
                Iterator it9 = list7.iterator();
                while (it9.hasNext()) {
                    ux9.t tVarE = hx9.c.e(cVar7, (TransferLinkDetails.Active) it9.next());
                    if (tVarE != null) {
                        arrayList9.add(tVarE);
                    }
                }
                String str7 = nVar2.f116414l;
                if (str7 != null) {
                    ArrayList arrayListE0 = zhm.d0.E0(eVar3.f207903c, list9);
                    arrayList2 = new ArrayList();
                    Iterator it10 = arrayListE0.iterator();
                    while (it10.hasNext()) {
                        ux9.t tVarF = hx9.c.f(cVar7, (MessageItem) it10.next(), str7);
                        if (tVarF != null) {
                            arrayList2.add(tVarF);
                        }
                    }
                } else {
                    arrayList2 = f0.f322471a;
                }
                String str8 = nVar2.f116414l;
                if (str8 != null) {
                    arrayList3 = new ArrayList();
                    Iterator it11 = list8.iterator();
                    while (it11.hasNext()) {
                        ux9.t tVarD = hx9.c.d(cVar7, (MoneyRequest) it11.next(), str8);
                        if (tVarD != null) {
                            arrayList3.add(tVarD);
                        }
                    }
                } else {
                    arrayList3 = f0.f322471a;
                }
                List list12 = eVar3.f207901a;
                ArrayList arrayList10 = new ArrayList(w.t(list12, 10));
                Iterator it12 = list12.iterator();
                while (it12.hasNext()) {
                    arrayList10.add(hx9.c.b(cVar7, (oq9.i) it12.next()));
                }
                List list13 = eVar3.f207902b;
                ArrayList arrayList11 = new ArrayList(w.t(list13, 10));
                Iterator it13 = list13.iterator();
                while (it13.hasNext()) {
                    arrayList11.add(hx9.c.c(cVar7, (c0) it13.next()));
                }
                List<PaymentGroup> list14 = eVar3.d;
                ArrayList arrayList12 = new ArrayList(w.t(list14, 10));
                for (PaymentGroup group : list14) {
                    Intrinsics.checkNotNullParameter(group, "group");
                    arrayList12.add(new ux9.k(group.getF79285a(), new jq9.c(group.getF79289h())));
                }
                List list15 = list10;
                ArrayList arrayList13 = new ArrayList(w.t(list15, 10));
                Iterator it14 = list15.iterator();
                while (it14.hasNext()) {
                    arrayList13.add(hx9.c.a((zm3.i) it14.next()));
                }
                return i2b.a.e(w.u(v.k(new List[]{list11, arrayList9, arrayList3, arrayList2, arrayList10, arrayList11, arrayList12, arrayList13})), nVar2);
            case 25:
                do3.n nVar3 = (do3.n) this.f307934b;
                hx9.c cVar8 = ((xx9.s) this.f307935c).f309454a;
                y yVar2 = (y) obj2;
                Intrinsics.checkNotNullParameter(yVar2, "<destruct>");
                List list16 = (List) yVar2.f288491a;
                List list17 = (List) yVar2.f288492b;
                List list18 = (List) yVar2.f288493c;
                List list19 = (List) yVar2.d;
                mq9.e eVar4 = (mq9.e) yVar2.e;
                List list20 = (List) yVar2.f;
                String str9 = nVar3.f116414l;
                if (str9 != null) {
                    ArrayList arrayListE02 = zhm.d0.E0(eVar4.f207903c, list19);
                    arrayList4 = new ArrayList();
                    Iterator it15 = arrayListE02.iterator();
                    while (it15.hasNext()) {
                        ux9.t tVarF2 = hx9.c.f(cVar8, (MessageItem) it15.next(), str9);
                        if (tVarF2 != null) {
                            arrayList4.add(tVarF2);
                        }
                    }
                } else {
                    arrayList4 = f0.f322471a;
                }
                String str10 = nVar3.f116414l;
                if (str10 != null) {
                    arrayList5 = new ArrayList();
                    Iterator it16 = list18.iterator();
                    while (it16.hasNext()) {
                        ux9.t tVarD2 = hx9.c.d(cVar8, (MoneyRequest) it16.next(), str10);
                        if (tVarD2 != null) {
                            arrayList5.add(tVarD2);
                        }
                    }
                } else {
                    arrayList5 = f0.f322471a;
                }
                List list21 = eVar4.f207901a;
                ArrayList arrayList14 = new ArrayList();
                Iterator it17 = list21.iterator();
                while (it17.hasNext()) {
                    arrayList14.add(hx9.c.b(cVar8, (oq9.i) it17.next()));
                }
                List list22 = eVar4.f207902b;
                ArrayList arrayList15 = new ArrayList();
                Iterator it18 = list22.iterator();
                while (it18.hasNext()) {
                    arrayList15.add(hx9.c.c(cVar8, (c0) it18.next()));
                }
                List<PaymentGroup> list23 = eVar4.d;
                ArrayList arrayList16 = new ArrayList();
                for (PaymentGroup group2 : list23) {
                    Intrinsics.checkNotNullParameter(group2, "group");
                    arrayList16.add(new ux9.k(group2.getF79285a(), new jq9.c(group2.getF79289h())));
                }
                ArrayList arrayList17 = new ArrayList();
                Iterator it19 = list20.iterator();
                while (it19.hasNext()) {
                    arrayList17.add(hx9.c.a((zm3.i) it19.next()));
                }
                ?? r110 = new List[8];
                ArrayList arrayList18 = new ArrayList();
                Iterator it20 = list16.iterator();
                while (it20.hasNext()) {
                    ux9.t tVarG = hx9.c.g(cVar8, (a3) it20.next());
                    if (tVarG != null) {
                        arrayList18.add(tVarG);
                    }
                }
                r110[0] = arrayList18;
                ArrayList arrayList19 = new ArrayList();
                Iterator it21 = list17.iterator();
                while (it21.hasNext()) {
                    ux9.t tVarE2 = hx9.c.e(cVar8, (TransferLinkDetails.Active) it21.next());
                    if (tVarE2 != null) {
                        arrayList19.add(tVarE2);
                    }
                }
                r110[1] = arrayList19;
                r110[2] = arrayList5;
                r110[3] = arrayList4;
                r110[4] = arrayList14;
                r110[5] = arrayList15;
                r110[6] = arrayList16;
                r110[7] = arrayList17;
                return i2b.a.e(w.u(v.k(r110)), nVar3);
            case 26:
                mwg.e eVar5 = (mwg.e) this.f307934b;
                List list24 = (List) this.f307935c;
                List cashAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(cashAssets, "cashAssets");
                return new wxg.n(eVar5.f209452c, zhm.d0.P0(zhm.d0.E0(cashAssets, list24), new xxg.f()));
            case 27:
                xy7.k kVar2 = (xy7.k) this.f307934b;
                zw7.a aVar11 = (zw7.a) this.f307935c;
                List pets = (List) obj2;
                Intrinsics.checkNotNullParameter(pets, "addressChangePetDetails");
                ArrayList arrayList20 = new ArrayList();
                for (Object obj6 : pets) {
                    if (((xy7.b) obj6).f309623a != null) {
                        arrayList20.add(obj6);
                    }
                }
                kVar2.d.getClass();
                Intrinsics.checkNotNullParameter(pets, "pets");
                if (pets.isEmpty()) {
                    cVar = xy7.c.MIXED;
                } else {
                    List<xy7.b> list25 = pets;
                    ArrayList arrayList21 = new ArrayList(w.t(list25, 10));
                    for (xy7.b bVar4 : list25) {
                        dj0.d dVar4 = bVar4.f309624b;
                        dj0.d dVar5 = bVar4.f309625c;
                        arrayList21.add(dVar4.f(dVar5) ? xy7.c.UP : bVar4.f309624b.i(dVar5) ? xy7.c.DOWN : xy7.c.MIXED);
                    }
                    Iterator it22 = arrayList21.iterator();
                    if (!it22.hasNext()) {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    Object next = it22.next();
                    while (it22.hasNext()) {
                        next = (xy7.c) next;
                        if (next != ((xy7.c) it22.next())) {
                            next = xy7.c.MIXED;
                        }
                    }
                    cVar = (xy7.c) next;
                }
                return new xy7.d(cVar, aVar11.f325752a, pets);
            case 28:
                xy7.g gVar2 = (xy7.g) this.f307934b;
                xy7.o oVar = (xy7.o) this.f307935c;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xy7.d dVar6 = (xy7.d) pair.f186385a;
                List list26 = (List) pair.f186386b;
                if (dVar6 != null) {
                    xpi.c cVar9 = (xpi.c) oVar.f309642j;
                    cVar9.Z(true);
                    yy7.c cVar10 = oVar.o;
                    xy7.c pricingType = dVar6.f309626a;
                    cVar10.getClass();
                    Intrinsics.checkNotNullParameter(pricingType, "pricingType");
                    int i = yy7.b.f317859a[pricingType.ordinal()];
                    if (i == 1) {
                        textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_issues_address_change_price_up_subtitle, null, null, 14);
                    } else if (i == 2) {
                        textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_issues_address_change_price_down_subtitle, null, null, 14);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_issues_address_change_price_up_down_subtitle, null, null, 14);
                    }
                    cVar9.Y(textLocalisedClause);
                }
                ((AddressChangePriceReviewActivity) gVar2).setItems(list26);
                return Unit.f186387a;
            default:
                xya.t tVar2 = (xya.t) this.f307934b;
                Clause clause = (Clause) this.f307935c;
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayListP.add(new pb0("LOADING_ITEM_ID"));
                }
                return tVar2.b(clause, arrayListP);
        }
    }
}
