package cxe;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CheckoutTopupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(CheckoutTopupScreen checkoutTopupScreen, Continuation continuation) {
        super(2, continuation);
        this.v = checkoutTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.v, continuation);
        f0Var.u = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c A[PHI: r4
      0x014c: PHI (r4v1 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput) = 
      (r4v7 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v8 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v9 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v2 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v10 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v11 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v12 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v13 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v14 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v3 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v4 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v15 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v16 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v17 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v18 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
      (r4v0 com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput)
     binds: [B:7:0x0046, B:59:0x011d, B:65:0x0132, B:66:0x0134, B:41:0x00ce, B:50:0x00ed, B:52:0x00f1, B:54:0x00f5, B:34:0x00ad, B:37:0x00b3, B:30:0x009e, B:10:0x0051, B:19:0x0070, B:21:0x0074, B:23:0x0078, B:25:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cxe.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
