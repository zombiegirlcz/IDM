package com.onfido.workflow;

import android.os.ResultReceiver;
import cl.c;
import cl.d;
import cl.e;
import com.onfido.android.sdk.FlowConfig;
import com.onfido.android.sdk.capture.EnterpriseFeatures;
import com.onfido.android.sdk.capture.OnfidoTheme;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventListener;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventResultReceiver;
import com.onfido.android.sdk.capture.biometricToken.BiometricTokenRetrievalService;
import com.onfido.android.sdk.capture.config.BiometricTokenCallback;
import com.onfido.android.sdk.capture.config.BiometricTokenCallbackResultReceiver;
import com.onfido.android.sdk.capture.config.MediaCallback;
import com.onfido.android.sdk.capture.config.MediaCallbackResultReceiver;
import com.onfido.android.sdk.capture.token.TokenExpirationHandler;
import com.onfido.android.sdk.capture.token.TokenExpirationHandlerService;
import com.onfido.workflow.internal.WorkflowConfigImpl;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001 R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015¨\u0006!"}, d2 = {"Lcom/onfido/workflow/WorkflowConfig;", "Lcom/onfido/android/sdk/FlowConfig;", "biometricTokenCallback", "Landroid/os/ResultReceiver;", "getBiometricTokenCallback", "()Landroid/os/ResultReceiver;", "enterpriseFeatures", "Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "getEnterpriseFeatures", "()Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "mediaCallback", "getMediaCallback", "onfidoAnalyticsEventListener", "getOnfidoAnalyticsEventListener", "sdkToken", "", "getSdkToken", "()Ljava/lang/String;", "theme", "Lcom/onfido/android/sdk/capture/OnfidoTheme;", "getTheme", "()Lcom/onfido/android/sdk/capture/OnfidoTheme;", "tokenExpirationHandlerEnabled", "", "getTokenExpirationHandlerEnabled", "()Z", "workflowRunId", "getWorkflowRunId", "Builder", "onfido-workflow-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface WorkflowConfig extends FlowConfig {

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0000J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/onfido/workflow/WorkflowConfig$Builder;", "", "sdkToken", "", "workflowRunId", "(Ljava/lang/String;Ljava/lang/String;)V", "backgroundRunDisabled", "", "biometricTokenCallback", "Landroid/os/ResultReceiver;", "enterpriseFeatures", "Lcom/onfido/android/sdk/capture/EnterpriseFeatures;", "locale", "Ljava/util/Locale;", "mediaCallback", "onfidoAnalyticsEventListener", "theme", "Lcom/onfido/android/sdk/capture/OnfidoTheme;", "tokenExpirationHandlerEnabled", "build", "Lcom/onfido/workflow/WorkflowConfig;", "disableBackgroundRun", "withAnalyticsEventListener", "eventListener", "Lcom/onfido/android/sdk/capture/analytics/OnfidoAnalyticsEventListener;", "withBiometricTokenCallback", "tokenCallback", "Lcom/onfido/android/sdk/capture/config/BiometricTokenCallback;", "withEnterpriseFeatures", "withLocale", "withMediaCallback", "Lcom/onfido/android/sdk/capture/config/MediaCallback;", "withTheme", "withTokenExpirationHandler", "tokenExpirationHandler", "Lcom/onfido/android/sdk/capture/token/TokenExpirationHandler;", "onfido-workflow-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private boolean backgroundRunDisabled;
        private ResultReceiver biometricTokenCallback;
        private EnterpriseFeatures enterpriseFeatures;
        private Locale locale;
        private ResultReceiver mediaCallback;
        private ResultReceiver onfidoAnalyticsEventListener;

        @NotNull
        private final String sdkToken;

        @NotNull
        private OnfidoTheme theme;
        private boolean tokenExpirationHandlerEnabled;

        @NotNull
        private final String workflowRunId;

        public Builder(@NotNull String sdkToken, @NotNull String workflowRunId) {
            e eVar;
            Intrinsics.checkNotNullParameter(sdkToken, "sdkToken");
            Intrinsics.checkNotNullParameter(workflowRunId, "workflowRunId");
            this.sdkToken = sdkToken;
            this.workflowRunId = workflowRunId;
            c cVar = new c(sdkToken, null);
            synchronized (cVar) {
                try {
                    if (cVar.f24910c == null) {
                        e.Companion.getClass();
                        cVar.f24910c = d.a(sdkToken);
                    }
                    eVar = cVar.f24910c;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            if (!(eVar != null ? Intrinsics.f(eVar.d, "studio") : false)) {
            }
            if (d0.W(sdkToken)) {
                throw new IllegalArgumentException("sdkToken can't be blank");
            }
            if (d0.W(workflowRunId)) {
                throw new IllegalArgumentException("workflowRunId can't be blank");
            }
            this.theme = OnfidoTheme.AUTOMATIC;
        }

        @NotNull
        public final WorkflowConfig build() {
            return new WorkflowConfigImpl(this.sdkToken, this.workflowRunId, this.locale, this.enterpriseFeatures, this.mediaCallback, this.biometricTokenCallback, this.tokenExpirationHandlerEnabled, this.backgroundRunDisabled, this.onfidoAnalyticsEventListener, this.theme);
        }

        @NotNull
        public final Builder disableBackgroundRun() {
            this.backgroundRunDisabled = true;
            return this;
        }

        @NotNull
        public final Builder withAnalyticsEventListener(@NotNull OnfidoAnalyticsEventListener eventListener) {
            Intrinsics.checkNotNullParameter(eventListener, "eventListener");
            this.onfidoAnalyticsEventListener = new OnfidoAnalyticsEventResultReceiver(eventListener);
            return this;
        }

        @NotNull
        public final Builder withBiometricTokenCallback(@NotNull BiometricTokenCallback tokenCallback) {
            Intrinsics.checkNotNullParameter(tokenCallback, "tokenCallback");
            BiometricTokenRetrievalService.INSTANCE.setTokenRetrievalCallback(tokenCallback);
            this.biometricTokenCallback = new BiometricTokenCallbackResultReceiver(tokenCallback);
            return this;
        }

        @NotNull
        public final Builder withEnterpriseFeatures(@NotNull EnterpriseFeatures enterpriseFeatures) {
            Intrinsics.checkNotNullParameter(enterpriseFeatures, "enterpriseFeatures");
            this.enterpriseFeatures = enterpriseFeatures;
            return this;
        }

        @NotNull
        public final Builder withLocale(@NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(locale, "locale");
            this.locale = locale;
            return this;
        }

        @NotNull
        public final Builder withMediaCallback(@NotNull MediaCallback mediaCallback) {
            Intrinsics.checkNotNullParameter(mediaCallback, "mediaCallback");
            this.mediaCallback = new MediaCallbackResultReceiver(mediaCallback);
            return this;
        }

        @NotNull
        public final Builder withTheme(@NotNull OnfidoTheme theme) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            this.theme = theme;
            return this;
        }

        @NotNull
        public final Builder withTokenExpirationHandler(@NotNull TokenExpirationHandler tokenExpirationHandler) {
            Intrinsics.checkNotNullParameter(tokenExpirationHandler, "tokenExpirationHandler");
            this.tokenExpirationHandlerEnabled = true;
            TokenExpirationHandlerService.INSTANCE.setTokenExpirationHandler(tokenExpirationHandler);
            return this;
        }
    }

    @Override // com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getBiometricTokenCallback */
    ResultReceiver getF();

    @Override // com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getEnterpriseFeatures */
    EnterpriseFeatures getD();

    @Override // com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getLocale */
    Locale getF50175c();

    @Override // com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getMediaCallback */
    ResultReceiver getE();

    @Override // com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getOnfidoAnalyticsEventListener */
    ResultReceiver getI();

    @Override // com.onfido.android.sdk.FlowConfig
    @NotNull
    /* JADX INFO: renamed from: getSdkToken */
    String getF50173a();

    @Override // com.onfido.android.sdk.FlowConfig
    @NotNull
    /* JADX INFO: renamed from: getTheme */
    OnfidoTheme getF50178j();

    @Override // com.onfido.android.sdk.FlowConfig
    /* JADX INFO: renamed from: getTokenExpirationHandlerEnabled */
    boolean getF50176g();

    @Override // com.onfido.android.sdk.FlowConfig
    @NotNull
    /* JADX INFO: renamed from: getWorkflowRunId */
    String getF50174b();
}
