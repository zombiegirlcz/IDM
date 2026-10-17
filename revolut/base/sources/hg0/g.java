package hg0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zfd.e f152050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f152051c;
    public final /* synthetic */ String d;

    public /* synthetic */ g(zfd.e eVar, m mVar, String str, int i) {
        this.f152049a = i;
        this.f152050b = eVar;
        this.f152051c = mVar;
        this.d = str;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f152049a) {
            case 0:
                Object objCollect = this.f152050b.collect(new ahd.b(flowCollector, this.f152051c, this.d, 15), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f152050b.collect(new ahd.b(flowCollector, this.f152051c, this.d, 16), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
