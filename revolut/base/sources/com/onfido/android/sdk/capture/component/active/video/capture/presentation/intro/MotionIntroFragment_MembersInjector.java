package com.onfido.android.sdk.capture.component.active.video.capture.presentation.intro;

import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.repository.ActiveVideoCaptureRepository;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionIntroFragment_MembersInjector implements MembersInjector {
    private final Provider activeVideoCaptureRepositoryProvider;
    private final Provider analyticsProvider;
    private final Provider schedulersProvider;
    private final Provider storageProvider;

    public MotionIntroFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.analyticsProvider = provider;
        this.activeVideoCaptureRepositoryProvider = provider2;
        this.schedulersProvider = provider3;
        this.storageProvider = provider4;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new MotionIntroFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectActiveVideoCaptureRepository(MotionIntroFragment motionIntroFragment, ActiveVideoCaptureRepository activeVideoCaptureRepository) {
        motionIntroFragment.activeVideoCaptureRepository = activeVideoCaptureRepository;
    }

    public static void injectAnalytics(MotionIntroFragment motionIntroFragment, OnfidoAnalytics onfidoAnalytics) {
        motionIntroFragment.analytics = onfidoAnalytics;
    }

    public static void injectSchedulersProvider(MotionIntroFragment motionIntroFragment, SchedulersProvider schedulersProvider) {
        motionIntroFragment.schedulersProvider = schedulersProvider;
    }

    public static void injectStorage(MotionIntroFragment motionIntroFragment, SharedPreferencesDataSource sharedPreferencesDataSource) {
        motionIntroFragment.storage = sharedPreferencesDataSource;
    }

    public void injectMembers(MotionIntroFragment motionIntroFragment) {
        injectAnalytics(motionIntroFragment, (OnfidoAnalytics) this.analyticsProvider.get());
        injectActiveVideoCaptureRepository(motionIntroFragment, (ActiveVideoCaptureRepository) this.activeVideoCaptureRepositoryProvider.get());
        injectSchedulersProvider(motionIntroFragment, (SchedulersProvider) this.schedulersProvider.get());
        injectStorage(motionIntroFragment, (SharedPreferencesDataSource) this.storageProvider.get());
    }
}
