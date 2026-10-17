package v0b;

import a83.o0;
import akg.n;
import cie.c1;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardDirectDebitMandate;
import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreen;
import com.revolut.feature.security_hub.impl.interactor.ConnectedWifi;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import d7j.o1;
import eq8.g;
import hfg.j0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import lb0.d0;
import mif.e0;
import oim.o;
import pie.s;
import u97.e;
import v20.f0;
import vha.a0;
import vha.d1;
import vha.k1;
import vkm.q0;
import vkm.s0;
import vkm.s1;
import vkm.t;
import vkm.v1;
import vkm.y;
import vsh.h;
import vy5.c0;
import wkm.l;
import wp4.i0;
import wr1.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f284774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f284775c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f284773a = i;
        this.f284774b = obj2;
        this.f284775c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f284773a) {
            case 0:
                Object objCollect = ((vkm.d) this.f284774b).collect(new e(flowCollector, (w0b.c) this.f284775c, 19), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f284774b).collect(new e(flowCollector, (com.revolut.feature.topup_screen.impl.screens.card_details.b) this.f284775c, 20), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((q0) this.f284774b).collect(new e(flowCollector, (f0) this.f284775c, 21), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((q0) this.f284774b).collect(new e(flowCollector, (j0) this.f284775c, 22), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((Flow) this.f284774b).collect(new e(flowCollector, (ProductAccount) this.f284775c, 24), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((y) this.f284774b).collect(new c1(flowCollector, (ProductAccountDescriptor$Value) this.f284775c, 2), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((l) this.f284774b).collect(new c1(flowCollector, (ProductAccountDescriptor$Value) this.f284775c, 3), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((MutableStateFlow) this.f284774b).collect(new e(flowCollector, (s) this.f284775c, 26), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((Flow) this.f284774b).collect(new e(flowCollector, (com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a) this.f284775c, 27), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((jhi.b) this.f284774b).collect(new a0(flowCollector, (ProductAccountId) this.f284775c, 0), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((n) this.f284774b).collect(new e(flowCollector, (d1) this.f284775c, 28), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((g) this.f284774b).collect(new e(flowCollector, (k1) this.f284775c, 29), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((t) this.f284774b).collect(new s0(flowCollector, (d0) this.f284775c, 0), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.f186409a = wkm.b.f298304b;
                Object objCollect14 = ((y) this.f284774b).collect(new vkf.d(ref$ObjectRef, (o0) this.f284775c, flowCollector, 2), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Flow[] flowArr = (Flow[]) this.f284774b;
                Object objG = e0.g(continuation, s1.f290118a, new vdl.c1((Continuation) null, (oim.n) this.f284775c, 12), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Flow[] flowArr2 = (Flow[]) this.f284774b;
                Object objG2 = e0.g(continuation, s1.f290118a, new vdl.c1((Continuation) null, (o) this.f284775c, 13), flowCollector, flowArr2);
                if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect15 = ((v1) this.f284774b).collect(new s0(flowCollector, (h) this.f284775c, 1), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect16 = ((Flow) this.f284774b).collect(new c0(flowCollector, (w38.e) this.f284775c), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect17 = ((Flow) this.f284774b).collect(new s0(flowCollector, (w6h.e) this.f284775c, 6), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect18 = ((ax9.o) this.f284774b).collect(new wa3.h(flowCollector, (wbg.s) this.f284775c), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect19 = ((Flow) this.f284774b).collect(new s0(flowCollector, (pi3.h) this.f284775c, 8), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect20 = ((zfd.e) this.f284774b).collect(new s0(flowCollector, (wha.e) this.f284775c, 9), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect21 = ((vkm.d) this.f284774b).collect(new s0(flowCollector, (CryptoSpareChangeScreen) this.f284775c, 10), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect22 = ((Flow) this.f284774b).collect(new s0(flowCollector, (CreditCardDirectDebitMandate) this.f284775c, 12), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect23 = ((y) this.f284774b).collect(new s0(flowCollector, (i0) this.f284775c, 13), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect24 = ((Flow) this.f284774b).collect(new s0(flowCollector, (u) this.f284775c, 14), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect25 = ((jhi.b) this.f284774b).collect(new s0(flowCollector, (wrd.s) this.f284775c, 15), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect26 = ((jhi.b) this.f284774b).collect(new o1(flowCollector, (io3.d) this.f284775c, 2), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect27 = ((jhi.b) this.f284774b).collect(new s0(flowCollector, (ConnectedWifi) this.f284775c, 16), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect28 = ((wa3.d) this.f284774b).collect(new wv2.l(flowCollector, (wv2.n) this.f284775c), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
