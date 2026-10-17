package og6;

import jhi.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f225043b;

    public /* synthetic */ d(k kVar, int i) {
        this.f225042a = i;
        this.f225043b = kVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f225042a) {
            case 0:
                Object objCollect = this.f225043b.collect(new oce.c(flowCollector, 3), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f225043b.collect(new oce.c(flowCollector, 4), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
