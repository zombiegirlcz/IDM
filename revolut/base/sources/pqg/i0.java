package pqg;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.savings.api.error.SavingsServerErrorContract$DepositLimitsReachedException;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import pcd.l0;
import skm.p0;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends bji.b implements r {

    @NotNull
    private static final w Companion = new w();
    public final eli.j A;
    public final m B;
    public final skb.f C;
    public final j60.a D;
    public final qr0.i E;
    public final ppg.a F;
    public final xua.a G;
    public final zbb.a H;
    public final clb.c I;
    public final n8b.a J;
    public final kbb.c K;
    public final ihm.b L;
    public final o M;
    public final AddMoneyScreenContract$InputData u;
    public final wsg.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ppg.b f238741w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ijb.a f238742x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final acb.j f238743y;
    public final w80.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 stateMapper, AddMoneyScreenContract$InputData inputData, wsg.n walletInteractor, ppg.b vaultsInteractor, ijb.a savingsProductInteractor, acb.j transferBreakdownInteractor, w80.b amountFormatter, eli.j twoFaErrorHandler, m dialogModelMapper, skb.f productInfoSheetsDelegate, j60.a bottomDialog, qr0.i validator, ppg.a customisedVaultInteractor, xua.a recurringPaymentInteractor, zbb.a balancePickerInteractor, clb.c savingsErrorHandlingApi, n8b.a countryInteractor, kbb.c savingsAutomationEligibilityInteractor) {
        String strD;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(transferBreakdownInteractor, "transferBreakdownInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(dialogModelMapper, "dialogModelMapper");
        Intrinsics.checkNotNullParameter(productInfoSheetsDelegate, "productInfoSheetsDelegate");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(balancePickerInteractor, "balancePickerInteractor");
        Intrinsics.checkNotNullParameter(savingsErrorHandlingApi, "savingsErrorHandlingApi");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(savingsAutomationEligibilityInteractor, "savingsAutomationEligibilityInteractor");
        this.u = inputData;
        this.v = walletInteractor;
        this.f238741w = vaultsInteractor;
        this.f238742x = savingsProductInteractor;
        this.f238743y = transferBreakdownInteractor;
        this.z = amountFormatter;
        this.A = twoFaErrorHandler;
        this.B = dialogModelMapper;
        this.C = productInfoSheetsDelegate;
        this.D = bottomDialog;
        this.E = validator;
        this.F = customisedVaultInteractor;
        this.G = recurringPaymentInteractor;
        this.H = balancePickerInteractor;
        this.I = savingsErrorHandlingApi;
        this.J = countryInteractor;
        this.K = savingsAutomationEligibilityInteractor;
        this.L = j6.a.h("create(...)");
        n nVar = o.Companion;
        pcd.s sVar = inputData.f94775a;
        pcd.s sVar2 = inputData.f94775a;
        String topUpAmountCurrency = sVar.getCurrency();
        Long l2 = inputData.f94777c;
        String topUpAmount = (l2 == null || (strD = amountFormatter.d(l2.longValue(), sVar2.getCurrency())) == null) ? "0" : strD;
        long j2 = sVar2.f234885h.f234861c;
        boolean z = inputData.f;
        l0 vaultType = sVar2.e;
        boolean z3 = inputData.f94778g;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(topUpAmountCurrency, "topUpAmountCurrency");
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        Intrinsics.checkNotNullParameter(vaultType, "vaultType");
        xi0.b bVar = new xi0.b(6, topUpAmountCurrency, null);
        xi0.b.Companion.getClass();
        this.M = new o(bVar, topUpAmount, j2, vaultType, null, 0L, xi0.a.a(topUpAmountCurrency), z, null, null, zhm.u.c(urf.g.f282312a), null, z3, false, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B2(pqg.i0 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof pqg.y
            if (r0 == 0) goto L13
            r0 = r6
            pqg.y r0 = (pqg.y) r0
            int r1 = r0.f238773w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f238773w = r1
            goto L18
        L13:
            pqg.y r0 = new pqg.y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f238773w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L87
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData r6 = r5.u
            pcd.s r6 = r6.f94775a
            pcd.b r2 = r6.f234889n
            pcd.b r4 = pcd.b.PERSONAL_JOINT
            if (r2 != r4) goto L3f
            zbb.d r5 = zbb.d.f320867b
            return r5
        L3f:
            pcd.l0 r6 = r6.e
            int[] r2 = pqg.x.f238772a
            int r6 = r6.ordinal()
            r6 = r2[r6]
            switch(r6) {
                case 1: goto L5b;
                case 2: goto L58;
                case 3: goto L58;
                case 4: goto L55;
                case 5: goto L55;
                case 6: goto L52;
                case 7: goto L52;
                case 8: goto L52;
                default: goto L4c;
            }
        L4c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L52:
            zbb.b r5 = zbb.b.f320865b
            return r5
        L55:
            zbb.e r5 = zbb.e.f320868b
            return r5
        L58:
            zbb.c r5 = zbb.c.f320866b
            return r5
        L5b:
            efm.d0 r5 = r5.C2()
            pnh.a0 r6 = new pnh.a0
            r2 = 28
            r6.<init>(r2)
            po9.w r2 = new po9.w
            r4 = 11
            r2.<init>(r4, r6)
            ufm.i r6 = new ufm.i
            r4 = 1
            r6.<init>(r5, r2, r4)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            zbb.c r5 = zbb.c.f320866b
            pfm.z r5 = ue0.e.F(r6, r5)
            r0.f238773w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L87
            return r1
        L87:
            kotlin.jvm.internal.Intrinsics.h(r6)
            zbb.f r6 = (zbb.f) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pqg.i0.B2(pqg.i0, gim.c):java.lang.Object");
    }

    public final efm.d0 C2() {
        String str = this.u.f94776b;
        if (str == null) {
            od0.i.Companion.getClass();
            ufm.b bVarM = efm.d0.m(od0.i.f224256b);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        efm.d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(ijb.a.b(this.f238742x, str), null, new pof.e(13), 1), p0.f264003c).firstOrError();
        po9.w wVar = new po9.w(13, new v(1));
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, wVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, zhm.h0.f322473a, new v(2));
    }

    public final boolean D2(Throwable th10) {
        if (!(th10 instanceof SavingsServerErrorContract$DepositLimitsReachedException)) {
            if (th10 instanceof ServerErrorException) {
                return false;
            }
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
            yji.l.a1(this, this.I.Z2(th10), null, null, new a0(this, null, 0), 3);
            return true;
        }
        SavingsServerErrorContract$DepositLimitsReachedException savingsServerErrorContract$DepositLimitsReachedException = (SavingsServerErrorContract$DepositLimitsReachedException) th10;
        dj0.d limit = savingsServerErrorContract$DepositLimitsReachedException.f86451a;
        dj0.d limitLeft = savingsServerErrorContract$DepositLimitsReachedException.f86452b;
        b bVar = (b) this.B;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(limitLeft, "limitLeft");
        yji.l.a1(this, X1(new y0(null, ((zqg.a) bVar.f238733a).a(limit, limitLeft), false, 5)), null, null, new a0(this, null, 1), 3);
        return true;
    }

    public final efm.r E2(xi0.b bVar) {
        efm.r rVarW;
        pcd.s sVar = this.u.f94775a;
        if (sVar.e == l0.GROUP) {
            rVarW = osg.b.e(this.v, false, io3.l.CURRENT, null, null, null, null, null, 124);
        } else if (sVar.f234889n == pcd.b.YOUTH) {
            rVarW = osg.b.e(this.v, false, io3.l.CURRENT, null, null, null, null, null, 124);
        } else {
            w4l.h hVar = w4l.h.f294642c;
            rVarW = nim.a.w(this.v.e0(sVar.f, hVar), new v(0));
        }
        return m70.a.g(nim.a.w(rVarW, new pj3.b(this, bVar, 18)), null, new pof.e(this, 12), 1);
    }

    @Override // yji.l
    public final void I1() {
        pcd.s sVar = this.u.f94775a;
        zii.i.E0(this, ue0.e.E(m70.a.g(x.f238772a[sVar.e.ordinal()] == 1 ? zi0.c.j(new npg.b(sVar, new ResourceImage(R$drawable.uikit_icn_24_shield, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246))) : ((ypg.b) this.F).b(sVar), null, new pof.e(14), 1), new npg.b(sVar, nib.a.a())), new u(this, 0), null, 14);
        zii.i.E0(this, E2(((o) t2()).f238749a), new u(this, 2), new plc.i(1, this, i0.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 16), 12);
        A2(C2(), new u(this, 4), new v(3));
        A2(te0.w.o0(p0.f264003c, new z(this, null, 0)), new u(this, 5), new v(4));
    }

    @Override // yji.l
    public final void T1(long j2) {
        efm.r rVarSwitchMap = this.L.switchMap(new po9.w(14, new u(this, 6)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        zii.i.t(this, rVarSwitchMap, new u(this, 7), new plc.i(1, this, i0.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 18), 12);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.M;
    }
}
