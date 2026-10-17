package oxg;

import ael.y;
import aii.u;
import com.revolut.feature.wealth.analytics.ui.navigation.complex_analytics.ComplexAnalyticsSectorAllocationDestination;
import com.revolut.feature.wealth.analytics.ui.navigation.complex_analytics.ComplexAnalyticsSectorContributorDestination;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ox5.t0;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f230837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f230838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gwg.a f230839c;
    public final clc.b d;

    public q(tzg.m wealthAccountsInteractor, ybl.d portfolioInteractor, bwg.a cryptoAssetDetailsNavigationProvider, gwg.a displayCurrencyMode, clc.b roboOnboardingEntryCommandFactory) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(cryptoAssetDetailsNavigationProvider, "cryptoAssetDetailsNavigationProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        this.f230837a = wealthAccountsInteractor;
        this.f230838b = portfolioInteractor;
        this.f230839c = displayCurrencyMode;
        this.d = roboOnboardingEntryCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(akg.n r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oxg.n
            if (r0 == 0) goto L13
            r0 = r7
            oxg.n r0 = (oxg.n) r0
            int r1 = r0.f230833w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230833w = r1
            goto L18
        L13:
            oxg.n r0 = new oxg.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230833w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            ox5.d0 r7 = new ox5.d0
            r2 = 10
            r7.<init>(r2)
            ox5.d0 r2 = new ox5.d0
            r4 = 11
            r2.<init>(r4)
            jhi.b r6 = mo3.a.e(r6, r7, r2)
            r0.f230833w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L54
            java.lang.Object r6 = r7.f224257a
            return r6
        L54:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oxg.q.a(akg.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b1, code lost:
    
        if (r9 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(oxg.c r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oxg.q.b(oxg.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(oxg.d r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof oxg.p
            if (r0 == 0) goto L13
            r0 = r10
            oxg.p r0 = (oxg.p) r0
            int r1 = r0.f230836x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230836x = r1
            goto L18
        L13:
            oxg.p r0 = new oxg.p
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230836x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oxg.d r9 = r0.u
            yhm.o.b(r10)
            goto L5d
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            java.lang.String r10 = r9.f230820b
            if (r10 == 0) goto L6d
            java.math.BigDecimal r10 = r9.f230821c
            boolean r10 = d9.e1.D(r10)
            if (r10 == 0) goto L6d
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r10 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.MARGIN
            r0.u = r9
            r0.f230836x = r3
            tzg.m r2 = r8.f230837a
            akg.n r10 = tzg.m.a(r2, r10)
            ox5.t0 r2 = new ox5.t0
            r4 = 6
            r2.<init>(r4)
            akg.n r10 = nim.a.v(r10, r2)
            java.lang.Object r10 = r8.a(r10, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L6b
            com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$CfdPositionsDestination r0 = new com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$CfdPositionsDestination
            java.lang.String r1 = r9.f230819a
            java.lang.String r9 = r9.f230820b
            r0.<init>(r1, r10, r9, r3)
            return r0
        L6b:
            r9 = 0
            return r9
        L6d:
            com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r0 = new com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination
            java.lang.String r1 = r9.f230819a
            r6 = 0
            r7 = 62
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oxg.q.c(oxg.d, gim.c):java.lang.Object");
    }

    public final Object d(l lVar, gim.i iVar) {
        if (lVar instanceof b) {
            return new AssetDetailsDestination(((b) lVar).f230816b, null, false, null, null, null, 62);
        }
        if (lVar instanceof i) {
            return new AssetDetailsDestination(((i) lVar).f230829b, null, false, null, null, null, 62);
        }
        if (lVar instanceof c) {
            return b((c) lVar, iVar);
        }
        if (lVar instanceof e) {
            xi0.b currency = ((e) lVar).f230822a;
            Intrinsics.checkNotNullParameter(currency, "currency");
            return u0.c(new CryptoCommodityDetailsFeatureConfig(currency, null, null, null, 62));
        }
        if (lVar instanceof h) {
            xi0.b currency2 = ((h) lVar).f230827a;
            Intrinsics.checkNotNullParameter(currency2, "currency");
            return u0.c(new CryptoCommodityDetailsFeatureConfig(currency2, null, null, null, 62));
        }
        if (lVar instanceof k) {
            return new AssetDetailsDestination(((k) lVar).f230832b, null, false, null, null, null, 62);
        }
        if (lVar instanceof g) {
            g gVar = (g) lVar;
            return new ComplexAnalyticsSectorContributorDestination(gVar.f230824a, gVar.f230825b, gVar.f230826c, gVar.d, this.f230839c);
        }
        if (lVar instanceof a) {
            a aVar = (a) lVar;
            return new ComplexAnalyticsSectorAllocationDestination(aVar.f230813a, aVar.f230814b, this.f230839c);
        }
        if (lVar instanceof d) {
            return c((d) lVar, iVar);
        }
        if (!(lVar instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objD = ((com.revolut.feature.robo.impl.navigation.c) this.d).d(((j) lVar).f230830a, iVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : (u) objD;
    }

    public final Object e(String str, o oVar) {
        return a(nim.a.v(((y) this.f230838b).e(str, w4l.h.f294642c), new t0(7)), oVar);
    }
}
