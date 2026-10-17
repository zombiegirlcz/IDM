package hy1;

import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jf7.j1;
import kkf.d3;
import kkf.f9;
import kkf.i8;
import kkf.r6;
import klf.n2;
import klf.o0;
import klf.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.a3;
import vkm.q0;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f156633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f156634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f156635c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(Flow flow, Object obj2, Object obj3, int i) {
        this.f156633a = i;
        this.f156634b = flow;
        this.d = obj2;
        this.f156635c = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f156633a) {
            case 0:
                Object objCollect = ((vkm.d) this.f156634b).collect(new g0c.o(flowCollector, 23, (c0) this.d, (String) this.f156635c), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f156634b).collect(new g0c.o(flowCollector, 24, (g0) this.d, (String) this.f156635c), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((vkm.d) this.f156634b).collect(new g0c.o(flowCollector, 25, (j0) this.d, (String) this.f156635c), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((vkm.d) this.f156634b).collect(new g0c.o(flowCollector, 26, (m0) this.d, (String) this.f156635c), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((vkm.d) this.f156634b).collect(new g0c.o(flowCollector, 27, (hy5.h) this.d, (List) this.f156635c), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((q0) this.f156634b).collect(new g23.e0(flowCollector, (b4g.c) this.d, (i4g.h) this.f156635c), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((jhi.b) this.f156634b).collect(new g0c.o(flowCollector, 28, (i7e.d) this.d, (String) this.f156635c), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((vkm.y) this.f156634b).collect(new g0c.o(flowCollector, 29, (UnifiedTransactionsFilter) this.d, (igf.g) this.f156635c), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((jhi.b) this.f156634b).collect(new im9.k(flowCollector, (ArrayList) this.d, (f4h.a) this.f156635c, 0), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((j23.b) this.f156634b).collect(new i52.l(flowCollector, (ThreeDSTransaction) this.d, (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.f156635c), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = this.f156634b.collect(new im9.k(flowCollector, (jnd.t) this.d, (String) this.f156635c, 2), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((vkm.d) this.f156634b).collect(new im9.k(flowCollector, (kg7.f) this.d, (j1) this.f156635c, 4), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((jhi.b) this.f156634b).collect(new im9.k(flowCollector, (kie.g) this.d, (xjg.l) this.f156635c, 5), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f156634b.collect(new im9.k(flowCollector, (d3) this.d, (a3) this.f156635c, 6), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = ((j23.b) this.f156634b).collect(new im9.k(flowCollector, (f9) this.d, (mga.d0) this.f156635c, 7), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((cxe.u) this.f156634b).collect(new i8(flowCollector, (s0) this.d, (o0) this.f156635c, 4), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((vkm.d) this.f156634b).collect(new i8(flowCollector, (n2) this.d, (SplitBillLink) this.f156635c, 5), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f156634b.collect(new i8(flowCollector, (km2.r) this.d, (BackgroundKey) this.f156635c, 6), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = this.f156634b.collect(new ha3.w(flowCollector, (Set) this.d, (km2.r) this.f156635c), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((jhi.b) this.f156634b).collect(new ahd.b(flowCollector, (kuj.e) this.d, (String) this.f156635c, 24), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((vkm.d) this.f156634b).collect(new l2d.g(flowCollector, (l3d.h0) this.d, (FavouritesAssetTypeKey) this.f156635c), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f156634b.collect(new im9.k(flowCollector, (z3d.e) this.d, (l3d.h0) this.f156635c, 8), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((r6) this.f156634b).collect(new im9.k(flowCollector, (lu5.k) this.d, (ft5.a) this.f156635c, 9), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((jhi.b) this.f156634b).collect(new im9.k(flowCollector, (m5j.g) this.d, (String) this.f156635c, 10), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((jhi.b) this.f156634b).collect(new ahd.b(flowCollector, (m7e.b) this.d, (String) this.f156635c, 26), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = this.f156634b.collect(new ly4.d(flowCollector, (m8a.d) this.d, (String) this.f156635c), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((wkm.l) this.f156634b).collect(new a87.f(flowCollector, (mhd.q0) this.d, (List) this.f156635c, 5), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((akg.n) this.f156634b).collect(new im9.k(flowCollector, (mk0.o) this.d, (tk0.g) this.f156635c, 11), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = this.f156634b.collect(new im9.k(flowCollector, (mle.z) this.d, (WealthAccount.TaxAdvantageWealthAccount) this.f156635c, 12), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = this.f156634b.collect(new im9.k(flowCollector, (mle.z) this.d, (WealthAccount.Margin) this.f156635c, 13), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
