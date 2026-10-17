package androidx.camera.camera2.config;

import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.camera.camera2.adapter.CameraControlAdapter;
import androidx.camera.camera2.adapter.CameraControlStateAdapter;
import androidx.camera.camera2.adapter.CameraInfoAdapter;
import androidx.camera.camera2.adapter.CameraInternalAdapter;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.compat.Camera2CameraControlCompat;
import androidx.camera.camera2.compat.Camera2CameraControlCompatImpl;
import androidx.camera.camera2.compat.EvCompCompat;
import androidx.camera.camera2.compat.EvCompImpl;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.compat.ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory;
import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser;
import androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory;
import androidx.camera.camera2.compat.workaround.MeteringRegionCorrection;
import androidx.camera.camera2.compat.workaround.MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory;
import androidx.camera.camera2.compat.workaround.OutputSizesCorrector;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory;
import androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory;
import androidx.camera.camera2.config.CameraAppComponent;
import androidx.camera.camera2.config.CameraComponent;
import androidx.camera.camera2.config.UseCaseCameraComponent;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl;
import androidx.camera.camera2.impl.DisplayInfoManager;
import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.State3AControl;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseCamera;
import androidx.camera.camera2.impl.UseCaseCameraControl;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.impl.UseCaseCameraState;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseSurfaceManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.impl.VideoUsageControl;
import androidx.camera.camera2.impl.ZoomControl;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.internal.IntrinsicZoomCalculatorImpl;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.internal.StreamSpecsCalculator;
import e4m.a;
import e4m.b;
import e4m.e;
import e4m.f;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class DaggerCameraAppComponent {

    public static final class Builder implements CameraAppComponent.Builder {
        private CameraAppConfig cameraAppConfig;

        private Builder() {
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent.Builder
        public CameraAppComponent build() {
            s.h(this.cameraAppConfig, CameraAppConfig.class);
            return new CameraAppComponentImpl(this.cameraAppConfig);
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent.Builder
        public Builder config(CameraAppConfig cameraAppConfig) {
            cameraAppConfig.getClass();
            this.cameraAppConfig = cameraAppConfig;
            return this;
        }
    }

    public static final class CameraAppComponentImpl implements CameraAppComponent {
        private final CameraAppComponentImpl cameraAppComponentImpl = this;
        private final CameraAppConfig cameraAppConfig;

        public CameraAppComponentImpl(CameraAppConfig cameraAppConfig) {
            this.cameraAppConfig = cameraAppConfig;
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent
        public CameraComponent.Builder cameraBuilder() {
            return new CameraComponentBuilder(this.cameraAppComponentImpl);
        }

        public DisplayInfoManager displayInfoManager() {
            CameraAppConfig cameraAppConfig = this.cameraAppConfig;
            return CameraAppConfig_ProvideDisplayInfoManagerFactory.provideDisplayInfoManager(cameraAppConfig, CameraAppConfig_ProvideContextFactory.provideContext(cameraAppConfig));
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent
        public CameraDevices getCameraDevices() {
            return CameraAppModule_Companion_ProvideCameraDevicesFactory.provideCameraDevices(CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.cameraAppConfig));
        }

        @Override // androidx.camera.camera2.config.CameraAppComponent
        public CameraPipe getCameraPipe() {
            return CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.cameraAppConfig);
        }
    }

    public static final class CameraComponentBuilder implements CameraComponent.Builder {
        private final CameraAppComponentImpl cameraAppComponentImpl;
        private CameraConfig cameraConfig;
        private StreamSpecsCalculator streamSpecsCalculator;

        @Override // androidx.camera.camera2.config.CameraComponent.Builder
        public CameraComponent build() {
            s.h(this.cameraConfig, CameraConfig.class);
            s.h(this.streamSpecsCalculator, StreamSpecsCalculator.class);
            return new CameraComponentImpl(this.cameraAppComponentImpl, this.cameraConfig, this.streamSpecsCalculator);
        }

        @Override // androidx.camera.camera2.config.CameraComponent.Builder
        public CameraComponentBuilder config(CameraConfig cameraConfig) {
            cameraConfig.getClass();
            this.cameraConfig = cameraConfig;
            return this;
        }

        @Override // androidx.camera.camera2.config.CameraComponent.Builder
        public CameraComponentBuilder streamSpecsCalculator(StreamSpecsCalculator streamSpecsCalculator) {
            streamSpecsCalculator.getClass();
            this.streamSpecsCalculator = streamSpecsCalculator;
            return this;
        }

        private CameraComponentBuilder(CameraAppComponentImpl cameraAppComponentImpl) {
            this.cameraAppComponentImpl = cameraAppComponentImpl;
        }
    }

    public static final class CameraComponentImpl implements CameraComponent {
        e camera2CameraControlCompatImplProvider;
        private final CameraAppComponentImpl cameraAppComponentImpl;
        e cameraCallbackMapProvider;
        private final CameraComponentImpl cameraComponentImpl = this;
        private final CameraConfig cameraConfig;
        e cameraControlAdapterProvider;
        e cameraControlStateAdapterProvider;
        e cameraGraphConfigProvider;
        e cameraInfoAdapterProvider;
        e cameraInternalAdapterProvider;
        e cameraPipeCameraPropertiesProvider;
        e cameraQuirksProvider;
        e cameraStateAdapterProvider;
        e comboRequestListenerProvider;
        e evCompControlProvider;
        e evCompImplProvider;
        e flashControlProvider;
        e focusMeteringControlProvider;
        e intrinsicZoomCalculatorImplProvider;
        e lowLightBoostControlProvider;
        e outputSizesCorrectorProvider;
        e provideCamera2CameraControlProvider;
        e provideCameraIdStringProvider;
        e provideCameraMetadataProvider;
        e provideEncoderProfilesProvider;
        e provideStreamConfigurationMapProvider;
        e provideUseCaseThreadsProvider;
        e provideZslControlProvider;
        e state3AControlProvider;
        e stillCaptureRequestControlProvider;
        e streamConfigurationMapCompatProvider;
        private final StreamSpecsCalculator streamSpecsCalculator;
        e torchControlProvider;
        e useCaseManagerProvider;
        e videoUsageControlProvider;
        e zoomControlProvider;

        public static final class SwitchingProvider<T> implements e {
            private final CameraAppComponentImpl cameraAppComponentImpl;
            private final CameraComponentImpl cameraComponentImpl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private final int f6810id;

            public SwitchingProvider(CameraAppComponentImpl cameraAppComponentImpl, CameraComponentImpl cameraComponentImpl, int i) {
                this.cameraAppComponentImpl = cameraAppComponentImpl;
                this.cameraComponentImpl = cameraComponentImpl;
                this.f6810id = i;
            }

            @Override // phm.a
            public T get() {
                switch (this.f6810id) {
                    case 0:
                        return (T) new CameraInternalAdapter(CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.cameraComponentImpl.cameraConfig), (UseCaseManager) this.cameraComponentImpl.useCaseManagerProvider.get(), (CameraInfoInternal) this.cameraComponentImpl.cameraInfoAdapterProvider.get(), (CameraControlInternal) this.cameraComponentImpl.cameraControlAdapterProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), (CameraStateAdapter) this.cameraComponentImpl.cameraStateAdapterProvider.get());
                    case 1:
                        CameraPipe cameraPipeProvideCameraPipe = CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.cameraAppComponentImpl.cameraAppConfig);
                        CameraCoordinator cameraCoordinatorProvideCameraCoordinator = CameraAppConfig_ProvideCameraCoordinatorFactory.provideCameraCoordinator(this.cameraAppComponentImpl.cameraAppConfig);
                        UseCaseCameraComponentBuilder useCaseCameraComponentBuilder = new UseCaseCameraComponentBuilder(this.cameraAppComponentImpl, this.cameraComponentImpl);
                        ZslControl zslControl = (ZslControl) this.cameraComponentImpl.provideZslControlProvider.get();
                        LowLightBoostControl lowLightBoostControl = (LowLightBoostControl) this.cameraComponentImpl.lowLightBoostControlProvider.get();
                        Set<UseCaseCameraControl> ofUseCaseCameraControl = this.cameraComponentImpl.setOfUseCaseCameraControl();
                        Camera2CameraControl camera2CameraControl = (Camera2CameraControl) this.cameraComponentImpl.provideCamera2CameraControlProvider.get();
                        CameraStateAdapter cameraStateAdapter = (CameraStateAdapter) this.cameraComponentImpl.cameraStateAdapterProvider.get();
                        CameraComponentImpl cameraComponentImpl = this.cameraComponentImpl;
                        return (T) new UseCaseManager(cameraPipeProvideCameraPipe, cameraCoordinatorProvideCameraCoordinator, useCaseCameraComponentBuilder, zslControl, lowLightBoostControl, ofUseCaseCameraControl, camera2CameraControl, cameraStateAdapter, cameraComponentImpl.cameraInternalAdapterProvider, cameraComponentImpl.provideUseCaseThreadsProvider, cameraComponentImpl.cameraInfoAdapterProvider, (EncoderProfilesProvider) cameraComponentImpl.provideEncoderProfilesProvider.get(), (CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), CameraAppConfig_ProvideCameraXConfigFactory.provideCameraXConfig(this.cameraAppComponentImpl.cameraAppConfig), (CameraGraphConfigProvider) this.cameraComponentImpl.cameraGraphConfigProvider.get(), CameraAppConfig_ProvideContextFactory.provideContext(this.cameraAppComponentImpl.cameraAppConfig), this.cameraAppComponentImpl.displayInfoManager());
                    case 2:
                        return (T) CameraModule_Companion_ProvideZslControlFactory.provideZslControl((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get());
                    case 3:
                        return (T) new CameraPipeCameraProperties(CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.cameraComponentImpl.cameraConfig), (CameraMetadata) this.cameraComponentImpl.provideCameraMetadataProvider.get());
                    case 4:
                        return (T) CameraModule.INSTANCE.provideCameraMetadata(CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.cameraAppComponentImpl.cameraAppConfig), CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.cameraComponentImpl.cameraConfig));
                    case 5:
                        return (T) new LowLightBoostControl((CameraMetadata) this.cameraComponentImpl.provideCameraMetadataProvider.get(), (State3AControl) this.cameraComponentImpl.state3AControlProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), (ComboRequestListener) this.cameraComponentImpl.comboRequestListenerProvider.get());
                    case 6:
                        return (T) new State3AControl((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), this.cameraComponentImpl.autoFlashAEModeDisabler(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get());
                    case 7:
                        return (T) new CameraQuirks((CameraMetadata) this.cameraComponentImpl.provideCameraMetadataProvider.get(), (StreamConfigurationMapCompat) this.cameraComponentImpl.streamConfigurationMapCompatProvider.get());
                    case 8:
                        return (T) new StreamConfigurationMapCompat((StreamConfigurationMap) this.cameraComponentImpl.provideStreamConfigurationMapProvider.get(), (OutputSizesCorrector) this.cameraComponentImpl.outputSizesCorrectorProvider.get());
                    case 9:
                        return (T) CameraModule.INSTANCE.provideStreamConfigurationMap((CameraMetadata) this.cameraComponentImpl.provideCameraMetadataProvider.get());
                    case 10:
                        return (T) new OutputSizesCorrector((CameraMetadata) this.cameraComponentImpl.provideCameraMetadataProvider.get(), (StreamConfigurationMap) this.cameraComponentImpl.provideStreamConfigurationMapProvider.get());
                    case 11:
                        return (T) CameraModule_Companion_ProvideUseCaseThreadsFactory.provideUseCaseThreads(CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.cameraComponentImpl.cameraConfig), CameraAppConfig_ProvideCameraThreadConfigFactory.provideCameraThreadConfig(this.cameraAppComponentImpl.cameraAppConfig));
                    case 12:
                        return (T) new ComboRequestListener();
                    case 13:
                        return (T) new EvCompControl((EvCompCompat) this.cameraComponentImpl.evCompImplProvider.get());
                    case 14:
                        return (T) new EvCompImpl((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), (ComboRequestListener) this.cameraComponentImpl.comboRequestListenerProvider.get());
                    case 15:
                        return (T) new FlashControl((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (State3AControl) this.cameraComponentImpl.state3AControlProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), (TorchControl) this.cameraComponentImpl.torchControlProvider.get(), this.cameraComponentImpl.useFlashModeTorchFor3aUpdate());
                    case 16:
                        return (T) new TorchControl((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (State3AControl) this.cameraComponentImpl.state3AControlProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get());
                    case 17:
                        return (T) new FocusMeteringControl((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), this.cameraComponentImpl.meteringRegionCorrection(), (State3AControl) this.cameraComponentImpl.state3AControlProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), this.cameraComponentImpl.zoomCompat());
                    case 18:
                        return (T) new StillCaptureRequestControl((FlashControl) this.cameraComponentImpl.flashControlProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get());
                    case 19:
                        return (T) new VideoUsageControl();
                    case 20:
                        return (T) new ZoomControl(this.cameraComponentImpl.zoomCompat());
                    case 21:
                        return (T) CameraModule_Companion_ProvideCamera2CameraControlFactory.provideCamera2CameraControl((Camera2CameraControlCompat) this.cameraComponentImpl.camera2CameraControlCompatImplProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), (ComboRequestListener) this.cameraComponentImpl.comboRequestListenerProvider.get());
                    case 22:
                        return (T) new Camera2CameraControlCompatImpl();
                    case 23:
                        return (T) new CameraStateAdapter();
                    case 24:
                        return (T) new CameraInfoAdapter((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.cameraComponentImpl.cameraConfig), (CameraStateAdapter) this.cameraComponentImpl.cameraStateAdapterProvider.get(), (CameraControlStateAdapter) this.cameraComponentImpl.cameraControlStateAdapterProvider.get(), (CameraCallbackMap) this.cameraComponentImpl.cameraCallbackMapProvider.get(), (FocusMeteringControl) this.cameraComponentImpl.focusMeteringControlProvider.get(), (CameraQuirks) this.cameraComponentImpl.cameraQuirksProvider.get(), (EncoderProfilesProvider) this.cameraComponentImpl.provideEncoderProfilesProvider.get(), (StreamConfigurationMapCompat) this.cameraComponentImpl.streamConfigurationMapCompatProvider.get(), (IntrinsicZoomCalculator) this.cameraComponentImpl.intrinsicZoomCalculatorImplProvider.get(), this.cameraComponentImpl.streamSpecsCalculator);
                    case 25:
                        return (T) new CameraControlStateAdapter((ZoomControl) this.cameraComponentImpl.zoomControlProvider.get(), (EvCompControl) this.cameraComponentImpl.evCompControlProvider.get(), (TorchControl) this.cameraComponentImpl.torchControlProvider.get(), (LowLightBoostControl) this.cameraComponentImpl.lowLightBoostControlProvider.get());
                    case 26:
                        return (T) new CameraCallbackMap();
                    case 27:
                        return (T) CameraModule_Companion_ProvideEncoderProfilesProviderFactory.provideEncoderProfilesProvider((String) this.cameraComponentImpl.provideCameraIdStringProvider.get(), (CameraQuirks) this.cameraComponentImpl.cameraQuirksProvider.get());
                    case 28:
                        return (T) CameraModule_Companion_ProvideCameraIdStringFactory.provideCameraIdString(CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.cameraComponentImpl.cameraConfig));
                    case 29:
                        return (T) new IntrinsicZoomCalculatorImpl(this.cameraAppComponentImpl.getCameraDevices());
                    case 30:
                        return (T) new CameraGraphConfigProvider((CameraCallbackMap) this.cameraComponentImpl.cameraCallbackMapProvider.get(), (ComboRequestListener) this.cameraComponentImpl.comboRequestListenerProvider.get(), CameraConfig_ProvideCameraConfigFactory.provideCameraConfig(this.cameraComponentImpl.cameraConfig), (CameraQuirks) this.cameraComponentImpl.cameraQuirksProvider.get(), (ZslControl) this.cameraComponentImpl.provideZslControlProvider.get(), this.cameraComponentImpl.templateParamsOverride(), (CameraMetadata) this.cameraComponentImpl.provideCameraMetadataProvider.get(), CameraAppConfig_ProvideCameraXConfigFactory.provideCameraXConfig(this.cameraAppComponentImpl.cameraAppConfig), CameraAppConfig_ProvideCamera2InteropCallbacksFactory.provideCamera2InteropCallbacks(this.cameraAppComponentImpl.cameraAppConfig));
                    case 31:
                        return (T) new CameraControlAdapter((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (EvCompControl) this.cameraComponentImpl.evCompControlProvider.get(), (FlashControl) this.cameraComponentImpl.flashControlProvider.get(), (FocusMeteringControl) this.cameraComponentImpl.focusMeteringControlProvider.get(), (StillCaptureRequestControl) this.cameraComponentImpl.stillCaptureRequestControlProvider.get(), (TorchControl) this.cameraComponentImpl.torchControlProvider.get(), (LowLightBoostControl) this.cameraComponentImpl.lowLightBoostControlProvider.get(), (ZoomControl) this.cameraComponentImpl.zoomControlProvider.get(), (ZslControl) this.cameraComponentImpl.provideZslControlProvider.get(), (Camera2CameraControl) this.cameraComponentImpl.provideCamera2CameraControlProvider.get(), (UseCaseManager) this.cameraComponentImpl.useCaseManagerProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), (VideoUsageControl) this.cameraComponentImpl.videoUsageControlProvider.get());
                    default:
                        throw new AssertionError(this.f6810id);
                }
            }
        }

        public CameraComponentImpl(CameraAppComponentImpl cameraAppComponentImpl, CameraConfig cameraConfig, StreamSpecsCalculator streamSpecsCalculator) {
            this.cameraAppComponentImpl = cameraAppComponentImpl;
            this.cameraConfig = cameraConfig;
            this.streamSpecsCalculator = streamSpecsCalculator;
            initialize(cameraConfig, streamSpecsCalculator);
            initialize2(cameraConfig, streamSpecsCalculator);
        }

        private void initialize(CameraConfig cameraConfig, StreamSpecsCalculator streamSpecsCalculator) {
            this.provideCameraMetadataProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 4));
            this.cameraPipeCameraPropertiesProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 3));
            this.provideZslControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 2));
            this.provideStreamConfigurationMapProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 9));
            this.outputSizesCorrectorProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 10));
            this.streamConfigurationMapCompatProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 8));
            this.cameraQuirksProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 7));
            this.provideUseCaseThreadsProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 11));
            this.state3AControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 6));
            this.comboRequestListenerProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 12));
            this.lowLightBoostControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 5));
            this.evCompImplProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 14));
            this.evCompControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 13));
            this.torchControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 16));
            this.flashControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 15));
            this.focusMeteringControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 17));
            this.stillCaptureRequestControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 18));
            this.videoUsageControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 19));
            this.zoomControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 20));
            this.camera2CameraControlCompatImplProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 22));
            this.provideCamera2CameraControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 21));
            this.cameraStateAdapterProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 23));
            this.cameraInternalAdapterProvider = new a();
            this.cameraControlStateAdapterProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 25));
            this.cameraCallbackMapProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 26));
        }

        private void initialize2(CameraConfig cameraConfig, StreamSpecsCalculator streamSpecsCalculator) {
            this.provideCameraIdStringProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 28));
            this.provideEncoderProfilesProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 27));
            this.intrinsicZoomCalculatorImplProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 29));
            this.cameraInfoAdapterProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 24));
            this.cameraGraphConfigProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 30));
            this.useCaseManagerProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 1));
            this.cameraControlAdapterProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 31));
            a.a(this.cameraInternalAdapterProvider, b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, 0)));
        }

        public AutoFlashAEModeDisabler autoFlashAEModeDisabler() {
            return AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory.provideAEModeDisabler((CameraQuirks) this.cameraQuirksProvider.get());
        }

        @Override // androidx.camera.camera2.config.CameraComponent
        public CameraInternal getCameraInternal() {
            return (CameraInternal) this.cameraInternalAdapterProvider.get();
        }

        public InactiveSurfaceCloser inactiveSurfaceCloser() {
            return InactiveSurfaceCloser_Bindings_Companion_ProvideInactiveSurfaceCloserFactory.provideInactiveSurfaceCloser((CameraQuirks) this.cameraQuirksProvider.get());
        }

        public MeteringRegionCorrection meteringRegionCorrection() {
            return MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory.provideMeteringRegionCorrection((CameraQuirks) this.cameraQuirksProvider.get());
        }

        public Set<UseCaseCameraControl> setOfUseCaseCameraControl() {
            return setOfUseCaseCameraControlBuilder();
        }

        public Set setOfUseCaseCameraControlBuilder() {
            f fVar = new f(9);
            fVar.a(this.evCompControlProvider.get());
            fVar.a(this.flashControlProvider.get());
            fVar.a(this.focusMeteringControlProvider.get());
            fVar.a(this.state3AControlProvider.get());
            fVar.a(this.stillCaptureRequestControlProvider.get());
            fVar.a(this.torchControlProvider.get());
            fVar.a(this.lowLightBoostControlProvider.get());
            fVar.a(this.videoUsageControlProvider.get());
            fVar.a(this.zoomControlProvider.get());
            return fVar.c();
        }

        public TemplateParamsOverride templateParamsOverride() {
            return TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory.provideTemplateParamsOverride((CameraQuirks) this.cameraQuirksProvider.get());
        }

        public UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate() {
            return UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory.provideUseFlashModeTorchFor3aUpdate((CameraQuirks) this.cameraQuirksProvider.get());
        }

        public UseTorchAsFlash useTorchAsFlash() {
            return UseTorchAsFlash_Bindings_Companion_ProvideUseTorchAsFlashFactory.provideUseTorchAsFlash((CameraQuirks) this.cameraQuirksProvider.get(), this.cameraAppComponentImpl.getCameraDevices(), (IntrinsicZoomCalculator) this.intrinsicZoomCalculatorImplProvider.get());
        }

        public ZoomCompat zoomCompat() {
            return ZoomCompat_Bindings_Companion_ProvideZoomCompatFactory.provideZoomCompat((CameraProperties) this.cameraPipeCameraPropertiesProvider.get());
        }
    }

    public static final class UseCaseCameraComponentBuilder implements UseCaseCameraComponent.Builder {
        private final CameraAppComponentImpl cameraAppComponentImpl;
        private final CameraComponentImpl cameraComponentImpl;
        private UseCaseCameraConfig useCaseCameraConfig;

        @Override // androidx.camera.camera2.config.UseCaseCameraComponent.Builder
        public UseCaseCameraComponent build() {
            s.h(this.useCaseCameraConfig, UseCaseCameraConfig.class);
            return new UseCaseCameraComponentImpl(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraConfig);
        }

        @Override // androidx.camera.camera2.config.UseCaseCameraComponent.Builder
        public UseCaseCameraComponentBuilder config(UseCaseCameraConfig useCaseCameraConfig) {
            useCaseCameraConfig.getClass();
            this.useCaseCameraConfig = useCaseCameraConfig;
            return this;
        }

        private UseCaseCameraComponentBuilder(CameraAppComponentImpl cameraAppComponentImpl, CameraComponentImpl cameraComponentImpl) {
            this.cameraAppComponentImpl = cameraAppComponentImpl;
            this.cameraComponentImpl = cameraComponentImpl;
        }
    }

    public static final class UseCaseCameraComponentImpl implements UseCaseCameraComponent {
        private final CameraAppComponentImpl cameraAppComponentImpl;
        private final CameraComponentImpl cameraComponentImpl;
        e captureConfigAdapterProvider;
        e capturePipelineImplProvider;
        e capturePipelineTorchCorrectionProvider;
        e deferredUseCaseCameraRequestControlProvider;
        e provideCapturePipelineProvider;
        e provideSessionConfigAdapterProvider;
        e provideSessionProcessorProvider;
        e provideUseCaseGraphContextProvider;
        private final UseCaseCameraComponentImpl useCaseCameraComponentImpl = this;
        private final UseCaseCameraConfig useCaseCameraConfig;
        e useCaseCameraImplProvider;
        e useCaseCameraRequestControlImplProvider;
        e useCaseCameraStateProvider;
        e useCaseSurfaceManagerProvider;

        public static final class SwitchingProvider<T> implements e {
            private final CameraAppComponentImpl cameraAppComponentImpl;
            private final CameraComponentImpl cameraComponentImpl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private final int f6811id;
            private final UseCaseCameraComponentImpl useCaseCameraComponentImpl;

            public SwitchingProvider(CameraAppComponentImpl cameraAppComponentImpl, CameraComponentImpl cameraComponentImpl, UseCaseCameraComponentImpl useCaseCameraComponentImpl, int i) {
                this.cameraAppComponentImpl = cameraAppComponentImpl;
                this.cameraComponentImpl = cameraComponentImpl;
                this.useCaseCameraComponentImpl = useCaseCameraComponentImpl;
                this.f6811id = i;
            }

            @Override // phm.a
            public T get() {
                switch (this.f6811id) {
                    case 0:
                        UseCaseGraphContext useCaseGraphContext = (UseCaseGraphContext) this.useCaseCameraComponentImpl.provideUseCaseGraphContextProvider.get();
                        UseCaseThreads useCaseThreads = (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get();
                        if (this.useCaseCameraComponentImpl.provideSessionProcessorProvider.get() != null) {
                            throw new ClassCastException();
                        }
                        UseCaseCameraRequestControl useCaseCameraRequestControl = (UseCaseCameraRequestControl) this.useCaseCameraComponentImpl.deferredUseCaseCameraRequestControlProvider.get();
                        UseCaseCameraComponentImpl useCaseCameraComponentImpl = this.useCaseCameraComponentImpl;
                        return (T) new UseCaseCameraImpl(useCaseGraphContext, useCaseThreads, null, useCaseCameraRequestControl, useCaseCameraComponentImpl.useCaseSurfaceManagerProvider, useCaseCameraComponentImpl.provideSessionConfigAdapterProvider, useCaseCameraComponentImpl.provideCapturePipelineProvider);
                    case 1:
                        return (T) UseCaseCameraConfig_ProvideUseCaseGraphContextFactory.provideUseCaseGraphContext(this.useCaseCameraComponentImpl.useCaseCameraConfig, (CameraStateAdapter) this.cameraComponentImpl.cameraStateAdapterProvider.get());
                    case 2:
                        this.useCaseCameraComponentImpl.useCaseCameraConfig.provideSessionProcessor();
                        return null;
                    case 3:
                        return (T) new DeferredUseCaseCameraRequestControl(this.useCaseCameraComponentImpl.useCaseCameraRequestControlImplProvider, (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get());
                    case 4:
                        UseCaseCameraComponentImpl useCaseCameraComponentImpl2 = this.useCaseCameraComponentImpl;
                        return (T) new UseCaseCameraRequestControlImpl(useCaseCameraComponentImpl2.provideCapturePipelineProvider, useCaseCameraComponentImpl2.useCaseCameraStateProvider, (UseCaseGraphContext) useCaseCameraComponentImpl2.provideUseCaseGraphContextProvider.get(), this.useCaseCameraComponentImpl.useCaseSurfaceManagerProvider, (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), CameraAppConfig_ProvideCameraXConfigFactory.provideCameraXConfig(this.cameraAppComponentImpl.cameraAppConfig));
                    case 5:
                        UseCaseCameraComponentImpl useCaseCameraComponentImpl3 = this.useCaseCameraComponentImpl;
                        return (T) UseCaseCameraModule_Companion_ProvideCapturePipelineFactory.provideCapturePipeline(useCaseCameraComponentImpl3.capturePipelineImplProvider, useCaseCameraComponentImpl3.capturePipelineTorchCorrectionProvider);
                    case 6:
                        CaptureConfigAdapter captureConfigAdapter = (CaptureConfigAdapter) this.useCaseCameraComponentImpl.captureConfigAdapterProvider.get();
                        FlashControl flashControl = (FlashControl) this.cameraComponentImpl.flashControlProvider.get();
                        TorchControl torchControl = (TorchControl) this.cameraComponentImpl.torchControlProvider.get();
                        VideoUsageControl videoUsageControl = (VideoUsageControl) this.cameraComponentImpl.videoUsageControlProvider.get();
                        UseCaseThreads useCaseThreads2 = (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get();
                        ComboRequestListener comboRequestListener = (ComboRequestListener) this.cameraComponentImpl.comboRequestListenerProvider.get();
                        UseTorchAsFlash useTorchAsFlash = this.cameraComponentImpl.useTorchAsFlash();
                        CameraProperties cameraProperties = (CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get();
                        UseCaseCameraComponentImpl useCaseCameraComponentImpl4 = this.useCaseCameraComponentImpl;
                        return (T) new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads2, comboRequestListener, useTorchAsFlash, cameraProperties, useCaseCameraComponentImpl4.useCaseCameraStateProvider, (UseCaseGraphContext) useCaseCameraComponentImpl4.provideUseCaseGraphContextProvider.get());
                    case 7:
                        return (T) new CaptureConfigAdapter((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), (UseCaseGraphContext) this.useCaseCameraComponentImpl.provideUseCaseGraphContextProvider.get(), (ZslControl) this.cameraComponentImpl.provideZslControlProvider.get(), (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), this.cameraComponentImpl.templateParamsOverride());
                    case 8:
                        return (T) new UseCaseCameraState((UseCaseGraphContext) this.useCaseCameraComponentImpl.provideUseCaseGraphContextProvider.get(), this.cameraComponentImpl.templateParamsOverride());
                    case 9:
                        return (T) new CapturePipelineTorchCorrection((CameraProperties) this.cameraComponentImpl.cameraPipeCameraPropertiesProvider.get(), this.useCaseCameraComponentImpl.capturePipelineImplProvider, (UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), (TorchControl) this.cameraComponentImpl.torchControlProvider.get());
                    case 10:
                        return (T) new UseCaseSurfaceManager((UseCaseThreads) this.cameraComponentImpl.provideUseCaseThreadsProvider.get(), CameraAppConfig_ProvideCameraPipeFactory.provideCameraPipe(this.cameraAppComponentImpl.cameraAppConfig), this.cameraComponentImpl.inactiveSurfaceCloser(), (SessionConfigAdapter) this.useCaseCameraComponentImpl.provideSessionConfigAdapterProvider.get());
                    case 11:
                        return (T) UseCaseCameraConfig_ProvideSessionConfigAdapterFactory.provideSessionConfigAdapter(this.useCaseCameraComponentImpl.useCaseCameraConfig);
                    default:
                        throw new AssertionError(this.f6811id);
                }
            }
        }

        public UseCaseCameraComponentImpl(CameraAppComponentImpl cameraAppComponentImpl, CameraComponentImpl cameraComponentImpl, UseCaseCameraConfig useCaseCameraConfig) {
            this.cameraAppComponentImpl = cameraAppComponentImpl;
            this.cameraComponentImpl = cameraComponentImpl;
            this.useCaseCameraConfig = useCaseCameraConfig;
            initialize(useCaseCameraConfig);
        }

        private void initialize(UseCaseCameraConfig useCaseCameraConfig) {
            this.provideUseCaseGraphContextProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 1));
            this.provideSessionProcessorProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 2));
            this.captureConfigAdapterProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 7));
            this.useCaseCameraStateProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 8));
            this.capturePipelineImplProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 6));
            this.capturePipelineTorchCorrectionProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 9));
            this.provideCapturePipelineProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 5));
            this.provideSessionConfigAdapterProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 11));
            this.useCaseSurfaceManagerProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 10));
            this.useCaseCameraRequestControlImplProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 4));
            this.deferredUseCaseCameraRequestControlProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 3));
            this.useCaseCameraImplProvider = b.b(new SwitchingProvider(this.cameraAppComponentImpl, this.cameraComponentImpl, this.useCaseCameraComponentImpl, 0));
        }

        @Override // androidx.camera.camera2.config.UseCaseCameraComponent
        public UseCaseCamera getUseCaseCamera() {
            return (UseCaseCamera) this.useCaseCameraImplProvider.get();
        }
    }

    public static CameraAppComponent.Builder builder() {
        return new Builder();
    }
}
