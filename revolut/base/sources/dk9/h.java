package dk9;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
        q qVar = (q) this.receiver;
        KProperty[] kPropertyArr = PayLaterPlanDetailsScreen.j0;
        a0 a0Var = (a0) qVar;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "ID_SEE_ALL_INSTALMENTS")) {
            a0Var.C1(new PayLaterKompotFeatureConfig.PlanProgressNavigationDestination(a0Var.f115462p.f78898a));
        }
        return Unit.f186387a;
    }
}
