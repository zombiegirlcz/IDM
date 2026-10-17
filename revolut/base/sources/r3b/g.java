package r3b;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        l lVar = (l) this.receiver;
        KProperty[] kPropertyArr = CfdTradingHomeScreen.f0;
        com.revolut.feature.retail.cfd.impl.screens.home.a aVar = (com.revolut.feature.retail.cfd.impl.screens.home.a) lVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "CFD_PORTFOLIO_ERROR_STATE_ID")) {
            aVar.C.b(Unit.f186387a);
        } else if (Intrinsics.f(str, "CFD_PERFORMANCE_ERROR_STATE_ID")) {
            aVar.D.b(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
