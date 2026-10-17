package dk9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        q qVar = (q) this.receiver;
        KProperty[] kPropertyArr = PayLaterPlanDetailsScreen.j0;
        a0 a0Var = (a0) qVar;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        ((com.revolut.feature.pay_later.impl.ui.help.a) a0Var.v).O1(model);
        return Unit.f186387a;
    }
}
