package orb;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jhi.b f228092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nel.n f228093c;

    public /* synthetic */ g(jhi.b bVar, nel.n nVar, int i) {
        this.f228091a = i;
        this.f228092b = bVar;
        this.f228093c = nVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f228091a) {
            case 0:
                Object objCollect = this.f228092b.collect(new f(flowCollector, this.f228093c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f228092b.collect(new f(flowCollector, this.f228093c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
