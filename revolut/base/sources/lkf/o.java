package lkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f196399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f196400c;

    public /* synthetic */ o(SharedFlow sharedFlow, r rVar, int i) {
        this.f196398a = i;
        this.f196399b = sharedFlow;
        this.f196400c = rVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f196398a) {
            case 0:
                Object objCollect = this.f196399b.collect(new l5d.d(flowCollector, this.f196400c, 29), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f196399b.collect(new q(flowCollector, this.f196400c), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
