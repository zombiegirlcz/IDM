package ba4;

import ble.e1;
import bn2.e0;
import cbh.n0;
import cie.a1;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.o2;
import vkm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f13917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13918c;

    public /* synthetic */ x(Flow flow, Object obj2, int i) {
        this.f13916a = i;
        this.f13917b = flow;
        this.f13918c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f13916a) {
            case 0:
                Object objCollect = ((n1g.p) this.f13917b).collect(new a3i.h(flowCollector, (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) this.f13918c, 25), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f13917b.collect(new a3i.h(flowCollector, (bcj.l) this.f13918c, 26), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f13917b.collect(new a3i.h(flowCollector, (bg9.r) this.f13918c, 28), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f13917b.collect(new a3i.h(flowCollector, (ble.b) this.f13918c, 29), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((v1) this.f13917b).collect(new e1(flowCollector, (com.revolut.feature.tab.invest.impl.ui.home.f) this.f13918c, 0), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((wkm.l) this.f13917b).collect(new e1(flowCollector, (bn2.p) this.f13918c, 1), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f13917b.collect(new e1(flowCollector, (e0) this.f13918c, 2), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((akg.n) this.f13917b).collect(new e1(flowCollector, (i1d.b) this.f13918c, 3), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = this.f13917b.collect(new e1(flowCollector, (btb.q) this.f13918c, 4), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((vkm.y) this.f13917b).collect(new bwf.k(flowCollector, (com.revolut.feature.transport.impl.ui.hub.a) this.f13918c, 0), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((x) this.f13917b).collect(new bwf.k(flowCollector, (com.revolut.feature.transport.impl.ui.hub.a) this.f13918c, 1), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = this.f13917b.collect(new e1(flowCollector, (pwg.i) this.f13918c, 5), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((byc.i) this.f13917b).collect(new aci.g(flowCollector, this.f13918c, 1), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f13917b.collect(new e1(flowCollector, (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) this.f13918c, 7), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((vkm.d) this.f13917b).collect(new e1(flowCollector, (c48.g) this.f13918c, 8), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((vkm.d) this.f13917b).collect(new e1(flowCollector, (i6h.e) this.f13918c, 9), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((vkm.h) this.f13917b).collect(new cbh.u(flowCollector, (cbh.y) this.f13918c, 0), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f13917b.collect(new cbh.u(flowCollector, (cbh.y) this.f13918c, 1), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = this.f13917b.collect(new e1(flowCollector, (cbh.z) this.f13918c, 10), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((o2) this.f13917b).collect(new e1(flowCollector, (n0) this.f13918c, 11), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f13917b.collect(new e1(flowCollector, (cgd.c) this.f13918c, 13), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((vkm.d) this.f13917b).collect(new e1(flowCollector, (cia.e) this.f13918c, 15), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((gld.i) this.f13917b).collect(new e1(flowCollector, (cie.z) this.f13918c, 16), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((jhi.b) this.f13917b).collect(new a1(flowCollector, (com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f13918c), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = this.f13917b.collect(new e1(flowCollector, (HomeFeedWidgetContext) this.f13918c, 17), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = this.f13917b.collect(new e1(flowCollector, (ckf.e) this.f13918c, 18), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = this.f13917b.collect(new cli.e(flowCollector, (cli.n) this.f13918c, 0), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((go.g) this.f13917b).collect(new cli.e(flowCollector, (cli.n) this.f13918c, 1), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((kq.g) this.f13917b).collect(new e1(flowCollector, (cli.o) this.f13918c, 19), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = this.f13917b.collect(new e1(flowCollector, (cnh.d) this.f13918c, 20), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
