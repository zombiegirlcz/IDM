package g0c;

import ahe.f0;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.h1;
import vkm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f139423c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Flow flow, Object obj2, Object obj3, int i) {
        this.f139421a = i;
        this.f139423c = flow;
        this.d = obj2;
        this.f139422b = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f139421a) {
            case 0:
                Object objCollect = ((t38.e) this.f139423c).collect(new f0(flowCollector, (f) this.d, (h1) this.f139422b, 26), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((jhi.b) this.f139423c).collect(new f0(flowCollector, (b) this.d, (h1) this.f139422b, 27), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((v0b.b) this.f139423c).collect(new f0(flowCollector, (l) this.d, (h1) this.f139422b, 28), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((vkm.d) this.f139423c).collect(new f0(flowCollector, (b) this.d, (h1) this.f139422b, 29), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((go.g) this.f139423c).collect(new o(flowCollector, 0, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((go.g) this.f139423c).collect(new o(flowCollector, 1, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((go.g) this.f139423c).collect(new o(flowCollector, 2, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((go.g) this.f139423c).collect(new o(flowCollector, 3, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((v1) this.f139423c).collect(new o(flowCollector, 4, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((jhi.b) this.f139423c).collect(new o(flowCollector, 5, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((t38.e) this.f139423c).collect(new o(flowCollector, 6, (v) this.d, (h1) this.f139422b), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((go.g) this.f139423c).collect(new o(flowCollector, 7, (x) this.d, (h1) this.f139422b), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((go.g) this.f139423c).collect(new o(flowCollector, 8, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((v1) this.f139423c).collect(new o(flowCollector, 9, (b) this.d, (h1) this.f139422b), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((go.g) this.f139423c).collect(new o(flowCollector, 10, (b0) this.d, (h1) this.f139422b), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((jhi.k) this.f139423c).collect(new o(flowCollector, 11, (g25.i) this.d, (CreditAccountType.Application) this.f139422b), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = this.f139423c.collect(new a87.f(flowCollector, (gah.c) this.d, (List) this.f139422b, 3), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f139423c.collect(new o(flowCollector, 13, (gb0.f) this.d, (fb0.a) this.f139422b), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((akg.n) this.f139423c).collect(new hbh.f(flowCollector, (hbh.i) this.d, (h1h.c) this.f139422b, 0), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f139423c.collect(new hbh.f(flowCollector, (hbh.i) this.d, (h1h.c) this.f139422b, 1), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((vkm.d) this.f139423c).collect(new o(flowCollector, 14, (hma.s) this.d, (List) this.f139422b), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((v1) this.f139423c).collect(new o(flowCollector, 15, (AtomicBoolean) this.d, (ArrayList) this.f139422b), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = this.f139423c.collect(new a87.f(flowCollector, (hsl.q) this.d, (List) this.f139422b, 4), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = this.f139423c.collect(new o(flowCollector, 16, (Answer.Documents) this.d, (File) this.f139422b), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((vkm.d) this.f139423c).collect(new o(flowCollector, 17, (hy1.c) this.d, (String) this.f139422b), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((vkm.d) this.f139423c).collect(new o(flowCollector, 18, (hy1.l) this.d, (String) this.f139422b), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((vkm.d) this.f139423c).collect(new o(flowCollector, 19, (hy1.p) this.d, (String) this.f139422b), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((vkm.d) this.f139423c).collect(new o(flowCollector, 20, (hy1.s) this.d, (String) this.f139422b), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((vkm.d) this.f139423c).collect(new o(flowCollector, 21, (hy1.v) this.d, (String) this.f139422b), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((vkm.d) this.f139423c).collect(new o(flowCollector, 22, (hy1.y) this.d, (String) this.f139422b), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
