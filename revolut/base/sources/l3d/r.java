package l3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4d.a f191928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jul.o f191929b;

    public r(a4d.a multipleWatchlistsRepository, jul.o watchlistsFetcher) {
        Intrinsics.checkNotNullParameter(multipleWatchlistsRepository, "multipleWatchlistsRepository");
        Intrinsics.checkNotNullParameter(watchlistsFetcher, "watchlistsFetcher");
        this.f191928a = multipleWatchlistsRepository;
        this.f191929b = watchlistsFetcher;
    }

    public final Object a(String str, Map map, gim.i iVar) throws Throwable {
        mll.c0 c0Var = new mll.c0((n4d.m) this.f191928a, str, map, null, 20);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, c0Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        if (((n4d.m) r4).e(r14, r1) == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r14, java.util.Set r15, java.util.UUID r16, gim.c r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof l3d.n
            if (r1 == 0) goto L15
            r1 = r0
            l3d.n r1 = (l3d.n) r1
            int r2 = r1.f191921x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f191921x = r2
            goto L1a
        L15:
            l3d.n r1 = new l3d.n
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f191921x
            a4d.a r4 = r13.f191928a
            r5 = 2
            r6 = 1
            r11 = 0
            if (r3 == 0) goto L44
            if (r3 == r6) goto L3b
            if (r3 != r5) goto L33
            java.util.Set r14 = r1.u
            java.util.Set r14 = (java.util.Set) r14
            yhm.o.b(r0)
            goto L7e
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            java.util.Set r14 = r1.u
            r15 = r14
            java.util.Set r15 = (java.util.Set) r15
            yhm.o.b(r0)
            goto L6b
        L44:
            yhm.o.b(r0)
            r0 = r15
            java.util.Set r0 = (java.util.Set) r0
            r1.u = r0
            r1.f191921x = r6
            r8 = r4
            n4d.m r8 = (n4d.m) r8
            mll.c0 r7 = new mll.c0
            r12 = 21
            r10 = r14
            r9 = r16
            r7.<init>(r8, r9, r10, r11, r12)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r14, r7, r1)
            if (r14 != r2) goto L66
            goto L68
        L66:
            kotlin.Unit r14 = kotlin.Unit.f186387a
        L68:
            if (r14 != r2) goto L6b
            goto L7d
        L6b:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.List r14 = zhm.d0.d1(r15)
            r1.u = r11
            r1.f191921x = r5
            n4d.m r4 = (n4d.m) r4
            java.lang.Object r14 = r4.e(r14, r1)
            if (r14 != r2) goto L7e
        L7d:
            return r2
        L7e:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l3d.r.b(java.lang.String, java.util.Set, java.util.UUID, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (((n4d.m) r3).e(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r8, java.lang.String r9, java.util.Set r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof l3d.o
            if (r0 == 0) goto L13
            r0 = r8
            l3d.o r0 = (l3d.o) r0
            int r1 = r0.f191923x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191923x = r1
            goto L18
        L13:
            l3d.o r0 = new l3d.o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191923x
            a4d.a r3 = r7.f191928a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.util.Set r9 = r0.u
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r8)
            goto L77
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.util.Set r9 = r0.u
            r10 = r9
            java.util.Set r10 = (java.util.Set) r10
            yhm.o.b(r8)
            goto L64
        L42:
            yhm.o.b(r8)
            r8 = r10
            java.util.Set r8 = (java.util.Set) r8
            r0.u = r8
            r0.f191923x = r5
            r8 = r3
            n4d.m r8 = (n4d.m) r8
            n4d.i r2 = new n4d.i
            r2.<init>(r8, r9, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L61:
            if (r8 != r1) goto L64
            goto L76
        L64:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r8 = zhm.d0.d1(r10)
            r0.u = r6
            r0.f191923x = r4
            n4d.m r3 = (n4d.m) r3
            java.lang.Object r8 = r3.e(r8, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l3d.r.c(gim.c, java.lang.String, java.util.Set):java.lang.Object");
    }

    public final Flow d(Set assetTypeKeys, String orderingKey, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(orderingKey, "orderingKey");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jul.o oVar = this.f191929b;
        return boh.f.e(boh.f.e(((n4d.m) ((a4d.a) oVar.f178695b)).c(zhm.d0.d1(assetTypeKeys), loadingStrategy), new m(oVar, orderingKey, 1)), new m(oVar, orderingKey, 2));
    }

    public final akg.n e(FavouritesAssetTypeKey typeKey, Pair asset) {
        Intrinsics.checkNotNullParameter(typeKey, "typeKey");
        Intrinsics.checkNotNullParameter(asset, "asset");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(f(y0.b(typeKey)), new kzc.a(asset, typeKey, 9));
    }

    public final Flow f(Set assetTypeKeys) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jul.o oVar = this.f191929b;
        return boh.f.e(((n4d.m) ((a4d.a) oVar.f178695b)).c(zhm.d0.d1(assetTypeKeys), loadingStrategy), new l0c.s(oVar, 8));
    }

    public final Object g(String str, FavouritesAssetTypeKey favouritesAssetTypeKey, Pair pair, gim.i iVar) throws Throwable {
        mtj.i iVar2 = new mtj.i(str, favouritesAssetTypeKey, pair, (n4d.m) this.f191928a, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, iVar2, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (((n4d.m) r3).e(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r8, java.lang.String r9, java.util.Set r10, gim.c r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof l3d.p
            if (r0 == 0) goto L13
            r0 = r11
            l3d.p r0 = (l3d.p) r0
            int r1 = r0.f191925x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191925x = r1
            goto L18
        L13:
            l3d.p r0 = new l3d.p
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191925x
            a4d.a r3 = r7.f191928a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.util.Set r8 = r0.u
            java.util.Set r8 = (java.util.Set) r8
            yhm.o.b(r11)
            goto L77
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.util.Set r8 = r0.u
            r10 = r8
            java.util.Set r10 = (java.util.Set) r10
            yhm.o.b(r11)
            goto L64
        L42:
            yhm.o.b(r11)
            r11 = r10
            java.util.Set r11 = (java.util.Set) r11
            r0.u = r11
            r0.f191925x = r5
            r11 = r3
            n4d.m r11 = (n4d.m) r11
            n4d.j r2 = new n4d.j
            r2.<init>(r11, r8, r9, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L61:
            if (r8 != r1) goto L64
            goto L76
        L64:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r8 = zhm.d0.d1(r10)
            r0.u = r6
            r0.f191925x = r4
            n4d.m r3 = (n4d.m) r3
            java.lang.Object r8 = r3.e(r8, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l3d.r.h(java.lang.String, java.lang.String, java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (((n4d.m) r3).e(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r8, java.util.Set r9, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof l3d.q
            if (r0 == 0) goto L13
            r0 = r10
            l3d.q r0 = (l3d.q) r0
            int r1 = r0.f191927x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191927x = r1
            goto L18
        L13:
            l3d.q r0 = new l3d.q
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191927x
            a4d.a r3 = r7.f191928a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.util.Set r8 = r0.u
            java.util.Set r8 = (java.util.Set) r8
            yhm.o.b(r10)
            goto L77
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.util.Set r8 = r0.u
            r9 = r8
            java.util.Set r9 = (java.util.Set) r9
            yhm.o.b(r10)
            goto L64
        L42:
            yhm.o.b(r10)
            r10 = r9
            java.util.Set r10 = (java.util.Set) r10
            r0.u = r10
            r0.f191927x = r5
            r10 = r3
            n4d.m r10 = (n4d.m) r10
            n4d.k r2 = new n4d.k
            r2.<init>(r10, r8, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L5f
            goto L61
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L61:
            if (r8 != r1) goto L64
            goto L76
        L64:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r8 = zhm.d0.d1(r9)
            r0.u = r6
            r0.f191927x = r4
            n4d.m r3 = (n4d.m) r3
            java.lang.Object r8 = r3.e(r8, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l3d.r.i(java.util.List, java.util.Set, gim.c):java.lang.Object");
    }
}
