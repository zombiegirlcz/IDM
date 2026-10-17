package fnc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        o oVar = (o) this.receiver;
        PortfolioDetailsScreen.Companion aVar = PortfolioDetailsScreen.INSTANCE;
        d0 d0Var = (d0) oVar;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof boc.j) {
            boc.j parcel = (boc.j) obj4;
            boc.h hVar = (boc.h) d0Var.f136631s;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            j60.a.v(hVar.f17384m, false, new bc1.a(hVar, parcel, 17), 1);
        }
        return Unit.f186387a;
    }
}
