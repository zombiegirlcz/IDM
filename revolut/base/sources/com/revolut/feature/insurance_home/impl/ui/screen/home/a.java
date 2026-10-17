package com.revolut.feature.insurance_home.impl.ui.screen.home;

import ch.qos.logback.core.net.SyslogConstants;
import cka.b;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_car.api.navigation.InsuranceCarFeatureConfig;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.insurance_home.impl.data.model.Action;
import com.revolut.feature.insurance_home.impl.data.model.ProductSummary;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreenContract$ModalStep;
import com.revolut.feature.insurance_pet.api.navigation.PetFeatureConfig;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import cu8.r0;
import ffk.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll7.v;
import mra.d;
import nr7.f;
import oki.h;
import qka.c;
import rl7.e;
import tq0.j;
import tw7.i;
import tw7.k;
import tw7.m;
import vkm.j2;
import wli.x;
import yji.l;
import zh9.u0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f76218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f76219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f76220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f76221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kw7.e f76222t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(n stateMapper, e insuranceCarInteractor, t pricingPlanInteractor, x deeplinkHandler, c productArticleNavigationProvider, r0 kycRequiredActionTransformer, kw7.e insuranceHomeLayoutInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(insuranceCarInteractor, "insuranceCarInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(insuranceHomeLayoutInteractor, "insuranceHomeLayoutInteractor");
        this.o = insuranceCarInteractor;
        this.f76218p = pricingPlanInteractor;
        this.f76219q = deeplinkHandler;
        this.f76220r = productArticleNavigationProvider;
        this.f76221s = kycRequiredActionTransformer;
        this.f76222t = insuranceHomeLayoutInteractor;
        this.u = d.b(this, new tw7.h(new Data(null, null, true, 3, null), false, null), stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new j(28));
    }

    public static final void I2(NaviCommand naviCommand, a aVar, Action action) {
        c productArticleNavigationProvider = aVar.f76220r;
        String articleId = action.f76168b;
        Intrinsics.checkNotNullParameter(naviCommand, "<this>");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        SkipShownArticleBehaviour.AlwaysShow skipShownArticleBehaviour = SkipShownArticleBehaviour.AlwaysShow.f81285a;
        Intrinsics.checkNotNullParameter(skipShownArticleBehaviour, "skipShownArticleBehaviour");
        if (articleId != null) {
            Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            Intrinsics.checkNotNullParameter(skipShownArticleBehaviour, "skipShownArticleBehaviour");
            naviCommand = gc0.c.f(b.a(productArticleNavigationProvider, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(articleId)), skipShownArticleBehaviour, new ProductArticleCommandInterceptor(naviCommand, null, null, naviCommand, 6), null, null, SyslogConstants.LOG_CLOCK));
        }
        aVar.C1(u0.b(naviCommand));
    }

    @Override // yji.l
    public final void I1() {
        e eVar = this.o;
        l.a1(this, nim.a.v(u0.m(rd0.e.b(((ll7.h) eVar.f254926a).f196635h.f(Unit.f186387a, false)), v.d(eVar.f254927b)), new rj7.b(23)), null, null, new m(this, null, 2), 3);
        l.a1(this, kw7.e.a(this.f76222t), null, null, new m(this, null, 0), 3);
        l.a1(this, rd0.e.b(this.f76218p.q()), null, null, new m(this, null, 1), 3);
    }

    public final void J2(Object obj2, String listId) {
        NaviCommand naviCommandF;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (!(obj2 instanceof Action)) {
            if (obj2 instanceof nr7.c) {
                l2(new tqh.j(this, ((nr7.c) obj2).f218591a, continuation, 15), new yi5.b(26));
                return;
            }
            if (obj2 instanceof nr7.e) {
                C1(u0.c(new FaqFeatureConfig.Starter(((nr7.e) obj2).f218593a, 2)));
                return;
            } else {
                if (obj2 instanceof f) {
                    f fVar = (f) obj2;
                    K2(fVar.f218595b, fVar.f218594a);
                    return;
                }
                return;
            }
        }
        Action action = (Action) obj2;
        lw7.a aVar = action.f76167a;
        ProductSummary productSummary = action.d;
        String str = action.f76169c;
        int i = 0;
        switch (k.f274940a[aVar.ordinal()]) {
            case 1:
                n2(new tw7.l(this, continuation, i), new whi.b(6));
                return;
            case 2:
                I2(u0.f(new InsuranceEmbeddedDestinations.PlanComparison(bu7.k.TRAVEL)), this, action);
                return;
            case 3:
                I2(u0.f(new InsuranceEmbeddedDestinations.PlanComparison(bu7.k.PURCHASE)), this, action);
                return;
            case 4:
                if (((tw7.h) ((j2) this.u.f22677a).getValue()).f274935b) {
                    InsuranceCarFeatureConfig.OnboardingDestination inner = InsuranceCarFeatureConfig.OnboardingDestination.f75153a;
                    Intrinsics.checkNotNullParameter(inner, "inner");
                    List listK = zhm.v.k(new InsuranceCarFeatureConfig.Home(null), new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) inner, false, (Integer) null, 0, 61));
                    ArrayList arrayList = new ArrayList(w.t(listK, 10));
                    Iterator it8 = listK.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(new FeatureCommand((KompotBridgeFeatureConfig) it8.next()));
                    }
                    naviCommandF = new CompositeCommand(arrayList);
                } else {
                    naviCommandF = u0.f(InsuranceCarFeatureConfig.HomeDestination.f75152a);
                }
                I2(naviCommandF, this, action);
                return;
            case 5:
                I2(gc0.c.f(new PetFeatureConfig.Hub(null)), this, action);
                return;
            case 6:
                I2(u0.f(new InsuranceEmbeddedDestinations.CoverageList(bu7.k.TRAVEL)), this, action);
                return;
            case 7:
                I2(u0.f(new InsuranceEmbeddedDestinations.CoverageList(bu7.k.PURCHASE)), this, action);
                return;
            case 8:
                if (str != null) {
                    I2(u0.f(new InsuranceEmbeddedDestinations.SchemeInsurance(str)), this, action);
                    return;
                }
                return;
            case 9:
                if (str != null) {
                    I2(u0.f(new InsuranceEmbeddedDestinations.DetailsLayout(str, false)), this, action);
                    return;
                }
                return;
            case 10:
                if (productSummary != null) {
                    h.v2(this.v, new InsuranceHomeScreenContract$ModalStep.Summary(productSummary), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    return;
                }
                return;
            case 11:
                IllegalStateException illegalStateException = new IllegalStateException("Unknown action type in action: type=" + aVar + ", articleId=" + action.f76168b + ", product=" + str + ", hasProductSummary=" + (productSummary != null));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void K2(String str, List list) {
        if (!list.isEmpty()) {
            C1(u0.c(new PricingPlanFeatureConfig.DashboardByPlans(null, list, str, null, false, xfa.b.INSURANCE_HOME, 185)));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("planIds must not be empty");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
