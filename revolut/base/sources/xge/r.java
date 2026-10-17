package xge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f305741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f305742c;
    public final /* synthetic */ rfe.j d;

    public /* synthetic */ r(Flow flow, u uVar, rfe.j jVar, int i) {
        this.f305740a = i;
        this.f305741b = flow;
        this.f305742c = uVar;
        this.d = jVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f305740a) {
            case 0:
                Object objCollect = this.f305741b.collect(new q(flowCollector, this.f305742c, this.d, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f305741b.collect(new q(flowCollector, this.f305742c, this.d, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
