package blh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.wealth.resources.R$string;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zsc.d;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 implements z87.e {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f16678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f16679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f16680c;
    public final Set d;
    public final o97.r e;
    public final clh.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bhl.g f16681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f16682h;

    public n0(f01.c uikitResources, i instrumentsSearchDelegate, j searchSourceInstrumentFilter) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(instrumentsSearchDelegate, "instrumentsSearchDelegate");
        Intrinsics.checkNotNullParameter(searchSourceInstrumentFilter, "searchSourceInstrumentFilter");
        this.f16678a = uikitResources;
        this.f16679b = instrumentsSearchDelegate;
        this.f16680c = searchSourceInstrumentFilter;
        nel.z[] elements = {nel.z.ADR, nel.z.EQUITY, nel.z.WARRANT, nel.z.SPAC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
        this.e = o97.r.WEALTH_STOCKS;
        this.f = new clh.n(clh.w.STOCKS);
        this.f16681g = new bhl.g(this, 10);
        this.f16682h = new y(6);
    }

    @Override // z87.e
    public final o97.m a() {
        return this.f16679b.e;
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        zsc.m.Companion.getClass();
        zsc.m mVarA = zsc.l.a(searchQuery);
        d dVar = new d(this.f, this.e);
        zsc.d.Companion.getClass();
        zsc.c cVarA = d.a.a(this.f16681g);
        a aVar = new a();
        zsc.p pVar = zsc.p.WORD_PREFIX;
        return this.f16679b.d(dVar, this.f16682h, cVarA, new zsc.k(zhm.v.k(new zsc.f(new zsc.h(new Pair(aVar, pVar), new Pair(tz4.d.a(this.f16678a, R$string.wealth_search_category_stocks_name, com.revolut.feature.globalsearch.api.R$string.search_block_account_action_buy, com.revolut.feature.globalsearch.api.R$string.search_block_account_action_sell), pVar)), mVarA), new c(mVarA, 0))), remoteObservable);
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16679b.c(extensions);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof blh.m0
            if (r4 == 0) goto L13
            r4 = r6
            blh.m0 r4 = (blh.m0) r4
            int r0 = r4.f16674w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f16674w = r0
            goto L1a
        L13:
            blh.m0 r4 = new blh.m0
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f16674w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            blh.i r6 = r3.f16679b
            ufm.c r5 = r6.b(r5)
            r4.f16674w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L43
            return r0
        L43:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.n0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
