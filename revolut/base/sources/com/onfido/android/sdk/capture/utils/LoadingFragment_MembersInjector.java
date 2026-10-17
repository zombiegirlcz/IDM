package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadingFragment_MembersInjector implements MembersInjector {
    private final Provider loadingViewModelFactoryProvider;
    private final Provider storageProvider;

    public LoadingFragment_MembersInjector(Provider provider, Provider provider2) {
        this.storageProvider = provider;
        this.loadingViewModelFactoryProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new LoadingFragment_MembersInjector(provider, provider2);
    }

    public static void injectLoadingViewModelFactory(LoadingFragment loadingFragment, LoadingFragmentViewModel.Factory factory) {
        loadingFragment.loadingViewModelFactory = factory;
    }

    public static void injectStorage(LoadingFragment loadingFragment, SharedPreferencesDataSource sharedPreferencesDataSource) {
        loadingFragment.storage = sharedPreferencesDataSource;
    }

    public void injectMembers(LoadingFragment loadingFragment) {
        injectStorage(loadingFragment, (SharedPreferencesDataSource) this.storageProvider.get());
        injectLoadingViewModelFactory(loadingFragment, (LoadingFragmentViewModel.Factory) this.loadingViewModelFactoryProvider.get());
    }
}
