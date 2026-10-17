package ulh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import uh7.q;
import vkm.y;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f281014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f281015c;

    public /* synthetic */ l(y yVar, n nVar, int i) {
        this.f281013a = i;
        this.f281014b = yVar;
        this.f281015c = nVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f281013a) {
            case 0:
                Object objCollect = this.f281014b.collect(new q(flowCollector, this.f281015c, 14), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f281014b.collect(new q(flowCollector, this.f281015c, 15), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
