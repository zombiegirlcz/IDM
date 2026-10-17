package rw4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jhi.b f257819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f257820c;

    public /* synthetic */ b(jhi.b bVar, h hVar, int i) {
        this.f257818a = i;
        this.f257819b = bVar;
        this.f257820c = hVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f257818a) {
            case 0:
                Object objCollect = this.f257819b.collect(new rnb.c(flowCollector, this.f257820c, 26), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f257819b.collect(new rnb.c(flowCollector, this.f257820c, 27), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
