package ghk;

import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.topItem.OfferTopItemContentScreen;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import hmf.f0;
import hmf.h0;
import i4h.p0;
import i6f.t0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f143947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f143948c;

    public /* synthetic */ a0(Flow flow, Object obj2, int i) {
        this.f143946a = i;
        this.f143947b = flow;
        this.f143948c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f143946a) {
            case 0:
                Object objCollect = this.f143947b.collect(new g23.e0(flowCollector, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) this.f143948c, 10), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f143947b).collect(new g23.e0(flowCollector, (gkf.l) this.f143948c, 11), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((gld.i) this.f143947b).collect(new gld.h(flowCollector, (gld.a0) this.f143948c, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((gld.i) this.f143947b).collect(new gld.h(flowCollector, (gld.a0) this.f143948c, 4), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((gld.i) this.f143947b).collect(new gld.h(flowCollector, (gld.a0) this.f143948c, 8), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((gld.i) this.f143947b).collect(new gld.h(flowCollector, (gld.a0) this.f143948c, 10), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((a3i.i) this.f143947b).collect(new gw.y(flowCollector, (gw.d0) this.f143948c, 0), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((vkm.e0) this.f143947b).collect(new gw.y(flowCollector, (gw.d0) this.f143948c, 1), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((jhi.b) this.f143947b).collect(new h2k.i(flowCollector, (h2k.k) this.f143948c, 0), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((vkm.y) this.f143947b).collect(new h2k.i(flowCollector, (h2k.k) this.f143948c, 1), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((ag1.k) this.f143947b).collect(new g23.e0(flowCollector, (h52.e) this.f143948c, 15), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((q0) this.f143947b).collect(new g23.e0(flowCollector, (h87.f) this.f143948c, 16), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((vkm.y) this.f143947b).collect(new g23.e0(flowCollector, (h9c.b) this.f143948c, 18), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((a0) this.f143947b).collect(new ahd.b(flowCollector, (String) this.f143948c, 14), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((vkm.d) this.f143947b).collect(new ha3.w(flowCollector, (Set) this.f143948c, 0), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f143947b.collect(new g23.e0(flowCollector, (com.revolut.feature.pockets.impl.details_v2.pocket_details.a) this.f143948c, 19), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((vkm.d) this.f143947b).collect(new g23.e0(flowCollector, (OfferTopItemContentScreen) this.f143948c, 20), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((jhi.b) this.f143947b).collect(new g23.e0(flowCollector, (hh6.p) this.f143948c, 21), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((t38.e) this.f143947b).collect(new f0(flowCollector, (h0) this.f143948c, 0), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f143947b.collect(new f0(flowCollector, (h0) this.f143948c, 1), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((g0c.e) this.f143947b).collect(new g23.e0(flowCollector, (hmc.a) this.f143948c, 22), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((jhi.b) this.f143947b).collect(new d6j.y(flowCollector, (xi0.b) this.f143948c, 2), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((vkm.d) this.f143947b).collect(new g23.e0(flowCollector, (hxa.c) this.f143948c, 24), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((jhi.b) this.f143947b).collect(new g23.e0(flowCollector, (hzb.i) this.f143948c, 25), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((vkm.d) this.f143947b).collect(new g23.e0(flowCollector, (com.revolut.feature.learn.shared.impl.ui.course.overview.e) this.f143948c, 26), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((q0) this.f143947b).collect(new g23.e0(flowCollector, (i0e.c) this.f143948c, 27), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((tnb.k) this.f143947b).collect(new g23.e0(flowCollector, (p0) this.f143948c, 29), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = this.f143947b.collect(new i52.l(flowCollector, (t0) this.f143948c, 1), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((jhi.b) this.f143947b).collect(new i52.l(flowCollector, (ProductAccountId.Payload) this.f143948c, 2), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = this.f143947b.collect(new i52.l(flowCollector, (ide.d) this.f143948c, 3), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
