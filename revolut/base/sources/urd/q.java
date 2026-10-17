package urd;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ CustomAssetDetailsV2Controller u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(CustomAssetDetailsV2Controller customAssetDetailsV2Controller, Continuation continuation) {
        super(2, continuation);
        this.u = customAssetDetailsV2Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = (x) this.u.d();
        aii.o oVarL1 = xVar.l1();
        cli.y yVar = xVar.f282301s;
        oVarL1.M0(new TotalWealthContract$Events.NavigateToHistoricalValues(((a) ((j2) yVar.f22677a).getValue()).f282264a, ((a) ((j2) yVar.f22677a).getValue()).f282265b));
        return Unit.f186387a;
    }
}
