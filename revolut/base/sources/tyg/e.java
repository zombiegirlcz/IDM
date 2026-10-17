package tyg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wkm.d f275574b;

    public /* synthetic */ e(wkm.d dVar, int i) {
        this.f275573a = i;
        this.f275574b = dVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f275573a) {
            case 0:
                Object objCollect = this.f275574b.collect(new tnb.j(flowCollector, 25), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f275574b.collect(new urd.m(flowCollector, 15), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
