package d6l;

import bwb.n;
import com.google.gson.reflect.TypeToken;
import com.revolut.shared.feature.card.request.impl.data.service.CardRequestService;
import com.revolut.shared.feature.card.request.impl.data.service.LegacyCardRequestService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kgm.i;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.time.b;
import le.u1;
import n14.k;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements x5l.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Type f111635m = new TypeToken<List<? extends b6l.b>>() { // from class: com.revolut.shared.feature.card.request.impl.data.repository.CardRequestRepositoryImpl$Companion$CARD_REQUEST_TYPE$1
    }.getType();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h98.c f111636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LegacyCardRequestService f111637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardRequestService f111638c;
    public final j d;
    public final ue0.c e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f111639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f111640h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f111641j;
    public final w4l.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x4l.c f111642l;

    public h(h98.c x3MigrationEnabledProvider, LegacyCardRequestService legacyService, CardRequestService service, j memoryCache, ue0.c storage, ze0.a forceReloadStrategyFactory, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(x3MigrationEnabledProvider, "x3MigrationEnabledProvider");
        Intrinsics.checkNotNullParameter(legacyService, "legacyService");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f111636a = x3MigrationEnabledProvider;
        this.f111637b = legacyService;
        this.f111638c = service;
        this.d = memoryCache;
        this.e = storage;
        this.f = yhm.j.b(new co7.a(this, 27));
        this.f111639g = ConcurrentHashMap.newKeySet();
        b.Companion companion = kotlin.time.b.INSTANCE;
        final int i = 1;
        this.f111640h = ((ze0.c) forceReloadStrategyFactory).b(kotlin.time.b.f(kotlin.time.c.g(1, pkm.e.MINUTES)));
        final int i2 = 2;
        new ao.h(20, new a(this, i2));
        new ao.h(20, new a(this, 3));
        new ao.h(20, new a(this, 4));
        this.i = new i(new a(this, 5));
        this.f111641j = new i(new a(this, 6));
        final int i3 = 0;
        this.k = new w4l.f(new a8a.a(networkStateRepository, this, 17), new a(this, 7), new Function2(this) { // from class: d6l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f111627b;

            {
                this.f111627b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ((Boolean) obj2).getClass();
                        List cardRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardRequests, "cardRequests");
                        this.f111627b.e.G(g4i.a.I(cardRequests), "CACHE_KEY_REQUESTS", kii.e.o(b6l.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 1:
                        d params = (d) obj2;
                        List cardRequests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cardRequests2, "cardRequests");
                        this.f111627b.d.f(h.c(params), cardRequests2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List cardRequests3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardRequests3, "cardRequests");
                        this.f111627b.d.f("CACHE_KEY_REQUESTS", cardRequests3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a(this, 9), new Function2(this) { // from class: d6l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f111627b;

            {
                this.f111627b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        ((Boolean) obj2).getClass();
                        List cardRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardRequests, "cardRequests");
                        this.f111627b.e.G(g4i.a.I(cardRequests), "CACHE_KEY_REQUESTS", kii.e.o(b6l.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 1:
                        d params = (d) obj2;
                        List cardRequests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cardRequests2, "cardRequests");
                        this.f111627b.d.f(h.c(params), cardRequests2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List cardRequests3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardRequests3, "cardRequests");
                        this.f111627b.d.f("CACHE_KEY_REQUESTS", cardRequests3);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
        Continuation continuation = null;
        this.f111642l = new x4l.c(new cuh.a(this, continuation, i2), new a(this, i), new Function2(this) { // from class: d6l.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f111627b;

            {
                this.f111627b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ((Boolean) obj2).getClass();
                        List cardRequests = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardRequests, "cardRequests");
                        this.f111627b.e.G(g4i.a.I(cardRequests), "CACHE_KEY_REQUESTS", kii.e.o(b6l.b.class, KTypeProjection.INSTANCE, List.class));
                        break;
                    case 1:
                        d params = (d) obj2;
                        List cardRequests2 = (List) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(cardRequests2, "cardRequests");
                        this.f111627b.d.f(h.c(params), cardRequests2);
                        break;
                    default:
                        ((Boolean) obj2).booleanValue();
                        List cardRequests3 = (List) obj3;
                        Intrinsics.checkNotNullParameter(cardRequests3, "cardRequests");
                        this.f111627b.d.f("CACHE_KEY_REQUESTS", cardRequests3);
                        break;
                }
                return Unit.f186387a;
            }
        }, new cvi.j(this, continuation, 21), new n(this, continuation, 19));
    }

    public static final void a(h hVar, List list) {
        hVar.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((w5l.a) it8.next()).f295350a);
        }
        hVar.f111639g.removeAll(d0.i1(arrayList));
    }

    public static String c(d dVar) {
        return j6.a.q("CACHE_KEY_REQUESTS", d0.k0(g(dVar.f111630a), "&", "?", null, 0, new d6j.b(4), 28));
    }

    public static List g(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(u1.g((w5l.c) it8.next(), k.k()));
        }
        return d0.O0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof d6l.f
            if (r0 == 0) goto L13
            r0 = r7
            d6l.f r0 = (d6l.f) r0
            int r1 = r0.f111632x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111632x = r1
            goto L18
        L13:
            d6l.f r0 = new d6l.f
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111632x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            d6l.c r7 = new d6l.c
            r7.<init>(r5, r6)
            kgm.i r6 = r4.i
            efm.b r6 = r6.j(r7)
            r0.u = r5
            r0.f111632x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r4.f(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d6l.h.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d6l.g
            if (r0 == 0) goto L13
            r0 = r6
            d6l.g r0 = (d6l.g) r0
            int r1 = r0.f111634x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111634x = r1
            goto L18
        L13:
            d6l.g r0 = new d6l.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111634x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            kgm.i r6 = r4.f111641j
            efm.b r6 = r6.j(r5)
            r0.u = r5
            r0.f111634x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r4.f(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d6l.h.d(java.lang.String, gim.c):java.lang.Object");
    }

    public final ArrayList e(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!this.f111639g.contains(((w5l.a) obj2).f295350a)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final void f(String str) {
        this.f111639g.add(str);
        this.k.c(null, (1 & 2) == 0, new d6j.b(2));
        x4l.c.a(this.f111642l, new d6j.b(3));
    }
}
