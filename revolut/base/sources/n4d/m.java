package n4d;

import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import d9.t0;
import java.time.Clock;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements a4d.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ogd.k f212374j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f212375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f212376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mk0.a f212377c;
    public final WatchlistService d;
    public final s e;
    public final ue0.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qe0.s f212378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f212379h;
    public final x4l.c i;

    static {
        Intrinsics.checkNotNullParameter("MULTIPLE_WATCHLISTS_SORTING_ALG", "id");
        f212374j = new ogd.k(ogd.m.MANUAL, null);
    }

    public m(l80.e dateProvider, ne0.j memoryCache, mk0.a personalisationStorage, WatchlistService watchlistService, s watchlistDao, ue0.c storage, ze0.a forceReloadStrategyFactory) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        Intrinsics.checkNotNullParameter(watchlistService, "watchlistService");
        Intrinsics.checkNotNullParameter(watchlistDao, "watchlistDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(forceReloadStrategyFactory, "forceReloadStrategyFactory");
        this.f212375a = dateProvider;
        this.f212376b = memoryCache;
        this.f212377c = personalisationStorage;
        this.d = watchlistService;
        this.e = watchlistDao;
        this.f = storage;
        this.f212378g = ((ze0.c) forceReloadStrategyFactory).a(storage, 60000L);
        Continuation continuation = null;
        final int i = 0;
        final int i2 = 0;
        this.f212379h = new x4l.c(new k25.o(this, (Continuation) null), new Function1(this) { // from class: n4d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f212343b;

            {
                this.f212343b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (z3d.a) this.f212343b.f212376b.get(params.f212351b.toString());
                    default:
                        Pair params2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (ogd.a) this.f212343b.f212376b.get(params2.toString());
                }
            }
        }, new Function2(this) { // from class: n4d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f212347b;

            {
                this.f212347b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        c params = (c) obj2;
                        z3d.a allWatchlists = (z3d.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(allWatchlists, "allWatchlists");
                        this.f212347b.f212376b.f(params.f212351b.toString(), allWatchlists);
                        break;
                    default:
                        Pair params2 = (Pair) obj2;
                        ogd.a sortedAssets = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(sortedAssets, "sortedAssets");
                        this.f212347b.f212376b.f(params2.toString(), sortedAssets);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 1), new k3c.l(3, 23, continuation));
        final int i3 = 1;
        this.i = new x4l.c(new mk0.f(this, continuation, 16), new Function1(this) { // from class: n4d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f212343b;

            {
                this.f212343b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        c params = (c) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (z3d.a) this.f212343b.f212376b.get(params.f212351b.toString());
                    default:
                        Pair params2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (ogd.a) this.f212343b.f212376b.get(params2.toString());
                }
            }
        }, new Function2(this) { // from class: n4d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f212347b;

            {
                this.f212347b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        c params = (c) obj2;
                        z3d.a allWatchlists = (z3d.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(allWatchlists, "allWatchlists");
                        this.f212347b.f212376b.f(params.f212351b.toString(), allWatchlists);
                        break;
                    default:
                        Pair params2 = (Pair) obj2;
                        ogd.a sortedAssets = (ogd.a) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(sortedAssets, "sortedAssets");
                        this.f212347b.f212376b.f(params2.toString(), sortedAssets);
                        break;
                }
                return Unit.f186387a;
            }
        }, new g(this, continuation, 3), new lp6.g(this, continuation, 16));
    }

    public static final void a(m mVar, z3d.a aVar) {
        s sVar = mVar.e;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ArrayList arrayList = aVar.f319245a;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                zhm.v.s();
                throw null;
            }
            z3d.d dVar = (z3d.d) obj2;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            o4d.e eVar = new o4d.e(i2, dVar.f319250a, dVar.d, dVar.f319251b);
            ArrayList<z3d.e> arrayList3 = dVar.f319252c;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i));
            for (z3d.e eVar2 : arrayList3) {
                String watchlistId = dVar.f319250a;
                z3d.f syncState = eVar2.e;
                Intrinsics.checkNotNullParameter(eVar2, "<this>");
                Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
                Intrinsics.checkNotNullParameter(syncState, "syncState");
                String str = eVar2.d.f86866a;
                String str2 = eVar2.f319253a;
                String str3 = eVar2.f319254b;
                ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(eVar2.f319255c.getMillis()).atZone(Clock.systemDefaultZone().getZone());
                Intrinsics.checkNotNullExpressionValue(zonedDateTimeAtZone, "atZone(...)");
                arrayList4.add(new o4d.d(watchlistId, str, str2, str3, zonedDateTimeAtZone, u1.g(syncState, t0.g())));
            }
            arrayList2.add(new o4d.f(eVar, arrayList4));
            i2 = i3;
            i = 10;
        }
        sVar.n(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ogd.k g(java.lang.String r4, java.lang.String r5, java.util.Map r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n4d.m.g(java.lang.String, java.lang.String, java.util.Map):ogd.k");
    }

    public final z3d.a b(List list) {
        List list2 = list;
        int i = 10;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FavouritesAssetTypeKey) it8.next()).f86866a);
        }
        List listH = this.e.h(arrayList);
        Intrinsics.checkNotNullParameter(listH, "<this>");
        List<o4d.f> list3 = listH;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
        for (o4d.f fVar : list3) {
            o4d.e eVar = fVar.f222204a;
            List list4 = fVar.f222205b;
            String str = eVar.f222201a;
            String str2 = eVar.f222202b;
            boolean z = eVar.f222203c;
            List<o4d.d> list5 = list4;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list5, i));
            for (o4d.d dVar : list5) {
                arrayList3.add(new z3d.e(dVar.f222200c, dVar.d, new DateTime(dVar.e.toInstant().toEpochMilli(), DateTimeZone.UTC), new FavouritesAssetTypeKey(dVar.f222199b), z3d.f.valueOf(dVar.f)));
            }
            arrayList2.add(new z3d.d(str, str2, arrayList3, z));
            i = 10;
        }
        z3d.a aVar = new z3d.a(arrayList2);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return aVar;
    }

    public final vkm.d c(List assetTypeKeys, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ogd.d dVar = ogd.d.ALPHABETICAL;
        w4l.k kVarC = this.f212378g.c(assetTypeKeys.toString(), loadingStrategy);
        return this.f212379h.b(new c(assetTypeKeys, dVar), kVarC);
    }

    public final akg.n d(String orderingKey, String watchlistId) {
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        return nim.a.v(new n1g.p(this.f212377c.f(new tk0.f("MULTIPLE_WATCHLISTS_SORTING_ALG")), this, 4), new avj.o(this, watchlistId, orderingKey));
    }

    public final Object e(List list, gim.c cVar) throws Throwable {
        n3j.w wVar = new n3j.w(this, list, (Continuation) null, 4);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, wVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof n4d.l
            if (r0 == 0) goto L13
            r0 = r10
            n4d.l r0 = (n4d.l) r0
            int r1 = r0.f212372x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f212372x = r1
            goto L18
        L13:
            n4d.l r0 = new n4d.l
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f212372x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$BooleanRef r0 = r0.u
            yhm.o.b(r10)
            goto L5c
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L31:
            yhm.o.b(r10)
            kotlin.jvm.internal.Ref$BooleanRef r10 = new kotlin.jvm.internal.Ref$BooleanRef
            r10.<init>()
            r2 = 500(0x1f4, float:7.0E-43)
            pkm.e r4 = pkm.e.MILLISECONDS
            long r4 = kotlin.time.c.g(r2, r4)
            k3c.k r2 = new k3c.k
            r6 = 15
            r7 = 0
            r2.<init>(r10, r7, r6)
            mh1.d r6 = new mh1.d
            r8 = 11
            r6.<init>(r9, r10, r7, r8)
            r0.u = r10
            r0.f212372x = r3
            java.lang.Object r0 = a.a.y(r4, r2, r6, r0)
            if (r0 != r1) goto L5b
            return r1
        L5b:
            r0 = r10
        L5c:
            boolean r10 = r0.f186407a
            if (r10 != 0) goto L63
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            return r10
        L63:
            n4d.s r10 = r9.e
            java.util.List r10 = r10.e()
            boolean r10 = r10.isEmpty()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n4d.m.f(gim.c):java.lang.Object");
    }
}
