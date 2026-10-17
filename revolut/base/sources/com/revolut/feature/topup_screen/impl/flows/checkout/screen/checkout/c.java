package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan;
import cvi.i;
import cxe.a0;
import cxe.o;
import cxe.u;
import exe.l;
import fxe.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qwe.s;
import uwe.j;
import vkm.j2;
import vkm.q;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements o {
    public final z1 A;
    public final j2 B;
    public final CheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f90744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cxe.a f90745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rwe.a f90746r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f90747s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fxe.d f90748t;
    public final wj0.a u;
    public final sh3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f90749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f90750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f90751y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public c(n stateMapper, CheckoutScreenContract$InputData inputData, l checkoutContentDelegate, cxe.a bottomSheetFactory, rwe.a checkoutSelectedExtraTopUpAmountDelegate, e checkoutTopUpMethodFeeRelay, fxe.d checkoutTopUpMethodFeeFactory, wj0.a idempotencyKeyHolder, sh3.a checkoutInteractor, j checkoutPrerequisitesExtension, s checkoutSelectedLoyaltyQuoteDelegate) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(checkoutContentDelegate, "checkoutContentDelegate");
        Intrinsics.checkNotNullParameter(bottomSheetFactory, "bottomSheetFactory");
        Intrinsics.checkNotNullParameter(checkoutSelectedExtraTopUpAmountDelegate, "checkoutSelectedExtraTopUpAmountDelegate");
        Intrinsics.checkNotNullParameter(checkoutTopUpMethodFeeRelay, "checkoutTopUpMethodFeeRelay");
        Intrinsics.checkNotNullParameter(checkoutTopUpMethodFeeFactory, "checkoutTopUpMethodFeeFactory");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(checkoutPrerequisitesExtension, "checkoutPrerequisitesExtension");
        Intrinsics.checkNotNullParameter(checkoutSelectedLoyaltyQuoteDelegate, "checkoutSelectedLoyaltyQuoteDelegate");
        this.o = inputData;
        this.f90744p = checkoutContentDelegate;
        this.f90745q = bottomSheetFactory;
        this.f90746r = checkoutSelectedExtraTopUpAmountDelegate;
        this.f90747s = checkoutTopUpMethodFeeRelay;
        this.f90748t = checkoutTopUpMethodFeeFactory;
        this.u = idempotencyKeyHolder;
        this.v = checkoutInteractor;
        this.f90749w = checkoutPrerequisitesExtension;
        this.f90750x = checkoutSelectedLoyaltyQuoteDelegate;
        this.f90751y = mra.d.b(this, new cxe.e(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new cwj.h(this, 1));
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.A = z1VarB;
        this.B = m72.b.y(null, null, true, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof cxe.r
            if (r0 == 0) goto L13
            r0 = r6
            cxe.r r0 = (cxe.r) r0
            int r1 = r0.f109966x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109966x = r1
            goto L18
        L13:
            cxe.r r0 = new cxe.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109966x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.checkout.models.CheckoutOrder r0 = r0.u
            yhm.o.b(r6)
            goto L8e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            cli.y r6 = r5.f90751y
            java.lang.Object r6 = r6.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            cxe.e r6 = (cxe.e) r6
            com.revolut.data.model.Data r6 = r6.f109940a
            java.lang.Object r6 = r6.getContent()
            cxe.b r6 = (cxe.b) r6
            if (r6 != 0) goto L5e
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Checkout content is null"
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L5e:
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order r2 = r6.f109920a
            boolean r4 = r2 instanceof com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order.Checkout
            if (r4 == 0) goto L69
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$Checkout r2 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order.Checkout) r2
            com.revolut.feature.checkout.models.CheckoutOrder r2 = r2.f90710a
            goto L74
        L69:
            boolean r2 = r2 instanceof com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order.ThreeDs
            if (r2 == 0) goto L9b
            com.revolut.feature.checkout.models.CheckoutOrder$a r2 = com.revolut.feature.checkout.models.CheckoutOrder.INSTANCE
            r2.getClass()
            com.revolut.feature.checkout.models.CheckoutOrder r2 = com.revolut.feature.checkout.models.CheckoutOrder.f65846g
        L74:
            sh3.a r4 = r5.v
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget r6 = r6.f109927m
            com.revolut.core.model.account.AccountId r6 = kxe.a.a(r6)
            ei3.m r4 = (ei3.m) r4
            pfm.h r6 = r4.h(r2, r6)
            r0.u = r2
            r0.f109966x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L8d
            return r1
        L8d:
            r0 = r2
        L8e:
            cxe.i r6 = new cxe.i
            pi3.s r0 = r0.f65847a
            r6.<init>(r0)
            r5.C2(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L9b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c.I2(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c, gim.c):java.lang.Object");
    }

    public final void J2() {
        cxe.b bVar = (cxe.b) ((cxe.e) ((j2) this.f90751y.f22677a).getValue()).f109940a.getContent();
        if (bVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Checkout content is null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        dj0.d dVar = bVar.k;
        CheckoutCardPlan checkoutCardPlan = bVar.f109932s;
        C2(new cxe.j(new CheckoutContext(dVar, checkoutCardPlan != null ? checkoutCardPlan.f90756b : null, checkoutCardPlan != null ? checkoutCardPlan.f90755a : null), bVar.f109927m, bVar.f109930q));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K2(cxe.b r14) {
        /*
            r13 = this;
            cxe.l r0 = new cxe.l
            e93.c r1 = r14.f109933t
            r2 = 0
            if (r1 == 0) goto Lb
            java.lang.String r1 = r1.f123824a
            r8 = r1
            goto Lc
        Lb:
            r8 = r2
        Lc:
            e93.j0 r1 = r14.u
            if (r1 != 0) goto L12
        L10:
            r1 = r2
            goto L5e
        L12:
            dj0.d r3 = r1.f123876a
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$InputData r4 = r13.o
            com.revolut.feature.checkout.models.CheckoutParams r4 = r4.f90722a
            boolean r5 = r4 instanceof com.revolut.feature.checkout.models.CheckoutParams.CardOrder
            if (r5 == 0) goto L20
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r4 = (com.revolut.feature.checkout.models.CheckoutParams.CardOrder) r4
            r10 = r4
            goto L21
        L20:
            r10 = r2
        L21:
            if (r10 != 0) goto L24
            goto L10
        L24:
            b93.f r4 = r10.f65850a
            boolean r5 = r4 instanceof b93.g
            if (r5 == 0) goto L2d
            b93.g r4 = (b93.g) r4
            goto L2e
        L2d:
            r4 = r2
        L2e:
            if (r4 != 0) goto L31
            goto L10
        L31:
            boolean r5 = r3.k()
            if (r5 == 0) goto L38
            goto L10
        L38:
            long r2 = r3.f115082a
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            dj0.d r7 = r1.f123877b
            r9 = 1310719(0x13ffff, float:1.836709E-39)
            r3 = r4
            r4 = 0
            r5 = 0
            b93.g r1 = b93.g.a(r3, r4, r5, r6, r7, r8, r9)
            pi3.h r2 = r10.f65851b
            com.revolut.core.model.account.AccountId r3 = r10.f65852c
            java.lang.String r4 = "card"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "accountId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r4 = new com.revolut.feature.checkout.models.CheckoutParams$CardOrder
            r4.<init>(r1, r2, r3)
            r1 = r4
        L5e:
            boolean r2 = r14.d
            boolean r3 = r14.e
            boolean r4 = r14.f
            yt8.i r5 = r14.f109923g
            jxe.l r6 = r14.i
            jxe.m r7 = r14.f109925j
            dj0.d r8 = r14.k
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget r9 = r14.f109927m
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order r10 = r14.f109920a
            java.util.List r11 = r14.f109930q
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.model.CheckoutCardPlan r12 = r14.f109932s
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.C2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c.K2(cxe.b):void");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (j2 > 0) {
            l2(new cxe.y(this, continuation, 2), new yi5.b(26));
        }
        yji.l.b1(this, q.Q(this.A, new i(continuation, this, 3)), null, new cvi.j(this, continuation, 7), 3);
        cw7.j jVar = new cw7.j(7);
        j2 j2Var = this.B;
        yji.l.b1(this, q.q(new u(j2Var, jVar, 0)), null, new co7.c(this, continuation, 16), 3);
        yji.l.b1(this, q.H(new a0(this, continuation, 0), q.q(new u(j2Var, new cw7.j(8), 0))), null, new a0(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f90751y;
    }
}
