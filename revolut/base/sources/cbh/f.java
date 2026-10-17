package cbh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0f.p f22812b;

    public /* synthetic */ f(v0f.p pVar, int i) {
        this.f22811a = i;
        this.f22812b = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f22811a) {
            case 0:
                Object objCollect = this.f22812b.collect(new c65.h(flowCollector, 6), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f22812b.collect(new god.k(flowCollector, 20), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f22812b.collect(new iyg.a0(flowCollector, 26), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f22812b.collect(new oce.c(flowCollector, 9), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect5 = this.f22812b.collect(new v6e.p(flowCollector, 25), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
