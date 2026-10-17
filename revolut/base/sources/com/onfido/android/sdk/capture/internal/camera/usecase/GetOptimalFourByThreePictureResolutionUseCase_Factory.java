package com.onfido.android.sdk.capture.internal.camera.usecase;

import com.onfido.android.sdk.capture.internal.util.Dimension;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class GetOptimalFourByThreePictureResolutionUseCase_Factory {
    private final Provider previewDimensionProvider;
    private final Provider screenHeightToFrameHeightRatioProvider;

    public GetOptimalFourByThreePictureResolutionUseCase_Factory(Provider provider, Provider provider2) {
        this.screenHeightToFrameHeightRatioProvider = provider;
        this.previewDimensionProvider = provider2;
    }

    public static GetOptimalFourByThreePictureResolutionUseCase_Factory create(Provider provider, Provider provider2) {
        return new GetOptimalFourByThreePictureResolutionUseCase_Factory(provider, provider2);
    }

    public static GetOptimalFourByThreePictureResolutionUseCase newInstance(double d, Dimension dimension) {
        return new GetOptimalFourByThreePictureResolutionUseCase(d, dimension);
    }

    public GetOptimalFourByThreePictureResolutionUseCase get() {
        return newInstance(((Double) this.screenHeightToFrameHeightRatioProvider.get()).doubleValue(), (Dimension) this.previewDimensionProvider.get());
    }
}
