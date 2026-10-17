package com.onfido.android.sdk.capture.component.active.video.capture.di.capture;

import android.content.Context;
import com.onfido.android.sdk.capture.common.result.HapticFeedback;
import com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.C1968MotionCameraXController_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraControllerFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraXController_Factory_Impl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.C1973MotionCamera2Controller_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.Camera2WrapperImpl_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.MotionCamera2Controller_Factory_Impl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapperFactory_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.IsPersistentSurfaceSupportedUseCaseImpl_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.persistentsurface.LocalPersistentRecorderSurfaceRepository_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.ApiLevelUtil_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.SurfaceSizeProvider_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcMLKitResultMapper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcMLKit_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcTfliteResultMapper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcTflite_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.MotionFaceDetectorFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel.BlazeFaceModel_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.CoordinatesTransformer_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.util.YawAngleCalculator_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment_MembersInjector;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.preview.PreviewBitmapHelper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.C1999MotionCaptureViewModelImpl_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl_Factory_Impl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModelImpl_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentFeedbackAccessibilityMapper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentFeedbackMapper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.mapper.ToFaceAlignmentMapper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AudioFocusHelper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AvcTimer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AvcTimer_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.FaceAlignmentChecks_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.MicAvailabilityHelper_Factory;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.camera.camerax.C2013CameraX_Factory;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraXImageAnalysisUseCase_Factory;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraXTakePictureUseCase_Factory;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraXTakeVideoUseCase_Factory;
import com.onfido.android.sdk.capture.internal.camera.camerax.CameraX_Factory_Impl;
import com.onfido.android.sdk.capture.internal.camera.camerax.FrameSampler;
import com.onfido.android.sdk.capture.internal.camera.camerax.ImageAnalyzer;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService_Factory;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.android.sdk.capture.utils.DeviceUtils_Factory;
import com.onfido.android.sdk.capture.utils.RawResourceReader_Factory;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;
import el.a;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class DaggerMotionCaptureComponent {

    public static final class Builder {
        private MotionFrameSamplerModule motionFrameSamplerModule;
        private MotionHostComponent motionHostComponent;

        private Builder() {
        }

        public MotionCaptureComponent build() {
            if (this.motionFrameSamplerModule == null) {
                this.motionFrameSamplerModule = new MotionFrameSamplerModule();
            }
            e.e(this.motionHostComponent, MotionHostComponent.class);
            return new MotionCaptureComponentImpl(this.motionFrameSamplerModule, this.motionHostComponent, 0);
        }

        public Builder motionFrameSamplerModule(MotionFrameSamplerModule motionFrameSamplerModule) {
            motionFrameSamplerModule.getClass();
            this.motionFrameSamplerModule = motionFrameSamplerModule;
            return this;
        }

        public Builder motionHostComponent(MotionHostComponent motionHostComponent) {
            motionHostComponent.getClass();
            this.motionHostComponent = motionHostComponent;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public static final class MotionCaptureComponentImpl implements MotionCaptureComponent {
        private Provider announcementServiceProvider;
        private Provider applicationContextProvider;
        private Provider audioFocusHelperProvider;
        private Provider avcTimerProvider;
        private Provider blazeFaceModelProvider;
        private Provider camera2WrapperImplProvider;
        private Provider cameraXImageAnalysisUseCaseProvider;
        private C2013CameraX_Factory cameraXProvider;
        private Provider cameraXTakePictureUseCaseProvider;
        private Provider cameraXTakeVideoUseCaseProvider;
        private Provider dispatchersProvider;
        private Provider faceDetectorAvcMLKitProvider;
        private Provider faceDetectorAvcMLKitResultMapperProvider;
        private Provider faceDetectorAvcResultMapperTestImplProvider;
        private Provider faceDetectorAvcTfliteProvider;
        private Provider faceDetectorAvcTfliteResultMapperProvider;
        private Provider factoryProvider;
        private Provider factoryProvider2;
        private Provider factoryProvider3;
        private Provider factoryProvider4;
        private Provider headTurnGuidanceViewModelImplProvider;
        private Provider isPersistentSurfaceSupportedUseCaseImplProvider;
        private Provider localPersistentRecorderSurfaceRepositoryProvider;
        private Provider micAvailabilityHelperProvider;
        private C1973MotionCamera2Controller_Factory motionCamera2ControllerProvider;
        private C1968MotionCameraXController_Factory motionCameraXControllerProvider;
        private final MotionCaptureComponentImpl motionCaptureComponentImpl;
        private C1999MotionCaptureViewModelImpl_Factory motionCaptureViewModelImplProvider;
        private final MotionHostComponent motionHostComponent;
        private Provider motionOptionsProvider;
        private Provider onfidoAnalyticsProvider;
        private Provider onfidoRemoteConfigProvider;
        private Provider provideCamera2WrapperProvider;
        private Provider provideCameraProvider;
        private Provider provideHeadTurnGuidanceViewModelProvider;
        private Provider provideIsPersistentSurfaceSupportedUseCaseProvider;
        private Provider provideMLKitResultMapperProvider;
        private Provider provideMotionVideoSettingsProvider;
        private Provider providePersistentRecorderSurfaceRepositoryProvider;
        private Provider provideRecorderWrapperProvider;
        private Provider provideTFLiteResultMapperProvider;
        private Provider provideTimeProvider;
        private Provider providesMotionFrameSamplerProvider;
        private Provider providesMotionImageAnalyzerProvider;
        private Provider rawResourceReaderProvider;
        private Provider recorderWrapperFactoryProvider;
        private Provider schedulersProvider;
        private Provider toFaceAlignmentMapperProvider;

        public static final class ApplicationContextProvider implements Provider {
            private final MotionHostComponent motionHostComponent;

            public ApplicationContextProvider(MotionHostComponent motionHostComponent) {
                this.motionHostComponent = motionHostComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public Context get() {
                Context contextApplicationContext = this.motionHostComponent.applicationContext();
                e.f(contextApplicationContext);
                return contextApplicationContext;
            }
        }

        public static final class DispatchersProviderProvider implements Provider {
            private final MotionHostComponent motionHostComponent;

            public DispatchersProviderProvider(MotionHostComponent motionHostComponent) {
                this.motionHostComponent = motionHostComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public DispatchersProvider get() {
                DispatchersProvider dispatchersProvider = this.motionHostComponent.dispatchersProvider();
                e.f(dispatchersProvider);
                return dispatchersProvider;
            }
        }

        public static final class MotionOptionsProvider implements Provider {
            private final MotionHostComponent motionHostComponent;

            public MotionOptionsProvider(MotionHostComponent motionHostComponent) {
                this.motionHostComponent = motionHostComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public MotionCaptureVariantOptions get() {
                MotionCaptureVariantOptions motionCaptureVariantOptionsMotionOptions = this.motionHostComponent.motionOptions();
                e.f(motionCaptureVariantOptionsMotionOptions);
                return motionCaptureVariantOptionsMotionOptions;
            }
        }

        public static final class OnfidoAnalyticsProvider implements Provider {
            private final MotionHostComponent motionHostComponent;

            public OnfidoAnalyticsProvider(MotionHostComponent motionHostComponent) {
                this.motionHostComponent = motionHostComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public OnfidoAnalytics get() {
                OnfidoAnalytics onfidoAnalytics = this.motionHostComponent.onfidoAnalytics();
                e.f(onfidoAnalytics);
                return onfidoAnalytics;
            }
        }

        public static final class OnfidoRemoteConfigProvider implements Provider {
            private final MotionHostComponent motionHostComponent;

            public OnfidoRemoteConfigProvider(MotionHostComponent motionHostComponent) {
                this.motionHostComponent = motionHostComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public OnfidoRemoteConfig get() {
                OnfidoRemoteConfig onfidoRemoteConfig = this.motionHostComponent.onfidoRemoteConfig();
                e.f(onfidoRemoteConfig);
                return onfidoRemoteConfig;
            }
        }

        public static final class ProvideTimeProviderProvider implements Provider {
            private final MotionHostComponent motionHostComponent;

            public ProvideTimeProviderProvider(MotionHostComponent motionHostComponent) {
                this.motionHostComponent = motionHostComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public TimeProvider get() {
                TimeProvider timeProviderProvideTimeProvider = this.motionHostComponent.provideTimeProvider();
                e.f(timeProviderProvideTimeProvider);
                return timeProviderProvideTimeProvider;
            }
        }

        public static final class SchedulersProviderProvider implements Provider {
            private final MotionHostComponent motionHostComponent;

            public SchedulersProviderProvider(MotionHostComponent motionHostComponent) {
                this.motionHostComponent = motionHostComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public SchedulersProvider get() {
                SchedulersProvider schedulersProvider = this.motionHostComponent.schedulersProvider();
                e.f(schedulersProvider);
                return schedulersProvider;
            }
        }

        private MotionCaptureComponentImpl(MotionFrameSamplerModule motionFrameSamplerModule, MotionHostComponent motionHostComponent) {
            this.motionCaptureComponentImpl = this;
            this.motionHostComponent = motionHostComponent;
            initialize(motionFrameSamplerModule, motionHostComponent);
        }

        private AnnouncementService announcementService() {
            Context contextApplicationContext = this.motionHostComponent.applicationContext();
            e.f(contextApplicationContext);
            return new AnnouncementService(contextApplicationContext);
        }

        private AvcTimer avcTimer() {
            SchedulersProvider schedulersProvider = this.motionHostComponent.schedulersProvider();
            e.f(schedulersProvider);
            return new AvcTimer(schedulersProvider);
        }

        private void initialize(MotionFrameSamplerModule motionFrameSamplerModule, MotionHostComponent motionHostComponent) {
            ApplicationContextProvider applicationContextProvider = new ApplicationContextProvider(motionHostComponent);
            this.applicationContextProvider = applicationContextProvider;
            this.cameraXTakeVideoUseCaseProvider = CameraXTakeVideoUseCase_Factory.create(applicationContextProvider);
            this.cameraXTakePictureUseCaseProvider = CameraXTakePictureUseCase_Factory.create(this.applicationContextProvider);
            ProvideTimeProviderProvider provideTimeProviderProvider = new ProvideTimeProviderProvider(motionHostComponent);
            this.provideTimeProvider = provideTimeProviderProvider;
            this.cameraXImageAnalysisUseCaseProvider = CameraXImageAnalysisUseCase_Factory.create(provideTimeProviderProvider);
            this.dispatchersProvider = new DispatchersProviderProvider(motionHostComponent);
            this.provideCameraProvider = MotionCaptureModule_Companion_ProvideCameraProviderFactory.create(this.applicationContextProvider);
            OnfidoRemoteConfigProvider onfidoRemoteConfigProvider = new OnfidoRemoteConfigProvider(motionHostComponent);
            this.onfidoRemoteConfigProvider = onfidoRemoteConfigProvider;
            C2013CameraX_Factory c2013CameraX_FactoryCreate = C2013CameraX_Factory.create(this.applicationContextProvider, this.cameraXTakeVideoUseCaseProvider, this.cameraXTakePictureUseCaseProvider, this.cameraXImageAnalysisUseCaseProvider, this.dispatchersProvider, this.provideCameraProvider, onfidoRemoteConfigProvider);
            this.cameraXProvider = c2013CameraX_FactoryCreate;
            this.factoryProvider = CameraX_Factory_Impl.create(c2013CameraX_FactoryCreate);
            this.schedulersProvider = new SchedulersProviderProvider(motionHostComponent);
            this.providesMotionFrameSamplerProvider = a.b(MotionFrameSamplerModule_ProvidesMotionFrameSamplerFactory.create(motionFrameSamplerModule, PreviewBitmapHelper_Factory.create(), this.schedulersProvider));
            this.providesMotionImageAnalyzerProvider = a.b(MotionFrameSamplerModule_ProvidesMotionImageAnalyzerFactory.create(motionFrameSamplerModule));
            C1968MotionCameraXController_Factory c1968MotionCameraXController_FactoryCreate = C1968MotionCameraXController_Factory.create();
            this.motionCameraXControllerProvider = c1968MotionCameraXController_FactoryCreate;
            this.factoryProvider2 = MotionCameraXController_Factory_Impl.create(c1968MotionCameraXController_FactoryCreate);
            this.provideMotionVideoSettingsProvider = MotionCaptureModule_Companion_ProvideMotionVideoSettingsFactory.create(this.onfidoRemoteConfigProvider);
            Camera2WrapperImpl_Factory camera2WrapperImpl_FactoryCreate = Camera2WrapperImpl_Factory.create(this.applicationContextProvider, SurfaceSizeProvider_Factory.create(), this.provideMotionVideoSettingsProvider);
            this.camera2WrapperImplProvider = camera2WrapperImpl_FactoryCreate;
            this.provideCamera2WrapperProvider = a.b(camera2WrapperImpl_FactoryCreate);
            RawResourceReader_Factory rawResourceReader_FactoryCreate = RawResourceReader_Factory.create(this.applicationContextProvider);
            this.rawResourceReaderProvider = rawResourceReader_FactoryCreate;
            LocalPersistentRecorderSurfaceRepository_Factory localPersistentRecorderSurfaceRepository_FactoryCreate = LocalPersistentRecorderSurfaceRepository_Factory.create(rawResourceReader_FactoryCreate);
            this.localPersistentRecorderSurfaceRepositoryProvider = localPersistentRecorderSurfaceRepository_FactoryCreate;
            this.providePersistentRecorderSurfaceRepositoryProvider = a.b(localPersistentRecorderSurfaceRepository_FactoryCreate);
            IsPersistentSurfaceSupportedUseCaseImpl_Factory isPersistentSurfaceSupportedUseCaseImpl_FactoryCreate = IsPersistentSurfaceSupportedUseCaseImpl_Factory.create(ApiLevelUtil_Factory.create(), DeviceUtils_Factory.create(), this.providePersistentRecorderSurfaceRepositoryProvider);
            this.isPersistentSurfaceSupportedUseCaseImplProvider = isPersistentSurfaceSupportedUseCaseImpl_FactoryCreate;
            Provider providerB = a.b(isPersistentSurfaceSupportedUseCaseImpl_FactoryCreate);
            this.provideIsPersistentSurfaceSupportedUseCaseProvider = providerB;
            RecorderWrapperFactory_Factory recorderWrapperFactory_FactoryCreate = RecorderWrapperFactory_Factory.create(this.applicationContextProvider, providerB, SurfaceSizeProvider_Factory.create());
            this.recorderWrapperFactoryProvider = recorderWrapperFactory_FactoryCreate;
            Provider providerB2 = a.b(MotionCaptureModule_Companion_ProvideRecorderWrapperFactory.create(recorderWrapperFactory_FactoryCreate));
            this.provideRecorderWrapperProvider = providerB2;
            C1973MotionCamera2Controller_Factory c1973MotionCamera2Controller_FactoryCreate = C1973MotionCamera2Controller_Factory.create(this.provideCamera2WrapperProvider, providerB2, this.provideIsPersistentSurfaceSupportedUseCaseProvider, this.providesMotionFrameSamplerProvider);
            this.motionCamera2ControllerProvider = c1973MotionCamera2Controller_FactoryCreate;
            this.factoryProvider3 = MotionCamera2Controller_Factory_Impl.create(c1973MotionCamera2Controller_FactoryCreate);
            this.onfidoAnalyticsProvider = new OnfidoAnalyticsProvider(motionHostComponent);
            this.motionOptionsProvider = new MotionOptionsProvider(motionHostComponent);
            this.faceDetectorAvcResultMapperTestImplProvider = a.b(FaceDetectorAvcResultMapperTestImpl_Factory.create());
            FaceDetectorAvcMLKitResultMapper_Factory faceDetectorAvcMLKitResultMapper_FactoryCreate = FaceDetectorAvcMLKitResultMapper_Factory.create(CoordinatesTransformer_Factory.create());
            this.faceDetectorAvcMLKitResultMapperProvider = faceDetectorAvcMLKitResultMapper_FactoryCreate;
            Provider providerB3 = a.b(MotionCaptureModule_Companion_ProvideMLKitResultMapperFactory.create(this.motionOptionsProvider, this.faceDetectorAvcResultMapperTestImplProvider, faceDetectorAvcMLKitResultMapper_FactoryCreate));
            this.provideMLKitResultMapperProvider = providerB3;
            this.faceDetectorAvcMLKitProvider = FaceDetectorAvcMLKit_Factory.create(this.onfidoAnalyticsProvider, this.schedulersProvider, providerB3);
            this.blazeFaceModelProvider = BlazeFaceModel_Factory.create(this.applicationContextProvider);
            FaceDetectorAvcTfliteResultMapper_Factory faceDetectorAvcTfliteResultMapper_FactoryCreate = FaceDetectorAvcTfliteResultMapper_Factory.create(CoordinatesTransformer_Factory.create(), YawAngleCalculator_Factory.create());
            this.faceDetectorAvcTfliteResultMapperProvider = faceDetectorAvcTfliteResultMapper_FactoryCreate;
            Provider providerB4 = a.b(MotionCaptureModule_Companion_ProvideTFLiteResultMapperFactory.create(this.motionOptionsProvider, this.faceDetectorAvcResultMapperTestImplProvider, faceDetectorAvcTfliteResultMapper_FactoryCreate));
            this.provideTFLiteResultMapperProvider = providerB4;
            this.faceDetectorAvcTfliteProvider = FaceDetectorAvcTflite_Factory.create(this.blazeFaceModelProvider, this.schedulersProvider, providerB4);
            HeadTurnGuidanceViewModelImpl_Factory headTurnGuidanceViewModelImpl_FactoryCreate = HeadTurnGuidanceViewModelImpl_Factory.create(this.onfidoAnalyticsProvider, this.schedulersProvider);
            this.headTurnGuidanceViewModelImplProvider = headTurnGuidanceViewModelImpl_FactoryCreate;
            this.provideHeadTurnGuidanceViewModelProvider = a.b(headTurnGuidanceViewModelImpl_FactoryCreate);
            this.avcTimerProvider = AvcTimer_Factory.create(this.schedulersProvider);
            this.toFaceAlignmentMapperProvider = ToFaceAlignmentMapper_Factory.create(FaceAlignmentChecks_Factory.create());
            this.announcementServiceProvider = AnnouncementService_Factory.create(this.applicationContextProvider);
            this.micAvailabilityHelperProvider = MicAvailabilityHelper_Factory.create(this.applicationContextProvider);
            this.audioFocusHelperProvider = AudioFocusHelper_Factory.create(this.applicationContextProvider);
            C1999MotionCaptureViewModelImpl_Factory c1999MotionCaptureViewModelImpl_FactoryCreate = C1999MotionCaptureViewModelImpl_Factory.create(this.avcTimerProvider, this.provideHeadTurnGuidanceViewModelProvider, this.toFaceAlignmentMapperProvider, ToFaceAlignmentFeedbackMapper_Factory.create(), ToFaceAlignmentFeedbackAccessibilityMapper_Factory.create(), this.announcementServiceProvider, this.onfidoAnalyticsProvider, this.schedulersProvider, this.micAvailabilityHelperProvider, this.audioFocusHelperProvider);
            this.motionCaptureViewModelImplProvider = c1999MotionCaptureViewModelImpl_FactoryCreate;
            this.factoryProvider4 = MotionCaptureViewModelImpl_Factory_Impl.create(c1999MotionCaptureViewModelImpl_FactoryCreate);
        }

        private MotionCaptureFragment injectMotionCaptureFragment(MotionCaptureFragment motionCaptureFragment) {
            MotionCaptureVariantOptions motionCaptureVariantOptionsMotionOptions = this.motionHostComponent.motionOptions();
            e.f(motionCaptureVariantOptionsMotionOptions);
            MotionCaptureFragment_MembersInjector.injectMotionOptions(motionCaptureFragment, motionCaptureVariantOptionsMotionOptions);
            MotionCaptureFragment_MembersInjector.injectCameraControllerFactory(motionCaptureFragment, motionCameraControllerFactory());
            MotionCaptureFragment_MembersInjector.injectMotionFaceDetectorFactory(motionCaptureFragment, motionFaceDetectorFactory());
            MotionCaptureFragment_MembersInjector.injectHeadTurnGuidanceViewModel(motionCaptureFragment, (HeadTurnGuidanceViewModel) this.provideHeadTurnGuidanceViewModelProvider.get());
            SchedulersProvider schedulersProvider = this.motionHostComponent.schedulersProvider();
            e.f(schedulersProvider);
            MotionCaptureFragment_MembersInjector.injectSchedulersProvider(motionCaptureFragment, schedulersProvider);
            OnfidoAnalytics onfidoAnalytics = this.motionHostComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            MotionCaptureFragment_MembersInjector.injectAnalytics(motionCaptureFragment, onfidoAnalytics);
            MotionCaptureFragment_MembersInjector.injectHapticFeedback(motionCaptureFragment, new HapticFeedback());
            MotionCaptureFragment_MembersInjector.injectDelayStartRecordingTimer(motionCaptureFragment, avcTimer());
            MotionCaptureFragment_MembersInjector.injectDelayTimer(motionCaptureFragment, avcTimer());
            MotionCaptureFragment_MembersInjector.injectAnnouncementService(motionCaptureFragment, announcementService());
            MotionCaptureFragment_MembersInjector.injectViewModelFactory(motionCaptureFragment, (MotionCaptureViewModelImpl.Factory) this.factoryProvider4.get());
            MotionCaptureFragment_MembersInjector.injectFaceDetectorAvcResultMapperTestImpl(motionCaptureFragment, (FaceDetectorAvcResultMapperTestImpl) this.faceDetectorAvcResultMapperTestImplProvider.get());
            return motionCaptureFragment;
        }

        private MotionCameraControllerFactory motionCameraControllerFactory() {
            CameraX.Factory factory = (CameraX.Factory) this.factoryProvider.get();
            FrameSampler frameSampler = (FrameSampler) this.providesMotionFrameSamplerProvider.get();
            ImageAnalyzer imageAnalyzer = (ImageAnalyzer) this.providesMotionImageAnalyzerProvider.get();
            MotionCameraXController.Factory factory2 = (MotionCameraXController.Factory) this.factoryProvider2.get();
            MotionCamera2Controller.Factory factory3 = (MotionCamera2Controller.Factory) this.factoryProvider3.get();
            OnfidoAnalytics onfidoAnalytics = this.motionHostComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            return new MotionCameraControllerFactory(factory, frameSampler, imageAnalyzer, factory2, factory3, onfidoAnalytics);
        }

        private MotionFaceDetectorFactory motionFaceDetectorFactory() {
            OnfidoAnalytics onfidoAnalytics = this.motionHostComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            return new MotionFaceDetectorFactory(onfidoAnalytics, this.faceDetectorAvcMLKitProvider, this.faceDetectorAvcTfliteProvider);
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.capture.MotionCaptureComponent
        public void inject(MotionCaptureFragment motionCaptureFragment) {
            injectMotionCaptureFragment(motionCaptureFragment);
        }

        public /* synthetic */ MotionCaptureComponentImpl(MotionFrameSamplerModule motionFrameSamplerModule, MotionHostComponent motionHostComponent, int i) {
            this(motionFrameSamplerModule, motionHostComponent);
        }
    }

    private DaggerMotionCaptureComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
