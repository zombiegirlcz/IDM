package m5j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jhi.b f202943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f202944c;

    public /* synthetic */ c(jhi.b bVar, g gVar, int i) {
        this.f202942a = i;
        this.f202943b = bVar;
        this.f202944c = gVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f202942a) {
            case 0:
                Object objCollect = this.f202943b.collect(new b(flowCollector, this.f202944c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f202943b.collect(new b(flowCollector, this.f202944c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f202943b.collect(new b(flowCollector, this.f202944c, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
