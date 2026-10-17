package nk9;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.repaymentslist.PayLaterRepaymentsListScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ActionsView.Item item = (ActionsView.Item) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = PayLaterRepaymentsListScreen.f0;
        o oVar = (o) hVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item.f58316a, "ID_ACTION_REPAY")) {
            oVar.C1(PayLaterKompotFeatureConfig.RepayAmountNavigationDestination.f78836b);
        }
        return Unit.f186387a;
    }
}
