package urd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ CustomAssetDetailsV2Controller u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CustomAssetDetailsV2Controller customAssetDetailsV2Controller, Continuation continuation) {
        super(2, continuation);
        this.u = customAssetDetailsV2Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmartEstimationAccess smartEstimationAccess;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.d();
        if (xVar.I2() && (smartEstimationAccess = ((a) ((j2) xVar.f282301s.f22677a).getValue()).f) != null) {
            xVar.f282299q.d3(smartEstimationAccess);
        }
        return Unit.f186387a;
    }
}
