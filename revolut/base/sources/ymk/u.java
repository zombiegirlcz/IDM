package ymk;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vch.u0;
import vkm.t0;
import vkm.v1;
import xkf.b2;

/* JADX INFO: loaded from: classes11.dex */
public final class u implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f315045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f315046c;

    public /* synthetic */ u(Flow flow, Object obj2, int i) {
        this.f315044a = i;
        this.f315045b = flow;
        this.f315046c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f315044a) {
            case 0:
                Object objCollect = ((t4j.c) this.f315045b).collect(new b2(flowCollector, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) this.f315046c, 16), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.y) this.f315045b).collect(new b2(flowCollector, (do3.u) this.f315046c, 17), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f315045b.collect(new x(flowCollector, (yr5.n) this.f315046c), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((v1) this.f315045b).collect(new b2(flowCollector, (yrb.s) this.f315046c, 18), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((vkm.d) this.f315045b).collect(new b2(flowCollector, (AsftTimeSlotBookingScreen) this.f315046c, 19), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((kq.g) this.f315045b).collect(new b2(flowCollector, (com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.assessment.f) this.f315046c, 20), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((vkm.d) this.f315045b).collect(new vha.a0(flowCollector, (ProductAccountId) this.f315046c, 1), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((t38.e) this.f315045b).collect(new z6k.j(flowCollector, (vfg.p) this.f315046c), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((vkm.d) this.f315045b).collect(new cxe.t(flowCollector, (Function1) this.f315046c, 11), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = this.f315045b.collect(new b2(flowCollector, (zkf.n) this.f315046c, 22), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((j23.b) this.f315045b).collect(new b2(flowCollector, (zkh.r) this.f315046c, 23), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = this.f315045b.collect(new zj6.d(flowCollector, (zm5.e) this.f315046c), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((vkm.d) this.f315045b).collect(new b2(flowCollector, (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.f315046c, 24), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((vkm.d) this.f315045b).collect(new a87.f(flowCollector, (List) this.f315046c, 9), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((vkm.d) this.f315045b).collect(new b2(flowCollector, (zp7.c) this.f315046c, 25), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f315045b.collect(new zrf.f(flowCollector, (vrf.i) this.f315046c, 0), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((t0) this.f315045b).collect(new zrf.f(flowCollector, (vrf.i) this.f315046c, 1), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((vkm.d) this.f315045b).collect(new u0(flowCollector, (dj0.d) this.f315046c, 2), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = this.f315045b.collect(new zul.l(flowCollector, (zy5.o) this.f315046c), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((vkm.d) this.f315045b).collect(new b2(flowCollector, (zzd.v) this.f315046c, 27), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect21 = ((t0) this.f315045b).collect(new b2(flowCollector, (com.revolut.feature.statements.impl.ui.documents_hub.a) this.f315046c, 28), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
