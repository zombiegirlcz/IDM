package tse;

import com.revolut.camerakit.ui.views.view.CameraKitView;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.top_item.TopItemOfferContentScreen;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import q2e.c0;
import tsk.t;
import tyg.m;
import uh7.q;
import uk2.v;
import uqh.l0;
import urd.x;
import vkm.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f274097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f274098c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f274096a = i;
        this.f274097b = obj2;
        this.f274098c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f274096a) {
            case 0:
                Object objCollect = ((vkm.f) this.f274097b).collect(new b(flowCollector, (TicketDetails) this.f274098c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((t0) this.f274097b).collect(new sij.c(flowCollector, (i) this.f274098c, 22), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((Flow) this.f274097b).collect(new b(flowCollector, (TicketDetails) this.f274098c, 1), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Flow[] flowArr = (Flow[]) this.f274097b;
                Object objG = e0.g(continuation, new c0(flowArr, 17), new tik.b((Continuation) null, (t) this.f274098c, 8), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect4 = ((vkm.d) this.f274097b).collect(new sij.c(flowCollector, (tuj.g) this.f274098c, 23), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect5 = ((Flow) this.f274097b).collect(new sij.c(flowCollector, (twj.f) this.f274098c, 24), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect6 = ((aa7.c) this.f274097b).collect(new a87.f(flowCollector, (List) this.f274098c, 7), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect7 = ((tnb.k) this.f274097b).collect(new sij.c(flowCollector, (m) this.f274098c, 25), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect8 = ((Flow) this.f274097b).collect(new sij.c(flowCollector, (tzl.l) this.f274098c, 26), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect9 = ((vkm.d) this.f274097b).collect(new sij.c(flowCollector, (u25.i) this.f274098c, 27), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect10 = ((j23.b) this.f274097b).collect(new sij.c(flowCollector, (u4b.j) this.f274098c, 29), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect11 = ((vkm.d) this.f274097b).collect(new u97.e(flowCollector, (q97.c0) this.f274098c, 0), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect12 = ((vkm.d) this.f274097b).collect(new u97.e(flowCollector, (ud3.e0) this.f274098c, 1), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect13 = ((jhi.b) this.f274097b).collect(new u97.e(flowCollector, (kbb.c) this.f274098c, 2), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect14 = ((vkm.d) this.f274097b).collect(new u97.e(flowCollector, (TopItemOfferContentScreen) this.f274098c, 4), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect15 = ((Flow) this.f274097b).collect(new u97.e(flowCollector, (hf7.c) this.f274098c, 5), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect16 = ((Flow) this.f274097b).collect(new u97.e(flowCollector, (uf9.e) this.f274098c, 6), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect17 = ((vkm.e) this.f274097b).collect(new u97.e(flowCollector, (v) this.f274098c, 7), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect18 = ((Flow) this.f274097b).collect(new u97.e(flowCollector, (ukf.f) this.f274098c, 8), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect19 = ((Flow) this.f274097b).collect(new u97.e(flowCollector, (ukf.i) this.f274098c, 9), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect20 = ((Flow) this.f274097b).collect(new u97.e(flowCollector, (ukf.l) this.f274098c, 10), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect21 = ((jhi.b) this.f274097b).collect(new q(flowCollector, (ul5.e) this.f274098c, 7), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect22 = ((uf0.b) this.f274097b).collect(new u97.e(flowCollector, (AnalyticsAccountsSelection) this.f274098c, 11), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect23 = ((j23.b) this.f274097b).collect(new u97.e(flowCollector, (ArrayList) this.f274098c, 12), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect24 = ((j23.b) this.f274097b).collect(new u97.e(flowCollector, (l0) this.f274098c, 13), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect25 = ((jhi.b) this.f274097b).collect(new u97.e(flowCollector, (x) this.f274098c, 14), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect26 = ((vkm.d) this.f274097b).collect(new u97.e(flowCollector, (usf.d) this.f274098c, 15), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect27 = ((Flow) this.f274097b).collect(new u97.e(flowCollector, (t1j.b) this.f274098c, 16), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect28 = ((vkm.h) this.f274097b).collect(new u97.e(flowCollector, (com.revolut.feature_crypto_order_flow.impl.exchange.d) this.f274098c, 17), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect29 = ((vkm.d) this.f274097b).collect(new u97.e(flowCollector, (CameraKitView) this.f274098c, 18), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
