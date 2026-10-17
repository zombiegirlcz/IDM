package y5b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsAvailableRewards;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSection;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoCardBenefits;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoOverview;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewards;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoStatusBanner;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoTabs;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoTransactions;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.feature.retail.cobranded_cards.impl.data.service.CobrandedCardsPlansService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wf0.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlansService f311026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f311027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f311028c;
    public final v5b.d d;
    public final x4l.c e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x4l.c f311029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x4l.c f311030h;
    public final x4l.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x4l.c f311031j;

    public c0(CobrandedCardsPlansService service, ue0.c storage, ne0.j memoryCache, v5b.d notEnoughFundsChecker) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(notEnoughFundsChecker, "notEnoughFundsChecker");
        this.f311026a = service;
        this.f311027b = storage;
        this.f311028c = memoryCache;
        this.d = notEnoughFundsChecker;
        Continuation continuation = null;
        z zVar = new z(this, continuation, 3);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: y5b.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311068b;

            {
                this.f311068b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (String) this.f311068b.f311028c.get("KEY_PRODUCT_ARTICLE");
                    case 1:
                        String currentPlanId = (String) obj2;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        ne0.j jVar = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsPlanHubInfo) jVar.get(x.b(currentPlanId));
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (r5b.j) this.f311068b.f311028c.get("KEY_PLAN_CURRENT");
                    default:
                        String code = (String) obj2;
                        Intrinsics.checkNotNullParameter(code, "code");
                        ne0.j jVar2 = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsAvailableRewards) jVar2.get(x.a(code));
                }
            }
        };
        final int i2 = 2;
        this.e = new x4l.c(zVar, function1, new Function2(this) { // from class: y5b.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311070b;

            {
                this.f311070b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        String currentPlanId = (String) obj2;
                        CobrandedCardsPlanHubInfo domain = (CobrandedCardsPlanHubInfo) obj3;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar.f(x.b(currentPlanId), domain);
                        break;
                    case 1:
                        r5b.j domain2 = (r5b.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f311070b.f311028c.f("KEY_PLAN_CURRENT", domain2);
                        break;
                    case 2:
                        String domain3 = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f311070b.f311028c.f("KEY_PRODUCT_ARTICLE", domain3);
                        break;
                    default:
                        String code = (String) obj2;
                        CobrandedCardsAvailableRewards domain4 = (CobrandedCardsAvailableRewards) obj3;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar2 = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar2.f(x.a(code), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, null, 1), new wa7.j(this, continuation, 17));
        int i3 = 2;
        int i5 = 3;
        this.f = new x4l.c(new b0(this, continuation, 0), new y4b.b(22), new y13.a(27), new r0(i3, 11, continuation), new uyd.e0(i5, 27, continuation));
        this.f311029g = new x4l.c(new z(this, continuation, 2), new y4b.b(23), new y13.a(28), new r0(i3, 12, continuation), new uyd.e0(i5, 28, continuation));
        final int i6 = 3;
        this.f311030h = new x4l.c(new wqj.g(this, continuation, 29), new Function1(this) { // from class: y5b.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311068b;

            {
                this.f311068b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (String) this.f311068b.f311028c.get("KEY_PRODUCT_ARTICLE");
                    case 1:
                        String currentPlanId = (String) obj2;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        ne0.j jVar = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsPlanHubInfo) jVar.get(x.b(currentPlanId));
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (r5b.j) this.f311068b.f311028c.get("KEY_PLAN_CURRENT");
                    default:
                        String code = (String) obj2;
                        Intrinsics.checkNotNullParameter(code, "code");
                        ne0.j jVar2 = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsAvailableRewards) jVar2.get(x.a(code));
                }
            }
        }, new Function2(this) { // from class: y5b.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311070b;

            {
                this.f311070b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i6) {
                    case 0:
                        String currentPlanId = (String) obj2;
                        CobrandedCardsPlanHubInfo domain = (CobrandedCardsPlanHubInfo) obj3;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar.f(x.b(currentPlanId), domain);
                        break;
                    case 1:
                        r5b.j domain2 = (r5b.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f311070b.f311028c.f("KEY_PLAN_CURRENT", domain2);
                        break;
                    case 2:
                        String domain3 = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f311070b.f311028c.f("KEY_PRODUCT_ARTICLE", domain3);
                        break;
                    default:
                        String code = (String) obj2;
                        CobrandedCardsAvailableRewards domain4 = (CobrandedCardsAvailableRewards) obj3;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar2 = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar2.f(x.a(code), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new y(this, continuation, 0), new wvg.i(this, continuation, 27));
        final int i21 = 1;
        z zVar2 = new z(this, continuation, i21);
        Function1 function12 = new Function1(this) { // from class: y5b.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311068b;

            {
                this.f311068b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (String) this.f311068b.f311028c.get("KEY_PRODUCT_ARTICLE");
                    case 1:
                        String currentPlanId = (String) obj2;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        ne0.j jVar = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsPlanHubInfo) jVar.get(x.b(currentPlanId));
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (r5b.j) this.f311068b.f311028c.get("KEY_PLAN_CURRENT");
                    default:
                        String code = (String) obj2;
                        Intrinsics.checkNotNullParameter(code, "code");
                        ne0.j jVar2 = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsAvailableRewards) jVar2.get(x.a(code));
                }
            }
        };
        final int i22 = 0;
        this.i = new x4l.c(zVar2, function12, new Function2(this) { // from class: y5b.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311070b;

            {
                this.f311070b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i22) {
                    case 0:
                        String currentPlanId = (String) obj2;
                        CobrandedCardsPlanHubInfo domain = (CobrandedCardsPlanHubInfo) obj3;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar.f(x.b(currentPlanId), domain);
                        break;
                    case 1:
                        r5b.j domain2 = (r5b.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f311070b.f311028c.f("KEY_PLAN_CURRENT", domain2);
                        break;
                    case 2:
                        String domain3 = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f311070b.f311028c.f("KEY_PRODUCT_ARTICLE", domain3);
                        break;
                    default:
                        String code = (String) obj2;
                        CobrandedCardsAvailableRewards domain4 = (CobrandedCardsAvailableRewards) obj3;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar2 = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar2.f(x.a(code), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new y(this, continuation, 1), new wvg.i(this, continuation, 28));
        z zVar3 = new z(this, continuation, 0);
        final int i32 = 2;
        Function1 function13 = new Function1(this) { // from class: y5b.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311068b;

            {
                this.f311068b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (String) this.f311068b.f311028c.get("KEY_PRODUCT_ARTICLE");
                    case 1:
                        String currentPlanId = (String) obj2;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        ne0.j jVar = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsPlanHubInfo) jVar.get(x.b(currentPlanId));
                    case 2:
                        Unit it9 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        return (r5b.j) this.f311068b.f311028c.get("KEY_PLAN_CURRENT");
                    default:
                        String code = (String) obj2;
                        Intrinsics.checkNotNullParameter(code, "code");
                        ne0.j jVar2 = this.f311068b.f311028c;
                        c0.Companion.getClass();
                        return (CobrandedCardsAvailableRewards) jVar2.get(x.a(code));
                }
            }
        };
        final int i33 = 1;
        this.f311031j = new x4l.c(zVar3, function13, new Function2(this) { // from class: y5b.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f311070b;

            {
                this.f311070b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i33) {
                    case 0:
                        String currentPlanId = (String) obj2;
                        CobrandedCardsPlanHubInfo domain = (CobrandedCardsPlanHubInfo) obj3;
                        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        ne0.j jVar = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar.f(x.b(currentPlanId), domain);
                        break;
                    case 1:
                        r5b.j domain2 = (r5b.j) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f311070b.f311028c.f("KEY_PLAN_CURRENT", domain2);
                        break;
                    case 2:
                        String domain3 = (String) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(domain3, "domain");
                        this.f311070b.f311028c.f("KEY_PRODUCT_ARTICLE", domain3);
                        break;
                    default:
                        String code = (String) obj2;
                        CobrandedCardsAvailableRewards domain4 = (CobrandedCardsAvailableRewards) obj3;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(domain4, "domain");
                        ne0.j jVar2 = this.f311070b.f311028c;
                        c0.Companion.getClass();
                        jVar2.f(x.a(code), domain4);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a0(this, null, 0), new wa7.j(this, continuation, 16));
    }

    public static final CobrandedCardsPlanHubInfo a(c0 c0Var, CobrandedCardsPlanHubInfo cobrandedCardsPlanHubInfo) {
        CobrandedCardsPlanHubInfoTabs cobrandedCardsPlanHubInfoTabs = cobrandedCardsPlanHubInfo.e;
        CobrandedCardsPlanHubInfoOverview cobrandedCardsPlanHubInfoOverview = cobrandedCardsPlanHubInfoTabs.f82409a;
        CobrandedCardsPlanHubInfoStatusBanner cobrandedCardsPlanHubInfoStatusBanner = cobrandedCardsPlanHubInfoOverview.f82381a;
        CobrandedCardsPlanHubInfoRewardChallenge cobrandedCardsPlanHubInfoRewardChallenge = cobrandedCardsPlanHubInfoOverview.f82382b;
        CobrandedCardsPlanHubInfoCardBenefits cobrandedCardsPlanHubInfoCardBenefits = cobrandedCardsPlanHubInfoOverview.f82383c;
        List manageCardOptions = cobrandedCardsPlanHubInfoOverview.d;
        CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection = cobrandedCardsPlanHubInfoOverview.e;
        CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection2 = cobrandedCardsPlanHubInfoOverview.f;
        String str = cobrandedCardsPlanHubInfoOverview.f82384g;
        String str2 = cobrandedCardsPlanHubInfoOverview.f82385h;
        Intrinsics.checkNotNullParameter(manageCardOptions, "manageCardOptions");
        CobrandedCardsPlanHubInfoOverview overview = new CobrandedCardsPlanHubInfoOverview(cobrandedCardsPlanHubInfoStatusBanner, cobrandedCardsPlanHubInfoRewardChallenge, cobrandedCardsPlanHubInfoCardBenefits, manageCardOptions, cobrandedCardsPlanHubInfoBenefitsSection, cobrandedCardsPlanHubInfoBenefitsSection2, str, str2, null);
        CobrandedCardsPlanHubInfoRewards cobrandedCardsPlanHubInfoRewards = cobrandedCardsPlanHubInfoTabs.f82410b;
        CobrandedCardsPlanHubInfoTransactions transactions = cobrandedCardsPlanHubInfoTabs.f82411c;
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        CobrandedCardsPlanHubInfoTabs tabs = new CobrandedCardsPlanHubInfoTabs(overview, cobrandedCardsPlanHubInfoRewards, transactions);
        String iconUrl = cobrandedCardsPlanHubInfo.f82339a;
        String title = cobrandedCardsPlanHubInfo.f82340b;
        String str3 = cobrandedCardsPlanHubInfo.f82341c;
        CobrandedCardsPlanHubPlan cobrandedCardsPlanHubPlan = cobrandedCardsPlanHubInfo.d;
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new CobrandedCardsPlanHubInfo(iconUrl, title, str3, cobrandedCardsPlanHubPlan, tabs);
    }
}
