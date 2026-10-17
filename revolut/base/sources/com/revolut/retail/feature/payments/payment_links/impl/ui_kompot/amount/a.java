package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount;

import aw0.f4;
import b8k.i;
import c8k.f;
import cli.g;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import gs.n;
import hx7.e;
import j9i.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ldd.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.t0;
import xv4.o;
import y66.p;
import y7k.c0;
import y7k.g0;
import y7k.h0;
import y7k.m0;
import y7k.r;
import y7k.s;
import y7k.y;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements y {

    @NotNull
    private static final h0 Companion = new h0();
    public final n60.a A;
    public final d B;
    public final l2j.a C;
    public final b D;
    public final w80.b E;
    public final f F;
    public final i G;
    public final cli.y H;
    public final com.revolut.kompot.navigable.vc.modal.a I;
    public final PaymentLinksAmountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b8k.d f102208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y7k.f f102209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o8k.a f102210r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zof.f f102211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a8k.d f102212t;
    public final p8k.a u;
    public final n8k.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n8k.f f102213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n5k.b f102214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s5k.a f102215y;
    public final xdk.b z;

    public a(PaymentLinksAmountScreenContract$InputData inputData, b8k.d interactor, y7k.f router, o8k.a transferDataObserver, zof.f transferFeatureScreensProvider, a8k.d extraDataExtension, p8k.a validatorExtension, n8k.a transferExtension, n8k.f transferResultExtension, n5k.b paymentFeesDialogExtension, s5k.a transferWalletLimitsExtension, xdk.b pocketExtension, n60.a keyboardExtension, d reactionsKeyboardViewExtension, l2j.a currencyChooserFlowFactory, b focusRequesterDelegate, w80.b amountFormatter, f bottomSheetsMapper, i paymentLinksExchangeGlobalAccessModelExtension, c0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(extraDataExtension, "extraDataExtension");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(paymentFeesDialogExtension, "paymentFeesDialogExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(reactionsKeyboardViewExtension, "reactionsKeyboardViewExtension");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(bottomSheetsMapper, "bottomSheetsMapper");
        Intrinsics.checkNotNullParameter(paymentLinksExchangeGlobalAccessModelExtension, "paymentLinksExchangeGlobalAccessModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f102208p = interactor;
        this.f102209q = router;
        this.f102210r = transferDataObserver;
        this.f102211s = transferFeatureScreensProvider;
        this.f102212t = extraDataExtension;
        this.u = validatorExtension;
        this.v = transferExtension;
        this.f102213w = transferResultExtension;
        this.f102214x = paymentFeesDialogExtension;
        this.f102215y = transferWalletLimitsExtension;
        this.z = pocketExtension;
        this.A = keyboardExtension;
        this.B = reactionsKeyboardViewExtension;
        this.C = currencyChooserFlowFactory;
        this.D = focusRequesterDelegate;
        this.E = amountFormatter;
        this.F = bottomSheetsMapper;
        this.G = paymentLinksExchangeGlobalAccessModelExtension;
        hrf.f f102201c = inputData.getF102201c();
        f0 f0Var = f0.f322471a;
        this.H = mra.d.b(this, new r(f102201c, null, new s(null, 0L, false, f0Var, new hrf.h(f0Var, f0Var, null), null), 0), stateMapper, null, false, 12);
        this.I = e.a(this, new xwd.a(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof y7k.i0
            if (r0 == 0) goto L13
            r0 = r8
            y7k.i0 r0 = (y7k.i0) r0
            int r1 = r0.f311555w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311555w = r1
            goto L18
        L13:
            y7k.i0 r0 = new y7k.i0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311555w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L4e
        L36:
            yhm.o.b(r8)
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r8 = r7.N2()
            xdk.b r2 = r7.z
            com.revolut.core.model.account.AccountId r5 = r8.e
            com.revolut.feature.transfer.core.models.FundingSource r8 = r8.d
            xi0.b r6 = r8.f92241b
            r0.f311555w = r4
            java.lang.Object r8 = r2.Z2(r5, r6, r8, r0)
            if (r8 != r1) goto L4e
            goto L5e
        L4e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L60
            r0.f311555w = r3
            java.lang.Object r7 = r7.P2(r0)
            if (r7 != r1) goto L5f
        L5e:
            return r1
        L5f:
            return r7
        L60:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.I2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a r8, gim.c r9) {
        /*
            n8k.f r0 = r8.f102213w
            boolean r1 = r9 instanceof y7k.l0
            if (r1 == 0) goto L16
            r1 = r9
            y7k.l0 r1 = (y7k.l0) r1
            int r2 = r1.f311558w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f311558w = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            y7k.l0 r1 = new y7k.l0
            r1.<init>(r8, r9)
            goto L14
        L1c:
            java.lang.Object r9 = r7.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.f311558w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L56
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            y7k.e0 r4 = new y7k.e0
            r9 = 0
            r4.<init>(r8, r9)
            y7k.f0 r5 = new y7k.f0
            r5.<init>(r8, r9)
            y7k.k0 r6 = new y7k.k0
            r9 = 0
            r2 = 1
            r6.<init>(r8, r9, r2)
            r7.f311558w = r3
            tji.f r2 = r8.X()
            r3 = 0
            java.lang.Object r9 = n14.k.P(r2, r3, r4, r5, r6, r7)
            if (r9 != r1) goto L56
            return r1
        L56:
            nii.e r9 = (nii.e) r9
            boolean r1 = r9 instanceof nii.c
            if (r1 == 0) goto L7d
            nii.c r9 = (nii.c) r9
            nii.n1 r9 = r9.f216124b
            y7k.d0 r1 = new y7k.d0
            r2 = 1
            r1.<init>(r8, r2)
            n8k.g r0 = (n8k.g) r0
            r0.getClass()
            java.lang.String r8 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r8)
            java.lang.String r8 = "onFinish"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r8)
            cpf.c r8 = r0.f213509n
            wpf.c r8 = (wpf.c) r8
            r8.Z2(r9, r1)
            goto L98
        L7d:
            boolean r1 = r9 instanceof nii.d
            if (r1 == 0) goto L9b
            nii.d r9 = (nii.d) r9
            nii.n1 r1 = r9.f216134b
            java.lang.Object r9 = r9.f216133a
            if (r1 == 0) goto L98
            if (r9 == 0) goto L98
            n8k.k r9 = (n8k.k) r9
            y7k.d0 r2 = new y7k.d0
            r3 = 2
            r2.<init>(r8, r3)
            n8k.g r0 = (n8k.g) r0
            r0.c3(r1, r9, r2)
        L98:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L9b:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.J2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a, gim.c):java.lang.Object");
    }

    public static final dj0.d K2(a aVar, String str) {
        PaymentLinksTransferData paymentLinksTransferDataN2 = aVar.N2();
        long jK = paymentLinksTransferDataN2.f102234a;
        xi0.b bVar = paymentLinksTransferDataN2.f102235b;
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(str);
        if (bVar.c() != bVarA.c()) {
            jK = (jK / cp5.d.k(bVar)) * cp5.d.k(bVarA);
        }
        return new dj0.d(jK, bVarA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r5.M2(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof y7k.n0
            if (r0 == 0) goto L13
            r0 = r6
            y7k.n0 r0 = (y7k.n0) r0
            int r1 = r0.f311560w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311560w = r1
            goto L18
        L13:
            y7k.n0 r0 = new y7k.n0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311560w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L76
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L4a
        L36:
            yhm.o.b(r6)
            b8k.i r6 = r5.G
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r2 = r5.N2()
            xi0.b r2 = r2.f102235b
            r0.f311560w = r4
            java.lang.Object r6 = r6.b3(r2, r0)
            if (r6 != r1) goto L4a
            goto L75
        L4a:
            b8k.h r6 = (b8k.h) r6
            boolean r2 = r6 instanceof b8k.f
            if (r2 == 0) goto L65
            com.revolut.kompot.navigable.vc.modal.a r5 = r5.I
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$ModalStep$ExchangeGlobalAccessStep r0 = new com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$ModalStep$ExchangeGlobalAccessStep
            b8k.f r6 = (b8k.f) r6
            bla.c r1 = r6.f13280a
            b8k.e r6 = r6.f13281b
            r0.<init>(r6, r1)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r6 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r5, r0, r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L65:
            b8k.g r2 = b8k.g.f13282a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r6 == 0) goto L79
            r0.f311560w = r3
            java.lang.Object r5 = r5.M2(r0)
            if (r5 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L79:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.L2(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        b bVar = this.D;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        l2(new m0(this, null, 2), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof y7k.j0
            if (r0 == 0) goto L14
            r0 = r8
            y7k.j0 r0 = (y7k.j0) r0
            int r1 = r0.f311556w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f311556w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            y7k.j0 r0 = new y7k.j0
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f311556w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r8)
            goto L54
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            yhm.o.b(r8)
            y7k.e0 r3 = new y7k.e0
            r8 = 1
            r3.<init>(r7, r8)
            y7k.f0 r4 = new y7k.f0
            r4.<init>(r7, r8)
            y7k.k0 r5 = new y7k.k0
            r8 = 0
            r1 = 0
            r5.<init>(r7, r8, r1)
            r6.f311556w = r2
            tji.f r1 = r7.X()
            r2 = 0
            java.lang.Object r8 = n14.k.P(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L54
            return r0
        L54:
            nii.e r8 = (nii.e) r8
            boolean r0 = r8 instanceof nii.c
            n8k.f r1 = r7.f102213w
            if (r0 == 0) goto L7d
            nii.c r8 = (nii.c) r8
            nii.n1 r8 = r8.f216124b
            y7k.d0 r0 = new y7k.d0
            r2 = 6
            r0.<init>(r7, r2)
            n8k.g r1 = (n8k.g) r1
            r1.getClass()
            java.lang.String r2 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            java.lang.String r2 = "onFinish"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            cpf.c r1 = r1.f213509n
            wpf.c r1 = (wpf.c) r1
            r1.Z2(r8, r0)
            goto L96
        L7d:
            boolean r0 = r8 instanceof nii.d
            if (r0 == 0) goto L99
            nii.d r8 = (nii.d) r8
            java.lang.Object r0 = r8.f216133a
            n8k.k r0 = (n8k.k) r0
            if (r0 == 0) goto L96
            nii.n1 r8 = r8.f216134b
            y7k.d0 r2 = new y7k.d0
            r3 = 0
            r2.<init>(r7, r3)
            n8k.g r1 = (n8k.g) r1
            r1.c3(r8, r0, r2)
        L96:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L99:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.M2(gim.c):java.lang.Object");
    }

    public final PaymentLinksTransferData N2() {
        PaymentLinksTransferData paymentLinksTransferData = ((r) ((j2) this.H.f22677a).getValue()).f311569b;
        if (paymentLinksTransferData != null) {
            return paymentLinksTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void O2(Function1 function1) {
        H2(this.H, new g0(function1, this, 0));
    }

    @Override // yji.l
    public final void P1() {
        H2(this.H, new p(15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof y7k.t0
            if (r0 == 0) goto L13
            r0 = r10
            y7k.t0 r0 = (y7k.t0) r0
            int r1 = r0.f311579w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311579w = r1
            goto L18
        L13:
            y7k.t0 r0 = new y7k.t0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311579w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L89
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            yhm.o.b(r10)
            goto L48
        L36:
            yhm.o.b(r10)
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r10 = r9.N2()
            r0.f311579w = r4
            b8k.d r2 = r9.f102208p
            java.lang.Object r10 = r2.c(r10, r0)
            if (r10 != r1) goto L48
            goto L88
        L48:
            krf.f r10 = (krf.f) r10
            java.util.ArrayList r2 = r10.f188864a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L53
            goto La1
        L53:
            r0.f311579w = r3
            com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData r2 = r9.N2()
            y7k.f r3 = r9.f102209q
            r3.getClass()
            java.lang.String r3 = "transferData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "reasonConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r3)
            com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData r3 = new com.revolut.feature.transfer.core.api.reason.ReasonForTransferInputData
            com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails$Link r5 = new com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails$Link
            long r6 = r2.f102234a
            xi0.b r8 = r2.f102235b
            java.lang.String r2 = r2.f
            r5.<init>(r6, r2, r8)
            r3.<init>(r5, r10, r4)
            zof.f r10 = r9.f102211s
            qpf.h r10 = (qpf.h) r10
            zof.a r10 = r10.a(r3)
            com.revolut.kompot.navigable.flow.BaseFlow r10 = (com.revolut.kompot.navigable.flow.BaseFlow) r10
            java.lang.Object r10 = yji.l.k2(r9, r10, r0)
            if (r10 != r1) goto L89
        L88:
            return r1
        L89:
            bpf.c r10 = (bpf.c) r10
            boolean r0 = r10 instanceof bpf.a
            if (r0 == 0) goto L91
            r4 = 0
            goto La1
        L91:
            boolean r0 = r10 instanceof bpf.b
            if (r0 == 0) goto La6
            y1.a r0 = new y1.a
            bpf.b r10 = (bpf.b) r10
            r1 = 26
            r0.<init>(r10, r1)
            r9.O2(r0)
        La1:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            return r10
        La6:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.P2(gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(new t0(this.H.B(new p(14)), 1), new n(continuation, this, 5)), null, new o(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.H;
    }
}
