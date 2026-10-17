package pti;

import com.revolut.data.network.models.openbanking.mapper.ExternalInstitutionDtoMapperKt;
import com.revolut.feature.card_reader.tips.impl.data.network.CardReaderTipsService;
import com.revolut.feature.category_boost.impl.data.service.CategoryBoostService;
import com.revolut.feature.derivatives.data.impl.network.service.DerivativesBalanceService;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.external_accounts.impl.domain.pse.model.PseInstitutions;
import com.revolut.feature.external_accounts.impl.repository.network.LinkExternalInstitutionsService;
import com.revolut.feature.external_accounts.impl.repository.network.PseService;
import com.revolut.feature.onboarding.impl.onboarding.service.OnboardingCountriesService;
import com.revolut.feature.pay_with_smile.impl.data.network.BiometricPaymentsSettingsService;
import com.revolut.feature.product_article.impl.network.ProductArticleConfigService;
import com.revolut.feature.retail.savings.impl.challenge.data.SavingsChallengeService;
import com.revolut.feature.rev_points.impl.data.network.RevPointsPersonalisationTargetingOnboardingService;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingCta;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingStep;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.revolutpay.order_tracking.impl.data.service.RevolutPayDeliveryTrackingService;
import com.revolut.feature.shared.savings.request.impl.data.network.SavingsRequestService;
import com.revolut.feature.tax_residency.impl.exemption.services.TaxExemptionService;
import com.revolut.feature.terms.impl.network.UserDocumentsService;
import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftPassesService;
import com.revolut.retail.feature.crypto.prelaunch.impl.data.network.CryptoPreLaunchService;
import com.revolut.retail.feature.impl.travel_trips.data.network.TravelTripsService;
import com.revolut.retail.feature.travel_status.impl.data.service.TravelStatusService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.BuyBlockService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.PaperTradingService;
import com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountsService;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m1c.z0;
import oti.h1;
import pne.e0;
import sdl.x0;
import th6.b0;
import vdl.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class s extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f239755w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 25;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                return new s((u) this.f239755w, (Continuation) obj4, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new s((q53.c) this.f239755w, (Continuation) obj4, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new s((qac.i) this.f239755w, (Continuation) obj4, 2).invokeSuspend(Unit.f186387a);
            case 3:
                return new s((qb9.b) this.f239755w, (Continuation) obj4, 3).invokeSuspend(Unit.f186387a);
            case 4:
                return new s((qg5.c) this.f239755w, (Continuation) obj4, 4).invokeSuspend(Unit.f186387a);
            case 5:
                return new s((ql9.d) this.f239755w, (Continuation) obj4, 5).invokeSuspend(Unit.f186387a);
            case 6:
                return new s((qxb.c) this.f239755w, (Continuation) obj4, 6).invokeSuspend(Unit.f186387a);
            case 7:
                return new s((rg3.o) this.f239755w, (Continuation) obj4, 7).invokeSuspend(Unit.f186387a);
            case 8:
                return new s((s76.b) this.f239755w, (Continuation) obj4, 8).invokeSuspend(Unit.f186387a);
            case 9:
                return new s((scl.g) this.f239755w, (Continuation) obj4, 9).invokeSuspend(Unit.f186387a);
            case 10:
                return new s((se3.c) this.f239755w, (Continuation) obj4, 10).invokeSuspend(Unit.f186387a);
            case 11:
                return new s((ska.e) this.f239755w, (Continuation) obj4, 11).invokeSuspend(Unit.f186387a);
            case 12:
                return new s((sne.g) this.f239755w, (Continuation) obj4, 12).invokeSuspend(Unit.f186387a);
            case 13:
                return new s((sre.k) this.f239755w, (Continuation) obj4, 13).invokeSuspend(Unit.f186387a);
            case 14:
                return new s((suf.h) this.f239755w, (Continuation) obj4, 14).invokeSuspend(Unit.f186387a);
            case 15:
                return new s((th6.q) this.f239755w, (Continuation) obj4, 15).invokeSuspend(Unit.f186387a);
            case 16:
                return new s((b0) this.f239755w, (Continuation) obj4, 16).invokeSuspend(Unit.f186387a);
            case 17:
                return new s((tjb.g) this.f239755w, (Continuation) obj4, 17).invokeSuspend(Unit.f186387a);
            case 18:
                return new s((tpj.d) this.f239755w, (Continuation) obj4, 18).invokeSuspend(Unit.f186387a);
            case 19:
                return new s((tuj.g) this.f239755w, (Continuation) obj4, 19).invokeSuspend(Unit.f186387a);
            case 20:
                return new s((u1l.b) this.f239755w, (Continuation) obj4, 20).invokeSuspend(Unit.f186387a);
            case 21:
                return new s((u1l.g) this.f239755w, (Continuation) obj4, 21).invokeSuspend(Unit.f186387a);
            case 22:
                return new s((ucd.b) this.f239755w, (Continuation) obj4, 22).invokeSuspend(Unit.f186387a);
            case 23:
                return new s((uck.f) this.f239755w, (Continuation) obj4, 23).invokeSuspend(Unit.f186387a);
            case 24:
                return new s((uy1.j) this.f239755w, (Continuation) obj4, 24).invokeSuspend(Unit.f186387a);
            case 25:
                int iIntValue = ((Number) obj3).intValue();
                s sVar = new s(3, (Continuation) obj4);
                sVar.f239755w = (List) obj2;
                sVar.v = iIntValue;
                return sVar.invokeSuspend(Unit.f186387a);
            case 26:
                return new s((vdl.d) this.f239755w, (Continuation) obj4, 26).invokeSuspend(Unit.f186387a);
            case 27:
                return new s((h0) this.f239755w, (Continuation) obj4, 27).invokeSuspend(Unit.f186387a);
            case 28:
                return new s((waj.a) this.f239755w, (Continuation) obj4, 28).invokeSuspend(Unit.f186387a);
            default:
                return new s((wpj.e) this.f239755w, (Continuation) obj4, 29).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v93, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v113, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v115, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object fastTrackPasses;
        Object tipsSettings;
        Object onboardingCountries;
        Object onboarding;
        z0 z0Var;
        RevPointsPersonalisationTargetingOnboardingPrompt revPointsPersonalisationTargetingOnboardingPrompt;
        RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta;
        Object derivativesBalance;
        BigDecimal bigDecimal;
        oj1.a aVar;
        oj1.a aVar2;
        Object tradingAccounts;
        Object boosts;
        we3.a aVar3;
        Object obj3;
        Object taxProfiles;
        Object userDocuments;
        Object purchasedTransitTicketsByState;
        Object objFetchLinkedAccountsConsent;
        Object pseBanks;
        Object challengeOnboarding;
        Object currentItinerary;
        Object overview;
        Object productArticleId;
        Object savingAccountRequests;
        boolean z;
        Object buyBlock;
        Object industries;
        Object launches;
        switch (this.u) {
            case 0:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    AsftPassesService asftPassesService = ((u) this.f239755w).f239758a;
                    this.v = 1;
                    fastTrackPasses = asftPassesService.getFastTrackPasses(this);
                    if (fastTrackPasses == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    fastTrackPasses = obj2;
                }
                h1 h1Var = (h1) fastTrackPasses;
                Intrinsics.checkNotNullParameter(h1Var, "<this>");
                return oi0.d.e(h1Var.f229643a);
            case 1:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CardReaderTipsService cardReaderTipsService = ((q53.c) this.f239755w).f242289a;
                    this.v = 1;
                    tipsSettings = cardReaderTipsService.getTipsSettings(this);
                    if (tipsSettings == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    tipsSettings = obj2;
                }
                uz5.a aVar6 = (uz5.a) tipsSettings;
                Intrinsics.checkNotNullParameter(aVar6, "<this>");
                return new wz5.a(aVar6.getEnabled(), aVar6.getRates());
            case 2:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                RevolutPayDeliveryTrackingService revolutPayDeliveryTrackingService = ((qac.i) this.f239755w).f244022a;
                this.v = 1;
                Object deliveryCarriers = revolutPayDeliveryTrackingService.getDeliveryCarriers(this);
                return deliveryCarriers == aVar7 ? aVar7 : deliveryCarriers;
            case 3:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    OnboardingCountriesService onboardingCountriesService = ((qb9.b) this.f239755w).f244136a;
                    this.v = 1;
                    onboardingCountries = onboardingCountriesService.getOnboardingCountries(this);
                    if (onboardingCountries == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    onboardingCountries = obj2;
                }
                return yh5.b.M((ib9.g) onboardingCountries);
            case 4:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                qg5.c cVar = (qg5.c) this.f239755w;
                p40.v vVar = new p40.v(cVar, null, 20);
                this.v = 1;
                Object objA = qg5.c.a(cVar, vVar, this);
                return objA == aVar9 ? aVar9 : objA;
            case 5:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                BiometricPaymentsSettingsService biometricPaymentsSettingsService = ((ql9.d) this.f239755w).f247559a;
                this.v = 1;
                Object settings = biometricPaymentsSettingsService.getSettings(this);
                return settings == aVar10 ? aVar10 : settings;
            case 6:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    RevPointsPersonalisationTargetingOnboardingService revPointsPersonalisationTargetingOnboardingService = ((qxb.c) this.f239755w).f250059a;
                    this.v = 1;
                    onboarding = revPointsPersonalisationTargetingOnboardingService.getOnboarding(this);
                    if (onboarding == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    onboarding = obj2;
                }
                hxb.y yVar = (hxb.y) onboarding;
                Intrinsics.checkNotNullParameter(yVar, "<this>");
                String status = yVar.getStatus();
                z0[] z0VarArrValues = z0.values();
                int length = z0VarArrValues.length;
                int i32 = 0;
                while (true) {
                    if (i32 < length) {
                        z0Var = z0VarArrValues[i32];
                        if (!a0.z(z0Var.name(), status, true)) {
                            i32++;
                        }
                    } else {
                        z0Var = null;
                    }
                }
                if (z0Var == null) {
                    z0Var = z0.COMPLETED;
                }
                hxb.x prompt = yVar.getPrompt();
                if (prompt != null) {
                    Intrinsics.checkNotNullParameter(prompt, "<this>");
                    String title = prompt.getTitle();
                    String subtitle = prompt.getSubtitle();
                    String assetUrl = prompt.getAssetUrl();
                    List steps = prompt.getSteps();
                    Intrinsics.checkNotNullParameter(steps, "<this>");
                    List<hxb.z> list = steps;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (hxb.z zVar : list) {
                        Intrinsics.checkNotNullParameter(zVar, "<this>");
                        arrayList.add(new RevPointsPersonalisationTargetingOnboardingStep(zVar.getTitle(), zVar.getSubtitle(), zVar.getIcon()));
                    }
                    RevPointsTextWithLinks revPointsTextWithLinksA = qvb.b.a(prompt.getDisclaimer());
                    hxb.w personalisedOffersCta = prompt.getPersonalisedOffersCta();
                    Intrinsics.checkNotNullParameter(personalisedOffersCta, "<this>");
                    RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta2 = new RevPointsPersonalisationTargetingOnboardingCta(personalisedOffersCta.getText(), personalisedOffersCta.getDeeplink());
                    hxb.w genericOffersCta = prompt.getGenericOffersCta();
                    if (genericOffersCta != null) {
                        Intrinsics.checkNotNullParameter(genericOffersCta, "<this>");
                        revPointsPersonalisationTargetingOnboardingCta = new RevPointsPersonalisationTargetingOnboardingCta(genericOffersCta.getText(), genericOffersCta.getDeeplink());
                    } else {
                        revPointsPersonalisationTargetingOnboardingCta = null;
                    }
                    revPointsPersonalisationTargetingOnboardingPrompt = new RevPointsPersonalisationTargetingOnboardingPrompt(title, subtitle, assetUrl, arrayList, revPointsTextWithLinksA, revPointsPersonalisationTargetingOnboardingCta2, revPointsPersonalisationTargetingOnboardingCta);
                } else {
                    revPointsPersonalisationTargetingOnboardingPrompt = null;
                }
                return new RevPointsPersonalisationTargetingOnboardingResponse(z0Var, revPointsPersonalisationTargetingOnboardingPrompt);
            case 7:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rg3.o oVar = (rg3.o) this.f239755w;
                rg3.c cVar2 = oVar.f254013a;
                List listB = oVar.b();
                this.v = 1;
                Object objA2 = cVar2.a(listB, this);
                return objA2 == aVar12 ? aVar12 : objA2;
            case 8:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    DerivativesBalanceService derivativesBalanceService = ((s76.b) this.f239755w).f260523a;
                    this.v = 1;
                    derivativesBalance = derivativesBalanceService.getDerivativesBalance(this);
                    if (derivativesBalance == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    derivativesBalance = obj2;
                }
                r76.c cVar3 = (r76.c) derivativesBalance;
                Intrinsics.checkNotNullParameter(cVar3, "<this>");
                xi0.a aVar14 = xi0.b.Companion;
                String str = cVar3.f252021a;
                aVar14.getClass();
                xi0.b bVarA = xi0.a.a(str);
                String str2 = cVar3.f252022b;
                BigDecimal bigDecimal2 = new BigDecimal(cVar3.f252023c);
                BigDecimal bigDecimal3 = new BigDecimal(cVar3.d);
                BigDecimal bigDecimal4 = new BigDecimal(cVar3.e);
                BigDecimal bigDecimal5 = new BigDecimal(cVar3.f);
                BigDecimal bigDecimal6 = new BigDecimal(cVar3.f252024g);
                BigDecimal bigDecimal7 = new BigDecimal(cVar3.f252025h);
                BigDecimal bigDecimal8 = new BigDecimal(cVar3.i);
                BigDecimal bigDecimal9 = new BigDecimal(cVar3.f252026j);
                BigDecimal bigDecimal10 = new BigDecimal(cVar3.k);
                BigDecimal bigDecimal11 = new BigDecimal(cVar3.f252027l);
                BigDecimal bigDecimal12 = new BigDecimal(cVar3.f252028m);
                String str3 = cVar3.f252029n;
                BigDecimal bigDecimal13 = str3 != null ? new BigDecimal(str3) : null;
                String str4 = cVar3.o;
                if (str4 != null) {
                    oj1.a[] aVarArrValues = oj1.a.values();
                    int length2 = aVarArrValues.length;
                    int i59 = 0;
                    while (true) {
                        if (i59 < length2) {
                            oj1.a aVar15 = aVarArrValues[i59];
                            int i66 = i59;
                            bigDecimal = bigDecimal8;
                            if (a0.z(aVar15.name(), str4, true)) {
                                aVar2 = aVar15;
                            } else {
                                i59 = i66 + 1;
                                bigDecimal8 = bigDecimal;
                            }
                        } else {
                            bigDecimal = bigDecimal8;
                            aVar2 = null;
                        }
                    }
                    aVar = aVar2;
                } else {
                    bigDecimal = bigDecimal8;
                    aVar = null;
                }
                return new DerivativesBalance(bVarA, str2, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal, bigDecimal9, bigDecimal10, bigDecimal11, bigDecimal12, bigDecimal13, aVar);
            case 9:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    TradingAccountsService tradingAccountsService = ((scl.g) this.f239755w).f261769c;
                    this.v = 1;
                    tradingAccounts = tradingAccountsService.getTradingAccounts(this);
                    if (tradingAccounts == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    tradingAccounts = obj2;
                }
                return boh.f.t((x0) tradingAccounts);
            case 10:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    CategoryBoostService categoryBoostService = ((se3.c) this.f239755w).f262095a;
                    this.v = 1;
                    boosts = categoryBoostService.getBoosts(this);
                    if (boosts == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    boosts = obj2;
                }
                re3.g gVar = (re3.g) boosts;
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                List<re3.c> list2 = gVar.f253513b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (re3.c cVar4 : list2) {
                    String str5 = cVar4.f253505b;
                    we3.a[] aVarArrValues2 = we3.a.values();
                    int length3 = aVarArrValues2.length;
                    int i96 = 0;
                    while (true) {
                        if (i96 < length3) {
                            aVar3 = aVarArrValues2[i96];
                            if (!a0.z(aVar3.name(), str5, true)) {
                                i96++;
                            }
                        } else {
                            aVar3 = null;
                        }
                    }
                    if (aVar3 == null) {
                        aVar3 = we3.a.UNKNOWN;
                    }
                    arrayList2.add(new we3.b(cVar4.f253504a, aVar3, cVar4.f253506c, cVar4.d, cVar4.e, cVar4.f, cVar4.f253507g, cVar4.f253508h, cVar4.i));
                }
                return new we3.d(gVar.f253512a, arrayList2);
            case 11:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    ProductArticleConfigService productArticleConfigService = ((ska.e) this.f239755w).f263786a;
                    this.v = 1;
                    Object objM3761getProductArticlesConfigkPRr1Fs = productArticleConfigService.m3761getProductArticlesConfigkPRr1Fs(this);
                    if (objM3761getProductArticlesConfigkPRr1Fs == aVar18) {
                        return aVar18;
                    }
                    obj3 = objM3761getProductArticlesConfigkPRr1Fs;
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    obj3 = ((aka.o) obj2).f5767a;
                }
                Map map = r0.u(new aka.o((Map) obj3));
                Intrinsics.checkNotNullParameter(map, "map");
                return new aka.o(map);
            case 12:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    TaxExemptionService taxExemptionService = ((sne.g) this.f239755w).f264566a;
                    this.v = 1;
                    taxProfiles = taxExemptionService.getTaxProfiles(this);
                    if (taxProfiles == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    taxProfiles = obj2;
                }
                return kotlin.jvm.internal.s.J((e0) taxProfiles);
            case 13:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    UserDocumentsService userDocumentsService = ((sre.k) this.f239755w).f265203a;
                    this.v = 1;
                    userDocuments = userDocumentsService.getUserDocuments(this);
                    if (userDocuments == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    userDocuments = obj2;
                }
                return mra.d.Z(((qre.k) userDocuments).f248728a);
            case 14:
                suf.h hVar = (suf.h) this.f239755w;
                Object arrayList3 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    TransportService transportService = hVar.f265753a;
                    List<String> listK = zhm.v.k(cvf.j.ACTIVE.a(), cvf.j.EXPIRED.a(), cvf.j.TO_BE_ACTIVATED.a(), cvf.j.PENDING.a());
                    this.v = 1;
                    purchasedTransitTicketsByState = transportService.getPurchasedTransitTicketsByState(listK, this);
                    if (purchasedTransitTicketsByState != arrayList3) {
                    }
                    return arrayList3;
                }
                if (i102 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                purchasedTransitTicketsByState = obj2;
                LocalDateTime localDateTimeC = hVar.c();
                arrayList3 = new ArrayList();
                Iterator it8 = ((List) purchasedTransitTicketsByState).iterator();
                while (it8.hasNext()) {
                    PurchasedTransitTicket purchasedTransitTicketA = yuf.a.a((cvf.i) it8.next(), localDateTimeC);
                    if (purchasedTransitTicketA != null) {
                        arrayList3.add(purchasedTransitTicketA);
                    }
                }
                return arrayList3;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    LinkExternalInstitutionsService linkExternalInstitutionsService = ((th6.q) this.f239755w).f271291a;
                    this.v = 1;
                    objFetchLinkedAccountsConsent = linkExternalInstitutionsService.fetchLinkedAccountsConsent(this);
                    if (objFetchLinkedAccountsConsent == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objFetchLinkedAccountsConsent = obj2;
                }
                vh6.j jVar = (vh6.j) objFetchLinkedAccountsConsent;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                String title2 = jVar.getTitle();
                String subtitle2 = jVar.getSubtitle();
                List<vh6.h> consents = jVar.getConsents();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(consents, 10));
                for (vh6.h hVar2 : consents) {
                    Intrinsics.checkNotNullParameter(hVar2, "<this>");
                    arrayList4.add(new ph6.a(ExternalInstitutionDtoMapperKt.toDomain(hVar2.getLogo()), hVar2.getId(), hVar2.getTitle(), hVar2.getDescription()));
                }
                return new ph6.f(title2, subtitle2, arrayList4);
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    PseService pseService = ((b0) this.f239755w).f271265a;
                    this.v = 1;
                    pseBanks = pseService.getPseBanks(this);
                    if (pseBanks == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    pseBanks = obj2;
                }
                yh6.t tVar = (yh6.t) pseBanks;
                Intrinsics.checkNotNullParameter(tVar, "<this>");
                List listB2 = tVar.getTopupMethodDetails().getProviders().getPopular();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(listB2, 10));
                Iterator it9 = listB2.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(mif.e0.B((yh6.x) it9.next()));
                }
                List listA = tVar.getTopupMethodDetails().getProviders().getOthers();
                ArrayList arrayList6 = new ArrayList(zhm.w.t(listA, 10));
                Iterator it10 = listA.iterator();
                while (it10.hasNext()) {
                    arrayList6.add(mif.e0.B((yh6.x) it10.next()));
                }
                return new PseInstitutions(arrayList5, arrayList6);
            case 17:
                Object arrayList7 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    SavingsChallengeService savingsChallengeService = ((tjb.g) this.f239755w).f271623a;
                    this.v = 1;
                    challengeOnboarding = savingsChallengeService.getChallengeOnboarding(this);
                    if (challengeOnboarding != arrayList7) {
                    }
                    return arrayList7;
                }
                if (i105 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                challengeOnboarding = obj2;
                Iterable iterable = (Iterable) challengeOnboarding;
                arrayList7 = new ArrayList(zhm.w.t(iterable, 10));
                Iterator it11 = iterable.iterator();
                while (it11.hasNext()) {
                    arrayList7.add(tjb.a.b((ujb.z0) it11.next()));
                }
                return arrayList7;
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 != 0) {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                tpj.d dVar = (tpj.d) this.f239755w;
                this.v = 1;
                Object objA3 = tpj.d.a(dVar, this);
                return objA3 == aVar23 ? aVar23 : objA3;
            case 19:
                tuj.g gVar2 = (tuj.g) this.f239755w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                try {
                    if (i107 == 0) {
                        yhm.o.b(obj2);
                        TravelTripsService travelTripsService = gVar2.f274617a;
                        this.v = 1;
                        currentItinerary = travelTripsService.getCurrentItinerary(this);
                        if (currentItinerary == aVar24) {
                            return aVar24;
                        }
                    } else {
                        if (i107 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        currentItinerary = obj2;
                    }
                    quj.r rVar = (quj.r) currentItinerary;
                    Intrinsics.checkNotNullParameter(rVar, "<this>");
                    return new puj.h(rVar.f249486a, rVar.f249487b, rVar.f249488c, rVar.d, rVar.e, rVar.f);
                } catch (Throwable th10) {
                    if (tuj.g.a(gVar2, th10)) {
                        gVar2.f274618b.remove("CURRENT_ITINERARY");
                        gVar2.f274619c.I0("CURRENT_ITINERARY");
                    }
                    throw th10;
                }
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    TravelStatusService travelStatusService = ((u1l.b) this.f239755w).f276433a;
                    this.v = 1;
                    overview = travelStatusService.getOverview(this);
                    if (overview == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    overview = obj2;
                }
                return yoj.b.B((q1l.a) overview);
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    TravelStatusService travelStatusService2 = ((u1l.g) this.f239755w).f276440a;
                    this.v = 1;
                    productArticleId = travelStatusService2.getProductArticleId(this);
                    if (productArticleId == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    productArticleId = obj2;
                }
                return ((p1l.c) productArticleId).f231975a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    SavingsRequestService savingsRequestService = ((ucd.b) this.f239755w).f279029a;
                    this.v = 1;
                    savingAccountRequests = savingsRequestService.getSavingAccountRequests(this);
                    if (savingAccountRequests == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    savingAccountRequests = obj2;
                }
                return yoj.b.J((List) savingAccountRequests);
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                uck.f fVar = (uck.f) this.f239755w;
                this.v = 1;
                Object objA4 = fVar.a(this);
                return objA4 == aVar28 ? aVar28 : objA4;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                uy1.j jVar2 = (uy1.j) this.f239755w;
                this.v = 1;
                Serializable serializableE = uy1.j.e(jVar2, this);
                return serializableE == aVar29 ? aVar29 : serializableE;
            case 25:
                List list3 = (List) this.f239755w;
                int i113 = this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it12 = list4.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            if (Intrinsics.f(((wy1.e) it12.next()).getStatus(), "PENDING")) {
                                z = i113 < 10;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    BuyBlockService buyBlockService = ((vdl.d) this.f239755w).f287948a;
                    this.v = 1;
                    buyBlock = buyBlockService.getBuyBlock(this);
                    if (buyBlock == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    buyBlock = obj2;
                }
                return zi0.c.U((gdl.c) buyBlock);
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    PaperTradingService paperTradingService = ((h0) this.f239755w).f287975c;
                    this.v = 1;
                    industries = paperTradingService.getIndustries(this);
                    if (industries == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    industries = obj2;
                }
                return l9.l.B((kdl.f) industries);
            case 28:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    CryptoPreLaunchService cryptoPreLaunchService = ((waj.a) this.f239755w).f295944a;
                    this.v = 1;
                    launches = cryptoPreLaunchService.getLaunches(this);
                    if (launches == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    launches = obj2;
                }
                return qk.d.y((vaj.o) launches);
            default:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wpj.e eVar = (wpj.e) this.f239755w;
                this.v = 1;
                Object objA5 = wpj.e.a(eVar, this);
                return objA5 == aVar34 ? aVar34 : objA5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f239755w = obj2;
    }
}
