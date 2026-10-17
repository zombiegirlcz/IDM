package blh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zsc.d;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements z87.d {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f16684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f16685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f16686c;
    public final Set d;
    public final o97.r e;

    public q(f01.c uikitResources, i instrumentsSearchDelegate, nlh.b wealthTradeCommandProvider, j searchSourceInstrumentFilter) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(instrumentsSearchDelegate, "instrumentsSearchDelegate");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        Intrinsics.checkNotNullParameter(searchSourceInstrumentFilter, "searchSourceInstrumentFilter");
        this.f16684a = uikitResources;
        this.f16685b = instrumentsSearchDelegate;
        this.f16686c = yhm.j.b(new bc1.b(this, 13));
        nel.z[] elements = {nel.z.ADR, nel.z.EQUITY, nel.z.WARRANT, nel.z.SPAC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
        this.e = o97.r.WEALTH_STOCKS_ALL;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        d.a aVar = zsc.d.Companion;
        beg.k kVar = new beg.k(this, searchQuery, 22);
        aVar.getClass();
        zsc.c cVarA = d.a.a(kVar);
        return f.a(this.f16685b, new d(new clh.m("ALL_STOCKS_LIST_ID", clh.w.ALL_STOCKS), this.e), new ble.z(21), cVarA);
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16685b.c(extensions);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r6, o97.y r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof blh.p
            if (r0 == 0) goto L13
            r0 = r8
            blh.p r0 = (blh.p) r0
            int r1 = r0.f16683w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16683w = r1
            goto L1a
        L13:
            blh.p r0 = new blh.p
            gim.c r8 = (gim.c) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16683w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r8)
            goto L58
        L38:
            yhm.o.b(r8)
            java.lang.String r8 = "ALL_STOCKS_LIST_ID"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r8)
            if (r6 == 0) goto L5b
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            aza.g r7 = new aza.g
            r8 = 16
            r2 = 0
            r7.<init>(r5, r2, r8)
            r0.f16683w = r4
            java.lang.Object r8 = skm.e0.J(r6, r7, r0)
            if (r8 != r1) goto L58
            goto L69
        L58:
            o97.x r8 = (o97.x) r8
            return r8
        L5b:
            blh.i r6 = r5.f16685b
            ufm.c r6 = r6.b(r7)
            r0.f16683w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L6a
        L69:
            return r1
        L6a:
            kotlin.jvm.internal.Intrinsics.h(r8)
            o97.x r8 = (o97.x) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.q.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
