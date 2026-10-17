package c2d;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f20695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20696c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f20697g;

    public /* synthetic */ g(Flow flow, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f20694a = i;
        this.f20695b = flow;
        this.f20696c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.f20697g = obj6;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f20694a) {
            case 0:
                Object objCollect = ((vkm.d) this.f20695b).collect(new f(flowCollector, (h) this.f20696c, (Set) this.d, (xi0.b) this.e, (Map) this.f, (Comparator) this.f20697g, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f20695b.collect(new f(flowCollector, (List) this.f20696c, (List) this.d, (l3d.h0) this.e, (ogd.k) this.f, (Integer) this.f20697g, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((vkm.y) this.f20695b).collect(new f(flowCollector, (lmd.d) this.f20696c, (String) this.d, (AnalyticsAccount) this.e, (xnd.l) this.f, (xnd.h) this.f20697g, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((jhi.b) this.f20695b).collect(new f(flowCollector, (s9h.h) this.f20696c, (String) this.d, (String) this.e, (dsh.e) this.f, (q0h.i) this.f20697g, 4), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect5 = ((j23.b) this.f20695b).collect(new acb.h(flowCollector, (wda.r) this.f20696c, (List) this.d, (xi0.b) this.e, (String) this.f, (io3.l) this.f20697g), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
