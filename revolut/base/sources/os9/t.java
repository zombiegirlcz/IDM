package os9;

import ael.y;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import androidx.content.NavHostController;
import androidx.content.compose.ComposeNavigator;
import androidx.content.compose.NavHostKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import c12.k0;
import c12.l0;
import c12.m0;
import c12.n0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step;
import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPosition;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.kyc.impl.screens.documentid_input.a;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBooking;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature_exchange.impl.ui.exchange_v2.recurring_order_settings.RecurringOrderSettingsActivityV2;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FinishCommand;
import ft3.h1;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import ot1.b0;
import ozc.s0;
import vkm.j2;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f229281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f229282c;

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f229280a = i;
        this.f229281b = obj2;
        this.f229282c = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        BigDecimal scale;
        String str;
        gzc.i iVarO3;
        gzc.i iVarO32;
        Float f;
        switch (this.f229280a) {
            case 0:
                u uVar = (u) this.f229281b;
                PaymentGroup group = (PaymentGroup) this.f229282c;
                k kVarZ2 = uVar.z2();
                Intrinsics.h(group);
                do3.n user = kVarZ2.f229271b;
                List remindersInvite = kVarZ2.f229272c;
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(remindersInvite, "remindersInvite");
                Data data = zi0.c.P(new k(group, user, remindersInvite), false, null, 3);
                ((j) obj2).getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                return new j(data);
            case 1:
                f fVar = (f) this.f229281b;
                b0 b0Var = (b0) this.f229282c;
                ot1.b updateState = (ot1.b) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ot1.b.a(updateState, (ot1.c) fVar.invoke(b0Var.y2()));
            case 2:
                com.revolut.feature.apm.blik.impl.ui.flow.a aVar = (com.revolut.feature.apm.blik.impl.ui.flow.a) this.f229281b;
                BlikFlowContract$Step blikFlowContract$Step = (BlikFlowContract$Step) this.f229282c;
                n0 output = (n0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, k0.f20338a) || Intrinsics.f(output, m0.f20343a)) {
                    dki.g.F2(aVar, blikFlowContract$Step, false, TransitionAnimation.NONE.f98393a, 8);
                } else {
                    if (!Intrinsics.f(output, l0.f20341a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.I2();
                }
                return Unit.f186387a;
            case 3:
                ou5.b bVar = (ou5.b) this.f229281b;
                xi0.b bVar2 = (xi0.b) this.f229282c;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                CryptoCommodityPositions cryptoCommodityPositions = (CryptoCommodityPositions) rVar.f314201a;
                List list = (List) rVar.f314202b;
                PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) rVar.f314203c;
                List list2 = pocketBalancesWithSum.f71384a;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((CombinedPocketsBalance) it8.next()).f71373a.f115083b);
                }
                Set setI1 = d0.i1(arrayList);
                ArrayList arrayList2 = cryptoCommodityPositions.f71383b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (setI1.contains(((CryptoCommodityPosition) obj3).f71379a)) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    ej0.b bVarI = bVar.i((CombinedPocketsBalance) it9.next(), arrayList3, list, bVar2);
                    if (bVarI != null) {
                        arrayList4.add(bVarI);
                    }
                }
                dj0.d dVar = pocketBalancesWithSum.f71385b;
                Object obj4 = bVar.d;
                dj0.d dVarC = dj0.d.c(mif.a.P(wt5.a.c(arrayList4), bVar2.c(), 2), 0L, bVar2, 1);
                long j2 = pyd.c.H(dVar, dVarC).f115082a;
                if (j2 != 0) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVarC.f115082a);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    BigDecimal scale2 = bigDecimalValueOf.setScale(8, roundingMode);
                    Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(j2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    BigDecimal bigDecimalDivide = scale2.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                    BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                    scale = bigDecimalDivide.multiply(bigDecimalValueOf3).setScale(4, roundingMode);
                    Intrinsics.h(scale);
                } else {
                    scale = BigDecimal.ZERO;
                    Intrinsics.h(scale);
                }
                return new jt5.a(dVar, dVarC, scale);
            case 4:
                ou9.c cVar = (ou9.c) this.f229281b;
                du9.a aVar2 = (du9.a) this.f229282c;
                do3.n user2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                String str2 = do3.q.y(user2).f297794a;
                cVar.getClass();
                int i = ou9.b.f229851a[aVar2.ordinal()];
                if (i == 1) {
                    str = "legal/communitystandards/";
                } else if (i == 2) {
                    str = "legal/terms/";
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "legal/chat-privacy-notice/";
                }
                return a0.d.s("https://www.revolut.com/en-", str2, "/", str);
            case 5:
                com.revolut.feature.kyc.impl.flow.input_document_id.a aVar3 = (com.revolut.feature.kyc.impl.flow.input_document_id.a) this.f229281b;
                KYCDocumentIdInputScreen kYCDocumentIdInputScreen = (KYCDocumentIdInputScreen) this.f229282c;
                com.revolut.feature.kyc.impl.screens.documentid_input.a output2 = (com.revolut.feature.kyc.impl.screens.documentid_input.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                Continuation continuation = null;
                if (Intrinsics.f(output2, a.C0513a.f77867a)) {
                    aVar3.C1(new BridgeDestination(new FinishCommand(0, null, null, 6)));
                } else {
                    if (!(output2 instanceof bx8.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.l2(new oqk.i(aVar3, output2, kYCDocumentIdInputScreen, continuation, 2), new yi5.b(26));
                }
                return Unit.f186387a;
            case 6:
                return ovb.e.a((ovb.e) obj2, (Data) this.f229281b, null, (Integer) this.f229282c, null, null, null, false, 122);
            case 7:
                jul.o oVar = (jul.o) this.f229281b;
                pwg.n params = (pwg.n) this.f229282c;
                pwg.d assetIndicator = (pwg.d) obj2;
                Intrinsics.checkNotNullParameter(assetIndicator, "assetIndicator");
                ArrayList arrayList5 = assetIndicator.f;
                ArrayList entries = new ArrayList();
                for (Object obj5 : arrayList5) {
                    if (((pwg.c) obj5).d == pwg.s.SECURITY) {
                        entries.add(obj5);
                    }
                }
                kgm.i iVar = (kgm.i) oVar.f178696c;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(entries, "entries");
                int iB = q0.b(w.t(entries, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj6 : entries) {
                    linkedHashMap.put(((pwg.c) obj6).f240453a, obj6);
                }
                return nim.a.v(nim.a.v(u0.m(rd0.e.b(ybl.b.d((ybl.b) iVar.f184024c, d0.d1(linkedHashMap.keySet()))), ((y) ((ybl.d) iVar.f184023b)).e(params.f240475b, w4l.h.f294642c)), new awk.j(linkedHashMap, iVar)), new oqk.c(assetIndicator, 25));
            case 8:
                oxe.g gVar = (oxe.g) this.f229281b;
                String cvv = (String) this.f229282c;
                oxe.i update = (oxe.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String maskedCardNumber = gVar.f230787a;
                String expireDate = gVar.f230788b;
                int i2 = gVar.f230789c;
                Intrinsics.checkNotNullParameter(maskedCardNumber, "maskedCardNumber");
                Intrinsics.checkNotNullParameter(expireDate, "expireDate");
                Intrinsics.checkNotNullParameter(cvv, "cvv");
                return new oxe.g(maskedCardNumber, expireDate, i2, cvv);
            case 9:
                dsd.i iVar2 = (dsd.i) this.f229281b;
                TextLocalisedClause textLocalisedClause = (TextLocalisedClause) this.f229282c;
                Intrinsics.checkNotNullParameter((Clause) obj2, "it");
                return ((f01.c) iVar2.f117299a).b(textLocalisedClause).toString();
            case 10:
                h0d.j jVar = (h0d.j) this.f229281b;
                ozc.t tVar = (ozc.t) this.f229282c;
                Map savedMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(savedMap, "savedMap");
                boolean zContainsKey = savedMap.containsKey(jVar.a());
                gzc.i iVarA = jVar.a();
                tVar.getClass();
                h0d.h hVar = jVar instanceof h0d.h ? (h0d.h) jVar : null;
                Iterable iterable = hVar != null ? hVar.d.f147997b.e : null;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable<gzc.g> iterable2 = iterable;
                ArrayList arrayList6 = new ArrayList(w.t(iterable2, 10));
                for (gzc.g gVar2 : iterable2) {
                    String str3 = gVar2.f148000c;
                    gzc.s sVar = gVar2.e;
                    arrayList6.add(new yzc.e(str3, sVar.f148037b, gVar2.f147998a, gVar2.d, sVar, gVar2.f, gVar2.f147999b));
                }
                Map mapQ = r0.q(savedMap, new Pair(iVarA, arrayList6));
                if (!zContainsKey) {
                    savedMap = mapQ;
                }
                return savedMap;
            case 11:
                ozc.t tVar2 = (ozc.t) this.f229281b;
                yzc.f fVar2 = (yzc.f) this.f229282c;
                Map fileMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(fileMap, "fileMap");
                ozc.g gVar3 = tVar2.f231329b;
                h0d.j jVar2 = (h0d.j) ((od0.i) ((s0) gVar3).J0().get()).g();
                if (jVar2 == null || (iVarO3 = jVar2.a()) == null) {
                    iVarO3 = tVar2.o3();
                }
                te0.e eVarC0 = ((s0) gVar3).C0();
                Object obj7 = fileMap.get(iVarO3);
                Object obj8 = obj7;
                if (obj7 == null) {
                    obj8 = f0.f322471a;
                }
                return te0.w.z0(eVarC0, foh.i.w(iVarO3, d0.A0((Iterable) obj8, fVar2), fileMap));
            case 12:
                ozc.t tVar3 = (ozc.t) this.f229281b;
                String str4 = (String) this.f229282c;
                List path = (List) obj2;
                Intrinsics.checkNotNullParameter(path, "path");
                return te0.w.z0(((s0) tVar3.f231329b).D0(), d0.F0(str4, path));
            case 13:
                ozc.t tVar4 = (ozc.t) this.f229281b;
                gzc.n incomeSource = (gzc.n) this.f229282c;
                gzc.i evidenceDocument = (gzc.i) obj2;
                Intrinsics.checkNotNullParameter(evidenceDocument, "it");
                Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
                Intrinsics.checkNotNullParameter(evidenceDocument, "evidenceDocument");
                efm.d0 d0VarFirstOrError = m70.a.g(tVar4.f.d(new kxc.c(kxc.a.SOW, incomeSource.f148015b, evidenceDocument.f148003a)), null, null, 3).firstOrError();
                d0VarFirstOrError.getClass();
                return new pfm.a(new pfm.h(d0VarFirstOrError, 4), mfm.f.f205044g, 1);
            case 14:
                ozc.t tVar5 = (ozc.t) this.f229281b;
                yzc.d dVar2 = (yzc.d) this.f229282c;
                Map fileMap2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(fileMap2, "fileMap");
                s0 s0Var = (s0) tVar5.f231329b;
                h0d.j jVar3 = (h0d.j) ((od0.i) s0Var.J0().get()).g();
                if (jVar3 == null || (iVarO32 = jVar3.a()) == null) {
                    iVarO32 = tVar5.o3();
                }
                te0.e eVarC02 = s0Var.C0();
                Object obj9 = fileMap2.get(iVarO32);
                Object obj10 = obj9;
                if (obj9 == null) {
                    obj10 = f0.f322471a;
                }
                return te0.w.z0(eVarC02, r0.q(fileMap2, new Pair(iVarO32, d0.F0(dVar2, (Collection) obj10)))).e(te0.w.z0(s0Var.P0(), Boolean.TRUE));
            case 15:
                ozc.t tVar6 = (ozc.t) this.f229281b;
                h0d.h hVar2 = (h0d.h) this.f229282c;
                Set documentsIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(documentsIds, "documentsIds");
                return te0.w.z0(((s0) tVar6.f231329b).w0(), a1.m(documentsIds, hVar2.d.f147996a));
            case 16:
                ozc.l0 l0Var = (ozc.l0) this.f229281b;
                f0d.e eVar = (f0d.e) this.f229282c;
                List questions = (List) obj2;
                Intrinsics.checkNotNullParameter(questions, "questions");
                ozc.d dVar3 = l0Var.f231293a;
                List list3 = questions;
                ArrayList questions2 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    questions2.add(new f0d.d((gzc.r) it10.next(), null, eVar));
                }
                ozc.t tVar7 = (ozc.t) dVar3;
                tVar7.getClass();
                Intrinsics.checkNotNullParameter(questions2, "questions");
                s0 s0Var2 = (s0) tVar7.f231329b;
                return te0.w.z0(s0Var2.f231324s.getValue(s0Var2, s0.z[17]), questions2);
            case 17:
                p1g.m mVar = (p1g.m) this.f229281b;
                Set set = (Set) this.f229282c;
                List bookings = (List) obj2;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                if (!((p1g.e) ((j2) mVar.f231933t.f22677a).getValue()).f231921c) {
                    return bookings;
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj11 : bookings) {
                    TravelExperiencesBooking travelExperiencesBooking = (TravelExperiencesBooking) obj11;
                    if (!set.contains(travelExperiencesBooking.f92747b) && travelExperiencesBooking.d.isAfter(((l80.f) mVar.o).g())) {
                        arrayList7.add(obj11);
                    }
                }
                return arrayList7;
            case 18:
                h1 h1Var = (h1) this.f229281b;
                p24.p pVar = (p24.p) this.f229282c;
                xz3.d it11 = (xz3.d) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return n14.c.a(it11, a0.d.r(h1Var.f137835a, "/agreement"), pVar.f232056b);
            case 19:
                p2a.b bVar3 = (p2a.b) this.f229281b;
                String str5 = (String) this.f229282c;
                em2.g result = (em2.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                bVar3.T2(new oqk.i(bVar3, str5, result, null, 7), new yi5.b(27));
                return Unit.f186387a;
            case 20:
                p2b.b bVar4 = (p2b.b) this.f229281b;
                xi0.b bVar5 = (xi0.b) this.f229282c;
                y49.f content = (y49.f) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                bVar4.getClass();
                return (bVar5 == null || Intrinsics.f(content.f310846c.f115083b, bVar5)) ? f0.f322471a : zhm.u.c(new Pair(content.f310846c.f115083b, bVar5));
            case 21:
                p2b.b bVar6 = (p2b.b) this.f229281b;
                n9l.b bVar7 = (n9l.b) this.f229282c;
                List currencyPairs = (List) obj2;
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                return rd0.e.b(bVar6.f232193b.d(currencyPairs, bVar7));
            case 22:
                Data data2 = (Data) this.f229281b;
                cli.y yVar = ((com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) this.f229282c).v;
                p2c.i iVar3 = (p2c.i) obj2;
                List list4 = (List) data2.getContent();
                yvh.b bVar8 = null;
                Object obj12 = null;
                if (list4 != null) {
                    Iterator it12 = list4.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            Object next = it12.next();
                            if (((yvh.b) next).e == yvh.h.LOYALTY_PROFILE) {
                                obj12 = next;
                            }
                        }
                    }
                    bVar8 = (yvh.b) obj12;
                }
                boolean z = false;
                if (bVar8 != null && bVar8.f317177b) {
                    z = true;
                }
                int iFloatValue = (bVar8 == null || (f = bVar8.i) == null) ? ((p2c.i) ((j2) yVar.f22677a).getValue()).f232211a : (int) f.floatValue();
                return p2c.i.a(iVar3, iFloatValue, (z && (((p2c.i) ((j2) yVar.f22677a).getValue()).f232212b instanceof p2c.j) && !((p2c.i) ((j2) yVar.f22677a).getValue()).f232213c) ? new p2c.j(p2c.a.a(iFloatValue)) : ((p2c.i) ((j2) yVar.f22677a).getValue()).f232212b, data2, null, null, 52);
            case 23:
                p2i.r rVar2 = (p2i.r) this.f229281b;
                p2i.f fVar3 = (p2i.f) this.f229282c;
                int iW = kli.a.w(R$attr.uikit_dp24, rVar2.f232256q.f22265a) + ((Integer) obj2).intValue();
                RecyclerView recyclerViewZ0 = ((RecurringOrderSettingsActivityV2) fVar3).Z0();
                recyclerViewZ0.setPadding(recyclerViewZ0.getPaddingLeft(), recyclerViewZ0.getPaddingTop(), recyclerViewZ0.getPaddingRight(), iW);
                return Unit.f186387a;
            case 24:
                p3c.a aVar4 = (p3c.a) this.f229281b;
                w4l.k kVar = (w4l.k) this.f229282c;
                List ticketIds = (List) obj2;
                Intrinsics.checkNotNullParameter(ticketIds, "ticketIds");
                return aVar4.f232731b.b(ticketIds, kVar);
            case 25:
                p4a.j jVar4 = (p4a.j) this.f229281b;
                qla.a aVar5 = (qla.a) this.f229282c;
                return new p4a.d(aVar5);
            case 26:
                p4f.f fVar4 = (p4f.f) this.f229281b;
                TransferSubjectId transferSubjectId = (TransferSubjectId) this.f229282c;
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return vzg.a.c(fVar4.f232927c, transferSubjectId.getF95657a(), n9l.b.SEC_30, currency, 2);
            case 27:
                return NavHostKt.NavHost$lambda$69$lambda$68((State) this.f229281b, (ComposeNavigator) this.f229282c, (DisposableEffectScope) obj2);
            case 28:
                return NavHostKt.NavHost$lambda$48$lambda$47((NavHostController) this.f229281b, (LifecycleOwner) this.f229282c, (DisposableEffectScope) obj2);
            default:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f229281b;
                p54.j jVar5 = (p54.j) this.f229282c;
                yhm.r rVar3 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar3, "<destruct>");
                Integer num = (Integer) rVar3.f314201a;
                int iIntValue = ((Number) rVar3.f314202b).intValue();
                boolean zBooleanValue = ((Boolean) rVar3.f314203c).booleanValue();
                if (!zBooleanValue) {
                    ref$IntRef.f186408a = iIntValue;
                }
                jVar5.f244503l.d(!(((float) ref$IntRef.f186408a) > ((float) num.intValue()) * 0.2f && zBooleanValue));
                return Unit.f186387a;
        }
    }
}
