package b97;

import a0e.n;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements g {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f13693h = TimeUnit.DAYS.toMillis(30);
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.d f13694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f13695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef0.b f13696c;
    public final p56.a d;
    public final hlm.c e;
    public final Type f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f13697g;

    public l(ne0.d memoryCache, ue0.c storage, ef0.b currentTimeProvider, p56.a secretPhraseMatcher) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(secretPhraseMatcher, "secretPhraseMatcher");
        this.f13694a = memoryCache;
        this.f13695b = storage;
        this.f13696c = currentTimeProvider;
        this.d = secretPhraseMatcher;
        this.e = hlm.d.a();
        this.f = new TypeToken<List<? extends c97.j>>() { // from class: com.revolut.feature.globalsearch.impl.data.RecentQueriesRepositoryImpl$recordsType$1
        }.getType();
        Continuation continuation = null;
        this.f13697g = new x4l.c(new n(this, continuation, 2), new h(this, 1), new b7d.c(this, 5), new az.i(this, continuation, 17), new awd.b(this, continuation, 7));
    }

    public static final String a(l lVar, String str) {
        Locale locale = Locale.ROOT;
        return p.a.r(locale, "ROOT", str, locale, "toLowerCase(...)");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(j97.a r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b97.j
            if (r0 == 0) goto L13
            r0 = r7
            b97.j r0 = (b97.j) r0
            int r1 = r0.f13691w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13691w = r1
            goto L18
        L13:
            b97.j r0 = new b97.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13691w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28
            goto L61
        L28:
            r6 = move-exception
            goto L52
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            java.lang.String r7 = r6.f172309a
            boolean r7 = kotlin.text.d0.W(r7)
            if (r7 == 0) goto L40
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L40:
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Exception -> L28
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Exception -> L28
            aie.v r2 = new aie.v     // Catch: java.lang.Exception -> L28
            r2.<init>(r5, r6, r3, r4)     // Catch: java.lang.Exception -> L28
            r0.f13691w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Exception -> L28
            if (r6 != r1) goto L61
            return r1
        L52:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L64
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "RecentQueries"
            rd0.d.a(r0, r1, r3, r6, r7)
        L61:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b97.l.b(j97.a, gim.c):java.lang.Object");
    }

    public final ArrayList c(List list) {
        long jA = this.f13696c.a() - f13693h;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((j97.a) obj2).f172310b >= jA) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final ArrayList d() {
        Type recordsType = this.f;
        Intrinsics.checkNotNullExpressionValue(recordsType, "recordsType");
        Iterable iterable = (List) this.f13695b.T2("global_search_recent_queries_v1", recordsType);
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable<c97.j> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(w.t(iterable2, 10));
        for (c97.j jVar : iterable2) {
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            arrayList.add(new j97.a(jVar.getQuery(), jVar.getLastClickedAtEpochMillis()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r7, gim.c r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b97.k
            if (r0 == 0) goto L13
            r0 = r8
            b97.k r0 = (b97.k) r0
            int r1 = r0.f13692w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13692w = r1
            goto L18
        L13:
            b97.k r0 = new b97.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f13692w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            goto L57
        L28:
            r7 = move-exception
            goto L48
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            skm.p0 r8 = skm.p0.f264001a     // Catch: java.lang.Exception -> L28
            elm.f r8 = elm.f.f127540b     // Catch: java.lang.Exception -> L28
            aie.v r2 = new aie.v     // Catch: java.lang.Exception -> L28
            r5 = 2
            r2.<init>(r6, r7, r3, r5)     // Catch: java.lang.Exception -> L28
            r0.f13692w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = skm.e0.J(r8, r2, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L57
            return r1
        L48:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L5a
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "RecentQueries"
            rd0.d.a(r0, r1, r3, r7, r8)
        L57:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b97.l.e(java.lang.String, gim.c):java.lang.Object");
    }
}
