package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.google.common.util.concurrent.ListenableFuture;
import com.onfido.android.sdk.capture.common.di.FragmentScope;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2Wrapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapperFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.IsPersistentSurfaceSupportedUseCase;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.IsPersistentSurfaceSupportedUseCaseImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.LocalPersistentRecorderSurfaceRepository;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.PersistentRecorderSurfaceRepository;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.Detection;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.OvalRect;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModelImpl;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mh.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/di/capture/MotionCaptureModule;", "", "provideCamera2Wrapper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2Wrapper;", "camera2WrapperImpl", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/Camera2WrapperImpl;", "provideHeadTurnGuidanceViewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;", "headTurnGuidanceViewModelImpl", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModelImpl;", "provideIsPersistentSurfaceSupportedUseCase", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/IsPersistentSurfaceSupportedUseCase;", "isPersistentSurfaceSupportedUseCaseImpl", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/IsPersistentSurfaceSupportedUseCaseImpl;", "providePersistentRecorderSurfaceRepository", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/PersistentRecorderSurfaceRepository;", "localPersistentRecorderSurfaceRepository", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/persistentsurface/LocalPersistentRecorderSurfaceRepository;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MotionCaptureModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/di/capture/MotionCaptureModule$Companion;", "", "<init>", "()V", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "motionOptions", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapperTestImpl;", "testImpl", "Lcom/onfido/javax/inject/Provider;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcTfliteResultMapper;", "tFLiteResultMapperProvider", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/tfmodel/Detection;", "provideTFLiteResultMapper", "(Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapperTestImpl;Lcom/onfido/javax/inject/Provider;)Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcMLKitResultMapper;", "mLKitResultMapperProvider", "Lmh/a;", "provideMLKitResultMapper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapperFactory;", "recorderWrapperFactory", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapper;", "provideRecorderWrapper", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapperFactory;)Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapper;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/util/OvalRect;", "provideOvalRect", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/util/OvalRect;", "Landroid/content/Context;", "applicationContext", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "provideCameraProvider", "(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "provideMotionVideoSettings", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture$MotionVideoSettings;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ListenableFuture<ProcessCameraProvider> provideCameraProvider(@ApplicationContext @NotNull Context applicationContext) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            return ProcessCameraProvider.INSTANCE.getInstance(applicationContext);
        }

        @FragmentScope
        @NotNull
        public final FaceDetectorAvcResultMapper<a> provideMLKitResultMapper(@NotNull MotionCaptureVariantOptions motionOptions, @NotNull FaceDetectorAvcResultMapperTestImpl<Object> testImpl, @NotNull Provider mLKitResultMapperProvider) {
            Intrinsics.checkNotNullParameter(motionOptions, "motionOptions");
            Intrinsics.checkNotNullParameter(testImpl, "testImpl");
            Intrinsics.checkNotNullParameter(mLKitResultMapperProvider, "mLKitResultMapperProvider");
            if (motionOptions.isTestEnv()) {
                return testImpl;
            }
            Object obj2 = mLKitResultMapperProvider.get();
            Intrinsics.h(obj2);
            return (FaceDetectorAvcResultMapper) obj2;
        }

        @NotNull
        public final SdkConfiguration.MotionCapture.MotionVideoSettings provideMotionVideoSettings(@NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
            Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
            return onfidoRemoteConfig.getMotionCapture().getVideoSettings();
        }

        @FragmentScope
        @NotNull
        public final OvalRect provideOvalRect() {
            return OvalRect.INSTANCE;
        }

        @FragmentScope
        @NotNull
        public final RecorderWrapper provideRecorderWrapper(@NotNull RecorderWrapperFactory recorderWrapperFactory) {
            Intrinsics.checkNotNullParameter(recorderWrapperFactory, "recorderWrapperFactory");
            return recorderWrapperFactory.create();
        }

        @FragmentScope
        @NotNull
        public final FaceDetectorAvcResultMapper<Detection> provideTFLiteResultMapper(@NotNull MotionCaptureVariantOptions motionOptions, @NotNull FaceDetectorAvcResultMapperTestImpl<Object> testImpl, @NotNull Provider tFLiteResultMapperProvider) {
            Intrinsics.checkNotNullParameter(motionOptions, "motionOptions");
            Intrinsics.checkNotNullParameter(testImpl, "testImpl");
            Intrinsics.checkNotNullParameter(tFLiteResultMapperProvider, "tFLiteResultMapperProvider");
            if (motionOptions.isTestEnv()) {
                return testImpl;
            }
            Object obj2 = tFLiteResultMapperProvider.get();
            Intrinsics.h(obj2);
            return (FaceDetectorAvcResultMapper) obj2;
        }
    }

    @FragmentScope
    @NotNull
    Camera2Wrapper provideCamera2Wrapper(@NotNull Camera2WrapperImpl camera2WrapperImpl);

    @FragmentScope
    @NotNull
    HeadTurnGuidanceViewModel provideHeadTurnGuidanceViewModel(@NotNull HeadTurnGuidanceViewModelImpl headTurnGuidanceViewModelImpl);

    @FragmentScope
    @NotNull
    IsPersistentSurfaceSupportedUseCase provideIsPersistentSurfaceSupportedUseCase(@NotNull IsPersistentSurfaceSupportedUseCaseImpl isPersistentSurfaceSupportedUseCaseImpl);

    @FragmentScope
    @NotNull
    PersistentRecorderSurfaceRepository providePersistentRecorderSurfaceRepository(@NotNull LocalPersistentRecorderSurfaceRepository localPersistentRecorderSurfaceRepository);
}
