package com.fourthline.vision.internal;

import android.content.Context;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.OnVisionScannerEffect;
import com.fourthline.vision.VisionScannerEffect;
import com.fourthline.vision.internal.bb;
import com.fourthline.vision.internal.o8;
import com.fourthline.vision.selfie.SelfieScannerCallback;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class bb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f36011h = new b(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final SelfieScannerStep f36012j = SelfieScannerStep.TURN_HEAD_LEFT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f36015c;
    private final na d;
    private final OnVisionScannerEffect e;
    private final Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Function0 f36016g;

    public static final class a implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36017a = new a();

        @Override // kotlin.jvm.functions.Function0
        public final Void invoke() {
            return null;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelfieScannerStep getLivenessStepType() {
            return bb.f36012j;
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SelfieScannerStep f36018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public q7 f36019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q7 f36020c;
        private List d;
        private List e;
        private List f;

        public c(@NotNull SelfieScannerStep scannerStep) {
            Intrinsics.checkNotNullParameter(scannerStep, "scannerStep");
            this.f36018a = scannerStep;
            zhm.f0 f0Var = zhm.f0.f322471a;
            this.d = f0Var;
            this.e = f0Var;
            this.f = f0Var;
        }

        @NotNull
        public final td build() {
            SelfieScannerStep selfieScannerStep = this.f36018a;
            return new h(new sd(selfieScannerStep, selfieScannerStep == SelfieScannerStep.SELFIE), this.d, this.e, this.f, getProcessor(), getImageToDetections(), null, 64, null);
        }

        @NotNull
        public final List<x1> getErrors() {
            return this.e;
        }

        @NotNull
        public final q7 getImageToDetections() {
            q7 q7Var = this.f36019b;
            if (q7Var != null) {
                return q7Var;
            }
            Intrinsics.r("imageToDetections");
            throw null;
        }

        @NotNull
        public final List<qd> getPreconditions() {
            return this.d;
        }

        @NotNull
        public final q7 getProcessor() {
            q7 q7Var = this.f36020c;
            if (q7Var != null) {
                return q7Var;
            }
            Intrinsics.r("processor");
            throw null;
        }

        @NotNull
        public final List<q7> getWarnings() {
            return this.f;
        }

        public final void setErrors(@NotNull List<? extends x1> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.e = list;
        }

        public final void setImageToDetections(@NotNull q7 q7Var) {
            Intrinsics.checkNotNullParameter(q7Var, "<set-?>");
            this.f36019b = q7Var;
        }

        public final void setPreconditions(@NotNull List<? extends qd> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.d = list;
        }

        public final void setProcessor(@NotNull q7 q7Var) {
            Intrinsics.checkNotNullParameter(q7Var, "<set-?>");
            this.f36020c = q7Var;
        }

        public final void setWarnings(@NotNull List<? extends q7> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.f = list;
        }
    }

    public bb(@NotNull Function0<SelfieScannerConfig> selfieScannerConfigFactory, @NotNull Function0<? extends SelfieScannerCallback> selfieScannerCallbackFactory, @NotNull Function0<? extends oa> scannerDetectionAreaProviderFactory, @NotNull na scannerDataSource, @NotNull OnVisionScannerEffect onVisionScannerEffect, @NotNull Function0<? extends List<Integer>> randomnessLivenessSteps) {
        Intrinsics.checkNotNullParameter(selfieScannerConfigFactory, "selfieScannerConfigFactory");
        Intrinsics.checkNotNullParameter(selfieScannerCallbackFactory, "selfieScannerCallbackFactory");
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProviderFactory, "scannerDetectionAreaProviderFactory");
        Intrinsics.checkNotNullParameter(scannerDataSource, "scannerDataSource");
        Intrinsics.checkNotNullParameter(onVisionScannerEffect, "onVisionScannerEffect");
        Intrinsics.checkNotNullParameter(randomnessLivenessSteps, "randomnessLivenessSteps");
        this.f36013a = selfieScannerConfigFactory;
        this.f36014b = selfieScannerCallbackFactory;
        this.f36015c = scannerDetectionAreaProviderFactory;
        this.d = scannerDataSource;
        this.e = onVisionScannerEffect;
        this.f = randomnessLivenessSteps;
        this.f36016g = new aem.v(13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int currentRandomnessLivenessStepIndexFactory$lambda$0() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCompositeStepInteractor$lambda$1(bb bbVar, int i2) {
        bbVar.e.onVisionScannerEffect(new VisionScannerEffect.OnLivenessStepSuccess(i2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCompositeStepInteractor$lambda$2(bb bbVar, int i2) {
        List list = (List) bbVar.f.invoke();
        if (list != null) {
            bbVar.e.onVisionScannerEffect(new VisionScannerEffect.OnLivenessStepUpdate(((Number) list.get(i2)).intValue()));
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideCompositeStepInteractor$lambda$3(bb bbVar, int i2) {
        bbVar.e.onVisionScannerEffect(new VisionScannerEffect.OnLivenessStepCountUpdate(i2));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int provideLivenessStepWarningsChecker$lambda$0(bb bbVar) {
        List list = (List) bbVar.f.invoke();
        if (list != null) {
            return ((Number) list.get(((Number) bbVar.f36016g.invoke()).intValue())).intValue();
        }
        throw new IllegalStateException("FL Developer error. Randomness has to be enabled by now.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideLivenessStepWarningsChecker$lambda$1(bb bbVar, HeadMetadata headMetadata) {
        Intrinsics.checkNotNullParameter(headMetadata, "headMetadata");
        bbVar.e.onVisionScannerEffect(new VisionScannerEffect.OnHeadMoved(headMetadata));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideRandomnessLivenessStep$lambda$0(m7 m7Var, i6 i6Var, zd zdVar, k6 k6Var, n9 n9Var, d8 d8Var, c step) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        step.setImageToDetections(m7Var);
        step.setProcessor(i6Var);
        step.setPreconditions(zhm.u.c(zdVar));
        step.setErrors(zhm.v.k(k6Var, n9Var));
        step.setWarnings(zhm.u.c(d8Var));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideSelfieAutomaticStepInteractor$lambda$0(m7 m7Var, i6 i6Var, zd zdVar, n9 n9Var, v7 v7Var, wc wcVar, m6 m6Var, n6 n6Var, p6 p6Var, o6 o6Var, c step) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        step.setImageToDetections(m7Var);
        step.setProcessor(i6Var);
        step.setPreconditions(zhm.u.c(zdVar));
        step.setErrors(zhm.u.c(n9Var));
        step.setWarnings(zhm.v.k(v7Var, wcVar, m6Var, n6Var, p6Var, o6Var));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideStepsDataSource$lambda$0(bb bbVar) {
        return bbVar.f.invoke() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTurnHeadLeftStep$lambda$0(m7 m7Var, i6 i6Var, zd zdVar, k6 k6Var, n9 n9Var, ce ceVar, c step) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        step.setImageToDetections(m7Var);
        step.setProcessor(i6Var);
        step.setPreconditions(zhm.u.c(zdVar));
        step.setErrors(zhm.v.k(k6Var, n9Var));
        step.setWarnings(zhm.u.c(ceVar));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideTurnHeadRightStep$lambda$0(m7 m7Var, i6 i6Var, zd zdVar, k6 k6Var, n9 n9Var, de deVar, c step) {
        Intrinsics.checkNotNullParameter(step, "$this$step");
        step.setImageToDetections(m7Var);
        step.setProcessor(i6Var);
        step.setPreconditions(zhm.u.c(zdVar));
        step.setErrors(zhm.v.k(k6Var, n9Var));
        step.setWarnings(zhm.u.c(deVar));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o8.a provideVideoRecorderManager$lambda$0(bb bbVar) {
        return ma.toInternalType(((SelfieScannerConfig) bbVar.f36013a.invoke()).getRecordingType());
    }

    private final td step(SelfieScannerStep selfieScannerStep, Function1<? super c, Unit> function1) {
        c cVar = new c(selfieScannerStep);
        function1.invoke(cVar);
        return cVar.build();
    }

    @NotNull
    public final ya provideCompositeStepInteractor(@NotNull xc stepsDataSource) {
        Intrinsics.checkNotNullParameter(stepsDataSource, "stepsDataSource");
        ya yaVar = new ya(new dg(stepsDataSource, 2), this.f, new gg(this, 2), new gg(this, 3), new gg(this, 0));
        this.f36016g = new dg(yaVar, 1);
        return yaVar;
    }

    @NotNull
    public final i6 provideDetectionProcessor(@NotNull p7 intelligentCropping, @NotNull oa scannerDetectionAreaProvider, @NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(intelligentCropping, "intelligentCropping");
        Intrinsics.checkNotNullParameter(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        return new i6(intelligentCropping, scannerDetectionAreaProvider, scannerImageCreator);
    }

    @NotNull
    public final k6 provideFaceDisappearInteractor() {
        return new k6();
    }

    @NotNull
    public final m6 provideFaceNotDetectedWarningsInteractor() {
        return new m6();
    }

    @NotNull
    public final n6 provideFaceNotInFrameWarningInteractor(@NotNull na scannerDataSource) {
        Intrinsics.checkNotNullParameter(scannerDataSource, "scannerDataSource");
        return new n6(scannerDataSource);
    }

    @NotNull
    public final o6 provideFaceTooCloseWarningInteractor(@NotNull na scannerDataSource) {
        Intrinsics.checkNotNullParameter(scannerDataSource, "scannerDataSource");
        return new o6(scannerDataSource);
    }

    @NotNull
    public final p6 provideFaceTooFarWarningInteractor(@NotNull na scannerDataSource) {
        Intrinsics.checkNotNullParameter(scannerDataSource, "scannerDataSource");
        return new p6(scannerDataSource);
    }

    @NotNull
    public final m7 provideImageToFaceDetectionInteractor(@NotNull SelfieScannerConfig selfieScannerConfig, @NotNull e2 debugConsumer, @NotNull j6 fastFaceDetector, @NotNull e8 imageConverter) {
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "selfieScannerConfig");
        Intrinsics.checkNotNullParameter(debugConsumer, "debugConsumer");
        Intrinsics.checkNotNullParameter(fastFaceDetector, "fastFaceDetector");
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        x1 x1VarConsumer$default = debugConsumer;
        if (!selfieScannerConfig.getDebugModeEnabled()) {
            x1VarConsumer$default = y1.consumer$default(null, 1, null);
        }
        return new m7(fastFaceDetector, x1VarConsumer$default, imageConverter);
    }

    @NotNull
    public final p7 provideIntelligentCropping() {
        return new l6(false, 1, null);
    }

    @NotNull
    public final v7 provideIsSteadyWarningInteractor(@NotNull t7 isSteadyDataSource) {
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        return new v7(isSteadyDataSource);
    }

    @NotNull
    public final d8 provideLivenessStepWarningsChecker() {
        return new d8(new hg(this, 1), new gg(this, 1));
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
        return new com.fourthline.vision.internal.c(mediaDurationIntervalDataSource);
    }

    @NotNull
    public final n9 provideMultipleFacesInteractor() {
        return new n9();
    }

    @NotNull
    public final OnVisionScannerEffect provideOnVisionScannerEffect() {
        return this.e;
    }

    @NotNull
    public final td provideRandomnessLivenessStep(@NotNull zd timeoutConsumer, @NotNull d8 livenessStepWarningsChecker, @NotNull i6 faceDetectionProcessor, @NotNull k6 faceDisappearInteractor, @NotNull n9 multipleFacesInteractor, @NotNull m7 imageToFaceDetectionInteractor) {
        Intrinsics.checkNotNullParameter(timeoutConsumer, "timeoutConsumer");
        Intrinsics.checkNotNullParameter(livenessStepWarningsChecker, "livenessStepWarningsChecker");
        Intrinsics.checkNotNullParameter(faceDetectionProcessor, "faceDetectionProcessor");
        Intrinsics.checkNotNullParameter(faceDisappearInteractor, "faceDisappearInteractor");
        Intrinsics.checkNotNullParameter(multipleFacesInteractor, "multipleFacesInteractor");
        Intrinsics.checkNotNullParameter(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(f36012j, new fg(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, faceDisappearInteractor, multipleFacesInteractor, livenessStepWarningsChecker, 1));
    }

    @NotNull
    public final ja provideScanner(@NotNull o8 mediaRecorderManager, @NotNull g9 motionDataManager, @NotNull nc scannerCallbackProxy, @NotNull wd stepsAdapter, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull a9 metadataRepository, @NotNull be triggerRepository, @NotNull CoroutineContext coroutineContext) {
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
    public final na provideScannerDataSource() {
        return this.d;
    }

    @NotNull
    public final oa provideScannerDetectionAreaProvider() {
        return (oa) this.f36015c.invoke();
    }

    @NotNull
    public final ne provideSelfieAnalytics(@NotNull SelfieScannerConfig selfieScannerConfig, @NotNull qa errorMapper, @NotNull hf scannerContext) {
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "selfieScannerConfig");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(scannerContext, "scannerContext");
        return new wa(selfieScannerConfig, errorMapper, this.f, scannerContext);
    }

    @NotNull
    public final td provideSelfieAutomaticStepInteractor(@NotNull final v7 isSteadyWarningInteractor, @NotNull final wc selfieStepWarningsChecker, @NotNull final m6 faceNotDetectedWarningsInteractor, @NotNull final n9 multipleFacesInteractor, @NotNull final n6 faceNotInFrameWarningInteractor, @NotNull final p6 faceTooFarWarningInteractor, @NotNull final o6 faceTooCloseWarningInteractor, @NotNull final zd timeoutConsumer, @NotNull final i6 faceDetectionProcessor, @NotNull final m7 imageToFaceDetectionInteractor) {
        Intrinsics.checkNotNullParameter(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        Intrinsics.checkNotNullParameter(selfieStepWarningsChecker, "selfieStepWarningsChecker");
        Intrinsics.checkNotNullParameter(faceNotDetectedWarningsInteractor, "faceNotDetectedWarningsInteractor");
        Intrinsics.checkNotNullParameter(multipleFacesInteractor, "multipleFacesInteractor");
        Intrinsics.checkNotNullParameter(faceNotInFrameWarningInteractor, "faceNotInFrameWarningInteractor");
        Intrinsics.checkNotNullParameter(faceTooFarWarningInteractor, "faceTooFarWarningInteractor");
        Intrinsics.checkNotNullParameter(faceTooCloseWarningInteractor, "faceTooCloseWarningInteractor");
        Intrinsics.checkNotNullParameter(timeoutConsumer, "timeoutConsumer");
        Intrinsics.checkNotNullParameter(faceDetectionProcessor, "faceDetectionProcessor");
        Intrinsics.checkNotNullParameter(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(SelfieScannerStep.SELFIE, new Function1() { // from class: com.fourthline.vision.internal.ig
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return bb.provideSelfieAutomaticStepInteractor$lambda$0(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, multipleFacesInteractor, isSteadyWarningInteractor, selfieStepWarningsChecker, faceNotDetectedWarningsInteractor, faceNotInFrameWarningInteractor, faceTooFarWarningInteractor, faceTooCloseWarningInteractor, (bb.c) obj2);
            }
        });
    }

    @NotNull
    public final SelfieScannerCallback provideSelfieScannerCallback() {
        return (SelfieScannerCallback) this.f36014b.invoke();
    }

    @NotNull
    public final nc provideSelfieScannerCallbackProxy(@NotNull SelfieScannerCallback scannerCallback, @NotNull qa errorMapper, @NotNull ne analytics, @NotNull LocationProvider locationProvider) {
        Intrinsics.checkNotNullParameter(scannerCallback, "scannerCallback");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        return new nc(scannerCallback, errorMapper, locationProvider, analytics);
    }

    @NotNull
    public final SelfieScannerConfig provideSelfieScannerConfig() {
        return (SelfieScannerConfig) this.f36013a.invoke();
    }

    @NotNull
    public final qa provideSelfieScannerErrorMapper() {
        return new qc();
    }

    @NotNull
    public final wc provideSelfieStepWarningsChecker() {
        return new wc();
    }

    @NotNull
    public final wd provideStepsAdapter(@NotNull k7 imageDataSource, @NotNull t7 isSteadyDataSource, @NotNull ya selfieCompositeStep) {
        Intrinsics.checkNotNullParameter(imageDataSource, "imageDataSource");
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        Intrinsics.checkNotNullParameter(selfieCompositeStep, "selfieCompositeStep");
        return new tc(imageDataSource, isSteadyDataSource, selfieCompositeStep, zhm.f0.f322471a);
    }

    @NotNull
    public final xc provideStepsDataSource(@NotNull SelfieScannerConfig selfieScannerConfig, @NotNull td selfieStep, @NotNull td turnHeadLeftStep, @NotNull td turnHeadRightStep, @NotNull td randomnessLivenessStep) {
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "selfieScannerConfig");
        Intrinsics.checkNotNullParameter(selfieStep, "selfieStep");
        Intrinsics.checkNotNullParameter(turnHeadLeftStep, "turnHeadLeftStep");
        Intrinsics.checkNotNullParameter(turnHeadRightStep, "turnHeadRightStep");
        Intrinsics.checkNotNullParameter(randomnessLivenessStep, "randomnessLivenessStep");
        List<SelfieScannerStep> steps = selfieScannerConfig.getSteps();
        List listK = zhm.v.k(turnHeadLeftStep, turnHeadRightStep);
        Intrinsics.checkNotNullParameter(listK, "<this>");
        List listG1 = zhm.d0.g1(listK);
        Collections.shuffle(listG1);
        return new xc(steps, selfieStep, listG1, randomnessLivenessStep, selfieScannerConfig.getLivenessCheckType(), new hg(this, 0));
    }

    @NotNull
    public final zd provideTimeoutConsumer$fourthline_vision_release(@NotNull TimestampProvider timestampProvider) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        return new zd(timestampProvider, 30L, TimeUnit.SECONDS);
    }

    @NotNull
    public final td provideTurnHeadLeftStep(@NotNull zd timeoutConsumer, @NotNull ce turnHeadLeftStepWarningsChecker, @NotNull i6 faceDetectionProcessor, @NotNull k6 faceDisappearInteractor, @NotNull n9 multipleFacesInteractor, @NotNull m7 imageToFaceDetectionInteractor) {
        Intrinsics.checkNotNullParameter(timeoutConsumer, "timeoutConsumer");
        Intrinsics.checkNotNullParameter(turnHeadLeftStepWarningsChecker, "turnHeadLeftStepWarningsChecker");
        Intrinsics.checkNotNullParameter(faceDetectionProcessor, "faceDetectionProcessor");
        Intrinsics.checkNotNullParameter(faceDisappearInteractor, "faceDisappearInteractor");
        Intrinsics.checkNotNullParameter(multipleFacesInteractor, "multipleFacesInteractor");
        Intrinsics.checkNotNullParameter(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(SelfieScannerStep.TURN_HEAD_LEFT, new fg(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, faceDisappearInteractor, multipleFacesInteractor, turnHeadLeftStepWarningsChecker, 0));
    }

    @NotNull
    public final ce provideTurnHeadLeftStepWarningsChecker() {
        return new ce();
    }

    @NotNull
    public final td provideTurnHeadRightStep(@NotNull zd timeoutConsumer, @NotNull de turnHeadRightStepWarningsChecker, @NotNull i6 faceDetectionProcessor, @NotNull k6 faceDisappearInteractor, @NotNull n9 multipleFacesInteractor, @NotNull m7 imageToFaceDetectionInteractor) {
        Intrinsics.checkNotNullParameter(timeoutConsumer, "timeoutConsumer");
        Intrinsics.checkNotNullParameter(turnHeadRightStepWarningsChecker, "turnHeadRightStepWarningsChecker");
        Intrinsics.checkNotNullParameter(faceDetectionProcessor, "faceDetectionProcessor");
        Intrinsics.checkNotNullParameter(faceDisappearInteractor, "faceDisappearInteractor");
        Intrinsics.checkNotNullParameter(multipleFacesInteractor, "multipleFacesInteractor");
        Intrinsics.checkNotNullParameter(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(SelfieScannerStep.TURN_HEAD_RIGHT, new fg(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, faceDisappearInteractor, multipleFacesInteractor, turnHeadRightStepWarningsChecker, 2));
    }

    @NotNull
    public final de provideTurnHeadRightStepWarningsChecker() {
        return new de();
    }

    @NotNull
    public final k8 provideVideoIntervalDataSource(@NotNull a9 metadataRepository, @NotNull SelfieScannerConfig selfieScannerConfig) {
        Intrinsics.checkNotNullParameter(metadataRepository, "metadataRepository");
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "selfieScannerConfig");
        return new ab(selfieScannerConfig.getLivenessCheckType(), metadataRepository);
    }

    @NotNull
    public final o8 provideVideoRecorderManager(@NotNull f audioRecorder, @NotNull m8 mediaFilesManager, @NotNull q8 mediaTrimmer, @NotNull k8 videoIntervalDataSource) {
        Intrinsics.checkNotNullParameter(audioRecorder, "audioRecorder");
        Intrinsics.checkNotNullParameter(mediaFilesManager, "mediaFilesManager");
        Intrinsics.checkNotNullParameter(mediaTrimmer, "mediaTrimmer");
        Intrinsics.checkNotNullParameter(videoIntervalDataSource, "videoIntervalDataSource");
        return new p8(new hg(this, 2), audioRecorder, mediaFilesManager, mediaTrimmer, videoIntervalDataSource);
    }

    @NotNull
    public final hf provideVisionSelfieAnalyticsContext(@NotNull SelfieScannerConfig selfieScannerConfig, @NotNull Map<String, Boolean> sdkSensorAvailability) {
        Intrinsics.checkNotNullParameter(selfieScannerConfig, "selfieScannerConfig");
        Intrinsics.checkNotNullParameter(sdkSensorAvailability, "sdkSensorAvailability");
        return new hf("vision", selfieScannerConfig, sdkSensorAvailability);
    }

    @NotNull
    public final xf provideVisionViewModel(@NotNull Context context, @NotNull zf imageProducer, @NotNull k7 imageDataSource, @NotNull df visionInfoProvider, @NotNull ja scanner, @NotNull x cameraFocusManager, @NotNull la scannerConfig, @NotNull m7 detectorInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageProducer, "imageProducer");
        Intrinsics.checkNotNullParameter(imageDataSource, "imageDataSource");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(scanner, "scanner");
        Intrinsics.checkNotNullParameter(cameraFocusManager, "cameraFocusManager");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        Intrinsics.checkNotNullParameter(detectorInteractor, "detectorInteractor");
        return new xf(imageProducer, imageDataSource, visionInfoProvider, scanner, cameraFocusManager, scannerConfig, detectorInteractor.getFaceDetectorFast(), m0.createCameraSpecsOnReadyCallback(context, "selfie"));
    }

    public /* synthetic */ bb(Function0 function0, Function0 function02, Function0 function03, na naVar, OnVisionScannerEffect onVisionScannerEffect, Function0 function04, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, function03, naVar, (i2 & 16) != 0 ? new jg() : onVisionScannerEffect, (i2 & 32) != 0 ? a.f36017a : function04);
    }
}
