package br4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qna.n f17910b;

    public /* synthetic */ k0(qna.n nVar, int i) {
        this.f17909a = i;
        this.f17910b = nVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f17909a) {
            case 0:
                Object objCollect = this.f17910b.collect(new bq5.o(flowCollector, 3), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f17910b.collect(new yuc.d(flowCollector, 29), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
