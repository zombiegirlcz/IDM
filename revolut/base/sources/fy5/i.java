package fy5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f138922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f138923c;

    public /* synthetic */ i(Flow flow, m mVar, int i) {
        this.f138921a = i;
        this.f138922b = flow;
        this.f138923c = mVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f138921a) {
            case 0:
                Object objCollect = this.f138922b.collect(new h(flowCollector, this.f138923c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f138922b.collect(new h(flowCollector, this.f138923c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
