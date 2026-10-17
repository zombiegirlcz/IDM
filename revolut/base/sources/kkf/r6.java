package kkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class r6 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f184920b;

    public /* synthetic */ r6(Flow flow, int i) {
        this.f184919a = i;
        this.f184920b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f184919a) {
            case 0:
                Object objCollect = ((ae8.c) this.f184920b).collect(new s2(flowCollector, 10), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((kge.b) this.f184920b).collect(new h9(flowCollector, 2), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((r6) this.f184920b).collect(new h9(flowCollector, 3), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((kge.b) this.f184920b).collect(new h9(flowCollector, 5), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((r6) this.f184920b).collect(new h9(flowCollector, 6), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((r6) this.f184920b).collect(new h9(flowCollector, 8), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((ble.c1) this.f184920b).collect(new h9(flowCollector, 9), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((dr2.l) this.f184920b).collect(new kx4.b0(flowCollector, 13), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((kye.k2) this.f184920b).collect(new kx4.b0(flowCollector, 14), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((z7) this.f184920b).collect(new kx4.b0(flowCollector, 18), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((z7) this.f184920b).collect(new kx4.b0(flowCollector, 20), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((c2d.m0) this.f184920b).collect(new kx4.b0(flowCollector, 21), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((n1g.p) this.f184920b).collect(new kx4.b0(flowCollector, 28), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((r6) this.f184920b).collect(new l5d.d(flowCollector, 23), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((kq.g) this.f184920b).collect(new l5d.d(flowCollector, 24), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((g48.r) this.f184920b).collect(new lkf.q(flowCollector, 20), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((r6) this.f184920b).collect(new lkf.q(flowCollector, 21), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((r6) this.f184920b).collect(new lkf.q(flowCollector, 24), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((lt.d) this.f184920b).collect(new lkf.q(flowCollector, 26), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((lt.d) this.f184920b).collect(new lkf.q(flowCollector, 28), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((lt.d) this.f184920b).collect(new ly4.d(flowCollector, 4), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((lt.d) this.f184920b).collect(new ly4.d(flowCollector, 5), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((r6) this.f184920b).collect(new ly4.d(flowCollector, 16), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((hy1.b0) this.f184920b).collect(new ly4.d(flowCollector, 17), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((lt.d) this.f184920b).collect(new mhd.f(flowCollector, 4), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((lkf.v) this.f184920b).collect(new mhd.f(flowCollector, 14), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((lfg.d0) this.f184920b).collect(new mhd.f(flowCollector, 21), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((mmh.e) this.f184920b).collect(new mle.t(flowCollector, 27), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((jhi.b) this.f184920b).collect(new n1j.d(flowCollector, 24), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((r6) this.f184920b).collect(new n1j.d(flowCollector, 25), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
