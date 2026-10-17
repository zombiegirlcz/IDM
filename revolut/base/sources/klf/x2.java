package klf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class x2 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.q0 f185604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z2 f185605c;

    public /* synthetic */ x2(vkm.q0 q0Var, z2 z2Var, int i) {
        this.f185603a = i;
        this.f185604b = q0Var;
        this.f185605c = z2Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f185603a) {
            case 0:
                Object objCollect = this.f185604b.collect(new w2(flowCollector, this.f185605c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f185604b.collect(new w2(flowCollector, this.f185605c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
