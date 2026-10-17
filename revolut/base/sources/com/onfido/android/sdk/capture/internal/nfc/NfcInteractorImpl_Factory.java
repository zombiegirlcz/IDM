package com.onfido.android.sdk.capture.internal.nfc;

import android.nfc.NfcAdapter;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcInteractorImpl_Factory implements el.b {
    private final Provider nfcAdapterProvider;
    private final Provider nfcTimeoutsProvider;
    private final Provider nfcTrackerProvider;
    private final Provider passportReaderProvider;
    private final Provider timeProvider;

    public NfcInteractorImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.nfcAdapterProvider = provider;
        this.passportReaderProvider = provider2;
        this.nfcTrackerProvider = provider3;
        this.nfcTimeoutsProvider = provider4;
        this.timeProvider = provider5;
    }

    public static NfcInteractorImpl_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new NfcInteractorImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static NfcInteractorImpl newInstance(NfcAdapter nfcAdapter, PassportNfcReader passportNfcReader, NfcTracker nfcTracker, NfcTimeouts nfcTimeouts, TimeProvider timeProvider) {
        return new NfcInteractorImpl(nfcAdapter, passportNfcReader, nfcTracker, nfcTimeouts, timeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public NfcInteractorImpl get() {
        return newInstance((NfcAdapter) this.nfcAdapterProvider.get(), (PassportNfcReader) this.passportReaderProvider.get(), (NfcTracker) this.nfcTrackerProvider.get(), (NfcTimeouts) this.nfcTimeoutsProvider.get(), (TimeProvider) this.timeProvider.get());
    }
}
