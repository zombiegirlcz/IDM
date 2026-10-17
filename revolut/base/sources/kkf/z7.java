package kkf;

import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class z7 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f185057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f185058c;

    public /* synthetic */ z7(Flow flow, Object obj2, int i) {
        this.f185056a = i;
        this.f185057b = flow;
        this.f185058c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f185056a) {
            case 0:
                Object objCollect = ((jhi.b) this.f185057b).collect(new k7i.c(flowCollector, (tof.f4) this.f185058c, 27), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((x5) this.f185057b).collect(new k7i.c(flowCollector, (e8) this.f185058c, 28), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f185057b.collect(new k7i.c(flowCollector, (g8) this.f185058c, 29), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((vkm.d) this.f185057b).collect(new i8(flowCollector, (j8) this.f185058c, 0), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = this.f185057b.collect(new s2(flowCollector, (o8) this.f185058c, 24), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = this.f185057b.collect(new i8(flowCollector, (s8) this.f185058c, 1), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((wkm.l) this.f185057b).collect(new s2(flowCollector, (z8) this.f185058c, 26), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((j23.b) this.f185057b).collect(new i8(flowCollector, (f9) this.f185058c, 2), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = this.f185057b.collect(new i8(flowCollector, (k9) this.f185058c, 3), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((zfd.e) this.f185057b).collect(new klf.w0(flowCollector, (tof.a3) this.f185058c, 0), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((j23.b) this.f185057b).collect(new h9(flowCollector, (klf.n2) this.f185058c), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((vkm.h) this.f185057b).collect(new i8(flowCollector, (AnalyticsSpendingPeriod$Interval) this.f185058c, 8), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = this.f185057b.collect(new i8(flowCollector, (ku1.e0) this.f185058c, 10), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((akg.n) this.f185057b).collect(new i8(flowCollector, (CryptoCommodityPositions) this.f185058c, 11), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f185057b.collect(new klj.e(flowCollector, (kv5.k) this.f185058c), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = this.f185057b.collect(new i8(flowCollector, (l10.n) this.f185058c, 12), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((kx4.f0) this.f185057b).collect(new i8(flowCollector, (WealthNewsArticleReaderScreen) this.f185058c, 13), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((j23.b) this.f185057b).collect(new l2d.e(flowCollector, (mgd.g) this.f185058c, 0), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((kx4.f0) this.f185057b).collect(new l2d.g(flowCollector, (FavouritesAssetTypeKey) this.f185058c, 1), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((jhi.k) this.f185057b).collect(new i8(flowCollector, (l5d.k) this.f185058c, 14), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f185057b.collect(new i8(flowCollector, (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a) this.f185058c, 16), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((vkm.v1) this.f185057b).collect(new i8(flowCollector, (lbc.v) this.f185058c, 17), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((vkm.d) this.f185057b).collect(new l5d.d(flowCollector, (lc0.b0) this.f185058c, 8), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((vkm.d) this.f185057b).collect(new i8(flowCollector, (jid.z) this.f185058c, 18), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((vkm.y) this.f185057b).collect(new i8(flowCollector, (lal.a) this.f185058c, 19), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((tnb.k) this.f185057b).collect(new l5d.d(flowCollector, (ldi.d) this.f185058c, 10), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = this.f185057b.collect(new i8(flowCollector, (le3.i) this.f185058c, 20), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = this.f185057b.collect(new i8(flowCollector, (lkf.h) this.f185058c, 21), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = this.f185057b.collect(new i8(flowCollector, (lkf.k) this.f185058c, 22), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = this.f185057b.collect(new i8(flowCollector, (lkf.m) this.f185058c, 23), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
