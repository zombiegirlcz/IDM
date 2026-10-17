package rf9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f253715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f253716c;

    public /* synthetic */ d(j2 j2Var, l lVar, int i) {
        this.f253714a = i;
        this.f253715b = j2Var;
        this.f253716c = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f253714a) {
            case 0:
                Object objCollect = this.f253715b.collect(new c(flowCollector, this.f253716c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f253715b.collect(new c(flowCollector, this.f253716c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
