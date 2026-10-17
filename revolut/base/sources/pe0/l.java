package pe0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f235297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ KClass f235298c;

    public /* synthetic */ l(Flow flow, KClass kClass, int i) {
        this.f235296a = i;
        this.f235297b = flow;
        this.f235298c = kClass;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f235296a) {
            case 0:
                Object objCollect = this.f235297b.collect(new k(flowCollector, this.f235298c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f235297b.collect(new k(flowCollector, this.f235298c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
