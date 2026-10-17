package tf1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class i0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f270169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qf1.l f270170c;

    public /* synthetic */ i0(Flow flow, qf1.l lVar, int i) {
        this.f270168a = i;
        this.f270169b = flow;
        this.f270170c = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f270168a) {
            case 0:
                Object objCollect = this.f270169b.collect(new h0(flowCollector, this.f270170c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f270169b.collect(new h0(flowCollector, this.f270170c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f270169b.collect(new h0(flowCollector, this.f270170c, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
