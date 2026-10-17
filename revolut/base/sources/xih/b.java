package xih;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import vge.w2;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow[] f306400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f306401c;

    public /* synthetic */ b(Flow[] flowArr, c cVar, int i) {
        this.f306399a = i;
        this.f306400b = flowArr;
        this.f306401c = cVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f306399a) {
            case 0:
                Flow[] flowArr = this.f306400b;
                Object objG = e0.g(continuation, new w2(flowArr, 7), new a(null, this.f306401c, 0), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Flow[] flowArr2 = this.f306400b;
                Object objG2 = e0.g(continuation, new w2(flowArr2, 8), new a(null, this.f306401c, 1), flowCollector, flowArr2);
                if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
