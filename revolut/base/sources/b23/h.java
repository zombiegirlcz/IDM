package b23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mm.d f11879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy2.f f11880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k93.a f11881c;
    public final zf8.k d;
    public final wf8.c e;
    public final uq8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i90.b f11882g;

    public h(mm.d actionsDispatcher, hy2.f cardDesignInteractor, k93.a issueVirtualCardActionHandler, zf8.k juniorAccountInfoProvider, wf8.c juniorAccountDialogProvider, uq8.a juniorTransferCommandFactory, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(issueVirtualCardActionHandler, "issueVirtualCardActionHandler");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorAccountDialogProvider, "juniorAccountDialogProvider");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f11879a = actionsDispatcher;
        this.f11880b = cardDesignInteractor;
        this.f11881c = issueVirtualCardActionHandler;
        this.d = juniorAccountInfoProvider;
        this.e = juniorAccountDialogProvider;
        this.f = juniorTransferCommandFactory;
        this.f11882g = uuidUtils;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(b23.h r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof b23.c
            if (r0 == 0) goto L13
            r0 = r6
            b23.c r0 = (b23.c) r0
            int r1 = r0.f11869w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11869w = r1
            goto L18
        L13:
            b23.c r0 = new b23.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f11869w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L45
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            uq8.a r4 = r4.f     // Catch: java.lang.Exception -> L45
            r6 = 0
            rfm.j r4 = r4.a(r5, r6)     // Catch: java.lang.Exception -> L45
            r0.f11869w = r3     // Catch: java.lang.Exception -> L45
            java.lang.Object r6 = nim.a.i(r4, r0)     // Catch: java.lang.Exception -> L45
            if (r6 != r1) goto L42
            return r1
        L42:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6     // Catch: java.lang.Exception -> L45
            return r6
        L45:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r6, r0, r0, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b23.h.a(b23.h, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.card_order_new.api.CardOrderAccountWrapper.Junior r25, n33.w r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b23.h.b(com.revolut.feature.card_order_new.api.CardOrderAccountWrapper$Junior, n33.w, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kc8.a r7, com.revolut.feature.card_order_new.api.CardOrderAccountWrapper.Junior r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof b23.g
            if (r0 == 0) goto L13
            r0 = r9
            b23.g r0 = (b23.g) r0
            int r1 = r0.f11878y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11878y = r1
            goto L18
        L13:
            b23.g r0 = new b23.g
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f11876w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f11878y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.card_order_new.api.CardOrderAccountWrapper$Junior r8 = r0.v
            kc8.a r7 = r0.u
            yhm.o.b(r9)
            goto L57
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r9)
            zf8.k r9 = r6.d
            w4l.h r2 = w4l.h.f294642c
            ax9.o r9 = zf8.k.d(r9, r2)
            axd.e r2 = new axd.e
            r5 = 14
            r2.<init>(r5)
            jhi.b r9 = mo3.a.g(r9, r4, r2, r3)
            r0.u = r7
            r0.v = r8
            r0.f11878y = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L5d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r9.next()
            r1 = r0
            psg.a r1 = (psg.a) r1
            java.lang.String r1 = r1.f239484a
            java.lang.String r2 = r8.f64934b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L5d
            r4 = r0
        L75:
            psg.a r4 = (psg.a) r4
            if (r4 == 0) goto L7f
            n33.m r8 = new n33.m
            r8.<init>(r4, r7)
            return r8
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.f64934b
            java.lang.String r9 = "Wallet("
            java.lang.String r0 = ") not found"
            java.lang.String r8 = p.a.p(r9, r8, r0)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b23.h.c(kc8.a, com.revolut.feature.card_order_new.api.CardOrderAccountWrapper$Junior, gim.c):java.lang.Object");
    }
}
