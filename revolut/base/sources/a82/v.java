package a82;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.u1;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f2026b;

    public /* synthetic */ v(u1 u1Var, int i) {
        this.f2025a = i;
        this.f2026b = u1Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f2025a) {
            case 0:
                Object objCollect = this.f2026b.f290128a.collect(new a07.o(flowCollector, 18), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f2026b.f290128a.collect(new ble.h(flowCollector, 7), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f2026b.f290128a.collect(new cq6.i(flowCollector, 25), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f2026b.f290128a.collect(new dk9.g(flowCollector, 4), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect5 = this.f2026b.f290128a.collect(new oce.c(flowCollector, 21), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
