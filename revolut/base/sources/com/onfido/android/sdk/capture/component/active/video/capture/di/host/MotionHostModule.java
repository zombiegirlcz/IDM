package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import android.content.Context;
import android.content.res.Resources;
import ch.h;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.google.mlkit.vision.face.FaceDetector;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.component.active.video.capture.data.demo.MotionDemoDataSource;
import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.MotionApi;
import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.MotionRemoteDataSource;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.MotionDataSource;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.GetFaceDetectionModuleAvailabilityUseCase;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.api.client.data.SdkUploadMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oh.a;
import oh.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0012\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0003H\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/di/host/MotionHostModule;", "", "motionOptions", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "(Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;)V", "provideFaceDetectionModuleAvailabilityUseCase", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase;", "installClient", "Lcom/google/android/gms/common/moduleinstall/ModuleInstallClient;", "mlKitFaceDetector", "Lcom/google/mlkit/vision/face/FaceDetector;", "provideMLKitFaceDetector", "provideModuleInstallClient", "context", "Landroid/content/Context;", "provideMotionApi", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionApi;", "onfidoFetcher", "Lcom/onfido/api/client/OnfidoFetcher;", "provideMotionDataSource", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/repository/MotionDataSource;", "onfidoTokenProvider", "Lcom/onfido/android/sdk/capture/internal/token/OnfidoTokenProvider;", "motionDemoDataSource", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/demo/MotionDemoDataSource;", "motionRemoteDataSource", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionRemoteDataSource;", "provideMotionOptions", "provideResources", "Landroid/content/res/Resources;", "provideUploadMetadata", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "sdkUploadMetadataHelper", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionHostModule {

    @NotNull
    private final MotionCaptureVariantOptions motionOptions;

    public MotionHostModule(@NotNull MotionCaptureVariantOptions motionOptions) {
        Intrinsics.checkNotNullParameter(motionOptions, "motionOptions");
        this.motionOptions = motionOptions;
    }

    @NotNull
    public final GetFaceDetectionModuleAvailabilityUseCase provideFaceDetectionModuleAvailabilityUseCase(@NotNull ModuleInstallClient installClient, @NotNull FaceDetector mlKitFaceDetector) {
        Intrinsics.checkNotNullParameter(installClient, "installClient");
        Intrinsics.checkNotNullParameter(mlKitFaceDetector, "mlKitFaceDetector");
        return new GetFaceDetectionModuleAvailabilityUseCase(installClient, mlKitFaceDetector);
    }

    @NotNull
    public final FaceDetector provideMLKitFaceDetector() {
        d dVar = (d) h.c().a(d.class);
        dVar.getClass();
        FaceDetectorOptions faceDetectorOptions = a.f225244g;
        Preconditions.checkNotNull(faceDetectorOptions, "You must provide a valid FaceDetectorOptions.");
        a aVar = new a((oh.h) dVar.f225250a.get(faceDetectorOptions), dVar.f225251b, faceDetectorOptions);
        Intrinsics.checkNotNullExpressionValue(aVar, "getClient(...)");
        return aVar;
    }

    @NotNull
    public final ModuleInstallClient provideModuleInstallClient(@ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ModuleInstallClient client = ModuleInstall.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        return client;
    }

    @FeatureScope
    @NotNull
    public final MotionApi provideMotionApi(@NotNull OnfidoFetcher onfidoFetcher) {
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        return (MotionApi) onfidoFetcher.a(MotionApi.class);
    }

    @FeatureScope
    @NotNull
    public final MotionDataSource provideMotionDataSource(@NotNull OnfidoTokenProvider onfidoTokenProvider, @NotNull MotionDemoDataSource motionDemoDataSource, @NotNull MotionRemoteDataSource motionRemoteDataSource) {
        Intrinsics.checkNotNullParameter(onfidoTokenProvider, "onfidoTokenProvider");
        Intrinsics.checkNotNullParameter(motionDemoDataSource, "motionDemoDataSource");
        Intrinsics.checkNotNullParameter(motionRemoteDataSource, "motionRemoteDataSource");
        return (onfidoTokenProvider.provideToken().isDemoToken() || this.motionOptions.isTestEnv()) ? motionDemoDataSource : motionRemoteDataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: provideMotionOptions, reason: from getter */
    public final MotionCaptureVariantOptions getMotionOptions() {
        return this.motionOptions;
    }

    @NotNull
    public final Resources provideResources(@ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    @NotNull
    public final SdkUploadMetaData provideUploadMetadata(@NotNull SdkUploadMetadataHelper sdkUploadMetadataHelper) {
        Intrinsics.checkNotNullParameter(sdkUploadMetadataHelper, "sdkUploadMetadataHelper");
        return sdkUploadMetadataHelper.create();
    }
}
