package r3b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        l lVar = (l) this.receiver;
        KProperty[] kPropertyArr = CfdTradingHomeScreen.f0;
        com.revolut.feature.retail.cfd.impl.screens.home.a aVar = (com.revolut.feature.retail.cfd.impl.screens.home.a) lVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof j) {
            aVar.C1(u0.c(new CfdTradingFeatureConfig.CashBalance(((j) obj4).f251247a, null)));
        } else if (obj4 instanceof k) {
            aVar.C1(new CfdTradingFeatureConfig.CfdPositionsDestination(((k) obj4).f251248a, aVar.o.f82212a, null, true));
        }
        return Unit.f186387a;
    }
}
