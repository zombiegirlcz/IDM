package cul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class z1 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q87.q f109211b;

    public /* synthetic */ z1(q87.q qVar, int i) {
        this.f109210a = i;
        this.f109211b = qVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f109210a) {
            case 0:
                Object objCollect = this.f109211b.collect(new cq6.i(flowCollector, 22), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f109211b.collect(new hui.d(flowCollector, 3), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f109211b.collect(new wv2.l(flowCollector, 3), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
