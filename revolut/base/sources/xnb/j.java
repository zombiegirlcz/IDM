package xnb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ akg.n f307354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f307355c;

    public /* synthetic */ j(akg.n nVar, q qVar, int i) {
        this.f307353a = i;
        this.f307354b = nVar;
        this.f307355c = qVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f307353a) {
            case 0:
                Object objCollect = this.f307354b.collect(new f(flowCollector, this.f307355c, 1), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f307354b.collect(new f(flowCollector, this.f307355c, 2), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
