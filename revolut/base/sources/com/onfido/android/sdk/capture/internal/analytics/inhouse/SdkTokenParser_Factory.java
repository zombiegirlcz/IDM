package com.onfido.android.sdk.capture.internal.analytics.inhouse;

import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkTokenParser_Factory implements b {
    private final Provider jsonParserProvider;

    public SdkTokenParser_Factory(Provider provider) {
        this.jsonParserProvider = provider;
    }

    public static SdkTokenParser_Factory create(Provider provider) {
        return new SdkTokenParser_Factory(provider);
    }

    public static SdkTokenParser newInstance(Json json) {
        return new SdkTokenParser(json);
    }

    @Override // com.onfido.javax.inject.Provider
    public SdkTokenParser get() {
        return newInstance((Json) this.jsonParserProvider.get());
    }
}
