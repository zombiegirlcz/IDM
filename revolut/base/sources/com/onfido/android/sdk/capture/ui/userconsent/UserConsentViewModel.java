package com.onfido.android.sdk.capture.ui.userconsent;

import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.UIEvent;
import com.onfido.android.sdk.capture.internal.util.UIEventManager;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ogm.k;
import ogm.m;
import org.jetbrains.annotations.NotNull;
import tgm.e;
import yhm.j;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0004;<=>BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0014J\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0014J\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002010-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100R!\u0010:\u001a\b\u0012\u0004\u0012\u000205048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006?"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentRepository;", "userConsentRepository", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "flowTracker", "<init>", "(Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentRepository;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/OnfidoConfig;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;)V", "", "loadUserConsentPage", "()V", "onStart", "onCleared", "onAcceptClicked", "onRejectClicked", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent;", "uiEvent", "consumeUIEvent", "(Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent;)V", "flowUserExit", "flowUserExitConfirmed", "flowUserExitCanceled", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentRepository;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lcom/onfido/android/sdk/capture/internal/util/UIEventManager;", "uiEventsManager", "Lcom/onfido/android/sdk/capture/internal/util/UIEventManager;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$LoadingState;", "isLoading", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "", "userConsentPage", "errorMessage", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$ViewState;", "state$delegate", "Lkotlin/Lazy;", "getState", "()Lio/reactivex/rxjava3/core/Observable;", "state", "Companion", "LoadingState", "UserConsentUIEvent", "ViewState", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserConsentViewModel extends ViewModel {

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final BehaviorSubject errorMessage;

    @NotNull
    private final FlowTracker flowTracker;

    @NotNull
    private final BehaviorSubject isLoading;

    @NotNull
    private final OnfidoConfig onfidoConfig;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final ScreenTracker screenTracker;

    /* JADX INFO: renamed from: state$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy state;

    @NotNull
    private final UIEventManager<UserConsentUIEvent> uiEventsManager;

    @NotNull
    private final BehaviorSubject userConsentPage;

    @NotNull
    private final UserConsentRepository userConsentRepository;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    @NotNull
    private static final String STEP_USER_CONSENT = "user_consent";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$LoadingState;", "", "isLoading", "", "loadingReason", "", "(ZLjava/lang/String;)V", "()Z", "getLoadingReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingState {
        private final boolean isLoading;

        @NotNull
        private final String loadingReason;

        /* JADX WARN: Multi-variable type inference failed */
        public LoadingState() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ LoadingState copy$default(LoadingState loadingState, boolean z, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = loadingState.isLoading;
            }
            if ((i & 2) != 0) {
                str = loadingState.loadingReason;
            }
            return loadingState.copy(z, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLoadingReason() {
            return this.loadingReason;
        }

        @NotNull
        public final LoadingState copy(boolean isLoading, @NotNull String loadingReason) {
            Intrinsics.checkNotNullParameter(loadingReason, "loadingReason");
            return new LoadingState(isLoading, loadingReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingState)) {
                return false;
            }
            LoadingState loadingState = (LoadingState) other;
            return this.isLoading == loadingState.isLoading && Intrinsics.f(this.loadingReason, loadingState.loadingReason);
        }

        @NotNull
        public final String getLoadingReason() {
            return this.loadingReason;
        }

        public int hashCode() {
            return this.loadingReason.hashCode() + (Boolean.hashCode(this.isLoading) * 31);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("LoadingState(isLoading=");
            sb6.append(this.isLoading);
            sb6.append(", loadingReason=");
            return j6.a.u(sb6, this.loadingReason, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public LoadingState(boolean z, @NotNull String loadingReason) {
            Intrinsics.checkNotNullParameter(loadingReason, "loadingReason");
            this.isLoading = z;
            this.loadingReason = loadingReason;
        }

        public /* synthetic */ LoadingState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent;", "Lcom/onfido/android/sdk/capture/internal/util/UIEvent;", "()V", "ConsentAccepted", "ConsentExit", "ConsentRejected", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent$ConsentAccepted;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent$ConsentExit;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent$ConsentRejected;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class UserConsentUIEvent extends UIEvent {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent$ConsentAccepted;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConsentAccepted extends UserConsentUIEvent {

            @NotNull
            public static final ConsentAccepted INSTANCE = new ConsentAccepted();

            private ConsentAccepted() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent$ConsentExit;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConsentExit extends UserConsentUIEvent {

            @NotNull
            public static final ConsentExit INSTANCE = new ConsentExit();

            private ConsentExit() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent$ConsentRejected;", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ConsentRejected extends UserConsentUIEvent {

            @NotNull
            public static final ConsentRejected INSTANCE = new ConsentRejected();

            private ConsentRejected() {
                super(null);
            }
        }

        private UserConsentUIEvent() {
        }

        public /* synthetic */ UserConsentUIEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$ViewState;", "", "loadingState", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$LoadingState;", "consentPageString", "", "errorString", "uiEvents", "", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$UserConsentUIEvent;", "showExitFlow", "", "(Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$LoadingState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getConsentPageString", "()Ljava/lang/String;", "getErrorString", "getLoadingState", "()Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentViewModel$LoadingState;", "getShowExitFlow", "()Z", "getUiEvents", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ViewState {
        private final String consentPageString;
        private final String errorString;

        @NotNull
        private final LoadingState loadingState;
        private final boolean showExitFlow;

        @NotNull
        private final List<UserConsentUIEvent> uiEvents;

        public ViewState() {
            this(null, null, null, null, false, 31, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ViewState copy$default(ViewState viewState, LoadingState loadingState, String str, String str2, List list, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                loadingState = viewState.loadingState;
            }
            if ((i & 2) != 0) {
                str = viewState.consentPageString;
            }
            if ((i & 4) != 0) {
                str2 = viewState.errorString;
            }
            if ((i & 8) != 0) {
                list = viewState.uiEvents;
            }
            if ((i & 16) != 0) {
                z = viewState.showExitFlow;
            }
            boolean z3 = z;
            String str3 = str2;
            return viewState.copy(loadingState, str, str3, list, z3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsentPageString() {
            return this.consentPageString;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getErrorString() {
            return this.errorString;
        }

        @NotNull
        public final List<UserConsentUIEvent> component4() {
            return this.uiEvents;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getShowExitFlow() {
            return this.showExitFlow;
        }

        @NotNull
        public final ViewState copy(@NotNull LoadingState loadingState, String consentPageString, String errorString, @NotNull List<? extends UserConsentUIEvent> uiEvents, boolean showExitFlow) {
            Intrinsics.checkNotNullParameter(loadingState, "loadingState");
            Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
            return new ViewState(loadingState, consentPageString, errorString, uiEvents, showExitFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return Intrinsics.f(this.loadingState, viewState.loadingState) && Intrinsics.f(this.consentPageString, viewState.consentPageString) && Intrinsics.f(this.errorString, viewState.errorString) && Intrinsics.f(this.uiEvents, viewState.uiEvents) && this.showExitFlow == viewState.showExitFlow;
        }

        public final String getConsentPageString() {
            return this.consentPageString;
        }

        public final String getErrorString() {
            return this.errorString;
        }

        @NotNull
        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public final boolean getShowExitFlow() {
            return this.showExitFlow;
        }

        @NotNull
        public final List<UserConsentUIEvent> getUiEvents() {
            return this.uiEvents;
        }

        public int hashCode() {
            int iHashCode = this.loadingState.hashCode() * 31;
            String str = this.consentPageString;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.errorString;
            return Boolean.hashCode(this.showExitFlow) + p.a.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.uiEvents);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("ViewState(loadingState=");
            sb6.append(this.loadingState);
            sb6.append(", consentPageString=");
            sb6.append(this.consentPageString);
            sb6.append(", errorString=");
            sb6.append(this.errorString);
            sb6.append(", uiEvents=");
            sb6.append(this.uiEvents);
            sb6.append(", showExitFlow=");
            return j6.a.x(sb6, this.showExitFlow, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(@NotNull LoadingState loadingState, String str, String str2, @NotNull List<? extends UserConsentUIEvent> uiEvents, boolean z) {
            Intrinsics.checkNotNullParameter(loadingState, "loadingState");
            Intrinsics.checkNotNullParameter(uiEvents, "uiEvents");
            this.loadingState = loadingState;
            this.consentPageString = str;
            this.errorString = str2;
            this.uiEvents = uiEvents;
            this.showExitFlow = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState(LoadingState loadingState, String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LoadingState(false, null, 3, 0 == true ? 1 : 0) : loadingState, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? f0.f322471a : list, (i & 16) != 0 ? false : z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserConsentViewModel(@NotNull UserConsentRepository userConsentRepository, @NotNull ScreenTracker screenTracker, @NotNull SchedulersProvider schedulersProvider, @NotNull WaitingScreenTracker waitingScreenTracker, @NotNull OnfidoRemoteConfig remoteConfig, @NotNull OnfidoConfig onfidoConfig, @NotNull FlowTracker flowTracker) {
        Intrinsics.checkNotNullParameter(userConsentRepository, "userConsentRepository");
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(flowTracker, "flowTracker");
        this.userConsentRepository = userConsentRepository;
        this.screenTracker = screenTracker;
        this.schedulersProvider = schedulersProvider;
        this.waitingScreenTracker = waitingScreenTracker;
        this.remoteConfig = remoteConfig;
        this.onfidoConfig = onfidoConfig;
        this.flowTracker = flowTracker;
        this.compositeDisposable = new CompositeDisposable();
        this.uiEventsManager = new UIEventManager<>();
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(new LoadingState(false, null, 3, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.isLoading = behaviorSubjectD;
        BehaviorSubject behaviorSubjectD2 = BehaviorSubject.d("");
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD2, "createDefault(...)");
        this.userConsentPage = behaviorSubjectD2;
        BehaviorSubject behaviorSubjectD3 = BehaviorSubject.d("");
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD3, "createDefault(...)");
        this.errorMessage = behaviorSubjectD3;
        this.state = j.b(new UserConsentViewModel$state$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadUserConsentPage() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableI = new e(this.userConsentRepository.getUserConsentPage$onfido_capture_sdk_core_release().k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()), new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel.loadUserConsentPage.1
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                UserConsentViewModel.this.isLoading.onNext(new LoadingState(true, "GET_USER_CONSENT"));
            }
        }, 1).i(new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel.loadUserConsentPage.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // igm.g
            public final void accept(@NotNull String content) {
                Intrinsics.checkNotNullParameter(content, "content");
                UserConsentViewModel.this.isLoading.onNext(new LoadingState(false, null, 2, 0 == true ? 1 : 0));
                UserConsentViewModel.this.userConsentPage.onNext(content);
                UserConsentViewModel.this.errorMessage.onNext("");
                UserConsentViewModel.this.waitingScreenTracker.trackWaitingScreenCompletion(new LoadingFragment.Companion.DialogMode.Loading("GET_USER_CONSENT").toTaskType(), "GET_USER_CONSENT");
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel.loadUserConsentPage.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                UserConsentViewModel.this.isLoading.onNext(new LoadingState(false, null, 2, 0 == true ? 1 : 0));
                UserConsentViewModel.this.userConsentPage.onNext("");
                UserConsentViewModel.this.errorMessage.onNext(throwable.getMessage());
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAcceptClicked$lambda$0(UserConsentViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isLoading.onNext(new LoadingState(false, null, 2, 0 == true ? 1 : 0));
        this$0.waitingScreenTracker.trackWaitingScreenCompletion(new LoadingFragment.Companion.DialogMode.Loading("GRANT_USER_CONSENT").toTaskType(), "GRANT_USER_CONSENT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAcceptClicked$lambda$1(UserConsentViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.uiEventsManager.emitUIEvent(UserConsentUIEvent.ConsentAccepted.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onRejectClicked$lambda$2(UserConsentViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isLoading.onNext(new LoadingState(false, null, 2, 0 == true ? 1 : 0));
        this$0.waitingScreenTracker.trackWaitingScreenCompletion(new LoadingFragment.Companion.DialogMode.Loading("REVOKE_USER_CONSENT").toTaskType(), "REVOKE_USER_CONSENT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRejectClicked$lambda$3(UserConsentViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.uiEventsManager.emitUIEvent(UserConsentUIEvent.ConsentRejected.INSTANCE);
    }

    public final void consumeUIEvent(@NotNull UserConsentUIEvent uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        this.uiEventsManager.consumeUIEvent(uiEvent);
    }

    public final void flowUserExit() {
        this.flowTracker.trackFlowUserExitButtonClicked("user_consent");
    }

    public final void flowUserExitCanceled() {
        this.flowTracker.trackFlowUserExitCanceled("user_consent");
    }

    public final void flowUserExitConfirmed() {
        this.flowTracker.trackFlowUserExitConfirmed("user_consent");
        this.uiEventsManager.emitUIEvent(UserConsentUIEvent.ConsentExit.INSTANCE);
    }

    @NotNull
    public final Observable getState() {
        return (Observable) this.state.getValue();
    }

    public final void onAcceptClicked() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        k kVarG = this.userConsentRepository.grantUserConsent$onfido_capture_sdk_core_release().g(this.schedulersProvider.getUi());
        g gVar = new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel.onAcceptClicked.1
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                UserConsentViewModel.this.isLoading.onNext(new LoadingState(true, "GRANT_USER_CONSENT"));
            }
        };
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        ngm.g gVarH = new m(new m(kVarG, gVar, bVar, bVar2, bVar2), bVar, bVar, bVar2, new d(this, 0)).h(new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel.onAcceptClicked.4
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                UserConsentViewModel.this.errorMessage.onNext(throwable.getMessage());
            }
        }, new d(this, 1));
        Intrinsics.checkNotNullExpressionValue(gVarH, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, gVarH);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    public final void onRejectClicked() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        k kVarG = this.userConsentRepository.revokeConsent$onfido_capture_sdk_core_release().g(this.schedulersProvider.getUi());
        g gVar = new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel.onRejectClicked.1
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                UserConsentViewModel.this.isLoading.onNext(new LoadingState(true, "REVOKE_USER_CONSENT"));
            }
        };
        he2.b bVar = kgm.j.d;
        kgm.b bVar2 = kgm.j.f184027c;
        ngm.g gVarH = new m(new m(kVarG, gVar, bVar, bVar2, bVar2), bVar, bVar, bVar2, new d(this, 2)).h(new g() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentViewModel.onRejectClicked.4
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                UserConsentViewModel.this.errorMessage.onNext(throwable.getMessage());
            }
        }, new d(this, 3));
        Intrinsics.checkNotNullExpressionValue(gVarH, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, gVarH);
    }

    public final void onStart() {
        this.screenTracker.trackUserConsent$onfido_capture_sdk_core_release();
    }
}
