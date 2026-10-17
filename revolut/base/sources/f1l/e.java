package f1l;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jhi.b f131299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f131300c;

    public /* synthetic */ e(jhi.b bVar, String str, int i) {
        this.f131298a = i;
        this.f131299b = bVar;
        this.f131300c = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f131298a) {
            case 0:
                Object objCollect = this.f131299b.collect(new ahd.b(flowCollector, this.f131300c, 8), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f131299b.collect(new ahd.b(flowCollector, this.f131300c, 10), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f131299b.collect(new ahd.b(flowCollector, this.f131300c, 13), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f131299b.collect(new ahd.b(flowCollector, this.f131300c, 25), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect5 = this.f131299b.collect(new nj8.g(flowCollector, this.f131300c, 2), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
