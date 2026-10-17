package xge;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j23.b f305753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f305754c;
    public final /* synthetic */ qfe.l d;

    public /* synthetic */ x(j23.b bVar, z zVar, qfe.l lVar, int i) {
        this.f305752a = i;
        this.f305753b = bVar;
        this.f305754c = zVar;
        this.d = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f305752a) {
            case 0:
                Object objCollect = this.f305753b.collect(new w(flowCollector, this.f305754c, this.d, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f305753b.collect(new w(flowCollector, this.f305754c, this.d, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
