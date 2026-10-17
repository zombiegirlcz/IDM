package com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading;

import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesRepository;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class LivenessChallengesLoadingPresenter_Factory implements b {
    private final Provider announcementServiceProvider;
    private final Provider repositoryProvider;
    private final Provider schedulersProvider;

    public LivenessChallengesLoadingPresenter_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.repositoryProvider = provider;
        this.announcementServiceProvider = provider2;
        this.schedulersProvider = provider3;
    }

    public static LivenessChallengesLoadingPresenter_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new LivenessChallengesLoadingPresenter_Factory(provider, provider2, provider3);
    }

    public static LivenessChallengesLoadingPresenter newInstance(LivenessChallengesRepository livenessChallengesRepository, AnnouncementService announcementService, SchedulersProvider schedulersProvider) {
        return new LivenessChallengesLoadingPresenter(livenessChallengesRepository, announcementService, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public LivenessChallengesLoadingPresenter get() {
        return newInstance((LivenessChallengesRepository) this.repositoryProvider.get(), (AnnouncementService) this.announcementServiceProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
