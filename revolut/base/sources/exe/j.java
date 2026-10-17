package exe;

import bo8.w;
import dfj.e0;
import g4b.a0;
import i4b.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.t0;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f130407b;

    public /* synthetic */ j(Flow flow, int i) {
        this.f130406a = i;
        this.f130407b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f130406a) {
            case 0:
                Object objCollect = ((w) this.f130407b).collect(new esj.e(flowCollector, 16), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((dfj.f) this.f130407b).collect(new esj.e(flowCollector, 21), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((g0c.e) this.f130407b).collect(new esj.e(flowCollector, 27), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((ag1.k) this.f130407b).collect(new f88.i(flowCollector, 14), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((a44.c) this.f130407b).collect(new fod.i(flowCollector, 12), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((t0) this.f130407b).collect(new g27.d(flowCollector, 9), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((fo6.d) this.f130407b).collect(new g27.d(flowCollector, 23), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((fo6.d) this.f130407b).collect(new g9d.e(flowCollector, 0), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((v0b.b) this.f130407b).collect(new g9d.e(flowCollector, 6), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((g0c.e) this.f130407b).collect(new god.k(flowCollector, 16), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((an9.g) this.f130407b).collect(new god.k(flowCollector, 21), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((g9j.q) this.f130407b).collect(new god.k(flowCollector, 24), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((g9j.q) this.f130407b).collect(new god.k(flowCollector, 27), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((blm.f) this.f130407b).collect(new h1k.d(flowCollector, 27), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((hg0.g) this.f130407b).collect(new h1k.d(flowCollector, 28), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((h23.b) this.f130407b).collect(new hg4.i(flowCollector, 8), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((g0c.e) this.f130407b).collect(new hg4.i(flowCollector, 17), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((a44.c) this.f130407b).collect(new hui.d(flowCollector, 5), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((a44.c) this.f130407b).collect(new hui.d(flowCollector, 6), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((a44.c) this.f130407b).collect(new hui.d(flowCollector, 7), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((hsl.c) this.f130407b).collect(new hui.d(flowCollector, 23), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((hsl.c) this.f130407b).collect(new y(flowCollector, 11), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((ahd.c) this.f130407b).collect(new i8c.c(flowCollector, 3), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((i5b.d) this.f130407b).collect(new i8c.c(flowCollector, 14), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((an9.g) this.f130407b).collect(new i8c.c(flowCollector, 19), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((a0) this.f130407b).collect(new img.c(flowCollector, 18), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((iqh.d) this.f130407b).collect(new iyg.a0(flowCollector, 28), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((e0) this.f130407b).collect(new jhd.d(flowCollector, 5), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((dfj.f) this.f130407b).collect(new jhd.d(flowCollector, 12), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((jij.d) this.f130407b).collect(new jhd.d(flowCollector, 29), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
