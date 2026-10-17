package yc7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import ybh.t0;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t38.e f312552b;

    public /* synthetic */ h(t38.e eVar, int i) {
        this.f312551a = i;
        this.f312552b = eVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f312551a) {
            case 0:
                Object objCollect = this.f312552b.collect(new t0(flowCollector, 5), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f312552b.collect(new t0(flowCollector, 6), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f312552b.collect(new t0(flowCollector, 16), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f312552b.collect(new zj6.d(flowCollector, 25), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f312552b.collect(new zj6.d(flowCollector, 27), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect6 = this.f312552b.collect(new zj6.d(flowCollector, 28), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
