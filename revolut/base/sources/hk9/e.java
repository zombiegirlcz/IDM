package hk9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        LargeActionButtonDelegate.Model action = (LargeActionButtonDelegate.Model) obj2;
        k kVar = (k) this.receiver;
        KProperty[] kPropertyArr = PurchaseCalculatorController.W;
        q qVar = (q) kVar;
        j60.a aVar = qVar.f152885p;
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.f(action.f52613a, "ADD_MONEY_BUTTON_ID")) {
            j60.a.v(aVar, false, new h1g.a(qVar, 20), 1);
        } else {
            j60.a.v(aVar, false, null, 3);
        }
        return Unit.f186387a;
    }
}
