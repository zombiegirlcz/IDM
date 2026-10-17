package cam;

import com.revolut.data.model.Data;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.b0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import r10.w;
import te8.z;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u = 0;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f22687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f22688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22689y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, String str, String str2, String str3, Map map, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f22688x = tVar;
        this.v = str;
        this.f22689y = str2;
        this.z = str3;
        this.A = map;
        this.f22687w = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o((t) this.f22688x, this.v, (String) this.f22689y, (String) this.z, (Map) this.A, this.f22687w, continuation);
            default:
                o oVar = new o((f78.a) this.f22689y, this.v, (w4l.k) this.z, (w) this.A, this.f22687w, continuation);
                oVar.f22688x = obj2;
                return oVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Response responseG;
        Object next;
        w4l.h hVar;
        Flow flow;
        Flow flowK;
        Flow flowF;
        int i = this.u;
        Object obj3 = this.f22689y;
        Object obj4 = this.A;
        Object obj5 = this.z;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Response response = null;
                try {
                    responseG = t.G((t) this.f22688x, this.v, (String) obj3, (String) obj5, (Map) obj4, this.f22687w);
                } catch (Throwable th10) {
                    th = th10;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    kotlin.jvm.internal.d dVarK = ue8.c.k(responseG.f);
                    while (dVarK.hasNext()) {
                        Pair pair = (Pair) dVarK.next();
                        jSONObject.put((String) pair.f186385a, pair.f186386b);
                    }
                    JSONObject jSONObjectPut = new JSONObject().put("status", responseG.d);
                    ResponseBody responseBody = responseG.f226090g;
                    JSONObject jSONObjectPut2 = jSONObjectPut.put("data", responseBody != null ? responseBody.string() : null).put("headers", jSONObject);
                    responseG.close();
                    return jSONObjectPut2;
                } catch (Throwable th11) {
                    th = th11;
                    response = responseG;
                    if (response != null) {
                        response.close();
                    }
                    throw th;
                }
            default:
                w4l.k loadingStrategy = (w4l.k) obj5;
                w wVar = (w) obj4;
                Pair pair2 = (Pair) this.f22688x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fo3.c wallet = (fo3.c) pair2.f186385a;
                List pockets = (List) pair2.f186386b;
                String str = wallet.f136801a;
                f78.a aVar3 = (f78.a) obj3;
                a61.a aVar4 = (a61.a) aVar3.f132564c;
                xi0.b baseCurrency = wallet.d;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                Iterator it8 = pockets.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        io3.d dVar = (io3.d) next;
                        if (dVar.e != io3.l.CURRENT || !Intrinsics.f(dVar.f163147c, baseCurrency.f306286a) || dVar.f163149h == io3.i.EXTERNAL) {
                        }
                    } else {
                        next = null;
                    }
                }
                io3.d dVar2 = (io3.d) next;
                if (dVar2 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Base pocket could not be found for junior");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                hj8.a aVar5 = (hj8.a) aVar3.f;
                String juniorId = this.v;
                Flow flowB = cj9.c.B(hj8.a.c(aVar5, juniorId, loadingStrategy), cj9.c.z(wVar, "observeJuniorBankingProfileById"));
                Flow flowB2 = cj9.c.B(((te8.e) aVar3.f132568l).a(juniorId, loadingStrategy), cj9.c.z(wVar, "observeChildKyc"));
                Flow flowB3 = cj9.c.B(osg.b.f((wsg.n) aVar3.k, juniorId, loadingStrategy), cj9.c.z(wVar, "observeWalletProfileByOwnerId"));
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                wsg.n nVar = (wsg.n) aVar4.f1532c;
                boolean z = this.f22687w;
                Flow flowB4 = cj9.c.B(nim.a.v(rd0.e.b(nVar.O(pockets, z, baseCurrency)), new atg.c(wallet, 3)), cj9.c.z(wVar, "observeBalanceOfPockets"));
                Flow flowB5 = cj9.c.B(((d89.g) ((x79.a) aVar3.f132566h)).e(z79.b.JUNIOR), cj9.c.z(wVar, "onHoldAccountsFlow"));
                Flow flowB6 = cj9.c.B(rd0.e.b(l93.f.k((l93.f) aVar3.i, str, b93.d.RETAIL, z, 8)), cj9.c.z(wVar, "observeCardsData"));
                Flow flowB7 = cj9.c.B(rd0.e.b(((m78.d) aVar3.f132565g).b(str, dVar2 != null ? dVar2.f163145a : null, loadingStrategy)), cj9.c.z(wVar, "observeTransactions"));
                Flow flowB8 = cj9.c.B(ic8.b.a((ic8.b) aVar3.f132563b, juniorId, z), cj9.c.z(wVar, "observeCardRequestsPresent"));
                r10.d dVar3 = (r10.d) aVar3.f132562a;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Flow flowB9 = cj9.c.B(vkm.q.q(mo3.a.e(xam.a.h(new a9h.a(dVar3, juniorId, loadingStrategy, (Continuation) null, 7), rd0.e.b(osg.b.a((wsg.n) dVar3.f250819b, juniorId, loadingStrategy instanceof w4l.i, 4))), new f5g.l(3), new f5g.l(4))), cj9.c.z(wVar, "observeGraduation"));
                b0 b0Var = (b0) aVar3.d;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                om8.c cVar = (om8.c) b0Var.f185144b;
                w4l.h hVar2 = w4l.h.f294642c;
                Flow flowB10 = cj9.c.B(nim.a.v(cVar.a(juniorId, hVar2), new m62.l(5)), cj9.c.z(wVar, "observePartnershipsActionAvailable"));
                Flow flowB11 = cj9.c.B(((ang.f) aVar3.f132567j).j(w4l.j.f294644c), cj9.c.z(wVar, "observeUser"));
                r10.a aVar6 = (r10.a) aVar3.e;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                if (((jte.d) ((gte.a) aVar6.f250811a)).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it9 = pockets.iterator();
                    while (it9.hasNext()) {
                        Iterator it10 = it9;
                        Object next2 = it10.next();
                        Flow flow2 = flowB11;
                        w4l.h hVar3 = hVar2;
                        if (((io3.d) next2).e == io3.l.CURRENT) {
                            arrayList.add(next2);
                        }
                        it9 = it10;
                        flowB11 = flow2;
                        hVar2 = hVar3;
                    }
                    hVar = hVar2;
                    flow = flowB11;
                    if (arrayList.isEmpty()) {
                        flowK = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    } else {
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                        Iterator it11 = arrayList.iterator();
                        while (it11.hasNext()) {
                            io3.d dVar4 = (io3.d) it11.next();
                            arrayList2.add(rd0.e.b(nim.a.w(((m78.d) aVar6.f250812b).b(wallet.f136801a, dVar4.f163145a, loadingStrategy), new afa.s(dVar4, 4))));
                            it11 = it11;
                            aVar6 = aVar6;
                        }
                        flowK = u0.k(arrayList2);
                    }
                } else {
                    flowK = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                    hVar = hVar2;
                    flow = flowB11;
                }
                Flow flowB12 = cj9.c.B(flowK, cj9.c.z(wVar, "observePocketsWithTransactions"));
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                boolean zC = ((jte.d) ((gte.a) aVar4.f1531b)).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c);
                int i2 = 6;
                od0.i iVar = od0.i.f224256b;
                if (zC) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : pockets) {
                        if (((io3.d) obj6).e == io3.l.CURRENT) {
                            arrayList3.add(obj6);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        od0.i.Companion.getClass();
                        flowF = new go.g(iVar, 2);
                    } else {
                        flowF = mo3.a.f(rd0.e.b(((wsg.n) aVar4.f1532c).O(arrayList3, z, baseCurrency)), new g5k.f(5), new fnk.o(wallet, 22), new g5k.f(i2));
                    }
                } else {
                    od0.i.Companion.getClass();
                    flowF = new go.g(iVar, 2);
                }
                Flow flowB13 = cj9.c.B(flowF, cj9.c.z(wVar, "observeBalanceOfCurrentPocketTypes"));
                mp.p pVar = (mp.p) aVar3.f132570n;
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                return new acb.i((Flow[]) d0.d1(v.k(flowB, flowB2, flowB3, flowB4, flowB5, flowB6, flowB7, flowB8, flowB9, flowB10, flow, flowB12, flowB13, cj9.c.B(!((jte.d) ((gte.a) pVar.f207709b)).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? new go.g(new Data(Boolean.FALSE, null, false, 6, null), 2) : nim.a.v(u0.m(((wsg.b) pVar.f207710c).e(hVar), rd0.e.b(z.b((z) pVar.d, juniorId, false, 6))), new g64.c(5)), cj9.c.z(wVar, "observeMulticurrencyDiscoverAvailable")))).toArray(new Flow[0]), aVar3, this.v, str, dVar2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f78.a aVar, String str, w4l.k kVar, w wVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f22689y = aVar;
        this.v = str;
        this.z = kVar;
        this.A = wVar;
        this.f22687w = z;
    }
}
