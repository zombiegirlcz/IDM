package d73;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ax9.o f111786b;

    public /* synthetic */ i(ax9.o oVar, int i) {
        this.f111785a = i;
        this.f111786b = oVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f111785a) {
            case 0:
                Object objCollect = this.f111786b.collect(new d6e.d(flowCollector, 11), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f111786b.collect(new wa3.h(flowCollector, 0), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
