package lkf;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.time.LocalDateTime;
import kkf.i8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mkf.o0;
import mkf.u0;
import mkf.w0;
import n09.m0;
import vkm.q0;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f196411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f196412c;

    public /* synthetic */ v(Object obj2, Object obj3, int i) {
        this.f196410a = i;
        this.f196411b = obj2;
        this.f196412c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f196410a) {
            case 0:
                Object objCollect = ((Flow) this.f196411b).collect(new i8(flowCollector, (w) this.f196412c, 24), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((Flow) this.f196411b).collect(new i8(flowCollector, (z) this.f196412c, 25), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((Flow) this.f196411b).collect(new i8(flowCollector, (c0) this.f196412c, 26), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((Flow) this.f196411b).collect(new i8(flowCollector, (h0) this.f196412c, 27), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((Flow) this.f196411b).collect(new i8(flowCollector, (l0) this.f196412c, 28), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((Flow) this.f196411b).collect(new i8(flowCollector, (lmg.f) this.f196412c, 29), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (lmg.m) this.f196412c, 0), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Flow[] flowArr = (Flow[]) this.f196411b;
                Object objG = mif.e0.g(continuation, new h52.c(flowArr, 17), new li2.f(null, (lal.a) this.f196412c, 8), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect8 = ((jhi.b) this.f196411b).collect(new lmg.k(flowCollector, (LocalDateTime) this.f196412c, 1), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect9 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (lwf.g) this.f196412c, 2), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect10 = ((vkm.d) this.f196411b).collect(new l2d.g(flowCollector, (FavouritesAssetTypeKey) this.f196412c, 4), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect11 = ((hy1.b0) this.f196411b).collect(new mc2.j(flowCollector, (hrf.f) this.f196412c, 0), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect12 = ((t38.e) this.f196411b).collect(new lmg.k(flowCollector, (mh2.b) this.f196412c, 3), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect13 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (jx0.a) this.f196412c, 4), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect14 = ((v1) this.f196411b).collect(new mhd.f(flowCollector, (mjf.q) this.f196412c, 15), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect15 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (jt0.b) this.f196412c, 5), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect16 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (mkf.h) this.f196412c, 6), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect17 = ((Flow) this.f196411b).collect(new mhd.f(flowCollector, (mkf.l) this.f196412c, 22), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect18 = ((Flow) this.f196411b).collect(new mhd.f(flowCollector, (mkf.u) this.f196412c, 23), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect19 = ((Flow) this.f196411b).collect(new mhd.f(flowCollector, (mkf.f0) this.f196412c, 24), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect20 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (k7i.i) this.f196412c, 7), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect21 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (o0) this.f196412c, 8), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect22 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (u0) this.f196412c, 9), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect23 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (w0) this.f196412c, 10), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect24 = ((Flow) this.f196411b).collect(new lmg.k(flowCollector, (com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) this.f196412c, 11), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect25 = ((vkm.d) this.f196411b).collect(new lmg.k(flowCollector, (mp6.n) this.f196412c, 12), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect26 = ((j23.b) this.f196411b).collect(new lmg.k(flowCollector, (mzh.e) this.f196412c, 13), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect27 = ((vkm.d) this.f196411b).collect(new lmg.k(flowCollector, (n09.z) this.f196412c, 14), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect28 = ((q0) this.f196411b).collect(new lmg.k(flowCollector, (m0) this.f196412c, 15), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect29 = ((vkm.d) this.f196411b).collect(new lmg.k(flowCollector, (n1g.r) this.f196412c, 16), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
