package com.onfido.android.sdk.capture.ui.nfc.scan;

import com.onfido.android.sdk.capture.common.result.HapticFeedback;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcScanFragment_MembersInjector implements MembersInjector {
    private final Provider announcementServiceProvider;
    private final Provider dispatchersProvider;
    private final Provider hapticFeedbackProvider;
    private final Provider nfcInteractorProvider;
    private final Provider presenterFactoryProvider;

    public NfcScanFragment_MembersInjector(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.presenterFactoryProvider = provider;
        this.announcementServiceProvider = provider2;
        this.nfcInteractorProvider = provider3;
        this.hapticFeedbackProvider = provider4;
        this.dispatchersProvider = provider5;
    }

    public static MembersInjector create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new NfcScanFragment_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    public static void injectAnnouncementService(NfcScanFragment nfcScanFragment, AnnouncementService announcementService) {
        nfcScanFragment.announcementService = announcementService;
    }

    public static void injectDispatchersProvider(NfcScanFragment nfcScanFragment, DispatchersProvider dispatchersProvider) {
        nfcScanFragment.dispatchersProvider = dispatchersProvider;
    }

    public static void injectHapticFeedback(NfcScanFragment nfcScanFragment, HapticFeedback hapticFeedback) {
        nfcScanFragment.hapticFeedback = hapticFeedback;
    }

    public static void injectNfcInteractor(NfcScanFragment nfcScanFragment, NfcInteractor nfcInteractor) {
        nfcScanFragment.nfcInteractor = nfcInteractor;
    }

    public static void injectPresenterFactory(NfcScanFragment nfcScanFragment, NfcScanPresenter.Factory factory) {
        nfcScanFragment.presenterFactory = factory;
    }

    public void injectMembers(NfcScanFragment nfcScanFragment) {
        injectPresenterFactory(nfcScanFragment, (NfcScanPresenter.Factory) this.presenterFactoryProvider.get());
        injectAnnouncementService(nfcScanFragment, (AnnouncementService) this.announcementServiceProvider.get());
        injectNfcInteractor(nfcScanFragment, (NfcInteractor) this.nfcInteractorProvider.get());
        injectHapticFeedback(nfcScanFragment, (HapticFeedback) this.hapticFeedbackProvider.get());
        injectDispatchersProvider(nfcScanFragment, (DispatchersProvider) this.dispatchersProvider.get());
    }
}
