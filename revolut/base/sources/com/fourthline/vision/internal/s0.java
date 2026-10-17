package com.fourthline.vision.internal;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.renderscript.RenderScript;
import androidx.view.result.ActivityResultRegistry;
import androidx.view.result.ActivityResultRegistryOwner;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.TimestampProviderInternal;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.internal.devicedata.SdkSensorAvailability;
import com.fourthline.vision.internal.VisionDocumentScannerFeatureConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f36856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final la f36857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ge f36858c;
    private final CoroutineContext d;
    private final VisionDocumentScannerFeatureConfig e;
    private final Context f;

    public s0(@NotNull Context activityContext, @NotNull la scannerConfig, @NotNull ge videoConfig, @NotNull CoroutineContext coroutineContext, @NotNull VisionDocumentScannerFeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        Intrinsics.checkNotNullParameter(videoConfig, "videoConfig");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(featureConfig, "featureConfig");
        this.f36856a = activityContext;
        this.f36857b = scannerConfig;
        this.f36858c = videoConfig;
        this.d = coroutineContext;
        this.e = featureConfig;
        Context applicationContext = activityContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f = applicationContext;
    }

    @NotNull
    public final ActivityResultRegistry provideActivityResultRegistry() {
        Object obj2 = this.f36856a;
        if ((obj2 instanceof ActivityResultRegistryOwner ? (ActivityResultRegistryOwner) obj2 : null) != null) {
            return ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
        }
        throw new IllegalStateException("Can't retrieve activityResultRegistry. Context's holder (Activity, Fragment etc) should implement ActivityResultRegistryOwner");
    }

    @NotNull
    public final f provideAudioRecorder() {
        return new g();
    }

    @NotNull
    public final p provideBitrateCalculator() {
        return new p(this.f36858c.getTargetBitRate());
    }

    @NotNull
    public final Context provideContext() {
        return this.f;
    }

    @NotNull
    public final CoroutineContext provideCoroutineContext() {
        return this.d;
    }

    @NotNull
    public final Handler provideHandler(@NotNull HandlerThread handlerThread) {
        Intrinsics.checkNotNullParameter(handlerThread, "handlerThread");
        if (!handlerThread.isAlive()) {
            handlerThread.start();
        }
        return new Handler(handlerThread.getLooper());
    }

    @NotNull
    public final HandlerThread provideHandlerThread() {
        return new HandlerThread("camera2 background thread");
    }

    @NotNull
    public final i7 provideImageConverter(@NotNull RenderScript renderScript, @NotNull df visionInfoProvider) {
        Intrinsics.checkNotNullParameter(renderScript, "renderScript");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        return new ia(renderScript, visionInfoProvider.getOrientationHint());
    }

    @NotNull
    public final j7 provideImageCropper() {
        return new n();
    }

    @NotNull
    public final q7 provideImageToScannerImageInteractor(@NotNull i7 imageConverter, @NotNull j7 imageCropper, @NotNull df visionInfoProvider) {
        Intrinsics.checkNotNullParameter(imageConverter, "imageConverter");
        Intrinsics.checkNotNullParameter(imageCropper, "imageCropper");
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        return new n7(imageConverter, imageCropper, visionInfoProvider.getImageReaderSize());
    }

    @NotNull
    public final e8 provideMLKitConverter(@NotNull df visionInfoProvider) {
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        return new w6(visionInfoProvider.getOrientationHint());
    }

    @NotNull
    public final i8 provideMediaCodecProvider(@NotNull df visionInfoProvider, @NotNull j8 sizeCalculator, @NotNull p bitrateCalculator) {
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(sizeCalculator, "sizeCalculator");
        Intrinsics.checkNotNullParameter(bitrateCalculator, "bitrateCalculator");
        return new i8(visionInfoProvider, sizeCalculator, bitrateCalculator, this.f36858c.getCodec());
    }

    @NotNull
    public final j8 provideMediaCodecSizeCalculator() {
        return new j8();
    }

    @NotNull
    public final MotionDataCollector provideMotionDataCollector(@NotNull CoroutineContext coroutineContext, @NotNull la scannerConfig) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        return new MotionDataCollector(new AndroidDataCollectorHelper(this.f36856a, null, null, null, null, null, null, null, null, null, skm.e0.c(coroutineContext), 1022, null), new ArrayList(), new LinkedHashMap(), scannerConfig.getShouldCollectMotionData(), 100L, null, 32, null);
    }

    public final RenderScript provideRenderScript() {
        return RenderScript.create(this.f36856a);
    }

    @NotNull
    public final la provideScannerConfig() {
        return this.f36857b;
    }

    @NotNull
    public final q7 provideScannerImageToStepResultInteractor(@NotNull q7 scannerImageCreator) {
        Intrinsics.checkNotNullParameter(scannerImageCreator, "scannerImageCreator");
        return new ta(scannerImageCreator);
    }

    @NotNull
    public final Map<String, Boolean> provideSdkSensorAvailability(@NotNull SensorManager sensorManager) {
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        return SdkSensorAvailability.INSTANCE.getAvailabilityMap(sensorManager);
    }

    @NotNull
    public final SensorManager provideSensorManager() {
        Object systemService = this.f36856a.getSystemService("sensor");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return (SensorManager) systemService;
    }

    @NotNull
    public final TimestampProvider provideTimestampProvider() {
        return new TimestampProviderInternal();
    }

    @NotNull
    public final ae provideTriggerPreconditionConsumer(@NotNull be triggerRepository) {
        Intrinsics.checkNotNullParameter(triggerRepository, "triggerRepository");
        return new ae(triggerRepository);
    }

    @NotNull
    public final m8 provideVideoFilesManager() {
        return new n8(new File(ContextExtensionsKt.getFourthlineDirectory(this.f36856a)));
    }

    @NotNull
    public final q8 provideVideoTrimmer() {
        return new r8();
    }

    @NotNull
    public final VisionDocumentScannerFeatureConfig providesFeatureConfig$fourthline_vision_release() {
        return this.e;
    }

    @NotNull
    public final z7 providesLegacyPreviewCalculator(@NotNull df visionInfoProvider) {
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        return new z7(visionInfoProvider);
    }

    @NotNull
    public final v9 providesPlayServicesAvailabilityDataSource() {
        Context applicationContext = this.f36856a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new v9(applicationContext);
    }

    @NotNull
    public final x9 providesPreviewCalculator(@NotNull df visionInfoProvider) {
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        return new x9(visionInfoProvider);
    }

    public s0(Context context, la laVar, ge geVar, CoroutineContext coroutineContext, VisionDocumentScannerFeatureConfig visionDocumentScannerFeatureConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, laVar, (i & 4) != 0 ? new ge(null, fe.f36205b) : geVar, (i & 8) != 0 ? skm.p0.f264002b.plus(skm.e0.e()) : coroutineContext, (i & 16) != 0 ? new VisionDocumentScannerFeatureConfig(false, false, VisionDocumentScannerFeatureConfig.AutoDetectMode.DirectCapture, null, 11, null) : visionDocumentScannerFeatureConfig);
    }
}
