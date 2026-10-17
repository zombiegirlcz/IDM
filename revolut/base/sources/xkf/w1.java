package xkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class w1 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f306792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f306793c;

    public /* synthetic */ w1(Flow flow, z1 z1Var, int i) {
        this.f306791a = i;
        this.f306792b = flow;
        this.f306793c = z1Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f306791a) {
            case 0:
                Object objCollect = this.f306792b.collect(new v1(flowCollector, this.f306793c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f306792b.collect(new v1(flowCollector, this.f306793c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
