package cul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class f2 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jhi.b f109103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109104c;
    public final /* synthetic */ qvl.a d;

    public /* synthetic */ f2(jhi.b bVar, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, qvl.a aVar, int i) {
        this.f109102a = i;
        this.f109103b = bVar;
        this.f109104c = eVar;
        this.d = aVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f109102a) {
            case 0:
                Object objCollect = this.f109103b.collect(new e2(flowCollector, this.f109104c, this.d, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f109103b.collect(new e2(flowCollector, this.f109104c, this.d, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
