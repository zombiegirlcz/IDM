package vge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class k2 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.y f288936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f288937c;

    public /* synthetic */ k2(vkm.y yVar, t2 t2Var, int i) {
        this.f288935a = i;
        this.f288936b = yVar;
        this.f288937c = t2Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f288935a) {
            case 0:
                Object objCollect = this.f288936b.collect(new v6e.p(flowCollector, this.f288937c), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f288936b.collect(new u97.e(flowCollector, this.f288937c, 25), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
