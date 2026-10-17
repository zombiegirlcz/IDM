package djc;

import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingInfo;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.wealth.models.margin.WealthMarginBorrowingInterest;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeStakingData;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.n3;
import org.jmrtd.PassportService;
import org.jmrtd.lds.LDSFile;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od0.i f115324b;

    public /* synthetic */ z(int i, od0.i iVar) {
        this.f115323a = i;
        this.f115324b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        StakingInfo stakingInfo;
        switch (this.f115323a) {
            case 0:
                return i.a((i) obj2, null, null, null, (qv0.i) this.f115324b.f224257a, null, null, false, 239);
            case 1:
                return fy5.a.a((fy5.a) obj2, null, this.f115324b, null, null, 13);
            case 2:
                StakingAvailability stakingAvailability = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(stakingAvailability, "stakingAvailability");
                StakingProduct stakingProduct = stakingAvailability.f88058a;
                if (((stakingProduct == null || (stakingInfo = stakingProduct.f88087b) == null) ? null : stakingInfo.k) != vtd.b.MANUAL) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar = od0.i.Companion;
                ExchangeStakingData exchangeStakingData = new ExchangeStakingData(((io3.d) this.f115324b.c()).f163145a, stakingAvailability);
                hVar.getClass();
                return od0.h.a(exchangeStakingData);
            case 3:
                return com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.a.a((com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.a) obj2, null, this.f115324b, null, 5);
            case 4:
                return g8i.r.a((g8i.r) obj2, null, false, null, null, (qv0.i) this.f115324b.f224257a, null, null, 3839);
            case 5:
                od0.i personalTerms = this.f115324b;
                Intrinsics.h(personalTerms);
                ((gd9.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(personalTerms, "personalTerms");
                return new gd9.d(personalTerms);
            case 6:
                od0.i inventoryProvider = this.f115324b;
                Intrinsics.h(inventoryProvider);
                ((hdg.b) obj2).getClass();
                Intrinsics.checkNotNullParameter(inventoryProvider, "inventoryProvider");
                return new hdg.b(inventoryProvider);
            case 7:
                return iuf.l.a((iuf.l) obj2, null, null, null, (qv0.i) this.f115324b.f224257a, null, null, LDSFile.EF_DG15_TAG);
            case 8:
                od0.i incomeSorterOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(incomeSorterOptional, "incomeSorterOptional");
                return new Pair(incomeSorterOptional, this.f115324b);
            case 9:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, (n3) this.f115324b.f224257a, null, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -16385, 63);
            case 10:
                od0.i iVar = this.f115324b;
                Intrinsics.h(iVar);
                return l7j.g.a((l7j.g) obj2, null, null, null, iVar, 7);
            case 11:
                return l9k.i.a((l9k.i) obj2, null, null, (qv0.i) this.f115324b.f224257a, null, 23);
            case 12:
                WealthMarginBorrowingInterest wealthMarginBorrowingInterest = (WealthMarginBorrowingInterest) this.f115324b.c();
                ((n6h.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(wealthMarginBorrowingInterest, "wealthMarginBorrowingInterest");
                return new n6h.d(wealthMarginBorrowingInterest);
            case 13:
                return new Pair(this.f115324b, (q9c.r) obj2);
            case 14:
                return oc3.h.a((oc3.h) obj2, false, null, null, null, false, false, null, null, this.f115324b.d(), 255);
            case 15:
                ocb.g gVar = (ocb.g) obj2;
                Boolean bool = (Boolean) this.f115324b.f224257a;
                return ocb.g.a(gVar, null, false, null, false, bool != null ? bool.booleanValue() : true, null, null, null, null, false, false, false, null, false, null, 32751);
            case 16:
                if (((Boolean) obj2).booleanValue()) {
                    return this.f115324b;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 17:
                Map files = (Map) obj2;
                Intrinsics.checkNotNullParameter(files, "files");
                List list = (List) files.get(((h0d.j) this.f115324b.c()).a());
                return list == null ? f0.f322471a : list;
            case 18:
                return pnh.j.a((pnh.j) obj2, null, null, null, null, this.f115324b, null, null, null, 959);
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new yhm.r(this.f115324b, (mwg.b) pair.f186385a, (TradingLegalEntityInformation) pair.f186386b);
            case 20:
                return qsa.i.a((qsa.i) obj2, null, null, (qv0.i) this.f115324b.f224257a, null, 47);
            case 21:
                return r4k.l.a((r4k.l) obj2, null, null, null, (qv0.i) this.f115324b.f224257a, null, null, 959);
            case 22:
                return ueg.v.a((ueg.v) obj2, null, null, null, null, null, null, (TravelHotelsSortingOption) this.f115324b.f224257a, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388543);
            case 23:
                PortfolioSpareChangeScreenContract$DomainState portfolioSpareChangeScreenContract$DomainState = (PortfolioSpareChangeScreenContract$DomainState) obj2;
                vnc.a aVar = (vnc.a) this.f115324b.f224257a;
                return PortfolioSpareChangeScreenContract$DomainState.a(portfolioSpareChangeScreenContract$DomainState, null, Integer.valueOf(aVar != null ? aVar.f290791a : 1), aVar == null ? unc.e.CREATE : !aVar.f290792b ? unc.e.ENABLE : unc.e.UPDATE, null, null, null, 57);
            case 24:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f115324b;
            case 25:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f115324b;
            case 26:
                return yeg.b.a((yeg.b) obj2, null, (TravelHotelsSortingOption) this.f115324b.f224257a, 1);
            case 27:
                return yic.e.a((yic.e) obj2, null, null, null, null, null, (qv0.i) this.f115324b.f224257a, null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            default:
                yna.a aVar2 = (yna.a) obj2;
                od0.i iVar2 = this.f115324b;
                return yna.a.a(aVar2, null, null, null, null, null, null, null, false, false, null, false, null, null, null, iVar2 != null ? (oga.g) iVar2.g() : null, 32767);
        }
    }
}
