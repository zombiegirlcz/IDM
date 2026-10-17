package w4l;

import com.revolut.data.model.Data;
import efm.r;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import ofm.p;
import qza.q;
import v3e.s;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f294634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f294635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f294636c;
    public final Function2 d;
    public final Function1 e;
    public final Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lfm.c f294637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f294638h;
    public final u0a.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u0a.a f294639j;
    public final ConcurrentHashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ConcurrentHashMap f294640l;

    public f(Function2 fromNetwork, Function1 fromMemory, Function2 toMemory, Function1 fromStorage, Function2 toStorage, Function1 onRemove, Function1 fromStorageSingle, lfm.c networkSubscriptionsContainer, int i) {
        fromMemory = (i & 2) != 0 ? d.f294632a : fromMemory;
        toMemory = (i & 4) != 0 ? new pq0.d(11) : toMemory;
        fromStorage = (i & 8) != 0 ? e.f294633a : fromStorage;
        toStorage = (i & 16) != 0 ? new pq0.d(12) : toStorage;
        onRemove = (i & 32) != 0 ? new q(28) : onRemove;
        fromStorageSingle = (i & 64) != 0 ? new tm.a(6, fromStorage) : fromStorageSingle;
        networkSubscriptionsContainer = (i & 128) != 0 ? g.f294641a : networkSubscriptionsContainer;
        Intrinsics.checkNotNullParameter(fromNetwork, "fromNetwork");
        Intrinsics.checkNotNullParameter(fromMemory, "fromMemory");
        Intrinsics.checkNotNullParameter(toMemory, "toMemory");
        Intrinsics.checkNotNullParameter(fromStorage, "fromStorage");
        Intrinsics.checkNotNullParameter(toStorage, "toStorage");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        Intrinsics.checkNotNullParameter(fromStorageSingle, "fromStorageSingle");
        Intrinsics.checkNotNullParameter(networkSubscriptionsContainer, "networkSubscriptionsContainer");
        this.f294634a = fromMemory;
        this.f294635b = toMemory;
        this.f294636c = fromStorage;
        this.d = toStorage;
        this.e = onRemove;
        this.f = fromStorageSingle;
        this.f294637g = networkSubscriptionsContainer;
        this.f294638h = new ConcurrentHashMap();
        this.i = new u0a.a(new bsi.b(fromNetwork, this, 13));
        this.f294639j = new u0a.a(new f2(this, 19));
        this.k = new ConcurrentHashMap();
        this.f294640l = new ConcurrentHashMap();
    }

    public final void a(Object obj2, Object obj3, Function0 function0, Function1 function1) {
        p pVar = new p(new s(new f2(function0, 20), 16), new s(new sri.p(this, obj3, obj2, function1), 17), new lm.b(1), new pd.h(new q(26)));
        this.i.d(obj3).x().timeout(60L, TimeUnit.SECONDS, hhm.f.f152431c).doFinally(new tm.b(this, pVar, 2)).subscribeWith(pVar);
        this.f294637g.a(pVar);
    }

    public final void c(Throwable th10, boolean z, Function1 where) {
        Intrinsics.checkNotNullParameter(where, "where");
        for (Map.Entry entry : this.f294638h.entrySet()) {
            Object key = entry.getKey();
            ihm.k kVar = (ihm.k) entry.getValue();
            if (((Boolean) where.invoke(key)).booleanValue()) {
                kVar.onNext(new Data(this.f294634a.invoke(key), th10, z));
            }
        }
    }

    public final r e(Object params, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarDefer = r.defer(new kn.b(this, 2, params, loadingStrategy));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        return rVarDefer;
    }

    public final r f(Object params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        return e(params, z ? i.f294643c : h.f294642c);
    }

    public final efm.b g(Object params, boolean z) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (z) {
            pfm.h hVar = new pfm.h(new ae.a(this, params, 16), 0);
            Intrinsics.checkNotNullExpressionValue(hVar, "create(...)");
            return hVar;
        }
        pfm.h hVar2 = new pfm.h(new tm.b(this, params, 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
        return hVar2;
    }

    public final void h(Object params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.e.invoke(params);
        i(params).onNext(new Data(null, null, false, 6, null));
    }

    public final ihm.k i(Object obj2) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f294638h;
        Object objH = concurrentHashMap.get(obj2);
        if (objH == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(obj2, (objH = p.a.h("toSerialized(...)")))) != null) {
            objH = objPutIfAbsent;
        }
        return (ihm.k) objH;
    }

    public final void j(Object params, Object domain) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f294635b.invoke(params, domain);
        this.d.invoke(params, domain);
        i(params).onNext(new Data(domain, null, false, 6, null));
    }

    public final void k(Object params, Object domain) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f294635b.invoke(params, domain);
        i(params).onNext(new Data(domain, null, false, 6, null));
    }

    public final void l(Object params, Object domain) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.d.invoke(params, domain);
        i(params).onNext(new Data(domain, null, false, 6, null));
    }
}
