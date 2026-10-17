package urd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CustomAssetDetailsV2Controller v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(CustomAssetDetailsV2Controller customAssetDetailsV2Controller, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = customAssetDetailsV2Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.v, continuation, 0);
            default:
                return new o(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CustomAssetDetailsV2Controller customAssetDetailsV2Controller = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x) customAssetDetailsV2Controller.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) customAssetDetailsV2Controller.e3();
                cli.y yVar = xVar.f282301s;
                if (xVar.I2()) {
                    xVar.l1().M0(new TotalWealthContract$Events.NavigateToEditAsset(((a) ((j2) yVar.f22677a).getValue()).f282264a, ((a) ((j2) yVar.f22677a).getValue()).f282265b, 4));
                }
                break;
        }
        return Unit.f186387a;
    }
}
