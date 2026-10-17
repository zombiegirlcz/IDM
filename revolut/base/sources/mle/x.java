package mle;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pkf.d1;
import q97.g0;
import tof.a3;
import vkm.q0;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f206698c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Flow flow, Object obj2, Object obj3, int i) {
        this.f206696a = i;
        this.f206698c = flow;
        this.f206697b = obj2;
        this.d = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f206696a) {
            case 0:
                Object objCollect = ((q0) this.f206698c).collect(new im9.k(flowCollector, (z) this.f206697b, (WealthAccount.Robo) this.d, 14), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f206698c.collect(new im9.k(flowCollector, (z) this.f206697b, (WealthAccount.Securities) this.d, 15), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((zfd.e) this.f206698c).collect(new im9.k(flowCollector, (String) this.f206697b, (o28.f) this.d, 16), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((rv6.e) this.f206698c).collect(new im9.k(flowCollector, (Function1) this.f206697b, (o65.l) this.d, 17), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f206698c.collect(new im9.k(flowCollector, (o69.g) this.f206697b, (String) this.d, 18), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f206698c.collect(new im9.k(flowCollector, (oh5.d) this.f206697b, (xi0.b) this.d, 19), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((cxe.u) this.f206698c).collect(new im9.k(flowCollector, (okf.o) this.f206697b, (String) this.d, 20), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((cxe.u) this.f206698c).collect(new im9.k(flowCollector, (okf.r) this.f206697b, (tof.v) this.d, 21), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((vkm.d) this.f206698c).collect(new im9.k(flowCollector, (hd.r) this.f206697b, (PricingPlanWaitlistEntry) this.d, 22), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((vkm.d) this.f206698c).collect(new im9.k(flowCollector, (pkf.z) this.f206697b, (a3) this.d, 23), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((jhi.b) this.f206698c).collect(new nj8.g(flowCollector, (pw4.e) this.f206697b, (String) this.d, 5), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((vkm.d) this.f206698c).collect(new q3j.b(flowCollector, (q3j.c) this.f206697b, (List) this.d, 0), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((jhi.b) this.f206698c).collect(new q3j.b(flowCollector, (g0) this.f206697b, (p97.a) this.d, 1), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f206698c.collect(new q9c.x(flowCollector, (q9c.b0) this.f206697b, (t6c.o) this.d), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((wkm.l) this.f206698c).collect(new q9c.x(flowCollector, (t6c.o) this.f206697b, (q9c.b0) this.d), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((vkm.y) this.f206698c).collect(new d1(flowCollector, (kdh.b) this.f206697b, (ftb.b) this.d), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((jhi.b) this.f206698c).collect(new nj8.g(flowCollector, (qw4.c) this.f206697b, (String) this.d, 8), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((jhi.b) this.f206698c).collect(new qx4.b(flowCollector, (qx4.f) this.f206697b, (w4l.k) this.d, 0), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((vkm.d) this.f206698c).collect(new q3j.b(flowCollector, (ra0.f) this.f206697b, (File) this.d, 2), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((jhi.b) this.f206698c).collect(new qx4.b(flowCollector, (rbh.z) this.f206697b, (rbh.t) this.d, 7), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((jhi.b) this.f206698c).collect(new q3j.b(flowCollector, (Function1) this.f206697b, (String) this.d, 3), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f206698c.collect(new q3j.b(flowCollector, (rgf.y) this.f206697b, (Set) this.d, 4), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = this.f206698c.collect(new q3j.b(flowCollector, (rnf.l) this.f206697b, (String) this.d, 5), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((akg.n) this.f206698c).collect(new qx4.b(flowCollector, (ogm.i) this.f206697b, (trk.a) this.d, 19), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((vkm.d) this.f206698c).collect(new q3j.b(flowCollector, (s3d.d) this.f206697b, (String) this.d, 7), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((v0b.b) this.f206698c).collect(new q3j.b(flowCollector, (s57.m) this.f206697b, (String) this.d, 8), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((qij.s) this.f206698c).collect(new q3j.b(flowCollector, (saj.h) this.f206697b, (String) this.d, 9), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((vkm.d) this.f206698c).collect(new q3j.b(flowCollector, (sc7.f) this.f206697b, (String) this.d, 10), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((j23.b) this.f206698c).collect(new q3j.b(flowCollector, (j49.i) this.f206697b, (sdi.d) this.d, 11), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = this.f206698c.collect(new q3j.b(flowCollector, (sw4.h) this.f206697b, (String) this.d, 12), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
