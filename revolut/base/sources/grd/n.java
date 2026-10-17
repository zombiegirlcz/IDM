package grd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ AddEditAssetController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AddEditAssetController addEditAssetController, Continuation continuation) {
        super(2, continuation);
        this.u = addEditAssetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmartEstimationAccess smartEstimationAccess;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.u.R2();
        if (dVar.I2() && (smartEstimationAccess = ((a) ((j2) dVar.f87925x.f22677a).getValue()).f145989m) != null) {
            dVar.f87922s.d3(smartEstimationAccess);
        }
        return Unit.f186387a;
    }
}
