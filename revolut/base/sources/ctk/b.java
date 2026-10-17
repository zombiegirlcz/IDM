package ctk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wkm.l f108681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f108682c;

    public /* synthetic */ b(wkm.l lVar, String str, int i) {
        this.f108680a = i;
        this.f108681b = lVar;
        this.f108682c = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f108680a) {
            case 0:
                Object objCollect = this.f108681b.collect(new ahd.b(flowCollector, this.f108682c, 2), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f108681b.collect(new nj8.g(flowCollector, this.f108682c, 0), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f108681b.collect(new nj8.g(flowCollector, this.f108682c, 20), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
