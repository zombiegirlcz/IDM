package wa7;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.india.netbanking.model.IndiaNetBankingInstitutions;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyAttributes;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyReferenceItem;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartySettings;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidget;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidgetNextReward;
import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import ig8.h;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import le.u1;
import lzi.q;
import lzi.r;
import lzi.s;
import lzi.u;
import tof.a3;
import uyh.k0;
import w5b.n1;
import w5b.u7;
import w5b.x;
import w5b.x7;
import w5b.z4;
import wim.z;
import wn9.a;
import y20.b1;
import y5b.c0;
import y5b.i0;
import z0d.t;
import zhm.a1;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f295841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                j jVar = new j(3, 0, (Continuation) obj4);
                jVar.v = (Set) obj2;
                jVar.f295841w = (Set) obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            case 1:
                j jVar2 = new j((waj.a) this.f295841w, (Continuation) obj4, 1);
                jVar2.v = (List) obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
            case 2:
                j jVar3 = new j((wpj.e) this.f295841w, (Continuation) obj4, 2);
                jVar3.v = (q) obj3;
                return jVar3.invokeSuspend(Unit.f186387a);
            case 3:
                j jVar4 = new j((wvd.b) this.f295841w, (Continuation) obj4, 3);
                jVar4.v = (List) obj3;
                return jVar4.invokeSuspend(Unit.f186387a);
            case 4:
                j jVar5 = new j(3, 4, (Continuation) obj4);
                jVar5.v = (SelectedMethod) obj2;
                jVar5.f295841w = (SelectedMethod) obj3;
                return jVar5.invokeSuspend(Unit.f186387a);
            case 5:
                j jVar6 = new j((x0d.b) this.f295841w, (Continuation) obj4, 5);
                jVar6.v = (t) obj3;
                return jVar6.invokeSuspend(Unit.f186387a);
            case 6:
                j jVar7 = new j((x0d.e) this.f295841w, (Continuation) obj4, 6);
                jVar7.v = (List) obj3;
                return jVar7.invokeSuspend(Unit.f186387a);
            case 7:
                j jVar8 = new j((x46.b) this.f295841w, (Continuation) obj4, 7);
                jVar8.v = (List) obj3;
                return jVar8.invokeSuspend(Unit.f186387a);
            case 8:
                j jVar9 = new j((com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) this.f295841w, (Continuation) obj4, 8);
                jVar9.v = (Throwable) obj3;
                return jVar9.invokeSuspend(Unit.f186387a);
            case 9:
                j jVar10 = new j((xe7.d) this.f295841w, (Continuation) obj4, 9);
                jVar10.v = (ve7.n) obj3;
                return jVar10.invokeSuspend(Unit.f186387a);
            case 10:
                j jVar11 = new j((xg8.j) this.f295841w, (Continuation) obj4, 10);
                jVar11.v = (od0.i) obj3;
                return jVar11.invokeSuspend(Unit.f186387a);
            case 11:
                j jVar12 = new j((xia.b) this.f295841w, (Continuation) obj4, 11);
                jVar12.v = (via.a) obj3;
                return jVar12.invokeSuspend(Unit.f186387a);
            case 12:
                j jVar13 = new j(3, 12, (Continuation) obj4);
                jVar13.v = (a3) obj2;
                jVar13.f295841w = (do3.n) obj3;
                return jVar13.invokeSuspend(Unit.f186387a);
            case 13:
                j jVar14 = new j((b1) this.f295841w, (Continuation) obj4, 13);
                jVar14.v = (List) obj3;
                return jVar14.invokeSuspend(Unit.f186387a);
            case 14:
                j jVar15 = new j(3, 14, (Continuation) obj4);
                jVar15.v = (Data) obj2;
                jVar15.f295841w = (yhm.m) obj3;
                return jVar15.invokeSuspend(Unit.f186387a);
            case 15:
                j jVar16 = new j((y5b.p) this.f295841w, (Continuation) obj4, 15);
                jVar16.v = (r5b.a) obj3;
                return jVar16.invokeSuspend(Unit.f186387a);
            case 16:
                j jVar17 = new j((c0) this.f295841w, (Continuation) obj4, 16);
                jVar17.v = (r5b.j) obj3;
                return jVar17.invokeSuspend(Unit.f186387a);
            case 17:
                j jVar18 = new j((c0) this.f295841w, (Continuation) obj4, 17);
                jVar18.v = (String) obj3;
                return jVar18.invokeSuspend(Unit.f186387a);
            case 18:
                j jVar19 = new j((i0) this.f295841w, (Continuation) obj4, 18);
                jVar19.v = (CobrandedCardsWidget) obj3;
                return jVar19.invokeSuspend(Unit.f186387a);
            case 19:
                j jVar20 = new j((y9d.e) this.f295841w, (Continuation) obj4, 19);
                jVar20.v = (List) obj3;
                return jVar20.invokeSuspend(Unit.f186387a);
            case 20:
                j jVar21 = new j((yn9.c) this.f295841w, (Continuation) obj4, 20);
                jVar21.v = (List) obj3;
                return jVar21.invokeSuspend(Unit.f186387a);
            case 21:
                j jVar22 = new j((yvd.c) this.f295841w, (Continuation) obj4, 21);
                jVar22.v = (List) obj3;
                return jVar22.invokeSuspend(Unit.f186387a);
            case 22:
                j jVar23 = new j((yvd.c) this.f295841w, (Continuation) obj4, 22);
                jVar23.v = (vtd.c) obj3;
                return jVar23.invokeSuspend(Unit.f186387a);
            case 23:
                j jVar24 = new j((zb8.b) this.f295841w, (Continuation) obj4, 23);
                jVar24.v = (List) obj3;
                return jVar24.invokeSuspend(Unit.f186387a);
            case 24:
                j jVar25 = new j((zeb.g) this.f295841w, (Continuation) obj4, 24);
                jVar25.v = (Map) obj3;
                return jVar25.invokeSuspend(Unit.f186387a);
            default:
                j jVar26 = new j((zh6.c) this.f295841w, (Continuation) obj4, 25);
                jVar26.v = (IndiaNetBankingInstitutions) obj3;
                return jVar26.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xpj.b bVar;
        String str;
        ig8.e eVar;
        x7 x7Var;
        Iterator it8;
        ArrayList arrayList;
        a.c cVar;
        String str2;
        a.C1650a c1650a;
        wb8.l lVar;
        wb8.k kVar;
        wb8.j jVar;
        dj0.d dVar;
        wb8.a aVar;
        wb8.a aVar2;
        int i = 0;
        int i2 = 1;
        wb8.k kVar2 = null;
        int i3 = 10;
        switch (this.u) {
            case 0:
                Set set = (Set) this.v;
                Set set2 = (Set) this.f295841w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return a1.l(set, set2);
            case 1:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((waj.a) this.f295841w).f295946c;
                Intrinsics.checkNotNullParameter(list, "<this>");
                List<taj.i> list2 = list;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (taj.i iVar : list2) {
                    String str3 = iVar.f269351a.f306286a;
                    String string = iVar.f269352b.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    taj.g gVar = iVar.f269353c;
                    String str4 = gVar.f269348a;
                    ArrayList<taj.b> arrayList3 = gVar.f269349b;
                    ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                    for (taj.b bVar2 : arrayList3) {
                        arrayList4.add(new vaj.f(bVar2.f269342a, bVar2.f269343b, bVar2.f269344c));
                    }
                    ArrayList<taj.d> arrayList5 = gVar.f269350c;
                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                    for (taj.d dVar2 : arrayList5) {
                        arrayList6.add(new vaj.i(dVar2.f269345a.name(), dVar2.f269346b, dVar2.f269347c));
                    }
                    arrayList2.add(new vaj.c(str3, string, new vaj.l(arrayList4, arrayList6, str4)));
                }
                cVar2.G(new vaj.o(arrayList2), "CRYPTO_PRE_LAUNCH_STORAGE_KEY", z.d(o0.b(vaj.o.class)));
                return Unit.f186387a;
            case 2:
                q qVar = (q) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = ((wpj.e) this.f295841w).f299349c;
                Intrinsics.checkNotNullParameter(qVar, "<this>");
                List<u> list3 = qVar.f200998a;
                ArrayList arrayList7 = new ArrayList(w.t(list3, 10));
                for (u uVar : list3) {
                    if (uVar instanceof lzi.t) {
                        lzi.t tVar = (lzi.t) uVar;
                        bVar = new xpj.b(tVar.f201004a.b(), null, Integer.valueOf(tVar.f201005b));
                    } else if (uVar instanceof r) {
                        r rVar = (r) uVar;
                        bVar = new xpj.b(rVar.f200999a.b(), Integer.valueOf(rVar.f201000b), Integer.valueOf(rVar.f201001c));
                    } else {
                        if (!(uVar instanceof s)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s sVar = (s) uVar;
                        bVar = new xpj.b(sVar.f201002a.b(), Integer.valueOf(sVar.f201003b), null);
                    }
                    arrayList7.add(bVar);
                }
                cVar3.G(new xpj.a(arrayList7), "budget_suggestion_config", z.d(o0.b(xpj.a.class)));
                return Unit.f186387a;
            case 3:
                List list4 = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wvd.b) this.f295841w).f300312a.G(list4, "AUTO_STAKING_STORAGE_KEY", kii.e.o(vvd.c.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 4:
                SelectedMethod selectedMethod = (SelectedMethod) this.v;
                SelectedMethod selectedMethod2 = (SelectedMethod) this.f295841w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return selectedMethod == null ? selectedMethod2 : selectedMethod;
            case 5:
                t tVar2 = (t) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x0d.b) this.f295841w).f301568c.G(tVar2, "MEMORY_CACHE_KEY_SUPERVISION_CONFIG", z.d(o0.b(t.class)));
                return Unit.f186387a;
            case 6:
                List list5 = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x0d.e) this.f295841w).f301573c.G(list5, "CACHE_KEY_GUARDIAN_INVITATIONS", kii.e.o(z0d.f.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 7:
                List list6 = (List) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v46.a aVar11 = ((x46.b) this.f295841w).f302799b;
                List<qta.c> list7 = list6;
                ArrayList arrayList8 = new ArrayList(w.t(list7, 10));
                for (qta.c cVar4 : list7) {
                    Intrinsics.checkNotNullParameter(cVar4, "<this>");
                    String str5 = cVar4.f249046a.f306286a;
                    String str6 = cVar4.f249047b.f306286a;
                    String plainString = cVar4.f249048c.toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    BigDecimal bigDecimal = cVar4.d;
                    arrayList8.add(new w46.b(str5, str6, plainString, bigDecimal != null ? bigDecimal.toPlainString() : null));
                }
                aVar11.getClass();
                DBUtil.performBlocking(aVar11.f285981a, false, true, new k0(aVar11, arrayList8, 18));
                return Unit.f186387a;
            case 8:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (th10 == null) {
                    ((com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a) this.f295841w).f62641w.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 9:
                ve7.n nVar = (ve7.n) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xe7.d) this.f295841w).f304544c.G(nVar, "INCENTIVE_EXPERIMENTS_KEY", z.d(o0.b(ve7.n.class)));
                return Unit.f186387a;
            case 10:
                ue0.c cVar5 = ((xg8.j) this.f295841w).d;
                od0.i iVar2 = (od0.i) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (iVar2.d()) {
                    ig8.i iVar3 = (ig8.i) iVar2.c();
                    Intrinsics.checkNotNullParameter(iVar3, "<this>");
                    jo3.b bVarA = hx7.a.A(iVar3.f161092a);
                    dj0.d dVar3 = iVar3.f161093b;
                    jo3.b bVarA2 = dVar3 != null ? hx7.a.A(dVar3) : null;
                    long j2 = iVar3.f161094c;
                    ig8.h hVar = iVar3.d;
                    if (hVar instanceof h.b) {
                        str = "CONFIRMED";
                    } else if (hVar instanceof h.a) {
                        str = "COMPLETION_STARTED";
                    } else {
                        if (!(hVar instanceof ig8.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "COMPLETION_FAILED";
                    }
                    String str7 = str;
                    ig8.g gVar2 = hVar instanceof ig8.g ? (ig8.g) hVar : null;
                    String strG = (gVar2 == null || (eVar = gVar2.f161089a) == null) ? null : u1.g(eVar, ug8.a.b());
                    Boolean boolValueOf = Boolean.valueOf(iVar3.e);
                    boolean z = iVar3.f;
                    ig8.f fVar = iVar3.f161095g;
                    cVar5.G(new wg8.b(bVarA, bVarA2, j2, str7, strG, boolValueOf, z, fVar != null ? new wg8.a(fVar.f161086a, fVar.f161087b, fVar.f161088c) : null), "ASSET_STORAGE_KEY", z.d(o0.b(wg8.b.class)));
                } else {
                    cVar5.I0("ASSET_STORAGE_KEY");
                }
                return Unit.f186387a;
            case 11:
                via.a aVar15 = (via.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((xia.b) this.f295841w).f306317c.G(aVar15, "PRO_POST_ACTIVATION_KEY", z.d(o0.b(via.a.class)));
                return Unit.f186387a;
            case 12:
                a3 a3Var = (a3) this.v;
                do3.n nVar2 = (do3.n) this.f295841w;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return new Pair(a3Var, nVar2);
            case 13:
                List messages = (List) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z20.j jVar2 = ((b1) this.f295841w).f310460l;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(messages, "messages");
                ArrayList arrayList9 = new ArrayList();
                Iterator it9 = messages.iterator();
                while (it9.hasNext()) {
                    u10.i iVarL = jVar2.f318920b.l((v20.n) it9.next());
                    if (iVarL != null) {
                        arrayList9.add(iVarL);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    r10.r rVarO = jVar2.a().o();
                    rVarO.getClass();
                    DBUtil.performBlocking((RoomDatabase) rVarO.f250851a, false, true, new r10.b(rVarO, arrayList9, 7));
                }
                return Unit.f186387a;
            case 14:
                Data data = (Data) this.v;
                yhm.m mVar = (yhm.m) this.f295841w;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (data.getContent() == null) {
                    return data;
                }
                if (mVar == null) {
                    return Data.copy$default(data, null, null, true, 3, null);
                }
                Throwable error = data.getError();
                if (error == null) {
                    error = yhm.m.a(mVar.f314193a);
                }
                return Data.copy$default(data, null, error, false, 5, null);
            case 15:
                r5b.a aVar20 = (r5b.a) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar6 = ((y5b.p) this.f295841w).f311058b;
                Map map = x5b.a.f302925a;
                Intrinsics.checkNotNullParameter(aVar20, "<this>");
                String str8 = aVar20.f251556a;
                ArrayList<r5b.d> arrayList10 = aVar20.f251557b;
                ArrayList arrayList11 = new ArrayList(w.t(arrayList10, 10));
                for (r5b.d dVar4 : arrayList10) {
                    Intrinsics.checkNotNullParameter(dVar4, "<this>");
                    arrayList11.add(new x(dVar4.f251561a, dVar4.f251562b, dVar4.f251563c));
                }
                ArrayList<r5b.b> arrayList12 = aVar20.f251558c;
                ArrayList arrayList13 = new ArrayList(w.t(arrayList12, 10));
                for (r5b.b bVar3 : arrayList12) {
                    Intrinsics.checkNotNullParameter(bVar3, "<this>");
                    arrayList13.add(new w5b.r(bVar3.f251559a, u1.g(bVar3.f251560b, x5b.a.f302925a)));
                }
                cVar6.G(new w5b.u(str8, arrayList11, arrayList13, md7.a.d(aVar20.d)), "KEY_BILLING", z.d(o0.b(w5b.u.class)));
                return Unit.f186387a;
            case 16:
                r5b.j jVar3 = (r5b.j) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar7 = ((c0) this.f295841w).f311027b;
                Intrinsics.checkNotNullParameter(jVar3, "<this>");
                cVar7.G(new n1(jVar3.f251573a, jVar3.f251574b, jVar3.f251575c, jVar3.d), "KEY_PLAN_CURRENT", z.d(o0.b(n1.class)));
                return Unit.f186387a;
            case 17:
                String str9 = (String) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((c0) this.f295841w).f311027b.G(new z4(str9), "KEY_PRODUCT_ARTICLE", z.d(o0.b(z4.class)));
                return Unit.f186387a;
            case 18:
                CobrandedCardsWidget cobrandedCardsWidget = (CobrandedCardsWidget) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar8 = ((i0) this.f295841w).f311046b;
                Map map2 = x5b.i.f302931a;
                Intrinsics.checkNotNullParameter(cobrandedCardsWidget, "<this>");
                String str10 = cobrandedCardsWidget.f82486a;
                String str11 = cobrandedCardsWidget.f82487b;
                r5b.r rVar2 = cobrandedCardsWidget.f82488c;
                String strG2 = rVar2 != null ? u1.g(rVar2, x5b.i.f302931a) : null;
                String str12 = cobrandedCardsWidget.d;
                String str13 = cobrandedCardsWidget.e;
                CobrandedCardsWidgetNextReward cobrandedCardsWidgetNextReward = cobrandedCardsWidget.f;
                if (cobrandedCardsWidgetNextReward != null) {
                    Intrinsics.checkNotNullParameter(cobrandedCardsWidgetNextReward, "<this>");
                    x7Var = new x7(cobrandedCardsWidgetNextReward.f82489a, cobrandedCardsWidgetNextReward.f82490b, cobrandedCardsWidgetNextReward.f82491c, cobrandedCardsWidgetNextReward.d);
                } else {
                    x7Var = null;
                }
                cVar8.G(new u7(str10, str11, strG2, str12, str13, x7Var), "KEY_WIDGET", z.d(o0.b(u7.class)));
                return Unit.f186387a;
            case 19:
                List list8 = (List) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y9d.e eVar2 = (y9d.e) this.f295841w;
                ReentrantReadWriteLock reentrantReadWriteLock = eVar2.f311840g;
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i5 = 0; i5 < readHoldCount; i5++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    ue0.c cVar9 = eVar2.d;
                    List list9 = list8;
                    ArrayList arrayList14 = new ArrayList(w.t(list9, 10));
                    Iterator it10 = list9.iterator();
                    while (it10.hasNext()) {
                        arrayList14.add(x9d.a.c((InvoiceTemplate) it10.next()));
                    }
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(r9d.b.class);
                    companion.getClass();
                    cVar9.G(arrayList14, "invoices:templates:storage", z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                    Unit unit = Unit.f186387a;
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    return Unit.f186387a;
                } catch (Throwable th11) {
                    while (i < readHoldCount) {
                        lock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th11;
                }
            case 20:
                List list10 = (List) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar10 = ((yn9.c) this.f295841w).f315272b;
                List list11 = list10;
                ArrayList arrayList15 = new ArrayList(w.t(list11, 10));
                Iterator it11 = list11.iterator();
                while (it11.hasNext()) {
                    PaymentCounterpartyInfo paymentCounterpartyInfo = (PaymentCounterpartyInfo) it11.next();
                    Intrinsics.checkNotNullParameter(paymentCounterpartyInfo, "<this>");
                    String str14 = paymentCounterpartyInfo.f79060a;
                    String strB = paymentCounterpartyInfo.f79061b.b();
                    String strName = paymentCounterpartyInfo.f79062c.name();
                    String str15 = paymentCounterpartyInfo.d;
                    String str16 = paymentCounterpartyInfo.e;
                    String str17 = paymentCounterpartyInfo.f;
                    List list12 = paymentCounterpartyInfo.f79063g;
                    if (list12 != null) {
                        List list13 = list12;
                        it8 = it11;
                        ArrayList arrayList16 = new ArrayList(w.t(list13, i3));
                        Iterator it12 = list13.iterator();
                        while (it12.hasNext()) {
                            PaymentCounterpartyReferenceItem paymentCounterpartyReferenceItem = (PaymentCounterpartyReferenceItem) it12.next();
                            Intrinsics.checkNotNullParameter(paymentCounterpartyReferenceItem, "<this>");
                            arrayList16.add(new a.b(paymentCounterpartyReferenceItem.f79065a, paymentCounterpartyReferenceItem.f79066b, paymentCounterpartyReferenceItem.f79067c));
                            it12 = it12;
                            str14 = str14;
                        }
                        arrayList = arrayList16;
                    } else {
                        it8 = it11;
                        arrayList = null;
                    }
                    String str18 = str14;
                    PaymentCounterpartySettings paymentCounterpartySettings = paymentCounterpartyInfo.f79064h;
                    if (paymentCounterpartySettings != null) {
                        Intrinsics.checkNotNullParameter(paymentCounterpartySettings, "<this>");
                        cVar = new a.c(paymentCounterpartySettings.f79068a, paymentCounterpartySettings.f79069b, paymentCounterpartySettings.f79070c);
                    } else {
                        cVar = null;
                    }
                    PaymentCounterpartyAttributes paymentCounterpartyAttributes = paymentCounterpartyInfo.i;
                    if (paymentCounterpartyAttributes != null) {
                        Intrinsics.checkNotNullParameter(paymentCounterpartyAttributes, "<this>");
                        str2 = str18;
                        c1650a = new a.C1650a(paymentCounterpartyAttributes.f79058a);
                    } else {
                        str2 = str18;
                        c1650a = null;
                    }
                    arrayList15.add(new wn9.a(str2, strB, strName, str15, str16, str17, cVar, arrayList, c1650a));
                    it11 = it8;
                    i3 = 10;
                }
                cVar10.G(arrayList15, "KEY_COUNTERPARTY", kii.e.o(wn9.a.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 21:
                List stakingPockets = (List) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jud.b bVar4 = ((yvd.c) this.f295841w).f317164b;
                Intrinsics.checkNotNullParameter(stakingPockets, "stakingPockets");
                List<zvd.b> list14 = stakingPockets;
                ArrayList arrayList17 = new ArrayList(w.t(list14, 10));
                for (zvd.b stakingPocketFacade : list14) {
                    Intrinsics.checkNotNullParameter(stakingPocketFacade, "stakingPocketFacade");
                    arrayList17.add(new mud.a(stakingPocketFacade.f325659a, stakingPocketFacade.f325660b, hx7.a.A(stakingPocketFacade.f325661c), hx7.a.A(stakingPocketFacade.d), hx7.a.A(stakingPocketFacade.e)));
                }
                bVar4.c(arrayList17);
                return Unit.f186387a;
            case 22:
                vtd.c stakingRewards = (vtd.c) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jud.f fVar2 = ((yvd.c) this.f295841w).f317165c;
                Intrinsics.checkNotNullParameter(stakingRewards, "stakingRewards");
                Intrinsics.checkNotNullParameter(stakingRewards, "stakingRewards");
                fVar2.a(new mud.b(stakingRewards.f292100a, hx7.a.A(stakingRewards.f292101b), stakingRewards.f292102c));
                return Unit.f186387a;
            case 23:
                List list15 = (List) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar11 = ((zb8.b) this.f295841w).f320841a;
                Intrinsics.checkNotNullParameter(list15, "<this>");
                List list16 = list15;
                ArrayList arrayList18 = new ArrayList(w.t(list16, 10));
                Iterator it13 = list16.iterator();
                while (it13.hasNext()) {
                    nb8.b bVar5 = (nb8.b) it13.next();
                    String str19 = bVar5.f214006a;
                    int i6 = vb8.a.d[bVar5.f214007b.ordinal()];
                    if (i6 == i2) {
                        lVar = wb8.l.ACTIVE;
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lVar = wb8.l.INACTIVE;
                    }
                    Instant instant = bVar5.f214008c;
                    Instant instant2 = bVar5.d;
                    nb8.e eVar3 = bVar5.e;
                    switch (eVar3 == null ? -1 : vb8.a.e[eVar3.ordinal()]) {
                        case -1:
                            kVar = kVar2;
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            kVar = wb8.k.P1D;
                            break;
                        case 2:
                            kVar = wb8.k.P7D;
                            break;
                        case 3:
                            kVar = wb8.k.P1W;
                            break;
                        case 4:
                            kVar = wb8.k.P2W;
                            break;
                        case 5:
                            kVar = wb8.k.P14D;
                            break;
                        case 6:
                            kVar = wb8.k.P1M;
                            break;
                        case 7:
                            kVar = wb8.k.P1Y;
                            break;
                    }
                    LocalDate localDate = bVar5.f;
                    LocalDate localDate2 = bVar5.f214009g;
                    nb8.d dVar5 = bVar5.f214010h;
                    Iterator it14 = it13;
                    wb8.j jVar4 = new wb8.j(dVar5.f214013a, dVar5.f214014b);
                    wb8.d dVar6 = new wb8.d(bVar5.i.f214012a);
                    dj0.d dVar7 = bVar5.f214011j;
                    nb8.a aVar30 = bVar5.k;
                    int i21 = aVar30 == null ? -1 : vb8.a.f[aVar30.ordinal()];
                    if (i21 != -1) {
                        if (i21 == 1) {
                            aVar2 = wb8.a.STANDING_ORDER_INSUFFICIENT_FUNDS;
                        } else {
                            if (i21 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2 = wb8.a.STANDING_ORDER_TOPUP_LIMIT_EXCEEDED;
                        }
                        aVar = aVar2;
                        jVar = jVar4;
                        dVar = dVar7;
                    } else {
                        jVar = jVar4;
                        dVar = dVar7;
                        aVar = null;
                    }
                    arrayList18.add(new wb8.g(str19, lVar, instant, instant2, kVar, localDate, localDate2, jVar, dVar6, dVar, aVar));
                    it13 = it14;
                    i2 = 1;
                    kVar2 = null;
                }
                cVar11.G(arrayList18, "ALLOWANCE_RECURRING_PAYMENTS_KEY", kii.e.o(wb8.g.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 24:
                Map map3 = (Map) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar12 = ((zeb.g) this.f295841w).f321655c;
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map3.size()));
                for (Map.Entry entry : map3.entrySet()) {
                    linkedHashMap.put(((ReverywhereMiniAppName) entry.getKey()).getF82889a(), entry.getValue());
                }
                cVar12.G(linkedHashMap, "REVERYWHERE_CONFIG_STORAGE_KEY", z.d(o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(zeb.c.class)))));
                return Unit.f186387a;
            default:
                IndiaNetBankingInstitutions indiaNetBankingInstitutions = (IndiaNetBankingInstitutions) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    ((zh6.c) this.f295841w).f322240b.G(c6d.b.L(indiaNetBankingInstitutions), "NET_BANKING_STORAGE_KEY", z.d(o0.b(ff6.a.class)));
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f295841w = obj2;
    }
}
