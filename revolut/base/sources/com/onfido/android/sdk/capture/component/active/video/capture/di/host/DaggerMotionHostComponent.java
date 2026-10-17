package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import android.content.Context;
import android.content.res.Resources;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager_Factory;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.data.demo.MotionDemoDataSource_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.MotionMetaDataHelper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.MotionRemoteDataSource_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.ActiveVideoCaptureRepositoryImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.ActiveVideoCaptureRepositoryImpl_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.MotionDataSource;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.mapper.ThrowableToErrorMessageMapper;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.mapper.ThrowableToErrorMessageMapper_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.UploadActiveVideoCaptureUseCase_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.C2003MotionHostViewModel_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment_MembersInjector;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel_Factory_Impl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.intro.MotionIntroFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.intro.MotionIntroFragment_MembersInjector;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.nofacedetected.MotionNoFaceDetectedFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.nofacedetected.MotionNoFaceDetectedFragment_MembersInjector;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadFragment_MembersInjector;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.MotionUploadViewModel_Factory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.uploaderror.MotionUploadErrorFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.uploaderror.MotionUploadErrorFragment_MembersInjector;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.javax.inject.Provider;
import el.a;
import kotlinx.serialization.json.Json;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class DaggerMotionHostComponent {

    public static final class Builder {
        private MotionHostModule motionHostModule;
        private SdkComponent sdkComponent;

        private Builder() {
        }

        public MotionHostComponent build() {
            e.e(this.motionHostModule, MotionHostModule.class);
            e.e(this.sdkComponent, SdkComponent.class);
            return new MotionHostComponentImpl(this.motionHostModule, this.sdkComponent, 0);
        }

        public Builder motionHostModule(MotionHostModule motionHostModule) {
            motionHostModule.getClass();
            this.motionHostModule = motionHostModule;
            return this;
        }

        @Deprecated
        public Builder navigationModule(NavigationModule navigationModule) {
            navigationModule.getClass();
            return this;
        }

        public Builder sdkComponent(SdkComponent sdkComponent) {
            sdkComponent.getClass();
            this.sdkComponent = sdkComponent;
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public static final class MotionHostComponentImpl implements MotionHostComponent {
        private Provider activeVideoCaptureRepositoryImplProvider;
        private Provider applicationContextProvider;
        private Provider factoryProvider;
        private Provider getJsonParserProvider;
        private Provider motionDemoDataSourceProvider;
        private final MotionHostComponentImpl motionHostComponentImpl;
        private final MotionHostModule motionHostModule;
        private C2003MotionHostViewModel_Factory motionHostViewModelProvider;
        private Provider motionMetaDataHelperProvider;
        private Provider motionRemoteDataSourceProvider;
        private Provider motionUploadViewModelProvider;
        private Provider onfidoAnalyticsProvider;
        private Provider onfidoFetcherProvider;
        private Provider onfidoRemoteConfigProvider;
        private Provider onfidoTokenProvider;
        private Provider provideFaceDetectionModuleAvailabilityUseCaseProvider;
        private Provider provideMLKitFaceDetectorProvider;
        private Provider provideModuleInstallClientProvider;
        private Provider provideMotionApiProvider;
        private Provider provideMotionDataSourceProvider;
        private Provider provideMotionOptionsProvider;
        private Provider provideNavigationManagerHolderProvider;
        private Provider provideNavigatorProvider;
        private Provider provideOnfidoNavigationProvider;
        private Provider providePayloadHelper$onfido_capture_sdk_core_releaseProvider;
        private Provider provideResourcesProvider;
        private Provider provideSdkUploadMetadataHelper$onfido_capture_sdk_core_releaseProvider;
        private Provider provideUploadMetadataProvider;
        private Provider runtimePermissionsManagerProvider;
        private Provider schedulersProvider;
        private final SdkComponent sdkComponent;
        private Provider sharedPreferencesDataSourceProvider;
        private Provider throwableToErrorMessageMapperProvider;
        private Provider uploadActiveVideoCaptureUseCaseProvider;
        private Provider waitingScreenTrackerProvider;

        public static final class ApplicationContextProvider implements Provider {
            private final SdkComponent sdkComponent;

            public ApplicationContextProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public Context get() {
                Context contextApplicationContext = this.sdkComponent.applicationContext();
                e.f(contextApplicationContext);
                return contextApplicationContext;
            }
        }

        public static final class GetJsonParserProvider implements Provider {
            private final SdkComponent sdkComponent;

            public GetJsonParserProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public Json get() {
                Json jsonParser = this.sdkComponent.getJsonParser();
                e.f(jsonParser);
                return jsonParser;
            }
        }

        public static final class OnfidoAnalyticsProvider implements Provider {
            private final SdkComponent sdkComponent;

            public OnfidoAnalyticsProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public OnfidoAnalytics get() {
                OnfidoAnalytics onfidoAnalytics = this.sdkComponent.onfidoAnalytics();
                e.f(onfidoAnalytics);
                return onfidoAnalytics;
            }
        }

        public static final class OnfidoFetcherProvider implements Provider {
            private final SdkComponent sdkComponent;

            public OnfidoFetcherProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public OnfidoFetcher get() {
                OnfidoFetcher onfidoFetcher = this.sdkComponent.onfidoFetcher();
                e.f(onfidoFetcher);
                return onfidoFetcher;
            }
        }

        public static final class OnfidoRemoteConfigProvider implements Provider {
            private final SdkComponent sdkComponent;

            public OnfidoRemoteConfigProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public OnfidoRemoteConfig get() {
                OnfidoRemoteConfig onfidoRemoteConfig = this.sdkComponent.onfidoRemoteConfig();
                e.f(onfidoRemoteConfig);
                return onfidoRemoteConfig;
            }
        }

        public static final class OnfidoTokenProviderProvider implements Provider {
            private final SdkComponent sdkComponent;

            public OnfidoTokenProviderProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public OnfidoTokenProvider get() {
                OnfidoTokenProvider onfidoTokenProvider = this.sdkComponent.onfidoTokenProvider();
                e.f(onfidoTokenProvider);
                return onfidoTokenProvider;
            }
        }

        public static final class SchedulersProviderProvider implements Provider {
            private final SdkComponent sdkComponent;

            public SchedulersProviderProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public SchedulersProvider get() {
                SchedulersProvider schedulersProvider = this.sdkComponent.schedulersProvider();
                e.f(schedulersProvider);
                return schedulersProvider;
            }
        }

        public static final class WaitingScreenTrackerProvider implements Provider {
            private final SdkComponent sdkComponent;

            public WaitingScreenTrackerProvider(SdkComponent sdkComponent) {
                this.sdkComponent = sdkComponent;
            }

            @Override // com.onfido.javax.inject.Provider
            public WaitingScreenTracker get() {
                WaitingScreenTracker waitingScreenTracker = this.sdkComponent.waitingScreenTracker();
                e.f(waitingScreenTracker);
                return waitingScreenTracker;
            }
        }

        private MotionHostComponentImpl(MotionHostModule motionHostModule, SdkComponent sdkComponent) {
            this.motionHostComponentImpl = this;
            this.sdkComponent = sdkComponent;
            this.motionHostModule = motionHostModule;
            initialize(motionHostModule, sdkComponent);
        }

        private ActiveVideoCaptureRepositoryImpl activeVideoCaptureRepositoryImpl() {
            MotionDataSource motionDataSource = (MotionDataSource) this.provideMotionDataSourceProvider.get();
            ThrowableToErrorMessageMapper throwableToErrorMessageMapper = throwableToErrorMessageMapper();
            Context contextApplicationContext = this.sdkComponent.applicationContext();
            e.f(contextApplicationContext);
            return new ActiveVideoCaptureRepositoryImpl(motionDataSource, throwableToErrorMessageMapper, contextApplicationContext);
        }

        private void initialize(MotionHostModule motionHostModule, final SdkComponent sdkComponent) {
            SchedulersProviderProvider schedulersProviderProvider = new SchedulersProviderProvider(sdkComponent);
            this.schedulersProvider = schedulersProviderProvider;
            Provider providerB = a.b(NavigationModule_ProvideOnfidoNavigationFactory.create(schedulersProviderProvider));
            this.provideOnfidoNavigationProvider = providerB;
            this.provideNavigatorProvider = NavigationModule_ProvideNavigatorFactory.create(providerB);
            this.provideNavigationManagerHolderProvider = NavigationModule_ProvideNavigationManagerHolderFactory.create(this.provideOnfidoNavigationProvider);
            this.applicationContextProvider = new ApplicationContextProvider(sdkComponent);
            GetJsonParserProvider getJsonParserProvider = new GetJsonParserProvider(sdkComponent);
            this.getJsonParserProvider = getJsonParserProvider;
            SharedPreferencesDataSource_Factory sharedPreferencesDataSource_FactoryCreate = SharedPreferencesDataSource_Factory.create(this.applicationContextProvider, getJsonParserProvider);
            this.sharedPreferencesDataSourceProvider = sharedPreferencesDataSource_FactoryCreate;
            this.runtimePermissionsManagerProvider = RuntimePermissionsManager_Factory.create(this.applicationContextProvider, sharedPreferencesDataSource_FactoryCreate);
            this.onfidoAnalyticsProvider = new OnfidoAnalyticsProvider(sdkComponent);
            this.onfidoRemoteConfigProvider = new OnfidoRemoteConfigProvider(sdkComponent);
            this.provideModuleInstallClientProvider = MotionHostModule_ProvideModuleInstallClientFactory.create(motionHostModule, this.applicationContextProvider);
            MotionHostModule_ProvideMLKitFaceDetectorFactory motionHostModule_ProvideMLKitFaceDetectorFactoryCreate = MotionHostModule_ProvideMLKitFaceDetectorFactory.create(motionHostModule);
            this.provideMLKitFaceDetectorProvider = motionHostModule_ProvideMLKitFaceDetectorFactoryCreate;
            MotionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactory motionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactoryCreate = MotionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactory.create(motionHostModule, this.provideModuleInstallClientProvider, motionHostModule_ProvideMLKitFaceDetectorFactoryCreate);
            this.provideFaceDetectionModuleAvailabilityUseCaseProvider = motionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactoryCreate;
            C2003MotionHostViewModel_Factory c2003MotionHostViewModel_FactoryCreate = C2003MotionHostViewModel_Factory.create(this.provideNavigatorProvider, this.provideNavigationManagerHolderProvider, this.runtimePermissionsManagerProvider, this.onfidoAnalyticsProvider, this.onfidoRemoteConfigProvider, motionHostModule_ProvideFaceDetectionModuleAvailabilityUseCaseFactoryCreate, this.schedulersProvider);
            this.motionHostViewModelProvider = c2003MotionHostViewModel_FactoryCreate;
            this.factoryProvider = MotionHostViewModel_Factory_Impl.create(c2003MotionHostViewModel_FactoryCreate);
            this.onfidoTokenProvider = new OnfidoTokenProviderProvider(sdkComponent);
            this.motionDemoDataSourceProvider = MotionDemoDataSource_Factory.create(this.getJsonParserProvider);
            this.provideMotionOptionsProvider = MotionHostModule_ProvideMotionOptionsFactory.create(motionHostModule);
            OnfidoFetcherProvider onfidoFetcherProvider = new OnfidoFetcherProvider(sdkComponent);
            this.onfidoFetcherProvider = onfidoFetcherProvider;
            this.provideMotionApiProvider = a.b(MotionHostModule_ProvideMotionApiFactory.create(motionHostModule, onfidoFetcherProvider));
            this.providePayloadHelper$onfido_capture_sdk_core_releaseProvider = new Provider(sdkComponent) { // from class: com.onfido.android.sdk.capture.component.active.video.capture.di.host.DaggerMotionHostComponent$MotionHostComponentImpl$ProvidePayloadHelper$onfido_capture_sdk_core_releaseProvider
                private final SdkComponent sdkComponent;

                {
                    this.sdkComponent = sdkComponent;
                }

                @Override // com.onfido.javax.inject.Provider
                public PayloadHelper get() {
                    PayloadHelper payloadHelperProvidePayloadHelper$onfido_capture_sdk_core_release = this.sdkComponent.providePayloadHelper$onfido_capture_sdk_core_release();
                    e.f(payloadHelperProvidePayloadHelper$onfido_capture_sdk_core_release);
                    return payloadHelperProvidePayloadHelper$onfido_capture_sdk_core_release;
                }
            };
            Provider provider = new Provider(sdkComponent) { // from class: com.onfido.android.sdk.capture.component.active.video.capture.di.host.DaggerMotionHostComponent$MotionHostComponentImpl$ProvideSdkUploadMetadataHelper$onfido_capture_sdk_core_releaseProvider
                private final SdkComponent sdkComponent;

                {
                    this.sdkComponent = sdkComponent;
                }

                @Override // com.onfido.javax.inject.Provider
                public SdkUploadMetadataHelper get() {
                    SdkUploadMetadataHelper sdkUploadMetadataHelperProvideSdkUploadMetadataHelper$onfido_capture_sdk_core_release = this.sdkComponent.provideSdkUploadMetadataHelper$onfido_capture_sdk_core_release();
                    e.f(sdkUploadMetadataHelperProvideSdkUploadMetadataHelper$onfido_capture_sdk_core_release);
                    return sdkUploadMetadataHelperProvideSdkUploadMetadataHelper$onfido_capture_sdk_core_release;
                }
            };
            this.provideSdkUploadMetadataHelper$onfido_capture_sdk_core_releaseProvider = provider;
            MotionHostModule_ProvideUploadMetadataFactory motionHostModule_ProvideUploadMetadataFactoryCreate = MotionHostModule_ProvideUploadMetadataFactory.create(motionHostModule, provider);
            this.provideUploadMetadataProvider = motionHostModule_ProvideUploadMetadataFactoryCreate;
            MotionMetaDataHelper_Factory motionMetaDataHelper_FactoryCreate = MotionMetaDataHelper_Factory.create(this.applicationContextProvider, motionHostModule_ProvideUploadMetadataFactoryCreate, this.getJsonParserProvider);
            this.motionMetaDataHelperProvider = motionMetaDataHelper_FactoryCreate;
            MotionRemoteDataSource_Factory motionRemoteDataSource_FactoryCreate = MotionRemoteDataSource_Factory.create(this.provideMotionOptionsProvider, this.provideMotionApiProvider, this.providePayloadHelper$onfido_capture_sdk_core_releaseProvider, motionMetaDataHelper_FactoryCreate);
            this.motionRemoteDataSourceProvider = motionRemoteDataSource_FactoryCreate;
            this.provideMotionDataSourceProvider = a.b(MotionHostModule_ProvideMotionDataSourceFactory.create(motionHostModule, this.onfidoTokenProvider, this.motionDemoDataSourceProvider, motionRemoteDataSource_FactoryCreate));
            MotionHostModule_ProvideResourcesFactory motionHostModule_ProvideResourcesFactoryCreate = MotionHostModule_ProvideResourcesFactory.create(motionHostModule, this.applicationContextProvider);
            this.provideResourcesProvider = motionHostModule_ProvideResourcesFactoryCreate;
            ThrowableToErrorMessageMapper_Factory throwableToErrorMessageMapper_FactoryCreate = ThrowableToErrorMessageMapper_Factory.create(this.getJsonParserProvider, motionHostModule_ProvideResourcesFactoryCreate);
            this.throwableToErrorMessageMapperProvider = throwableToErrorMessageMapper_FactoryCreate;
            ActiveVideoCaptureRepositoryImpl_Factory activeVideoCaptureRepositoryImpl_FactoryCreate = ActiveVideoCaptureRepositoryImpl_Factory.create(this.provideMotionDataSourceProvider, throwableToErrorMessageMapper_FactoryCreate, this.applicationContextProvider);
            this.activeVideoCaptureRepositoryImplProvider = activeVideoCaptureRepositoryImpl_FactoryCreate;
            this.uploadActiveVideoCaptureUseCaseProvider = UploadActiveVideoCaptureUseCase_Factory.create(activeVideoCaptureRepositoryImpl_FactoryCreate, this.schedulersProvider);
            WaitingScreenTrackerProvider waitingScreenTrackerProvider = new WaitingScreenTrackerProvider(sdkComponent);
            this.waitingScreenTrackerProvider = waitingScreenTrackerProvider;
            this.motionUploadViewModelProvider = MotionUploadViewModel_Factory.create(this.uploadActiveVideoCaptureUseCaseProvider, this.schedulersProvider, this.onfidoAnalyticsProvider, waitingScreenTrackerProvider);
        }

        private MotionHostFragment injectMotionHostFragment(MotionHostFragment motionHostFragment) {
            MotionHostFragment_MembersInjector.injectRuntimePermissionsManager(motionHostFragment, runtimePermissionsManager());
            MotionHostFragment_MembersInjector.injectMotionHostViewModelFactory(motionHostFragment, (MotionHostViewModel.Factory) this.factoryProvider.get());
            return motionHostFragment;
        }

        private MotionIntroFragment injectMotionIntroFragment(MotionIntroFragment motionIntroFragment) {
            OnfidoAnalytics onfidoAnalytics = this.sdkComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            MotionIntroFragment_MembersInjector.injectAnalytics(motionIntroFragment, onfidoAnalytics);
            MotionIntroFragment_MembersInjector.injectActiveVideoCaptureRepository(motionIntroFragment, activeVideoCaptureRepositoryImpl());
            SchedulersProvider schedulersProvider = this.sdkComponent.schedulersProvider();
            e.f(schedulersProvider);
            MotionIntroFragment_MembersInjector.injectSchedulersProvider(motionIntroFragment, schedulersProvider);
            MotionIntroFragment_MembersInjector.injectStorage(motionIntroFragment, sharedPreferencesDataSource());
            return motionIntroFragment;
        }

        private MotionNoFaceDetectedFragment injectMotionNoFaceDetectedFragment(MotionNoFaceDetectedFragment motionNoFaceDetectedFragment) {
            OnfidoAnalytics onfidoAnalytics = this.sdkComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            MotionNoFaceDetectedFragment_MembersInjector.injectAnalytics(motionNoFaceDetectedFragment, onfidoAnalytics);
            return motionNoFaceDetectedFragment;
        }

        private MotionUploadErrorFragment injectMotionUploadErrorFragment(MotionUploadErrorFragment motionUploadErrorFragment) {
            OnfidoAnalytics onfidoAnalytics = this.sdkComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            MotionUploadErrorFragment_MembersInjector.injectAnalytics(motionUploadErrorFragment, onfidoAnalytics);
            return motionUploadErrorFragment;
        }

        private MotionUploadFragment injectMotionUploadFragment(MotionUploadFragment motionUploadFragment) {
            MotionUploadFragment_MembersInjector.injectViewModelProvider(motionUploadFragment, this.motionUploadViewModelProvider);
            return motionUploadFragment;
        }

        private Resources resources() {
            MotionHostModule motionHostModule = this.motionHostModule;
            Context contextApplicationContext = this.sdkComponent.applicationContext();
            e.f(contextApplicationContext);
            return MotionHostModule_ProvideResourcesFactory.provideResources(motionHostModule, contextApplicationContext);
        }

        private RuntimePermissionsManager runtimePermissionsManager() {
            Context contextApplicationContext = this.sdkComponent.applicationContext();
            e.f(contextApplicationContext);
            return new RuntimePermissionsManager(contextApplicationContext, sharedPreferencesDataSource());
        }

        private SharedPreferencesDataSource sharedPreferencesDataSource() {
            Context contextApplicationContext = this.sdkComponent.applicationContext();
            e.f(contextApplicationContext);
            Json jsonParser = this.sdkComponent.getJsonParser();
            e.f(jsonParser);
            return new SharedPreferencesDataSource(contextApplicationContext, jsonParser);
        }

        private ThrowableToErrorMessageMapper throwableToErrorMessageMapper() {
            Json jsonParser = this.sdkComponent.getJsonParser();
            e.f(jsonParser);
            return new ThrowableToErrorMessageMapper(jsonParser, resources());
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public Context applicationContext() {
            Context contextApplicationContext = this.sdkComponent.applicationContext();
            e.f(contextApplicationContext);
            return contextApplicationContext;
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public DispatchersProvider dispatchersProvider() {
            DispatchersProvider dispatchersProvider = this.sdkComponent.dispatchersProvider();
            e.f(dispatchersProvider);
            return dispatchersProvider;
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public void inject(MotionHostFragment motionHostFragment) {
            injectMotionHostFragment(motionHostFragment);
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public MotionCaptureVariantOptions motionOptions() {
            return MotionHostModule_ProvideMotionOptionsFactory.provideMotionOptions(this.motionHostModule);
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public OnfidoAnalytics onfidoAnalytics() {
            OnfidoAnalytics onfidoAnalytics = this.sdkComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            return onfidoAnalytics;
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public OnfidoRemoteConfig onfidoRemoteConfig() {
            OnfidoRemoteConfig onfidoRemoteConfig = this.sdkComponent.onfidoRemoteConfig();
            e.f(onfidoRemoteConfig);
            return onfidoRemoteConfig;
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public TimeProvider provideTimeProvider() {
            TimeProvider timeProviderProvideTimeProvider$onfido_capture_sdk_core_release = this.sdkComponent.provideTimeProvider$onfido_capture_sdk_core_release();
            e.f(timeProviderProvideTimeProvider$onfido_capture_sdk_core_release);
            return timeProviderProvideTimeProvider$onfido_capture_sdk_core_release;
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public SchedulersProvider schedulersProvider() {
            SchedulersProvider schedulersProvider = this.sdkComponent.schedulersProvider();
            e.f(schedulersProvider);
            return schedulersProvider;
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public SdkUploadMetadataHelper sdkUploadMetadataHelper() {
            SdkUploadMetadataHelper sdkUploadMetadataHelperProvideSdkUploadMetadataHelper$onfido_capture_sdk_core_release = this.sdkComponent.provideSdkUploadMetadataHelper$onfido_capture_sdk_core_release();
            e.f(sdkUploadMetadataHelperProvideSdkUploadMetadataHelper$onfido_capture_sdk_core_release);
            return sdkUploadMetadataHelperProvideSdkUploadMetadataHelper$onfido_capture_sdk_core_release;
        }

        public /* synthetic */ MotionHostComponentImpl(MotionHostModule motionHostModule, SdkComponent sdkComponent, int i) {
            this(motionHostModule, sdkComponent);
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public void inject(MotionIntroFragment motionIntroFragment) {
            injectMotionIntroFragment(motionIntroFragment);
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public void inject(MotionNoFaceDetectedFragment motionNoFaceDetectedFragment) {
            injectMotionNoFaceDetectedFragment(motionNoFaceDetectedFragment);
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public void inject(MotionUploadFragment motionUploadFragment) {
            injectMotionUploadFragment(motionUploadFragment);
        }

        @Override // com.onfido.android.sdk.capture.component.active.video.capture.di.host.MotionHostComponent
        public void inject(MotionUploadErrorFragment motionUploadErrorFragment) {
            injectMotionUploadErrorFragment(motionUploadErrorFragment);
        }
    }

    private DaggerMotionHostComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }
}
