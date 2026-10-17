package zha;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.core.navigation.FeatureCommand;
import et6.g;
import hr6.l;
import kotlin.jvm.internal.Intrinsics;
import vha.t0;
import vkm.q;
import w4l.h;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements sha.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f322378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f322379b;

    public d(gr6.a freelancerAccountDetailsInteractor, l freelancerCommandFactory) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        this.f322378a = freelancerAccountDetailsInteractor;
        this.f322379b = freelancerCommandFactory;
    }

    public final Object a(gim.c cVar) {
        s49.a aVar = s49.a.AS_TOP;
        MainContainerNavigationId.NewMainScreenContainerTabId newMainScreenContainerTabId = new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null);
        ProductId productId = ProductId.PRO;
        t0.Companion.getClass();
        return e(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(aVar, new MainContainerInnerConfiguration(newMainScreenContainerTabId, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(t0.d, null), productId), null), null, 4))), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zha.a
            if (r0 == 0) goto L13
            r0 = r7
            zha.a r0 = (zha.a) r0
            int r1 = r0.f322373x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322373x = r1
            goto L18
        L13:
            zha.a r0 = new zha.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322373x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f322373x = r4
            java.lang.Object r7 = r5.c(r0)
            if (r7 != r1) goto L46
            goto L5c
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L67
            r0.u = r6
            r0.f322373x = r3
            hr6.l r6 = r5.f322379b
            com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy$NavigateToMain r7 = com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy.NavigateToMain.f73261a
            com.revolut.retail.core.navigation.FeatureCommand r7 = hr6.l.b(r6, r7, r0, r4)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            java.util.Optional r6 = java.util.Optional.of(r7)
            kotlin.jvm.internal.Intrinsics.h(r6)
            return r6
        L67:
            java.util.Optional r6 = java.util.Optional.empty()
            kotlin.jvm.internal.Intrinsics.h(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zha.d.b(boolean, gim.c):java.lang.Object");
    }

    public final Object c(gim.c cVar) {
        return q.x(mo3.a.h(((g) this.f322378a).d(h.f294642c), new y5g.l(24), null, 6), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.kompot.bridge.navigation.KompotDestination r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zha.c
            if (r0 == 0) goto L13
            r0 = r6
            zha.c r0 = (zha.c) r0
            int r1 = r0.f322377x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322377x = r1
            goto L18
        L13:
            zha.c r0 = new zha.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322377x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.kompot.bridge.navigation.KompotDestination r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f322377x = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L55
            com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$Onboarding$Default r5 = new com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig$Onboarding$Default
            com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig$ShowArticle r6 = new com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig$ShowArticle
            dr6.a r0 = dr6.a.GENERAL
            r6.<init>(r0)
            com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy$NavigateToMain r0 = com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy.NavigateToMain.f73261a
            r5.<init>(r6, r0, r3)
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zha.d.d(com.revolut.kompot.bridge.navigation.KompotDestination, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.retail.core.navigation.FeatureCommand r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zha.b
            if (r0 == 0) goto L13
            r0 = r7
            zha.b r0 = (zha.b) r0
            int r1 = r0.f322375x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f322375x = r1
            goto L18
        L13:
            zha.b r0 = new zha.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f322375x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.retail.core.navigation.FeatureCommand r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f322375x = r4
            java.lang.Object r7 = r5.c(r0)
            if (r7 != r1) goto L46
            goto L5b
        L46:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5c
            r6 = 0
            r0.u = r6
            r0.f322375x = r3
            hr6.l r7 = r5.f322379b
            com.revolut.retail.core.navigation.FeatureCommand r6 = hr6.l.b(r7, r6, r0, r4)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zha.d.e(com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }
}
