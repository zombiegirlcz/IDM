package q97;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes21.dex */
public final class v2 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jhi.b f243808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x2 f243809c;

    public /* synthetic */ v2(jhi.b bVar, x2 x2Var, int i) {
        this.f243807a = i;
        this.f243808b = bVar;
        this.f243809c = x2Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f243807a) {
            case 0:
                Object objCollect = this.f243808b.collect(new u2(flowCollector, this.f243809c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f243808b.collect(new u2(flowCollector, this.f243809c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
