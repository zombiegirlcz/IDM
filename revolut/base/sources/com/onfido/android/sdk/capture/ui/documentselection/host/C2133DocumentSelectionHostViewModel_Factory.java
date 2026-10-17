package com.onfido.android.sdk.capture.ui.documentselection.host;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.android.sdk.capture.internal.ui.countryselection.GetCurrentCountryCodeUseCase;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2133DocumentSelectionHostViewModel_Factory {
    private final Provider currentCountryCodeUseCaseProvider;
    private final Provider navigationManagerHolderProvider;
    private final Provider navigatorProvider;
    private final Provider screenLoadTrackerProvider;
    private final Provider screenTrackerProvider;
    private final Provider supportedDocumentsRepositoryProvider;

    public C2133DocumentSelectionHostViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.navigatorProvider = provider;
        this.navigationManagerHolderProvider = provider2;
        this.currentCountryCodeUseCaseProvider = provider3;
        this.supportedDocumentsRepositoryProvider = provider4;
        this.screenTrackerProvider = provider5;
        this.screenLoadTrackerProvider = provider6;
    }

    public static C2133DocumentSelectionHostViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C2133DocumentSelectionHostViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DocumentSelectionHostViewModel newInstance(Navigator navigator, NavigationManagerHolder navigationManagerHolder, GetCurrentCountryCodeUseCase getCurrentCountryCodeUseCase, SupportedDocumentsRepository supportedDocumentsRepository, ScreenTracker screenTracker, ScreenLoadTracker screenLoadTracker, SavedStateHandle savedStateHandle) {
        return new DocumentSelectionHostViewModel(navigator, navigationManagerHolder, getCurrentCountryCodeUseCase, supportedDocumentsRepository, screenTracker, screenLoadTracker, savedStateHandle);
    }

    public DocumentSelectionHostViewModel get(SavedStateHandle savedStateHandle) {
        return newInstance((Navigator) this.navigatorProvider.get(), (NavigationManagerHolder) this.navigationManagerHolderProvider.get(), (GetCurrentCountryCodeUseCase) this.currentCountryCodeUseCaseProvider.get(), (SupportedDocumentsRepository) this.supportedDocumentsRepositoryProvider.get(), (ScreenTracker) this.screenTrackerProvider.get(), (ScreenLoadTracker) this.screenLoadTrackerProvider.get(), savedStateHandle);
    }
}
