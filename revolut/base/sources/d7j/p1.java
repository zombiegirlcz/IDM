package d7j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class p1 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f112040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io3.d f112041c;

    public /* synthetic */ p1(Flow flow, io3.d dVar, int i) {
        this.f112039a = i;
        this.f112040b = flow;
        this.f112041c = dVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f112039a) {
            case 0:
                Object objCollect = this.f112040b.collect(new o1(flowCollector, this.f112041c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f112040b.collect(new o1(flowCollector, this.f112041c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f112040b.collect(new o1(flowCollector, this.f112041c, 3), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
