package yj0;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.time.Clock;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import mm0.n;
import mm0.o;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import ulm.j1;
import ulm.s0;
import ulm.y0;
import wim.z;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Interceptor {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f314358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f314359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm0.c f314360c;
    public final xe0.e d;
    public final lwl.f e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f314361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f314362h;

    public g(j cacheProvider, Clock clock, zm0.c sessionProvider, xe0.e storage, lwl.f tracker) {
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f314358a = cacheProvider;
        this.f314359b = clock;
        this.f314360c = sessionProvider;
        this.d = storage;
        this.e = tracker;
        this.f = yhm.j.b(new y99.c(this, 13));
        this.f314361g = new AtomicBoolean(false);
        this.f314362h = new AtomicInteger(0);
    }

    public final synchronized void a(boolean z) {
        try {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "AppUnlockedCacheInterceptor", "Clearing the cache.", null, null, 16);
            if (this.f314361g.get()) {
                return;
            }
            xe0.e eVar = this.d;
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KType kTypeB = o0.b(String.class);
            companion.getClass();
            Iterable iterable = (Set) eVar.T2("UNLOCK_CACHE_STORAGE_KEY", z.d(o0.c(Set.class, KTypeProjection.Companion.a(kTypeB))));
            if (iterable == null) {
                iterable = h0.f322473a;
            }
            Set setH1 = d0.h1(iterable);
            if (setH1.isEmpty()) {
                return;
            }
            this.f314361g.set(true);
            try {
                Cache cache = (Cache) this.f.getValue();
                if (cache != null) {
                    Iterator<String> itUrls = cache.urls();
                    while (itUrls.hasNext()) {
                        String next = itUrls.next();
                        if (setH1.contains(next)) {
                            itUrls.remove();
                            setH1.remove(next);
                        }
                    }
                }
                this.d.I0("UNLOCK_CACHE_STORAGE_KEY");
            } catch (Exception e) {
                if (z) {
                    try {
                        Cache cache2 = (Cache) this.f.getValue();
                        if (cache2 != null) {
                            cache2.evictAll();
                        }
                        this.d.I0("UNLOCK_CACHE_STORAGE_KEY");
                    } catch (Exception e2) {
                        e2.initCause(e);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AppUnlockedCacheInterceptor", "evictAll. remaining: " + d0.k0(setH1, null, null, null, 0, e.f314356a, 31), e2, h0Var);
                        Unit unit = Unit.f186387a;
                    }
                } else {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AppUnlockedCacheInterceptor", "removeUrls. remaining: " + d0.k0(setH1, null, null, null, 0, f.f314357a, 31), e, h0Var2);
                }
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        o oVarD = ((cn0.g) this.f314360c).d();
        int iMillis = (int) ((this.f314359b.millis() - oVarD.f207117a) / ((long) 1000));
        boolean z = iMillis < 10;
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        boolean z3 = oVarD instanceof n;
        int i = 4;
        Object obj2 = null;
        if (!z3 || !z) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "AppUnlockedCacheInterceptor", "Authorised Session: " + z3 + ", started " + iMillis + " seconds ago, request: " + j1Var.f281095a, null, null, 16);
            int andSet = this.f314362h.getAndSet(0);
            if (andSet != 0) {
                com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) ((com.revolut.analytics.tracking.v3.d) this.e.get());
                fVar.getClass();
                com.revolut.analytics.tracking.v3.f.g(fVar, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new et0.k(andSet, obj2, i), 14);
            }
            a(false);
            return hVar.b(j1Var);
        }
        Response responseB = hVar.b(j1Var);
        if (!this.f314361g.get()) {
            this.f314362h.incrementAndGet();
        }
        String strF = responseB.f("Cache-Control", null);
        if (!Intrinsics.f(j1Var.f281096b, "GET")) {
            if (com.bumptech.glide.d.m(j1Var, zj0.b.class)) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "AppUnlockedCacheInterceptor", "UnlockCacheFriendly request: " + j1Var.f281095a, null, null, 16);
                return responseB;
            }
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "AppUnlockedCacheInterceptor", "Non-idempotent request invalidates the cache: " + j1Var.f281095a, null, null, 16);
            com.revolut.analytics.tracking.v3.d dVar = (com.revolut.analytics.tracking.v3.d) this.e.get();
            int andSet2 = this.f314362h.getAndSet(0);
            Regex regex = d0m.b.f110450a;
            String strA = d0m.b.a(j1Var.f281095a.i);
            com.revolut.analytics.tracking.v3.f fVar2 = (com.revolut.analytics.tracking.v3.f) dVar;
            fVar2.getClass();
            com.revolut.analytics.tracking.v3.f.g(fVar2, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new et0.k(andSet2, strA, i), 14);
            a(true);
            return responseB;
        }
        if (com.bumptech.glide.d.m(j1Var, zj0.a.class) || (strF != null && kotlin.text.d0.J(strF, "max-age", false))) {
            return responseB;
        }
        if (this.f314361g.get()) {
            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "AppUnlockedCacheInterceptor", "Return the response because caching forbidden, request: " + j1Var.f281095a, null, null, 16);
            return responseB;
        }
        int i2 = 10 - iMillis;
        CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "AppUnlockedCacheInterceptor", "Caching request: " + j1Var.f281095a + " for " + i2 + " seconds.", null, null, 16);
        synchronized (this) {
            try {
                xe0.e eVar = this.d;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = o0.b(String.class);
                companion.getClass();
                Iterable iterable = (Set) eVar.T2("UNLOCK_CACHE_STORAGE_KEY", z.d(o0.c(Set.class, KTypeProjection.Companion.a(kTypeB))));
                if (iterable == null) {
                    iterable = h0.f322473a;
                }
                Set setH1 = d0.h1(iterable);
                setH1.add(j1Var.f281095a.i);
                this.d.G(setH1, "UNLOCK_CACHE_STORAGE_KEY", z.d(o0.f186429a.d(o0.c(Set.class, KTypeProjection.Companion.a(o0.b(String.class))))));
            } catch (Throwable th10) {
                throw th10;
            }
        }
        Response.a aVarG = responseB.g();
        String value = "max-age=" + i2;
        Intrinsics.checkNotNullParameter("Cache-Control", "name");
        Intrinsics.checkNotNullParameter(value, "value");
        s0 s0Var = aVarG.f;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter("Cache-Control", "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ue8.c.o(s0Var, "Cache-Control", value);
        return aVarG.a();
    }
}
