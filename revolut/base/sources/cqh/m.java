package cqh;

import ble.e1;
import com.revolut.feature.junior.accounts.impl.ui.switcher.mapper.JuniorDiscoveryProductAccountMapper;
import d6j.n0;
import ej6.a0;
import ekf.i0;
import eql.c0;
import java.util.ArrayList;
import k4l.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import r10.v;
import vkm.t0;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f108118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f108119c;

    public /* synthetic */ m(Object obj2, Object obj3, int i) {
        this.f108117a = i;
        this.f108118b = obj2;
        this.f108119c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f108117a) {
            case 0:
                Object objCollect = ((Flow) this.f108118b).collect(new e1(flowCollector, (com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a) this.f108119c, 22), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((t0) this.f108118b).collect(new e1(flowCollector, (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f108119c, 23), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((Flow) this.f108118b).collect(new e1(flowCollector, (e0) this.f108119c, 24), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((ae8.c) this.f108118b).collect(new e1(flowCollector, (cw9.d) this.f108119c, 25), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((Flow) this.f108118b).collect(new e1(flowCollector, (d4a.b) this.f108119c, 26), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((Flow) this.f108118b).collect(new e1(flowCollector, (n0) this.f108119c, 27), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((Flow) this.f108118b).collect(new d6e.d(flowCollector, (JuniorDiscoveryProductAccountMapper) this.f108119c), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((ag1.k) this.f108118b).collect(new e1(flowCollector, (d92.b) this.f108119c, 28), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((akg.n) this.f108118b).collect(new dc0.c(flowCollector, (cc0.a) this.f108119c, 0), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((Flow) this.f108118b).collect(new dc0.c(flowCollector, (dlf.b) this.f108119c, 2), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((Flow) this.f108118b).collect(new dc0.c(flowCollector, (dlf.d) this.f108119c, 3), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((wkm.l) this.f108118b).collect(new dk9.g(flowCollector, (dlf.j) this.f108119c), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((Flow) this.f108118b).collect(new dc0.c(flowCollector, (dlf.m) this.f108119c, 4), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Flow[] flowArr = (Flow[]) this.f108118b;
                Object objG = mif.e0.g(continuation, new ag1.i(flowArr, 18), new cvi.i((Continuation) null, (ArrayList) this.f108119c, 26), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect14 = ((kq.g) this.f108118b).collect(new dc0.c(flowCollector, (com.revolut.feature.credit.card.impl.ui.instalment.term.b) this.f108119c, 6), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect15 = ((v1) this.f108118b).collect(new dc0.c(flowCollector, (zq.a) this.f108119c, 7), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect16 = ((jhi.b) this.f108118b).collect(new dc0.c(flowCollector, (dy5.e) this.f108119c, 8), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect17 = ((v1) this.f108118b).collect(new dc0.c(flowCollector, (e1g.j) this.f108119c, 9), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect18 = ((jhi.b) this.f108118b).collect(new dc0.c(flowCollector, (v) this.f108119c, 10), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect19 = ((Flow) this.f108118b).collect(new dc0.c(flowCollector, (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) this.f108119c, 12), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect20 = ((Flow) this.f108118b).collect(new dc0.c(flowCollector, (com.revolut.feature.credit.application.plugins.impl.ui.amount_input.b) this.f108119c, 13), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect21 = ((Flow) this.f108118b).collect(new dc0.c(flowCollector, (e8j.e) this.f108119c, 14), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect22 = ((v1) this.f108118b).collect(new dc0.c(flowCollector, (ebk.b) this.f108119c, 15), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect23 = ((Flow) this.f108118b).collect(new a0(flowCollector, (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f108119c, 0), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect24 = ((dfj.f) this.f108118b).collect(new a0(flowCollector, (com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) this.f108119c, 1), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect25 = ((tnb.k) this.f108118b).collect(new egh.e(flowCollector, (ej9.c) this.f108119c), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect26 = ((vkm.e) this.f108118b).collect(new dc0.c(flowCollector, (com.revolut.feature.atm.impl.ui.redesign.details.a) this.f108119c, 16), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect27 = ((oji.f) this.f108118b).collect(new dc0.c(flowCollector, (i0) this.f108119c, 17), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect28 = ((wkm.l) this.f108118b).collect(new dc0.c(flowCollector, (eqd.g) this.f108119c, 18), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect29 = ((jhi.b) this.f108118b).collect(new dc0.c(flowCollector, (c0) this.f108119c, 19), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
