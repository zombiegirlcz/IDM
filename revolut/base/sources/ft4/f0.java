package ft4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cbh.f f137903b;

    public /* synthetic */ f0(cbh.f fVar, int i) {
        this.f137902a = i;
        this.f137903b = fVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f137902a) {
            case 0:
                Object objCollect = this.f137903b.collect(new fod.i(flowCollector, 8), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f137903b.collect(new lkf.q(flowCollector, 5), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f137903b.collect(new v6e.p(flowCollector, 29), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
