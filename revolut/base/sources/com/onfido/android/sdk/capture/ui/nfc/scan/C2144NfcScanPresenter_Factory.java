package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.res.Resources;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.nfc.NfcTimeouts;
import com.onfido.android.sdk.capture.internal.nfc.RealtimeNfcEvents;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2144NfcScanPresenter_Factory {
    private final Provider nfcInteractorProvider;
    private final Provider nfcTimeoutsProvider;
    private final Provider nfcTrackerProvider;
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;
    private final Provider storageProvider;

    public C2144NfcScanPresenter_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.nfcInteractorProvider = provider;
        this.schedulersProvider = provider2;
        this.nfcTrackerProvider = provider3;
        this.nfcTimeoutsProvider = provider4;
        this.storageProvider = provider5;
        this.remoteConfigProvider = provider6;
    }

    public static C2144NfcScanPresenter_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C2144NfcScanPresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static NfcScanPresenter newInstance(DocumentType documentType, CountryCode countryCode, NfcFlowType nfcFlowType, PassportBACKey passportBACKey, byte[] bArr, boolean z, MRTDDataGroup[] mRTDDataGroupArr, RealtimeNfcEvents realtimeNfcEvents, int i, Resources resources, NfcInteractor nfcInteractor, SchedulersProvider schedulersProvider, NfcTracker nfcTracker, NfcTimeouts nfcTimeouts, SharedPreferencesDataSource sharedPreferencesDataSource, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new NfcScanPresenter(documentType, countryCode, nfcFlowType, passportBACKey, bArr, z, mRTDDataGroupArr, realtimeNfcEvents, i, resources, nfcInteractor, schedulersProvider, nfcTracker, nfcTimeouts, sharedPreferencesDataSource, onfidoRemoteConfig);
    }

    public NfcScanPresenter get(DocumentType documentType, CountryCode countryCode, NfcFlowType nfcFlowType, PassportBACKey passportBACKey, byte[] bArr, boolean z, MRTDDataGroup[] mRTDDataGroupArr, RealtimeNfcEvents realtimeNfcEvents, int i, Resources resources) {
        return newInstance(documentType, countryCode, nfcFlowType, passportBACKey, bArr, z, mRTDDataGroupArr, realtimeNfcEvents, i, resources, (NfcInteractor) this.nfcInteractorProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (NfcTracker) this.nfcTrackerProvider.get(), (NfcTimeouts) this.nfcTimeoutsProvider.get(), (SharedPreferencesDataSource) this.storageProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get());
    }
}
