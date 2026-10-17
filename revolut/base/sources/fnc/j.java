package fnc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
        o oVar = (o) this.receiver;
        PortfolioDetailsScreen.Companion aVar = PortfolioDetailsScreen.INSTANCE;
        ((d0) oVar).getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        return Unit.f186387a;
    }
}
