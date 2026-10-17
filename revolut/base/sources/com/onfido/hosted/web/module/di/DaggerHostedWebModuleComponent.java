package com.onfido.hosted.web.module.di;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.hosted.web.module.HostedWebModuleFragment;
import com.onfido.hosted.web.module.HostedWebModuleViewModel;
import com.onfido.hosted.web.module.di.HostedWebModuleComponent;
import com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkFragment;
import com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkRepositoryImpl;
import com.onfido.hosted.web.module.externallink.HostedWebModuleExternalLinkViewModel;
import kotlinx.serialization.json.Json;
import n14.e;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes17.dex */
public final class DaggerHostedWebModuleComponent {

    public static final class Factory implements HostedWebModuleComponent.Factory {
        private Factory() {
        }

        @Override // com.onfido.hosted.web.module.di.HostedWebModuleComponent.Factory
        public HostedWebModuleComponent create(SdkComponent sdkComponent) {
            sdkComponent.getClass();
            return new HostedWebModuleComponentImpl(sdkComponent, 0);
        }

        public /* synthetic */ Factory(int i) {
            this();
        }
    }

    public static final class HostedWebModuleComponentImpl implements HostedWebModuleComponent {
        private final HostedWebModuleComponentImpl hostedWebModuleComponentImpl;
        private final SdkComponent sdkComponent;

        private HostedWebModuleComponentImpl(SdkComponent sdkComponent) {
            this.hostedWebModuleComponentImpl = this;
            this.sdkComponent = sdkComponent;
        }

        private HostedWebModuleExternalLinkRepositoryImpl hostedWebModuleExternalLinkRepositoryImpl() {
            OkHttpClient okHttpClient = this.sdkComponent.getOkHttpClient();
            e.f(okHttpClient);
            return new HostedWebModuleExternalLinkRepositoryImpl(okHttpClient);
        }

        @Override // com.onfido.hosted.web.module.di.HostedWebModuleComponent
        public HostedWebModuleExternalLinkViewModel getHostedWebModuleExternalLinkViewModel() {
            return new HostedWebModuleExternalLinkViewModel(hostedWebModuleExternalLinkRepositoryImpl());
        }

        @Override // com.onfido.hosted.web.module.di.HostedWebModuleComponent
        public HostedWebModuleViewModel getHostedWebModuleViewModel() {
            OnfidoConfig onfidoConfig = this.sdkComponent.onfidoConfig();
            e.f(onfidoConfig);
            Json jsonParser = this.sdkComponent.getJsonParser();
            e.f(jsonParser);
            OnfidoRemoteConfig onfidoRemoteConfig = this.sdkComponent.onfidoRemoteConfig();
            e.f(onfidoRemoteConfig);
            FlowTracker flowTracker = this.sdkComponent.flowTracker();
            e.f(flowTracker);
            OnfidoAnalytics onfidoAnalytics = this.sdkComponent.onfidoAnalytics();
            e.f(onfidoAnalytics);
            return new HostedWebModuleViewModel(onfidoConfig, jsonParser, onfidoRemoteConfig, flowTracker, onfidoAnalytics);
        }

        @Override // com.onfido.hosted.web.module.di.HostedWebModuleComponent
        public void inject(HostedWebModuleFragment hostedWebModuleFragment) {
        }

        public /* synthetic */ HostedWebModuleComponentImpl(SdkComponent sdkComponent, int i) {
            this(sdkComponent);
        }

        @Override // com.onfido.hosted.web.module.di.HostedWebModuleComponent
        public void inject(HostedWebModuleExternalLinkFragment hostedWebModuleExternalLinkFragment) {
        }
    }

    private DaggerHostedWebModuleComponent() {
    }

    public static HostedWebModuleComponent.Factory factory() {
        return new Factory(0);
    }
}
