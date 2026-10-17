package kkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class i4 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t38.e f184744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n4 f184745c;

    public /* synthetic */ i4(t38.e eVar, n4 n4Var, int i) {
        this.f184743a = i;
        this.f184744b = eVar;
        this.f184745c = n4Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f184743a) {
            case 0:
                Object objCollect = this.f184744b.collect(new f4(flowCollector, this.f184745c, 1), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f184744b.collect(new f4(flowCollector, this.f184745c, 2), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
