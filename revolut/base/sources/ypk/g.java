package ypk;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import vkm.y;
import yji.n;
import yk6.m;
import yo7.p;
import ypg.l;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RateDetailsScreenContract$InputData f315947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f315948m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f315949n;
    public final o9j.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.b f315950p;

    public g(RateDetailsScreenContract$InputData inputData, b view, c assetDetailsChartInteractor, o9j.b chartMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(assetDetailsChartInteractor, "assetDetailsChartInteractor");
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        this.f315947l = inputData;
        this.f315948m = view;
        this.f315949n = assetDetailsChartInteractor;
        this.o = chartMapper;
        ihm.b bVarE = ihm.b.e(qta.f.DAY);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f315950p = bVarE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        RateDetailsScreen rateDetailsScreen = (RateDetailsScreen) this.f315948m;
        ihm.f fVar = ((TabsDelegate) rateDetailsScreen.c0.getValue()).f53515c.f121375b;
        xpk.e eVar = xpk.e.f;
        boolean z = false;
        r map = fVar.map(new x2l.a(11, z));
        ihm.f fVar2 = ((FixedTabsDelegate) rateDetailsScreen.f103725b0.getValue()).f52339c.f121375b;
        xpk.f fVar3 = xpk.f.f;
        r rVarMerge = r.merge(map, fVar2.map(new x2l.a(10, z)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        r map2 = rVarMerge.map(new l(new p(this, 8), 4));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        n.l2(this, rd0.e.b(map2), null, new m(this, (Continuation) null, 9), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ypk.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ypk.e
            if (r0 == 0) goto L13
            r0 = r5
            ypk.e r0 = (ypk.e) r0
            int r1 = r0.f315943w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315943w = r1
            goto L18
        L13:
            ypk.e r0 = new ypk.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315943w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f315943w = r3
            ihm.b r5 = r4.f315950p
            java.lang.Object r5 = nim.a.c(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ypk.g.Z2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ypk.a
    public final y b3(boolean z) {
        RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = this.f315947l;
        xi0.b bVar = rateDetailsScreenContract$InputData.f103727a;
        xi0.b bVar2 = rateDetailsScreenContract$InputData.f103728b;
        r rVarThrottleLast = ((TrendViewDelegate) ((RateDetailsScreen) this.f315948m).f103724a0.getValue()).r().throttleLast(150L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleLast, "throttleLast(...)");
        l lVar = new l(new d(this, bVar, bVar2, 2), 5);
        ihm.b bVar3 = this.f315950p;
        r rVarSwitchMap = bVar3.switchMap(lVar);
        boolean z3 = cp5.d.z(bVar) && (cp5.d.z(bVar2) || cp5.d.A(bVar2));
        Intrinsics.h(rVarSwitchMap);
        boolean z4 = rateDetailsScreenContract$InputData.f103730g;
        xi0.b bVar4 = rateDetailsScreenContract$InputData.f103727a;
        xi0.b bVar5 = rateDetailsScreenContract$InputData.f103728b;
        c cVar = this.f315949n;
        r map = w.n(rVarSwitchMap, bVar3, rVarThrottleLast, z4 ? cVar.a(bVar5, bVar4) : cVar.a(bVar4, bVar5)).map(new l(new wo5.a(this, bVar, z3, 5), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return new y(new f(z, this, (Continuation) null), rd0.e.b(map));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ypk.a
    public final Flow c3() {
        RateDetailsScreenContract$InputData rateDetailsScreenContract$InputData = this.f315947l;
        xi0.b bVar = rateDetailsScreenContract$InputData.f103727a;
        xi0.b bVar2 = rateDetailsScreenContract$InputData.f103728b;
        boolean z = rateDetailsScreenContract$InputData.f103730g;
        c cVar = this.f315949n;
        r rVarA = z ? cVar.a(bVar2, bVar) : cVar.a(bVar, bVar2);
        r rVarThrottleLast = ((TrendViewDelegate) ((RateDetailsScreen) this.f315948m).f103724a0.getValue()).r().throttleLast(150L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleLast, "throttleLast(...)");
        l lVar = new l(new d(this, bVar, bVar2, 0), 2);
        ihm.b bVar3 = this.f315950p;
        r rVarSwitchMap = bVar3.switchMap(lVar);
        Intrinsics.h(rVarSwitchMap);
        r map = w.n(rVarA, rVarSwitchMap, bVar3, rVarThrottleLast).map(new l(new d(this, bVar, bVar2, 1), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}
