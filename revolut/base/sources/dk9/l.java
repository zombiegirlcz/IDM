package dk9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.pay_later.impl.ui.plandetails.PayLaterPlanDetailsScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vi9.e0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
        q qVar = (q) this.receiver;
        KProperty[] kPropertyArr = PayLaterPlanDetailsScreen.j0;
        a0 a0Var = (a0) qVar;
        e0 e0Var = a0Var.f115465s;
        j60.a aVar = a0Var.f115464r;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.f51787l;
        String str = model.f51781a;
        if (Intrinsics.f(str, "ID_ITEM_CARD")) {
            Object obj5 = model.f51787l;
            Intrinsics.i(obj5, "null cannot be cast to non-null type kotlin.String");
            a0Var.C1(new BridgeDestination(new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Select((String) obj5, 6, false, false), 15))));
        } else if (Intrinsics.f(str, "ID_FEE_AMOUNT_CELL")) {
            aVar.x(e0Var.b("FEE_DIALOG_DELEGATES_KEY_PLAN_DETAILS", ((o) zi0.c.I(((p) a0Var.t2()).f115475a)).f115474c));
        } else if (obj4 instanceof bi9.c) {
            aVar.x(e0Var.d("LATE_INTEREST_DIALOG_DELEGATES_KEY_PLAN_DETAILS", ((bi9.c) obj4).f15448a));
        }
        return Unit.f186387a;
    }
}
