package huh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mle.t;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t38.e f155663b;

    public /* synthetic */ j(t38.e eVar, int i) {
        this.f155662a = i;
        this.f155663b = eVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f155662a) {
            case 0:
                Object objCollect = this.f155663b.collect(new hg4.i(flowCollector, 29), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f155663b.collect(new t(flowCollector, 0), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
