package ayf;

import knd.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mjf.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f11165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11166c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Flow flow, Object obj2, boolean z, int i) {
        this.f11164a = i;
        this.f11165b = flow;
        this.d = obj2;
        this.f11166c = z;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f11164a) {
            case 0:
                Object objCollect = this.f11165b.collect(new g(flowCollector, (n) this.d, this.f11166c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f11165b.collect(new g(flowCollector, (hbh.i) this.d, this.f11166c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((g0) this.f11165b).collect(new f3d.f(flowCollector, (hg0.m) this.d, this.f11166c), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((vkm.d) this.f11165b).collect(new g(flowCollector, (k0) this.d, this.f11166c, 2), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((uf0.b) this.f11165b).collect(new g(flowCollector, (jt0.b) this.d, this.f11166c, 4), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect6 = ((t38.e) this.f11165b).collect(new g(flowCollector, (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.d, this.f11166c, 6), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
