package gk9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.planslist.PayLaterPlansListScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = PayLaterPlansListScreen.f0;
        o oVar = (o) iVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof bi9.d) {
            oVar.C1(new PayLaterKompotFeatureConfig.PlanDetailsNavigationDestination(((bi9.d) obj4).f15449a.f322326a));
        }
        return Unit.f186387a;
    }
}
