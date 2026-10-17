package com.onfido.android.sdk.capture.detector.rectangle;

import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class RectangleDetectorGoogle_Factory implements el.b {
    private final Provider schedulersProvider;
    private final Provider transformerProvider;

    public RectangleDetectorGoogle_Factory(Provider provider, Provider provider2) {
        this.transformerProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static RectangleDetectorGoogle_Factory create(Provider provider, Provider provider2) {
        return new RectangleDetectorGoogle_Factory(provider, provider2);
    }

    public static RectangleDetectorGoogle newInstance(RectangleTransformer rectangleTransformer, SchedulersProvider schedulersProvider) {
        return new RectangleDetectorGoogle(rectangleTransformer, schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public RectangleDetectorGoogle get() {
        return newInstance((RectangleTransformer) this.transformerProvider.get(), (SchedulersProvider) this.schedulersProvider.get());
    }
}
