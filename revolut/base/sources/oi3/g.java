package oi3;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import k25.o;
import kkf.t6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import nvk.v;
import okf.c0;
import okf.k;
import okf.u;
import okf.z;
import olf.l;
import om4.u0;
import ood.q0;
import pkf.d1;
import pkf.d2;
import pkf.h1;
import pkf.i0;
import pkf.k2;
import pkf.n;
import pkf.p1;
import pkf.q;
import pkf.q2;
import pkf.s;
import pkf.u1;
import sx2.x;
import vkm.y;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f225428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f225429c;

    public /* synthetic */ g(Object obj2, Object obj3, int i) {
        this.f225427a = i;
        this.f225428b = obj2;
        this.f225429c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f225427a) {
            case 0:
                Object objCollect = ((y) this.f225428b).collect(new v(flowCollector, (h) this.f225429c, 8), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Flow[] flowArr = (Flow[]) this.f225428b;
                Object objG = e0.g(continuation, new h52.c(flowArr, 24), new o((Continuation) null, (x) this.f225429c, 27), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Flow[] flowArr2 = (Flow[]) this.f225428b;
                Object objG2 = e0.g(continuation, new h52.c(flowArr2, 25), new o((Continuation) null, (t6) this.f225429c, 28), flowCollector, flowArr2);
                if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect2 = ((Flow) this.f225428b).collect(new v(flowCollector, (okf.h) this.f225429c, 10), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect3 = ((Flow) this.f225428b).collect(new v(flowCollector, (k) this.f225429c, 11), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect4 = ((Flow) this.f225428b).collect(new v(flowCollector, (u) this.f225429c, 12), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect5 = ((Flow) this.f225428b).collect(new v(flowCollector, (z) this.f225429c, 13), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect6 = ((Flow) this.f225428b).collect(new v(flowCollector, (c0) this.f225429c, 14), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect7 = ((uf0.b) this.f225428b).collect(new v(flowCollector, (olf.c) this.f225429c, 15), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect8 = ((Flow) this.f225428b).collect(new v(flowCollector, (l) this.f225429c, 16), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect9 = ((Flow) this.f225428b).collect(new oce.c(flowCollector, (u0) this.f225429c), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect10 = ((vkm.d) this.f225428b).collect(new v(flowCollector, (TripsListController) this.f225429c, 17), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect11 = ((Flow) this.f225428b).collect(new v(flowCollector, (q0) this.f225429c, 18), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect12 = ((wkm.l) this.f225428b).collect(new v(flowCollector, (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) this.f225429c, 19), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect13 = ((oji.f) this.f225428b).collect(new v(flowCollector, (SplitAccountsItemGroup) this.f225429c, 20), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect14 = ((Flow) this.f225428b).collect(new v(flowCollector, (com.revolut.feature.rev_points.impl.ui.transactions.flow.c) this.f225429c, 21), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect15 = ((vkm.d) this.f225428b).collect(new v(flowCollector, (p26.c) this.f225429c, 22), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect16 = ((Flow) this.f225428b).collect(new v(flowCollector, (pf9.g) this.f225429c, 23), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect17 = ((uf0.b) this.f225428b).collect(new v(flowCollector, (pkf.h) this.f225429c, 24), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect18 = ((Flow) this.f225428b).collect(new v(flowCollector, (pkf.k) this.f225429c, 25), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect19 = ((Flow) this.f225428b).collect(new v(flowCollector, (n) this.f225429c, 26), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect20 = ((j23.b) this.f225428b).collect(new v(flowCollector, (q) this.f225429c, 27), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect21 = ((Flow) this.f225428b).collect(new v(flowCollector, (s) this.f225429c, 28), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect22 = ((j23.b) this.f225428b).collect(new v(flowCollector, (i0) this.f225429c, 29), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect23 = ((wkm.l) this.f225428b).collect(new d1(flowCollector, (h1) this.f225429c, 0), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect24 = ((wkm.l) this.f225428b).collect(new d1(flowCollector, (p1) this.f225429c, 1), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect25 = ((j23.b) this.f225428b).collect(new d1(flowCollector, (u1) this.f225429c, 2), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect26 = ((j23.b) this.f225428b).collect(new d1(flowCollector, (d2) this.f225429c, 3), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect27 = ((j23.b) this.f225428b).collect(new d1(flowCollector, (k2) this.f225429c, 4), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect28 = ((vkm.f) this.f225428b).collect(new d1(flowCollector, (q2) this.f225429c, 5), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
