package blh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements z87.d {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f16675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f16676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x8h.m f16677c;
    public final Lazy d;
    public final o97.r e;

    public n(f01.c uikitResources, i instrumentsSearchDelegate, j searchSourceInstrumentFilter, x8h.m etpProductAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(instrumentsSearchDelegate, "instrumentsSearchDelegate");
        Intrinsics.checkNotNullParameter(searchSourceInstrumentFilter, "searchSourceInstrumentFilter");
        Intrinsics.checkNotNullParameter(etpProductAvailabilityInteractor, "etpProductAvailabilityInteractor");
        this.f16675a = uikitResources;
        this.f16676b = instrumentsSearchDelegate;
        this.f16677c = etpProductAvailabilityInteractor;
        this.d = yhm.j.b(new bc1.b(this, 12));
        this.e = o97.r.WEALTH_ETFS_ALL;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarSwitchMap = rd0.e.c(this.f16677c.b(), kotlin.coroutines.g.f186406a).switchMap(new bjg.d(21, new k(this, searchQuery, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16676b.c(extensions);
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
    public final java.lang.Object l(java.lang.String r5, o97.y r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof blh.m
            if (r0 == 0) goto L13
            r0 = r7
            blh.m r0 = (blh.m) r0
            int r1 = r0.f16673w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16673w = r1
            goto L1a
        L13:
            blh.m r0 = new blh.m
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16673w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L5c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "ALL_ETFS_LIST_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            if (r5 == 0) goto L4d
            o97.l r5 = new o97.l
            com.revolut.feature.wealth_discovery.api.declaration.AllAssetsListDestination r6 = new com.revolut.feature.wealth_discovery.api.declaration.AllAssetsListDestination
            zel.f r7 = zel.f.ETP
            r6.<init>(r7)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r6)
            r5.<init>(r6)
            return r5
        L4d:
            blh.i r5 = r4.f16676b
            ufm.c r5 = r5.b(r6)
            r0.f16673w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            kotlin.jvm.internal.Intrinsics.h(r7)
            o97.x r7 = (o97.x) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.n.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
