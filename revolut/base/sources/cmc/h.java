package cmc;

import a09.r;
import efm.d0;
import fmc.c0;
import fmc.l;
import fmc.o;
import fmc.q;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import sri.m;
import ufm.p;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f25203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final clc.b f25204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f25205c;
    public final zjh.f d;
    public final xkc.a e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f25206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f25207h;
    public final fmc.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fmc.b f25208j;

    public h(m navigator, clc.b roboOnboardingEntryCommandFactory, q roboSettingsFeatureCommandFactory, omc.a roboOnboardingFailedCommandFactory, pmc.a roboPreonboardingTopupCancelledCommandFactory, zjh.f portfolioInteractor, xkc.a roboProductCommsCommandProvider, l roboPortfolioDetailsFeatureCommandFactory, c0 roboSpareChangeFeatureCommandFactory, o roboRecurringDepositFeatureCommandFactory, fmc.j roboPeriodicReviewFeatureCommandFactory, fmc.b roboInvestorUpdateFeatureCommandFactory) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        Intrinsics.checkNotNullParameter(roboSettingsFeatureCommandFactory, "roboSettingsFeatureCommandFactory");
        Intrinsics.checkNotNullParameter(roboOnboardingFailedCommandFactory, "roboOnboardingFailedCommandFactory");
        Intrinsics.checkNotNullParameter(roboPreonboardingTopupCancelledCommandFactory, "roboPreonboardingTopupCancelledCommandFactory");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(roboProductCommsCommandProvider, "roboProductCommsCommandProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioDetailsFeatureCommandFactory, "roboPortfolioDetailsFeatureCommandFactory");
        Intrinsics.checkNotNullParameter(roboSpareChangeFeatureCommandFactory, "roboSpareChangeFeatureCommandFactory");
        Intrinsics.checkNotNullParameter(roboRecurringDepositFeatureCommandFactory, "roboRecurringDepositFeatureCommandFactory");
        Intrinsics.checkNotNullParameter(roboPeriodicReviewFeatureCommandFactory, "roboPeriodicReviewFeatureCommandFactory");
        Intrinsics.checkNotNullParameter(roboInvestorUpdateFeatureCommandFactory, "roboInvestorUpdateFeatureCommandFactory");
        this.f25203a = navigator;
        this.f25204b = roboOnboardingEntryCommandFactory;
        this.f25205c = roboSettingsFeatureCommandFactory;
        this.d = portfolioInteractor;
        this.e = roboProductCommsCommandProvider;
        this.f = roboPortfolioDetailsFeatureCommandFactory;
        this.f25206g = roboSpareChangeFeatureCommandFactory;
        this.f25207h = roboRecurringDepositFeatureCommandFactory;
        this.i = roboPeriodicReviewFeatureCommandFactory;
        this.f25208j = roboInvestorUpdateFeatureCommandFactory;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "robo");
    }

    public final z b(jf0.c cVar) {
        p pVarT = new ufm.c(new r(cVar, this, 12), 0).t(2L, TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(pVarT, "timeout(...)");
        return ue0.e.I(pVarT, h0.f322473a, new c(3));
    }

    public final d0 c() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        d0 d0VarFirstOrError = m70.a.g(nim.a.w(this.d.C(loadingStrategy), new zii.c(28)), null, new clk.b(4), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof cmc.g
            if (r0 == 0) goto L13
            r0 = r6
            cmc.g r0 = (cmc.g) r0
            int r1 = r0.f25202w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25202w = r1
            goto L1a
        L13:
            cmc.g r0 = new cmc.g
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25202w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            pfm.z r5 = r4.b(r5)
            r0.f25202w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            cmc.k r6 = (cmc.k) r6
            cmc.j r5 = cmc.j.f25211a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            if (r5 == 0) goto L59
            q06.i r5 = new q06.i
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160141b
            r1 = 0
            r6.<init>(r0, r1)
            r5.<init>(r6)
            return r5
        L59:
            boolean r5 = r6 instanceof cmc.i
            if (r5 == 0) goto L6e
            q06.h r5 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            cmc.i r6 = (cmc.i) r6
            com.revolut.retail.core.navigation.NaviCommand r1 = r6.f25209a
            r0.<init>(r1)
            q06.b r6 = r6.f25210b
            r5.<init>(r0, r6)
            return r5
        L6e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cmc.h.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(new ufm.i(new ufm.i(b(deeplink), new ch6.d(new a(this, z, 0), 24), 1), new d(new bwc.i(1, this.f25203a, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 23), 0), 1), new d(new c(2), 4), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
