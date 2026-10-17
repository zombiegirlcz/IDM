package rrc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements wpc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f256791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s70.a f256792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vpc.a f256793c;
    public final f01.c d;
    public final wsg.n e;
    public final zxd.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vyd.a f256794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0e.b f256795h;
    public final tqi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final hk0.a f256796j;
    public final kbb.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wda.b f256797l;

    public q(ang.f userInteractor, s70.a intentProvider, vpc.a salarySwitchInteractor, f01.c uiKitResources, wsg.n walletInteractor, zxd.c statementsInteractor, vyd.a dialogModelConfigurationFactory, n0e.b statementsNaviCommandFactory, zk0.b fileSystemRepository, tqi.g shareNaviCommandFactory, hk0.a networkFileRepository, kbb.c accountDetailsInteractor, wda.b accountDetailsCommonMapper) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(salarySwitchInteractor, "salarySwitchInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandFactory, "statementsNaviCommandFactory");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsCommonMapper, "accountDetailsCommonMapper");
        this.f256791a = userInteractor;
        this.f256792b = intentProvider;
        this.f256793c = salarySwitchInteractor;
        this.d = uiKitResources;
        this.e = walletInteractor;
        this.f = statementsInteractor;
        this.f256794g = dialogModelConfigurationFactory;
        this.f256795h = statementsNaviCommandFactory;
        this.i = shareNaviCommandFactory;
        this.f256796j = networkFileRepository;
        this.k = accountDetailsInteractor;
        this.f256797l = accountDetailsCommonMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dda.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rrc.a
            if (r0 == 0) goto L13
            r0 = r6
            rrc.a r0 = (rrc.a) r0
            int r1 = r0.f256750x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256750x = r1
            goto L18
        L13:
            rrc.a r0 = new rrc.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256750x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dda.d r5 = r0.u
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
            r0.f256750x = r3
            java.lang.Object r6 = r4.o(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r6 = (java.lang.String) r6
            int r0 = com.revolut.feature.salary_switch.impl.R$string.salary_switch_email_subject
            java.util.List r6 = zhm.u.c(r6)
            java.lang.String r6 = r4.m(r0, r6)
            wda.b r0 = r4.f256797l
            java.lang.String r5 = r0.g(r5)
            int r0 = com.revolut.feature.salary_switch.impl.R$string.salary_switch_share_details_message_title
            java.util.List r5 = zhm.u.c(r5)
            java.lang.String r5 = r4.m(r0, r5)
            trc.a r0 = new trc.a
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.a(dda.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dda.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rrc.b
            if (r0 == 0) goto L13
            r0 = r6
            rrc.b r0 = (rrc.b) r0
            int r1 = r0.f256755x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256755x = r1
            goto L18
        L13:
            rrc.b r0 = new rrc.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256755x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dda.d r5 = r0.u
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
            r0.f256755x = r3
            java.lang.Object r6 = r4.o(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.String r6 = (java.lang.String) r6
            int r0 = com.revolut.feature.salary_switch.impl.R$string.salary_switch_email_subject
            java.util.List r1 = zhm.u.c(r6)
            java.lang.String r0 = r4.m(r0, r1)
            wda.b r1 = r4.f256797l
            java.lang.String r5 = r1.g(r5)
            int r1 = com.revolut.feature.salary_switch.impl.R$string.salary_switch_email_body
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.util.List r5 = zhm.v.k(r5)
            java.lang.String r5 = r4.m(r1, r5)
            trc.a r6 = new trc.a
            r6.<init>(r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.b(dda.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dda.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rrc.c
            if (r0 == 0) goto L13
            r0 = r6
            rrc.c r0 = (rrc.c) r0
            int r1 = r0.f256757w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256757w = r1
            goto L18
        L13:
            rrc.c r0 = new rrc.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256757w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f256757w = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            trc.a r6 = (trc.a) r6
            java.lang.String r5 = r6.f273778a
            java.lang.String r6 = r6.f273779b
            s70.a r0 = r4.f256792b
            s70.b r0 = (s70.b) r0
            android.content.Intent r5 = r0.f(r5, r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.c(dda.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(dda.d r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rrc.d
            if (r0 == 0) goto L13
            r0 = r6
            rrc.d r0 = (rrc.d) r0
            int r1 = r0.f256759w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256759w = r1
            goto L18
        L13:
            rrc.d r0 = new rrc.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256759w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f256759w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            trc.a r6 = (trc.a) r6
            java.lang.String r5 = r6.f273778a
            java.lang.String r6 = r6.f273779b
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            s70.a r1 = r4.f256792b
            s70.b r1 = (s70.b) r1
            android.content.Intent r5 = r1.d(r5, r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.d(dda.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xi0.b r22, tji.f r23, boolean r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.e(xi0.b, tji.f, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(xi0.b r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.f(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rrc.i
            if (r0 == 0) goto L13
            r0 = r6
            rrc.i r0 = (rrc.i) r0
            int r1 = r0.f256777w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256777w = r1
            goto L18
        L13:
            rrc.i r0 = new rrc.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256777w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            if (r5 == 0) goto L3e
            xi0.a r6 = xi0.b.Companion
            r6.getClass()
            xi0.b r5 = xi0.a.a(r5)
            return r5
        L3e:
            wsg.n r5 = r4.e
            com.revolut.core.model.account.AccountId$Personal r6 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r5 = r5.x(r6)
            r0.f256777w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            xi0.b r6 = (xi0.b) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.g(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rrc.j
            if (r0 == 0) goto L13
            r0 = r9
            rrc.j r0 = (rrc.j) r0
            int r1 = r0.f256780w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256780w = r1
            goto L18
        L13:
            rrc.j r0 = new rrc.j
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256780w
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r9)
            goto L73
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            goto L55
        L3a:
            yhm.o.b(r9)
            goto L4a
        L3e:
            yhm.o.b(r9)
            r0.f256780w = r4
            java.io.Serializable r9 = r7.g(r8, r0)
            if (r9 != r1) goto L4a
            goto L72
        L4a:
            xi0.b r9 = (xi0.b) r9
            r0.f256780w = r5
            java.lang.Object r9 = r7.f(r9, r0)
            if (r9 != r1) goto L55
            goto L72
        L55:
            dda.d r9 = (dda.d) r9
            if (r9 != 0) goto L6a
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Salary switch details were null while trying to share account details"
            r8.<init>(r9)
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r6, r6, r8, r9)
            return r6
        L6a:
            r0.f256780w = r3
            java.lang.Object r9 = r7.d(r9, r0)
            if (r9 != r1) goto L73
        L72:
            return r1
        L73:
            android.content.Intent r9 = (android.content.Intent) r9
            com.revolut.kompot.common.ExternalDestination$ByIntent r8 = new com.revolut.kompot.common.ExternalDestination$ByIntent
            r8.<init>(r9, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.h(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, tji.f r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof rrc.k
            if (r0 == 0) goto L13
            r0 = r8
            rrc.k r0 = (rrc.k) r0
            int r1 = r0.f256783y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256783y = r1
            goto L18
        L13:
            rrc.k r0 = new rrc.k
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f256781w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256783y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            rrc.q r6 = r0.v
            tji.f r7 = r0.u
            yhm.o.b(r8)
            goto L4b
        L3a:
            yhm.o.b(r8)
            r0.u = r7
            r0.v = r5
            r0.f256783y = r4
            java.io.Serializable r8 = r5.g(r6, r0)
            if (r8 != r1) goto L4a
            goto L5b
        L4a:
            r6 = r5
        L4b:
            xi0.b r8 = (xi0.b) r8
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f256783y = r3
            r2 = 0
            java.lang.Object r6 = r6.e(r8, r7, r2, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.i(java.lang.String, tji.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r7, tji.f r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof rrc.l
            if (r0 == 0) goto L13
            r0 = r9
            rrc.l r0 = (rrc.l) r0
            int r1 = r0.f256785x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256785x = r1
            goto L18
        L13:
            rrc.l r0 = new rrc.l
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256785x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r9)
            return r9
        L39:
            tji.f r8 = r0.u
            yhm.o.b(r9)
            goto L4d
        L3f:
            yhm.o.b(r9)
            r0.u = r8
            r0.f256785x = r5
            java.io.Serializable r9 = r6.g(r7, r0)
            if (r9 != r1) goto L4d
            goto L83
        L4d:
            xi0.b r9 = (xi0.b) r9
            java.lang.String r7 = r9.f306286a
            vpc.a r2 = r6.f256793c
            aqc.h r2 = (aqc.h) r2
            r2.getClass()
            java.lang.String r2 = "baseCurrencyCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r2 = xi0.b.F
            java.lang.String r2 = r2.f306286a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            r2 = 0
            if (r7 == 0) goto L79
            r0.u = r2
            r0.f256785x = r4
            java.lang.Object r7 = r6.e(r9, r8, r5, r0)
            if (r7 != r1) goto L78
            goto L83
        L78:
            return r7
        L79:
            r0.u = r2
            r0.f256785x = r3
            java.lang.Object r7 = r6.k(r9, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.j(java.lang.String, tji.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(xi0.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rrc.m
            if (r0 == 0) goto L13
            r0 = r8
            rrc.m r0 = (rrc.m) r0
            int r1 = r0.f256786w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256786w = r1
            goto L18
        L13:
            rrc.m r0 = new rrc.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256786w
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L43
        L37:
            yhm.o.b(r8)
            r0.f256786w = r3
            java.lang.Object r8 = r6.f(r7, r0)
            if (r8 != r1) goto L43
            goto L60
        L43:
            dda.d r8 = (dda.d) r8
            if (r8 != 0) goto L58
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Salary switch details were null while trying to share account details"
            r7.<init>(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r5, r5, r7, r8)
            return r5
        L58:
            r0.f256786w = r4
            java.lang.Object r8 = r6.c(r8, r0)
            if (r8 != r1) goto L61
        L60:
            return r1
        L61:
            android.content.Intent r8 = (android.content.Intent) r8
            com.revolut.kompot.common.ExternalDestination$ByIntent r7 = new com.revolut.kompot.common.ExternalDestination$ByIntent
            r7.<init>(r8, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.k(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.io.File r7, xi0.b r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof rrc.n
            if (r0 == 0) goto L13
            r0 = r9
            rrc.n r0 = (rrc.n) r0
            int r1 = r0.f256788x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256788x = r1
            goto L18
        L13:
            rrc.n r0 = new rrc.n
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256788x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.io.File r7 = r0.u
            yhm.o.b(r9)
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.io.File r7 = r0.u
            yhm.o.b(r9)
            goto L48
        L3a:
            yhm.o.b(r9)
            r0.u = r7
            r0.f256788x = r4
            java.lang.Object r9 = r6.f(r8, r0)
            if (r9 != r1) goto L48
            goto L68
        L48:
            dda.d r9 = (dda.d) r9
            if (r9 != 0) goto L5e
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Account details are null"
            r7.<init>(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r9 = rd0.d.f253311a
            rd0.c r9 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r9, r0, r0, r7, r8)
            return r0
        L5e:
            r0.u = r7
            r0.f256788x = r3
            java.lang.Object r9 = r6.b(r9, r0)
            if (r9 != r1) goto L69
        L68:
            return r1
        L69:
            trc.a r9 = (trc.a) r9
            java.lang.String r1 = r9.f273778a
            java.lang.String r2 = r9.f273779b
            tqi.c r0 = new tqi.c
            tqi.b r3 = new tqi.b
            int r8 = com.revolut.feature.salary_switch.impl.R$string.salary_switch_share_details_pdf_file_name
            zhm.f0 r9 = zhm.f0.f322471a
            java.lang.String r8 = r6.m(r8, r9)
            java.lang.String r9 = lim.o.n(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r8 = "."
            r4.append(r8)
            r4.append(r9)
            java.lang.String r8 = r4.toString()
            java.lang.String r9 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)
            byte[] r7 = lim.m.d(r7)
            r3.<init>(r8, r7)
            r4 = 0
            r5 = 81
            r0.<init>(r1, r2, r3, r4, r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            tqi.g r8 = r6.i
            java.lang.String r9 = ""
            com.revolut.retail.core.navigation.ActivityNavigateCommand r8 = r8.g(r0, r9)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.l(java.io.File, xi0.b, gim.c):java.lang.Object");
    }

    public final String m(int i, List list) {
        return a10.b.o(i, list, null, 12, this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rrc.o
            if (r0 == 0) goto L13
            r0 = r5
            rrc.o r0 = (rrc.o) r0
            int r1 = r0.f256789w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256789w = r1
            goto L18
        L13:
            rrc.o r0 = new rrc.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256789w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f256791a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f256789w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            java.lang.String r5 = te0.w.I(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.n(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rrc.p
            if (r0 == 0) goto L13
            r0 = r5
            rrc.p r0 = (rrc.p) r0
            int r1 = r0.f256790w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256790w = r1
            goto L18
        L13:
            rrc.p r0 = new rrc.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256790w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L3d
        L27:
            r5 = move-exception
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f256790w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r4.n(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L27
            return r5
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "User legal name was null while trying to share account details"
            r0.<init>(r1, r5)
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r0, r5)
            java.lang.String r5 = ""
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.q.o(gim.c):java.lang.Object");
    }
}
