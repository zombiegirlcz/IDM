package kkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class g4 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f184699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n4 f184700c;

    public /* synthetic */ g4(Flow flow, n4 n4Var, int i) {
        this.f184698a = i;
        this.f184699b = flow;
        this.f184700c = n4Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f184698a) {
            case 0:
                Object objCollect = this.f184699b.collect(new f4(flowCollector, this.f184700c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f184699b.collect(new f4(flowCollector, this.f184700c, 3), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
