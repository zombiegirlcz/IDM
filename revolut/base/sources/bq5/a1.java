package bq5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f17691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a f17692c;

    public /* synthetic */ a1(Flow flow, com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, int i) {
        this.f17690a = i;
        this.f17691b = flow;
        this.f17692c = aVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f17690a) {
            case 0:
                Object objCollect = this.f17691b.collect(new z0(flowCollector, this.f17692c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f17691b.collect(new z0(flowCollector, this.f17692c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
