package rv6;

import bo8.w;
import hy1.b0;
import knd.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f257700b;

    public /* synthetic */ e(Flow flow, int i) {
        this.f257699a = i;
        this.f257700b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f257699a) {
            case 0:
                Object objCollect = ((r7b.e) this.f257700b).collect(new rnb.c(flowCollector, 23), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((r7b.e) this.f257700b).collect(new rx6.e(flowCollector, 4), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((w) this.f257700b).collect(new s6b.c(flowCollector, 26), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((qij.s) this.f257700b).collect(new s6b.c(flowCollector, 28), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((ryj.w) this.f257700b).collect(new spb.f(flowCollector, 15), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((ay2.f) this.f257700b).collect(new spb.f(flowCollector, 22), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((n1g.p) this.f257700b).collect(new spb.f(flowCollector, 23), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((qij.s) this.f257700b).collect(new spb.f(flowCollector, 26), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((t05.c) this.f257700b).collect(new t05.f(flowCollector, 2), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((t05.c) this.f257700b).collect(new t05.f(flowCollector, 3), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((t05.c) this.f257700b).collect(new t05.f(flowCollector, 25), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((t05.c) this.f257700b).collect(new t05.f(flowCollector, 26), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((vkm.e) this.f257700b).collect(new t73.v(flowCollector, 12), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((b0) this.f257700b).collect(new t73.v(flowCollector, 26), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((e) this.f257700b).collect(new te8.j(flowCollector, 21), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((g0) this.f257700b).collect(new te8.j(flowCollector, 22), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((tzh.g) this.f257700b).collect(new tnb.j(flowCollector, 29), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((tzh.g) this.f257700b).collect(new tzh.e(flowCollector, 0), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((tzh.g) this.f257700b).collect(new tzh.e(flowCollector, 4), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((uf0.b) this.f257700b).collect(new tzh.e(flowCollector, 5), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((uf0.b) this.f257700b).collect(new tzh.e(flowCollector, 29), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((tnb.k) this.f257700b).collect(new uh7.q(flowCollector, 11), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((uf0.b) this.f257700b).collect(new uh7.q(flowCollector, 19), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((tse.c) this.f257700b).collect(new urd.m(flowCollector, 11), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((urd.n) this.f257700b).collect(new urd.m(flowCollector, 22), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((urd.n) this.f257700b).collect(new urd.m(flowCollector, 23), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((e) this.f257700b).collect(new uxh.c(flowCollector, 3), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((urd.n) this.f257700b).collect(new uxh.c(flowCollector, 5), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((urd.n) this.f257700b).collect(new uxh.c(flowCollector, 14), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((urd.n) this.f257700b).collect(new uxh.c(flowCollector, 15), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
