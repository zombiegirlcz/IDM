package sca;

import a9j.o;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import g48.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements h8a.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f261696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f261697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f261698c;
    public final r0 d;
    public final FeatureCommand e;

    public e(m navigator, uw1.c apmFeatureChecker, gte.a featureToggleInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f261696a = navigator;
        this.f261697b = apmFeatureChecker;
        this.f261698c = featureToggleInteractor;
        this.d = jointAccountsInteractor;
        this.e = gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "pix");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sca.b
            if (r0 == 0) goto L13
            r0 = r7
            sca.b r0 = (sca.b) r0
            int r1 = r0.f261691w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261691w = r1
            goto L18
        L13:
            sca.b r0 = new sca.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261691w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r7 = 2
            java.lang.String r2 = r6.e(r7)
            java.lang.String r4 = "area"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r4)
            if (r2 == 0) goto L55
            r0.f261691w = r3
            java.lang.Object r7 = r5.c(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            com.revolut.core.model.account.AccountId r7 = (com.revolut.core.model.account.AccountId) r7
            com.revolut.feature.pix.api.navigation.PixAreaNavigation$InputData r6 = new com.revolut.feature.pix.api.navigation.PixAreaNavigation$InputData
            r6.<init>(r7)
            com.revolut.feature.pix.api.navigation.PixAreaNavigation$Destination r7 = new com.revolut.feature.pix.api.navigation.PixAreaNavigation$Destination
            r7.<init>(r6)
            return r7
        L55:
            java.lang.String r7 = r6.e(r7)
            java.lang.String r0 = "payment_authorisations"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r0)
            r0 = 0
            if (r7 == 0) goto L7c
            r7 = 3
            java.lang.String r6 = r6.e(r7)
            boolean r7 = kotlin.text.d0.W(r6)
            if (r7 != 0) goto L6e
            goto L6f
        L6e:
            r6 = r0
        L6f:
            if (r6 == 0) goto L7c
            com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$Destination r7 = new com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$Destination
            com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$InputData$Request r1 = new com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$InputData$Request
            r1.<init>(r6, r0)
            r7.<init>(r1)
            return r7
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sca.e.b(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(jf0.c r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sca.c
            if (r0 == 0) goto L13
            r0 = r8
            sca.c r0 = (sca.c) r0
            int r1 = r0.f261693x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261693x = r1
            goto L18
        L13:
            sca.c r0 = new sca.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261693x
            java.lang.String r3 = "wallet"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L67
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            com.revolut.feature.apm.core.api.ApmToggles$PixJointAccounts r8 = com.revolut.feature.apm.core.api.ApmToggles$PixJointAccounts.f61801c
            gte.a r2 = r6.f261698c
            jte.d r2 = (jte.d) r2
            boolean r8 = r2.c(r8)
            if (r8 == 0) goto L87
            java.util.HashMap r8 = r7.d
            boolean r8 = r8.containsKey(r3)
            if (r8 == 0) goto L87
            g48.r0 r8 = r6.d
            w4l.h r2 = w4l.h.f294642c
            cxe.u r8 = r8.h(r2)
            zfd.e r8 = zi0.c.w(r8)
            r2 = 3
            jhi.b r8 = mo3.a.g(r8, r5, r5, r2)
            r0.u = r7
            r0.f261693x = r4
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            od0.i r8 = (od0.i) r8
            if (r8 == 0) goto L87
            java.lang.Object r8 = r8.f224257a
            n38.a r8 = (n38.a) r8
            if (r8 == 0) goto L87
            java.lang.String r0 = r8.f211924b
            java.util.HashMap r7 = r7.d
            java.lang.Object r7 = r7.get(r3)
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r0, r7)
            if (r7 == 0) goto L80
            goto L81
        L80:
            r8 = r5
        L81:
            if (r8 == 0) goto L87
            com.revolut.core.model.account.AccountId$Joint r5 = l38.a.c(r8)
        L87:
            if (r5 == 0) goto L8a
            return r5
        L8a:
            com.revolut.core.model.account.AccountId$Personal r7 = com.revolut.core.model.account.AccountId.Personal.f51414a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sca.e.c(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sca.d
            if (r0 == 0) goto L13
            r0 = r8
            sca.d r0 = (sca.d) r0
            int r1 = r0.f261695x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261695x = r1
            goto L1a
        L13:
            sca.d r0 = new sca.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261695x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            com.revolut.kompot.bridge.navigation.KompotDestination r7 = r0.u
            yhm.o.b(r8)
            goto L62
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r8)
            goto L47
        L3b:
            yhm.o.b(r8)
            r0.f261695x = r3
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 != r1) goto L47
            goto L61
        L47:
            r7 = r8
            com.revolut.kompot.bridge.navigation.KompotDestination r7 = (com.revolut.kompot.bridge.navigation.KompotDestination) r7
            if (r7 != 0) goto L4d
            goto L6a
        L4d:
            uw1.c r8 = r6.f261697b
            ty1.b r8 = (ty1.b) r8
            yoj.c r2 = yoj.c.PIX_BRL
            pfm.z r8 = r8.c(r2)
            r0.u = r7
            r0.f261695x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6b
        L6a:
            return r5
        L6b:
            q06.h r8 = new q06.h
            r8.<init>(r7, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sca.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new o(this, deeplink, z, (Continuation) null, 5));
    }
}
