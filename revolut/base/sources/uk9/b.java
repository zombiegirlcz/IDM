package uk9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_later.impl.ui.selectplan.PayLaterSelectPlanScreen;
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
        KProperty[] kPropertyArr = PayLaterSelectPlanScreen.f78937e0;
        k kVar = (k) eVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof bi9.d) {
            kVar.n2(new u2i.g(kVar, ((bi9.d) obj4).f15449a, null, 22), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
