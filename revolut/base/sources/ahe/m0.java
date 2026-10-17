package ahe;

import kkf.s2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vkm.y f5017b;

    public /* synthetic */ m0(vkm.y yVar, int i) {
        this.f5016a = i;
        this.f5017b = yVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f5016a) {
            case 0:
                Object objCollect = this.f5017b.collect(new a9j.s(flowCollector, 22), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f5017b.collect(new a9j.s(flowCollector, 23), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f5017b.collect(new d6e.d(flowCollector, 9), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f5017b.collect(new fod.i(flowCollector, 0), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f5017b.collect(new fod.i(flowCollector, 25), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f5017b.collect(new i8c.c(flowCollector, 5), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f5017b.collect(new jsl.k(flowCollector, 17), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = this.f5017b.collect(new s2(flowCollector, 1), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = this.f5017b.collect(new ly4.d(flowCollector, 12), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = this.f5017b.collect(new ly4.d(flowCollector, 13), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = this.f5017b.collect(new ly4.d(flowCollector, 14), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = this.f5017b.collect(new ly4.d(flowCollector, 19), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = this.f5017b.collect(new mhd.f(flowCollector, 16), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f5017b.collect(new mhd.f(flowCollector, 17), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f5017b.collect(new mhd.f(flowCollector, 25), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f5017b.collect(new njj.i(flowCollector, 13), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = this.f5017b.collect(new ood.x(flowCollector, 29), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f5017b.collect(new pkf.g(flowCollector, 13), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = this.f5017b.collect(new r74.a0(flowCollector, 16), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f5017b.collect(new rnb.c(flowCollector, 28), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f5017b.collect(new spb.f(flowCollector, 4), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f5017b.collect(new v6e.p(flowCollector, 22), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = this.f5017b.collect(new x4k.e(flowCollector, 16), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = this.f5017b.collect(new x4k.e(flowCollector, 17), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = this.f5017b.collect(new xif.m(flowCollector, 10), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = this.f5017b.collect(new yuc.d(flowCollector, 26), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = this.f5017b.collect(new z6k.j(flowCollector, 11), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect28 = this.f5017b.collect(new zj6.d(flowCollector, 22), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
