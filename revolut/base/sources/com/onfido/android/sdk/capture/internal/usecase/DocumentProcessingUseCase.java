package com.onfido.android.sdk.capture.internal.usecase;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.validation.BarcodeValidationSuspender;
import com.onfido.android.sdk.capture.validation.OnDeviceValidationTransformer;
import com.onfido.android.sdk.capture.validation.OnDeviceValidationType;
import com.onfido.android.sdk.capture.validation.RealTimeDocumentValidationsManager;
import com.onfido.android.sdk.capture.validation.device.OnDeviceValidationResult;
import com.onfido.api.client.data.DocSide;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.d;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B?\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0002\b\u001aJ$\u0010\u001b\u001a\u00020\u00132\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase;", "", "nativeDetector", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "realTimeDocumentValidationsManager", "Lcom/onfido/android/sdk/capture/validation/RealTimeDocumentValidationsManager;", "onDeviceValidationTransformer", "Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationTransformer;", "retainableValidationsResult", "Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;", "barcodeValidationSuspender", "Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "(Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;Lcom/onfido/android/sdk/capture/validation/RealTimeDocumentValidationsManager;Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationTransformer;Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "execute", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCaseResult;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "docSide", "Lcom/onfido/api/client/data/DocSide;", "execute$onfido_capture_sdk_core_release", "getResults", "validationTypeToResultMap", "", "Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationType;", "Lcom/onfido/android/sdk/capture/validation/device/OnDeviceValidationResult;", "cameraFrameData", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentProcessingUseCase {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final long SAMPLING_PERIOD_MS = 350;

    @NotNull
    private final BarcodeValidationSuspender barcodeValidationSuspender;

    @NotNull
    private final NativeDetector nativeDetector;

    @NotNull
    private final OnDeviceValidationTransformer onDeviceValidationTransformer;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private final RealTimeDocumentValidationsManager realTimeDocumentValidationsManager;

    @NotNull
    private final RetainableValidationsResult retainableValidationsResult;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase$Companion;", "", "()V", "SAMPLING_PERIOD_MS", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DocumentProcessingUseCase(@NotNull NativeDetector nativeDetector, @NotNull RealTimeDocumentValidationsManager realTimeDocumentValidationsManager, @NotNull OnDeviceValidationTransformer onDeviceValidationTransformer, @NotNull RetainableValidationsResult retainableValidationsResult, @NotNull BarcodeValidationSuspender barcodeValidationSuspender, @NotNull SchedulersProvider schedulersProvider, @NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(nativeDetector, "nativeDetector");
        Intrinsics.checkNotNullParameter(realTimeDocumentValidationsManager, "realTimeDocumentValidationsManager");
        Intrinsics.checkNotNullParameter(onDeviceValidationTransformer, "onDeviceValidationTransformer");
        Intrinsics.checkNotNullParameter(retainableValidationsResult, "retainableValidationsResult");
        Intrinsics.checkNotNullParameter(barcodeValidationSuspender, "barcodeValidationSuspender");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.nativeDetector = nativeDetector;
        this.realTimeDocumentValidationsManager = realTimeDocumentValidationsManager;
        this.onDeviceValidationTransformer = onDeviceValidationTransformer;
        this.retainableValidationsResult = retainableValidationsResult;
        this.barcodeValidationSuspender = barcodeValidationSuspender;
        this.schedulersProvider = schedulersProvider;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    public static /* synthetic */ Observable execute$onfido_capture_sdk_core_release$default(DocumentProcessingUseCase documentProcessingUseCase, DocumentType documentType, CountryCode countryCode, DocSide docSide, int i, Object obj2) {
        if ((i & 2) != 0) {
            countryCode = null;
        }
        if ((i & 4) != 0) {
            docSide = null;
        }
        return documentProcessingUseCase.execute$onfido_capture_sdk_core_release(documentType, countryCode, docSide);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocumentProcessingUseCaseResult getResults(Map<OnDeviceValidationType, ? extends OnDeviceValidationResult> validationTypeToResultMap, DocumentDetectionFrame cameraFrameData) {
        LinkedHashMap linkedHashMapZ = r0.z(validationTypeToResultMap);
        for (Map.Entry<OnDeviceValidationType, OnDeviceValidationResult> entry : this.retainableValidationsResult.getRetainedValidationResults$onfido_capture_sdk_core_release().entrySet()) {
            linkedHashMapZ.put(entry.getKey(), entry.getValue());
        }
        return new DocumentProcessingUseCaseResult(DocumentProcessingResults.INSTANCE.mapFromValidationTypeToResult(linkedHashMapZ), cameraFrameData);
    }

    @NotNull
    public final Observable execute$onfido_capture_sdk_core_release(@NotNull DocumentType documentType, CountryCode countryCode, DocSide docSide) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        final OnDeviceValidationType[] requiredValidations = this.realTimeDocumentValidationsManager.getRequiredValidations(documentType, countryCode, docSide);
        Observable observableDoOnNext = this.nativeDetector.getFrameData().sample(350L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).flatMap(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase$execute$1
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(final DocumentDetectionFrame documentDetectionFrame) {
                OnDeviceValidationType[] onDeviceValidationTypeArr = requiredValidations;
                RetainableValidationsResult retainableValidationsResult = this.retainableValidationsResult;
                ArrayList arrayList = new ArrayList();
                for (OnDeviceValidationType onDeviceValidationType : onDeviceValidationTypeArr) {
                    if (!retainableValidationsResult.wasValidationRetained$onfido_capture_sdk_core_release(onDeviceValidationType)) {
                        arrayList.add(onDeviceValidationType);
                    }
                }
                BarcodeValidationSuspender barcodeValidationSuspender = this.barcodeValidationSuspender;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!barcodeValidationSuspender.isValidationSuspended$onfido_capture_sdk_core_release((OnDeviceValidationType) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                DocumentProcessingUseCase documentProcessingUseCase = this;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    OnDeviceValidationType onDeviceValidationType2 = (OnDeviceValidationType) obj3;
                    if (documentProcessingUseCase.onfidoRemoteConfig.getDocumentCapture().isMrzDetectionEnabled() || onDeviceValidationType2 != OnDeviceValidationType.MRZ_DETECTION) {
                        arrayList3.add(obj3);
                    }
                }
                final OnDeviceValidationType[] onDeviceValidationTypeArr2 = (OnDeviceValidationType[]) arrayList3.toArray(new OnDeviceValidationType[0]);
                DocumentProcessingUseCase documentProcessingUseCase2 = this;
                ArrayList arrayList4 = new ArrayList(onDeviceValidationTypeArr2.length);
                for (OnDeviceValidationType onDeviceValidationType3 : onDeviceValidationTypeArr2) {
                    OnDeviceValidationTransformer onDeviceValidationTransformer = documentProcessingUseCase2.onDeviceValidationTransformer;
                    Intrinsics.h(documentDetectionFrame);
                    arrayList4.add(onDeviceValidationTransformer.transformRealTimeValidations(documentDetectionFrame, onDeviceValidationType3));
                }
                final DocumentProcessingUseCase documentProcessingUseCase3 = this;
                return new d(arrayList4, new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase$execute$1.1
                    @Override // igm.o
                    @NotNull
                    public final Pair<Map<OnDeviceValidationType, OnDeviceValidationResult>, DocumentDetectionFrame> apply(@NotNull Object[] validationResults) {
                        Intrinsics.checkNotNullParameter(validationResults, "validationResults");
                        return new Pair<>(documentProcessingUseCase3.onDeviceValidationTransformer.getResults(onDeviceValidationTypeArr2, validationResults), documentDetectionFrame);
                    }
                }, 4).l();
            }
        }).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase$execute$2
            @Override // igm.g
            public final void accept(@NotNull Pair<? extends Map<OnDeviceValidationType, ? extends OnDeviceValidationResult>, DocumentDetectionFrame> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                this.this$0.retainableValidationsResult.retainValidValidationResult$onfido_capture_sdk_core_release((Map) pair.f186385a);
            }
        }).map(new o() { // from class: com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase$execute$3
            @Override // igm.o
            @NotNull
            public final DocumentProcessingUseCaseResult apply(@NotNull Pair<? extends Map<OnDeviceValidationType, ? extends OnDeviceValidationResult>, DocumentDetectionFrame> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Map map = (Map) pair.f186385a;
                DocumentDetectionFrame documentDetectionFrame = (DocumentDetectionFrame) pair.f186386b;
                DocumentProcessingUseCase documentProcessingUseCase = this.this$0;
                Intrinsics.h(documentDetectionFrame);
                return documentProcessingUseCase.getResults(map, documentDetectionFrame);
            }
        }).doOnNext(new g() { // from class: com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase$execute$4
            @Override // igm.g
            public final void accept(@NotNull DocumentProcessingUseCaseResult it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                this.this$0.barcodeValidationSuspender.onValidationResult$onfido_capture_sdk_core_release(it8.getDocumentProcessingResults());
            }
        });
        final BarcodeValidationSuspender barcodeValidationSuspender = this.barcodeValidationSuspender;
        Observable observableDoOnDispose = observableDoOnNext.doOnDispose(new igm.a() { // from class: com.onfido.android.sdk.capture.internal.usecase.c
            @Override // igm.a
            public final void run() {
                barcodeValidationSuspender.stopTimer$onfido_capture_sdk_core_release();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnDispose, "doOnDispose(...)");
        return observableDoOnDispose;
    }
}
