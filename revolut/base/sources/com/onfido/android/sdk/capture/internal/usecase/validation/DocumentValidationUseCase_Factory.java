package com.onfido.android.sdk.capture.internal.usecase.validation;

import com.onfido.android.sdk.capture.detector.rectangle.RectangleTransformer;
import com.onfido.android.sdk.capture.internal.usecase.DocumentPositionUseCase;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.utils.mlmodel.OnfidoMlModelProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentValidationUseCase_Factory implements b {
    private final Provider dispatchersProvider;
    private final Provider documentPositionUseCaseProvider;
    private final Provider nativeDetectorProvider;
    private final Provider onfidoMlModelProvider;
    private final Provider timeProvider;
    private final Provider transformerProvider;

    public DocumentValidationUseCase_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.onfidoMlModelProvider = provider;
        this.transformerProvider = provider2;
        this.documentPositionUseCaseProvider = provider3;
        this.nativeDetectorProvider = provider4;
        this.dispatchersProvider = provider5;
        this.timeProvider = provider6;
    }

    public static DocumentValidationUseCase_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new DocumentValidationUseCase_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static DocumentValidationUseCase newInstance(OnfidoMlModelProvider onfidoMlModelProvider, RectangleTransformer rectangleTransformer, DocumentPositionUseCase documentPositionUseCase, NativeDetector nativeDetector, DispatchersProvider dispatchersProvider, TimeProvider timeProvider) {
        return new DocumentValidationUseCase(onfidoMlModelProvider, rectangleTransformer, documentPositionUseCase, nativeDetector, dispatchersProvider, timeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentValidationUseCase get() {
        return newInstance((OnfidoMlModelProvider) this.onfidoMlModelProvider.get(), (RectangleTransformer) this.transformerProvider.get(), (DocumentPositionUseCase) this.documentPositionUseCaseProvider.get(), (NativeDetector) this.nativeDetectorProvider.get(), (DispatchersProvider) this.dispatchersProvider.get(), (TimeProvider) this.timeProvider.get());
    }
}
