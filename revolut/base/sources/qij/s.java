package qij;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import r74.a0;
import t73.v;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f246746b;

    public /* synthetic */ s(Flow flow, int i) {
        this.f246745a = i;
        this.f246746b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f246745a) {
            case 0:
                Object objCollect = this.f246746b.collect(new qb3.p(flowCollector, 13), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f246746b.collect(new qb3.p(flowCollector, 26), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f246746b.collect(new qph.g(flowCollector, 19), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f246746b.collect(new qph.g(flowCollector, 21), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f246746b.collect(new a0(flowCollector, 8), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f246746b.collect(new a0(flowCollector, 11), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f246746b.collect(new rx6.e(flowCollector, 21), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = this.f246746b.collect(new rx6.e(flowCollector, 22), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = this.f246746b.collect(new s6b.c(flowCollector, 9), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = this.f246746b.collect(new s6b.c(flowCollector, 13), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = this.f246746b.collect(new s6b.c(flowCollector, 19), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = this.f246746b.collect(new s6b.c(flowCollector, 27), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = this.f246746b.collect(new spb.f(flowCollector, 2), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f246746b.collect(new spb.f(flowCollector, 13), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f246746b.collect(new spb.f(flowCollector, 20), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f246746b.collect(new spb.f(flowCollector, 25), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = this.f246746b.collect(new t05.f(flowCollector, 9), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f246746b.collect(new t05.f(flowCollector, 11), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = this.f246746b.collect(new t05.f(flowCollector, 12), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f246746b.collect(new v(flowCollector, 6), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f246746b.collect(new v(flowCollector, 10), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f246746b.collect(new v(flowCollector, 11), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = this.f246746b.collect(new v(flowCollector, 13), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = this.f246746b.collect(new v(flowCollector, 14), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = this.f246746b.collect(new v(flowCollector, 15), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = this.f246746b.collect(new v(flowCollector, 18), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = this.f246746b.collect(new v(flowCollector, 27), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = this.f246746b.collect(new te8.j(flowCollector, 11), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = this.f246746b.collect(new te8.j(flowCollector, 12), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = this.f246746b.collect(new te8.j(flowCollector, 20), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
