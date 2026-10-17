package dnc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        j jVar = (j) this.receiver;
        KProperty[] kPropertyArr = PortfolioAllocationsDetailsScreen.g0;
        r rVar = (r) jVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        nel.n nVar = obj4 instanceof nel.n ? (nel.n) obj4 : null;
        if (nVar != null) {
            rVar.C1(new AssetDetailsDestination(nVar.f214596b, null, false, "RoboPortfolioAllocationSection", null, null, 50));
        }
        return Unit.f186387a;
    }
}
