package n1g;

import ble.c1;
import com.revolut.data.model.Data;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import n33.t0;
import n4d.o0;
import n8i.y0;
import vkm.t1;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f211338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f211339c;

    public /* synthetic */ p(Flow flow, Object obj2, int i) {
        this.f211337a = i;
        this.f211338b = flow;
        this.f211339c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f211337a) {
            case 0:
                Object objCollect = ((akg.n) this.f211338b).collect(new b8d.a0(flowCollector, (Data) this.f211339c, 10), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((tnb.k) this.f211338b).collect(new lmg.k(flowCollector, (n24.c) this.f211339c, 17), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((vkm.f) this.f211338b).collect(new n30.j(flowCollector, (UUID) this.f211339c, 0), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((jhi.b) this.f211338b).collect(new n1j.d(flowCollector, (t0) this.f211339c, 4), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f211338b.collect(new n1j.d(flowCollector, (n4d.m) this.f211339c, 5), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f211338b.collect(new o0(flowCollector, (Pair) this.f211339c, 0), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                t1 t1Var = (t1) this.f211338b;
                Object objCollect7 = t1Var.f290123a.collect(new n1j.d(flowCollector, (n5b.d) this.f211339c, 8), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((c1) this.f211338b).collect(new lmg.k(flowCollector, (n5c.e) this.f211339c, 18), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((cxe.u) this.f211338b).collect(new n5j.e(flowCollector, (n5j.i) this.f211339c, 1), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((vkm.y) this.f211338b).collect(new lmg.k(flowCollector, (l6j.a) this.f211339c, 19), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((vkm.h) this.f211338b).collect(new y0(flowCollector, (com.revolut.feature_move_money.impl.topup.a) this.f211339c, 0), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((vkm.d) this.f211338b).collect(new y0(flowCollector, (com.revolut.feature_move_money.impl.topup.a) this.f211339c, 1), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((vkm.t0) this.f211338b).collect(new y0(flowCollector, (com.revolut.feature_move_money.impl.topup.a) this.f211339c, 2), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f211338b.collect(new lmg.k(flowCollector, (n97.k) this.f211339c, 20), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f211338b.collect(new lmg.k(flowCollector, (prf.g) this.f211339c, 21), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f211338b.collect(new lmg.k(flowCollector, (nd1.i) this.f211339c, 22), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = this.f211338b.collect(new lmg.k(flowCollector, (nd1.n) this.f211339c, 23), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((jhi.b) this.f211338b).collect(new lmg.k(flowCollector, (fdi.c) this.f211339c, 24), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((wkm.l) this.f211338b).collect(new lmg.k(flowCollector, (nkf.c) this.f211339c, 25), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f211338b.collect(new lmg.k(flowCollector, (nkf.f) this.f211339c, 26), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f211338b.collect(new lmg.k(flowCollector, (jul.o) this.f211339c, 27), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((vkm.y) this.f211338b).collect(new lmg.k(flowCollector, (nqd.o) this.f211339c, 28), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = this.f211338b.collect(new lmg.k(flowCollector, (gtb.a) this.f211339c, 29), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((go.g) this.f211338b).collect(new nvk.v(flowCollector, (nyb.b) this.f211339c, 2), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((t38.e) this.f211338b).collect(new nvk.v(flowCollector, (o25.i) this.f211339c, 3), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((wkm.l) this.f211338b).collect(new nvk.v(flowCollector, (o26.g) this.f211339c, 4), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((vkm.d) this.f211338b).collect(new o42.j(flowCollector, (o83.m) this.f211339c, 7), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = this.f211338b.collect(new nvk.v(flowCollector, (com.revolut.feature.revolutpay.impl.ui.summary_screen.f) this.f211339c, 5), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((ob2.d) this.f211338b).collect(new o42.j(flowCollector, (ob2.h) this.f211339c, 16), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((jhi.b) this.f211338b).collect(new o42.j(flowCollector, (ocb.x) this.f211339c, 28), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
