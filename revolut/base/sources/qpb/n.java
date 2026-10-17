package qpb;

import kotlin.jvm.internal.Intrinsics;
import rnb.w;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final twg.c f248345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppg.b f248346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f248347c;
    public final rnb.m d;
    public final kbb.c e;
    public final s6e.b f;

    public n(twg.c freelancerPocketsAutoPaymentMethodsInteractor, ppg.b vaultsInteractor, w savingsVaultInteractor, rnb.m savingsAutoPaymentsInteractor, kbb.c savingsAutomationEligibilityInteractor, s6e.b subaccountAutoPaymentMethodsProvider) {
        Intrinsics.checkNotNullParameter(freelancerPocketsAutoPaymentMethodsInteractor, "freelancerPocketsAutoPaymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsAutoPaymentsInteractor, "savingsAutoPaymentsInteractor");
        Intrinsics.checkNotNullParameter(savingsAutomationEligibilityInteractor, "savingsAutomationEligibilityInteractor");
        Intrinsics.checkNotNullParameter(subaccountAutoPaymentMethodsProvider, "subaccountAutoPaymentMethodsProvider");
        this.f248345a = freelancerPocketsAutoPaymentMethodsInteractor;
        this.f248346b = vaultsInteractor;
        this.f248347c = savingsVaultInteractor;
        this.d = savingsAutoPaymentsInteractor;
        this.e = savingsAutomationEligibilityInteractor;
        this.f = subaccountAutoPaymentMethodsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof qpb.j
            if (r0 == 0) goto L13
            r0 = r11
            qpb.j r0 = (qpb.j) r0
            int r1 = r0.f248342w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248342w = r1
            goto L18
        L13:
            qpb.j r0 = new qpb.j
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248342w
            kbb.c r3 = r9.e
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L4d
            if (r2 == r8) goto L49
            if (r2 == r7) goto L45
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            yhm.o.b(r11)
            return r11
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            yhm.o.b(r11)
            return r11
        L41:
            yhm.o.b(r11)
            goto L95
        L45:
            yhm.o.b(r11)
            return r11
        L49:
            yhm.o.b(r11)
            goto L76
        L4d:
            yhm.o.b(r11)
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.Pockets
            if (r11 != 0) goto Lbd
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JointPockets
            if (r11 != 0) goto Lbd
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.ProRegularPockets
            if (r11 != 0) goto Lbd
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.ProTaxPockets
            if (r11 != 0) goto Lbd
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JuniorPockets
            if (r11 != 0) goto Lbd
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.TeenPockets
            if (r11 == 0) goto L69
            goto Lbd
        L69:
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JointSavings
            if (r11 == 0) goto L88
            r0.f248342w = r8
            java.lang.Object r11 = r3.D(r0)
            if (r11 != r1) goto L76
            goto Lb5
        L76:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r10 != 0) goto Lbd
            r0.f248342w = r7
            java.lang.Object r10 = r3.F(r0)
            if (r10 != r1) goto L87
            goto Lb5
        L87:
            return r10
        L88:
            boolean r11 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.Savings
            if (r11 == 0) goto La9
            r0.f248342w = r6
            java.lang.Object r11 = r9.c(r10, r0)
            if (r11 != r1) goto L95
            goto Lb5
        L95:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r10 != 0) goto La7
            r0.f248342w = r5
            java.lang.Object r10 = r9.b(r0)
            if (r10 != r1) goto La6
            goto Lb5
        La6:
            return r10
        La7:
            r8 = 0
            goto Lbd
        La9:
            boolean r10 = r10 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JuniorSavings
            if (r10 == 0) goto Lb7
            r0.f248342w = r4
            java.lang.Object r10 = r9.b(r0)
            if (r10 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            return r10
        Lb7:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        Lbd:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: qpb.n.a(com.revolut.feature.home_feed.api.widget.VaultWidgetContext$Type, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qpb.k
            if (r0 == 0) goto L13
            r0 = r7
            qpb.k r0 = (qpb.k) r0
            int r1 = r0.f248343w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248343w = r1
            goto L18
        L13:
            qpb.k r0 = new qpb.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248343w
            kbb.c r3 = r6.e
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L44
        L38:
            yhm.o.b(r7)
            r0.f248343w = r5
            java.lang.Object r7 = r3.F(r0)
            if (r7 != r1) goto L44
            goto L54
        L44:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6b
            r0.f248343w = r4
            java.lang.Object r7 = r3.D(r0)
            if (r7 != r1) goto L55
        L54:
            return r1
        L55:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6b
            rnb.m r7 = r6.d
            wzi.a r7 = r7.d
            etj.o r7 = (etj.o) r7
            boolean r7 = r7.i()
            if (r7 == 0) goto L6a
            goto L6b
        L6a:
            r5 = 0
        L6b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qpb.n.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qpb.l
            if (r0 == 0) goto L13
            r0 = r7
            qpb.l r0 = (qpb.l) r0
            int r1 = r0.f248344w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f248344w = r1
            goto L18
        L13:
            qpb.l r0 = new qpb.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f248344w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.String r6 = r6.getF74730a()
            w4l.h r7 = w4l.h.f294642c
            rnb.w r2 = r5.f248347c
            kotlinx.coroutines.flow.Flow r6 = r2.c(r6, r7)
            qnd.c r7 = new qnd.c
            r2 = 28
            r7.<init>(r2)
            akg.n r6 = nim.a.v(r6, r7)
            qjj.g r7 = new qjj.g
            r2 = 21
            r7.<init>(r2)
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r7, r3)
            qpb.m r7 = new qpb.m
            r4 = 3
            r7.<init>(r4, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.e(r6, r2, r7)
            r0.f248344w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L6a
            return r1
        L6a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L73
            boolean r6 = r7.booleanValue()
            goto L74
        L73:
            r6 = 0
        L74:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qpb.n.c(com.revolut.feature.home_feed.api.widget.VaultWidgetContext$Type, gim.c):java.lang.Object");
    }
}
