package com.revolut.feature.travel.miles.impl.ui.flow;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.api.article.MilesArticles;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.TravelMilesFlowContract$Step;
import com.revolut.feature.travel.miles.impl.ui.screen.home.b;
import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import com.revolut.kompot.navigable.TransitionAnimation;
import d73.n;
import d8l.d;
import dgg.c;
import eub.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import vkm.t1;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements c {
    public final TravelMilesFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f94206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f94207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zja.a f94208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vfg.h f94209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f94210t;
    public final t1 u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ProductArticleParams f94211w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yki.i f94212x;

    public b(TravelMilesFlowContract$InputData inputData, i revPointsOptInInteractor, gte.a featureToggleInteractor, zja.a productArticleInteractor, vfg.h milesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(milesFeatureInteractor, "milesFeatureInteractor");
        this.o = inputData;
        this.f94206p = revPointsOptInInteractor;
        this.f94207q = featureToggleInteractor;
        this.f94208r = productArticleInteractor;
        this.f94209s = milesFeatureInteractor;
        z1 z1VarB = q.b(1, 5, null);
        this.f94210t = z1VarB;
        this.u = q.g(z1VarB);
        this.f94211w = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(MilesArticles.ONBOARDING));
        this.f94212x = d.a(this, new cwj.h(this, 29));
    }

    public final TravelMilesFlowContract$Step I2(String str) {
        return ((jte.d) this.f94209s.f288621a).c(TravelMilesApi$Toggles.LoyaltyAirMilesTransfers.f94080c) ? new TravelMilesFlowContract$Step.AgentDetails(str) : new TravelMilesFlowContract$Step.AirlineDetails(str);
    }

    public final TravelMilesFlowContract$Step J2() {
        TravelMilesFlowContract$InputData travelMilesFlowContract$InputData = this.o;
        if (travelMilesFlowContract$InputData instanceof TravelMilesFlowContract$InputData.Home) {
            TravelMilesFlowContract$InputData.Home home = (TravelMilesFlowContract$InputData.Home) travelMilesFlowContract$InputData;
            if (!((jte.d) this.f94207q).c(TravelMilesApi$Toggles.AirMilesFlightSearch.f94078c)) {
                return TravelMilesFlowContract$Step.MainScreen.f94184a;
            }
            TravelMilesFlowContract$InputData.Home.FlightSearchParams flightSearchParams = home.f94168b;
            return new TravelMilesFlowContract$Step.FlightSearch(flightSearchParams != null ? flightSearchParams.f94169a : null, flightSearchParams != null ? flightSearchParams.f94170b : null, flightSearchParams != null);
        }
        if (travelMilesFlowContract$InputData instanceof TravelMilesFlowContract$InputData.AirlineDetails) {
            return I2(((TravelMilesFlowContract$InputData.AirlineDetails) travelMilesFlowContract$InputData).f94165a);
        }
        if (!(travelMilesFlowContract$InputData instanceof TravelMilesFlowContract$InputData.Transfer)) {
            throw new NoWhenBranchMatchedException();
        }
        TravelMilesFlowContract$InputData.Transfer transfer = (TravelMilesFlowContract$InputData.Transfer) travelMilesFlowContract$InputData;
        String str = transfer.f94171a;
        Integer num = transfer.f94172b;
        return ((jte.d) this.f94209s.f288621a).c(TravelMilesApi$Toggles.LoyaltyAirMilesTransfers.f94080c) ? new TravelMilesFlowContract$Step.AgentTransfer(str, num) : new TravelMilesFlowContract$Step.Transfer(str, num);
    }

    public final void K2(yki.b bVar, b.a aVar) {
        if (aVar instanceof com.revolut.feature.travel.miles.impl.ui.screen.home.a) {
            h.t2(this, bVar, I2(((com.revolut.feature.travel.miles.impl.ui.screen.home.a) aVar).f94349a.f276617a), true, null, false, 12);
        } else {
            if (!(aVar instanceof b.a.C0576a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, bVar, ((jte.d) this.f94209s.f288621a).c(TravelMilesApi$Toggles.LoyaltyAirMilesTransfers.f94080c) ? TravelMilesFlowContract$Step.SearchAirlineHome.f94190a : TravelMilesFlowContract$Step.SearchAirline.f94189a, true, TransitionAnimation.FADE.f98392a, false, 8);
        }
    }

    public final void L2(yki.b bVar, b.a aVar) {
        if (aVar instanceof b.a.C0577a) {
            h.t2(this, bVar, ((jte.d) this.f94209s.f288621a).c(TravelMilesApi$Toggles.LoyaltyAirMilesTransfers.f94080c) ? TravelMilesFlowContract$Step.SearchAirlineHome.f94190a : TravelMilesFlowContract$Step.SearchAirline.f94189a, true, TransitionAnimation.FADE.f98392a, false, 8);
        } else if (aVar instanceof com.revolut.feature.travel.miles.impl.ui.screen.main.a) {
            h.t2(this, bVar, I2(((com.revolut.feature.travel.miles.impl.ui.screen.main.a) aVar).f94367a.f94088a), true, null, false, 12);
        } else {
            if (!(aVar instanceof b.a.C0578b)) {
                throw new NoWhenBranchMatchedException();
            }
            h.t2(this, bVar, TravelMilesFlowContract$Step.Transactions.f94191a, true, null, false, 12);
        }
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94212x;
    }
}
