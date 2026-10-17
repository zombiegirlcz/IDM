package c2d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f20721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20722c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(Flow flow, Object obj2, String str, int i, int i2) {
        this.f20720a = i2;
        this.f20721b = flow;
        this.e = obj2;
        this.f20722c = str;
        this.d = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f20720a) {
            case 0:
                Object objCollect = this.f20721b.collect(new l0(flowCollector, (o0) this.e, this.f20722c, this.d, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f20721b.collect(new l0(flowCollector, (t0) this.e, this.f20722c, this.d, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f20721b.collect(new l0(flowCollector, (x0) this.e, this.f20722c, this.d, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((t38.e) this.f20721b).collect(new l0(flowCollector, (l28.h) this.e, this.f20722c, this.d, 4), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f20721b.collect(new l0(flowCollector, (nw5.i) this.e, this.f20722c, this.d, 5), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((q87.q) this.f20721b).collect(new l0(flowCollector, this.f20722c, (eel.c) this.e, this.d), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((vkm.d) this.f20721b).collect(new dmf.a(flowCollector, (r2d.c) this.e, this.f20722c, this.d), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect8 = ((jhi.b) this.f20721b).collect(new l0(flowCollector, (ys5.d) this.e, this.d, this.f20722c), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public m0(jhi.b bVar, ys5.d dVar, int i, String str) {
        this.f20720a = 7;
        this.f20721b = bVar;
        this.e = dVar;
        this.d = i;
        this.f20722c = str;
    }

    public m0(q87.q qVar, String str, eel.c cVar, int i) {
        this.f20720a = 5;
        this.f20721b = qVar;
        this.f20722c = str;
        this.e = cVar;
        this.d = i;
    }
}
