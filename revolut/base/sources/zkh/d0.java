package zkh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.tab.invest.api.TabInvestApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements z87.d {

    @NotNull
    private static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f322986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t9h.a f322987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jbh.e f322988c;
    public final ybl.l d;
    public final f01.c e;
    public final su9.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o97.r f322989g;

    public d0(gte.a featureToggleInteractor, t9h.a popularAssetsWidgetPresentationModel, jbh.e performanceAssetMapper, ybl.l tradingConfigInteractor, f01.c uiKitResources, su9.c metaCollectionInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(popularAssetsWidgetPresentationModel, "popularAssetsWidgetPresentationModel");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(metaCollectionInteractor, "metaCollectionInteractor");
        this.f322986a = featureToggleInteractor;
        this.f322987b = popularAssetsWidgetPresentationModel;
        this.f322988c = performanceAssetMapper;
        this.d = tradingConfigInteractor;
        this.e = uiKitResources;
        this.f = metaCollectionInteractor;
        this.f322989g = o97.r.WEALTH_ETFS_MOST_OWNED;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f322986a.a(TabInvestApi$Toggles.EtfWidgetImprovement2024.f89826c)) {
            int i = 14;
            return rd0.e.c(boh.f.e(nim.a.v(ybl.l.d(this.d), new zke.f(i)), new zf5.n(this, searchQuery, i)), skm.p0.f264003c);
        }
        efm.r rVarJust = efm.r.just(zi0.c.P(zhm.u.c(new o97.e0(zhm.f0.f322471a)), false, null, 3));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f322989g;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r13, o97.y r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof zkh.b0
            if (r0 == 0) goto L13
            r0 = r15
            zkh.b0 r0 = (zkh.b0) r0
            int r1 = r0.f322982w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322982w = r1
            goto L1a
        L13:
            zkh.b0 r0 = new zkh.b0
            gim.c r15 = (gim.c) r15
            r0.<init>(r12, r15)
        L1a:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322982w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r15)
            goto L66
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            yhm.o.b(r15)
            java.lang.Object r14 = r14.f223136b
            boolean r15 = r14 instanceof zkh.z
            if (r15 == 0) goto L55
            com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r4 = new com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination
            zkh.z r14 = (zkh.z) r14
            vel.f r13 = r14.f323045a
            java.lang.String r5 = r13.a()
            r10 = 0
            r11 = 54
            r6 = 0
            r7 = 0
            java.lang.String r8 = "GlobalSearch"
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            o97.d r13 = new o97.d
            r13.<init>(r4)
            return r13
        L55:
            java.lang.String r14 = "SEARCH_POPULAR_ETFS_LIST_ID"
            boolean r13 = kotlin.jvm.internal.Intrinsics.f(r13, r14)
            if (r13 == 0) goto L70
            r0.f322982w = r3
            java.lang.Object r15 = r12.m(r0)
            if (r15 != r1) goto L66
            return r1
        L66:
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
            if (r15 == 0) goto L70
            o97.l r13 = new o97.l
            r13.<init>(r15)
            return r13
        L70:
            o97.e r13 = o97.e.f223096a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: zkh.d0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zkh.c0
            if (r0 == 0) goto L13
            r0 = r7
            zkh.c0 r0 = (zkh.c0) r0
            int r1 = r0.f322984w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322984w = r1
            goto L18
        L13:
            zkh.c0 r0 = new zkh.c0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322984w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L60
        L28:
            r7 = move-exception
            goto L70
        L2a:
            r7 = move-exception
            goto L7f
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection r7 = com.revolut.feature.wealth_discovery.api.ScreenerApi$Toggles$ScreenerPopularInstrumentsCollection.f96096c
            gte.a r2 = r6.f322986a
            jte.d r2 = (jte.d) r2
            boolean r7 = r2.c(r7)
            if (r7 == 0) goto L80
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            su9.c r7 = r6.f     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            wgl.a r2 = new wgl.a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            zel.f r5 = zel.f.ETP     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            vkm.d r7 = r7.h(r2)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r2 = 3
            jhi.b r7 = mo3.a.g(r7, r4, r4, r2)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f322984w = r3     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r7 = vkm.q.x(r7, r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            if (r7 != r1) goto L60
            return r1
        L60:
            com.revolut.shared.feature.wealth.models.screener.ScreenerCollection r7 = (com.revolut.shared.feature.wealth.models.screener.ScreenerCollection) r7     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination r0 = new com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.String r1 = r7.f105154a     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.f(r0)     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28 java.util.concurrent.CancellationException -> L2a
            goto L76
        L70:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L76:
            boolean r0 = r7 instanceof yhm.n
            if (r0 == 0) goto L7b
            goto L7c
        L7b:
            r4 = r7
        L7c:
            com.revolut.retail.core.navigation.NaviCommand r4 = (com.revolut.retail.core.navigation.NaviCommand) r4
            return r4
        L7f:
            throw r7
        L80:
            com.revolut.feature.wealth.api.declaration.PopularAssetsDestination r7 = new com.revolut.feature.wealth.api.declaration.PopularAssetsDestination
            mzg.d r0 = mzg.d.STOCKS
            zel.f r1 = zel.f.ETP
            java.util.List r1 = kp0.w0.q(r1)
            r7.<init>(r0, r1)
            com.revolut.retail.core.navigation.FeatureCommand r7 = zh9.u0.f(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zkh.d0.m(gim.c):java.lang.Object");
    }
}
