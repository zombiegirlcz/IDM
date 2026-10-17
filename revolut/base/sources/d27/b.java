package d27;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function2 {
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        AmountEditDelegate.Model p0 = (AmountEditDelegate.Model) obj2;
        AmountEditView p17 = (AmountEditView) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        OrderInitPageCreateScreen orderInitPageCreateScreen = (OrderInitPageCreateScreen) this.receiver;
        KProperty[] kPropertyArr = OrderInitPageCreateScreen.W;
        orderInitPageCreateScreen.getClass();
        MaskedTextInputEditText editText = p17.getEditText();
        Object obj4 = p0.f51629j;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
        return new zp0.d(editText, (xi0.b) obj4, (u80.d) orderInitPageCreateScreen.S.getValue(), null, new d(orderInitPageCreateScreen, p0), false, false, 0, false, null, 1928);
    }
}
