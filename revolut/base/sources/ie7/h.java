package ie7;

import com.revolut.feature.credit.application.plugins.impl.ui.valuators.list.ValuatorsListScreen;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import hd.r;
import ish.z;
import iyg.a0;
import jb1.x;
import jck.c0;
import jhe.t;
import jwf.n;
import k25.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import vkm.q0;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f160666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f160667c;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f160665a = i;
        this.f160666b = obj2;
        this.f160667c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f160665a) {
            case 0:
                Object objCollect = ((Flow) this.f160666b).collect(new i52.l(flowCollector, (r) this.f160667c, 5), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f160666b).collect(new i52.l(flowCollector, (ValuatorsListScreen) this.f160667c, 7), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((j23.b) this.f160666b).collect(new i52.l(flowCollector, (ina.j) this.f160667c, 9), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((v1) this.f160666b).collect(new img.c(flowCollector, (z) this.f160667c), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((v1) this.f160666b).collect(new i52.l(flowCollector, (iuf.d) this.f160667c, 11), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((Flow) this.f160666b).collect(new i52.l(flowCollector, (com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a) this.f160667c, 12), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((g48.r) this.f160666b).collect(new i52.l(flowCollector, (PurchasedTransitTicket.Activated) this.f160667c, 13), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((vkm.d) this.f160666b).collect(new a0(flowCollector, (x) this.f160667c), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((Flow) this.f160666b).collect(new i52.l(flowCollector, (jb7.b) this.f160667c, 14), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((Flow) this.f160666b).collect(new i52.l(flowCollector, (r10.d) this.f160667c, 15), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((j23.b) this.f160666b).collect(new c0(flowCollector, (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) this.f160667c, 0), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((uf0.b) this.f160666b).collect(new c0(flowCollector, (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.a) this.f160667c, 1), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((vkm.d) this.f160666b).collect(new i52.l(flowCollector, (zg3.r) this.f160667c, 16), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((v1) this.f160666b).collect(new i52.l(flowCollector, (t) this.f160667c, 17), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((jhi.b) this.f160666b).collect(new jhd.d(flowCollector, (jie.f) this.f160667c), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((kq.g) this.f160666b).collect(new i52.l(flowCollector, (jki.m) this.f160667c, 18), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((ahe.i) this.f160666b).collect(new ahd.b(flowCollector, (String) this.f160667c, 20), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((ulh.l) this.f160666b).collect(new ahd.b(flowCollector, (String) this.f160667c, 21), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((ulh.l) this.f160666b).collect(new ahd.b(flowCollector, (String) this.f160667c, 22), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((wkm.l) this.f160666b).collect(new i52.l(flowCollector, (n) this.f160667c, 19), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((vkm.d) this.f160666b).collect(new i52.l(flowCollector, (WidgetisedAnalyticsType) this.f160667c, 21), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((j23.b) this.f160666b).collect(new i52.l(flowCollector, (jy5.d) this.f160667c, 22), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((Flow) this.f160666b).collect(new i52.l(flowCollector, (com.revolut.feature_crypto_order_flow.impl.order_summary.a) this.f160667c, 24), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((q0) this.f160666b).collect(new i52.l(flowCollector, (u) this.f160667c, 25), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((j23.b) this.f160666b).collect(new jsl.k(flowCollector, (u) this.f160667c), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Flow[] flowArr = (Flow[]) this.f160666b;
                Object objG = e0.g(continuation, new h52.c(flowArr, 9), new jy6.l((Continuation) null, (k49.b) this.f160667c, 7), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect26 = ((Flow) this.f160666b).collect(new i52.l(flowCollector, (z45.e) this.f160667c, 28), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect27 = ((Flow) this.f160666b).collect(new i52.l(flowCollector, (s69.j) this.f160667c, 29), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect28 = ((jhi.b) this.f160666b).collect(new k7i.c(flowCollector, (AccountWrapper) this.f160667c, 0), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect29 = ((Flow) this.f160666b).collect(new k7i.c(flowCollector, (k97.d) this.f160667c, 1), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
