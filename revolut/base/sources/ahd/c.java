package ahd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f4936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4937c;

    public /* synthetic */ c(Flow flow, String str, int i) {
        this.f4935a = i;
        this.f4936b = flow;
        this.f4937c = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f4935a) {
            case 0:
                Object objCollect = this.f4936b.collect(new b(flowCollector, this.f4937c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f4936b.collect(new b(flowCollector, this.f4937c, 7), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f4936b.collect(new b(flowCollector, this.f4937c, 12), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f4936b.collect(new b(flowCollector, this.f4937c, 17), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f4936b.collect(new b(flowCollector, this.f4937c, 18), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f4936b.collect(new b(flowCollector, this.f4937c, 29), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f4936b.collect(new nj8.g(flowCollector, this.f4937c, 1), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect8 = this.f4936b.collect(new nj8.g(flowCollector, this.f4937c, 9), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
