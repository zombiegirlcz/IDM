package com.onfido.android.sdk.capture.ui;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.document.supported.domain.usecase.GetSupportedDocumentsUseCase;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.config.SDKConfigRepository;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.OnfidoPresenterInitializer;
import com.onfido.android.sdk.capture.ui.userconsent.UserConsentRepository;
import com.onfido.api.client.exception.TokenExpiredException;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer;", "", "sdkConfigRepository", "Lcom/onfido/android/sdk/capture/internal/config/SDKConfigRepository;", "userConsentRepository", "Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentRepository;", "getSupportedDocumentsUseCase", "Lcom/onfido/android/sdk/capture/document/supported/domain/usecase/GetSupportedDocumentsUseCase;", "(Lcom/onfido/android/sdk/capture/internal/config/SDKConfigRepository;Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentRepository;Lcom/onfido/android/sdk/capture/document/supported/domain/usecase/GetSupportedDocumentsUseCase;)V", "initialize", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult;", "hasPreselectedDocuments", "", "initialize$onfido_capture_sdk_core_release", "InitializerResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoPresenterInitializer {

    @NotNull
    private final GetSupportedDocumentsUseCase getSupportedDocumentsUseCase;

    @NotNull
    private final SDKConfigRepository sdkConfigRepository;

    @NotNull
    private final UserConsentRepository userConsentRepository;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult;", "", "()V", "Error", "Loading", "Success", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Loading;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Success;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InternalOnfidoApi
    public static abstract class InitializerResult {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult;", "()V", "GenericError", "SSLHandshakeUnverified", "TokenExpired", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error$GenericError;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error$SSLHandshakeUnverified;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error$TokenExpired;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Error extends InitializerResult {

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error$GenericError;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class GenericError extends Error {

                @NotNull
                private final Throwable cause;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GenericError(@NotNull Throwable cause) {
                    super(null);
                    Intrinsics.checkNotNullParameter(cause, "cause");
                    this.cause = cause;
                }

                @NotNull
                public final Throwable getCause() {
                    return this.cause;
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error$SSLHandshakeUnverified;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class SSLHandshakeUnverified extends Error {

                @NotNull
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SSLHandshakeUnverified(@NotNull String message) {
                    super(null);
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.message = message;
                }

                public static /* synthetic */ SSLHandshakeUnverified copy$default(SSLHandshakeUnverified sSLHandshakeUnverified, String str, int i, Object obj2) {
                    if ((i & 1) != 0) {
                        str = sSLHandshakeUnverified.message;
                    }
                    return sSLHandshakeUnverified.copy(str);
                }

                @NotNull
                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                @NotNull
                public final SSLHandshakeUnverified copy(@NotNull String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    return new SSLHandshakeUnverified(message);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SSLHandshakeUnverified) && Intrinsics.f(this.message, ((SSLHandshakeUnverified) other).message);
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
                    return j6.a.u(new StringBuilder("SSLHandshakeUnverified(message="), this.message, CoreConstants.RIGHT_PARENTHESIS_CHAR);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error$TokenExpired;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Error;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class TokenExpired extends Error {

                @NotNull
                public static final TokenExpired INSTANCE = new TokenExpired();

                private TokenExpired() {
                    super(null);
                }
            }

            private Error() {
                super(null);
            }

            public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Loading;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Loading extends InitializerResult {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Success;", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "shouldAskForConsent", "", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Z)V", "getOnfidoRemoteConfig", "()Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "getShouldAskForConsent", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success extends InitializerResult {

            @NotNull
            private final OnfidoRemoteConfig onfidoRemoteConfig;
            private final boolean shouldAskForConsent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull OnfidoRemoteConfig onfidoRemoteConfig, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
                this.onfidoRemoteConfig = onfidoRemoteConfig;
                this.shouldAskForConsent = z;
            }

            public static /* synthetic */ Success copy$default(Success success, OnfidoRemoteConfig onfidoRemoteConfig, boolean z, int i, Object obj2) {
                if ((i & 1) != 0) {
                    onfidoRemoteConfig = success.onfidoRemoteConfig;
                }
                if ((i & 2) != 0) {
                    z = success.shouldAskForConsent;
                }
                return success.copy(onfidoRemoteConfig, z);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final OnfidoRemoteConfig getOnfidoRemoteConfig() {
                return this.onfidoRemoteConfig;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final boolean getShouldAskForConsent() {
                return this.shouldAskForConsent;
            }

            @NotNull
            public final Success copy(@NotNull OnfidoRemoteConfig onfidoRemoteConfig, boolean shouldAskForConsent) {
                Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
                return new Success(onfidoRemoteConfig, shouldAskForConsent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.f(this.onfidoRemoteConfig, success.onfidoRemoteConfig) && this.shouldAskForConsent == success.shouldAskForConsent;
            }

            @NotNull
            public final OnfidoRemoteConfig getOnfidoRemoteConfig() {
                return this.onfidoRemoteConfig;
            }

            public final boolean getShouldAskForConsent() {
                return this.shouldAskForConsent;
            }

            public int hashCode() {
                return Boolean.hashCode(this.shouldAskForConsent) + (this.onfidoRemoteConfig.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb6 = new StringBuilder("Success(onfidoRemoteConfig=");
                sb6.append(this.onfidoRemoteConfig);
                sb6.append(", shouldAskForConsent=");
                return j6.a.x(sb6, this.shouldAskForConsent, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        private InitializerResult() {
        }

        public /* synthetic */ InitializerResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OnfidoPresenterInitializer(@NotNull SDKConfigRepository sdkConfigRepository, @NotNull UserConsentRepository userConsentRepository, @NotNull GetSupportedDocumentsUseCase getSupportedDocumentsUseCase) {
        Intrinsics.checkNotNullParameter(sdkConfigRepository, "sdkConfigRepository");
        Intrinsics.checkNotNullParameter(userConsentRepository, "userConsentRepository");
        Intrinsics.checkNotNullParameter(getSupportedDocumentsUseCase, "getSupportedDocumentsUseCase");
        this.sdkConfigRepository = sdkConfigRepository;
        this.userConsentRepository = userConsentRepository;
        this.getSupportedDocumentsUseCase = getSupportedDocumentsUseCase;
    }

    @NotNull
    public final Observable initialize$onfido_capture_sdk_core_release(final boolean hasPreselectedDocuments) {
        Observable observableFlatMap = this.sdkConfigRepository.getFetchSdkConfigObservable().flatMap(new o() { // from class: com.onfido.android.sdk.capture.ui.OnfidoPresenterInitializer$initialize$1
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull OnfidoRemoteConfig remoteConfig) {
                Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
                return this.this$0.getSupportedDocumentsUseCase.invoke(hasPreselectedDocuments, remoteConfig.isDocumentSupportRulesEnabled()).d(Observable.just(remoteConfig));
            }
        }).flatMap(new o() { // from class: com.onfido.android.sdk.capture.ui.OnfidoPresenterInitializer$initialize$2
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull final OnfidoRemoteConfig remoteConfig) {
                Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
                return remoteConfig.isApplicantConsentRequired() ? this.this$0.userConsentRepository.shouldShowUserConsent().g(new o() { // from class: com.onfido.android.sdk.capture.ui.OnfidoPresenterInitializer$initialize$2.1
                    @NotNull
                    public final OnfidoPresenterInitializer.InitializerResult.Success apply(boolean z) {
                        return new OnfidoPresenterInitializer.InitializerResult.Success(remoteConfig, z);
                    }

                    @Override // igm.o
                    public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                        return apply(((Boolean) obj2).booleanValue());
                    }
                }).l() : Observable.just(new OnfidoPresenterInitializer.InitializerResult.Success(remoteConfig, false));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        Observable observableCast = observableFlatMap.cast(InitializerResult.class);
        Intrinsics.checkNotNullExpressionValue(observableCast, "cast(...)");
        Observable observableStartWithItem = observableCast.onErrorReturn(new o() { // from class: com.onfido.android.sdk.capture.ui.OnfidoPresenterInitializer$initialize$3
            @Override // igm.o
            @NotNull
            public final OnfidoPresenterInitializer.InitializerResult apply(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof TokenExpiredException) {
                    return OnfidoPresenterInitializer.InitializerResult.Error.TokenExpired.INSTANCE;
                }
                if (!(throwable instanceof SSLPeerUnverifiedException)) {
                    return new OnfidoPresenterInitializer.InitializerResult.Error.GenericError(throwable);
                }
                String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "";
                }
                return new OnfidoPresenterInitializer.InitializerResult.Error.SSLHandshakeUnverified(localizedMessage);
            }
        }).startWithItem(InitializerResult.Loading.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWithItem, "startWithItem(...)");
        return observableStartWithItem;
    }
}
