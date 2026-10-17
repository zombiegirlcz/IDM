package ay2;

import aqd.w0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ an9.g f11035b;

    public /* synthetic */ f(an9.g gVar, int i) {
        this.f11034a = i;
        this.f11035b = gVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f11034a) {
            case 0:
                Object objCollect = this.f11035b.collect(new w0(flowCollector, 26), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f11035b.collect(new spb.f(flowCollector, 21), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
