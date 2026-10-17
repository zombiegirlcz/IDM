package wyd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import vge.w2;
import vkm.s0;
import vkm.v1;
import xkf.a1;
import xkf.b2;
import xkf.c1;
import xkf.c2;
import xkf.e1;
import xkf.m0;
import xkf.t1;
import xkf.x0;
import y20.b1;
import y20.w0;
import ybh.t0;
import yjh.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f301251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f301252c;

    public /* synthetic */ f(Object obj2, Object obj3, int i) {
        this.f301250a = i;
        this.f301251b = obj2;
        this.f301252c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f301250a) {
            case 0:
                Object objCollect = ((t38.e) this.f301251b).collect(new s0(flowCollector, (com.revolut.feature.statements.impl.ui.account.a) this.f301252c, 17), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vvh.e) this.f301251b).collect(new s0(flowCollector, (x0f.y) this.f301252c, 18), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((t38.e) this.f301251b).collect(new s0(flowCollector, (ou5.b) this.f301252c, 19), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((zfd.e) this.f301251b).collect(new x4k.e(flowCollector, (xfb.m) this.f301252c), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Flow[] flowArr = (Flow[]) this.f301251b;
                Object objG = e0.g(continuation, new w2(flowArr, 3), new x18.e((Continuation) null, (vfe.a) this.f301252c, 10), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect5 = ((t38.e) this.f301251b).collect(new s0(flowCollector, (xk6.b) this.f301252c, 23), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect6 = ((Flow) this.f301251b).collect(new s0(flowCollector, (m0) this.f301252c, 24), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect7 = ((Flow) this.f301251b).collect(new xif.m(flowCollector, (x0) this.f301252c, 6), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect8 = ((Flow) this.f301251b).collect(new s0(flowCollector, (a1) this.f301252c, 25), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect9 = ((Flow) this.f301251b).collect(new s0(flowCollector, (c1) this.f301252c, 26), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect10 = ((Flow) this.f301251b).collect(new s0(flowCollector, (e1) this.f301252c, 27), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect11 = ((jhi.b) this.f301251b).collect(new s0(flowCollector, (kgm.i) this.f301252c, 28), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect12 = ((Flow) this.f301251b).collect(new s0(flowCollector, (t1) this.f301252c, 29), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect13 = ((Flow) this.f301251b).collect(new b2(flowCollector, (c2) this.f301252c, 0), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect14 = ((akg.n) this.f301251b).collect(new b2(flowCollector, (xmd.o) this.f301252c, 1), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect15 = ((cxe.u) this.f301251b).collect(new b2(flowCollector, (smd.s) this.f301252c, 2), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect16 = ((t38.e) this.f301251b).collect(new xnb.f(flowCollector, (xnb.q) this.f301252c, 0), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Flow[] flowArr2 = (Flow[]) this.f301251b;
                Object objG2 = e0.g(continuation, new w2(flowArr2, 11), new x18.e((Continuation) null, (yld.d[]) this.f301252c, 17), flowCollector, flowArr2);
                if (objG2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect17 = ((vkm.h) this.f301251b).collect(new b2(flowCollector, (xyh.t) this.f301252c, 3), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect18 = ((vkm.d) this.f301251b).collect(new w0(flowCollector, (b1) this.f301252c, 0), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect19 = ((vkm.f) this.f301251b).collect(new w0(flowCollector, (b1) this.f301252c, 1), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect20 = ((t38.e) this.f301251b).collect(new b2(flowCollector, (y52.b) this.f301252c, 4), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect21 = ((zfd.e) this.f301251b).collect(new b2(flowCollector, (eob.h) this.f301252c, 6), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect22 = ((j23.b) this.f301251b).collect(new b2(flowCollector, (com.revolut.feature.wealth.impl.ui.screens.composite_add_money.b) this.f301252c, 9), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect23 = ((v1) this.f301251b).collect(new b2(flowCollector, (ydf.b) this.f301252c, 10), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect24 = ((Flow) this.f301251b).collect(new b2(flowCollector, (com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b) this.f301252c, 11), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect25 = ((Flow) this.f301251b).collect(new b2(flowCollector, (tf1.h) this.f301252c, 12), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect26 = ((Flow) this.f301251b).collect(new b2(flowCollector, (yfd.w) this.f301252c, 13), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect27 = ((jhi.b) this.f301251b).collect(new t0(flowCollector, (k0) this.f301252c), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect28 = ((hy9.b) this.f301251b).collect(new b2(flowCollector, (ymf.k) this.f301252c, 15), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
