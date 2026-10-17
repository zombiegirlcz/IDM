package vge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j23.b f288929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f288930c;

    public /* synthetic */ j1(j23.b bVar, l1 l1Var, int i) {
        this.f288928a = i;
        this.f288929b = bVar;
        this.f288930c = l1Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f288928a) {
            case 0:
                Object objCollect = this.f288929b.collect(new i1(flowCollector, this.f288930c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f288929b.collect(new i1(flowCollector, this.f288930c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
