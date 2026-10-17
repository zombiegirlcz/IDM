package dd5;

import cxe.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f113112b;

    public /* synthetic */ e(u uVar, int i) {
        this.f113111a = i;
        this.f113112b = uVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f113111a) {
            case 0:
                Object objCollect = this.f113112b.collect(new dah.d(flowCollector, 18), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f113112b.collect(new x4k.e(flowCollector, 13), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
