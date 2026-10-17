package zr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f324513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f324514c;

    public /* synthetic */ i(Flow flow, k kVar, int i) {
        this.f324512a = i;
        this.f324513b = flow;
        this.f324514c = kVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f324512a) {
            case 0:
                Object objCollect = this.f324513b.collect(new h(flowCollector, this.f324514c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f324513b.collect(new h(flowCollector, this.f324514c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
