package d7e;

import cxe.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import lkf.q;
import r74.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f111942b;

    public /* synthetic */ f(u uVar, int i) {
        this.f111941a = i;
        this.f111942b = uVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f111941a) {
            case 0:
                Object objCollect = this.f111942b.collect(new d6e.d(flowCollector, 20), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f111942b.collect(new q(flowCollector, 10), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f111942b.collect(new pvk.k(flowCollector, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f111942b.collect(new a0(flowCollector, 4), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect5 = this.f111942b.collect(new zj6.d(flowCollector, 26), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
