package cul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class d1 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.d f109088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109089c;
    public final /* synthetic */ Amount d;

    public /* synthetic */ d1(vkm.d dVar, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Amount amount, int i) {
        this.f109087a = i;
        this.f109088b = dVar;
        this.f109089c = eVar;
        this.d = amount;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f109087a) {
            case 0:
                Object objCollect = this.f109088b.collect(new c1(flowCollector, this.f109089c, this.d, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f109088b.collect(new c1(flowCollector, this.f109089c, this.d, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
