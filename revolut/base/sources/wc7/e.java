package wc7;

import ccb.k;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.transfer.core.models.CountryProfile;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import skm.e0;
import tof.a3;
import vge.w2;
import vkm.q0;
import vkm.s0;
import wf0.a0;
import wkm.l;
import wxd.s;
import xfb.m;
import xkf.b2;
import y20.b1;
import yc7.j;
import yf1.w;
import yf1.y;
import z28.q;
import zc7.i;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f296354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f296355c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj2, int i, Object obj3, Object obj4) {
        this.f296353a = i;
        this.f296355c = obj2;
        this.d = obj3;
        this.f296354b = obj4;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [gim.i, kotlin.jvm.functions.Function3] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f296353a) {
            case 0:
                Object objCollect = ((Flow) this.f296355c).collect(new vkf.d(flowCollector, 10, (f) this.d, (String) this.f296354b), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f296355c).collect(new vkf.d(flowCollector, 13, (toh.d) this.d, (String) this.f296354b), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((f3d.g) this.f296355c).collect(new vkf.d(flowCollector, 14, (a0) this.d, (String) this.f296354b), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((vkm.d) this.f296355c).collect(new vkf.d(flowCollector, 15, (wkf.d) this.d, (String) this.f296354b), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objO = e0.o(new pn2.c((Flow) this.f296355c, (Flow) this.d, flowCollector, (Function3) this.f296354b, (Continuation) null), continuation);
                if (objO != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect5 = ((q0) this.f296355c).collect(new vkf.d(flowCollector, 17, (ww4.f) this.d, (String) this.f296354b), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect6 = ((zfd.e) this.f296355c).collect(new s0(flowCollector, (m) this.d, (rfb.e) this.f296354b), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect7 = ((vkm.d) this.f296355c).collect(new vkf.d(flowCollector, 20, (UUID) this.d, (b1) this.f296354b), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect8 = ((l) this.f296355c).collect(new b2(flowCollector, (ybb.d) this.d, (k) this.f296354b), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect9 = ((jhi.b) this.f296355c).collect(new nj8.g(flowCollector, (j) this.d, (String) this.f296354b, 19), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect10 = ((Flow) this.f296355c).collect(new vkf.d(flowCollector, 21, (j) this.d, (String) this.f296354b), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect11 = ((j23.b) this.f296355c).collect(new vkf.d(flowCollector, 22, (FavouritesAssetTypeKey) this.d, (Pair) this.f296354b), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Flow[] flowArr = (Flow[]) this.f296355c;
                Object objG = mif.e0.g(continuation, new w2(flowArr, 15), new w(null, (y) this.d, (tf1.b) this.f296354b), flowCollector, flowArr);
                if (objG != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect12 = ((Flow) this.f296355c).collect(new vkf.d(flowCollector, 23, (yt9.g) this.d, (CountryProfile) this.f296354b), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect13 = ((jhi.b) this.f296355c).collect(new vkf.d(flowCollector, 24, (String) this.f296354b, (a3) this.d), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect14 = ((jhi.b) this.f296355c).collect(new vkf.d(flowCollector, 25, (q) this.d, (String) this.f296354b), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect15 = ((vkm.d) this.f296355c).collect(new vkf.d(flowCollector, 26, (String) this.f296354b, (i) this.d), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect16 = ((vkm.d) this.f296355c).collect(new vkf.d(flowCollector, 27, (s) this.d, (String) this.f296354b), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ e(Flow flow, String str, Object obj2, int i) {
        this.f296353a = i;
        this.f296355c = flow;
        this.f296354b = str;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Flow flow, Flow flow2, Function3 function3) {
        this.f296353a = 4;
        this.f296355c = flow;
        this.d = flow2;
        this.f296354b = (gim.i) function3;
    }
}
