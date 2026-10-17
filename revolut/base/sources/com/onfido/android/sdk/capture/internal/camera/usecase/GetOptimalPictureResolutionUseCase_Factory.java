package com.onfido.android.sdk.capture.internal.camera.usecase;

import com.onfido.android.sdk.capture.internal.util.Dimension;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class GetOptimalPictureResolutionUseCase_Factory {
    private final Provider previewDimensionProvider;
    private final Provider screenHeightToFrameHeightRatioProvider;

    public GetOptimalPictureResolutionUseCase_Factory(Provider provider, Provider provider2) {
        this.screenHeightToFrameHeightRatioProvider = provider;
        this.previewDimensionProvider = provider2;
    }

    public static GetOptimalPictureResolutionUseCase_Factory create(Provider provider, Provider provider2) {
        return new GetOptimalPictureResolutionUseCase_Factory(provider, provider2);
    }

    public static GetOptimalPictureResolutionUseCase newInstance(double d, Dimension dimension) {
        return new GetOptimalPictureResolutionUseCase(d, dimension);
    }

    public GetOptimalPictureResolutionUseCase get() {
        return newInstance(((Double) this.screenHeightToFrameHeightRatioProvider.get()).doubleValue(), (Dimension) this.previewDimensionProvider.get());
    }
}
