package com.revolut.feature_move_money.impl.flow;

import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.jvm.internal.Intrinsics;
import o7i.g;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import t99.k;
import y65.l;
import yki.i;
import zof.f;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements y7i.b {

    @NotNull
    public static final y7i.d Companion = new y7i.d();
    public final i A;
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MoveMoneyInputData f97391p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g1 f97392q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hsc.c f97393r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.feature_move_money.impl.flow.delegate.a f97394s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f97395t;
    public final o7i.b u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final od0.i f97396w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final od0.i f97397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x7i.e f97398y;
    public final b7i.f z;

    public e(f transferFeatureScreensProvider, MoveMoneyInputData input, g1 shotDialogDisplayer, hsc.c scaPromptShotDialogProvider, com.revolut.feature_move_money.impl.flow.delegate.a moveMoneyValidationDelegate, k exchangeGlobalAccessFlowProvider, o7i.b moveMoneyConfirmationModalProvider, g moveMoneyConfirmationModalResultHandler, od0.i pickerBalancesFilterInteractor, od0.i moveMoneyPairFilterInteractor, x7i.e moveMoneyControllerExtension, b7i.f automationLaunchModeLoader) {
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(scaPromptShotDialogProvider, "scaPromptShotDialogProvider");
        Intrinsics.checkNotNullParameter(moveMoneyValidationDelegate, "moveMoneyValidationDelegate");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        Intrinsics.checkNotNullParameter(moveMoneyConfirmationModalProvider, "moveMoneyConfirmationModalProvider");
        Intrinsics.checkNotNullParameter(moveMoneyConfirmationModalResultHandler, "moveMoneyConfirmationModalResultHandler");
        Intrinsics.checkNotNullParameter(pickerBalancesFilterInteractor, "pickerBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyPairFilterInteractor, "moveMoneyPairFilterInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyControllerExtension, "moveMoneyControllerExtension");
        Intrinsics.checkNotNullParameter(automationLaunchModeLoader, "automationLaunchModeLoader");
        this.o = transferFeatureScreensProvider;
        this.f97391p = input;
        this.f97392q = shotDialogDisplayer;
        this.f97393r = scaPromptShotDialogProvider;
        this.f97394s = moveMoneyValidationDelegate;
        this.f97395t = exchangeGlobalAccessFlowProvider;
        this.u = moveMoneyConfirmationModalProvider;
        this.v = moveMoneyConfirmationModalResultHandler;
        this.f97396w = pickerBalancesFilterInteractor;
        this.f97397x = moveMoneyPairFilterInteractor;
        this.f97398y = moveMoneyControllerExtension;
        this.z = automationLaunchModeLoader;
        this.A = d8l.d.a(this, new xwd.a(this, 27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature_move_money.impl.flow.e r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.e.I2(com.revolut.feature_move_money.impl.flow.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature_move_money.impl.flow.e r9, java.lang.String r10, com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r11, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r12, gim.c r13) {
        /*
            yki.i r0 = r9.A
            boolean r1 = r13 instanceof y7i.g
            if (r1 == 0) goto L16
            r1 = r13
            y7i.g r1 = (y7i.g) r1
            int r2 = r1.f311529y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f311529y = r2
        L14:
            r8 = r1
            goto L1c
        L16:
            y7i.g r1 = new y7i.g
            r1.<init>(r9, r13)
            goto L14
        L1c:
            java.lang.Object r13 = r8.f311527w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r8.f311529y
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState r11 = r8.v
            java.lang.String r10 = r8.u
            yhm.o.b(r13)
            goto L56
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            yhm.o.b(r13)
            x7i.e r13 = r9.f97398y
            r2 = r3
            com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo r3 = r11.f97347a
            boolean r5 = r11.f97349c
            com.revolut.shared.feature.move_money.api.model.MoveMoneyReason r6 = r11.d
            r8.u = r10
            r8.v = r11
            r8.f311529y = r2
            r2 = r13
            x7i.l r2 = (x7i.l) r2
            r4 = r10
            r7 = r12
            java.lang.Object r13 = r2.c3(r3, r4, r5, r6, r7, r8)
            if (r13 != r1) goto L55
            return r1
        L55:
            r10 = r4
        L56:
            x7i.d r13 = (x7i.d) r13
            x7i.c r12 = x7i.c.f303215a
            boolean r12 = kotlin.jvm.internal.Intrinsics.f(r13, r12)
            if (r12 == 0) goto L69
            y5i.b$a r10 = y5i.b.a.f311092a
            r9.C2(r10)
            oki.h.D2(r0)
            goto L8b
        L69:
            boolean r9 = r13 instanceof x7i.b
            if (r9 == 0) goto L83
            com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$FirmPriceDeviance r9 = new com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step$FirmPriceDeviance
            com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData r12 = new com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData
            x7i.b r13 = (x7i.b) r13
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r1 = r13.f303213a
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams r13 = r13.f303214b
            r12.<init>(r1, r13)
            r9.<init>(r12, r11, r10)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r10 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.w2(r0, r9, r10)
            goto L8b
        L83:
            x7i.a r9 = x7i.a.f303212a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r13, r9)
            if (r9 == 0) goto L8e
        L8b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L8e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_move_money.impl.flow.e.J2(com.revolut.feature_move_money.impl.flow.e, java.lang.String, com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState, com.revolut.shared.feature.market_data.models.domain.models.OrderQuote, gim.c):java.lang.Object");
    }

    public final void K2(String str, MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState) {
        l2(new l(this, str, moveMoneyFlowContract$MoveMoneyProcessState, null, 2), new y7i.c(this, 0));
    }

    @Override // yki.j
    public final void M0() {
        l2(new y7i.h(this, null, 0), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.A;
    }
}
