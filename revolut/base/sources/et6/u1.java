package et6;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f129341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129342c;

    public /* synthetic */ u1(Object obj2, Object obj3, int i) {
        this.f129340a = i;
        this.f129341b = obj2;
        this.f129342c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f129340a) {
            case 0:
                Object objCollect = ((jhi.b) this.f129341b).collect(new cxe.t(flowCollector, (Function1) this.f129342c, 1), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.v1) this.f129341b).collect(new d6j.y(flowCollector, (xi0.b) this.f129342c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Flow[] flowArr = (Flow[]) this.f129341b;
                Object objG = mif.e0.g(continuation, new ag1.i(flowArr, 20), new dz6.n(null, (eu7.b) this.f129342c, 19), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect3 = ((Flow) this.f129341b).collect(new dc0.c(flowCollector, (ey5.j) this.f129342c, 20), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect4 = ((j23.b) this.f129341b).collect(new dc0.c(flowCollector, (r10.w) this.f129342c, 21), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect5 = ((jhi.b) this.f129341b).collect(new dc0.c(flowCollector, (f23.l0) this.f129342c, 22), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Flow[] flowArr2 = (Flow[]) this.f129341b;
                Object objG2 = mif.e0.g(continuation, new ag1.i(flowArr2, 22), new dz6.n(null, (f39.c) this.f129342c, 29), flowCollector, flowArr2);
                if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect6 = ((a87.b) this.f129341b).collect(new f88.i(flowCollector, (f88.k) this.f129342c), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect7 = ((Flow) this.f129341b).collect(new dc0.c(flowCollector, (fhf.j) this.f129342c, 24), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                vkm.t1 t1Var = (vkm.t1) this.f129341b;
                Object objCollect8 = t1Var.f290123a.collect(new dc0.c(flowCollector, (com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f) this.f129342c, 25), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect9 = ((jhi.b) this.f129341b).collect(new fod.i(flowCollector, (fp4.b) this.f129342c, 3), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect10 = ((Flow) this.f129341b).collect(new dc0.c(flowCollector, (k01.l) this.f129342c, 26), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect11 = ((uf0.b) this.f129341b).collect(new dc0.c(flowCollector, (ftk.d) this.f129342c, 27), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect12 = ((Flow) this.f129341b).collect(new dc0.c(flowCollector, (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) this.f129342c, 28), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect13 = ((vkm.v1) this.f129341b).collect(new dc0.c(flowCollector, (g23.u) this.f129342c, 29), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect14 = ((vkm.y) this.f129341b).collect(new g23.e0(flowCollector, (g23.g0) this.f129342c, 0), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect15 = ((Flow) this.f129341b).collect(new fod.i(flowCollector, (g23.k0) this.f129342c, 29), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect16 = ((akg.n) this.f129341b).collect(new g25.c(flowCollector, (g25.i) this.f129342c, 0), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect17 = ((vkm.d) this.f129341b).collect(new g25.c(flowCollector, (g25.i) this.f129342c, 1), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect18 = ((akg.n) this.f129341b).collect(new g23.e0(flowCollector, (g2d.d) this.f129342c, 1), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect19 = ((ag1.k) this.f129341b).collect(new g23.e0(flowCollector, (g32.b) this.f129342c, 2), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect20 = ((akg.n) this.f129341b).collect(new g23.e0(flowCollector, (r10.f) this.f129342c, 3), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect21 = ((cxe.u) this.f129341b).collect(new ahd.b(flowCollector, (String) this.f129342c, 11), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect22 = ((Flow) this.f129341b).collect(new g23.e0(flowCollector, (g48.r0) this.f129342c, 4), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect23 = ((vkm.y) this.f129341b).collect(new b8d.a0(flowCollector, (Data) this.f129342c, 3), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect24 = ((ag1.k) this.f129341b).collect(new g23.e0(flowCollector, (g4k.p) this.f129342c, 5), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect25 = ((vkm.q0) this.f129341b).collect(new g23.e0(flowCollector, (com.revolut.feature.credit.application.plugins.impl.ui.card_ordering.a) this.f129342c, 6), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect26 = ((vkm.d) this.f129341b).collect(new g23.e0(flowCollector, (k7d.b) this.f129342c, 7), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect27 = ((vkm.d) this.f129341b).collect(new g23.e0(flowCollector, (g9j.t) this.f129342c, 8), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect28 = ((Flow) this.f129341b).collect(new g23.e0(flowCollector, (yg3.c) this.f129342c, 9), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
