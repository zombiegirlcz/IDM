package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.google.common.base.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dj f29368a;

    public hp(dj flowConfig) {
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        this.f29368a = flowConfig;
    }

    public final e40 a(j30 analytics, List countries, gj dataBundle, gp flowCoordinator, d40 stateProvider) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        return new e40(analytics, new f80(stateProvider), stateProvider, flowCoordinator, kl.f30305a, null, new jl(countries, this.f29368a, dataBundle), 32, null);
    }

    public final mq b(c80 analyticsContext, sg0 analyticsTracker) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        return new mq(analyticsContext, analyticsTracker);
    }

    public final List c() {
        return this.f29368a.getSupportedDocuments();
    }

    public final or b(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new nr(bundle);
    }

    public final gr b(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new gr(tracker);
    }

    public final zc0 b() {
        return new pn1(this, 0);
    }

    public final j30 a(sg0 tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new j30("document", tracker);
    }

    public final d40 a(Optional customStateProvider, l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(customStateProvider, "customStateProvider");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Object objOr = customStateProvider.or(new ll(lottieServiceLocator.a(k70.k)));
        Intrinsics.checkNotNullExpressionValue(objOr, "or(...)");
        return (d40) objOr;
    }

    public final pd a(List supportedCountries, p71 inputValidator) {
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        Intrinsics.checkNotNullParameter(inputValidator, "inputValidator");
        return new qd(supportedCountries, inputValidator);
    }

    public final ci a(yh repository, y2 stateProviderDelegate, pd countryValidator, cd countriesFilter, rx filterCountriesUseCase, rh analytics, CoroutineScope coroutineScope, fq0 errorPopupPresenter, uw errorPopupAnalytics, gp flowCoordinator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateProviderDelegate, "stateProviderDelegate");
        Intrinsics.checkNotNullParameter(countryValidator, "countryValidator");
        Intrinsics.checkNotNullParameter(countriesFilter, "countriesFilter");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(errorPopupPresenter, "errorPopupPresenter");
        Intrinsics.checkNotNullParameter(errorPopupAnalytics, "errorPopupAnalytics");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        bi biVar = new bi(stateProviderDelegate, imageServiceLocator);
        f80 f80Var = new f80(biVar);
        wh whVar = new wh(countryValidator);
        wr wrVar = new wr(coroutineScope);
        return new ci(f80Var, wrVar, flowCoordinator, analytics, repository, new z2(f80Var, biVar, repository, new vh(repository, whVar, analytics), wrVar, whVar, countriesFilter, filterCountriesUseCase, countryValidator, lw.a(errorPopupPresenter, new uh(imageServiceLocator), new th(f80Var, biVar, wrVar, flowCoordinator), errorPopupAnalytics, coroutineScope), ci.f27462g.a()));
    }

    public final y2 a(ce1 stringExtractor, v10 imageServiceLocator, sg0 tracker) {
        Intrinsics.checkNotNullParameter(stringExtractor, "stringExtractor");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new y2(stringExtractor, imageServiceLocator, new p20(tracker));
    }

    public final yh a(gj bundle, List countries) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(countries, "countries");
        return new zh(bundle, countries);
    }

    public final rh a(c80 analyticsContext, sg0 tracker) {
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return new rh(analyticsContext, tracker);
    }

    public final ar a(vq repository, gp flowCoordinator, wd1 viewCompletionHandler, zq stateProvider, mq analytics, bq0 popupHandlerBuilder, CoroutineScope coroutineScope, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new ar(new f80(stateProvider), flowCoordinator, viewCompletionHandler, repository, stateProvider, analytics, popupHandlerBuilder.a(new tq(new ul1(repository, 18), flowCoordinator, analytics, imageServiceLocator)), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List a(vq vqVar) {
        return xq.a(vqVar);
    }

    public final wd1 a(or documentVersionRepository, iq whatsNextWorker) {
        Intrinsics.checkNotNullParameter(documentVersionRepository, "documentVersionRepository");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(new uq(documentVersionRepository), new z51(), new y51(), whatsNextWorker);
    }

    public final iq a(Function0 nfcSupportedUseCase, zc0 nfcCanFlowUseCase, gj documentFlowDataBundle) {
        Intrinsics.checkNotNullParameter(nfcSupportedUseCase, "nfcSupportedUseCase");
        Intrinsics.checkNotNullParameter(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        Intrinsics.checkNotNullParameter(documentFlowDataBundle, "documentFlowDataBundle");
        return new iq(nfcSupportedUseCase, new rj1(nfcCanFlowUseCase, documentFlowDataBundle, 24), this.f29368a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(zc0 zc0Var, gj gjVar) {
        return zc0Var.a(gjVar.g());
    }

    public final vq a(gj bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return new wq(bundle, this.f29368a.getSupportedDocuments());
    }

    public final zq a(om documentOptionsComparator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(documentOptionsComparator, "documentOptionsComparator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        return new zq(documentOptionsComparator, imageServiceLocator);
    }

    public final om a() {
        return new pm();
    }

    public final sr a(gp flowCoordinator, wd1 viewCompletionHandler, or repository, gr analytics, tz dateFormatter, v10 imageServiceLocator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(flowCoordinator, "flowCoordinator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        rr rrVar = new rr(repository, dateFormatter, imageServiceLocator);
        return new sr(new f80(rrVar), flowCoordinator, viewCompletionHandler, rrVar, repository, analytics, coroutineScope);
    }

    public final wd1 a(iq whatsNextWorker) {
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        return new lj0(new lr(), new z51(), new y51(), whatsNextWorker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(sj0 sj0Var) {
        return !sj0Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gp a(o80 navigationChannel, sj0 permissionChecker, bq0 popupHandlerBuilder, c80 analyticsContext, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(permissionChecker, "permissionChecker");
        Intrinsics.checkNotNullParameter(popupHandlerBuilder, "popupHandlerBuilder");
        Intrinsics.checkNotNullParameter(analyticsContext, "analyticsContext");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        int i = 1;
        return new gp(navigationChannel, new on1(permissionChecker, i), popupHandlerBuilder.a(new i9(lottieServiceLocator), new q9(null, imageServiceLocator, i, 0 == true ? 1 : 0)), this.f29368a.getSkipIntro(), analyticsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(hp hpVar, fd fdVar) {
        String strC;
        if (hpVar.f29368a.getNfc().getEnabled()) {
            if ((fdVar == null || (strC = fdVar.c()) == null) ? false : strC.equals("ESP")) {
                return true;
            }
        }
        return false;
    }

    public final od a(final List supportedCountries) {
        Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
        return new od() { // from class: com.fourthline.orca.internal.qn1
            @Override // com.fourthline.orca.internal.od
            public final boolean a(fd fdVar) {
                return hp.a(supportedCountries, fdVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(List list, fd country) {
        Intrinsics.checkNotNullParameter(country, "country");
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(((CountryNetworkModel) it8.next()).getIssuingCountry(), country.c())) {
                return true;
            }
        }
        return false;
    }
}
