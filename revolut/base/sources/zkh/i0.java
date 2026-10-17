package zkh;

import java.util.ArrayList;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements z87.d {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9h.a f323003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jbh.e f323004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f323005c;
    public final gte.a d;
    public final su9.c e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o5d.a f323006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o97.r f323007h;

    public i0(t9h.a popularAssetsWidgetPresentationModel, jbh.e performanceAssetMapper, f01.c uikitResources, t5d.d swipeAssetTradeActionsMapper, gte.a featureToggleInteractor, su9.c metaCollectionInteractor) {
        Intrinsics.checkNotNullParameter(popularAssetsWidgetPresentationModel, "popularAssetsWidgetPresentationModel");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(metaCollectionInteractor, "metaCollectionInteractor");
        this.f323003a = popularAssetsWidgetPresentationModel;
        this.f323004b = performanceAssetMapper;
        this.f323005c = uikitResources;
        this.d = featureToggleInteractor;
        this.e = metaCollectionInteractor;
        this.f = yhm.j.b(new zh0.b(this, 8));
        this.f323007h = o97.r.WEALTH_STOCKS_MOST_OWNED;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    @Override // z87.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r f(java.lang.String r4, com.revolut.feature.globalsearch.models.GlobalSearchContext r5) {
        /*
            r3 = this;
            java.lang.String r0 = "searchQuery"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            zsc.p r5 = zsc.p.WORD_PREFIX
            kotlin.Lazy r0 = r3.f
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = zhm.u.c(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r4 = r5.a(r4, r0)
            if (r4 == 0) goto L9f
            s0h.a r4 = new s0h.a
            zel.f r5 = zel.f.STOCKS
            r4.<init>(r5)
            t9h.a r5 = r3.f323003a
            efm.r r4 = r5.a(r4)
            zke.f r5 = new zke.f
            r0 = 15
            r5.<init>(r0)
            efm.r r4 = nim.a.w(r4, r5)
            r5 = 1
            agm.a r4 = r4.replay(r5)
            tfm.n4 r4 = r4.e()
            java.lang.String r5 = "refCount(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            o5d.a r5 = r3.f323006g
            if (r5 == 0) goto L78
            zke.f r0 = new zke.f
            r1 = 16
            r0.<init>(r1)
            zii.e r1 = new zii.e
            r2 = 18
            r1.<init>(r0, r2)
            efm.r r0 = r4.map(r1)
            java.lang.String r1 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            vkm.d r0 = rd0.e.b(r0)
            kotlinx.coroutines.flow.Flow r5 = r5.Z2(r0)
            zfd.e r0 = new zfd.e
            r1 = 5
            r0.<init>(r5, r1)
            kotlin.coroutines.g r5 = kotlin.coroutines.g.f186406a
            efm.r r5 = rd0.e.c(r0, r5)
            if (r5 == 0) goto L78
            goto L85
        L78:
            java.util.Optional r5 = java.util.Optional.empty()
            efm.r r5 = efm.r.just(r5)
            java.lang.String r0 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
        L85:
            efm.r r4 = te0.w.l(r4, r5)
            zhf.f r5 = new zhf.f
            r0 = 16
            r5.<init>(r3, r0)
            zii.e r0 = new zii.e
            r1 = 17
            r0.<init>(r5, r1)
            efm.r r4 = r4.map(r0)
            kotlin.jvm.internal.Intrinsics.h(r4)
            return r4
        L9f:
            o97.e0 r4 = new o97.e0
            zhm.f0 r5 = zhm.f0.f322471a
            r4.<init>(r5)
            java.util.List r4 = zhm.u.c(r4)
            r5 = 0
            r0 = 3
            r1 = 0
            com.revolut.data.model.Data r4 = zi0.c.P(r4, r5, r1, r0)
            efm.r r4 = efm.r.just(r4)
            kotlin.jvm.internal.Intrinsics.h(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: zkh.i0.f(java.lang.String, com.revolut.feature.globalsearch.models.GlobalSearchContext):efm.r");
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : extensions) {
            if (obj2 instanceof o5d.a) {
                arrayList.add(obj2);
            }
        }
        this.f323006g = (o5d.a) zhm.d0.M0(arrayList);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f323007h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r9, o97.y r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof zkh.g0
            if (r0 == 0) goto L13
            r0 = r11
            zkh.g0 r0 = (zkh.g0) r0
            int r1 = r0.f322995w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322995w = r1
            goto L1a
        L13:
            zkh.g0 r0 = new zkh.g0
            gim.c r11 = (gim.c) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322995w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r11)
            goto L49
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r11)
            java.lang.Object r11 = r10.f223136b
            java.lang.Object r10 = r10.e
            java.lang.String r2 = "SEARCH_POPULAR_STOCKS_LIST_ID"
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r2)
            if (r9 == 0) goto L51
            r0.f322995w = r3
            java.lang.Object r11 = r8.m(r0)
            if (r11 != r1) goto L49
            return r1
        L49:
            com.revolut.retail.core.navigation.NaviCommand r11 = (com.revolut.retail.core.navigation.NaviCommand) r11
            o97.l r9 = new o97.l
            r9.<init>(r11)
            return r9
        L51:
            boolean r9 = r10 instanceof com.revolut.core.ui_kit.delegates.vh
            o97.e r0 = o97.e.f223096a
            if (r9 == 0) goto L61
            o5d.a r9 = r8.f323006g
            if (r9 == 0) goto L80
            com.revolut.core.ui_kit.delegates.vh r10 = (com.revolut.core.ui_kit.delegates.vh) r10
            r9.b3(r10)
            return r0
        L61:
            boolean r9 = r11 instanceof zkh.d
            if (r9 == 0) goto L80
            o97.d r9 = new o97.d
            com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r0 = new com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination
            zkh.d r11 = (zkh.d) r11
            vel.f r10 = r11.f322985a
            java.lang.String r1 = r10.a()
            r6 = 0
            r7 = 54
            r2 = 0
            r3 = 0
            java.lang.String r4 = "GlobalSearch"
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.<init>(r0)
            return r9
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zkh.i0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zkh.h0
            if (r0 == 0) goto L13
            r0 = r6
            zkh.h0 r0 = (zkh.h0) r0
            int r1 = r0.f322999w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322999w = r1
            goto L18
        L13:
            zkh.h0 r0 = new zkh.h0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322999w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection r6 = com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection.f96096c
            gte.a r2 = r5.d
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            if (r6 == 0) goto L68
            wgl.a r6 = new wgl.a
            zel.f r2 = zel.f.STOCKS
            r6.<init>(r2)
            su9.c r2 = r5.e
            vkm.d r6 = r2.h(r6)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f322999w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            com.revolut.shared.feature.wealth.models.screener.ScreenerCollection r6 = (com.revolut.shared.feature.wealth.models.screener.ScreenerCollection) r6
            com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination r0 = new com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination
            java.lang.String r1 = r6.f105154a
            r0.<init>(r1, r6)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r0)
            return r6
        L68:
            com.revolut.feature.wealth.api.declaration.PopularAssetsDestination r6 = new com.revolut.feature.wealth.api.declaration.PopularAssetsDestination
            mzg.d r0 = mzg.d.STOCKS
            zel.f r1 = zel.f.STOCKS
            java.util.List r1 = kp0.w0.q(r1)
            r6.<init>(r0, r1)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zkh.i0.m(gim.c):java.lang.Object");
    }
}
