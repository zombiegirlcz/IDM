package cxe;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CheckoutTopupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(CheckoutTopupScreen checkoutTopupScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.v, continuation);
        e0Var.u = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            com.revolut.core.ui_kit.delegates.CellDetailsDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.CellDetailsDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen r6 = r5.v
            cxe.o r6 = r6.R2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c r6 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) r6
            cxe.a r1 = r6.f90745q
            java.lang.String r2 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            cli.y r2 = r6.f90751y
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            cxe.e r2 = (cxe.e) r2
            com.revolut.data.model.Data r2 = r2.f109940a
            java.lang.Object r2 = r2.getContent()
            cxe.b r2 = (cxe.b) r2
            java.lang.String r0 = r0.f51832a
            java.lang.String r3 = "TOP_UP_METHOD_FEE_ID"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            if (r3 == 0) goto L3f
            r1.getClass()
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput$TopUpMethodFee r0 = com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput.TopUpMethodFee.f90742a
            goto L83
        L3f:
            java.lang.String r3 = "CREDIT_POCKET_PAYMENT_AMOUNT_LIST_ID"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r3)
            r3 = 0
            if (r0 == 0) goto L82
            if (r2 == 0) goto L82
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.a r1 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.a) r1
            r1.getClass()
            java.lang.String r0 = "checkoutContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order r0 = r2.f109920a
            boolean r4 = r0 instanceof com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order.Checkout
            if (r4 == 0) goto L5d
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$Checkout r0 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order.Checkout) r0
            goto L5e
        L5d:
            r0 = r3
        L5e:
            if (r0 == 0) goto L82
            com.revolut.feature.checkout.models.CheckoutOrder r0 = r0.f90710a
            if (r0 == 0) goto L82
            pi3.e r0 = r0.e
            if (r0 == 0) goto L82
            hha.d r2 = r2.f109921b
            if (r2 == 0) goto L82
            yik.h r1 = r1.f90727a
            com.revolut.core.ui_kit.models.Clause r1 = fgk.b.a(r1, r2)
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput$CreditPlanFee r2 = new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput$CreditPlanFee
            hha.i r0 = r0.f
            hha.i r3 = hha.i.ANNUAL
            if (r0 != r3) goto L7c
            r0 = 1
            goto L7d
        L7c:
            r0 = 0
        L7d:
            r2.<init>(r1, r0)
            r0 = r2
            goto L83
        L82:
            r0 = r3
        L83:
            if (r0 == 0) goto L91
            com.revolut.kompot.navigable.vc.modal.a r6 = r6.z
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$ModalStep$ShowDialog r1 = new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$ModalStep$ShowDialog
            r1.<init>(r0)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r6, r1, r0)
        L91:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cxe.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
