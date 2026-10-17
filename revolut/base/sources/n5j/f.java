package n5j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.d f212620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f212621c;

    public /* synthetic */ f(vkm.d dVar, i iVar, int i) {
        this.f212619a = i;
        this.f212620b = dVar;
        this.f212621c = iVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f212619a) {
            case 0:
                Object objCollect = this.f212620b.collect(new e(flowCollector, this.f212621c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f212620b.collect(new e(flowCollector, this.f212621c, 2), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
