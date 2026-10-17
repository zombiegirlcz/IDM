package pkg;

import ax9.o;
import com.revolut.feature.derivatives.models.BalanceWithPnl;
import d6j.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import nel.n;
import pkf.d1;
import pkf.x;
import ptf.l;
import q09.m0;
import q2e.c0;
import q97.d2;
import q97.e3;
import q97.g0;
import q97.j3;
import q97.s;
import q97.w0;
import qb3.p;
import qkf.m;
import vkm.t1;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f237172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f237173c;

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f237171a = i;
        this.f237172b = obj2;
        this.f237173c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f237171a) {
            case 0:
                Object objCollect = ((Flow) this.f237172b).collect(new pkf.g(flowCollector, (f) this.f237173c), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((Flow) this.f237172b).collect(new d1(flowCollector, (plf.c) this.f237173c, 6), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((v0b.b) this.f237172b).collect(new d1(flowCollector, (plh.g) this.f237173c, 7), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((vkm.d) this.f237172b).collect(new orb.f(flowCollector, (n) this.f237173c, 2), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((Flow) this.f237172b).collect(new d1(flowCollector, (l) this.f237173c, 8), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((vkm.d) this.f237172b).collect(new d1(flowCollector, (m0) this.f237173c, 9), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                t1 t1Var = (t1) this.f237172b;
                Object objCollect7 = t1Var.f290123a.collect(new y(flowCollector, (xi0.b) this.f237173c, 3), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Flow[] flowArr = (Flow[]) this.f237172b;
                Object objG = e0.g(continuation, new c0(flowArr, 0), new x(null, (com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.f237173c, 20), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect8 = ((vkm.d) this.f237172b).collect(new d1(flowCollector, (q4h.d) this.f237173c, 10), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect9 = ((vkm.d) this.f237172b).collect(new d1(flowCollector, (q55.b) this.f237173c, 11), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect10 = ((o) this.f237172b).collect(new q5g.f(flowCollector, (q5g.h) this.f237173c, 1), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect11 = ((Flow) this.f237172b).collect(new d1(flowCollector, (BalanceWithPnl) this.f237173c, 12), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect12 = ((Flow) this.f237172b).collect(new d1(flowCollector, (q97.d) this.f237173c, 13), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect13 = ((Flow) this.f237172b).collect(new q5g.f(flowCollector, (s) this.f237173c, 15), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect14 = ((jhi.b) this.f237172b).collect(new d1(flowCollector, (q97.x) this.f237173c, 14), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect15 = ((Flow) this.f237172b).collect(new q5g.f(flowCollector, (g0) this.f237173c, 17), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect16 = ((jhi.b) this.f237172b).collect(new q5g.f(flowCollector, (w0) this.f237173c, 20), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect17 = ((jhi.b) this.f237172b).collect(new q5g.f(flowCollector, (d2) this.f237173c, 24), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect18 = ((jhi.b) this.f237172b).collect(new d1(flowCollector, (e3) this.f237173c, 15), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect19 = ((t38.e) this.f237172b).collect(new q5g.f(flowCollector, (j3) this.f237173c, 28), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect20 = ((Flow) this.f237172b).collect(new d1(flowCollector, (t6c.f) this.f237173c, 16), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect21 = ((Flow) this.f237172b).collect(new d1(flowCollector, (t6c.o) this.f237173c, 17), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect22 = ((jhi.b) this.f237172b).collect(new p(flowCollector, (qd8.f) this.f237173c), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect23 = ((vkm.y) this.f237172b).collect(new d1(flowCollector, (qf3.b) this.f237173c, 18), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                t1 t1Var2 = (t1) this.f237172b;
                Object objCollect24 = t1Var2.f290123a.collect(new nj8.g(flowCollector, (String) this.f237173c, 7), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect25 = ((Flow) this.f237172b).collect(new d1(flowCollector, (qje.c) this.f237173c, 19), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect26 = ((Flow) this.f237172b).collect(new d1(flowCollector, (qkf.d) this.f237173c, 20), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect27 = ((Flow) this.f237172b).collect(new d1(flowCollector, (m) this.f237173c, 21), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect28 = ((Flow) this.f237172b).collect(new d1(flowCollector, (qkf.p) this.f237173c, 22), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect29 = ((Flow) this.f237172b).collect(new d1(flowCollector, (qmd.a) this.f237173c, 23), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
