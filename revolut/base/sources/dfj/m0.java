package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ akg.n f114037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f114038c;

    public /* synthetic */ m0(akg.n nVar, String str, int i) {
        this.f114036a = i;
        this.f114037b = nVar;
        this.f114038c = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f114036a) {
            case 0:
                Object objCollect = this.f114037b.collect(new ahd.b(flowCollector, this.f114038c, 4), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f114037b.collect(new ahd.b(flowCollector, this.f114038c, 5), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f114037b.collect(new nj8.g(flowCollector, this.f114038c, 4), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f114037b.collect(new nj8.g(flowCollector, this.f114038c, 15), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f114037b.collect(new nj8.g(flowCollector, this.f114038c, 16), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect6 = this.f114037b.collect(new nj8.g(flowCollector, this.f114038c, 18), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
