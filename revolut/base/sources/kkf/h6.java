package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h6 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.c2 f184722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ufm.d f184724n;

    public h6(klf.c2 securityDelayDataSource, klf.m1 juniorDataSource, ufm.d securityDelayInteractor) {
        Intrinsics.checkNotNullParameter(securityDelayDataSource, "securityDelayDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(securityDelayInteractor, "securityDelayInteractor");
        this.f184722l = securityDelayDataSource;
        this.f184723m = juniorDataSource;
        this.f184724n = securityDelayInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r5.f184722l.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kkf.d6
            if (r0 == 0) goto L13
            r0 = r7
            kkf.d6 r0 = (kkf.d6) r0
            int r1 = r0.f184644w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184644w = r1
            goto L18
        L13:
            kkf.d6 r0 = new kkf.d6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184644w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L46
        L36:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f85465a
            r0.f184644w = r4
            ufm.d r7 = r5.f184724n
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            r0.f184644w = r3
            klf.c2 r6 = r5.f184722l
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.h6.Z2(com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r5.f184722l.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kkf.e6
            if (r0 == 0) goto L13
            r0 = r7
            kkf.e6 r0 = (kkf.e6) r0
            int r1 = r0.f184659w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184659w = r1
            goto L18
        L13:
            kkf.e6 r0 = new kkf.e6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184659w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L46
        L36:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f85465a
            r0.f184659w = r4
            ufm.d r7 = r5.f184724n
            java.lang.Object r6 = r7.b(r6, r0)
            if (r6 != r1) goto L46
            goto L50
        L46:
            r0.f184659w = r3
            klf.c2 r6 = r5.f184722l
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.h6.b3(com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r3, java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData
            r1 = 0
            if (r0 == 0) goto L8
            com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData r3 = (com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 != 0) goto Le
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        Le:
            int r0 = r4.hashCode()
            switch(r0) {
                case -1557685541: goto L57;
                case -130886287: goto L36;
                case 1011869043: goto L26;
                case 2118173210: goto L16;
                default: goto L15;
            }
        L15:
            goto L5f
        L16:
            java.lang.String r0 = "SECURITY_DELAY_BANNER_VERIFY_BUTTON_ID"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L1f
            goto L5f
        L1f:
            gim.c r5 = (gim.c) r5
            java.lang.Object r3 = r2.b3(r3, r5)
            return r3
        L26:
            java.lang.String r0 = "SECURITY_DELAY_BANNER_START_BUTTON_ID"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2f
            goto L5f
        L2f:
            gim.c r5 = (gim.c) r5
            java.lang.Object r3 = r2.d3(r3, r5)
            return r3
        L36:
            java.lang.String r5 = "SECURITY_DELAY_BANNER_LEARN_MORE_BUTTON_ID"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3f
            goto L5f
        L3f:
            rtc.a r4 = new rtc.a
            com.revolut.feature.security_hub.api.navigation.SecurityDelayType$Transaction r5 = new com.revolut.feature.security_hub.api.navigation.SecurityDelayType$Transaction
            java.lang.String r3 = r3.f85466b
            r5.<init>(r3)
            r4.<init>(r5)
            com.revolut.kompot.navigable.vc.ViewController r3 = r2.o2(r4)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r4 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            r5 = 2
            yji.n.P2(r2, r3, r4, r1, r5)
            r3 = 1
            goto L60
        L57:
            java.lang.String r0 = "SECURITY_DELAY_BANNER_CANCEL_BUTTON_ID"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L65
        L5f:
            r3 = 0
        L60:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L65:
            gim.c r5 = (gim.c) r5
            java.lang.Object r3 = r2.Z2(r3, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.h6.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final cmf.p c3() {
        return new cmf.p(vkm.q.Q(this.f184723m.a(), new m5(null, this, 1)), new chc.c0(23), zhm.u.c(this), "SecurityDelay");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r5.f184722l.a(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kkf.g6
            if (r0 == 0) goto L13
            r0 = r7
            kkf.g6 r0 = (kkf.g6) r0
            int r1 = r0.f184702w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184702w = r1
            goto L18
        L13:
            kkf.g6 r0 = new kkf.g6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184702w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L4d
        L36:
            yhm.o.b(r7)
            java.lang.String r7 = r6.f85465a
            com.revolut.feature.security_hub.api.navigation.SecurityDelayType$Transaction r2 = new com.revolut.feature.security_hub.api.navigation.SecurityDelayType$Transaction
            java.lang.String r6 = r6.f85466b
            r2.<init>(r6)
            r0.f184702w = r4
            ufm.d r6 = r5.f184724n
            java.lang.Object r6 = r6.m(r7, r2, r0)
            if (r6 != r1) goto L4d
            goto L57
        L4d:
            r0.f184702w = r3
            klf.c2 r6 = r5.f184722l
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.h6.d3(com.revolut.feature.security_hub.api.provider.SecurityDelayBannerActionData, gim.c):java.lang.Object");
    }
}
