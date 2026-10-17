package s6e;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f260313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f260314c;

    public /* synthetic */ v(Object obj2, Object obj3, int i) {
        this.f260312a = i;
        this.f260313b = obj2;
        this.f260314c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f260312a) {
            case 0:
                Object objCollect = ((jhi.b) this.f260313b).collect(new qx4.b(flowCollector, (z) this.f260314c, 26), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f260313b).collect(new qx4.b(flowCollector, (RecyclerView) this.f260314c, 27), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((vkm.d) this.f260313b).collect(new s6b.c(flowCollector, (sc3.c) this.f260314c), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((akg.n) this.f260313b).collect(new sdi.m(flowCollector, (sdi.q) this.f260314c, 0), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((vkm.d) this.f260313b).collect(new sdi.m(flowCollector, (sdi.q) this.f260314c, 1), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((Flow) this.f260313b).collect(new qx4.b(flowCollector, (sf9.i) this.f260314c, 29), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((hy1.b0) this.f260313b).collect(new mc2.j(flowCollector, (hrf.f) this.f260314c, 1), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((vkm.y) this.f260313b).collect(new sij.c(flowCollector, (sje.b) this.f260314c, 2), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((jhi.b) this.f260313b).collect(new sij.c(flowCollector, (sje.h) this.f260314c, 3), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((ryj.w) this.f260313b).collect(new sij.c(flowCollector, (AnalyticsDashboardController) this.f260314c, 4), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((jhi.b) this.f260313b).collect(new sij.c(flowCollector, (srd.q) this.f260314c, 5), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((go.g) this.f260313b).collect(new sij.c(flowCollector, (ss4.y) this.f260314c, 6), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((j23.b) this.f260313b).collect(new sij.c(flowCollector, (st1.f) this.f260314c, 7), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((t0) this.f260313b).collect(new spb.f(flowCollector, (com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) this.f260314c), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((jhi.b) this.f260313b).collect(new su4.s(flowCollector, (OrderQuoteParams) this.f260314c, 0), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((vkm.d) this.f260313b).collect(new sij.c(flowCollector, (suf.h) this.f260314c, 8), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((Flow) this.f260313b).collect(new sij.c(flowCollector, (com.revolut.feature.transport.impl.ui.transit_checkout.fields.a) this.f260314c, 9), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((Flow) this.f260313b).collect(new t05.f(flowCollector, (t5d.c) this.f260314c), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((jhi.b) this.f260313b).collect(new sij.c(flowCollector, (JuniorProductAccountIdPayload) this.f260314c, 11), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Flow[] flowArr = (Flow[]) this.f260313b;
                Object objG = mif.e0.g(continuation, new q2e.c0(flowArr, 14), new s9b.n((Continuation) null, (ryc.a) this.f260314c, 26), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect20 = ((Flow) this.f260313b).collect(new sij.c(flowCollector, (p56.a) this.f260314c, 13), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect21 = ((v) this.f260313b).collect(new rf9.j(flowCollector, (BillFormField) this.f260314c, 1), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect22 = ((Flow) this.f260313b).collect(new tjh.q(flowCollector, (WealthAccount) this.f260314c, 0), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect23 = ((j23.b) this.f260313b).collect(new sij.c(flowCollector, (TradingLegalEntityInformation) this.f260314c, 14), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect24 = ((wkm.l) this.f260313b).collect(new tjh.q(flowCollector, (WealthAccount) this.f260314c, 1), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect25 = ((uf0.b) this.f260313b).collect(new sij.c(flowCollector, (tjh.h0) this.f260314c, 15), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect26 = ((uf0.b) this.f260313b).collect(new sij.c(flowCollector, (WealthAccount.Robo) this.f260314c, 17), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect27 = ((jhi.b) this.f260313b).collect(new sij.c(flowCollector, (jpc.e) this.f260314c, 18), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect28 = ((j23.b) this.f260313b).collect(new sij.c(flowCollector, (tlf.i) this.f260314c, 19), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect29 = ((vkm.d) this.f260313b).collect(new sij.c(flowCollector, (k18.c) this.f260314c, 20), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
