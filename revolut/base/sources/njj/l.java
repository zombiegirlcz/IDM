package njj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f216572b;

    public /* synthetic */ l(Flow flow, int i) {
        this.f216571a = i;
        this.f216572b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        switch (this.f216571a) {
            case 0:
                Object objCollect = ((mmh.e) this.f216572b).collect(new i(flowCollector, 2), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((n1g.p) this.f216572b).collect(new i(flowCollector, 29), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((n) this.f216572b).collect(new ntf.q(flowCollector, 9), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((ard.c0) this.f216572b).collect(new ntf.q(flowCollector, 15), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((n5j.f) this.f216572b).collect(new ntf.q(flowCollector, 17), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((ob2.d) this.f216572b).collect(new o42.j(flowCollector, 20), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((o9a.e) this.f216572b).collect(new oce.c(flowCollector, 12), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((o9a.e) this.f216572b).collect(new oce.c(flowCollector, 13), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((ae8.c) this.f216572b).collect(new oce.c(flowCollector, 15), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((olf.e) this.f216572b).collect(new ood.x(flowCollector, 20), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((j2) this.f216572b).collect(new p26.j(flowCollector, 0), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((g0c.e) this.f216572b).collect(new p26.j(flowCollector, 5), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((p73.d) this.f216572b).collect(new p26.j(flowCollector, 8), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((ahe.m0) this.f216572b).collect(new pkf.g(flowCollector, 14), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((hy1.b0) this.f216572b).collect(new pvk.k(flowCollector, 15), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((pvk.i) this.f216572b).collect(new q5g.f(flowCollector, 4), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((olf.e) this.f216572b).collect(new qb3.p(flowCollector, 1), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((n1g.p) this.f216572b).collect(new qb3.p(flowCollector, 6), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((l) this.f216572b).collect(new qb3.p(flowCollector, 7), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((pkg.e) this.f216572b).collect(new qb3.p(flowCollector, 11), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((q97.b1) this.f216572b).collect(new qb3.p(flowCollector, 14), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((q97.b1) this.f216572b).collect(new qb3.p(flowCollector, 15), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((q97.b1) this.f216572b).collect(new qb3.p(flowCollector, 16), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((q97.b1) this.f216572b).collect(new qb3.p(flowCollector, 17), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((q97.b1) this.f216572b).collect(new qph.g(flowCollector, 8), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((q97.b1) this.f216572b).collect(new qph.g(flowCollector, 28), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((q97.b1) this.f216572b).collect(new r74.a0(flowCollector, 0), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((qna.n) this.f216572b).collect(new rnb.c(flowCollector, 2), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((ae8.c) this.f216572b).collect(new rnb.c(flowCollector, 4), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((r7b.e) this.f216572b).collect(new rnb.c(flowCollector, 19), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
