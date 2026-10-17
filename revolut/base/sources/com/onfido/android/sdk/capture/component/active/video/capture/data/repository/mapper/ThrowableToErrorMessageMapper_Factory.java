package com.onfido.android.sdk.capture.component.active.video.capture.data.repository.mapper;

import android.content.res.Resources;
import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class ThrowableToErrorMessageMapper_Factory implements b {
    private final Provider jsonParserProvider;
    private final Provider resourcesProvider;

    public ThrowableToErrorMessageMapper_Factory(Provider provider, Provider provider2) {
        this.jsonParserProvider = provider;
        this.resourcesProvider = provider2;
    }

    public static ThrowableToErrorMessageMapper_Factory create(Provider provider, Provider provider2) {
        return new ThrowableToErrorMessageMapper_Factory(provider, provider2);
    }

    public static ThrowableToErrorMessageMapper newInstance(Json json, Resources resources) {
        return new ThrowableToErrorMessageMapper(json, resources);
    }

    @Override // com.onfido.javax.inject.Provider
    public ThrowableToErrorMessageMapper get() {
        return newInstance((Json) this.jsonParserProvider.get(), (Resources) this.resourcesProvider.get());
    }
}
