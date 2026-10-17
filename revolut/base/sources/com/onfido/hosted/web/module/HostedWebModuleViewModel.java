package com.onfido.hosted.web.module;

import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.Event;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.JsonExtKt;
import com.onfido.android.sdk.capture.utils.StringExtensionsKt;
import com.onfido.hosted.web.module.WebModuleScriptBuilder;
import com.onfido.hosted.web.module.model.CaptureSDKExternalLinkResponse;
import com.onfido.hosted.web.module.model.HostedWebModuleCallbacks;
import com.onfido.hosted.web.module.model.HostedWebModuleCancelled;
import com.onfido.hosted.web.module.model.HostedWebModuleExit;
import com.onfido.hosted.web.module.model.HostedWebModuleFailed;
import com.onfido.hosted.web.module.model.HostedWebModuleModuleInfo;
import com.onfido.hosted.web.module.model.HostedWebModuleResponseAnalytics;
import com.onfido.hosted.web.module.model.HostedWebModuleScriptState;
import com.onfido.hosted.web.module.model.HostedWebModuleSuccess;
import java.util.Map;
import jh.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import rlm.j;
import vkm.j2;
import vkm.q;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0003>?@B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0017\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010%H\u0000¢\u0006\u0002\b'J\u0016\u0010(\u001a\u00020%2\u0006\u0010 \u001a\u00020!2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020%J\u0010\u0010,\u001a\u00020%2\u0006\u0010 \u001a\u00020!H\u0002J\r\u0010-\u001a\u00020\u001fH\u0000¢\u0006\u0002\b.J\r\u0010/\u001a\u00020\u001fH\u0000¢\u0006\u0002\b0J\u0006\u00101\u001a\u00020\u001fJ\u0006\u00102\u001a\u00020\u001fJ\u0016\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020%J\u0010\u00107\u001a\u00020\u001f2\u0006\u00106\u001a\u00020%H\u0002J\b\u00108\u001a\u00020\u001fH\u0002J\b\u00109\u001a\u00020\u001fH\u0002J\u0010\u0010:\u001a\u00020\u001f2\u0006\u00106\u001a\u00020%H\u0002J\u0010\u0010;\u001a\u00020\u001f2\u0006\u00106\u001a\u00020%H\u0002J\u0010\u0010<\u001a\u00020\u001f2\u0006\u00106\u001a\u00020%H\u0002J\b\u0010=\u001a\u00020\u001fH\u0002R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019¨\u0006A"}, d2 = {"Lcom/onfido/hosted/web/module/HostedWebModuleViewModel;", "Landroidx/lifecycle/ViewModel;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "parser", "Lkotlinx/serialization/json/Json;", "remoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "flowTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "analytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "(Lcom/onfido/android/sdk/capture/OnfidoConfig;Lkotlinx/serialization/json/Json;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;)V", "_externalLinkCommand", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$ExternalNavigationLinkCommand;", "_result", "Lcom/onfido/hosted/web/module/model/HostedWebModuleResult;", "_shouldEvaluateScript", "Lcom/onfido/hosted/web/module/model/HostedWebModuleScriptState;", "getAnalytics$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "externalLinkCommand", "Lkotlinx/coroutines/flow/StateFlow;", "getExternalLinkCommand$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/StateFlow;", "result", "getResult$onfido_capture_sdk_core_release", "shouldEvaluateScript", "getShouldEvaluateScript$onfido_capture_sdk_core_release", "flowUserExit", "", "moduleInfo", "Lcom/onfido/hosted/web/module/model/HostedWebModuleModuleInfo;", "flowUserExitCanceled", "flowUserExitConfirmed", "getBridgeUrl", "", "receivedCustomUrl", "getBridgeUrl$onfido_capture_sdk_core_release", "getCaptureSDKConfigScript", "webSdkTheme", "Lcom/onfido/hosted/web/module/WebModuleScriptBuilder$WebSDKTheme;", "getNavigateBackScript", "getStep", "onCaptureSDKExternalLinkCommandExecuted", "onCaptureSDKExternalLinkCommandExecuted$onfido_capture_sdk_core_release", "onErrorRetried", "onErrorRetried$onfido_capture_sdk_core_release", "onPageFinished", "onScriptEvaluated", "processCallback", "type", "Lcom/onfido/hosted/web/module/model/HostedWebModuleCallbacks;", "message", "processCaptureSdkAnalytics", "processCaptureSdkBackNavigation", "processCaptureSdkCloseExternalLink", "processCaptureSdkExternalLink", "processCaptureSdkModuleError", "processCaptureSdkModuleFinish", "processCaptureSdkNavigationExit", "CloseExternalNavigationLink", "ExternalNavigationLinkCommand", "OpenExternalNavigationLink", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HostedWebModuleViewModel extends ViewModel {

    @NotNull
    private final MutableStateFlow _externalLinkCommand;

    @NotNull
    private final MutableStateFlow _result;

    @NotNull
    private final MutableStateFlow _shouldEvaluateScript;

    @NotNull
    private final OnfidoAnalytics analytics;

    @NotNull
    private final StateFlow externalLinkCommand;

    @NotNull
    private final FlowTracker flowTracker;

    @NotNull
    private final OnfidoConfig onfidoConfig;

    @NotNull
    private final Json parser;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;

    @NotNull
    private final StateFlow result;

    @NotNull
    private final StateFlow shouldEvaluateScript;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$CloseExternalNavigationLink;", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$ExternalNavigationLinkCommand;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseExternalNavigationLink implements ExternalNavigationLinkCommand {

        @NotNull
        public static final CloseExternalNavigationLink INSTANCE = new CloseExternalNavigationLink();

        private CloseExternalNavigationLink() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof CloseExternalNavigationLink);
        }

        public int hashCode() {
            return -1578873821;
        }

        @NotNull
        public String toString() {
            return "CloseExternalNavigationLink";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$ExternalNavigationLinkCommand;", "", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$CloseExternalNavigationLink;", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$OpenExternalNavigationLink;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ExternalNavigationLinkCommand {
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$OpenExternalNavigationLink;", "Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$ExternalNavigationLinkCommand;", "url", "", "target", "Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;", "fullscreen", "", "(Ljava/lang/String;Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;Ljava/lang/Boolean;)V", "getFullscreen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTarget", "()Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/onfido/hosted/web/module/model/CaptureSDKExternalLinkResponse$LinkTarget;Ljava/lang/Boolean;)Lcom/onfido/hosted/web/module/HostedWebModuleViewModel$OpenExternalNavigationLink;", "equals", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenExternalNavigationLink implements ExternalNavigationLinkCommand {
        private final Boolean fullscreen;
        private final CaptureSDKExternalLinkResponse.LinkTarget target;

        @NotNull
        private final String url;

        public OpenExternalNavigationLink(@NotNull String url2, CaptureSDKExternalLinkResponse.LinkTarget linkTarget, Boolean bool) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.url = url2;
            this.target = linkTarget;
            this.fullscreen = bool;
        }

        public static /* synthetic */ OpenExternalNavigationLink copy$default(OpenExternalNavigationLink openExternalNavigationLink, String str, CaptureSDKExternalLinkResponse.LinkTarget linkTarget, Boolean bool, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = openExternalNavigationLink.url;
            }
            if ((i & 2) != 0) {
                linkTarget = openExternalNavigationLink.target;
            }
            if ((i & 4) != 0) {
                bool = openExternalNavigationLink.fullscreen;
            }
            return openExternalNavigationLink.copy(str, linkTarget, bool);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CaptureSDKExternalLinkResponse.LinkTarget getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Boolean getFullscreen() {
            return this.fullscreen;
        }

        @NotNull
        public final OpenExternalNavigationLink copy(@NotNull String url2, CaptureSDKExternalLinkResponse.LinkTarget target, Boolean fullscreen) {
            Intrinsics.checkNotNullParameter(url2, "url");
            return new OpenExternalNavigationLink(url2, target, fullscreen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenExternalNavigationLink)) {
                return false;
            }
            OpenExternalNavigationLink openExternalNavigationLink = (OpenExternalNavigationLink) other;
            return Intrinsics.f(this.url, openExternalNavigationLink.url) && this.target == openExternalNavigationLink.target && Intrinsics.f(this.fullscreen, openExternalNavigationLink.fullscreen);
        }

        public final Boolean getFullscreen() {
            return this.fullscreen;
        }

        public final CaptureSDKExternalLinkResponse.LinkTarget getTarget() {
            return this.target;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            CaptureSDKExternalLinkResponse.LinkTarget linkTarget = this.target;
            int iHashCode2 = (iHashCode + (linkTarget == null ? 0 : linkTarget.hashCode())) * 31;
            Boolean bool = this.fullscreen;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OpenExternalNavigationLink(url=" + this.url + ", target=" + this.target + ", fullscreen=" + this.fullscreen + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HostedWebModuleCallbacks.values().length];
            try {
                iArr[HostedWebModuleCallbacks.CAPTURE_MODULE_FINISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HostedWebModuleCallbacks.CAPTURE_MODULE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HostedWebModuleCallbacks.BOOTSTRAP_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HostedWebModuleCallbacks.CAPTURE_MODULE_UNSUPPORTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HostedWebModuleCallbacks.ANALYTICS_SEND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HostedWebModuleCallbacks.NAVIGATION_EXTERNAL_LINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HostedWebModuleCallbacks.NAVIGATION_CLOSE_EXTERNAL_LINK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HostedWebModuleCallbacks.NAVIGATION_EXIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HostedWebModuleCallbacks.NAVIGATION_BACK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HostedWebModuleViewModel(@NotNull OnfidoConfig onfidoConfig, @NotNull Json parser, @NotNull OnfidoRemoteConfig remoteConfig, @NotNull FlowTracker flowTracker, @NotNull OnfidoAnalytics analytics) {
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(flowTracker, "flowTracker");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.onfidoConfig = onfidoConfig;
        this.parser = parser;
        this.remoteConfig = remoteConfig;
        this.flowTracker = flowTracker;
        this.analytics = analytics;
        j2 j2VarC = q.c(null);
        this._result = j2VarC;
        this.result = q.h(j2VarC);
        j2 j2VarC2 = q.c(null);
        this._externalLinkCommand = j2VarC2;
        this.externalLinkCommand = q.h(j2VarC2);
        j2 j2VarC3 = q.c(HostedWebModuleScriptState.NOT_EVALUATED);
        this._shouldEvaluateScript = j2VarC3;
        this.shouldEvaluateScript = q.h(j2VarC3);
    }

    private final String getStep(HostedWebModuleModuleInfo moduleInfo) {
        if (moduleInfo.getStudioInfo() != null) {
            return moduleInfo.getStudioInfo().getTaskDefId();
        }
        if (moduleInfo.getClassicInfo() != null) {
            return moduleInfo.getClassicInfo().getStep();
        }
        throw new IllegalArgumentException("Both studio and classic Info cannot be null");
    }

    private final void processCaptureSdkAnalytics(String message) {
        try {
            Json json = this.parser;
            HostedWebModuleResponseAnalytics hostedWebModuleResponseAnalytics = (HostedWebModuleResponseAnalytics) json.b(d.v(json.f187949b, o0.b(HostedWebModuleResponseAnalytics.class)), message);
            HostedWebModuleResponseAnalytics.Event event = hostedWebModuleResponseAnalytics.getEvent();
            Map<String, String> mapComponent2 = hostedWebModuleResponseAnalytics.component2();
            EventType eventTypeFromProperties = HostedWebModuleViewModelKt.getEventTypeFromProperties(mapComponent2);
            OnfidoAnalytics onfidoAnalytics = this.analytics;
            Event event2 = new Event(event.getName(), eventTypeFromProperties, null, null, 12, null);
            if (mapComponent2 == null) {
                mapComponent2 = r0.g();
            }
            onfidoAnalytics.track(new AnalyticsEvent(event2, mapComponent2, null, 4, null));
        } catch (Exception e) {
            Timber.INSTANCE.e(e);
        }
    }

    private final void processCaptureSdkBackNavigation() {
        this._result.setValue(HostedWebModuleCancelled.INSTANCE);
    }

    private final void processCaptureSdkCloseExternalLink() {
        this._externalLinkCommand.setValue(CloseExternalNavigationLink.INSTANCE);
    }

    private final void processCaptureSdkExternalLink(String message) {
        Json json = this.parser;
        CaptureSDKExternalLinkResponse captureSDKExternalLinkResponse = (CaptureSDKExternalLinkResponse) json.b(d.v(json.f187949b, o0.b(CaptureSDKExternalLinkResponse.class)), message);
        this._externalLinkCommand.setValue(new OpenExternalNavigationLink(captureSDKExternalLinkResponse.getUrl(), captureSDKExternalLinkResponse.getTarget(), captureSDKExternalLinkResponse.getFullscreen()));
    }

    private final void processCaptureSdkModuleError(String message) {
        try {
            Json json = this.parser;
            this._result.setValue(new HostedWebModuleFailed(String.valueOf(JsonExtKt.convertCamelToSnakeCase((JsonElement) json.b(d.v(json.f187949b, o0.b(JsonElement.class)), message)))));
        } catch (SerializationException e) {
            this._result.setValue(new HostedWebModuleFailed(new JsonObject(q0.c(new Pair("error", j.c(e.getMessage())))).toString()));
            Timber.INSTANCE.d("Received captureModuleError data from the CaptureSDK - Error deserializing (SerializationException): " + e, new Object[0]);
        }
    }

    private final void processCaptureSdkModuleFinish(String message) {
        try {
            Json json = this.parser;
            this._result.setValue(new HostedWebModuleSuccess(String.valueOf(JsonExtKt.convertCamelToSnakeCase((JsonElement) json.b(d.v(json.f187949b, o0.b(JsonElement.class)), message)))));
        } catch (SerializationException e) {
            this._result.setValue(new HostedWebModuleFailed(new JsonObject(q0.c(new Pair("error", j.c(e.getMessage())))).toString()));
            Timber.INSTANCE.d("Received captureSdkModuleFinish data from the CaptureSDK - Error deserializing (SerializationException): " + e, new Object[0]);
        }
    }

    private final void processCaptureSdkNavigationExit() {
        this._result.setValue(new HostedWebModuleExit());
    }

    public final void flowUserExit(@NotNull HostedWebModuleModuleInfo moduleInfo) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        this.flowTracker.trackFlowUserExitButtonClicked(getStep(moduleInfo));
    }

    public final void flowUserExitCanceled(@NotNull HostedWebModuleModuleInfo moduleInfo) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        this.flowTracker.trackFlowUserExitCanceled(getStep(moduleInfo));
    }

    public final void flowUserExitConfirmed(@NotNull HostedWebModuleModuleInfo moduleInfo) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        this.flowTracker.trackFlowUserExitConfirmed(getStep(moduleInfo));
    }

    @NotNull
    /* JADX INFO: renamed from: getAnalytics$onfido_capture_sdk_core_release, reason: from getter */
    public final OnfidoAnalytics getAnalytics() {
        return this.analytics;
    }

    @NotNull
    public final String getBridgeUrl$onfido_capture_sdk_core_release(String receivedCustomUrl) {
        if (!StringExtensionsKt.isNotNullOrEmpty(receivedCustomUrl)) {
            receivedCustomUrl = "https://sdk.onfido.com/capture/bridge/1.2/bridge.html";
        } else if (receivedCustomUrl == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Timber.INSTANCE.i("getBridgeUrl - will use: ".concat(receivedCustomUrl), new Object[0]);
        return receivedCustomUrl;
    }

    @NotNull
    public final String getCaptureSDKConfigScript(@NotNull HostedWebModuleModuleInfo moduleInfo, @NotNull WebModuleScriptBuilder.WebSDKTheme webSdkTheme) {
        Intrinsics.checkNotNullParameter(moduleInfo, "moduleInfo");
        Intrinsics.checkNotNullParameter(webSdkTheme, "webSdkTheme");
        return new WebModuleScriptBuilder().getConfigScript(moduleInfo, this.onfidoConfig.getToken().f50152a, this.remoteConfig.isStudioUserFlowExitEnabled() && moduleInfo.getStudioInfo() != null, webSdkTheme, this.onfidoConfig.getLocale());
    }

    @NotNull
    /* JADX INFO: renamed from: getExternalLinkCommand$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getExternalLinkCommand() {
        return this.externalLinkCommand;
    }

    @NotNull
    public final String getNavigateBackScript() {
        return new WebModuleScriptBuilder().getNavigateBackScript();
    }

    @NotNull
    /* JADX INFO: renamed from: getResult$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getResult() {
        return this.result;
    }

    @NotNull
    /* JADX INFO: renamed from: getShouldEvaluateScript$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getShouldEvaluateScript() {
        return this.shouldEvaluateScript;
    }

    public final void onCaptureSDKExternalLinkCommandExecuted$onfido_capture_sdk_core_release() {
        this._externalLinkCommand.setValue(null);
    }

    public final void onErrorRetried$onfido_capture_sdk_core_release() {
        this._result.setValue(null);
        this._shouldEvaluateScript.setValue(HostedWebModuleScriptState.NOT_EVALUATED);
    }

    public final void onPageFinished() {
        if (this._shouldEvaluateScript.getValue() == HostedWebModuleScriptState.NOT_EVALUATED) {
            this._shouldEvaluateScript.setValue(HostedWebModuleScriptState.SHOULD_EVALUATE);
        }
    }

    public final void onScriptEvaluated() {
        this._shouldEvaluateScript.setValue(HostedWebModuleScriptState.EVALUATED);
    }

    public final void processCallback(@NotNull HostedWebModuleCallbacks type, @NotNull String message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                processCaptureSdkModuleFinish(message);
                break;
            case 2:
            case 3:
            case 4:
                processCaptureSdkModuleError(message);
                break;
            case 5:
                processCaptureSdkAnalytics(message);
                break;
            case 6:
                processCaptureSdkExternalLink(message);
                break;
            case 7:
                processCaptureSdkCloseExternalLink();
                break;
            case 8:
                processCaptureSdkNavigationExit();
                break;
            case 9:
                processCaptureSdkBackNavigation();
                break;
            default:
                Timber.INSTANCE.i("Not implemented yet", new Object[0]);
                break;
        }
    }
}
