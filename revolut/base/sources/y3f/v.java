package y3f;

import com.revolut.feature.trading.impl.data.network.TradingTransactionsService;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import dfl.i0;
import dfl.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.y;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements f4f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingTransactionsService f310728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f310729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3f.b f310730c;
    public final g3f.a d;
    public final j3f.f e;
    public final ne0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f310731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d4f.q f310732h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f310733j;

    public v(TradingTransactionsService tradingTransactionsService, l tradingTransactionsPageLoader, g3f.b recentTradingTransactionsMemoryCache, g3f.a pagedTradingTransactionsMemoryCache, j3f.f tradesDao, ne0.j memoryCache, gte.a featureToggleInteractor, d4f.q tradingTransactionsLoader) {
        Intrinsics.checkNotNullParameter(tradingTransactionsService, "tradingTransactionsService");
        Intrinsics.checkNotNullParameter(tradingTransactionsPageLoader, "tradingTransactionsPageLoader");
        Intrinsics.checkNotNullParameter(recentTradingTransactionsMemoryCache, "recentTradingTransactionsMemoryCache");
        Intrinsics.checkNotNullParameter(pagedTradingTransactionsMemoryCache, "pagedTradingTransactionsMemoryCache");
        Intrinsics.checkNotNullParameter(tradesDao, "tradesDao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsLoader, "tradingTransactionsLoader");
        this.f310728a = tradingTransactionsService;
        this.f310729b = tradingTransactionsPageLoader;
        this.f310730c = recentTradingTransactionsMemoryCache;
        this.d = pagedTradingTransactionsMemoryCache;
        this.e = tradesDao;
        this.f = memoryCache;
        this.f310731g = featureToggleInteractor;
        this.f310732h = tradingTransactionsLoader;
        Continuation continuation = null;
        final int i = 0;
        final int i2 = 0;
        this.i = new x4l.c(new wqj.g(this, continuation, 24), new Function1(this) { // from class: y3f.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f310713b;

            {
                this.f310713b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i) {
                    case 0:
                        z2f.g params = (z2f.g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean z = params instanceof z2f.f;
                        v vVar = this.f310713b;
                        if (z) {
                            g3f.b bVar = vVar.f310730c;
                            z2f.f params2 = (z2f.f) params;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(params2, "params");
                            return (r0) bVar.f140292a.get(params2);
                        }
                        if (!(params instanceof z2f.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g3f.a aVar = vVar.d;
                        z2f.d params3 = (z2f.d) params;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (r0) aVar.f140291a.get(params3);
                    default:
                        z2f.c params4 = (z2f.c) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        v vVar2 = this.f310713b;
                        i0 i0Var = (i0) hx7.q.p(vVar2.f, params4);
                        if (i0Var != null) {
                            return i0Var;
                        }
                        Map mapSnapshot = vVar2.f310730c.f140292a.snapshot();
                        ArrayList arrayList = new ArrayList(mapSnapshot.size());
                        Iterator it8 = mapSnapshot.entrySet().iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((r0) ((Map.Entry) it8.next()).getValue()).f114450a);
                        }
                        ArrayList arrayListU = w.u(arrayList);
                        Map mapSnapshot2 = vVar2.d.f140291a.snapshot();
                        ArrayList arrayList2 = new ArrayList(mapSnapshot2.size());
                        Iterator it9 = mapSnapshot2.entrySet().iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((r0) ((Map.Entry) it9.next()).getValue()).f114450a);
                        }
                        Iterator it10 = d0.E0(w.u(arrayList2), arrayListU).iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.f(((i0) next).f(), params4.f319063a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (i0) next;
                }
            }
        }, new Function2(this) { // from class: y3f.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f310715b;

            {
                this.f310715b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        z2f.g params = (z2f.g) obj2;
                        r0 page = (r0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(page, "content");
                        boolean z = params instanceof z2f.f;
                        v vVar = this.f310715b;
                        if (z) {
                            g3f.b bVar = vVar.f310730c;
                            z2f.f params2 = (z2f.f) params;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(params2, "params");
                            Intrinsics.checkNotNullParameter(page, "page");
                            bVar.f140292a.put(params2, page);
                        } else {
                            if (!(params instanceof z2f.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            g3f.a aVar = vVar.d;
                            z2f.d params3 = (z2f.d) params;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(params3, "params");
                            Intrinsics.checkNotNullParameter(page, "page");
                            aVar.f140291a.put(params3, page);
                        }
                        return Unit.f186387a;
                    default:
                        z2f.c params4 = (z2f.c) obj2;
                        i0 trade = (i0) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(trade, "trade");
                        hx7.q.U(this.f310715b.f, params4, trade);
                        return Unit.f186387a;
                }
            }
        }, new t(this, continuation, 1), new wqj.g(this, continuation, 25));
        final int i3 = 1;
        this.f310733j = new x4l.c(new wqj.g(this, continuation, 22), new Function1(this) { // from class: y3f.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f310713b;

            {
                this.f310713b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Object next;
                switch (i3) {
                    case 0:
                        z2f.g params = (z2f.g) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        boolean z = params instanceof z2f.f;
                        v vVar = this.f310713b;
                        if (z) {
                            g3f.b bVar = vVar.f310730c;
                            z2f.f params2 = (z2f.f) params;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(params2, "params");
                            return (r0) bVar.f140292a.get(params2);
                        }
                        if (!(params instanceof z2f.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g3f.a aVar = vVar.d;
                        z2f.d params3 = (z2f.d) params;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(params3, "params");
                        return (r0) aVar.f140291a.get(params3);
                    default:
                        z2f.c params4 = (z2f.c) obj2;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        v vVar2 = this.f310713b;
                        i0 i0Var = (i0) hx7.q.p(vVar2.f, params4);
                        if (i0Var != null) {
                            return i0Var;
                        }
                        Map mapSnapshot = vVar2.f310730c.f140292a.snapshot();
                        ArrayList arrayList = new ArrayList(mapSnapshot.size());
                        Iterator it8 = mapSnapshot.entrySet().iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((r0) ((Map.Entry) it8.next()).getValue()).f114450a);
                        }
                        ArrayList arrayListU = w.u(arrayList);
                        Map mapSnapshot2 = vVar2.d.f140291a.snapshot();
                        ArrayList arrayList2 = new ArrayList(mapSnapshot2.size());
                        Iterator it9 = mapSnapshot2.entrySet().iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(((r0) ((Map.Entry) it9.next()).getValue()).f114450a);
                        }
                        Iterator it10 = d0.E0(w.u(arrayList2), arrayListU).iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.f(((i0) next).f(), params4.f319063a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        return (i0) next;
                }
            }
        }, new Function2(this) { // from class: y3f.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f310715b;

            {
                this.f310715b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        z2f.g params = (z2f.g) obj2;
                        r0 page = (r0) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(page, "content");
                        boolean z = params instanceof z2f.f;
                        v vVar = this.f310715b;
                        if (z) {
                            g3f.b bVar = vVar.f310730c;
                            z2f.f params2 = (z2f.f) params;
                            bVar.getClass();
                            Intrinsics.checkNotNullParameter(params2, "params");
                            Intrinsics.checkNotNullParameter(page, "page");
                            bVar.f140292a.put(params2, page);
                        } else {
                            if (!(params instanceof z2f.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            g3f.a aVar = vVar.d;
                            z2f.d params3 = (z2f.d) params;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(params3, "params");
                            Intrinsics.checkNotNullParameter(page, "page");
                            aVar.f140291a.put(params3, page);
                        }
                        return Unit.f186387a;
                    default:
                        z2f.c params4 = (z2f.c) obj2;
                        i0 trade = (i0) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(trade, "trade");
                        hx7.q.U(this.f310715b.f, params4, trade);
                        return Unit.f186387a;
                }
            }
        }, new t(this, continuation, 0), new wqj.g(this, continuation, 23));
    }

    public final Flow a(Flow flow, y2f.b bVar) {
        int i = 3;
        Continuation continuation = null;
        if (!((jte.d) this.f310731g).c(FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c)) {
            return new y(new vy5.d0(flow, 27), new v77.c(i, 13, continuation));
        }
        y yVar = new y(new xni.h(this, continuation, 24), new y(new vy5.d0(flow, 27), new v77.c(i, 13, continuation)));
        int i2 = o.f310716a[bVar.ordinal()];
        if (i2 == 1) {
            return yVar;
        }
        if (i2 == 2) {
            return vkm.q.q(vkm.q.m(new xge.f(yVar, this, continuation, 25)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
