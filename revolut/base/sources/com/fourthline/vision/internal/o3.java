package com.fourthline.vision.internal;

import android.content.Context;
import android.util.Size;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerCallback;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.MrzValidationPolicy;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import com.fourthline.vision.document.ocr.OcrBirthDateValidator;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import com.fourthline.vision.internal.o8;
import com.google.mlkit.vision.text.TextRecognizer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f36618c;
    private final na d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o3(@NotNull Function0<DocumentScannerConfig> documentScannerConfigFactory, @NotNull Function0<? extends DocumentScannerCallback> documentScannerCallbackFactory, @NotNull Function0<? extends oa> scannerDetectionAreaProviderFactory, @NotNull na scannerDataSource) {
        Intrinsics.checkNotNullParameter(documentScannerConfigFactory, "documentScannerConfigFactory");
        Intrinsics.checkNotNullParameter(documentScannerCallbackFactory, "documentScannerCallbackFactory");
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProviderFactory, "scannerDetectionAreaProviderFactory");
        Intrinsics.checkNotNullParameter(scannerDataSource, "scannerDataSource");
        this.f36616a = documentScannerConfigFactory;
        this.f36617b = documentScannerCallbackFactory;
        this.f36618c = scannerDetectionAreaProviderFactory;
        this.d = scannerDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int provideDocumentBirthDateValidator$lambda$0(o3 o3Var) {
        return ((DocumentScannerConfig) o3Var.f36616a.invoke()).getValidationConfig().getMinPersonAge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List provideDocumentCountriesValidator$lambda$0(o3 o3Var) {
        return ((DocumentScannerConfig) o3Var.f36616a.invoke()).getValidationConfig().getSupportedCountries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentType provideDocumentCountriesValidator$lambda$1(o3 o3Var) {
        return ((DocumentScannerConfig) o3Var.f36616a.invoke()).getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentType provideDocumentExpirationDateValidator$lambda$0(o3 o3Var) {
        return ((DocumentScannerConfig) o3Var.f36616a.invoke()).getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MrzValidationPolicy provideMrzCandidateInteractor$lambda$0(o3 o3Var) {
        return ((DocumentScannerConfig) o3Var.f36616a.invoke()).getMrzValidationPolicy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScannerConfig provideStepsDataSource$lambda$0(na naVar) {
        return (DocumentScannerConfig) naVar.config();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long provideTimeoutFactory$lambda$0(o3 o3Var) {
        return ((DocumentScannerConfig) o3Var.f36616a.invoke()).getAutoDetectStepDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoDuration provideVideoIntervalDataSource$lambda$0$1(o3 o3Var) {
        return ((DocumentScannerConfig) o3Var.f36616a.invoke()).getVideoDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o8.a provideVideoRecorderManager$lambda$0(o3 o3Var) {
        return ma.toInternalType(((DocumentScannerConfig) o3Var.f36616a.invoke()).getRecordingType());
    }

    @NotNull
    public final b3 provideCompositeStepInteractor$fourthline_vision_release(@NotNull t5 stepsDataSource, @NotNull z5 documentValidationPostProcessor, @NotNull VisionDocumentScannerFeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(stepsDataSource, "stepsDataSource");
        Intrinsics.checkNotNullParameter(documentValidationPostProcessor, "documentValidationPostProcessor");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        return new b3(new dh(stepsDataSource, 0), documentValidationPostProcessor, featureConfig.getDynamicStepsEvaluator());
    }

    @NotNull
    public final ne provideDocumentAnalytics(@NotNull qa scannerErrorMapper, @NotNull qa stepErrorMapper, @NotNull DocumentScannerConfig documentScannerConfig, @NotNull pe scannerContext) {
        Intrinsics.checkNotNullParameter(scannerErrorMapper, "scannerErrorMapper");
        Intrinsics.checkNotNullParameter(stepErrorMapper, "stepErrorMapper");
        Intrinsics.checkNotNullParameter(documentScannerConfig, "documentScannerConfig");
        Intrinsics.checkNotNullParameter(scannerContext, "scannerContext");
        return new u2(documentScannerConfig, scannerErrorMapper, stepErrorMapper, scannerContext);
    }

    @NotNull
    public final x2 provideDocumentBirthDateValidator$fourthline_vision_release(@NotNull TimestampProvider timestampProvider) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        return new x2(new OcrBirthDateValidator(timestampProvider, new ch(this, 7)));
    }

    @NotNull
    public final c3 provideDocumentCountriesValidator$fourthline_vision_release() {
        return new c3(new OcrCountryAndTypeValidator(new ch(this, 4)), new ch(this, 5));
    }

    @NotNull
    public final j3 provideDocumentDetectionProcessor(@NotNull p7 intelligentCropping, @NotNull j9 mrzDetectionAreaProvider, @NotNull oa maskDetectionAreaProvider, @NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(intelligentCropping, "intelligentCropping");
        Intrinsics.checkNotNullParameter(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(maskDetectionAreaProvider, "maskDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        return new j3(intelligentCropping, mrzDetectionAreaProvider, maskDetectionAreaProvider, scannerImageCreator);
    }

    @NotNull
    public final l3 provideDocumentExpirationDateValidator$fourthline_vision_release(@NotNull TimestampProvider timestampProvider) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        return new l3(new ch(this, 3), new OcrDocumentExpirationDateValidator(timestampProvider));
    }

    @NotNull
    public final c5 provideDocumentMrzValidator$fourthline_vision_release() {
        return new c5();
    }

    @NotNull
    public final g5 provideDocumentPhotoValidator$fourthline_vision_release(@NotNull DocumentScannerConfig documentScannerConfig, @NotNull j6 fastFaceDetector, @NotNull e8 imageConverter) {
        Intrinsics.checkNotNullParameter(documentScannerConfig, "documentScannerConfig");
        Intrinsics.checkNotNullParameter(fastFaceDetector, "fastFaceDetector");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        return new g5(documentScannerConfig.getType(), fastFaceDetector, imageConverter);
    }

    @NotNull
    public final DocumentScannerCallback provideDocumentScannerCallback$fourthline_vision_release() {
        return (DocumentScannerCallback) this.f36617b.invoke();
    }

    @NotNull
    public final h5 provideDocumentScannerCallbackProxy(@NotNull DocumentScannerCallback scannerCallback, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull qa scannerErrorMapper, @NotNull qa stepErrorMapper, @NotNull ne analytics) {
        Intrinsics.checkNotNullParameter(scannerCallback, "scannerCallback");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(scannerErrorMapper, "scannerErrorMapper");
        Intrinsics.checkNotNullParameter(stepErrorMapper, "stepErrorMapper");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        return new h5(this.f36616a, scannerCallback, timestampProvider, locationProvider, scannerErrorMapper, stepErrorMapper, analytics);
    }

    @NotNull
    public final DocumentScannerConfig provideDocumentScannerConfig$fourthline_vision_release() {
        return (DocumentScannerConfig) this.f36616a.invoke();
    }

    @NotNull
    public final qa provideDocumentScannerErrorMapper() {
        return new l5();
    }

    @NotNull
    public final qa provideDocumentScannerStepErrorMapper() {
        return new n5();
    }

    @NotNull
    public final y5 provideDocumentTypeValidator$fourthline_vision_release(@NotNull DocumentScannerConfig documentScannerConfig) {
        Intrinsics.checkNotNullParameter(documentScannerConfig, "documentScannerConfig");
        return new y5(documentScannerConfig.getType());
    }

    @NotNull
    public final z5 provideDocumentValidationPostProcessor$fourthline_vision_release(@NotNull b6 documentValidatorComposite) {
        Intrinsics.checkNotNullParameter(documentValidatorComposite, "documentValidatorComposite");
        return new z5(documentValidatorComposite);
    }

    @NotNull
    public final b6 provideDocumentValidatorComposite$fourthline_vision_release(@NotNull c5 mrzValidator, @NotNull y5 typeValidator, @NotNull x2 birthDateValidator, @NotNull l3 expirationDateValidator, @NotNull g5 photoValidator, @NotNull c3 countriesAndTypeValidator) {
        Intrinsics.checkNotNullParameter(mrzValidator, "mrzValidator");
        Intrinsics.checkNotNullParameter(typeValidator, "typeValidator");
        Intrinsics.checkNotNullParameter(birthDateValidator, "birthDateValidator");
        Intrinsics.checkNotNullParameter(expirationDateValidator, "expirationDateValidator");
        Intrinsics.checkNotNullParameter(photoValidator, "photoValidator");
        Intrinsics.checkNotNullParameter(countriesAndTypeValidator, "countriesAndTypeValidator");
        return new b6(mrzValidator, typeValidator, birthDateValidator, expirationDateValidator, photoValidator, countriesAndTypeValidator);
    }

    @NotNull
    public final g8 provideDutchIdlManualStepMrzExtractor(@NotNull oa scannerDetectionAreaProvider, @NotNull e8 imageConverter, @NotNull df visionInfoProvider, @NotNull z9 qrCodeTextDetector, @NotNull r9 ocrTextDetector, @NotNull i9 mrzCandidateFilter, @NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(qrCodeTextDetector, "qrCodeTextDetector");
        Intrinsics.checkNotNullParameter(ocrTextDetector, "ocrTextDetector");
        Intrinsics.checkNotNullParameter(mrzCandidateFilter, "mrzCandidateFilter");
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        Size imageReaderSize = visionInfoProvider.getImageReaderSize();
        return new g8(scannerDetectionAreaProvider, imageConverter, new Pair(Integer.valueOf(imageReaderSize.getWidth()), Integer.valueOf(imageReaderSize.getHeight())), qrCodeTextDetector, scannerImageCreator, mrzCandidateFilter);
    }

    @NotNull
    public final l7 provideImageToDocumentDetectionInteractor(@NotNull na dataSource, @NotNull o7 imageTooDarkConsumer, @NotNull r9 ocrTextDetector, @NotNull i9 mrzCandidateFilter, @NotNull j9 mrzDetectionAreaProvider, @NotNull e8 imageConverter, @NotNull df visionInfoProvider, @NotNull e2 debugConsumer) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(imageTooDarkConsumer, "imageTooDarkConsumer");
        Intrinsics.checkNotNullParameter(ocrTextDetector, "ocrTextDetector");
        Intrinsics.checkNotNullParameter(mrzCandidateFilter, "mrzCandidateFilter");
        Intrinsics.checkNotNullParameter(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(debugConsumer, "debugConsumer");
        Size imageReaderSize = visionInfoProvider.getImageReaderSize();
        return new l7(ocrTextDetector, imageTooDarkConsumer, mrzCandidateFilter, imageConverter, mrzDetectionAreaProvider, new Pair(Integer.valueOf(imageReaderSize.getWidth()), Integer.valueOf(imageReaderSize.getHeight())), ((DocumentScannerConfig) dataSource.config()).getDebugModeEnabled() ? debugConsumer : null);
    }

    @NotNull
    public final o7 provideImageTooDarkConsumer(@NotNull df visionInfoProvider, @NotNull na dataSource) {
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return new o7(visionInfoProvider.getImageReaderSize(), dataSource);
    }

    @NotNull
    public final p7 provideIntelligentCropping() {
        return new m3();
    }

    @NotNull
    public final w7 provideIsSteadyWarningInteractor(@NotNull t7 isSteadyDataSource) {
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        return new w7(isSteadyDataSource);
    }

    @NotNull
    public final g8 provideManualStepMrzExtractor(@NotNull j9 mrzDetectionAreaProvider, @NotNull e8 imageConverter, @NotNull df visionInfoProvider, @NotNull r9 ocrTextDetector, @NotNull i9 mrzCandidateFilter, @NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(ocrTextDetector, "ocrTextDetector");
        Intrinsics.checkNotNullParameter(mrzCandidateFilter, "mrzCandidateFilter");
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        Size imageReaderSize = visionInfoProvider.getImageReaderSize();
        return new g8(mrzDetectionAreaProvider, imageConverter, new Pair(Integer.valueOf(imageReaderSize.getWidth()), Integer.valueOf(imageReaderSize.getHeight())), ocrTextDetector, scannerImageCreator, mrzCandidateFilter);
    }

    @NotNull
    public final g9 provideMotionDataManager(@NotNull MotionDataCollector motionDataCollector, @NotNull TimestampProvider timestampProvider, @NotNull h9 motionDataTrimmer, @NotNull la scannerConfig) {
        Intrinsics.checkNotNullParameter(motionDataCollector, "motionDataCollector");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(motionDataTrimmer, "motionDataTrimmer");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        return new e(scannerConfig.getShouldCollectMotionData(), motionDataCollector, timestampProvider, motionDataTrimmer);
    }

    @NotNull
    public final h9 provideMotionDataTrimmer(@NotNull k8 mediaDurationIntervalDataSource) {
        Intrinsics.checkNotNullParameter(mediaDurationIntervalDataSource, "mediaDurationIntervalDataSource");
        return new c(mediaDurationIntervalDataSource);
    }

    @NotNull
    public final i9 provideMrzCandidateInteractor(@NotNull TimestampProvider timestampProvider) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        return new i9(new ch(this, 1), timestampProvider);
    }

    @NotNull
    public final j9 provideMrzDetectionAreaProvider(@NotNull na dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return new j9(dataSource);
    }

    @NotNull
    public final p9 provideNotMrzDetectionWarningInteractor() {
        return new p9();
    }

    @NotNull
    public final ja provideScanner$fourthline_vision_release(@NotNull o8 mediaRecorderManager, @NotNull g9 motionDataManager, @NotNull h5 scannerCallbackProxy, @NotNull wd stepsAdapter, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull a9 metadataRepository, @NotNull be triggerRepository, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(mediaRecorderManager, "mediaRecorderManager");
        Intrinsics.checkNotNullParameter(motionDataManager, "motionDataManager");
        Intrinsics.checkNotNullParameter(scannerCallbackProxy, "scannerCallbackProxy");
        Intrinsics.checkNotNullParameter(stepsAdapter, "stepsAdapter");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
        Intrinsics.checkNotNullParameter(triggerRepository, "triggerRepository");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new gf(scannerCallbackProxy, mediaRecorderManager, motionDataManager, stepsAdapter, metadataRepository, triggerRepository, timestampProvider, locationProvider, coroutineContext);
    }

    @NotNull
    public final na provideScannerDataSource$fourthline_vision_release() {
        return this.d;
    }

    @NotNull
    public final oa provideScannerDetectionAreaProvider$fourthline_vision_release() {
        return (oa) this.f36618c.invoke();
    }

    @NotNull
    public final sa provideScannerImageToDocumentStepResultInteractor$fourthline_vision_release(@NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        return new sa(scannerImageCreator);
    }

    @NotNull
    public final p5 provideScannerTimeoutConsumer$fourthline_vision_release(@NotNull TimestampProvider timestampProvider, @NotNull t5 stepsDataSource, @NotNull a9 metadataRepository) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(stepsDataSource, "stepsDataSource");
        Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
        return new p5(stepsDataSource.get().size(), metadataRepository, timestampProvider, 60L, TimeUnit.SECONDS);
    }

    @NotNull
    public final wd provideStepsAdapter$fourthline_vision_release(@NotNull DocumentScannerConfig documentScannerConfig, @NotNull k7 imageDataSource, @NotNull t7 isSteadyDataSource, @NotNull b3 documentCompositeStep, @NotNull p5 documentScannerTimeout) {
        Intrinsics.checkNotNullParameter(documentScannerConfig, "documentScannerConfig");
        Intrinsics.checkNotNullParameter(imageDataSource, "imageDataSource");
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        Intrinsics.checkNotNullParameter(documentCompositeStep, "documentCompositeStep");
        Intrinsics.checkNotNullParameter(documentScannerTimeout, "documentScannerTimeout");
        return new o5(imageDataSource, isSteadyDataSource, documentCompositeStep, Intrinsics.f(documentScannerConfig.getVideoDuration(), VideoDuration.EXTENDED.INSTANCE) ? zhm.u.c(documentScannerTimeout) : zhm.f0.f322471a);
    }

    @NotNull
    public final t5 provideStepsDataSource$fourthline_vision_release(@NotNull na dataSource, @NotNull w5 timeoutFactory, @NotNull o7 imageTooDarkConsumer, @NotNull w7 isSteadyWarningInteractor, @NotNull j3 documentDetectionProcessor, @NotNull sa imageToScannerImageInteractor, @NotNull g8 dutchIdlManualStepMrzExtractor, @NotNull g8 manualStepMrzExtractor, @NotNull l7 imageToDocumentDetectionInteractor, @NotNull ae triggerPreconditionConsumer, @NotNull p9 notMrzDetectionWarningInteractor, @NotNull TextRecognizer textRecognizer, @NotNull CoroutineContext coroutineContext, @NotNull VisionDocumentScannerFeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(timeoutFactory, "timeoutFactory");
        Intrinsics.checkNotNullParameter(imageTooDarkConsumer, "imageTooDarkConsumer");
        Intrinsics.checkNotNullParameter(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        Intrinsics.checkNotNullParameter(documentDetectionProcessor, "documentDetectionProcessor");
        Intrinsics.checkNotNullParameter(imageToScannerImageInteractor, "imageToScannerImageInteractor");
        Intrinsics.checkNotNullParameter(dutchIdlManualStepMrzExtractor, "dutchIdlManualStepMrzExtractor");
        Intrinsics.checkNotNullParameter(manualStepMrzExtractor, "manualStepMrzExtractor");
        Intrinsics.checkNotNullParameter(imageToDocumentDetectionInteractor, "imageToDocumentDetectionInteractor");
        Intrinsics.checkNotNullParameter(triggerPreconditionConsumer, "triggerPreconditionConsumer");
        Intrinsics.checkNotNullParameter(notMrzDetectionWarningInteractor, "notMrzDetectionWarningInteractor");
        Intrinsics.checkNotNullParameter(textRecognizer, "textRecognizer");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        return new t5(VisionDocumentScannerFeatureConfig.copy$default(featureConfig, !(textRecognizer instanceof t2), false, null, null, 14, null), new dg(dataSource, 7), dataSource, timeoutFactory, zhm.u.c(isSteadyWarningInteractor), documentDetectionProcessor, imageToScannerImageInteractor, dutchIdlManualStepMrzExtractor, manualStepMrzExtractor, imageToDocumentDetectionInteractor, triggerPreconditionConsumer, imageTooDarkConsumer, isSteadyWarningInteractor, zhm.u.c(notMrzDetectionWarningInteractor), coroutineContext.plus(skm.e0.d()));
    }

    @NotNull
    public final w5 provideTimeoutFactory(@NotNull TimestampProvider timestampProvider, @NotNull oa detectionAreaProvider) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        return new w5(timestampProvider, detectionAreaProvider, new ch(this, 6));
    }

    @NotNull
    public final k8 provideVideoIntervalDataSource(@NotNull VisionDocumentScannerFeatureConfig featureConfig, @NotNull a9 metadataRepository, @NotNull t5 stepsDataSource) {
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
        Intrinsics.checkNotNullParameter(stepsDataSource, "stepsDataSource");
        DocumentScannerConfig documentScannerConfig = (DocumentScannerConfig) this.f36616a.invoke();
        int i = a.$EnumSwitchMapping$0[documentScannerConfig.getType().ordinal()];
        if (i == 1 || i == 2) {
            return new n3(metadataRepository, new ng(documentScannerConfig, 1), stepsDataSource.get().size());
        }
        da daVar = da.f36106a;
        DocumentType type = documentScannerConfig.getType();
        boolean includeAngledSteps = documentScannerConfig.getIncludeAngledSteps();
        VisionDynamicStepsEvaluator<DocumentScannerStep> dynamicStepsEvaluator = featureConfig.getDynamicStepsEvaluator();
        return new ca(metadataRepository, new ch(this, 2), stepsDataSource.get().size(), daVar.getRecordingPlan(type, includeAngledSteps, dynamicStepsEvaluator != null ? dynamicStepsEvaluator.isDynamicStepsEnabled() : false, Long.valueOf(documentScannerConfig.getVideoDuration().getDuration())));
    }

    @NotNull
    public final o8 provideVideoRecorderManager(@NotNull f audioRecorder, @NotNull m8 mediaFilesManager, @NotNull q8 mediaTrimmer, @NotNull k8 videoIntervalDataSource) {
        Intrinsics.checkNotNullParameter(audioRecorder, "audioRecorder");
        Intrinsics.checkNotNullParameter(mediaFilesManager, "mediaFilesManager");
        Intrinsics.checkNotNullParameter(mediaTrimmer, "mediaTrimmer");
        Intrinsics.checkNotNullParameter(videoIntervalDataSource, "videoIntervalDataSource");
        return new p8(new ch(this, 0), audioRecorder, mediaFilesManager, mediaTrimmer, videoIntervalDataSource);
    }

    @NotNull
    public final pe provideVisionDocumentAnalyticsContext(@NotNull DocumentScannerConfig documentScannerConfig, @NotNull Map<String, Boolean> sdkSensorAvailability) {
        Intrinsics.checkNotNullParameter(documentScannerConfig, "documentScannerConfig");
        Intrinsics.checkNotNullParameter(sdkSensorAvailability, "sdkSensorAvailability");
        return new pe("vision", documentScannerConfig, sdkSensorAvailability);
    }

    @NotNull
    public final xf provideVisionViewModel(@NotNull Context context, @NotNull zf imageProducer, @NotNull k7 imageDataSource, @NotNull df visionInfoProvider, @NotNull ja scanner, @NotNull x cameraFocusManager, @NotNull la scannerConfig, @NotNull l7 detectorInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageProducer, "imageProducer");
        Intrinsics.checkNotNullParameter(imageDataSource, "imageDataSource");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        Intrinsics.checkNotNullParameter(cameraFocusManager, "cameraFocusManager");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        Intrinsics.checkNotNullParameter(detectorInteractor, "detectorInteractor");
        return new xf(imageProducer, imageDataSource, visionInfoProvider, scanner, cameraFocusManager, scannerConfig, detectorInteractor.getMrzDocumentDetector(), m0.createCameraSpecsOnReadyCallback(context, "document"));
    }
}
