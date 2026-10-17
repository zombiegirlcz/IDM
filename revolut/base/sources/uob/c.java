package uob;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.next_interest_payment.NextInterestPaymentDialogScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = NextInterestPaymentDialogScreen.S;
        k kVar = (k) hVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "GOT_IT_BUTTON_LIST_ID")) {
            kVar.B2();
        } else if (Intrinsics.f(str, "ADD_AMOUNT_ACTION_BUTTON_ID")) {
            kVar.l2(new j(kVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
