package kh4;

import b8d.a0;
import com.revolut.data.model.Data;
import iyg.b0;
import kbb.n;
import kkf.a8;
import kkf.d1;
import kkf.d2;
import kkf.e5;
import kkf.f4;
import kkf.h3;
import kkf.i1;
import kkf.j2;
import kkf.l3;
import kkf.m0;
import kkf.n3;
import kkf.n4;
import kkf.o1;
import kkf.o6;
import kkf.p0;
import kkf.p3;
import kkf.p7;
import kkf.q;
import kkf.q4;
import kkf.s0;
import kkf.u1;
import kkf.u3;
import kkf.w0;
import kkf.y0;
import kkf.y5;
import kkf.z4;
import kkf.z7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f184052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f184053c;

    public /* synthetic */ f(Flow flow, Object obj2, int i) {
        this.f184051a = i;
        this.f184052b = flow;
        this.f184053c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f184051a) {
            case 0:
                Object objCollect = ((q0) this.f184052b).collect(new n(flowCollector, (g) this.f184053c, 10), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f184052b).collect(new a0(flowCollector, (Data) this.f184053c, 8), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((b0) this.f184052b).collect(new k7i.c(flowCollector, (com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a) this.f184053c, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = this.f184052b.collect(new k7i.c(flowCollector, (kkf.c) this.f184053c, 3), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f184052b.collect(new k7i.c(flowCollector, (q) this.f184053c, 4), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f184052b.collect(new n(flowCollector, (m0) this.f184053c, 23), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f184052b.collect(new k7i.c(flowCollector, (p0) this.f184053c, 5), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = this.f184052b.collect(new k7i.c(flowCollector, (s0) this.f184053c, 6), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = this.f184052b.collect(new k7i.c(flowCollector, (w0) this.f184053c, 7), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = this.f184052b.collect(new k7i.c(flowCollector, (y0) this.f184053c, 8), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((wkm.l) this.f184052b).collect(new k7i.c(flowCollector, (d1) this.f184053c, 9), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((wkm.l) this.f184052b).collect(new k7i.c(flowCollector, (i1) this.f184053c, 10), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = this.f184052b.collect(new n(flowCollector, (o1) this.f184053c, 24), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((vkm.d) this.f184052b).collect(new k7i.c(flowCollector, (e84.e) this.f184053c, 11), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f184052b.collect(new k7i.c(flowCollector, (u1) this.f184053c, 12), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f184052b.collect(new k7i.c(flowCollector, (d2) this.f184053c, 13), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = this.f184052b.collect(new k7i.c(flowCollector, (j2) this.f184053c, 14), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f184052b.collect(new k7i.c(flowCollector, (h3) this.f184053c, 15), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = this.f184052b.collect(new k7i.c(flowCollector, (l3) this.f184053c, 16), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f184052b.collect(new k7i.c(flowCollector, (n3) this.f184053c, 17), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f184052b.collect(new k7i.c(flowCollector, (p3) this.f184053c, 18), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f184052b.collect(new k7i.c(flowCollector, (u3) this.f184053c, 19), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((j23.b) this.f184052b).collect(new f4(flowCollector, (n4) this.f184053c, 4), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((vkm.d) this.f184052b).collect(new k7i.c(flowCollector, (q4) this.f184053c, 20), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = this.f184052b.collect(new k7i.c(flowCollector, (z4) this.f184053c, 21), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = this.f184052b.collect(new k7i.c(flowCollector, (e5) this.f184053c, 22), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((t38.e) this.f184052b).collect(new k7i.c(flowCollector, (y5) this.f184053c, 23), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = this.f184052b.collect(new k7i.c(flowCollector, (o6) this.f184053c, 24), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = this.f184052b.collect(new k7i.c(flowCollector, (p7) this.f184053c, 25), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((z7) this.f184052b).collect(new k7i.c(flowCollector, (a8) this.f184053c, 26), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
