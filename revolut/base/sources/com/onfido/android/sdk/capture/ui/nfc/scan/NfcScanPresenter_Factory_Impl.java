package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.res.Resources;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.nfc.RealtimeNfcEvents;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcScanPresenter_Factory_Impl implements NfcScanPresenter.Factory {
    private final C2144NfcScanPresenter_Factory delegateFactory;

    public NfcScanPresenter_Factory_Impl(C2144NfcScanPresenter_Factory c2144NfcScanPresenter_Factory) {
        this.delegateFactory = c2144NfcScanPresenter_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.Factory
    public NfcScanPresenter create(DocumentType documentType, CountryCode countryCode, NfcFlowType nfcFlowType, PassportBACKey passportBACKey, byte[] bArr, boolean z, MRTDDataGroup[] mRTDDataGroupArr, RealtimeNfcEvents realtimeNfcEvents, int i, Resources resources) {
        return this.delegateFactory.get(documentType, countryCode, nfcFlowType, passportBACKey, bArr, z, mRTDDataGroupArr, realtimeNfcEvents, i, resources);
    }

    public static Provider create(C2144NfcScanPresenter_Factory c2144NfcScanPresenter_Factory) {
        return new el.c(new NfcScanPresenter_Factory_Impl(c2144NfcScanPresenter_Factory));
    }
}
