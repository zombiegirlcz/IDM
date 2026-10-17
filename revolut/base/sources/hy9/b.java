package hy9;

import hui.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import spb.f;
import te8.j;
import vgf.n0;
import vy5.c0;
import ybh.t0;
import zfd.e;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f156767b;

    public /* synthetic */ b(e eVar, int i) {
        this.f156766a = i;
        this.f156767b = eVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f156766a) {
            case 0:
                Object objCollect = this.f156767b.collect(new d(flowCollector, 10), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f156767b.collect(new l5d.d(flowCollector, 25), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f156767b.collect(new f(flowCollector, 3), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f156767b.collect(new j(flowCollector, 9), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f156767b.collect(new tzh.e(flowCollector, 21), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f156767b.collect(new n0(flowCollector, 12), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f156767b.collect(new n0(flowCollector, 13), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = this.f156767b.collect(new c0(flowCollector, 16), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect9 = this.f156767b.collect(new t0(flowCollector, 24), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
