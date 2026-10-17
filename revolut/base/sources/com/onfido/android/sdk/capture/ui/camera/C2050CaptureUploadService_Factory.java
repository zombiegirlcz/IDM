package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureUploadService_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2050CaptureUploadService_Factory {
    private final Provider onfidoApiServiceProvider;
    private final Provider payloadHelperProvider;
    private final Provider schedulersProvider;

    public C2050CaptureUploadService_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.onfidoApiServiceProvider = provider;
        this.schedulersProvider = provider2;
        this.payloadHelperProvider = provider3;
    }

    public static C2050CaptureUploadService_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new C2050CaptureUploadService_Factory(provider, provider2, provider3);
    }

    public static CaptureUploadService newInstance(CaptureType captureType, OnfidoApiService onfidoApiService, CaptureUploadServiceListener captureUploadServiceListener, SchedulersProvider schedulersProvider, PayloadHelper payloadHelper) {
        return new CaptureUploadService(captureType, onfidoApiService, captureUploadServiceListener, schedulersProvider, payloadHelper);
    }

    public CaptureUploadService get(CaptureType captureType, CaptureUploadServiceListener captureUploadServiceListener) {
        return newInstance(captureType, (OnfidoApiService) this.onfidoApiServiceProvider.get(), captureUploadServiceListener, (SchedulersProvider) this.schedulersProvider.get(), (PayloadHelper) this.payloadHelperProvider.get());
    }
}
