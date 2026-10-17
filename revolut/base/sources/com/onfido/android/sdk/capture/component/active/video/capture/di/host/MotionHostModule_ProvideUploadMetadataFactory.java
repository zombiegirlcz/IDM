package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideUploadMetadataFactory implements b {
    private final MotionHostModule module;
    private final Provider sdkUploadMetadataHelperProvider;

    public MotionHostModule_ProvideUploadMetadataFactory(MotionHostModule motionHostModule, Provider provider) {
        this.module = motionHostModule;
        this.sdkUploadMetadataHelperProvider = provider;
    }

    public static MotionHostModule_ProvideUploadMetadataFactory create(MotionHostModule motionHostModule, Provider provider) {
        return new MotionHostModule_ProvideUploadMetadataFactory(motionHostModule, provider);
    }

    public static SdkUploadMetaData provideUploadMetadata(MotionHostModule motionHostModule, SdkUploadMetadataHelper sdkUploadMetadataHelper) {
        SdkUploadMetaData sdkUploadMetaDataProvideUploadMetadata = motionHostModule.provideUploadMetadata(sdkUploadMetadataHelper);
        e.g(sdkUploadMetaDataProvideUploadMetadata);
        return sdkUploadMetaDataProvideUploadMetadata;
    }

    @Override // com.onfido.javax.inject.Provider
    public SdkUploadMetaData get() {
        return provideUploadMetadata(this.module, (SdkUploadMetadataHelper) this.sdkUploadMetadataHelperProvider.get());
    }
}
