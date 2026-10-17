package tk3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.d f271870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f271871c;

    public /* synthetic */ i(vkm.d dVar, c cVar, int i) {
        this.f271869a = i;
        this.f271870b = dVar;
        this.f271871c = cVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f271869a) {
            case 0:
                Object objCollect = this.f271870b.collect(new h(flowCollector, this.f271871c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f271870b.collect(new h(flowCollector, this.f271871c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
