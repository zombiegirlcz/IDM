package akg;

import eg.n0;
import eg.p0;
import jki.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.y;

/* JADX INFO: loaded from: classes13.dex */
public final class n implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f5948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5949c;

    public /* synthetic */ n(Flow flow, Object obj2, int i) {
        this.f5947a = i;
        this.f5948b = flow;
        this.f5949c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f5947a) {
            case 0:
                Object objCollect = ((jhi.b) this.f5948b).collect(new m(flowCollector, (o) this.f5949c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((y) this.f5948b).collect(new n0(flowCollector, (p0) this.f5949c), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f5948b.collect(new m(flowCollector, (Function1) this.f5949c, 1), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((go.g) this.f5948b).collect(new m(flowCollector, (p) this.f5949c, 2), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect5 = this.f5948b.collect(new m(flowCollector, (tk0.g) this.f5949c, 3), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
