package vvh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vgf.n0;
import vy5.c0;
import xif.m;
import ybh.t0;
import ymk.x;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f292545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jhi.b f292546b;

    public /* synthetic */ e(jhi.b bVar, int i) {
        this.f292545a = i;
        this.f292546b = bVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f292545a) {
            case 0:
                Object objCollect = this.f292546b.collect(new n0(flowCollector, 27), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f292546b.collect(new c0(flowCollector, 22), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f292546b.collect(new c0(flowCollector, 23), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f292546b.collect(new wa3.h(flowCollector, 26), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f292546b.collect(new wk2.g(flowCollector, 7), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f292546b.collect(new wk2.g(flowCollector, 22), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f292546b.collect(new wv2.l(flowCollector, 20), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = this.f292546b.collect(new wv2.l(flowCollector, 26), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = this.f292546b.collect(new wv2.l(flowCollector, 27), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = this.f292546b.collect(new m(flowCollector, 4), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = this.f292546b.collect(new xv5.f(flowCollector, 7), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = this.f292546b.collect(new xv5.f(flowCollector, 8), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = this.f292546b.collect(new xv5.f(flowCollector, 9), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f292546b.collect(new t0(flowCollector, 8), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f292546b.collect(new x(flowCollector, 4), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f292546b.collect(new x(flowCollector, 7), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = this.f292546b.collect(new x(flowCollector, 17), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f292546b.collect(new x(flowCollector, 28), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = this.f292546b.collect(new z6k.j(flowCollector, 14), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f292546b.collect(new z6k.j(flowCollector, 29), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f292546b.collect(new zj6.d(flowCollector, 17), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f292546b.collect(new zj6.d(flowCollector, 18), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect23 = this.f292546b.collect(new zul.l(flowCollector, 2), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
