package d6j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.d f111614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f111615c;

    public /* synthetic */ z(vkm.d dVar, xi0.b bVar, int i) {
        this.f111613a = i;
        this.f111614b = dVar;
        this.f111615c = bVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f111613a) {
            case 0:
                Object objCollect = this.f111614b.collect(new y(flowCollector, this.f111615c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f111614b.collect(new y(flowCollector, this.f111615c, 4), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f111614b.collect(new y(flowCollector, this.f111615c, 5), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
