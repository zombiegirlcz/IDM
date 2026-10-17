package s1c;

import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.rev_points.models.SpareChangeRefund;
import com.revolut.feature.rev_points.models.SpareChangeRefundQuote;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import dsh.l;
import ip0.nb0;
import ip0.pb0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.q;
import m1c.v1;
import m1c.w1;
import mha.k;
import mha.s;
import r1c.g;
import r1c.h;
import r33.a;
import retrofit2.HttpException;
import retrofit2.Response;
import rp0.e1;
import s2g.z;
import s38.i;
import yhm.r;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259125a;

    public /* synthetic */ a(int i) {
        this.f259125a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r1c.a aVar;
        s sVarP;
        int i = 0;
        w1 w1Var = null;
        kVar = null;
        k kVar = null;
        Object obj3 = null;
        switch (this.f259125a) {
            case 0:
                r1c.e it8 = (r1c.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Intrinsics.checkNotNullParameter(it8, "<this>");
                return new v1(it8.getId(), it8.getEnabled(), it8.getMultiplier());
            case 1:
                r1c.e it9 = (r1c.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                return new v1(it9.getId(), it9.getEnabled(), it9.getMultiplier());
            case 2:
                g it10 = (g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj4 = q1c.a.f241419a;
                Intrinsics.checkNotNullParameter(it10, "<this>");
                String strB = it10.getId();
                String strE = it10.getState();
                w1[] w1VarArrValues = w1.values();
                int length = w1VarArrValues.length;
                while (true) {
                    if (i < length) {
                        w1 w1Var2 = w1VarArrValues[i];
                        if (a0.z(w1Var2.name(), strE, true)) {
                            w1Var = w1Var2;
                        } else {
                            i++;
                        }
                    }
                }
                if (w1Var == null) {
                    w1Var = w1.NOT_REQUESTED;
                }
                return new SpareChangeRefund(strB, w1Var, mo3.a.o(it10.getReversalAmount()), mo3.a.o(it10.getRefundAmount()), null, Long.valueOf(it10.getCreatedDate()), Long.valueOf(it10.getUpdatedDate()));
            case 3:
                Response response = (Response) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccessful()) {
                    return Boolean.TRUE;
                }
                throw new HttpException(response);
            case 4:
                Response response2 = (Response) obj2;
                Intrinsics.checkNotNullParameter(response2, "response");
                if (response2.isSuccessful() && (aVar = (r1c.a) response2.body()) != null) {
                    Object obj5 = q1c.a.f241419a;
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    return new q(aVar.getMaxRefundablePurchaseAge());
                }
                return new q(null);
            case 5:
                Response response3 = (Response) obj2;
                Intrinsics.checkNotNullParameter(response3, "response");
                if (!response3.isSuccessful()) {
                    throw new HttpException(response3);
                }
                Object objBody = response3.body();
                if (objBody == null) {
                    throw new IllegalStateException("response's body is null");
                }
                h hVar = (h) objBody;
                Object obj6 = q1c.a.f241419a;
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                return new SpareChangeRefundQuote(mo3.a.o(hVar.getReversalAmount()), mo3.a.o(hVar.getRefundAmount()), hVar.getToken());
            case 6:
                xi0.b it11 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zi0.c.P(it11, false, null, 3);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                xi0.b bVar = (xi0.b) pair.f186385a;
                Iterator it12 = ((List) pair.f186386b).iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next = it12.next();
                        if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                            obj3 = next;
                        }
                    }
                }
                return (io3.d) obj3;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                List agentInfoList = (List) obj2;
                Intrinsics.checkNotNullParameter(agentInfoList, "agentInfoList");
                List list = agentInfoList;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj7 : list) {
                    linkedHashMap.put(((AgentInfo) obj7).f50997a, obj7);
                }
                return linkedHashMap;
            case 11:
                rzj.k news = (rzj.k) obj2;
                Intrinsics.checkNotNullParameter(news, "news");
                return new s28.a(news);
            case 12:
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (Boolean) it13.getContent();
            case 13:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return (Boolean) it14.getContent();
            case 14:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                v19.a aVar2 = (v19.a) pair2.f186385a;
                Boolean bool = (Boolean) pair2.f186386b;
                bool.booleanValue();
                return new Pair(aVar2, bool);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                while (i < 3) {
                    eVarB.add(nb0.b(pb0.Companion, a0.d.n("STORE_BRAND_DETAIL_DISCOUNT_LOADING_", i), true, 0, false, 28));
                    i++;
                }
                return new s2e.h(u.a(eVarB));
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return z.d();
            case 17:
                ExchangeOrder it15 = (ExchangeOrder) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Data(it15, null, false, 6, null);
            case 18:
                ExchangeOrder order = (ExchangeOrder) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                return te0.w.h((cp5.d.y(order.getF72134a().e) || hx7.q.L(order.getF72134a())) ? new Data(order, null, false, 6, null) : new Data(null, null, false, 6, null));
            case 19:
                ExchangeOrder it16 = (ExchangeOrder) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.getF72134a().f72138b;
            case 20:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                ExchangeOrder exchangeOrder = (ExchangeOrder) rVar.f314201a;
                Data data = (Data) rVar.f314202b;
                Data data2 = (Data) rVar.f314203c;
                List list2 = (List) data.getContent();
                if (list2 != null && (sVarP = mra.d.p(list2)) != null) {
                    kVar = sVarP.f205466g;
                }
                return nd.k.l(exchangeOrder, kVar, (ChargeBreakdown) data2.getContent());
            case 21:
                r33.a it17 = (r33.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Intrinsics.checkNotNullParameter(it17, "<this>");
                a.C1385a disclaimer = it17.getDisclaimer();
                String text = disclaimer != null ? disclaimer.getText() : null;
                return text != null ? new g93.b(new g93.a(text)) : new g93.b(null);
            case 22:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 23:
                return ((k1j.b) obj2).f180284c;
            case 24:
                e16.d it18 = (e16.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f121891c;
            case 25:
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                int i2 = i.f259466a[output.ordinal()];
                return Unit.f186387a;
            case 26:
                aii.r output2 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof qfd.b)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                List list3 = ((qfd.b) output2).f245290b;
                String strK0 = list3 != null ? d0.k0(list3, ",", null, null, 0, null, 62) : null;
                dsh.f fVar = new dsh.f();
                if (strK0 != null) {
                    fVar.a("WATCHLIST_WIDGET_ASSET_IDS", strK0);
                }
                return new l(new dsh.e(fVar));
            case 27:
                aii.r output3 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (!(output3 instanceof nfd.a)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                dsh.f fVar2 = new dsh.f();
                fVar2.a("watchlistID", ((nfd.a) output3).f214898a);
                return new l(new dsh.e(fVar2));
            case 28:
                e1 result = (e1) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                throw null;
            default:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f259125a = i;
    }
}
