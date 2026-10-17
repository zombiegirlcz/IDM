package i23;

import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends yji.n implements j23.m {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OrderNewCardTabControllerContract$InputData f157831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zf8.k f157832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ic8.a f157833n;
    public final wf8.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f157834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k93.b f157835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hy2.f f157836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f157837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uq8.a f157838t;

    public n(OrderNewCardTabControllerContract$InputData inputData, zf8.k juniorAccountInfoProvider, ic8.a juniorCardCommandsFactory, wf8.c juniorAccountDialogProvider, j60.a bottomDialogExtension, k93.b issueVirtualCardExtension, hy2.f cardDesignInteractor, wj0.a idempotencyKeyHolder, uq8.a juniorTransferCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorCardCommandsFactory, "juniorCardCommandsFactory");
        Intrinsics.checkNotNullParameter(juniorAccountDialogProvider, "juniorAccountDialogProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(issueVirtualCardExtension, "issueVirtualCardExtension");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(juniorTransferCommandFactory, "juniorTransferCommandFactory");
        this.f157831l = inputData;
        this.f157832m = juniorAccountInfoProvider;
        this.f157833n = juniorCardCommandsFactory;
        this.o = juniorAccountDialogProvider;
        this.f157834p = bottomDialogExtension;
        this.f157835q = issueVirtualCardExtension;
        this.f157836r = cardDesignInteractor;
        this.f157837s = idempotencyKeyHolder;
        this.f157838t = juniorTransferCommandFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Z2(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i23.g
            if (r0 == 0) goto L13
            r0 = r7
            i23.g r0 = (i23.g) r0
            int r1 = r0.f157819x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157819x = r1
            goto L18
        L13:
            i23.g r0 = new i23.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157819x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.String r6 = r0.u
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L51
        L2a:
            r6 = move-exception
            goto L78
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            zf8.k r7 = r5.f157832m     // Catch: java.lang.Throwable -> L2a
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L2a
            ax9.o r7 = zf8.k.d(r7, r2)     // Catch: java.lang.Throwable -> L2a
            r2 = 3
            jhi.b r7 = mo3.a.g(r7, r4, r4, r2)     // Catch: java.lang.Throwable -> L2a
            r0.u = r6     // Catch: java.lang.Throwable -> L2a
            r0.f157819x = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = vkm.q.z(r7, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L51
            return r1
        L51:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L2a
            if (r7 != 0) goto L56
            return r4
        L56:
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L2a
        L5c:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L72
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L2a
            r1 = r0
            psg.a r1 = (psg.a) r1     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r1.f239484a     // Catch: java.lang.Throwable -> L2a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r6)     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L5c
            goto L73
        L72:
            r0 = r4
        L73:
            psg.a r0 = (psg.a) r0     // Catch: java.lang.Throwable -> L2a
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto L7e
        L78:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r6)
        L7e:
            boolean r6 = r0 instanceof yhm.n
            if (r6 == 0) goto L83
            goto L84
        L83:
            r4 = r0
        L84:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.n.Z2(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(wf8.b r8, java.lang.Object r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof i23.h
            if (r0 == 0) goto L13
            r0 = r10
            i23.h r0 = (i23.h) r0
            int r1 = r0.f157821x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157821x = r1
            goto L18
        L13:
            i23.h r0 = new i23.h
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157821x
            j23.f r3 = j23.f.f170665a
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            i23.n r8 = r0.u
            yhm.o.b(r10)
            goto L6d
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            j60.a r10 = r7.f157834p
            r2 = 0
            r5 = 0
            r6 = 2
            j60.a.v(r10, r2, r5, r6)
            int[] r10 = i23.f.f157817b
            int r8 = r8.ordinal()
            r8 = r10[r8]
            if (r8 == r4) goto L7d
            if (r8 != r6) goto L77
            boolean r8 = r9 instanceof wf8.a
            if (r8 == 0) goto L51
            wf8.a r9 = (wf8.a) r9
            goto L52
        L51:
            r9 = r5
        L52:
            if (r9 != 0) goto L55
            return r3
        L55:
            vf8.b r8 = r9.f297021a
            psg.a r8 = r8.f288535a
            java.lang.String r8 = r8.f239484a
            kc8.a r9 = r9.f297022b
            r0.u = r7
            r0.f157821x = r4
            ic8.a r10 = r7.f157833n
            nc8.d r10 = (nc8.d) r10
            java.lang.Object r10 = r10.b(r8, r5, r9, r0)
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r8 = r7
        L6d:
            com.revolut.retail.core.navigation.NaviCommand r10 = (com.revolut.retail.core.navigation.NaviCommand) r10
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r10)
            r8.A2(r9)
            return r3
        L77:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L7d:
            com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$Creation r8 = new com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$Creation
            r9 = 3
            r8.<init>(r5, r9)
            r7.A2(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.n.b3(wf8.b, java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // j23.m
    public final Object c(Object obj2, String str, Continuation continuation) {
        Object next;
        Iterator<E> it8 = wf8.b.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (a0.H(str, ((wf8.b) next).name(), false)) {
                break;
            }
        }
        wf8.b bVar = (wf8.b) next;
        return Intrinsics.f(str, "NEW_JUNIOR_CARD_LIST_ID") ? c3((gim.c) continuation) : Intrinsics.f(str, "NEW_JUNIOR_VIRTUAL_CARD_LIST_ID") ? d3((gim.c) continuation) : bVar != null ? b3(bVar, obj2, (gim.c) continuation) : j23.g.f170666a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof i23.i
            if (r0 == 0) goto L13
            r0 = r8
            i23.i r0 = (i23.i) r0
            int r1 = r0.f157822w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157822w = r1
            goto L18
        L13:
            i23.i r0 = new i23.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157822w
            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData r3 = r7.f157831l
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r8)
            goto L7b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            yhm.o.b(r8)
            goto L61
        L3b:
            yhm.o.b(r8)
            return r8
        L3f:
            yhm.o.b(r8)
            com.revolut.feature.card_order_new.api.CardOrderAccountWrapper r8 = r3.f65113c
            boolean r2 = r8 instanceof com.revolut.feature.card_order_new.api.CardOrderAccountWrapper.Junior
            if (r2 != 0) goto L54
            kc8.a r8 = kc8.a.PHYSICAL
            r0.f157822w = r6
            java.lang.Object r8 = r7.f3(r8, r0)
            if (r8 != r1) goto L53
            goto L7a
        L53:
            return r8
        L54:
            com.revolut.feature.card_order_new.api.CardOrderAccountWrapper$Junior r8 = (com.revolut.feature.card_order_new.api.CardOrderAccountWrapper.Junior) r8
            java.lang.String r8 = r8.f64934b
            r0.f157822w = r5
            java.io.Serializable r8 = r7.Z2(r8, r0)
            if (r8 != r1) goto L61
            goto L7a
        L61:
            psg.a r8 = (psg.a) r8
            if (r8 != 0) goto L68
            j23.g r8 = j23.g.f170666a
            return r8
        L68:
            java.lang.String r8 = r8.f239484a
            com.revolut.retail.core.navigation.NaviCommand r2 = r3.d
            kc8.a r3 = kc8.a.PHYSICAL
            r0.f157822w = r4
            ic8.a r4 = r7.f157833n
            nc8.d r4 = (nc8.d) r4
            java.lang.Object r8 = r4.b(r8, r2, r3, r0)
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = zh9.u0.b(r8)
            r7.A2(r8)
            j23.f r8 = j23.f.f170665a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.n.c3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f9, code lost:
    
        if (r0 == r8) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r16) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.n.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e3(java.lang.String r21, gim.c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof i23.l
            if (r2 == 0) goto L17
            r2 = r1
            i23.l r2 = (i23.l) r2
            int r3 = r2.f157829w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f157829w = r3
            goto L1c
        L17:
            i23.l r2 = new i23.l
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f157829w
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto L6b
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            r18 = 0
            r19 = 4032(0xfc0, float:5.65E-42)
            hy2.f r7 = r0.f157836r
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r8 = r21
            efm.r r1 = hx2.c.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            hy2.b r4 = new hy2.b
            r7 = 23
            r4.<init>(r7)
            efm.r r1 = m70.a.g(r1, r6, r4, r5)
            efm.d0 r1 = r1.firstOrError()
            java.lang.String r4 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r2.f157829w = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L6b
            return r3
        L6b:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L7b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof e93.e
            if (r4 == 0) goto L7b
            r2.add(r3)
            goto L7b
        L8d:
            java.util.Iterator r1 = r2.iterator()
        L91:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r1.next()
            r4 = r3
            e93.e r4 = (e93.e) r4
            b93.b r4 = r4.f123843c
            b93.a r5 = b93.b.Companion
            r5.getClass()
            b93.b r5 = b93.b.O
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L91
            r6 = r3
        Lae:
            e93.e r6 = (e93.e) r6
            if (r6 != 0) goto Lc3
            java.lang.Object r1 = zhm.d0.o0(r2)
            e93.e r1 = (e93.e) r1
            if (r1 == 0) goto Lbb
            return r1
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Virtual card design is null"
            r1.<init>(r2)
            throw r1
        Lc3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.n.e3(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(kc8.a r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof i23.m
            if (r0 == 0) goto L13
            r0 = r7
            i23.m r0 = (i23.m) r0
            int r1 = r0.f157830w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f157830w = r1
            goto L18
        L13:
            i23.m r0 = new i23.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f157830w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L63
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            int[] r7 = i23.f.f157816a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            wf8.c r7 = r5.o
            r2 = 0
            if (r6 == r3) goto L4f
            r4 = 2
            if (r6 != r4) goto L49
            ag8.e r7 = (ag8.e) r7
            jhi.k r6 = r7.c(r2)
            goto L55
        L49:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L4f:
            ag8.e r7 = (ag8.e) r7
            jhi.k r6 = r7.b(r2)
        L55:
            r7 = 3
            jhi.b r6 = mo3.a.g(r6, r2, r2, r7)
            r0.f157830w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            rp0.y r7 = (rp0.y) r7
            j23.f r6 = j23.f.f170665a
            if (r7 != 0) goto L6a
            goto L8f
        L6a:
            java.util.List r0 = r7.f256217a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof com.revolut.core.ui_kit.delegates.RowDelegate.Model
            if (r3 == 0) goto L77
            r1.add(r2)
            goto L77
        L89:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L90
        L8f:
            return r6
        L90:
            j60.a r0 = r5.f157834p
            r0.x(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.n.f3(kc8.a, gim.c):java.lang.Object");
    }
}
