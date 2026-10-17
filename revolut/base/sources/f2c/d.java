package f2c;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.RevPointsSpareChangeFullBannerGridController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsSpareChangeFullBannerGridController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RevPointsSpareChangeFullBannerGridController revPointsSpareChangeFullBannerGridController, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsSpareChangeFullBannerGridController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a aVar2 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.a) gVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51674g;
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num != null) {
            aVar2.H2(aVar2.f84152w, new a5g.i(num.intValue(), 15));
        }
        return Unit.f186387a;
    }
}
