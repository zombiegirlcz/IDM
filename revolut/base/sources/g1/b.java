package g1;

import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.a;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuoteParams;
import com.revolut.feature.store.api.model.StoreExclusivesFiltersResponse;
import com.revolut.feature.store.api.model.StoreExclusivesOffersResponse;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePricingFilter;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.model.ExpandableFilterSection;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.model.TravelExperienceExpandableFilters;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsScreen;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import g25.p;
import g2d.g;
import g2g.l;
import g46.f;
import g48.b0;
import g48.r0;
import j18.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lk0.h;
import myf.k;
import ne0.j;
import od0.h;
import od0.i;
import r10.q;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f139507b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f139506a = i;
        this.f139507b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ExpandableFilterSection expandableFilterSection;
        ExpandableFilterSection expandableFilterSection2;
        ExpandableFilterSection expandableFilterSection3;
        int i = this.f139506a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f139507b;
        switch (i) {
            case 0:
                return Boolean.valueOf(DragGestureNode._canDrag$lambda$0((DragGestureNode) obj3, (PointerType) obj2));
            case 1:
                return ScrollableNode._init_$lambda$0((ScrollableNode) obj3, (LayoutCoordinates) obj2);
            case 2:
                return Float.valueOf(ScrollableStateKt.rememberScrollableState$lambda$0$0((State) obj3, ((Float) obj2).floatValue()));
            case 3:
                return ScrollingLogic.performScrollForOverscroll$lambda$0((ScrollingLogic) obj3, (Offset) obj2);
            case 4:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (f11.b) ((g11.b) obj3).f139515b.get("CHALLENGE_STATUS_MEMORY_CACHE_KEY");
            case 5:
                String ref2 = (String) obj2;
                Intrinsics.checkNotNullParameter(ref2, "ref");
                o18.a aVar = (o18.a) ((g18.c) obj3).f139561b.get(g18.c.a(ref2));
                if (aVar == null) {
                    return null;
                }
                i.Companion.getClass();
                return h.a(aVar);
            case 6:
                o it8 = (o) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (o18.e) ((j) ((q) obj3).f250850c).get(it8);
            case 7:
                ExchangeOrderDraft it9 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ExchangeOrderDraft.a(it9, null, null, null, null, null, null, null, null, null, null, null, 0.0d, false, null, null, null, null, ((ExchangeFeatureConfig.BuyInvest) obj3).e, 32505855);
            case 8:
                ExchangeOrderDraft it10 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ExchangeOrderDraft.a(it10, null, null, null, null, null, null, null, null, null, null, null, 0.0d, false, null, null, null, null, ((ExchangeFeatureConfig.Sell) obj3).f96854h, 32505855);
            case 9:
                ExchangeOrderDraft it11 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ExchangeOrderDraft.a(it11, null, null, null, null, null, null, null, null, null, null, null, 0.0d, false, null, null, null, null, ((ExchangeFeatureConfig.SellInvest) obj3).e, 32505855);
            case 10:
                xi0.b it12 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new Pair(((ExchangeFeatureConfig.FreelancerSell) obj3).f96844a, it12);
            case 11:
                ExchangeOrderDraft it13 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return ExchangeOrderDraft.a(it13, null, null, null, null, null, null, null, null, null, null, null, 0.0d, false, null, null, null, null, ((ExchangeFeatureConfig.Buy) obj3).f96833g, 32505855);
            case 12:
                i quote = (i) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                return new FeatureCommand(new ExchangeBreakdownFeatureConfig((LegacyOrderQuoteParams) obj3, (OrderQuote) quote.f224257a, c4i.a.EXCHANGE, null, false, 2040));
            case 13:
                KProperty[] kPropertyArr = WealthAllNewsScreen.V;
                com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar = (com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) ((WealthAllNewsScreen) obj3).e3();
                bVar.getClass();
                h.b event = h.b.f196176a;
                Intrinsics.checkNotNullParameter(event, "event");
                bVar.l2(new g1k.h(bVar, objArr == true ? 1 : 0, 2), new yi5.b(26));
                return Unit.f186387a;
            case 14:
                return SnapshotStateObserver.readObserver$lambda$0((SnapshotStateObserver) obj3, obj2);
            case 15:
                x15.e model = (x15.e) obj2;
                Intrinsics.checkNotNullParameter(model, "creditApplicationAccount");
                p pVar = ((g25.i) obj3).f139894b;
                Intrinsics.checkNotNullParameter(model, "model");
                if (((wr3.b) pVar.f139904b).a(model.f302252a.f14164b)) {
                    return pVar.f(model, true);
                }
                if (model.f302253b != null) {
                    return pVar.e(model);
                }
                return null;
            case 16:
                g2d.a it14 = (g2d.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return ((g2d.d) obj3).f(it14);
            case 17:
                g2d.e it15 = (g2d.e) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return ((g) obj3).f(it15);
            case 18:
                g2g.b bVar2 = (g2g.b) obj3;
                k it16 = (k) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                TravelExperiencePricingFilter travelExperiencePricingFilter = it16.f210477b;
                ArrayList arrayList = it16.f210478c;
                i2g.a aVar2 = i2g.a.POPULAR;
                TravelExperienceExpandableFilters travelExperienceExpandableFilters = (TravelExperienceExpandableFilters) ((l) bVar2.t2()).f140056a.getContent();
                boolean z = false;
                ExpandableFilterSection expandableFilterSection4 = new ExpandableFilterSection(arrayList, aVar2, (travelExperienceExpandableFilters == null || (expandableFilterSection3 = travelExperienceExpandableFilters.f93075b) == null) ? false : expandableFilterSection3.f93073c);
                ArrayList arrayList2 = it16.f210476a;
                i2g.a aVar3 = i2g.a.CATEGORY;
                TravelExperienceExpandableFilters travelExperienceExpandableFilters2 = (TravelExperienceExpandableFilters) ((l) bVar2.t2()).f140056a.getContent();
                ExpandableFilterSection expandableFilterSection5 = new ExpandableFilterSection(arrayList2, aVar3, (travelExperienceExpandableFilters2 == null || (expandableFilterSection2 = travelExperienceExpandableFilters2.f93076c) == null) ? false : expandableFilterSection2.f93073c);
                List list = it16.d;
                i2g.a aVar4 = i2g.a.DURATION;
                TravelExperienceExpandableFilters travelExperienceExpandableFilters3 = (TravelExperienceExpandableFilters) ((l) bVar2.t2()).f140056a.getContent();
                if (travelExperienceExpandableFilters3 != null && (expandableFilterSection = travelExperienceExpandableFilters3.d) != null) {
                    z = expandableFilterSection.f93073c;
                }
                return new TravelExperienceExpandableFilters(travelExperiencePricingFilter, expandableFilterSection4, expandableFilterSection5, new ExpandableFilterSection(list, aVar4, z));
            case 19:
                return com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.a.a((com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.a) obj2, (a.C0495a) obj3, null, null, 6);
            case 20:
                MarginQuoteParams params = (MarginQuoteParams) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (MarginQuote) ((g3b.k) obj3).f140260b.get(g3b.k.a(params));
            case 21:
                g3e.d dVar = (g3e.d) obj3;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                StoreExclusivesOffersResponse storeExclusivesOffersResponse = (StoreExclusivesOffersResponse) data.getContent();
                List list2 = storeExclusivesOffersResponse != null ? storeExclusivesOffersResponse.f88518b : null;
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                return new lk0.e(list2, dVar, data.getLoading(), null, data.getError(), 8);
            case 22:
                return g3e.a.a((g3e.a) obj2, null, null, ((StoreExclusivesFiltersResponse) obj3).f88505a, null, 11);
            case 23:
                k3l.j result = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return ((g3l.d) obj3).b(result);
            case 24:
                StatusViewConfiguration configuration = (StatusViewConfiguration) obj2;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                ((k3l.d) ((g3l.c) obj3).f140308l).O(configuration);
                return Unit.f186387a;
            case 25:
                f fVar = (f) obj3;
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.c) {
                    fVar.V2(new g46.e(fVar, null), new yi5.b(29));
                }
                return Unit.f186387a;
            case 26:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                ((g48.f) obj3).f140364a.c(command);
                return Boolean.TRUE;
            case 27:
                b0 params2 = (b0) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (i) ((r0) obj3).f.get(r0.v(params2));
            case 28:
                g4b.a aVar5 = (g4b.a) obj3;
                i positionId = (i) obj2;
                Intrinsics.checkNotNullParameter(positionId, "positionId");
                if (!positionId.d()) {
                    return vkm.i.f290039a;
                }
                y1b.a aVar6 = aVar5.f140429b;
                String portfolioId = aVar5.f140428a.g();
                String positionId2 = (String) positionId.c();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(positionId2, "positionId");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                g3b.b bVar3 = ((p2b.b) aVar6).f232192a;
                p0g.b reloadWhile = new p0g.b(5);
                g3b.g gVar = (g3b.g) bVar3;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(positionId2, "positionId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Intrinsics.checkNotNullParameter(reloadWhile, "reloadWhile");
                return vkm.q.R(qe0.o.a(do3.q.f(gVar.f, gVar.d), new g3b.a(portfolioId, positionId2), 1L, loadingStrategy, false, reloadWhile, 8), new hr4.b(3, 12, objArr2 == true ? 1 : 0));
            default:
                Intrinsics.checkNotNullParameter((aii.q) obj2, "it");
                ((com.revolut.feature.retail.cfd.impl.screens.positions.a) obj3).C2(aii.q.f5292a);
                return Unit.f186387a;
        }
    }
}
