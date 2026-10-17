package x8j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oji.f f303471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f303472c;

    public /* synthetic */ s(oji.f fVar, g0 g0Var, int i) {
        this.f303470a = i;
        this.f303471b = fVar;
        this.f303472c = g0Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f303470a) {
            case 0:
                Object objCollect = this.f303471b.collect(new r(flowCollector, this.f303472c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f303471b.collect(new r(flowCollector, this.f303472c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
