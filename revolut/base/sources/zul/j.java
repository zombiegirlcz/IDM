package zul;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        q qVar = (q) this.receiver;
        KProperty[] kPropertyArr = InvestmentProjectionsScreen.f107027e0;
        com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) qVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        vii.c cVar = aVar.B;
        Unit unit = Unit.f186387a;
        cVar.b(unit);
        return unit;
    }
}
