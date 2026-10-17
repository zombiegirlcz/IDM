package com.onfido.android.sdk.capture.ui.userconsent;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.userconsent.network.ConsentBody;
import com.onfido.android.sdk.capture.ui.userconsent.network.UserConsentApi;
import com.onfido.android.sdk.capture.ui.userconsent.network.UserConsentsResponseItem;
import com.onfido.api.client.token.sdk.ApplicantId;
import igm.f;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ogm.e;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import tgm.g;
import ulm.i1;
import ulm.j1;
import ulm.p;
import ylm.q;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0010¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0019H\u0010¢\u0006\u0002\b\u001aJ\r\u0010\u001b\u001a\u00020\u0019H\u0010¢\u0006\u0002\b\u001cJ\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016H\u0016R\u0014\u0010\t\u001a\u00020\n8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u000e8\u0010@\u0010X\u0091\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentRepository;", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "userConsentApi", "Lcom/onfido/android/sdk/capture/ui/userconsent/network/UserConsentApi;", "tokenProvider", "Lcom/onfido/android/sdk/capture/internal/token/OnfidoTokenProvider;", "(Lokhttp3/OkHttpClient;Lcom/onfido/android/sdk/capture/ui/userconsent/network/UserConsentApi;Lcom/onfido/android/sdk/capture/internal/token/OnfidoTokenProvider;)V", "applicantId", "Lcom/onfido/api/client/token/sdk/ApplicantId;", "getApplicantId", "()Lcom/onfido/api/client/token/sdk/ApplicantId;", "consentPageUrl", "", "getConsentPageUrl$onfido_capture_sdk_core_release$annotations", "()V", "getConsentPageUrl$onfido_capture_sdk_core_release", "()Ljava/lang/String;", "setConsentPageUrl$onfido_capture_sdk_core_release", "(Ljava/lang/String;)V", "getUserConsentPage", "Lio/reactivex/rxjava3/core/Single;", "getUserConsentPage$onfido_capture_sdk_core_release", "grantUserConsent", "Lio/reactivex/rxjava3/core/Completable;", "grantUserConsent$onfido_capture_sdk_core_release", "revokeConsent", "revokeConsent$onfido_capture_sdk_core_release", "shouldShowUserConsent", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class UserConsentRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final long LOCATION_CALL_RETRY_COUNT = 3;

    @NotNull
    private String consentPageUrl;

    @NotNull
    private final OkHttpClient okHttpClient;

    @NotNull
    private final OnfidoTokenProvider tokenProvider;

    @NotNull
    private final UserConsentApi userConsentApi;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/UserConsentRepository$Companion;", "", "()V", "LOCATION_CALL_RETRY_COUNT", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserConsentRepository(@NotNull OkHttpClient okHttpClient, @NotNull UserConsentApi userConsentApi, @NotNull OnfidoTokenProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(userConsentApi, "userConsentApi");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.okHttpClient = okHttpClient;
        this.userConsentApi = userConsentApi;
        this.tokenProvider = tokenProvider;
        this.consentPageUrl = "https://assets.onfido.com/consent/user_consent.html";
    }

    private ApplicantId getApplicantId() {
        return this.tokenProvider.provideToken().b();
    }

    public static /* synthetic */ void getConsentPageUrl$onfido_capture_sdk_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getUserConsentPage$lambda$0(UserConsentRepository this$0, final SingleEmitter emitter) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        OkHttpClient okHttpClient = this$0.okHttpClient;
        i1 i1Var = new i1();
        i1Var.c("GET", null);
        i1Var.e(this$0.getConsentPageUrl());
        final q qVarB = okHttpClient.b(new j1(i1Var));
        FirebasePerfOkHttpClient.enqueue(qVarB, new p() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentRepository$getUserConsentPage$1$1
            @Override // ulm.p
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                if (emitter.isDisposed()) {
                    return;
                }
                emitter.onError(e);
            }

            @Override // ulm.p
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                if (emitter.isDisposed()) {
                    return;
                }
                try {
                    SingleEmitter singleEmitter = emitter;
                    ResponseBody responseBody = response.f226090g;
                    String strString = responseBody != null ? responseBody.string() : null;
                    if (strString == null) {
                        strString = "";
                    }
                    singleEmitter.onSuccess(strString);
                } catch (IOException e) {
                    if (emitter.isDisposed()) {
                        return;
                    }
                    emitter.onError(e);
                }
            }
        });
        emitter.a(new f() { // from class: com.onfido.android.sdk.capture.ui.userconsent.b
            @Override // igm.f
            public final void cancel() {
                qVarB.cancel();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean shouldShowUserConsent$lambda$1(Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.TRUE;
    }

    @NotNull
    /* JADX INFO: renamed from: getConsentPageUrl$onfido_capture_sdk_core_release, reason: from getter */
    public String getConsentPageUrl() {
        return this.consentPageUrl;
    }

    @NotNull
    public Single<String> getUserConsentPage$onfido_capture_sdk_core_release() {
        tgm.b bVar = new tgm.b(new c(this, 0), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return bVar;
    }

    @NotNull
    public Completable grantUserConsent$onfido_capture_sdk_core_release() {
        return this.userConsentApi.changeApplicantConsents(getApplicantId().f50154a, u.c(ConsentBody.INSTANCE.createConsent(true)));
    }

    @NotNull
    public Completable revokeConsent$onfido_capture_sdk_core_release() {
        return this.userConsentApi.changeApplicantConsents(getApplicantId().f50154a, u.c(ConsentBody.INSTANCE.createConsent(false)));
    }

    public void setConsentPageUrl$onfido_capture_sdk_core_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.consentPageUrl = str;
    }

    @NotNull
    public Single<Boolean> shouldShowUserConsent() {
        CompletableSource completableSourcePatchApplicantLocation = this.userConsentApi.patchApplicantLocation(getApplicantId().f50154a);
        igm.p pVar = new igm.p() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentRepository.shouldShowUserConsent.1
            @Override // igm.p
            public final boolean test(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8);
                return true;
            }
        };
        completableSourcePatchApplicantLocation.getClass();
        e eVar = new e((completableSourcePatchApplicantLocation instanceof lgm.c ? ((lgm.c) completableSourcePatchApplicantLocation).b() : new ogm.q(completableSourcePatchApplicantLocation, 0)).h(pVar), 4);
        Single<List<UserConsentsResponseItem>> consents = this.userConsentApi.getConsents(getApplicantId().f50154a);
        Objects.requireNonNull(consents, "next is null");
        g gVar = new g(new tgm.d(consents, eVar, 0).g(new o() { // from class: com.onfido.android.sdk.capture.ui.userconsent.UserConsentRepository.shouldShowUserConsent.2
            @Override // igm.o
            @NotNull
            public final Boolean apply(@NotNull List<UserConsentsResponseItem> consentsList) {
                boolean z;
                Intrinsics.checkNotNullParameter(consentsList, "consentsList");
                if ((consentsList instanceof Collection) && consentsList.isEmpty()) {
                    z = false;
                } else {
                    for (UserConsentsResponseItem userConsentsResponseItem : consentsList) {
                        if (userConsentsResponseItem.getIsRequired() && !userConsentsResponseItem.getIsGranted()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new cie.b(21), 2);
        Intrinsics.checkNotNullExpressionValue(gVar, "onErrorReturn(...)");
        return gVar;
    }
}
