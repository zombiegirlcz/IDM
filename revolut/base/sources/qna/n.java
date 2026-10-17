package qna;

import ahe.m0;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pkf.d1;
import qwf.v;
import qwf.z;
import r74.a0;
import rgf.w;
import rrc.f0;
import vkm.y;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f247920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f247921c;

    public /* synthetic */ n(Flow flow, Object obj2, int i) {
        this.f247919a = i;
        this.f247920b = flow;
        this.f247921c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f247919a) {
            case 0:
                Object objCollect = ((y) this.f247920b).collect(new d1(flowCollector, (tla.a) this.f247921c, 24), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f247920b.collect(new d1(flowCollector, (rq3.e) this.f247921c, 26), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((vkm.d) this.f247920b).collect(new d1(flowCollector, (LinkedHashMap) this.f247921c, 27), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f247920b.collect(new v(flowCollector, (z) this.f247921c, 0), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((j23.b) this.f247920b).collect(new qx4.b(flowCollector, (r0a.y) this.f247921c, 1), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((d78.c) this.f247920b).collect(new a87.f(flowCollector, (List) this.f247921c, 6), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((j23.b) this.f247920b).collect(new qx4.b(flowCollector, (r3k.f) this.f247921c, 2), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = this.f247920b.collect(new qx4.b(flowCollector, (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a) this.f247921c, 3), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = this.f247920b.collect(new qx4.b(flowCollector, (r97.b) this.f247921c, 4), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((wkm.l) this.f247920b).collect(new qx4.b(flowCollector, (r9k.k) this.f247921c, 5), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((vkm.d) this.f247920b).collect(new qx4.b(flowCollector, (sa5.c) this.f247921c, 6), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((rf9.d) this.f247920b).collect(new rf9.j(flowCollector, (BillFormField) this.f247921c, 0), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((m0) this.f247920b).collect(new qx4.b(flowCollector, (rg3.o) this.f247921c, 8), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((jhi.b) this.f247920b).collect(new qx4.b(flowCollector, (rgf.t) this.f247921c, 9), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f247920b.collect(new qx4.b(flowCollector, (w) this.f247921c, 10), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((jhi.b) this.f247920b).collect(new qx4.b(flowCollector, (prl.e) this.f247921c, 11), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((j23.b) this.f247920b).collect(new qx4.b(flowCollector, (rh9.e) this.f247921c, 12), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((vkm.d) this.f247920b).collect(new qx4.b(flowCollector, (rje.j) this.f247921c, 13), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((t38.e) this.f247920b).collect(new qx4.b(flowCollector, (rk1.d) this.f247921c, 14), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((vkm.d) this.f247920b).collect(new a0(flowCollector, (rl7.d) this.f247921c), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((j23.b) this.f247920b).collect(new qx4.b(flowCollector, (rmf.d) this.f247921c, 15), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f247920b.collect(new qx4.b(flowCollector, (rnd.y) this.f247921c, 16), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((jhi.b) this.f247920b).collect(new qx4.b(flowCollector, (rnf.c) this.f247921c, 17), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = this.f247920b.collect(new qx4.b(flowCollector, (f0) this.f247921c, 18), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((vkm.d) this.f247920b).collect(new qx4.b(flowCollector, (rsk.f) this.f247921c, 20), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = this.f247920b.collect(new qx4.b(flowCollector, (ru5.z) this.f247921c, 21), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((akg.n) this.f247920b).collect(new qx4.b(flowCollector, (Map) this.f247921c, 22), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((vkm.d) this.f247920b).collect(new qx4.b(flowCollector, (ryd.w) this.f247921c, 23), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((vkm.d) this.f247920b).collect(new qx4.b(flowCollector, (ryj.p) this.f247921c, 24), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = this.f247920b.collect(new qx4.b(flowCollector, (com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.f247921c, 25), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
