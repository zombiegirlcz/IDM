package com.onfido.android.sdk.capture.internal.ui.countryselection;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CountrySelectionFragment_MembersInjector implements MembersInjector {
    private final Provider presenterProvider;

    public CountrySelectionFragment_MembersInjector(Provider provider) {
        this.presenterProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new CountrySelectionFragment_MembersInjector(provider);
    }

    public static void injectPresenter(CountrySelectionFragment countrySelectionFragment, CountrySelectionPresenter countrySelectionPresenter) {
        countrySelectionFragment.presenter = countrySelectionPresenter;
    }

    public void injectMembers(CountrySelectionFragment countrySelectionFragment) {
        injectPresenter(countrySelectionFragment, (CountrySelectionPresenter) this.presenterProvider.get());
    }
}
