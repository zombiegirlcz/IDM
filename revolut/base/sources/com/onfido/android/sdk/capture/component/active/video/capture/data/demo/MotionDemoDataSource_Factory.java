package com.onfido.android.sdk.capture.component.active.video.capture.data.demo;

import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionDemoDataSource_Factory implements b {
    private final Provider jsonParserProvider;

    public MotionDemoDataSource_Factory(Provider provider) {
        this.jsonParserProvider = provider;
    }

    public static MotionDemoDataSource_Factory create(Provider provider) {
        return new MotionDemoDataSource_Factory(provider);
    }

    public static MotionDemoDataSource newInstance(Json json) {
        return new MotionDemoDataSource(json);
    }

    @Override // com.onfido.javax.inject.Provider
    public MotionDemoDataSource get() {
        return newInstance((Json) this.jsonParserProvider.get());
    }
}
