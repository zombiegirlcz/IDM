package ahd;

import ahe.f0;
import cie.c1;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.h1;
import vkm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f4968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4969c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(Flow flow, Object obj2, Object obj3, int i) {
        this.f4967a = i;
        this.f4968b = flow;
        this.f4969c = obj2;
        this.d = obj3;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f4967a) {
            case 0:
                Object objCollect = ((wkm.l) this.f4968b).collect(new a87.f(flowCollector, (c0) this.f4969c, (List) this.d, 1), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f4968b.collect(new f0(flowCollector, (Clause) this.f4969c, (ProductSpaceIdentifier) this.d, 0), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = this.f4968b.collect(new f0(flowCollector, (aqd.a) this.f4969c, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.e) this.d, 1), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((an9.g) this.f4968b).collect(new f0(flowCollector, (ayf.n) this.f4969c, (Function2) this.d, 2), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((vkm.d) this.f4968b).collect(new f0(flowCollector, (b2l.d) this.f4969c, (zsc.f) this.d, 3), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((vkm.d) this.f4968b).collect(new f0(flowCollector, (b97.f) this.f4969c, (GlobalSearchContext) this.d, 5), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((wkm.l) this.f4968b).collect(new f0(flowCollector, (Function1) this.f4969c, (Function1) this.d, 6), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((ba4.x) this.f4968b).collect(new f0(flowCollector, (bn2.p) this.f4969c, (BackgroundKey) this.d, 7), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((wkm.l) this.f4968b).collect(new f0(flowCollector, (Set) this.f4969c, (bn2.p) this.d, 8), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((vkm.d) this.f4968b).collect(new b(flowCollector, (String) this.f4969c, (bnh.n) this.d), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((jhi.b) this.f4968b).collect(new f0(flowCollector, (c1g.a0) this.f4969c, (TravelExperienceDatesSelection) this.d, 10), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((q0) this.f4968b).collect(new f0(flowCollector, (com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.c) this.f4969c, (SubscriptionCancellationScreenContract$InputData.RecurrentPayment) this.d, 11), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((jhi.b) this.f4968b).collect(new c1(flowCollector, (com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f4969c, (ProductAccountDescriptor$Value) this.d), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((a44.c) this.f4968b).collect(new f0(flowCollector, (cq6.l) this.f4969c, (StakingProduct) this.d, 12), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f4968b.collect(new f0(flowCollector, (String) this.f4969c, (f5j.k) this.d, 13), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((vkm.d) this.f4968b).collect(new f0(flowCollector, (ArrayList) this.f4969c, (ArrayList) this.d, 14), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = this.f4968b.collect(new f0(flowCollector, (dc0.f) this.f4969c, (cc0.b) this.d, 15), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f4968b.collect(new dqd.v(flowCollector, (dqd.y) this.f4969c, (IncomeSorterHomeContract$DestinationValue) this.d, 0), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((wkm.l) this.f4968b).collect(new dqd.v(flowCollector, (dqd.y) this.f4969c, (IncomeSorterHomeContract$DestinationValue) this.d, 1), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((j23.b) this.f4968b).collect(new f0(flowCollector, (r10.q) this.f4969c, (ExchangeOrder) this.d, 18), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((jhi.b) this.f4968b).collect(new b(flowCollector, (e15.e) this.f4969c, (String) this.d, 6), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f4968b.collect(new f0(flowCollector, (List) this.d, (String) this.f4969c, 19), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((wkm.l) this.f4968b).collect(new f0(flowCollector, (ei3.m) this.f4969c, (AccountId) this.d, 20), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = ((jhi.k) this.f4968b).collect(new f0(flowCollector, (r10.r) this.f4969c, (pr6.e) this.d, 21), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((amh.w) this.f4968b).collect(new f28.k(flowCollector, (f28.t) this.f4969c, (String) this.d, 0), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((wkm.l) this.f4968b).collect(new f28.k(flowCollector, (f28.t) this.f4969c, (String) this.d, 1), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((jhi.b) this.f4968b).collect(new f2d.e(flowCollector, (f2d.m) this.f4969c, (WatchlistItem) this.d), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((f3d.g) this.f4968b).collect(new b(flowCollector, (f3d.i) this.f4969c, (String) this.d, 9), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((vkm.d) this.f4968b).collect(new f0(flowCollector, (fla.g) this.f4969c, (String) this.d, 23), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((jhi.b) this.f4968b).collect(new f0(flowCollector, (g0c.b) this.f4969c, (h1) this.d, 25), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }

    public y(Flow flow, List list, String str) {
        this.f4967a = 21;
        this.f4968b = flow;
        this.d = list;
        this.f4969c = str;
    }
}
