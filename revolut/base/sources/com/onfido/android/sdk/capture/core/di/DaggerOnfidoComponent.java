package com.onfido.android.sdk.capture.core.di;

import com.onfido.android.sdk.capture.common.di.SdkComponent;
import com.onfido.android.sdk.capture.core.OnfidoFragment;
import com.onfido.android.sdk.capture.core.OnfidoFragment_MembersInjector;
import com.onfido.android.sdk.capture.core.OnfidoViewModel;
import com.onfido.android.sdk.capture.core.di.OnfidoComponent;

/* JADX INFO: loaded from: classes17.dex */
public final class DaggerOnfidoComponent {

    public static final class Factory implements OnfidoComponent.Factory {
        private Factory() {
        }

        @Override // com.onfido.android.sdk.capture.core.di.OnfidoComponent.Factory
        public OnfidoComponent create(SdkComponent sdkComponent) {
            sdkComponent.getClass();
            return new OnfidoComponentImpl(sdkComponent, 0);
        }

        public /* synthetic */ Factory(int i) {
            this();
        }
    }

    public static final class OnfidoComponentImpl extends OnfidoComponent {
        private final OnfidoComponentImpl onfidoComponentImpl;
        private final SdkComponent sdkComponent;

        private OnfidoComponentImpl(SdkComponent sdkComponent) {
            this.onfidoComponentImpl = this;
            this.sdkComponent = sdkComponent;
        }

        private OnfidoFragment injectOnfidoFragment(OnfidoFragment onfidoFragment) {
            OnfidoFragment_MembersInjector.injectViewModel(onfidoFragment, getOnfidoViewModel$onfido_capture_sdk_core_release());
            return onfidoFragment;
        }

        @Override // com.onfido.android.sdk.capture.core.di.OnfidoComponent
        public OnfidoViewModel getOnfidoViewModel$onfido_capture_sdk_core_release() {
            return new OnfidoViewModel(this.sdkComponent.flowConfig());
        }

        @Override // com.onfido.android.sdk.capture.core.di.OnfidoComponent
        public void inject$onfido_capture_sdk_core_release(OnfidoFragment onfidoFragment) {
            injectOnfidoFragment(onfidoFragment);
        }

        public /* synthetic */ OnfidoComponentImpl(SdkComponent sdkComponent, int i) {
            this(sdkComponent);
        }
    }

    private DaggerOnfidoComponent() {
    }

    public static OnfidoComponent.Factory factory() {
        return new Factory(0);
    }
}
