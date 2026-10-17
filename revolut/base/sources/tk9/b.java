package tk9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_later.impl.ui.selectpayment.PayLaterSelectRepaymentScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        e eVar = (e) this.receiver;
        KProperty[] kPropertyArr = PayLaterSelectRepaymentScreen.f78933e0;
        j jVar = (j) eVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof bi9.b) {
            jVar.n2(new tgk.f(jVar, ((bi9.b) obj4).f15447a, null, 13), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
