package b0a;

import aqd.w0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf0.b f11629b;

    public /* synthetic */ d(uf0.b bVar, int i) {
        this.f11628a = i;
        this.f11629b = bVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f11628a) {
            case 0:
                Object objCollect = this.f11629b.collect(new w0(flowCollector, 29), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f11629b.collect(new p26.j(flowCollector, 11), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f11629b.collect(new spb.f(flowCollector, 7), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
