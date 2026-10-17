package fnc;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) obj2;
        o oVar = (o) this.receiver;
        PortfolioDetailsScreen.Companion aVar = PortfolioDetailsScreen.INSTANCE;
        d0 d0Var = (d0) oVar;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.k instanceof ooc.a) {
            d0Var.H2(d0Var.F, new a2g.n(model, 1));
        }
        return Unit.f186387a;
    }
}
