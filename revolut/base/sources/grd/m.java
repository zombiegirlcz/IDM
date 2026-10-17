package grd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ AddEditAssetController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AddEditAssetController addEditAssetController, Continuation continuation) {
        super(2, continuation);
        this.u = addEditAssetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d dVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.d) this.u.R2();
        cli.y yVar = dVar.f87925x;
        if (dVar.I2()) {
            a aVar2 = (a) ((j2) yVar.f22677a).getValue();
            if (aVar2.k) {
                dVar.H2(yVar, new gqa.a(14));
            } else {
                SmartEstimationAccess smartEstimationAccess = aVar2.f145989m;
                if (smartEstimationAccess != null) {
                    if (aVar2.f145988l || smartEstimationAccess.i) {
                        dVar.l2(new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.c(dVar, null), new yi5.b(26));
                    } else {
                        dVar.f87922s.e3(smartEstimationAccess);
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
