package com.onfido.android.sdk.capture.internal.ui.countryselection;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class CountrySelectionPresenter_Factory implements b {
    private final Provider getCurrentCountryCodeUseCaseProvider;
    private final Provider schedulersProvider;
    private final Provider screenTrackerProvider;
    private final Provider supportedDocumentsRepositoryProvider;

    public CountrySelectionPresenter_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.supportedDocumentsRepositoryProvider = provider;
        this.screenTrackerProvider = provider2;
        this.getCurrentCountryCodeUseCaseProvider = provider3;
        this.schedulersProvider = provider4;
    }

    public static CountrySelectionPresenter_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new CountrySelectionPresenter_Factory(provider, provider2, provider3, provider4);
    }

    public static CountrySelectionPresenter newInstance(SupportedDocumentsRepository supportedDocumentsRepository, ScreenTracker screenTracker, GetCurrentCountryCodeUseCase getCurrentCountryCodeUseCase, SchedulersProvider schedulersProvider) {
        return new CountrySelectionPresenter(supportedDocumentsRepository, screenTracker, getCurrentCountryCodeUseCase, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public CountrySelectionPresenter get() {
        return newInstance((SupportedDocumentsRepository) this.supportedDocumentsRepositoryProvider.get(), (ScreenTracker) this.screenTrackerProvider.get(), (GetCurrentCountryCodeUseCase) this.getCurrentCountryCodeUseCaseProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
