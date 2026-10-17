package tfh;

import com.revolut.core.mobile_services.api.exceptions.MsApiException;
import com.revolut.feature.external_accounts.api.model.ExternalAccountModel;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel;
import com.revolut.feature.external_accounts.api.model.RevokeUrlDataModel;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import h93.f0;
import ha3.x;
import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ngm.n;
import qe6.d;
import qe6.e;
import qe6.f;
import uh6.l;
import yh6.e0;
import zh9.d1;
import zh9.e1;
import zh9.h;
import zh9.i;
import zh9.i0;
import zh9.i1;
import zh9.j;
import zh9.j1;
import zh9.k;
import zh9.p;
import zh9.x0;
import zh9.y;
import zh9.y0;
import zhm.a0;
import zhm.d0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270312a;

    public /* synthetic */ a(int i) {
        this.f270312a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i iVar;
        h hVar;
        j jVar;
        int i = this.f270312a;
        od0.i iVar2 = od0.i.f224256b;
        boolean z = false;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 1:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return Intrinsics.f(command, c.b()) ? new q06.i(new q06.b(ibb.c.f160141b, null)) : new q06.h(new BridgeDestination(command), null);
            case 2:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List<uh6.i> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (uh6.i iVar3 : list2) {
                    Intrinsics.checkNotNullParameter(iVar3, "<this>");
                    String externalId = iVar3.getExternalId();
                    String name = iVar3.getName();
                    String accountNumber = iVar3.getAccountNumber();
                    String type = iVar3.getType();
                    xi0.a aVar = xi0.b.Companion;
                    String currency = iVar3.getCurrency();
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(currency);
                    List alternateCurrencies = iVar3.getAlternateCurrencies();
                    ArrayList arrayList2 = new ArrayList(w.t(alternateCurrencies, 10));
                    Iterator it8 = alternateCurrencies.iterator();
                    while (it8.hasNext()) {
                        t61.a.A(xi0.b.Companion, (String) it8.next(), arrayList2);
                    }
                    arrayList.add(new ExternalAccountModel(externalId, name, accountNumber, type, bVarA, arrayList2));
                }
                return arrayList;
            case 3:
                uh6.b it9 = (uh6.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                return new LinkAuthorizationUrlDataModel.AuthorizationUrlModel(it9.getAuthUrl());
            case 4:
                l it10 = (l) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                return new RevokeUrlDataModel((d) u1.u(it10.getStatus(), r0.k(new Pair("REDIRECT_NEEDED", d.REDIRECT_NEEDED), new Pair("FINISHED", d.FINISHED))), it10.getRedirectUrl());
            case 5:
                e0 it11 = (e0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                Intrinsics.checkNotNullParameter(it11, "<this>");
                String status = it11.getStatus();
                if (Intrinsics.f(status, "FINISHED")) {
                    return f.a.f245089a;
                }
                if (!Intrinsics.f(status, "AUTH_NEEDED")) {
                    throw new IllegalArgumentException(j6.a.q("Unknown status ", it11.getStatus()));
                }
                String authUri = it11.getAuthUri();
                if (authUri != null) {
                    return new e(authUri);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 6:
                Intrinsics.checkNotNullParameter((th6.a) obj2, "it");
                return null;
            case 7:
                List mandates = (List) obj2;
                Intrinsics.checkNotNullParameter(mandates, "mandates");
                List list3 = mandates;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it12 = list3.iterator();
                while (it12.hasNext()) {
                    arrayList3.add(xh6.a.a((uh6.j) it12.next()));
                }
                return arrayList3;
            case 8:
                th9.a it13 = (th9.a) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f271327a;
            case 9:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof UndeliverableException) {
                    if (!tj0.a.a(throwable.getCause()) && !(throwable.getCause() instanceof MsApiException)) {
                        od0.a aVar2 = od0.a.f224253a;
                        if (od0.a.e() && !od0.a.i()) {
                            throw throwable;
                        }
                    }
                    return Unit.f186387a;
                }
                if (!(throwable instanceof IOException) && !(throwable instanceof InterruptedException)) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                    return Unit.f186387a;
                }
                return Unit.f186387a;
            case 10:
                od0.i it14 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                i0 i0Var = (i0) it14.f224257a;
                if (i0Var != null && (iVar = i0Var.f322286b) != null && (hVar = iVar.f) != null && hVar.f322271h) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list4 = (List) pair.f186385a;
                List list5 = (List) pair.f186386b;
                int iB = q0.b(w.t(list5, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list5) {
                    y yVar = (y) obj3;
                    linkedHashMap.put(new ti9.d(yVar.f322365a.f322326a, yVar.f322366b.f322316a), obj3);
                }
                List<d1> list6 = list4;
                ArrayList arrayList4 = new ArrayList(w.t(list6, 10));
                for (d1 d1Var : list6) {
                    arrayList4.add(new e1(d1Var, (y) r0.h(new ti9.d(d1Var.f322260b, d1Var.f322261c), linkedHashMap)));
                }
                return arrayList4;
            case 12:
                zh9.r0 plan = (zh9.r0) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                ArrayList arrayList5 = plan.B;
                ArrayList arrayList6 = new ArrayList();
                Iterator it15 = arrayList5.iterator();
                while (it15.hasNext()) {
                    a0.x(((p) it15.next()).f322319g, arrayList6);
                }
                return new Pair(plan, arrayList6);
            case 13:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                return Integer.valueOf(plans.size());
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar2;
            case 15:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                j1 state = (j1) pair2.f186385a;
                od0.i iVar4 = (od0.i) pair2.f186386b;
                od0.h hVar2 = od0.i.Companion;
                i0 i0Var2 = (i0) iVar4.f224257a;
                obj = i0Var2 != null ? i0Var2.f322286b : null;
                hVar2.getClass();
                od0.i accountConfig = od0.h.a(obj);
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
                return accountConfig.f224257a != null ? new x0(state, (i) accountConfig.c()) : y0.a.f322367a;
            case 16:
                vf0.h hVar3 = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar3, "<destruct>");
                j1 j1Var = (j1) hVar3.f288433a;
                yt8.c cVar = (yt8.c) hVar3.f288434b;
                ArrayList<f0> arrayListE0 = d0.E0((List) hVar3.f288435c, v.l(((od0.i) hVar3.d).f224257a));
                ArrayList arrayList7 = new ArrayList();
                for (f0 f0Var : arrayListE0) {
                    if (f0Var.S()) {
                        jVar = new j(f0Var, k.ReadyToUse);
                    } else if (!(j1Var instanceof i1)) {
                        jVar = new j(f0Var, k.NotReadyToUse);
                    } else if (f0Var.M() || f0Var.C()) {
                        jVar = new j(f0Var, k.NotSupported);
                    } else {
                        Boolean[] elements = {Boolean.valueOf(f0Var.x()), Boolean.valueOf(f0Var.U()), Boolean.valueOf(f0Var.f150126y && !f0Var.d), Boolean.valueOf(f0Var.c() && !h93.h0.e(f0Var)), Boolean.valueOf(f0Var.G()), Boolean.valueOf(f0Var.F()), Boolean.valueOf(h93.h0.b(f0Var)), Boolean.valueOf(f0Var.C()), Boolean.valueOf(f0Var.M())};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        jVar = (kotlin.collections.d.y0(elements).contains(Boolean.TRUE) || !n.p(cVar.f316662a)) ? new j(f0Var, k.NotAvailable) : new j(f0Var, k.ReadyToUse);
                    }
                    arrayList7.add(jVar);
                }
                return arrayList7;
            case 17:
                od0.i it16 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                if (!it16.d()) {
                    od0.i.Companion.getClass();
                    return iVar2;
                }
                od0.h hVar4 = od0.i.Companion;
                String cardBrand = uj3.b.F((e93.f) it16.c()).f13640b;
                String str = ((e93.e) it16.c()).v;
                Intrinsics.checkNotNullParameter("retail_disposable", "cardId");
                Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
                f0 f0VarR = x.r("retail_disposable", cardBrand, null, str);
                hVar4.getClass();
                return od0.h.a(f0VarR);
            case 18:
                List plans2 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans2, "plans");
                List<zh9.r0> list7 = plans2;
                ArrayList arrayList8 = new ArrayList(w.t(list7, 10));
                for (zh9.r0 r0Var : list7) {
                    ArrayList arrayList9 = r0Var.B;
                    ArrayList arrayList10 = new ArrayList(w.t(arrayList9, 10));
                    Iterator it17 = arrayList9.iterator();
                    while (it17.hasNext()) {
                        arrayList10.add(new y((p) it17.next(), r0Var));
                    }
                    arrayList8.add(arrayList10);
                }
                return w.u(arrayList8);
            case 19:
                List<zh9.r0> plans3 = (List) obj2;
                Intrinsics.checkNotNullParameter(plans3, "plans");
                ArrayList arrayList11 = new ArrayList();
                for (zh9.r0 r0Var2 : plans3) {
                    List listP0 = d0.P0(r0Var2.B, new ti9.e());
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj4 : listP0) {
                        p pVar = (p) obj4;
                        if (czi.c.F(pVar) || czi.c.C(pVar)) {
                            arrayList12.add(obj4);
                        }
                    }
                    ArrayList arrayList13 = new ArrayList(w.t(arrayList12, 10));
                    Iterator it18 = arrayList12.iterator();
                    while (it18.hasNext()) {
                        arrayList13.add(new y((p) it18.next(), r0Var2));
                    }
                    a0.x(arrayList13, arrayList11);
                }
                return arrayList11;
            case 20:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                xi0.b bVar = (xi0.b) pair3.f186385a;
                for (io3.d dVar : (List) pair3.f186386b) {
                    if (Intrinsics.f(dVar.f163147c, bVar.f306286a)) {
                        return z92.f.j(dVar);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 21:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                od0.h hVar5 = od0.i.Companion;
                Iterator it19 = cards.iterator();
                while (true) {
                    if (it19.hasNext()) {
                        Object next = it19.next();
                        if (((f0) next).S()) {
                            obj = next;
                        }
                    }
                }
                hVar5.getClass();
                return od0.h.a(obj);
            case 22:
                i it20 = (i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.e.f115083b;
            case 23:
                List list8 = (List) obj2;
                ArrayList arrayList14 = new ArrayList(w.t(list8, 10));
                Iterator it21 = list8.iterator();
                while (it21.hasNext()) {
                    arrayList14.add(((ux4.b) it21.next()).f283864a);
                }
                return new ux4.b(w.u(arrayList14));
            case 24:
                yoj.a aVar3 = (yoj.a) obj2;
                return wp5.y.s(aVar3, "it", aVar3);
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return xh9.c.f305835a;
            case 27:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list9 = pockets;
                if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                    Iterator it22 = list9.iterator();
                    while (true) {
                        if (it22.hasNext()) {
                            if (((io3.d) it22.next()).r() == io3.k.ACTIVE) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 28:
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return Boolean.valueOf(!r1.isEmpty());
            default:
                List<koi.j> it23 = (List) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                ArrayList arrayList15 = new ArrayList();
                for (koi.j jVar2 : it23) {
                    qv0.p pVar2 = jVar2 instanceof qv0.p ? (qv0.p) jVar2 : null;
                    Object f53876p = pVar2 != null ? pVar2.getF() : null;
                    if (f53876p != null) {
                        arrayList15.add(f53876p);
                    }
                }
                return arrayList15;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f270312a = i;
    }
}
