package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import a31.w;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.navigation.CryptoSendAmountInputScreenDestination$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.kompot.common.ModalDestination;
import eh3.s;
import eq5.a1;
import eq5.b1;
import eq5.c1;
import eq5.d1;
import eq5.e1;
import eq5.g0;
import eq5.i0;
import eq5.m1;
import eq5.r;
import eq5.t;
import eq5.x;
import eq5.x0;
import eq5.y0;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import opf.z;
import rea.m;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.t0;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements x {
    public final pp5.a A;
    public final z B;
    public final vo9.a C;
    public final Lazy D;
    public final Lazy E;
    public final y F;
    public final com.revolut.kompot.navigable.vc.modal.a G;
    public final CryptoSendAmountInputScreenDestination$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ap5.b f71277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f71278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f71279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g0 f71280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final go5.e f71281t;
    public final l2j.a u;
    public final zjh.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i0 f71282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zrc.d f71283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ae5.a f71284y;
    public final hsc.c z;

    public j(m1 stateMapper, CryptoSendAmountInputScreenDestination$InputData inputData, ap5.b cryptoWithdrawInteractor, x0 interactor, m pocketDetailsInteractor, g0 dialogProvider, go5.e cryptoWithdrawDependenciesConfig, l2j.a currencyChooserFlowFactory, zjh.j validator, i0 flowResultHolder, zrc.d cryptoScaInteractor, ae5.a cryptoConvertDialogDisclaimerExtension, hsc.c cryptoScaPromptShotDialogProvider, pp5.a balancesFilterInteractor, z transferFundingSourceInteractor, vo9.a paymentPocketMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDependenciesConfig, "cryptoWithdrawDependenciesConfig");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(flowResultHolder, "flowResultHolder");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        this.o = inputData;
        this.f71277p = cryptoWithdrawInteractor;
        this.f71278q = interactor;
        this.f71279r = pocketDetailsInteractor;
        this.f71280s = dialogProvider;
        this.f71281t = cryptoWithdrawDependenciesConfig;
        this.u = currencyChooserFlowFactory;
        this.v = validator;
        this.f71282w = flowResultHolder;
        this.f71283x = cryptoScaInteractor;
        this.f71284y = cryptoConvertDialogDisclaimerExtension;
        this.z = cryptoScaPromptShotDialogProvider;
        this.A = balancesFilterInteractor;
        this.B = transferFundingSourceInteractor;
        this.C = paymentPocketMapper;
        this.D = yhm.j.b(new ekd.i0(11));
        this.E = yhm.j.b(new ekd.i0(12));
        this.F = mra.d.b(this, new r(inputData.getF71153a().f71061c, inputData.getF71154b(), null, inputData.F7(), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), null, null, null, new Data(null, null, true, 3, null), false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, null, false), stateMapper, null, false, 12);
        this.G = hx7.e.a(this, new s(this, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j r5, gim.c r6) {
        /*
            cli.y r0 = r5.F
            boolean r1 = r6 instanceof eq5.k1
            if (r1 == 0) goto L15
            r1 = r6
            eq5.k1 r1 = (eq5.k1) r1
            int r2 = r1.f128284w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f128284w = r2
            goto L1a
        L15:
            eq5.k1 r1 = new eq5.k1
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f128284w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r6)
            goto L4e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.Object r6 = r0.f22677a
            vkm.j2 r6 = (vkm.j2) r6
            java.lang.Object r6 = r6.getValue()
            eq5.r r6 = (eq5.r) r6
            eq5.s r6 = r6.f128311h
            if (r6 != 0) goto L45
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L45:
            r1.f128284w = r4
            java.lang.Object r6 = r5.N2(r6, r1)
            if (r6 != r2) goto L4e
            return r2
        L4e:
            com.revolut.feature.transfer.core.models.FundingSource r6 = (com.revolut.feature.transfer.core.models.FundingSource) r6
            a32.z r1 = new a32.z
            r2 = 1
            r1.<init>(r6, r2)
            r5.H2(r0, r1)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j.I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j, gim.c):java.lang.Object");
    }

    public final void J2() {
        CryptoAddress cryptoAddress = (CryptoAddress) ((r) ((j2) this.F.f22677a).getValue()).e.getContent();
        if (cryptoAddress == null) {
            return;
        }
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = cryptoAddress.f71065l;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.G;
        if (cryptoAddressRecipientDetails == null) {
            oki.h.v2(aVar, new CryptoSendAmountInputScreenContract$ModalStep.AddressBelongsToYou(cryptoAddress.f71059a), bottom_dialog);
            return;
        }
        CryptoAddressCounterparty cryptoAddressCounterparty = cryptoAddress.f71068p;
        if ((cryptoAddressCounterparty != null ? cryptoAddressCounterparty.d : null) == null || cryptoAddressCounterparty.f == null) {
            oki.h.v2(aVar, new CryptoSendAmountInputScreenContract$ModalStep.AdditionalInfoRequired(cryptoAddress), bottom_dialog);
        } else {
            K2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.G;
    }

    public final void K2() {
        dj0.d dVar;
        CryptoAddress cryptoAddress;
        wk5.a aVar;
        FundingSource fundingSource;
        xi0.b bVar;
        y yVar = this.F;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        FiatCryptoMoney fiatCryptoMoney = (FiatCryptoMoney) ((r) j2Var.getValue()).f128310g.getContent();
        if (fiatCryptoMoney == null || (dVar = fiatCryptoMoney.f71113b) == null || (cryptoAddress = (CryptoAddress) ((r) j2Var2.getValue()).e.getContent()) == null || (aVar = ((r) j2Var2.getValue()).f128309c) == null || (fundingSource = ((r) j2Var2.getValue()).i) == null || (bVar = fundingSource.f92241b) == null) {
            return;
        }
        n2(new w(this, bVar, cryptoAddress, dVar, aVar, (Continuation) null, 27), new whi.b(6));
    }

    public final void L2() {
        boolean z = this.f71281t.f145090h;
        y yVar = this.F;
        Continuation continuation = null;
        if (z) {
            FundingSource fundingSource = ((r) ((j2) yVar.f22677a).getValue()).i;
            String str = fundingSource != null ? fundingSource.f92240a : null;
            CryptoAddress cryptoAddress = (CryptoAddress) ((r) ((j2) yVar.f22677a).getValue()).e.getContent();
            if (str == null || cryptoAddress == null) {
                return;
            }
            n2(new e38.c(this, str, cryptoAddress, continuation, 20), new whi.b(6));
            return;
        }
        FundingSource fundingSource2 = ((r) ((j2) yVar.f22677a).getValue()).i;
        xi0.b bVar = fundingSource2 != null ? fundingSource2.f92241b : null;
        CryptoAddress cryptoAddress2 = (CryptoAddress) ((r) ((j2) yVar.f22677a).getValue()).e.getContent();
        if (bVar == null || cryptoAddress2 == null) {
            return;
        }
        n2(new e38.c(this, bVar, cryptoAddress2, continuation, 19), new whi.b(6));
    }

    public final void M2() {
        FundingSource fundingSource;
        FundingSource fundingSource2;
        xi0.b bVar;
        FiatCryptoMoney fiatCryptoMoney;
        CryptoWithdrawLimits cryptoWithdrawLimits;
        CryptoAddressCounterparty cryptoAddressCounterparty;
        y yVar = this.F;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        CryptoAddress cryptoAddress = (CryptoAddress) ((r) j2Var.getValue()).e.getContent();
        if (cryptoAddress == null) {
            return;
        }
        boolean z = ((r) j2Var2.getValue()).d;
        FiatCryptoMoney fiatCryptoMoney2 = (FiatCryptoMoney) ((r) j2Var2.getValue()).k.getContent();
        if (fiatCryptoMoney2 == null || (fundingSource = ((r) j2Var2.getValue()).i) == null || (fundingSource2 = ((r) j2Var2.getValue()).i) == null || (bVar = fundingSource2.f92241b) == null || (fiatCryptoMoney = (FiatCryptoMoney) ((r) j2Var2.getValue()).f128310g.getContent()) == null || (cryptoWithdrawLimits = ((r) j2Var2.getValue()).f128316p) == null || (cryptoAddressCounterparty = ((r) j2Var2.getValue()).f128317q) == null) {
            return;
        }
        C2(new t(cryptoAddress, z, fiatCryptoMoney2, fundingSource, bVar, fiatCryptoMoney, cryptoWithdrawLimits, cryptoAddressCounterparty));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(eq5.s r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof eq5.l1
            if (r0 == 0) goto L13
            r0 = r7
            eq5.l1 r0 = (eq5.l1) r0
            int r1 = r0.f128288w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128288w = r1
            goto L18
        L13:
            eq5.l1 r0 = new eq5.l1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128288w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L47
        L27:
            r6 = move-exception
            goto L4a
        L29:
            r6 = move-exception
            goto L55
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            opf.z r7 = r5.B     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            k1j.a r2 = r6.f128322a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.core.model.account.AccountId r4 = r6.f128323b     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.String r6 = r6.f128324c     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f128288w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r7 = r7.d(r4, r0, r6, r2)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r7 != r1) goto L47
            return r1
        L47:
            com.revolut.feature.transfer.core.models.FundingSource r7 = (com.revolut.feature.transfer.core.models.FundingSource) r7     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            return r7
        L4a:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r6, r7)
            return r1
        L55:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j.N2(eq5.s, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.F;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        Continuation continuation = null;
        if (((r) j2Var.getValue()).f128308b == null) {
            n2(new a1(2, this, continuation), new whi.b(6));
        }
        if (((r) j2Var2.getValue()).f128309c == null) {
            n2(new a1(1, this, continuation), new whi.b(6));
        }
        if (((r) j2Var2.getValue()).f == null) {
            n2(new a1(0, this, continuation), new whi.b(6));
        }
        l.b1(this, q.Q(yh5.b.d(new t0(yVar.B(new ep2.l(18)), 1), new t0(yVar.B(new ep2.l(19)), 1)), new a67.c(continuation, this, 18)), null, new c1(1, this, continuation), 3);
        if (((r) j2Var2.getValue()).f128311h == null) {
            n2(new e1(this, null), new whi.b(6));
        }
        l.b1(this, q.H(new d1(0, this, null), new t0(yVar.B(new ep2.l(20)), 1)), null, new c1(4, this, continuation), 3);
        l.b1(this, q.Q(new t0(yVar.B(new ep2.l(17)), 1), new b1(3, this, continuation)), null, new c1(8, this, continuation), 3);
        l.b1(this, q.Q(new t0(yVar.B(new ep2.l(21)), 1), new b1(1, this, continuation)), null, new c1(2, this, continuation), 3);
        l.b1(this, boh.f.e(new dfj.f(yVar.B(new ep2.l(14)), 17), new y0(this, 1)), null, new c1(9, this, continuation), 3);
        l.b1(this, boh.f.e(new dfj.f(yVar.B(new ep2.l(16)), 16), new y0(this, 9)), null, new c1(5, this, continuation), 3);
        int i = 0;
        l.b1(this, q.Q(new t0(yVar.B(new ep2.l(13)), 1), new b1(i, this, continuation)), null, new c1(i, this, continuation), 3);
        l.b1(this, nim.a.v(new q0(q.Q(new t0(yVar.B(new ep2.l(12)), 1), new b1(2, this, continuation)), new c1(6, this, continuation), 1), new y0(this, 0)), null, new c1(7, this, continuation), 3);
        l.b1(this, (MutableSharedFlow) this.f71282w.f128275a.getValue(), null, new c1(3, this, continuation), 3);
        if (!((r) j2Var2.getValue()).f128318r) {
            n2(new f(this, null), new whi.b(6));
        }
        l.b1(this, q.q(yh5.b.d(new t0(yVar.B(new ep2.l(11)), 1), new t0(yVar.B(new ep2.l(15)), 1))), null, new d1(1, this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.F;
    }
}
