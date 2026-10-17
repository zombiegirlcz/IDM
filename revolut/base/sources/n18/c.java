package n18;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f211292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt0.b f211293c;

    public /* synthetic */ c(Flow flow, jt0.b bVar, int i) {
        this.f211291a = i;
        this.f211292b = flow;
        this.f211293c = bVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f211291a) {
            case 0:
                Object objCollect = this.f211292b.collect(new b(flowCollector, this.f211293c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f211292b.collect(new b(flowCollector, this.f211293c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
