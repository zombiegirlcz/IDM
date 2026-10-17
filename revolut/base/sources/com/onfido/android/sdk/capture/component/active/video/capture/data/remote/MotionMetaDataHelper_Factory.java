package com.onfido.android.sdk.capture.component.active.video.capture.data.remote;

import android.content.Context;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionMetaDataHelper_Factory implements b {
    private final Provider contextProvider;
    private final Provider jsonParserProvider;
    private final Provider metadataProvider;

    public MotionMetaDataHelper_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.contextProvider = provider;
        this.metadataProvider = provider2;
        this.jsonParserProvider = provider3;
    }

    public static MotionMetaDataHelper_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new MotionMetaDataHelper_Factory(provider, provider2, provider3);
    }

    public static MotionMetaDataHelper newInstance(Context context, SdkUploadMetaData sdkUploadMetaData, Json json) {
        return new MotionMetaDataHelper(context, sdkUploadMetaData, json);
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionMetaDataHelper get() {
        return newInstance((Context) this.contextProvider.get(), (SdkUploadMetaData) this.metadataProvider.get(), (Json) this.jsonParserProvider.get());
    }
}
