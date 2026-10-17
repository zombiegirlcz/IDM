package wha;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zfd.e f297467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f297468c;

    public /* synthetic */ j(zfd.e eVar, l lVar, int i) {
        this.f297466a = i;
        this.f297467b = eVar;
        this.f297468c = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f297466a) {
            case 0:
                Object objCollect = this.f297467b.collect(new i(flowCollector, this.f297468c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f297467b.collect(new i(flowCollector, this.f297468c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
