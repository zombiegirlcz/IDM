package com.onfido.android.sdk.capture.component.active.video.capture.data.remote;

import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionRemoteDataSource_Factory implements b {
    private final Provider motionApiProvider;
    private final Provider motionCaptureVariantOptionsProvider;
    private final Provider motionMetaDataHelperProvider;
    private final Provider payloadHelperProvider;

    public MotionRemoteDataSource_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.motionCaptureVariantOptionsProvider = provider;
        this.motionApiProvider = provider2;
        this.payloadHelperProvider = provider3;
        this.motionMetaDataHelperProvider = provider4;
    }

    public static MotionRemoteDataSource_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new MotionRemoteDataSource_Factory(provider, provider2, provider3, provider4);
    }

    public static MotionRemoteDataSource newInstance(MotionCaptureVariantOptions motionCaptureVariantOptions, MotionApi motionApi, PayloadHelper payloadHelper, MotionMetaDataHelper motionMetaDataHelper) {
        return new MotionRemoteDataSource(motionCaptureVariantOptions, motionApi, payloadHelper, motionMetaDataHelper);
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionRemoteDataSource get() {
        return newInstance((MotionCaptureVariantOptions) this.motionCaptureVariantOptionsProvider.get(), (MotionApi) this.motionApiProvider.get(), (PayloadHelper) this.payloadHelperProvider.get(), (MotionMetaDataHelper) this.motionMetaDataHelperProvider.get());
    }
}
