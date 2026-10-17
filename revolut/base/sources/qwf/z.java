package qwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.transit_checkout.fields.TransitCheckoutFieldValue;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import com.revolut.feature.transport.models.transit.TransitTicket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends jki.g implements q {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ouf.a f249938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ivf.h f249939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q7c.m f249940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final swf.b f249941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wwf.e f249942t;
    public final jvf.c u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wj0.a f249943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a2 f249944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f249945y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(TransitCheckoutScreenContract$InputData inputData, ouf.a transportInteractor, ivf.h userPocketInteractor, q7c.m quoteInteractor, swf.b transitCheckoutFieldExtension, wwf.e transitCheckoutPurchaseExtension, jvf.c transitPollingExtension, j60.a bottomExpandableDialog, wj0.a idempotencyKeyHolder, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(userPocketInteractor, "userPocketInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(transitCheckoutFieldExtension, "transitCheckoutFieldExtension");
        Intrinsics.checkNotNullParameter(transitCheckoutPurchaseExtension, "transitCheckoutPurchaseExtension");
        Intrinsics.checkNotNullParameter(transitPollingExtension, "transitPollingExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f249938p = transportInteractor;
        this.f249939q = userPocketInteractor;
        this.f249940r = quoteInteractor;
        this.f249941s = transitCheckoutFieldExtension;
        this.f249942t = transitCheckoutPurchaseExtension;
        this.u = transitPollingExtension;
        this.v = bottomExpandableDialog;
        this.f249943w = idempotencyKeyHolder;
        TransitTicket transitTicket = inputData.f92566a;
        ArrayList arrayList = transitTicket.f92713m;
        int iB = q0.b(zhm.w.t(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            String f92614a = ((TransportCheckoutField) it8.next()).getF92620a();
            m70.a.c(t0.f186434a);
            linkedHashMap.put(f92614a, new TransitCheckoutFieldValue.TextField(""));
        }
        ArrayList arrayList2 = transitTicket.f92713m;
        ArrayList arrayList3 = transitTicket.f92714n;
        swf.a aVar = new swf.a(linkedHashMap, arrayList2.isEmpty());
        int iB2 = q0.b(zhm.w.t(arrayList3, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            String f92614a2 = ((TransportCheckoutField) it9.next()).getF92620a();
            m70.a.c(t0.f186434a);
            linkedHashMap2.put(f92614a2, new TransitCheckoutFieldValue.TextField(""));
        }
        f0 f0Var = f0.f322471a;
        ArrayList arrayListE0 = d0.E0(arrayList3, transitTicket.f92713m);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayListE0) {
            if (((TransportCheckoutField) obj2).getD()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
        Iterator it10 = arrayList4.iterator();
        while (it10.hasNext()) {
            arrayList5.add(((TransportCheckoutField) it10.next()).getF92620a());
        }
        this.f249945y = new o(transitTicket, 1L, aVar, linkedHashMap2, f0Var, d0.i1(arrayList5), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), null);
    }

    @Override // yji.l
    public final void I1() {
        ArrayList arrayList = this.f249945y.f249916a.f92714n;
        Map mapG = r0.g();
        swf.b bVar = this.f249941s;
        bVar.i3(arrayList, mapG);
        Continuation continuation = null;
        yji.l.a1(this, bVar.Z2(), null, null, new w(this, continuation, 1), 3);
        this.f249943w.a("TRANSIT_IDEMPOTENCY_TAG");
        yji.l.a1(this, vkm.q.Q(vkm.q.q(new qna.n(q2(), this, 3)), new q7b.j(continuation, this, 24)), null, null, new w(this, continuation, 0), 3);
        yji.l.a1(this, vkm.q.q(vkm.q.Q(q2(), new bwb.k(3, 16, continuation))), null, null, new qg4.d(this, continuation, 25), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f249945y;
    }

    public final void y2(bxf.e params, AtomicBoolean atomicBoolean) {
        TransitTicket ticket = ((o) t2()).f249916a;
        boolean z = atomicBoolean.get();
        pza.d onConfigReceived = new pza.d(this, 29, atomicBoolean, params);
        wwf.o oVar = (wwf.o) this.f249942t;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(onConfigReceived, "onConfigReceived");
        oVar.T2(new a9j.o(oVar, z, params, onConfigReceived, ticket, (Continuation) null), new yi5.b(27));
    }

    public final ArrayList z2(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            TransitCheckoutFieldValue transitCheckoutFieldValue = (TransitCheckoutFieldValue) entry.getValue();
            if (((o) t2()).f.contains(str) || transitCheckoutFieldValue.getF92577a().length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new bxf.d((String) entry2.getKey(), ((TransitCheckoutFieldValue) entry2.getValue()).getF92577a()));
        }
        return arrayList;
    }
}
