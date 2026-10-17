package dnc;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        j jVar = (j) this.receiver;
        KProperty[] kPropertyArr = PortfolioAllocationsDetailsScreen.g0;
        r rVar = (r) jVar;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.k;
        i iVar = obj4 instanceof i ? (i) obj4 : null;
        if (iVar != null) {
            rVar.u.b(iVar);
        }
        return Unit.f186387a;
    }
}
