package androidx.camera.camera2.pipe.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory;
import androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory;
import androidx.camera.camera2.pipe.compat.AndroidMSessionFactory;
import androidx.camera.camera2.pipe.compat.AndroidNSessionFactory;
import androidx.camera.camera2.pipe.compat.AndroidPSessionFactory;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2Backend;
import androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor;
import androidx.camera.camera2.pipe.compat.Camera2CameraController;
import androidx.camera.camera2.pipe.compat.Camera2CameraOpener;
import androidx.camera.camera2.pipe.compat.Camera2CaptureSessionsModule_ProvideSessionFactoryFactory;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCloser;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl;
import androidx.camera.camera2.pipe.compat.Camera2DeviceManager;
import androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor;
import androidx.camera.camera2.pipe.compat.Camera2MetadataCache;
import androidx.camera.camera2.pipe.compat.Camera2MetadataProvider;
import androidx.camera.camera2.pipe.compat.Camera2Quirks;
import androidx.camera.camera2.pipe.compat.CameraStateOpener;
import androidx.camera.camera2.pipe.compat.CaptureSessionFactory;
import androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers;
import androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper;
import androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager;
import androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener;
import androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl;
import androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory;
import androidx.camera.camera2.pipe.config.Camera2ControllerComponent;
import androidx.camera.camera2.pipe.config.CameraGraphComponent;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import androidx.camera.camera2.pipe.core.SystemTimeSource;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.graph.CameraGraphImpl;
import androidx.camera.camera2.pipe.graph.Controller3A;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.GraphProcessor;
import androidx.camera.camera2.pipe.graph.GraphProcessorImpl;
import androidx.camera.camera2.pipe.graph.GraphState3A;
import androidx.camera.camera2.pipe.graph.Listener3A;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.graph.SurfaceGraph;
import androidx.camera.camera2.pipe.internal.CameraDevicesImpl;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import androidx.camera.camera2.pipe.media.ImageReaderImageSources;
import androidx.camera.camera2.pipe.media.ImageSources;
import e4m.a;
import e4m.b;
import e4m.e;
import e4m.g;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import vc.s;

/* JADX INFO: loaded from: classes15.dex */
public abstract class DaggerCameraPipeComponent {

    public static final class Builder {
        private CameraPipeConfigModule cameraPipeConfigModule;
        private ThreadConfigModule threadConfigModule;

        public CameraPipeComponent build() {
            s.h(this.cameraPipeConfigModule, CameraPipeConfigModule.class);
            s.h(this.threadConfigModule, ThreadConfigModule.class);
            return new CameraPipeComponentImpl(this.cameraPipeConfigModule, this.threadConfigModule);
        }

        public Builder cameraPipeConfigModule(CameraPipeConfigModule cameraPipeConfigModule) {
            cameraPipeConfigModule.getClass();
            this.cameraPipeConfigModule = cameraPipeConfigModule;
            return this;
        }

        public Builder threadConfigModule(ThreadConfigModule threadConfigModule) {
            threadConfigModule.getClass();
            this.threadConfigModule = threadConfigModule;
            return this;
        }

        private Builder() {
        }
    }

    public static final class Camera2ControllerComponentBuilder implements Camera2ControllerComponent.Builder {
        private Camera2ControllerConfig camera2ControllerConfig;
        private final CameraPipeComponentImpl cameraPipeComponentImpl;

        @Override // androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder
        public Camera2ControllerComponent build() {
            s.h(this.camera2ControllerConfig, Camera2ControllerConfig.class);
            return new Camera2ControllerComponentImpl(this.cameraPipeComponentImpl, this.camera2ControllerConfig);
        }

        @Override // androidx.camera.camera2.pipe.config.Camera2ControllerComponent.Builder
        public Camera2ControllerComponentBuilder camera2ControllerConfig(Camera2ControllerConfig camera2ControllerConfig) {
            camera2ControllerConfig.getClass();
            this.camera2ControllerConfig = camera2ControllerConfig;
            return this;
        }

        private Camera2ControllerComponentBuilder(CameraPipeComponentImpl cameraPipeComponentImpl) {
            this.cameraPipeComponentImpl = cameraPipeComponentImpl;
        }
    }

    public static final class Camera2ControllerComponentImpl implements Camera2ControllerComponent {
        e androidExtensionSessionFactoryProvider;
        e androidMHighSpeedSessionFactoryProvider;
        e androidMSessionFactoryProvider;
        e androidNSessionFactoryProvider;
        e androidPSessionFactoryProvider;
        e camera2CameraControllerProvider;
        private final Camera2ControllerComponentImpl camera2ControllerComponentImpl = this;
        private final Camera2ControllerConfig camera2ControllerConfig;
        private final CameraPipeComponentImpl cameraPipeComponentImpl;
        e provideCameraStatusMonitorProvider;
        e provideCoroutineScopeProvider;
        e provideSessionFactoryProvider;

        public static final class SwitchingProvider<T> implements e {
            private final Camera2ControllerComponentImpl camera2ControllerComponentImpl;
            private final CameraPipeComponentImpl cameraPipeComponentImpl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private final int f6820id;

            public SwitchingProvider(CameraPipeComponentImpl cameraPipeComponentImpl, Camera2ControllerComponentImpl camera2ControllerComponentImpl, int i) {
                this.cameraPipeComponentImpl = cameraPipeComponentImpl;
                this.camera2ControllerComponentImpl = camera2ControllerComponentImpl;
                this.f6820id = i;
            }

            @Override // phm.a
            public T get() {
                switch (this.f6820id) {
                    case 0:
                        return (T) new Camera2CameraController((CoroutineScope) this.camera2ControllerComponentImpl.provideCoroutineScopeProvider.get(), (Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (StrictMode) this.cameraPipeComponentImpl.provideStrictModeProvider.get(), Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideGraphListenerFactory.provideGraphListener(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideSurfaceGraphFactory.provideSurfaceGraph(this.camera2ControllerComponentImpl.camera2ControllerConfig), (CameraStatusMonitor) this.camera2ControllerComponentImpl.provideCameraStatusMonitorProvider.get(), (CaptureSessionFactory) this.camera2ControllerComponentImpl.provideSessionFactoryProvider.get(), this.camera2ControllerComponentImpl.standardCamera2CaptureSequenceProcessorFactory(), (Camera2DeviceManager) this.cameraPipeComponentImpl.pruningCamera2DeviceManagerProvider.get(), (CameraSurfaceManager) this.cameraPipeComponentImpl.provideCameraSurfaceManagerProvider.get(), (Camera2Quirks) this.cameraPipeComponentImpl.camera2QuirksProvider.get(), (TimeSource) this.cameraPipeComponentImpl.systemTimeSourceProvider.get(), Camera2ControllerConfig_ProvideCameraGraphIdFactory.provideCameraGraphId(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideShutdownListenerFactory.provideShutdownListener(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.camera2ControllerComponentImpl.camera2ControllerConfig), (ConcurrentSessionSequencers) this.cameraPipeComponentImpl.concurrentSessionSequencersProvider.get());
                    case 1:
                        return (T) Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory.provideCoroutineScope((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (Job) this.cameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                    case 2:
                        CameraPipeComponentImpl cameraPipeComponentImpl = this.cameraPipeComponentImpl;
                        return (T) Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory.provideCameraStatusMonitor(cameraPipeComponentImpl.provideCameraManagerProvider, (Threads) cameraPipeComponentImpl.provideThreadsProvider.get(), Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.camera2ControllerComponentImpl.camera2ControllerConfig), (Job) this.cameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                    case 3:
                        Camera2ControllerComponentImpl camera2ControllerComponentImpl = this.camera2ControllerComponentImpl;
                        return (T) Camera2CaptureSessionsModule_ProvideSessionFactoryFactory.provideSessionFactory(camera2ControllerComponentImpl.androidMSessionFactoryProvider, camera2ControllerComponentImpl.androidMHighSpeedSessionFactoryProvider, camera2ControllerComponentImpl.androidNSessionFactoryProvider, camera2ControllerComponentImpl.androidPSessionFactoryProvider, camera2ControllerComponentImpl.androidExtensionSessionFactoryProvider, Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(camera2ControllerComponentImpl.camera2ControllerConfig));
                    case 4:
                        return (T) new AndroidMSessionFactory((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.camera2ControllerComponentImpl.camera2ControllerConfig));
                    case 5:
                        return (T) new AndroidMHighSpeedSessionFactory(Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.camera2ControllerComponentImpl.camera2ControllerConfig), (Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get());
                    case 6:
                        return (T) new AndroidNSessionFactory((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.camera2ControllerComponentImpl.camera2ControllerConfig));
                    case 7:
                        return (T) new AndroidPSessionFactory((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.camera2ControllerComponentImpl.camera2ControllerConfig));
                    case 8:
                        return (T) new AndroidExtensionSessionFactory((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.camera2ControllerComponentImpl.camera2ControllerConfig), Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.camera2ControllerComponentImpl.camera2ControllerConfig), (Camera2MetadataProvider) this.cameraPipeComponentImpl.camera2MetadataCacheProvider.get(), (StrictMode) this.cameraPipeComponentImpl.provideStrictModeProvider.get());
                    default:
                        throw new AssertionError(this.f6820id);
                }
            }
        }

        public Camera2ControllerComponentImpl(CameraPipeComponentImpl cameraPipeComponentImpl, Camera2ControllerConfig camera2ControllerConfig) {
            this.cameraPipeComponentImpl = cameraPipeComponentImpl;
            this.camera2ControllerConfig = camera2ControllerConfig;
            initialize(camera2ControllerConfig);
        }

        private void initialize(Camera2ControllerConfig camera2ControllerConfig) {
            this.provideCoroutineScopeProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 1));
            this.provideCameraStatusMonitorProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 2));
            this.androidMSessionFactoryProvider = new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 4);
            this.androidMHighSpeedSessionFactoryProvider = new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 5);
            this.androidNSessionFactoryProvider = new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 6);
            this.androidPSessionFactoryProvider = new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 7);
            this.androidExtensionSessionFactoryProvider = new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 8);
            this.provideSessionFactoryProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 3));
            this.camera2CameraControllerProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.camera2ControllerComponentImpl, 0));
        }

        @Override // androidx.camera.camera2.pipe.config.Camera2ControllerComponent
        public CameraController cameraController() {
            return (CameraController) this.camera2CameraControllerProvider.get();
        }

        public StandardCamera2CaptureSequenceProcessorFactory standardCamera2CaptureSequenceProcessorFactory() {
            return new StandardCamera2CaptureSequenceProcessorFactory((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), Camera2ControllerConfig_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.camera2ControllerConfig), Camera2ControllerConfig_ProvideStreamGraphFactory.provideStreamGraph(this.camera2ControllerConfig), (Camera2Quirks) this.cameraPipeComponentImpl.camera2QuirksProvider.get(), (StrictMode) this.cameraPipeComponentImpl.provideStrictModeProvider.get());
        }
    }

    public static final class CameraGraphComponentBuilder implements CameraGraphComponent.Builder {
        private CameraGraphConfigModule cameraGraphConfigModule;
        private final CameraPipeComponentImpl cameraPipeComponentImpl;

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder
        public CameraGraphComponent build() {
            s.h(this.cameraGraphConfigModule, CameraGraphConfigModule.class);
            return new CameraGraphComponentImpl(this.cameraPipeComponentImpl, this.cameraGraphConfigModule);
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder
        public CameraGraphComponentBuilder cameraGraphConfigModule(CameraGraphConfigModule cameraGraphConfigModule) {
            cameraGraphConfigModule.getClass();
            this.cameraGraphConfigModule = cameraGraphConfigModule;
            return this;
        }

        private CameraGraphComponentBuilder(CameraPipeComponentImpl cameraPipeComponentImpl) {
            this.cameraPipeComponentImpl = cameraPipeComponentImpl;
        }
    }

    public static final class CameraGraphComponentImpl implements CameraGraphComponent {
        private final CameraGraphComponentImpl cameraGraphComponentImpl = this;
        private final CameraGraphConfigModule cameraGraphConfigModule;
        e cameraGraphImplProvider;
        e cameraGraphParametersImplProvider;
        e cameraGraphRequestListenersImplProvider;
        private final CameraPipeComponentImpl cameraPipeComponentImpl;
        e controller3AProvider;
        e frameCaptureQueueProvider;
        e graphProcessorImplProvider;
        e graphSessionLockProvider;
        e graphState3AProvider;
        e listener3AProvider;
        e provideCameraBackendProvider;
        e provideCameraControllerProvider;
        e provideCameraGraphCoroutineScopeProvider;
        e provideCameraMetadataProvider;
        e provideFrameDistributorProvider;
        e provideRequestListenersProvider;
        e provideSurfaceGraphProvider;
        e provideSystemClockOffsetsProvider;
        e streamGraphImplProvider;

        public static final class SwitchingProvider<T> implements e {
            private final CameraGraphComponentImpl cameraGraphComponentImpl;
            private final CameraPipeComponentImpl cameraPipeComponentImpl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private final int f6821id;

            public SwitchingProvider(CameraPipeComponentImpl cameraPipeComponentImpl, CameraGraphComponentImpl cameraGraphComponentImpl, int i) {
                this.cameraPipeComponentImpl = cameraPipeComponentImpl;
                this.cameraGraphComponentImpl = cameraGraphComponentImpl;
                this.f6821id = i;
            }

            @Override // phm.a
            public T get() {
                switch (this.f6821id) {
                    case 0:
                        return (T) new CameraGraphImpl(CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.cameraGraphComponentImpl.cameraGraphConfigModule), (CameraMetadata) this.cameraGraphComponentImpl.provideCameraMetadataProvider.get(), (GraphProcessor) this.cameraGraphComponentImpl.graphProcessorImplProvider.get(), (GraphListener) this.cameraGraphComponentImpl.graphProcessorImplProvider.get(), (StreamGraphImpl) this.cameraGraphComponentImpl.streamGraphImplProvider.get(), (SurfaceGraph) this.cameraGraphComponentImpl.provideSurfaceGraphProvider.get(), (CameraController) this.cameraGraphComponentImpl.provideCameraControllerProvider.get(), (FrameDistributor) this.cameraGraphComponentImpl.provideFrameDistributorProvider.get(), (FrameCaptureQueue) this.cameraGraphComponentImpl.frameCaptureQueueProvider.get(), (AudioRestrictionController) this.cameraPipeComponentImpl.audioRestrictionControllerImplProvider.get(), CameraGraphConfigModule_ProvideCameraGraphIdFactory.provideCameraGraphId(this.cameraGraphComponentImpl.cameraGraphConfigModule), (CameraGraphParametersImpl) this.cameraGraphComponentImpl.cameraGraphParametersImplProvider.get(), (CameraGraphRequestListenersImpl) this.cameraGraphComponentImpl.cameraGraphRequestListenersImplProvider.get(), (GraphSessionLock) this.cameraGraphComponentImpl.graphSessionLockProvider.get(), (CoroutineScope) this.cameraGraphComponentImpl.provideCameraGraphCoroutineScopeProvider.get(), (Controller3A) this.cameraGraphComponentImpl.controller3AProvider.get());
                    case 1:
                        return (T) InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory.provideCameraMetadata(CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.cameraGraphComponentImpl.cameraGraphConfigModule), (CameraBackend) this.cameraGraphComponentImpl.provideCameraBackendProvider.get());
                    case 2:
                        return (T) InternalCameraGraphModules_Companion_ProvideCameraBackendFactory.provideCameraBackend((CameraBackends) this.cameraPipeComponentImpl.provideCameraBackendsProvider.get(), CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.cameraGraphComponentImpl.cameraGraphConfigModule), (CameraContext) this.cameraPipeComponentImpl.provideCameraContextProvider.get());
                    case 3:
                        return (T) new GraphProcessorImpl((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), CameraGraphConfigModule_ProvideCameraGraphIdFactory.provideCameraGraphId(this.cameraGraphComponentImpl.cameraGraphConfigModule), CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.cameraGraphComponentImpl.cameraGraphConfigModule), (Listener3A) this.cameraGraphComponentImpl.listener3AProvider.get(), (List) this.cameraGraphComponentImpl.provideRequestListenersProvider.get(), (Camera2Quirks) this.cameraPipeComponentImpl.camera2QuirksProvider.get());
                    case 4:
                        return (T) new Listener3A();
                    case 5:
                        return (T) SharedCameraGraphModules_Companion_ProvideRequestListenersFactory.provideRequestListeners(CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.cameraGraphComponentImpl.cameraGraphConfigModule), (Listener3A) this.cameraGraphComponentImpl.listener3AProvider.get(), (FrameDistributor) this.cameraGraphComponentImpl.provideFrameDistributorProvider.get());
                    case 6:
                        return (T) SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory.provideFrameDistributor((StreamGraphImpl) this.cameraGraphComponentImpl.streamGraphImplProvider.get(), (FrameCaptureQueue) this.cameraGraphComponentImpl.frameCaptureQueueProvider.get(), (CameraMetadata) this.cameraGraphComponentImpl.provideCameraMetadataProvider.get(), (SystemClockOffsets) this.cameraGraphComponentImpl.provideSystemClockOffsetsProvider.get());
                    case 7:
                        return (T) new StreamGraphImpl((CameraMetadata) this.cameraGraphComponentImpl.provideCameraMetadataProvider.get(), CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.cameraGraphComponentImpl.cameraGraphConfigModule), this.cameraPipeComponentImpl.imageSources(), this.cameraGraphComponentImpl.provideCameraControllerProvider);
                    case 8:
                        return (T) InternalCameraGraphModules_Companion_ProvideCameraControllerFactory.provideCameraController(CameraGraphConfigModule_ProvideCameraGraphIdFactory.provideCameraGraphId(this.cameraGraphComponentImpl.cameraGraphConfigModule), CameraGraphConfigModule_ProvideCameraGraphConfigFactory.provideCameraGraphConfig(this.cameraGraphComponentImpl.cameraGraphConfigModule), (CameraBackend) this.cameraGraphComponentImpl.provideCameraBackendProvider.get(), (CameraContext) this.cameraPipeComponentImpl.provideCameraContextProvider.get(), (GraphProcessorImpl) this.cameraGraphComponentImpl.graphProcessorImplProvider.get(), (StreamGraph) this.cameraGraphComponentImpl.streamGraphImplProvider.get(), (SurfaceTracker) this.cameraGraphComponentImpl.provideSurfaceGraphProvider.get());
                    case 9:
                        return (T) SharedCameraGraphModules_Companion_ProvideSurfaceGraphFactory.provideSurfaceGraph((StreamGraphImpl) this.cameraGraphComponentImpl.streamGraphImplProvider.get(), this.cameraGraphComponentImpl.provideCameraControllerProvider, (CameraSurfaceManager) this.cameraPipeComponentImpl.provideCameraSurfaceManagerProvider.get());
                    case 10:
                        return (T) new FrameCaptureQueue();
                    case 11:
                        return (T) SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory.provideSystemClockOffsets();
                    case 12:
                        return (T) new CameraGraphParametersImpl((GraphSessionLock) this.cameraGraphComponentImpl.graphSessionLockProvider.get(), (GraphProcessor) this.cameraGraphComponentImpl.graphProcessorImplProvider.get(), (CoroutineScope) this.cameraGraphComponentImpl.provideCameraGraphCoroutineScopeProvider.get());
                    case 13:
                        return (T) new GraphSessionLock();
                    case 14:
                        return (T) SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory.provideCameraGraphCoroutineScope((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (Job) this.cameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                    case 15:
                        return (T) new CameraGraphRequestListenersImpl((GraphSessionLock) this.cameraGraphComponentImpl.graphSessionLockProvider.get(), (GraphProcessor) this.cameraGraphComponentImpl.graphProcessorImplProvider.get(), (CoroutineScope) this.cameraGraphComponentImpl.provideCameraGraphCoroutineScopeProvider.get());
                    case 16:
                        return (T) new Controller3A((GraphProcessor) this.cameraGraphComponentImpl.graphProcessorImplProvider.get(), (CameraMetadata) this.cameraGraphComponentImpl.provideCameraMetadataProvider.get(), (GraphState3A) this.cameraGraphComponentImpl.graphState3AProvider.get(), (Listener3A) this.cameraGraphComponentImpl.listener3AProvider.get());
                    case 17:
                        return (T) new GraphState3A();
                    default:
                        throw new AssertionError(this.f6821id);
                }
            }
        }

        public CameraGraphComponentImpl(CameraPipeComponentImpl cameraPipeComponentImpl, CameraGraphConfigModule cameraGraphConfigModule) {
            this.cameraPipeComponentImpl = cameraPipeComponentImpl;
            this.cameraGraphConfigModule = cameraGraphConfigModule;
            initialize(cameraGraphConfigModule);
        }

        private void initialize(CameraGraphConfigModule cameraGraphConfigModule) {
            this.provideCameraBackendProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 2));
            this.provideCameraMetadataProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 1));
            this.listener3AProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 4));
            this.graphProcessorImplProvider = new a();
            this.streamGraphImplProvider = new a();
            this.provideCameraControllerProvider = new a();
            this.provideSurfaceGraphProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 9));
            a.a(this.provideCameraControllerProvider, b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 8)));
            a.a(this.streamGraphImplProvider, b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 7)));
            this.frameCaptureQueueProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 10));
            this.provideSystemClockOffsetsProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 11));
            this.provideFrameDistributorProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 6));
            this.provideRequestListenersProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 5));
            a.a(this.graphProcessorImplProvider, b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 3)));
            this.graphSessionLockProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 13));
            this.provideCameraGraphCoroutineScopeProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 14));
            this.cameraGraphParametersImplProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 12));
            this.cameraGraphRequestListenersImplProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 15));
            this.graphState3AProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 17));
            this.controller3AProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 16));
            this.cameraGraphImplProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, this.cameraGraphComponentImpl, 0));
        }

        @Override // androidx.camera.camera2.pipe.config.CameraGraphComponent
        public CameraGraph cameraGraph() {
            return (CameraGraph) this.cameraGraphImplProvider.get();
        }
    }

    public static final class CameraPipeComponentImpl implements CameraPipeComponent {
        e audioRestrictionControllerImplProvider;
        e camera2BackendProvider;
        e camera2DeviceCacheProvider;
        e camera2DeviceCloserImplProvider;
        e camera2ErrorProcessorProvider;
        e camera2MetadataCacheProvider;
        e camera2QuirksProvider;
        e cameraDevicesImplProvider;
        private final CameraPipeComponentImpl cameraPipeComponentImpl = this;
        private final CameraPipeConfigModule cameraPipeConfigModule;
        e cameraPipeLifetimeProvider;
        e concurrentSessionSequencersProvider;
        e permissionsProvider;
        e provideCameraBackendsProvider;
        e provideCameraContextProvider;
        e provideCameraDeviceSetupCompatFactoryProvider;
        e provideCameraManagerProvider;
        e provideCameraPipeJobProvider;
        e provideCameraSurfaceManagerProvider;
        e provideDevicePolicyManagerWrapperProvider;
        e providePackageManagerProvider;
        e provideStrictModeProvider;
        e provideThreadsProvider;
        e pruningCamera2DeviceManagerProvider;
        e retryingCameraStateOpenerImplProvider;
        e systemTimeSourceProvider;
        private final ThreadConfigModule threadConfigModule;

        public static final class SwitchingProvider<T> implements e {
            private final CameraPipeComponentImpl cameraPipeComponentImpl;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private final int f6822id;

            public SwitchingProvider(CameraPipeComponentImpl cameraPipeComponentImpl, int i) {
                this.cameraPipeComponentImpl = cameraPipeComponentImpl;
                this.f6822id = i;
            }

            @Override // phm.a
            public T get() {
                switch (this.f6822id) {
                    case 0:
                        return (T) new CameraPipeLifetime((Job) this.cameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                    case 1:
                        return (T) CameraPipeModule_Companion_ProvideCameraPipeJobFactory.provideCameraPipeJob();
                    case 2:
                        return (T) new CameraDevicesImpl((CameraBackends) this.cameraPipeComponentImpl.provideCameraBackendsProvider.get());
                    case 3:
                        CameraPipe.Config configProvideCameraPipeConfig = CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.cameraPipeComponentImpl.cameraPipeConfigModule);
                        CameraPipeComponentImpl cameraPipeComponentImpl = this.cameraPipeComponentImpl;
                        return (T) CameraPipeModule_Companion_ProvideCameraBackendsFactory.provideCameraBackends(configProvideCameraPipeConfig, cameraPipeComponentImpl.camera2BackendProvider, cameraPipeComponentImpl.cameraPipeContextContext(), (Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (CameraPipeLifetime) this.cameraPipeComponentImpl.cameraPipeLifetimeProvider.get());
                    case 4:
                        return (T) new Camera2Backend((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (Camera2DeviceCache) this.cameraPipeComponentImpl.camera2DeviceCacheProvider.get(), (Camera2MetadataCache) this.cameraPipeComponentImpl.camera2MetadataCacheProvider.get(), (Camera2DeviceManager) this.cameraPipeComponentImpl.pruningCamera2DeviceManagerProvider.get(), new Camera2ControllerComponentBuilder(this.cameraPipeComponentImpl), this.cameraPipeComponentImpl.cameraPipeContextContext());
                    case 5:
                        return (T) ThreadConfigModule_ProvideThreadsFactory.provideThreads(this.cameraPipeComponentImpl.threadConfigModule, (CameraPipeLifetime) this.cameraPipeComponentImpl.cameraPipeLifetimeProvider.get(), (Job) this.cameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                    case 6:
                        CameraPipeComponentImpl cameraPipeComponentImpl2 = this.cameraPipeComponentImpl;
                        e eVar = cameraPipeComponentImpl2.provideCameraManagerProvider;
                        Threads threads = (Threads) cameraPipeComponentImpl2.provideThreadsProvider.get();
                        Context contextCameraPipeContextContext = this.cameraPipeComponentImpl.cameraPipeContextContext();
                        PackageManager packageManager = (PackageManager) this.cameraPipeComponentImpl.providePackageManagerProvider.get();
                        CameraErrorListener cameraErrorListener = (CameraErrorListener) this.cameraPipeComponentImpl.camera2ErrorProcessorProvider.get();
                        CameraPipeComponentImpl cameraPipeComponentImpl3 = this.cameraPipeComponentImpl;
                        return (T) new Camera2DeviceCache(eVar, threads, contextCameraPipeContextContext, packageManager, cameraErrorListener, cameraPipeComponentImpl3.provideCameraDeviceSetupCompatFactoryProvider, (CameraPipeLifetime) cameraPipeComponentImpl3.cameraPipeLifetimeProvider.get(), (Job) this.cameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                    case 7:
                        return (T) CameraPipeModule_Companion_ProvideCameraManagerFactory.provideCameraManager(this.cameraPipeComponentImpl.cameraPipeContextContext());
                    case 8:
                        return (T) CameraPipeModule_Companion_ProvidePackageManagerFactory.providePackageManager(this.cameraPipeComponentImpl.cameraPipeContextContext());
                    case 9:
                        return (T) new Camera2ErrorProcessor();
                    case 10:
                        return (T) CameraPipeModule_Companion_ProvideCameraDeviceSetupCompatFactoryFactory.provideCameraDeviceSetupCompatFactory(this.cameraPipeComponentImpl.cameraPipeContextContext());
                    case 11:
                        return (T) new Camera2MetadataCache(this.cameraPipeComponentImpl.cameraPipeContextContext(), (Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (Permissions) this.cameraPipeComponentImpl.permissionsProvider.get(), this.cameraPipeComponentImpl.cameraMetadataConfig(), (TimeSource) this.cameraPipeComponentImpl.systemTimeSourceProvider.get());
                    case 12:
                        return (T) new Permissions(this.cameraPipeComponentImpl.cameraPipeContextContext());
                    case 13:
                        return (T) new SystemTimeSource();
                    case 14:
                        return (T) new PruningCamera2DeviceManager((Permissions) this.cameraPipeComponentImpl.permissionsProvider.get(), (RetryingCameraStateOpener) this.cameraPipeComponentImpl.retryingCameraStateOpenerImplProvider.get(), (Camera2DeviceCloser) this.cameraPipeComponentImpl.camera2DeviceCloserImplProvider.get(), (Camera2ErrorProcessor) this.cameraPipeComponentImpl.camera2ErrorProcessorProvider.get(), (Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get());
                    case 15:
                        return (T) new RetryingCameraStateOpenerImpl(this.cameraPipeComponentImpl.cameraStateOpener(), (CameraErrorListener) this.cameraPipeComponentImpl.camera2ErrorProcessorProvider.get(), this.cameraPipeComponentImpl.camera2CameraAvailabilityMonitor(), (TimeSource) this.cameraPipeComponentImpl.systemTimeSourceProvider.get(), (DevicePolicyManagerWrapper) this.cameraPipeComponentImpl.provideDevicePolicyManagerWrapperProvider.get(), (AudioRestrictionController) this.cameraPipeComponentImpl.audioRestrictionControllerImplProvider.get(), this.cameraPipeComponentImpl.cameraInteropConfig(), (Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get());
                    case 16:
                        return (T) new Camera2Quirks((Camera2MetadataProvider) this.cameraPipeComponentImpl.camera2MetadataCacheProvider.get(), (StrictMode) this.cameraPipeComponentImpl.provideStrictModeProvider.get());
                    case 17:
                        return (T) CameraPipeModule_Companion_ProvideStrictModeFactory.provideStrictMode(CameraPipeConfigModule_ProvideCameraPipeFlagsFactory.provideCameraPipeFlags(this.cameraPipeComponentImpl.cameraPipeConfigModule));
                    case 18:
                        return (T) CameraPipeModule_Companion_ProvideDevicePolicyManagerWrapperFactory.provideDevicePolicyManagerWrapper(this.cameraPipeComponentImpl.cameraPipeContextContext());
                    case 19:
                        return (T) new AudioRestrictionControllerImpl((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (CameraPipeLifetime) this.cameraPipeComponentImpl.cameraPipeLifetimeProvider.get(), (Job) this.cameraPipeComponentImpl.provideCameraPipeJobProvider.get());
                    case 20:
                        return (T) new Camera2DeviceCloserImpl((Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (Camera2Quirks) this.cameraPipeComponentImpl.camera2QuirksProvider.get(), (RetryingCameraStateOpener) this.cameraPipeComponentImpl.retryingCameraStateOpenerImplProvider.get());
                    case 21:
                        return (T) CameraPipeModule_Companion_ProvideCameraContextFactory.provideCameraContext(this.cameraPipeComponentImpl.cameraPipeContextContext(), (Threads) this.cameraPipeComponentImpl.provideThreadsProvider.get(), (CameraBackends) this.cameraPipeComponentImpl.provideCameraBackendsProvider.get());
                    case 22:
                        return (T) CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory.provideCameraSurfaceManager();
                    case 23:
                        return (T) new ConcurrentSessionSequencers();
                    default:
                        throw new AssertionError(this.f6822id);
                }
            }
        }

        public CameraPipeComponentImpl(CameraPipeConfigModule cameraPipeConfigModule, ThreadConfigModule threadConfigModule) {
            this.cameraPipeConfigModule = cameraPipeConfigModule;
            this.threadConfigModule = threadConfigModule;
            initialize(cameraPipeConfigModule, threadConfigModule);
        }

        private void initialize(CameraPipeConfigModule cameraPipeConfigModule, ThreadConfigModule threadConfigModule) {
            this.provideCameraPipeJobProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 1));
            this.cameraPipeLifetimeProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 0));
            this.provideThreadsProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 5));
            this.provideCameraManagerProvider = g.a(new SwitchingProvider(this.cameraPipeComponentImpl, 7));
            this.providePackageManagerProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 8));
            this.camera2ErrorProcessorProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 9));
            this.provideCameraDeviceSetupCompatFactoryProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 10));
            this.camera2DeviceCacheProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 6));
            this.permissionsProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 12));
            this.systemTimeSourceProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 13));
            this.camera2MetadataCacheProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 11));
            this.provideStrictModeProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 17));
            this.camera2QuirksProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 16));
            this.provideDevicePolicyManagerWrapperProvider = g.a(new SwitchingProvider(this.cameraPipeComponentImpl, 18));
            this.audioRestrictionControllerImplProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 19));
            this.retryingCameraStateOpenerImplProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 15));
            this.camera2DeviceCloserImplProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 20));
            this.pruningCamera2DeviceManagerProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 14));
            this.camera2BackendProvider = new SwitchingProvider(this.cameraPipeComponentImpl, 4);
            this.provideCameraBackendsProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 3));
            this.cameraDevicesImplProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 2));
            this.provideCameraContextProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 21));
            this.provideCameraSurfaceManagerProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 22));
            this.concurrentSessionSequencersProvider = b.b(new SwitchingProvider(this.cameraPipeComponentImpl, 23));
        }

        public Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor() {
            return new Camera2CameraAvailabilityMonitor(this.provideCameraManagerProvider, (Threads) this.provideThreadsProvider.get(), (Job) this.provideCameraPipeJobProvider.get());
        }

        public Camera2CameraOpener camera2CameraOpener() {
            return new Camera2CameraOpener(this.provideCameraManagerProvider, (Threads) this.provideThreadsProvider.get());
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public CameraBackends cameraBackends() {
            return (CameraBackends) this.provideCameraBackendsProvider.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public CameraContext cameraContext() {
            return (CameraContext) this.provideCameraContextProvider.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public CameraGraphComponent.Builder cameraGraphComponentBuilder() {
            return new CameraGraphComponentBuilder(this.cameraPipeComponentImpl);
        }

        public CameraPipe.CameraInteropConfig cameraInteropConfig() {
            CameraPipeConfigModule cameraPipeConfigModule = this.cameraPipeConfigModule;
            return CameraPipeConfigModule_ProvideCameraInteropConfigFactory.provideCameraInteropConfig(cameraPipeConfigModule, CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(cameraPipeConfigModule));
        }

        public CameraPipe.CameraMetadataConfig cameraMetadataConfig() {
            return CameraPipeModule_Companion_ProvideCameraMetadataConfigFactory.provideCameraMetadataConfig(CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.cameraPipeConfigModule));
        }

        public Context cameraPipeContextContext() {
            return CameraPipeModule_Companion_ProvideContextFactory.provideContext(CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.cameraPipeConfigModule));
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public CameraPipeLifetime cameraPipeLifetime() {
            return (CameraPipeLifetime) this.cameraPipeLifetimeProvider.get();
        }

        public CameraStateOpener cameraStateOpener() {
            return new CameraStateOpener(camera2CameraOpener(), (Camera2MetadataProvider) this.camera2MetadataCacheProvider.get(), (CameraErrorListener) this.camera2ErrorProcessorProvider.get(), (Camera2Quirks) this.camera2QuirksProvider.get(), (TimeSource) this.systemTimeSourceProvider.get(), cameraInteropConfig(), (Threads) this.provideThreadsProvider.get());
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public CameraSurfaceManager cameraSurfaceManager() {
            return (CameraSurfaceManager) this.provideCameraSurfaceManagerProvider.get();
        }

        @Override // androidx.camera.camera2.pipe.config.CameraPipeComponent
        public CameraDevices cameras() {
            return (CameraDevices) this.cameraDevicesImplProvider.get();
        }

        public ImageReaderImageSources imageReaderImageSources() {
            return new ImageReaderImageSources((Threads) this.provideThreadsProvider.get(), CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.cameraPipeConfigModule));
        }

        public ImageSources imageSources() {
            return CameraPipeModule_Companion_ConfigureImageSourcesFactory.configureImageSources(imageReaderImageSources(), CameraPipeConfigModule_ProvideCameraPipeConfigFactory.provideCameraPipeConfig(this.cameraPipeConfigModule));
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
