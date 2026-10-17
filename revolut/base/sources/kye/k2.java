package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class k2 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f190759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k3 f190760c;

    public /* synthetic */ k2(Flow flow, k3 k3Var, int i) {
        this.f190758a = i;
        this.f190759b = flow;
        this.f190760c = k3Var;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f190758a) {
            case 0:
                Object objCollect = this.f190759b.collect(new j2(flowCollector, this.f190760c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f190759b.collect(new j2(flowCollector, this.f190760c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
