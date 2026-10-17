package tjf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class k0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wkm.l f271674b;

    public /* synthetic */ k0(wkm.l lVar, int i) {
        this.f271673a = i;
        this.f271674b = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f271673a) {
            case 0:
                Object objCollect = this.f271674b.collect(new te8.j(flowCollector, 19), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f271674b.collect(new tzh.e(flowCollector, 18), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f271674b.collect(new uxh.c(flowCollector, 4), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f271674b.collect(new wv2.l(flowCollector, 6), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f271674b.collect(new wv2.l(flowCollector, 8), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect6 = this.f271674b.collect(new xv5.f(flowCollector, 25), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
