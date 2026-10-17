package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.common.permissions.PermissionResult;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.component.active.video.capture.analytics.AvcAnalyticsEvent;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.GetFaceDetectionModuleAvailabilityUseCase;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j6.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import tgm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 W2\u00020\u0001:\u0003WXYB_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u001cJ\r\u0010$\u001a\u00020\u0017¢\u0006\u0004\b$\u0010\u0019J\r\u0010%\u001a\u00020\u0017¢\u0006\u0004\b%\u0010\u0019J\r\u0010&\u001a\u00020\u0017¢\u0006\u0004\b&\u0010\u0019J\r\u0010'\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u00172\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0017H\u0014¢\u0006\u0004\b9\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010(R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bH\u0010(R\u0016\u0010I\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010FR\"\u0010M\u001a\u0010\u0012\f\u0012\n L*\u0004\u0018\u00010K0K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020K0R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "navigator", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "navigationManagerHolder", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "runtimePermissionsManager", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "analytics", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase;", "getFaceDetectionModuleAvailabilityUseCase", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "", "audioEnabled", "showIntro", "<init>", "(Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Landroidx/lifecycle/SavedStateHandle;ZZ)V", "", "initializeNavigation", "()V", "isGooglePlayServiceAvailable", "checkMLKitAvailability", "(Z)V", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "getCaptureType", "()Lcom/onfido/android/sdk/capture/ui/CaptureType;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionCaptureScreen;", "createMotionCaptureScreen", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionCaptureScreen;", "initialize", "navigateToCaptureScreen", "restartCaptureNavigation", "restorePermissions", "hasPermissions", "()Z", "Lcom/onfido/android/sdk/capture/common/permissions/PermissionResult;", "permissionResult", "onPermissionsScreenResult", "(Lcom/onfido/android/sdk/capture/common/permissions/PermissionResult;)V", "", "grantResults", "onPermissionsRequestResult", "([I)V", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "uploadArtifact", "onVideoUploadSuccess", "(Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "onCleared", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "getNavigator", "()Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "getNavigationManagerHolder", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/domain/usecase/GetFaceDetectionModuleAvailabilityUseCase;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Landroidx/lifecycle/SavedStateHandle;", "Z", "getAudioEnabled", "getShowIntro", "shouldUseMLKit", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent;", "kotlin.jvm.PlatformType", "viewEventSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lio/reactivex/rxjava3/core/Observable;", "viewEvent", "Lio/reactivex/rxjava3/core/Observable;", "getViewEvent", "()Lio/reactivex/rxjava3/core/Observable;", "Companion", "Factory", "ViewEvent", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionHostViewModel extends ViewModel {

    @NotNull
    private final OnfidoAnalytics analytics;
    private final boolean audioEnabled;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final GetFaceDetectionModuleAvailabilityUseCase getFaceDetectionModuleAvailabilityUseCase;

    @NotNull
    private final NavigationManagerHolder navigationManagerHolder;

    @NotNull
    private final Navigator navigator;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private final RuntimePermissionsManager runtimePermissionsManager;

    @NotNull
    private final SavedStateHandle savedStateHandle;

    @NotNull
    private final SchedulersProvider schedulersProvider;
    private boolean shouldUseMLKit;
    private final boolean showIntro;

    @NotNull
    private final Observable viewEvent;

    @NotNull
    private final PublishSubject viewEventSubject;

    @NotNull
    private static final String KEY_NAVIGATOR_INITIALIZED = "key_navigator_initialized";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$Companion;", "", "()V", "KEY_NAVIGATOR_INITIALIZED", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "audioEnabled", "", "showIntro", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        MotionHostViewModel create(@NotNull SavedStateHandle savedStateHandle, boolean audioEnabled, boolean showIntro);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent;", "", "Error", "Loading", "RequestPermission", "VideoUploaded", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$Error;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$Loading;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$RequestPermission;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$VideoUploaded;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ViewEvent {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$Error;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error implements ViewEvent {

            @NotNull
            private final String message;

            public Error(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            public final Error copy(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.f(this.message, ((Error) other).message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return a.u(new StringBuilder("Error(message="), this.message, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$Loading;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent;", "show", "", "(Z)V", "getShow", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewEvent {
            private final boolean show;

            public Loading(boolean z) {
                this.show = z;
            }

            public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj2) {
                if ((i & 1) != 0) {
                    z = loading.show;
                }
                return loading.copy(z);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final boolean getShow() {
                return this.show;
            }

            @NotNull
            public final Loading copy(boolean show) {
                return new Loading(show);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && this.show == ((Loading) other).show;
            }

            public final boolean getShow() {
                return this.show;
            }

            public int hashCode() {
                return Boolean.hashCode(this.show);
            }

            @NotNull
            public String toString() {
                return a.x(new StringBuilder("Loading(show="), this.show, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$RequestPermission;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent;", "permissions", "", "", "(Ljava/util/List;)V", "getPermissions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RequestPermission implements ViewEvent {

            @NotNull
            private final List<String> permissions;

            public RequestPermission(@NotNull List<String> permissions) {
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                this.permissions = permissions;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RequestPermission copy$default(RequestPermission requestPermission, List list, int i, Object obj2) {
                if ((i & 1) != 0) {
                    list = requestPermission.permissions;
                }
                return requestPermission.copy(list);
            }

            @NotNull
            public final List<String> component1() {
                return this.permissions;
            }

            @NotNull
            public final RequestPermission copy(@NotNull List<String> permissions) {
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                return new RequestPermission(permissions);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RequestPermission) && Intrinsics.f(this.permissions, ((RequestPermission) other).permissions);
            }

            @NotNull
            public final List<String> getPermissions() {
                return this.permissions;
            }

            public int hashCode() {
                return this.permissions.hashCode();
            }

            @NotNull
            public String toString() {
                return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.permissions, new StringBuilder("RequestPermission(permissions="));
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent$VideoUploaded;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel$ViewEvent;", "uploadedArtifact", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "(Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;)V", "getUploadedArtifact", "()Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VideoUploaded implements ViewEvent {

            @NotNull
            private final UploadedArtifact uploadedArtifact;

            public VideoUploaded(@NotNull UploadedArtifact uploadedArtifact) {
                Intrinsics.checkNotNullParameter(uploadedArtifact, "uploadedArtifact");
                this.uploadedArtifact = uploadedArtifact;
            }

            public static /* synthetic */ VideoUploaded copy$default(VideoUploaded videoUploaded, UploadedArtifact uploadedArtifact, int i, Object obj2) {
                if ((i & 1) != 0) {
                    uploadedArtifact = videoUploaded.uploadedArtifact;
                }
                return videoUploaded.copy(uploadedArtifact);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final UploadedArtifact getUploadedArtifact() {
                return this.uploadedArtifact;
            }

            @NotNull
            public final VideoUploaded copy(@NotNull UploadedArtifact uploadedArtifact) {
                Intrinsics.checkNotNullParameter(uploadedArtifact, "uploadedArtifact");
                return new VideoUploaded(uploadedArtifact);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VideoUploaded) && Intrinsics.f(this.uploadedArtifact, ((VideoUploaded) other).uploadedArtifact);
            }

            @NotNull
            public final UploadedArtifact getUploadedArtifact() {
                return this.uploadedArtifact;
            }

            public int hashCode() {
                return this.uploadedArtifact.hashCode();
            }

            @NotNull
            public String toString() {
                return "VideoUploaded(uploadedArtifact=" + this.uploadedArtifact + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }
    }

    public MotionHostViewModel(@NotNull Navigator navigator, @NotNull NavigationManagerHolder navigationManagerHolder, @NotNull RuntimePermissionsManager runtimePermissionsManager, @NotNull OnfidoAnalytics analytics, @NotNull OnfidoRemoteConfig onfidoRemoteConfig, @NotNull GetFaceDetectionModuleAvailabilityUseCase getFaceDetectionModuleAvailabilityUseCase, @NotNull SchedulersProvider schedulersProvider, @NotNull SavedStateHandle savedStateHandle, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigationManagerHolder, "navigationManagerHolder");
        Intrinsics.checkNotNullParameter(runtimePermissionsManager, "runtimePermissionsManager");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(getFaceDetectionModuleAvailabilityUseCase, "getFaceDetectionModuleAvailabilityUseCase");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.navigator = navigator;
        this.navigationManagerHolder = navigationManagerHolder;
        this.runtimePermissionsManager = runtimePermissionsManager;
        this.analytics = analytics;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.getFaceDetectionModuleAvailabilityUseCase = getFaceDetectionModuleAvailabilityUseCase;
        this.schedulersProvider = schedulersProvider;
        this.savedStateHandle = savedStateHandle;
        this.audioEnabled = z;
        this.showIntro = z3;
        PublishSubject publishSubjectN = ch.qos.logback.core.util.a.n("create(...)");
        this.viewEventSubject = publishSubjectN;
        this.compositeDisposable = new CompositeDisposable();
        Observable observableHide = publishSubjectN.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.viewEvent = observableHide;
    }

    private final void checkMLKitAvailability(boolean isGooglePlayServiceAvailable) {
        if (!isGooglePlayServiceAvailable) {
            this.analytics.track(AvcAnalyticsEvent.PlayServicesError.INSTANCE);
            initializeNavigation();
            return;
        }
        this.viewEventSubject.onNext(new ViewEvent.Loading(true));
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        d dVar = new d(this.getFaceDetectionModuleAvailabilityUseCase.invoke().k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()), new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(this, 3), 1);
        g gVar = new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel.checkMLKitAvailability.2
            @Override // igm.g
            public final void accept(@NotNull GetFaceDetectionModuleAvailabilityUseCase.Result it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, GetFaceDetectionModuleAvailabilityUseCase.Result.Available.INSTANCE)) {
                    MotionHostViewModel.this.shouldUseMLKit = true;
                } else {
                    MotionHostViewModel.this.analytics.track(new AvcAnalyticsEvent.MLKitError("Face Detection module is not available on the device"));
                }
            }
        };
        final Timber.Companion companion = Timber.INSTANCE;
        Disposable disposableI = dVar.i(gVar, new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel.checkMLKitAvailability.3
            @Override // igm.g
            public final void accept(Throwable th10) {
                companion.e(th10);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkMLKitAvailability$lambda$0(MotionHostViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.viewEventSubject.onNext(new ViewEvent.Loading(false));
        this$0.initializeNavigation();
    }

    private final MotionCaptureScreen createMotionCaptureScreen() {
        return new MotionCaptureScreen(this.shouldUseMLKit, this.onfidoRemoteConfig.isMotionCameraXEnabled());
    }

    private final CaptureType getCaptureType() {
        return this.audioEnabled ? CaptureType.VIDEO : CaptureType.FACE;
    }

    private final void initializeNavigation() {
        if (this.savedStateHandle.contains("key_navigator_initialized")) {
            return;
        }
        if (this.showIntro) {
            this.navigator.navigateTo(MotionIntroScreen.INSTANCE);
        } else {
            navigateToCaptureScreen();
        }
        this.savedStateHandle.set("key_navigator_initialized", Boolean.TRUE);
    }

    public final boolean getAudioEnabled() {
        return this.audioEnabled;
    }

    @NotNull
    public final NavigationManagerHolder getNavigationManagerHolder() {
        return this.navigationManagerHolder;
    }

    @NotNull
    public final Navigator getNavigator() {
        return this.navigator;
    }

    public final boolean getShowIntro() {
        return this.showIntro;
    }

    @NotNull
    public final Observable getViewEvent() {
        return this.viewEvent;
    }

    public final boolean hasPermissions() {
        return this.runtimePermissionsManager.hasPermissionsForCaptureType(getCaptureType());
    }

    public final void initialize(boolean isGooglePlayServiceAvailable) {
        if (this.onfidoRemoteConfig.isMotionTensorFlowLiteEnabled()) {
            initializeNavigation();
        } else {
            checkMLKitAvailability(isGooglePlayServiceAvailable);
        }
    }

    public final void navigateToCaptureScreen() {
        Navigator navigator;
        Screen permissionsScreen;
        if (hasPermissions()) {
            navigator = this.navigator;
            permissionsScreen = createMotionCaptureScreen();
        } else {
            navigator = this.navigator;
            permissionsScreen = new PermissionsScreen(new CaptureStepDataBundle(getCaptureType(), null, null, null, null, null, null, 126, null));
        }
        navigator.navigateTo(permissionsScreen);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    public final void onError(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String message = error.getMessage();
        if (message == null) {
            message = "";
        }
        Timber.INSTANCE.e(message, new Object[0]);
        this.analytics.track(new AvcAnalyticsEvent.CameraError(message));
        this.viewEventSubject.onNext(new ViewEvent.Error(message));
    }

    public final void onPermissionsRequestResult(@NotNull int[] grantResults) {
        Navigator navigator;
        Screen permissionsScreen;
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.runtimePermissionsManager.werePermissionsGranted$onfido_capture_sdk_core_release(grantResults)) {
            navigator = this.navigator;
            permissionsScreen = createMotionCaptureScreen();
        } else {
            navigator = this.navigator;
            permissionsScreen = new PermissionsScreen(new CaptureStepDataBundle(getCaptureType(), null, null, null, null, null, null, 126, null));
        }
        navigator.navigateTo(permissionsScreen);
    }

    public final void onPermissionsScreenResult(@NotNull PermissionResult permissionResult) {
        Intrinsics.checkNotNullParameter(permissionResult, "permissionResult");
        this.navigator.exitCurrentScreen();
        if (permissionResult instanceof PermissionResult.Granted) {
            List<String> permissionsForCaptureType = this.runtimePermissionsManager.getPermissionsForCaptureType(((PermissionResult.Granted) permissionResult).getCaptureStepDataBundle().getCaptureType());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : permissionsForCaptureType) {
                if (!this.runtimePermissionsManager.hasPermission((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                this.navigator.navigateTo(createMotionCaptureScreen());
            } else {
                this.viewEventSubject.onNext(new ViewEvent.RequestPermission(arrayList));
            }
        }
    }

    public final void onVideoUploadSuccess(@NotNull UploadedArtifact uploadArtifact) {
        Intrinsics.checkNotNullParameter(uploadArtifact, "uploadArtifact");
        this.viewEventSubject.onNext(new ViewEvent.VideoUploaded(uploadArtifact));
    }

    public final void restartCaptureNavigation() {
        this.navigator.exitCurrentScreen();
        if (this.showIntro) {
            return;
        }
        navigateToCaptureScreen();
    }

    public final void restorePermissions() {
        this.navigator.exitCurrentScreen();
        this.navigator.navigateTo(new PermissionsScreen(new CaptureStepDataBundle(getCaptureType(), null, null, null, null, null, null, 126, null)));
    }
}
