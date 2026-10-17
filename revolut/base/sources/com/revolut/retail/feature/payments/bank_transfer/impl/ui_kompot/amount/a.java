package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount;

import a83.j0;
import aw0.f4;
import com.revolut.data.model.Data;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import cqh.m;
import dz6.o;
import e38.c;
import e4k.a1;
import e4k.b1;
import e4k.d0;
import e4k.h0;
import e4k.i0;
import e4k.o0;
import e4k.t;
import e4k.u;
import e4k.v;
import e4k.w;
import e4k.x;
import e4k.y0;
import e4k.z;
import g4k.b;
import g4k.g0;
import g4k.q;
import g4k.r;
import g4k.s;
import h4k.k;
import hrf.h;
import java.util.List;
import java.util.Set;
import jki.g;
import jki.p;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import skd.i;
import yji.l;
import zhm.f0;
import zof.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g implements h0 {
    public final b A;
    public final g0 B;
    public final gte.a C;
    public final com.revolut.feature.external_accounts.api.navigation.a D;
    public final j60.a E;
    public final n60.a F;
    public final i1j.a G;
    public final w80.b H;
    public final e I;
    public final ldd.b J;
    public final klg.b K;
    public final i L;
    public final to9.a M;
    public final p5k.a N;
    public final ae5.a O;
    public final x P;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BankTransferAmountScreenContract$InputData f102080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f102081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4k.e f102082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b5k.a f102083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i4k.b f102084t;
    public final x1k.a u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f102085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n5k.b f102086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s5k.a f102087y;
    public final s z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BankTransferAmountScreenContract$InputData inputData, k interactor, e4k.e router, b5k.a transferDataObserver, i4k.b footerMapper, x1k.a feeOptionsInfoDialogProvider, f transferFeatureScreensProvider, q extraDataExtension, n5k.b paymentFeesDialogExtension, s5k.a transferWalletLimitsExtension, s bankTransferChecksExtension, b availableTypesErrorHandlerExtension, g0 missingFiscalCodeErrorModelExtension, gte.a featureToggleInteractor, com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory, j60.a bottomDialogExtension, n60.a keyboardExtension, i1j.a balancesFilterInteractor, w80.b amountFormatter, e dateProvider, ldd.b focusRequesterDelegate, klg.b sendChecksDialogProvider, i slotManagerInteractor, to9.a checksExtension, p5k.a creditCardTransferInterestMapper, ae5.a cryptoConvertDialogDisclaimerExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(feeOptionsInfoDialogProvider, "feeOptionsInfoDialogProvider");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(extraDataExtension, "extraDataExtension");
        Intrinsics.checkNotNullParameter(paymentFeesDialogExtension, "paymentFeesDialogExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(bankTransferChecksExtension, "bankTransferChecksExtension");
        Intrinsics.checkNotNullParameter(availableTypesErrorHandlerExtension, "availableTypesErrorHandlerExtension");
        Intrinsics.checkNotNullParameter(missingFiscalCodeErrorModelExtension, "missingFiscalCodeErrorModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(sendChecksDialogProvider, "sendChecksDialogProvider");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(checksExtension, "checksExtension");
        Intrinsics.checkNotNullParameter(creditCardTransferInterestMapper, "creditCardTransferInterestMapper");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f102080p = inputData;
        this.f102081q = interactor;
        this.f102082r = router;
        this.f102083s = transferDataObserver;
        this.f102084t = footerMapper;
        this.u = feeOptionsInfoDialogProvider;
        this.v = transferFeatureScreensProvider;
        this.f102085w = extraDataExtension;
        this.f102086x = paymentFeesDialogExtension;
        this.f102087y = transferWalletLimitsExtension;
        this.z = bankTransferChecksExtension;
        this.A = availableTypesErrorHandlerExtension;
        this.B = missingFiscalCodeErrorModelExtension;
        this.C = featureToggleInteractor;
        this.D = externalPocketNavigationFactory;
        this.E = bottomDialogExtension;
        this.F = keyboardExtension;
        this.G = balancesFilterInteractor;
        this.H = amountFormatter;
        this.I = dateProvider;
        this.J = focusRequesterDelegate;
        this.K = sendChecksDialogProvider;
        this.L = slotManagerInteractor;
        this.M = checksExtension;
        this.N = creditCardTransferInterestMapper;
        this.O = cryptoConvertDialogDisclaimerExtension;
        f5j.a f102077a = inputData.getF102077a();
        TransferFlowType f102078b = inputData.getF102078b();
        p4k.g gVar = interactor.f149391b;
        f5j.a f102077a2 = interactor.f149390a.getF102077a();
        gVar.getClass();
        this.P = new x(f102077a, f102078b, null, null, p4k.g.c(f102077a2), 0, null, null, new i0(null, zhm.h0.f322473a), false);
    }

    public static final String A2(a aVar, h hVar) {
        int size = hVar.f154817a.size();
        int size2 = hVar.f154818b.size();
        yqi.b bVar = hVar.f154819c;
        String simpleName = bVar != null ? bVar.getClass().getSimpleName() : null;
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("transferErrorsCount=", size, size2, ", balanceErrorsCount=", ", userErrorType=");
        sbW.append(simpleName);
        return sbW.toString();
    }

    public static final Object y2(a aVar, gim.i iVar) {
        z zVarF2 = aVar.F2();
        q qVar = aVar.f102085w;
        BankTransferData transferData = aVar.G2();
        Data availableTypes = zVarF2.f122655a;
        kq2.f fVar = zVarF2.f122656b;
        long j2 = zVarF2.f122657c;
        krf.a aVar2 = ((x) aVar.t2()).f122649h;
        List list = aVar2 != null ? aVar2.f188857b : null;
        if (list == null) {
            list = f0.f322471a;
        }
        List additionalInputsConfig = list;
        Integer num = ((x) aVar.t2()).e;
        r validationData = zVarF2.k;
        Set extraConfigs = aVar.f102080p.getD();
        qVar.getClass();
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(availableTypes, "availableTypes");
        Intrinsics.checkNotNullParameter(additionalInputsConfig, "additionalInputsConfig");
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        Intrinsics.checkNotNullParameter(extraConfigs, "extraConfigs");
        return vkm.q.x(qVar.f140580a.c(transferData, availableTypes, fVar, j2, additionalInputsConfig, num, validationData, extraConfigs), iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a.z2(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B2(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e4k.t0
            if (r0 == 0) goto L13
            r0 = r7
            e4k.t0 r0 = (e4k.t0) r0
            int r1 = r0.f122639x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f122639x = r1
            goto L18
        L13:
            e4k.t0 r0 = new e4k.t0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f122639x
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
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L54
        L38:
            yhm.o.b(r7)
            jki.i r7 = r5.t2()
            e4k.x r7 = (e4k.x) r7
            f5j.a r7 = r7.f122645a
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r2 = r5.G2()
            r0.u = r6
            r0.f122639x = r4
            g4k.s r4 = r5.z
            java.lang.Object r7 = r4.Z2(r7, r2, r6, r0)
            if (r7 != r1) goto L54
            goto L7b
        L54:
            g4k.d0 r7 = (g4k.d0) r7
            boolean r2 = r7 instanceof g4k.c0
            if (r2 != 0) goto L5d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L5d:
            e4k.p0 r2 = new e4k.p0
            g4k.c0 r7 = (g4k.c0) r7
            r4 = 0
            r2.<init>(r7, r4)
            r5.x2(r2)
            e4k.p0 r2 = new e4k.p0
            r4 = 1
            r2.<init>(r7, r4)
            r5.H2(r2)
            r0.u = r6
            r0.f122639x = r3
            java.lang.Object r6 = r5.I2(r0)
            if (r6 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a.B2(boolean, gim.c):java.lang.Object");
    }

    public final void C2() {
        j60.a.v(this.E, false, null, 3);
        z zVar = ((x) t2()).d;
        if ((zVar != null ? zVar.f122660j : null) != null) {
            v2(d0.f122584a);
        }
    }

    public final void D2() {
        w wVar = ((x) t2()).f122648g;
        if (wVar == null || wVar.equals(t.f122637a) || wVar.equals(v.f122642a)) {
            return;
        }
        if (!wVar.equals(u.f122640a)) {
            throw new NoWhenBranchMatchedException();
        }
        l2(new b1(0, this, null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E2(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "newValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "ITEM_ADDITIONAL_INPUT_ID_"
            r1 = 0
            boolean r2 = kotlin.text.a0.H(r9, r0, r1)
            if (r2 == 0) goto L22
            java.lang.String r9 = kotlin.text.d0.e0(r9, r0)
            avj.o r11 = new avj.o
            r0 = 10
            r11.<init>(r9, r10, r0)
            r8.H2(r11)
            return
        L22:
            java.lang.String r0 = "ITEM_REFERENCE_FIELD_INPUT_ID_"
            boolean r1 = kotlin.text.a0.H(r9, r0, r1)
            if (r1 == 0) goto Lbb
            java.lang.String r6 = kotlin.text.d0.e0(r9, r0)
            jki.i r9 = r8.t2()
            e4k.x r9 = (e4k.x) r9
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r9 = r9.f122647c
            r0 = 0
            if (r9 == 0) goto L3c
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote r9 = r9.f
            goto L3d
        L3c:
            r9 = r0
        L3d:
            boolean r1 = r9 instanceof com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote.StructuredNote
            if (r1 == 0) goto L45
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote$StructuredNote r9 = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote.StructuredNote) r9
            r5 = r9
            goto L46
        L45:
            r5 = r0
        L46:
            if (r5 == 0) goto Lba
            jki.i r9 = r8.t2()
            e4k.x r9 = (e4k.x) r9
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r9 = r9.f122647c
            if (r9 == 0) goto La3
            java.util.List r9 = r9.f101932n
            if (r9 == 0) goto La3
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L5c:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption r2 = (com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption) r2
            java.lang.String r2 = r2.getType()
            java.lang.String r3 = r5.f101984a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            if (r2 == 0) goto L5c
            goto L77
        L76:
            r1 = r0
        L77:
            com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption r1 = (com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceOption) r1
            if (r1 == 0) goto La3
            java.util.List r9 = r1.getFields()
            if (r9 == 0) goto La3
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L87:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField r2 = (com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField) r2
            java.lang.String r2 = r2.getType()
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r6)
            if (r2 == 0) goto L87
            goto La0
        L9f:
            r1 = r0
        La0:
            com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField r1 = (com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceReferenceField) r1
            goto La4
        La3:
            r1 = r0
        La4:
            if (r11 != 0) goto Laf
            if (r1 == 0) goto Lac
            java.lang.String r0 = r1.getInputMask()
        Lac:
            if (r0 == 0) goto Laf
            goto Lba
        Laf:
            dqd.a r2 = new dqd.a
            r7 = 2
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r8.H2(r2)
        Lba:
            return
        Lbb:
            r3 = r10
            e4k.q0 r9 = new e4k.q0
            r10 = 0
            r9.<init>(r8, r3, r10)
            r8.x2(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a.E2(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final z F2() {
        z zVar = ((x) t2()).d;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final BankTransferData G2() {
        BankTransferData bankTransferData = ((x) t2()).f122647c;
        if (bankTransferData != null) {
            return bankTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void H2(Function1 function1) {
        x2(new e1.b(function1, this, 18));
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.J;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        Continuation continuation = null;
        l2(new c(this, continuation, 5), new yi5.b(26));
        l.a1(this, vkm.q.Q(vkm.q.q(new j0(new dfj.f(q2(), 6), 27)), new y0(0, this, continuation)), null, null, new a1(0, this, continuation), 3);
        efm.r map = this.E.C().map(new e31.e(16, new e4k.f(9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, rd0.e.b(map), null, null, new a1(1, this, continuation), 3);
        if (((d) this.C).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c)) {
            l2(new b1(3, this, continuation), new yi5.b(26));
        }
        l.a1(this, vkm.q.q(new dfj.f(q2(), 9)), null, null, new o(this, continuation, 19), 3);
        l.a1(this, vkm.q.q(new m(q2(), this, 19)), null, null, new a2g.q(this, continuation, 11), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(gim.c r18) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a.I2(gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void P1() {
        if (this.E.j()) {
            return;
        }
        x2(new o0(this, 1));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, vkm.q.Q(vkm.q.q(new j0(new dfj.f(q2(), 7), 28)), new ahe.y0(continuation, this, 6)), null, new a1(2, this, continuation), 3);
        l.a1(this, vkm.q.Q(vkm.q.q(vkm.q.i(new dfj.f(q2(), 8), 0, ukm.f.DROP_LATEST)), new y0(1, this, continuation)), null, null, new a1(3, this, continuation), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.P;
    }
}
