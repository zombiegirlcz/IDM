package e98;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.junior.card_request.impl.data.service.JuniorCardRequestService;
import dp4.z0;
import dze.n;
import e54.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kgm.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import qe0.s;
import zhm.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements a {

    @NotNull
    public static final c Companion = new c();
    public static final Type i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorCardRequestService f123930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f123931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f123932c;
    public final ConcurrentHashMap.KeySetView d;
    public final s e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f123933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f123934h;

    static {
        Type type = new TypeToken<Map<String, ? extends List<? extends c98.b>>>() { // from class: com.revolut.feature.junior.card_request.impl.data.repository.JuniorCardRequestRepositoryImpl$Companion$TYPE_CARD_REQUESTS_ENTITY$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        i = type;
    }

    public f(JuniorCardRequestService service, j memoryCache, ue0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f123930a = service;
        this.f123931b = memoryCache;
        this.f123932c = storage;
        this.d = ConcurrentHashMap.newKeySet();
        b.Companion companion = kotlin.time.b.INSTANCE;
        final int i2 = 1;
        this.e = ((ze0.c) forceReloadStrategyFactory).b(kotlin.time.b.f(kotlin.time.c.g(1, pkm.e.MINUTES)));
        Continuation continuation = null;
        final int i3 = 0;
        this.f = new x4l.c(new e6d.f(this, continuation, 3), new Function1(this) { // from class: e98.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f123925b;

            {
                this.f123925b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f123925b;
                        Map map = (Map) fVar.f123931b.get("CARD_REQUESTS_KEY");
                        if (map == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (!fVar.d.contains(((jc8.a) obj3).f172748a)) {
                                    arrayList.add(obj3);
                                }
                            }
                            linkedHashMap.put(key, arrayList);
                        }
                        return linkedHashMap;
                    case 1:
                        d98.a aVar = (d98.a) obj2;
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        return this.f123925b.f123930a.approveRequest(aVar.f112353a, new a98.a(aVar.f112354b));
                    default:
                        String requestId = (String) obj2;
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        return this.f123925b.f123930a.declineRequest(requestId);
                }
            }
        }, new r(this, 17), new n(this, continuation, 23), new z0(this, continuation, 6));
        this.f123933g = new i(new Function1(this) { // from class: e98.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f123925b;

            {
                this.f123925b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f123925b;
                        Map map = (Map) fVar.f123931b.get("CARD_REQUESTS_KEY");
                        if (map == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (!fVar.d.contains(((jc8.a) obj3).f172748a)) {
                                    arrayList.add(obj3);
                                }
                            }
                            linkedHashMap.put(key, arrayList);
                        }
                        return linkedHashMap;
                    case 1:
                        d98.a aVar = (d98.a) obj2;
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        return this.f123925b.f123930a.approveRequest(aVar.f112353a, new a98.a(aVar.f112354b));
                    default:
                        String requestId = (String) obj2;
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        return this.f123925b.f123930a.declineRequest(requestId);
                }
            }
        });
        final int i5 = 2;
        this.f123934h = new i(new Function1(this) { // from class: e98.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f123925b;

            {
                this.f123925b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        f fVar = this.f123925b;
                        Map map = (Map) fVar.f123931b.get("CARD_REQUESTS_KEY");
                        if (map == null) {
                            return null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                        for (Map.Entry entry : map.entrySet()) {
                            Object key = entry.getKey();
                            List list = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (!fVar.d.contains(((jc8.a) obj3).f172748a)) {
                                    arrayList.add(obj3);
                                }
                            }
                            linkedHashMap.put(key, arrayList);
                        }
                        return linkedHashMap;
                    case 1:
                        d98.a aVar = (d98.a) obj2;
                        Intrinsics.checkNotNullParameter(aVar, "<destruct>");
                        return this.f123925b.f123930a.approveRequest(aVar.f112353a, new a98.a(aVar.f112354b));
                    default:
                        String requestId = (String) obj2;
                        Intrinsics.checkNotNullParameter(requestId, "requestId");
                        return this.f123925b.f123930a.declineRequest(requestId);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof e98.d
            if (r0 == 0) goto L13
            r0 = r7
            e98.d r0 = (e98.d) r0
            int r1 = r0.f123927x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123927x = r1
            goto L18
        L13:
            e98.d r0 = new e98.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f123927x
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
            d98.a r7 = new d98.a
            r7.<init>(r5, r6)
            kgm.i r6 = r4.f123933g
            efm.b r6 = r6.j(r7)
            r0.u = r5
            r0.f123927x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.util.concurrent.ConcurrentHashMap$KeySetView r6 = r4.d
            r6.add(r5)
            e8e.y r5 = new e8e.y
            r6 = 10
            r5.<init>(r6)
            x4l.c r6 = r4.f
            x4l.c.a(r6, r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e98.f.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof e98.e
            if (r0 == 0) goto L13
            r0 = r6
            e98.e r0 = (e98.e) r0
            int r1 = r0.f123929x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123929x = r1
            goto L18
        L13:
            e98.e r0 = new e98.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f123929x
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
            kgm.i r6 = r4.f123934h
            efm.b r6 = r6.j(r5)
            r0.u = r5
            r0.f123929x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.util.concurrent.ConcurrentHashMap$KeySetView r6 = r4.d
            r6.add(r5)
            e8e.y r5 = new e8e.y
            r6 = 10
            r5.<init>(r6)
            x4l.c r6 = r4.f
            x4l.c.a(r6, r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e98.f.b(java.lang.String, gim.c):java.lang.Object");
    }
}
