package cyh;

import cq6.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf0.b f110103b;

    public /* synthetic */ f(uf0.b bVar, int i) {
        this.f110102a = i;
        this.f110103b = bVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f110102a) {
            case 0:
                Object objCollect = this.f110103b.collect(new i(flowCollector, 26), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f110103b.collect(new d6e.d(flowCollector, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f110103b.collect(new rnb.c(flowCollector, 0), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
