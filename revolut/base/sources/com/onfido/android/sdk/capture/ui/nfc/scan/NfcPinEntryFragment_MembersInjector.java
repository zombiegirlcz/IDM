package com.onfido.android.sdk.capture.ui.nfc.scan;

import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcPinEntryFragment_MembersInjector implements MembersInjector {
    private final Provider announcementServiceProvider;

    public NfcPinEntryFragment_MembersInjector(Provider provider) {
        this.announcementServiceProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new NfcPinEntryFragment_MembersInjector(provider);
    }

    public static void injectAnnouncementService(NfcPinEntryFragment nfcPinEntryFragment, AnnouncementService announcementService) {
        nfcPinEntryFragment.announcementService = announcementService;
    }

    public void injectMembers(NfcPinEntryFragment nfcPinEntryFragment) {
        injectAnnouncementService(nfcPinEntryFragment, (AnnouncementService) this.announcementServiceProvider.get());
    }
}
