package fmc;

import com.revolut.feature.robo.impl.navigation.RoboInternalDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f136330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xvh.c f136331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f136332c;

    public c0(v portfolioProvider, xvh.c autoInvestInteractor, com.revolut.feature.robo.impl.navigation.d spareChangeFeatureCommandMapper, x productArticleFeatureCommandMapper) {
        Intrinsics.checkNotNullParameter(portfolioProvider, "portfolioProvider");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(spareChangeFeatureCommandMapper, "spareChangeFeatureCommandMapper");
        Intrinsics.checkNotNullParameter(productArticleFeatureCommandMapper, "productArticleFeatureCommandMapper");
        this.f136330a = portfolioProvider;
        this.f136331b = autoInvestInteractor;
        this.f136332c = productArticleFeatureCommandMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof fmc.a0
            if (r0 == 0) goto L13
            r0 = r7
            fmc.a0 r0 = (fmc.a0) r0
            int r1 = r0.f136323w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136323w = r1
            goto L18
        L13:
            fmc.a0 r0 = new fmc.a0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136323w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4f
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            xvh.c r7 = r6.f136331b
            w4l.h r2 = w4l.h.f294642c
            efm.r r7 = xvh.c.c(r7, r4, r2, r3)
            fk4.r r2 = new fk4.r
            r5 = 12
            r2.<init>(r5)
            efm.r r7 = m70.a.g(r7, r4, r2, r3)
            r0.f136323w = r3
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L5a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r7.next()
            r1 = r0
            yvh.b r1 = (yvh.b) r1
            boolean r1 = r1.f317177b
            if (r1 == 0) goto L5a
            return r0
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.c0.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r8 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fmc.b0
            if (r0 == 0) goto L13
            r0 = r8
            fmc.b0 r0 = (fmc.b0) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            fmc.b0 r0 = new fmc.b0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f136327x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L83
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            int r2 = r0.f136326w
            fmc.c0 r4 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r8)
            goto L71
        L3f:
            yhm.o.b(r8)
            goto L51
        L43:
            yhm.o.b(r8)
            r0.z = r5
            fmc.v r8 = r7.f136330a
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L51
            goto L82
        L51:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r8
            if (r8 == 0) goto L88
            java.util.UUID r8 = r8.f105210a
            java.lang.String r5 = r8.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            r0.u = r5
            r0.v = r7
            r2 = 0
            r0.f136326w = r2
            r0.z = r4
            java.lang.Object r8 = r7.a(r0)
            if (r8 != r1) goto L70
            goto L82
        L70:
            r4 = r7
        L71:
            yvh.b r8 = (yvh.b) r8
            r6 = 0
            r0.u = r6
            r0.v = r6
            r0.f136326w = r2
            r0.z = r3
            java.lang.Object r8 = r4.c(r5, r8, r0)
            if (r8 != r1) goto L83
        L82:
            return r1
        L83:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            if (r8 == 0) goto L88
            return r8
        L88:
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r8 = gmc.a.a()
            com.revolut.retail.core.navigation.FeatureCommand r8 = gc0.c.f(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.c0.b(gim.c):java.lang.Object");
    }

    public final Object c(String portfolioId, yvh.b bVar, gim.c cVar) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return this.f136332c.a((bVar == null || (bVar.e == yvh.h.WEALTH_PORTFOLIO && Intrinsics.f(bVar.f317178c, portfolioId))) ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new RoboInternalDestination.SetPortfolioSpareChangeDestination(portfolioId), false, (Integer) null, 0, 60)) : vhi.c.c(new RoboInternalDestination.MigratePortfolioSpareChangeDestination(portfolioId, bVar), yhi.b.BOTTOM_DIALOG, null, false, 12), cVar);
    }
}
