package s6e;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ghk.a0 f260305b;

    public /* synthetic */ q(ghk.a0 a0Var, int i) {
        this.f260304a = i;
        this.f260305b = a0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f260304a) {
            case 0:
                Object objCollect = this.f260305b.collect(new s6b.c(flowCollector, 1), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f260305b.collect(new s6b.c(flowCollector, 2), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
