package ss4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.f f265276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yx4.a f265277c;

    public /* synthetic */ h(vkm.f fVar, yx4.a aVar, int i) {
        this.f265275a = i;
        this.f265276b = fVar;
        this.f265277c = aVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f265275a) {
            case 0:
                Object objCollect = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 16), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 17), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 18), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 19), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 20), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 21), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 22), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect8 = this.f265276b.collect(new ly4.g(flowCollector, this.f265277c, 23), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
