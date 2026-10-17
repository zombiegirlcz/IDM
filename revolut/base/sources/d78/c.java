package d78;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vy5.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go.g f111835b;

    public /* synthetic */ c(go.g gVar, int i) {
        this.f111834a = i;
        this.f111835b = gVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f111834a) {
            case 0:
                Object objCollect = this.f111835b.collect(new d6e.d(flowCollector, 16), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f111835b.collect(new ntf.q(flowCollector, 18), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f111835b.collect(new qph.g(flowCollector, 15), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f111835b.collect(new c0(flowCollector, 9), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f111835b.collect(new c0(flowCollector, 19), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect6 = this.f111835b.collect(new wa3.h(flowCollector, 12), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
