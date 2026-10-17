package tb0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.d f269420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f269421c;

    public /* synthetic */ c(vkm.d dVar, h hVar, int i) {
        this.f269419a = i;
        this.f269420b = dVar;
        this.f269421c = hVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f269419a) {
            case 0:
                Object objCollect = this.f269420b.collect(new b(flowCollector, this.f269421c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f269420b.collect(new b(flowCollector, this.f269421c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
