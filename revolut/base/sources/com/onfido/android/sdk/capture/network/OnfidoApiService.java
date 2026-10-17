package com.onfido.android.sdk.capture.network;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.common.cryptography.Cryptography;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument;
import com.onfido.android.sdk.capture.document.DocumentMediaType;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.token.TokenExpirationServiceConnector;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.ByteArrayExtensionsKt;
import com.onfido.android.sdk.capture.utils.OnfidoExtensionsKt;
import com.onfido.android.sdk.capture.validation.Validation;
import com.onfido.api.client.OnfidoAPI;
import com.onfido.api.client.ValidationLevel;
import com.onfido.api.client.ValidationType;
import com.onfido.api.client.data.DeviceInfo;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.DocType;
import com.onfido.api.client.data.DocumentBinaryMedia;
import com.onfido.api.client.data.DocumentFeatures;
import com.onfido.api.client.data.DocumentMediaIntegrity;
import com.onfido.api.client.data.DocumentMediaUploadResponse;
import com.onfido.api.client.data.DocumentUpload;
import com.onfido.api.client.data.DocumentValidationWarningsBundle;
import com.onfido.api.client.data.ErrorData;
import com.onfido.api.client.data.InternalDocSide;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.LiveVideoChallenges;
import com.onfido.api.client.data.LiveVideoLanguage;
import com.onfido.api.client.data.NfcProperties;
import com.onfido.api.client.data.PayloadIntegrity;
import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.api.client.data.PoaDocumentUpload;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.api.client.data.SupportedDocuments;
import com.onfido.api.client.exception.TokenExpiredException;
import com.onfido.api.client.l;
import com.onfido.api.client.token.InternalToken;
import com.onfido.api.client.token.TokenProvider;
import com.onfido.api.client.token.sdk.InternalSDKToken;
import ehe.n;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lim.m;
import m72.b;
import org.jetbrains.annotations.NotNull;
import tgm.d;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 `2\u00020\u0001:\u0006`abcdeB?\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0012J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0002\b\u001bJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0010¢\u0006\u0002\b\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0014H\u0010¢\u0006\u0002\b!J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0014H\u0010¢\u0006\u0002\b$J&\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0\u0014\"\b\b\u0000\u0010&*\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H&0\u0014H\u0012J\b\u0010(\u001a\u00020)H\u0012J\u0015\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\b.JM\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00142\u0006\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:H\u0010¢\u0006\u0002\b;Jm\u0010<\u001a\b\u0012\u0004\u0012\u0002000\u00142\u0006\u00101\u001a\u00020\u00182\b\u00102\u001a\u0004\u0018\u00010\u00182\u0006\u00103\u001a\u0002042\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010\u00172\b\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:H\u0010¢\u0006\u0002\bAJE\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010C\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00182\u0006\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020E2\u0006\u00105\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0002\bHJI\u0010I\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010\u00182\b\u00102\u001a\u0004\u0018\u00010\u00182\b\u00107\u001a\u0004\u0018\u0001082\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OH\u0010¢\u0006\u0002\bQJ#\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\u0006\u0010,\u001a\u00020U2\u0006\u0010L\u001a\u00020MH\u0010¢\u0006\u0002\bVJ\u001b\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00142\u0006\u0010,\u001a\u00020YH\u0010¢\u0006\u0002\bZJ\u000e\u0010[\u001a\u0004\u0018\u00010\\*\u00020]H\u0012J\f\u0010^\u001a\u00020_*\u000208H\u0012R\u000e\u0010\f\u001a\u00020\rX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "", "onfidoApi", "Lcom/onfido/api/client/OnfidoAPI;", "identityInteractor", "Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "sdkUploadMetadataHelper", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "tokenExpirationServiceConnetor", "Lcom/onfido/android/sdk/capture/token/TokenExpirationServiceConnector;", "cryptography", "Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;", "tokenProvider", "Lcom/onfido/api/client/token/TokenProvider;", "(Lcom/onfido/api/client/OnfidoAPI;Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;Lcom/onfido/android/sdk/capture/OnfidoConfig;Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;Lcom/onfido/android/sdk/capture/token/TokenExpirationServiceConnector;Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;Lcom/onfido/api/client/token/TokenProvider;)V", "deviceInfo", "Lcom/onfido/api/client/data/DeviceInfo;", "getNfcProperties", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/api/client/data/NfcProperties;", "documentIds", "", "", "mrzDocument", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "getNfcProperties$onfido_capture_sdk_core_release", "getSDKConfig", "Lcom/onfido/api/client/data/SdkConfiguration;", "getSDKConfig$onfido_capture_sdk_core_release", "getSupportedDocuments", "Lcom/onfido/api/client/data/SupportedDocuments;", "getSupportedDocuments$onfido_capture_sdk_core_release", "liveVideoChallenges", "Lcom/onfido/api/client/data/LiveVideoChallenges;", "liveVideoChallenges$onfido_capture_sdk_core_release", "retrySingleRequest", "T", "single", "tokenRefreshTask", "Lio/reactivex/rxjava3/core/Completable;", "upload", "", "params", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService$PhotoUploadParams;", "upload$onfido_capture_sdk_core_release", "uploadDocument", "Lcom/onfido/api/client/data/DocumentMediaUploadResponse;", "fileName", "fileType", "mediaType", "Lcom/onfido/android/sdk/capture/document/DocumentMediaType;", "docType", "Lcom/onfido/android/sdk/capture/DocumentType;", "data", "", "sdkUploadMetaData", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "uploadDocument$onfido_capture_sdk_core_release", "uploadDocumentMedia", "docSide", "Lcom/onfido/api/client/data/DocSide;", "validations", "Lcom/onfido/android/sdk/capture/validation/Validation;", "uploadDocumentMedia$onfido_capture_sdk_core_release", "uploadDocumentVideo", "documentId", "videoPath", "Lcom/onfido/api/client/data/InternalDocSide;", "Lcom/onfido/api/client/data/DocType;", "issuingCountry", "uploadDocumentVideo$onfido_capture_sdk_core_release", "uploadLivePhoto", "advancedValidation", "", "payloadIntegrity", "Lcom/onfido/api/client/data/PayloadIntegrity;", "listener", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;", "Lcom/onfido/api/client/data/LivePhotoUpload;", "uploadLivePhoto$onfido_capture_sdk_core_release", "uploadLiveVideo", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/api/client/data/LiveVideoUpload;", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService$VideoUploadParams;", "uploadLiveVideo$onfido_capture_sdk_core_release", "uploadPoaDocument", "Lcom/onfido/api/client/data/PoaDocumentUpload;", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService$PoaDocumentUploadParams;", "uploadPoaDocument$onfido_capture_sdk_core_release", "asCertificateError", "Lcom/onfido/android/sdk/capture/upload/ErrorType$InvalidCertificate;", "", "toMediaIntegrity", "Lcom/onfido/api/client/data/DocumentMediaIntegrity;", "Companion", "OnfidoApiListener", "OnfidoApiServiceListener", "PhotoUploadParams", "PoaDocumentUploadParams", "VideoUploadParams", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class OnfidoApiService {

    @NotNull
    private final Cryptography cryptography;

    @NotNull
    private final IdentityInteractor identityInteractor;

    @NotNull
    private final OnfidoAPI onfidoApi;

    @NotNull
    private final OnfidoConfig onfidoConfig;

    @NotNull
    private final SdkUploadMetadataHelper sdkUploadMetadataHelper;

    @NotNull
    private final TokenExpirationServiceConnector tokenExpirationServiceConnetor;

    @NotNull
    private final TokenProvider tokenProvider;

    @NotNull
    private static final String TOKEN_EXPIRED = "expired_token";

    @NotNull
    private static final String GEOBLOCKED_ERROR = "geoblocked_request";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/network/OnfidoApiService$Companion;", "", "()V", "GEOBLOCKED_ERROR", "", "TOKEN_EXPIRED", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b¢\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H&¢\u0006\u0004\b\u0018\u0010\tR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiListener;", "T", "Lcom/onfido/api/client/l;", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;", "listener", "<init>", "(Lcom/onfido/android/sdk/capture/network/OnfidoApiService;Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;)V", "", "onTokenExpired", "()V", "t", "onSuccess", "(Ljava/lang/Object;)V", "", "onFailure", "(Ljava/lang/Throwable;)V", "", "errorCode", "", "message", "Lcom/onfido/api/client/data/ErrorData;", "errorData", "onError", "(ILjava/lang/String;Lcom/onfido/api/client/data/ErrorData;)V", "onTokenRefreshed", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;", "getListener", "()Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public abstract class OnfidoApiListener<T> implements l {

        @NotNull
        private final OnfidoApiServiceListener<T> listener;
        final /* synthetic */ OnfidoApiService this$0;

        public OnfidoApiListener(@NotNull OnfidoApiService onfidoApiService, OnfidoApiServiceListener<T> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.this$0 = onfidoApiService;
            this.listener = listener;
        }

        private final void onTokenExpired() {
            this.this$0.tokenRefreshTask().h(new g(this) { // from class: com.onfido.android.sdk.capture.network.OnfidoApiService$OnfidoApiListener$onTokenExpired$2
                final /* synthetic */ OnfidoApiService.OnfidoApiListener<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // igm.g
                public final void accept(@NotNull Throwable it8) {
                    Intrinsics.checkNotNullParameter(it8, "it");
                    this.this$0.getListener().onUploadError(ErrorType.TokenExpired.INSTANCE);
                }
            }, new igm.a() { // from class: com.onfido.android.sdk.capture.network.a
                @Override // igm.a
                public final void run() {
                    this.f49976a.onTokenRefreshed();
                }
            });
        }

        @NotNull
        public final OnfidoApiServiceListener<T> getListener() {
            return this.listener;
        }

        @Override // com.onfido.api.client.l
        public void onError(int errorCode, @NotNull String message, ErrorData errorData) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (errorData == null || errorData.getError() == null) {
                this.listener.onUploadError(ErrorType.Generic.INSTANCE);
                return;
            }
            if ("expired_token".equalsIgnoreCase(errorData.getError().getType())) {
                if (this.this$0.onfidoConfig.getTokenExpirationHandlerEnabled()) {
                    onTokenExpired();
                    return;
                } else {
                    this.listener.onUploadError(ErrorType.TokenExpired.INSTANCE);
                    return;
                }
            }
            if ("geoblocked_request".equalsIgnoreCase(errorData.getError().getType())) {
                this.listener.onUploadError(ErrorType.Geoblocked.INSTANCE);
            } else {
                this.listener.onError(errorCode, message, errorData);
            }
        }

        @Override // com.onfido.api.client.l
        public void onFailure(@NotNull Throwable t2) {
            Intrinsics.checkNotNullParameter(t2, "t");
            ErrorType errorTypeAsCertificateError = this.this$0.asCertificateError(t2);
            if (errorTypeAsCertificateError == null) {
                String message = t2.getMessage();
                if (message == null) {
                    message = "";
                }
                errorTypeAsCertificateError = new ErrorType.Network(message);
            }
            this.listener.onUploadError(errorTypeAsCertificateError);
        }

        @Override // com.onfido.api.client.l
        public void onSuccess(T t2) {
            this.listener.onSuccess(t2);
        }

        public abstract void onTokenRefreshed();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;", "T", "", "onError", "", "errorCode", "", "message", "", "errorData", "Lcom/onfido/api/client/data/ErrorData;", "onSuccess", "uploadedDocument", "(Ljava/lang/Object;)V", "onUploadError", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnfidoApiServiceListener<T> {
        void onError(int errorCode, @NotNull String message, @NotNull ErrorData errorData);

        void onSuccess(T uploadedDocument);

        void onUploadError(@NotNull ErrorType errorType);
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0013HÆ\u0003J{\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00065"}, d2 = {"Lcom/onfido/android/sdk/capture/network/OnfidoApiService$PhotoUploadParams;", "", "fileName", "", "documentType", "Lcom/onfido/api/client/data/DocType;", "fileType", "data", "", "listener", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;", "Lcom/onfido/api/client/data/DocumentUpload;", "validations", "", "Lcom/onfido/android/sdk/capture/validation/Validation;", "side", "Lcom/onfido/api/client/data/InternalDocSide;", "issuingCountry", "sdkUploadMetaData", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "(Ljava/lang/String;Lcom/onfido/api/client/data/DocType;Ljava/lang/String;[BLcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;Ljava/util/List;Lcom/onfido/api/client/data/InternalDocSide;Ljava/lang/String;Lcom/onfido/api/client/data/SdkUploadMetaData;)V", "getData", "()[B", "getDocumentType", "()Lcom/onfido/api/client/data/DocType;", "getFileName", "()Ljava/lang/String;", "getFileType", "getIssuingCountry", "getListener", "()Lcom/onfido/android/sdk/capture/network/OnfidoApiService$OnfidoApiServiceListener;", "getSdkUploadMetaData", "()Lcom/onfido/api/client/data/SdkUploadMetaData;", "getSide", "()Lcom/onfido/api/client/data/InternalDocSide;", "getValidations", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhotoUploadParams {

        @NotNull
        private final byte[] data;
        private final DocType documentType;
        private final String fileName;
        private final String fileType;
        private final String issuingCountry;

        @NotNull
        private final OnfidoApiServiceListener<DocumentUpload> listener;

        @NotNull
        private final SdkUploadMetaData sdkUploadMetaData;
        private final InternalDocSide side;
        private final List<Validation> validations;

        public PhotoUploadParams(String str, DocType docType, String str2, @NotNull byte[] data, @NotNull OnfidoApiServiceListener<DocumentUpload> listener, List<Validation> list, InternalDocSide internalDocSide, String str3, @NotNull SdkUploadMetaData sdkUploadMetaData) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
            this.fileName = str;
            this.documentType = docType;
            this.fileType = str2;
            this.data = data;
            this.listener = listener;
            this.validations = list;
            this.side = internalDocSide;
            this.issuingCountry = str3;
            this.sdkUploadMetaData = sdkUploadMetaData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PhotoUploadParams copy$default(PhotoUploadParams photoUploadParams, String str, DocType docType, String str2, byte[] bArr, OnfidoApiServiceListener onfidoApiServiceListener, List list, InternalDocSide internalDocSide, String str3, SdkUploadMetaData sdkUploadMetaData, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = photoUploadParams.fileName;
            }
            if ((i & 2) != 0) {
                docType = photoUploadParams.documentType;
            }
            if ((i & 4) != 0) {
                str2 = photoUploadParams.fileType;
            }
            if ((i & 8) != 0) {
                bArr = photoUploadParams.data;
            }
            if ((i & 16) != 0) {
                onfidoApiServiceListener = photoUploadParams.listener;
            }
            if ((i & 32) != 0) {
                list = photoUploadParams.validations;
            }
            if ((i & 64) != 0) {
                internalDocSide = photoUploadParams.side;
            }
            if ((i & 128) != 0) {
                str3 = photoUploadParams.issuingCountry;
            }
            if ((i & 256) != 0) {
                sdkUploadMetaData = photoUploadParams.sdkUploadMetaData;
            }
            String str4 = str3;
            SdkUploadMetaData sdkUploadMetaData2 = sdkUploadMetaData;
            List list2 = list;
            InternalDocSide internalDocSide2 = internalDocSide;
            OnfidoApiServiceListener onfidoApiServiceListener2 = onfidoApiServiceListener;
            String str5 = str2;
            return photoUploadParams.copy(str, docType, str5, bArr, onfidoApiServiceListener2, list2, internalDocSide2, str4, sdkUploadMetaData2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DocType getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFileType() {
            return this.fileType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }

        @NotNull
        public final OnfidoApiServiceListener<DocumentUpload> component5() {
            return this.listener;
        }

        public final List<Validation> component6() {
            return this.validations;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final InternalDocSide getSide() {
            return this.side;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getIssuingCountry() {
            return this.issuingCountry;
        }

        @NotNull
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final SdkUploadMetaData getSdkUploadMetaData() {
            return this.sdkUploadMetaData;
        }

        @NotNull
        public final PhotoUploadParams copy(String fileName, DocType documentType, String fileType, @NotNull byte[] data, @NotNull OnfidoApiServiceListener<DocumentUpload> listener, List<Validation> validations, InternalDocSide side, String issuingCountry, @NotNull SdkUploadMetaData sdkUploadMetaData) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
            return new PhotoUploadParams(fileName, documentType, fileType, data, listener, validations, side, issuingCountry, sdkUploadMetaData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoUploadParams)) {
                return false;
            }
            PhotoUploadParams photoUploadParams = (PhotoUploadParams) other;
            return Intrinsics.f(this.fileName, photoUploadParams.fileName) && this.documentType == photoUploadParams.documentType && Intrinsics.f(this.fileType, photoUploadParams.fileType) && Intrinsics.f(this.data, photoUploadParams.data) && Intrinsics.f(this.listener, photoUploadParams.listener) && Intrinsics.f(this.validations, photoUploadParams.validations) && this.side == photoUploadParams.side && Intrinsics.f(this.issuingCountry, photoUploadParams.issuingCountry) && Intrinsics.f(this.sdkUploadMetaData, photoUploadParams.sdkUploadMetaData);
        }

        @NotNull
        public final byte[] getData() {
            return this.data;
        }

        public final DocType getDocumentType() {
            return this.documentType;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getFileType() {
            return this.fileType;
        }

        public final String getIssuingCountry() {
            return this.issuingCountry;
        }

        @NotNull
        public final OnfidoApiServiceListener<DocumentUpload> getListener() {
            return this.listener;
        }

        @NotNull
        public final SdkUploadMetaData getSdkUploadMetaData() {
            return this.sdkUploadMetaData;
        }

        public final InternalDocSide getSide() {
            return this.side;
        }

        public final List<Validation> getValidations() {
            return this.validations;
        }

        public int hashCode() {
            String str = this.fileName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            DocType docType = this.documentType;
            int iHashCode2 = (iHashCode + (docType == null ? 0 : docType.hashCode())) * 31;
            String str2 = this.fileType;
            int iHashCode3 = (this.listener.hashCode() + n.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.data)) * 31;
            List<Validation> list = this.validations;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            InternalDocSide internalDocSide = this.side;
            int iHashCode5 = (iHashCode4 + (internalDocSide == null ? 0 : internalDocSide.hashCode())) * 31;
            String str3 = this.issuingCountry;
            return this.sdkUploadMetaData.hashCode() + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "PhotoUploadParams(fileName=" + this.fileName + ", documentType=" + this.documentType + ", fileType=" + this.fileType + ", data=" + Arrays.toString(this.data) + ", listener=" + this.listener + ", validations=" + this.validations + ", side=" + this.side + ", issuingCountry=" + this.issuingCountry + ", sdkUploadMetaData=" + this.sdkUploadMetaData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/onfido/android/sdk/capture/network/OnfidoApiService$PoaDocumentUploadParams;", "", "fileName", "", "poaDocumentType", "Lcom/onfido/api/client/data/PoaDocumentType;", "fileType", "data", "", "issuingCountry", "(Ljava/lang/String;Lcom/onfido/api/client/data/PoaDocumentType;Ljava/lang/String;[BLjava/lang/String;)V", "getData", "()[B", "getFileName", "()Ljava/lang/String;", "getFileType", "getIssuingCountry", "getPoaDocumentType", "()Lcom/onfido/api/client/data/PoaDocumentType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PoaDocumentUploadParams {
        private final byte[] data;
        private final String fileName;
        private final String fileType;
        private final String issuingCountry;
        private final PoaDocumentType poaDocumentType;

        public PoaDocumentUploadParams(String str, PoaDocumentType poaDocumentType, String str2, byte[] bArr, String str3) {
            this.fileName = str;
            this.poaDocumentType = poaDocumentType;
            this.fileType = str2;
            this.data = bArr;
            this.issuingCountry = str3;
        }

        public static /* synthetic */ PoaDocumentUploadParams copy$default(PoaDocumentUploadParams poaDocumentUploadParams, String str, PoaDocumentType poaDocumentType, String str2, byte[] bArr, String str3, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = poaDocumentUploadParams.fileName;
            }
            if ((i & 2) != 0) {
                poaDocumentType = poaDocumentUploadParams.poaDocumentType;
            }
            if ((i & 4) != 0) {
                str2 = poaDocumentUploadParams.fileType;
            }
            if ((i & 8) != 0) {
                bArr = poaDocumentUploadParams.data;
            }
            if ((i & 16) != 0) {
                str3 = poaDocumentUploadParams.issuingCountry;
            }
            String str4 = str3;
            String str5 = str2;
            return poaDocumentUploadParams.copy(str, poaDocumentType, str5, bArr, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PoaDocumentType getPoaDocumentType() {
            return this.poaDocumentType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFileType() {
            return this.fileType;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getIssuingCountry() {
            return this.issuingCountry;
        }

        @NotNull
        public final PoaDocumentUploadParams copy(String fileName, PoaDocumentType poaDocumentType, String fileType, byte[] data, String issuingCountry) {
            return new PoaDocumentUploadParams(fileName, poaDocumentType, fileType, data, issuingCountry);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PoaDocumentUploadParams)) {
                return false;
            }
            PoaDocumentUploadParams poaDocumentUploadParams = (PoaDocumentUploadParams) other;
            return Intrinsics.f(this.fileName, poaDocumentUploadParams.fileName) && this.poaDocumentType == poaDocumentUploadParams.poaDocumentType && Intrinsics.f(this.fileType, poaDocumentUploadParams.fileType) && Intrinsics.f(this.data, poaDocumentUploadParams.data) && Intrinsics.f(this.issuingCountry, poaDocumentUploadParams.issuingCountry);
        }

        public final byte[] getData() {
            return this.data;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getFileType() {
            return this.fileType;
        }

        public final String getIssuingCountry() {
            return this.issuingCountry;
        }

        public final PoaDocumentType getPoaDocumentType() {
            return this.poaDocumentType;
        }

        public int hashCode() {
            String str = this.fileName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            PoaDocumentType poaDocumentType = this.poaDocumentType;
            int iHashCode2 = (iHashCode + (poaDocumentType == null ? 0 : poaDocumentType.hashCode())) * 31;
            String str2 = this.fileType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            byte[] bArr = this.data;
            int iHashCode4 = (iHashCode3 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            String str3 = this.issuingCountry;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("PoaDocumentUploadParams(fileName=");
            sb6.append(this.fileName);
            sb6.append(", poaDocumentType=");
            sb6.append(this.poaDocumentType);
            sb6.append(", fileType=");
            sb6.append(this.fileType);
            sb6.append(", data=");
            sb6.append(Arrays.toString(this.data));
            sb6.append(", issuingCountry=");
            return j6.a.u(sb6, this.issuingCountry, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006+"}, d2 = {"Lcom/onfido/android/sdk/capture/network/OnfidoApiService$VideoUploadParams;", "", "fileName", "", "fileType", "data", "", "challengeId", "challengeList", "", "Lcom/onfido/api/client/data/LiveVideoChallenges$LiveVideoChallenge;", "challengeSwitchTimestamp", "", "languages", "Lcom/onfido/api/client/data/LiveVideoLanguage;", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V", "getChallengeId", "()Ljava/lang/String;", "getChallengeList", "()Ljava/util/List;", "getChallengeSwitchTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getData", "()[B", "getFileName", "getFileType", "getLanguages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)Lcom/onfido/android/sdk/capture/network/OnfidoApiService$VideoUploadParams;", "equals", "", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VideoUploadParams {
        private final String challengeId;
        private final List<LiveVideoChallenges.LiveVideoChallenge> challengeList;
        private final Long challengeSwitchTimestamp;
        private final byte[] data;
        private final String fileName;
        private final String fileType;
        private final List<LiveVideoLanguage> languages;

        /* JADX WARN: Multi-variable type inference failed */
        public VideoUploadParams(String str, String str2, byte[] bArr, String str3, List<? extends LiveVideoChallenges.LiveVideoChallenge> list, Long l2, List<LiveVideoLanguage> list2) {
            this.fileName = str;
            this.fileType = str2;
            this.data = bArr;
            this.challengeId = str3;
            this.challengeList = list;
            this.challengeSwitchTimestamp = l2;
            this.languages = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoUploadParams copy$default(VideoUploadParams videoUploadParams, String str, String str2, byte[] bArr, String str3, List list, Long l2, List list2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = videoUploadParams.fileName;
            }
            if ((i & 2) != 0) {
                str2 = videoUploadParams.fileType;
            }
            if ((i & 4) != 0) {
                bArr = videoUploadParams.data;
            }
            if ((i & 8) != 0) {
                str3 = videoUploadParams.challengeId;
            }
            if ((i & 16) != 0) {
                list = videoUploadParams.challengeList;
            }
            if ((i & 32) != 0) {
                l2 = videoUploadParams.challengeSwitchTimestamp;
            }
            if ((i & 64) != 0) {
                list2 = videoUploadParams.languages;
            }
            Long l3 = l2;
            List list3 = list2;
            List list4 = list;
            byte[] bArr2 = bArr;
            return videoUploadParams.copy(str, str2, bArr2, str3, list4, l3, list3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFileType() {
            return this.fileType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getChallengeId() {
            return this.challengeId;
        }

        public final List<LiveVideoChallenges.LiveVideoChallenge> component5() {
            return this.challengeList;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Long getChallengeSwitchTimestamp() {
            return this.challengeSwitchTimestamp;
        }

        public final List<LiveVideoLanguage> component7() {
            return this.languages;
        }

        @NotNull
        public final VideoUploadParams copy(String fileName, String fileType, byte[] data, String challengeId, List<? extends LiveVideoChallenges.LiveVideoChallenge> challengeList, Long challengeSwitchTimestamp, List<LiveVideoLanguage> languages) {
            return new VideoUploadParams(fileName, fileType, data, challengeId, challengeList, challengeSwitchTimestamp, languages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoUploadParams)) {
                return false;
            }
            VideoUploadParams videoUploadParams = (VideoUploadParams) other;
            if (!Intrinsics.f(this.fileName, videoUploadParams.fileName) || !Intrinsics.f(this.fileType, videoUploadParams.fileType)) {
                return false;
            }
            byte[] bArr = this.data;
            if (bArr != null) {
                byte[] bArr2 = videoUploadParams.data;
                if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                    return false;
                }
            } else if (videoUploadParams.data != null) {
                return false;
            }
            return Intrinsics.f(this.challengeId, videoUploadParams.challengeId) && Intrinsics.f(this.challengeList, videoUploadParams.challengeList) && Intrinsics.f(this.challengeSwitchTimestamp, videoUploadParams.challengeSwitchTimestamp) && Intrinsics.f(this.languages, videoUploadParams.languages);
        }

        public final String getChallengeId() {
            return this.challengeId;
        }

        public final List<LiveVideoChallenges.LiveVideoChallenge> getChallengeList() {
            return this.challengeList;
        }

        public final Long getChallengeSwitchTimestamp() {
            return this.challengeSwitchTimestamp;
        }

        public final byte[] getData() {
            return this.data;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getFileType() {
            return this.fileType;
        }

        public final List<LiveVideoLanguage> getLanguages() {
            return this.languages;
        }

        public int hashCode() {
            String str = this.fileName;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.fileType;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            byte[] bArr = this.data;
            int iHashCode3 = (iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            String str3 = this.challengeId;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            List<LiveVideoChallenges.LiveVideoChallenge> list = this.challengeList;
            int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
            Long l2 = this.challengeSwitchTimestamp;
            int iHashCode6 = (iHashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
            List<LiveVideoLanguage> list2 = this.languages;
            return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("VideoUploadParams(fileName=");
            sb6.append(this.fileName);
            sb6.append(", fileType=");
            sb6.append(this.fileType);
            sb6.append(", data=");
            sb6.append(Arrays.toString(this.data));
            sb6.append(", challengeId=");
            sb6.append(this.challengeId);
            sb6.append(", challengeList=");
            sb6.append(this.challengeList);
            sb6.append(", challengeSwitchTimestamp=");
            sb6.append(this.challengeSwitchTimestamp);
            sb6.append(", languages=");
            return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.languages, sb6);
        }
    }

    public OnfidoApiService(@NotNull OnfidoAPI onfidoApi, @NotNull IdentityInteractor identityInteractor, @NotNull OnfidoConfig onfidoConfig, @NotNull SdkUploadMetadataHelper sdkUploadMetadataHelper, @NotNull TokenExpirationServiceConnector tokenExpirationServiceConnetor, @NotNull Cryptography cryptography, @NotNull TokenProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(onfidoApi, "onfidoApi");
        Intrinsics.checkNotNullParameter(identityInteractor, "identityInteractor");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(sdkUploadMetadataHelper, "sdkUploadMetadataHelper");
        Intrinsics.checkNotNullParameter(tokenExpirationServiceConnetor, "tokenExpirationServiceConnetor");
        Intrinsics.checkNotNullParameter(cryptography, "cryptography");
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        this.onfidoApi = onfidoApi;
        this.identityInteractor = identityInteractor;
        this.onfidoConfig = onfidoConfig;
        this.sdkUploadMetadataHelper = sdkUploadMetadataHelper;
        this.tokenExpirationServiceConnetor = tokenExpirationServiceConnetor;
        this.cryptography = cryptography;
        this.tokenProvider = tokenProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ErrorType.InvalidCertificate asCertificateError(Throwable th10) {
        if (!(th10 instanceof SSLPeerUnverifiedException)) {
            return null;
        }
        String localizedMessage = th10.getLocalizedMessage();
        if (localizedMessage != null) {
            return new ErrorType.InvalidCertificate(localizedMessage);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private DeviceInfo deviceInfo() {
        return this.identityInteractor.getDeviceInfo$onfido_capture_sdk_core_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> Single<T> retrySingleRequest(final Single<T> single) {
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.network.OnfidoApiService.retrySingleRequest.1
            @Override // igm.o
            @NotNull
            public final SingleSource apply(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (!(throwable instanceof TokenExpiredException) || !OnfidoApiService.this.onfidoConfig.getTokenExpirationHandlerEnabled()) {
                    return Single.e(throwable);
                }
                Completable completable = OnfidoApiService.this.tokenRefreshTask();
                Single singleRetrySingleRequest = OnfidoApiService.this.retrySingleRequest(single);
                completable.getClass();
                Objects.requireNonNull(singleRetrySingleRequest, "next is null");
                return new d(singleRetrySingleRequest, completable, 0);
            }
        };
        single.getClass();
        tgm.g gVar = new tgm.g(single, oVar, 3);
        Intrinsics.checkNotNullExpressionValue(gVar, "onErrorResumeNext(...)");
        return gVar;
    }

    private DocumentMediaIntegrity toMediaIntegrity(byte[] bArr) {
        InternalToken internalTokenProvideToken = this.tokenProvider.provideToken();
        Intrinsics.i(internalTokenProvideToken, "null cannot be cast to non-null type com.onfido.api.client.token.sdk.InternalSDKToken");
        Cryptography.Result resultSign = this.cryptography.sign(bArr, ((InternalSDKToken) internalTokenProvideToken).b());
        return new DocumentMediaIntegrity(ByteArrayExtensionsKt.toBase64String(resultSign.getSignature()), a0.u(resultSign.getClientNonce()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Completable tokenRefreshTask() {
        return this.tokenExpirationServiceConnetor.connect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void upload$lambda$2$uploadDocument(OnfidoApiService onfidoApiService, PhotoUploadParams photoUploadParams, OnfidoApiListener<DocumentUpload> onfidoApiListener) {
        LinkedHashMap linkedHashMap;
        OnfidoAPI onfidoAPI = onfidoApiService.onfidoApi;
        String fileName = photoUploadParams.getFileName();
        DocType documentType = photoUploadParams.getDocumentType();
        String fileType = photoUploadParams.getFileType();
        byte[] data = photoUploadParams.getData();
        List<Validation> validations = photoUploadParams.getValidations();
        if (validations != null) {
            int iB = q0.b(w.t(validations, 10));
            if (iB < 16) {
                iB = 16;
            }
            linkedHashMap = new LinkedHashMap(iB);
            for (Validation validation : validations) {
                linkedHashMap.put(ValidationType.a(validation.getType()), ValidationLevel.a(validation.getLevel()));
            }
        } else {
            linkedHashMap = null;
        }
        onfidoAPI.b(fileName, documentType, fileType, data, onfidoApiListener, linkedHashMap, photoUploadParams.getSide(), photoUploadParams.getIssuingCountry(), onfidoApiService.toMediaIntegrity(photoUploadParams.getData()), photoUploadParams.getSdkUploadMetaData());
    }

    public static /* synthetic */ Single uploadDocument$onfido_capture_sdk_core_release$default(OnfidoApiService onfidoApiService, String str, String str2, DocumentMediaType documentMediaType, DocumentType documentType, byte[] bArr, SdkUploadMetaData sdkUploadMetaData, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDocument");
        }
        if ((i & 8) != 0) {
            documentType = null;
        }
        DocumentType documentType2 = documentType;
        if ((i & 32) != 0) {
            sdkUploadMetaData = onfidoApiService.sdkUploadMetadataHelper.create();
        }
        return onfidoApiService.uploadDocument$onfido_capture_sdk_core_release(str, str2, documentMediaType, documentType2, bArr, sdkUploadMetaData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Single uploadDocumentMedia$onfido_capture_sdk_core_release$default(OnfidoApiService onfidoApiService, String str, String str2, DocumentMediaType documentMediaType, DocSide docSide, DocumentType documentType, List list, byte[] bArr, SdkUploadMetaData sdkUploadMetaData, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDocumentMedia");
        }
        if ((i & 8) != 0) {
            docSide = null;
        }
        if ((i & 16) != 0) {
            documentType = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        if ((i & 128) != 0) {
            sdkUploadMetaData = onfidoApiService.sdkUploadMetadataHelper.create();
        }
        return onfidoApiService.uploadDocumentMedia$onfido_capture_sdk_core_release(str, str2, documentMediaType, docSide, documentType, list, bArr, sdkUploadMetaData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadLivePhoto$uploadPhoto(OnfidoApiService onfidoApiService, String str, String str2, byte[] bArr, boolean z, PayloadIntegrity payloadIntegrity, OnfidoApiListener<LivePhotoUpload> onfidoApiListener) {
        onfidoApiService.onfidoApi.h(str, str2, bArr, z, onfidoApiListener, onfidoApiService.sdkUploadMetadataHelper.create(), payloadIntegrity);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NotNull
    public Single<NfcProperties> getNfcProperties$onfido_capture_sdk_core_release(@NotNull List<String> documentIds, MRZDocument mrzDocument) {
        Intrinsics.checkNotNullParameter(documentIds, "documentIds");
        com.onfido.api.client.data.MRZDocument mRZDocument = null;
        if (mrzDocument != null) {
            DocumentType documentType = mrzDocument.getDocumentType();
            mRZDocument = new com.onfido.api.client.data.MRZDocument(documentType != null ? documentType.name() : null, mrzDocument.getCountryCode(), mrzDocument.getName(), mrzDocument.getSurname(), mrzDocument.getDocumentNumber(), mrzDocument.getNationality(), mrzDocument.getDateOfBirth(), mrzDocument.getDateOfIssue(), mrzDocument.getDateOfExpire(), mrzDocument.getSex());
        }
        Single singleC = this.onfidoApi.c(documentIds, mRZDocument);
        Intrinsics.checkNotNullExpressionValue(singleC, "getNfcProperties(...)");
        return retrySingleRequest(singleC);
    }

    @NotNull
    public Single<SdkConfiguration> getSDKConfig$onfido_capture_sdk_core_release() {
        Single singleF = this.onfidoApi.f(deviceInfo());
        Intrinsics.checkNotNullExpressionValue(singleF, "getSDKConfig(...)");
        return retrySingleRequest(singleF);
    }

    @NotNull
    public Single<SupportedDocuments> getSupportedDocuments$onfido_capture_sdk_core_release() {
        Single supportedDocuments = this.onfidoApi.getSupportedDocuments();
        Intrinsics.checkNotNullExpressionValue(supportedDocuments, "getSupportedDocuments(...)");
        return retrySingleRequest(supportedDocuments);
    }

    @NotNull
    public Single<LiveVideoChallenges> liveVideoChallenges$onfido_capture_sdk_core_release() {
        Single liveVideoChallenges = this.onfidoApi.getLiveVideoChallenges();
        Intrinsics.checkNotNullExpressionValue(liveVideoChallenges, "getLiveVideoChallenges(...)");
        return retrySingleRequest(liveVideoChallenges);
    }

    public void upload$onfido_capture_sdk_core_release(@NotNull final PhotoUploadParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        final OnfidoApiServiceListener<DocumentUpload> listener = params.getListener();
        upload$lambda$2$uploadDocument(this, params, new OnfidoApiListener<DocumentUpload>(listener) { // from class: com.onfido.android.sdk.capture.network.OnfidoApiService$upload$1$documentUploadListener$1
            @Override // com.onfido.android.sdk.capture.network.OnfidoApiService.OnfidoApiListener
            public void onTokenRefreshed() {
                OnfidoApiService.upload$lambda$2$uploadDocument(this.this$0, params, this);
            }
        });
    }

    @NotNull
    public Single<DocumentMediaUploadResponse> uploadDocument$onfido_capture_sdk_core_release(@NotNull String fileName, @NotNull String fileType, @NotNull DocumentMediaType mediaType, DocumentType docType, byte[] data, SdkUploadMetaData sdkUploadMetaData) {
        DocType docType2;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        OnfidoAPI onfidoAPI = this.onfidoApi;
        if (docType == null || (docType2 = OnfidoExtensionsKt.toDocType(docType)) == null) {
            docType2 = DocType.UNKNOWN;
        }
        tgm.g gVarG = onfidoAPI.a(fileName, docType2, fileType, mediaType.name(), data, sdkUploadMetaData).g(new o() { // from class: com.onfido.android.sdk.capture.network.OnfidoApiService$uploadDocument$1
            @Override // igm.o
            @NotNull
            public final DocumentMediaUploadResponse apply(@NotNull DocumentUpload result) {
                Intrinsics.checkNotNullParameter(result, "result");
                return new DocumentMediaUploadResponse(new DocumentBinaryMedia(result.getId()), (DocumentValidationWarningsBundle) null, (List) null, (String) null, (DocumentFeatures) null, 30, (DefaultConstructorMarker) null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(gVarG, "map(...)");
        return gVarG;
    }

    @NotNull
    public Single<DocumentMediaUploadResponse> uploadDocumentMedia$onfido_capture_sdk_core_release(@NotNull String fileName, String fileType, @NotNull DocumentMediaType mediaType, DocSide docSide, DocumentType docType, List<Validation> validations, byte[] data, SdkUploadMetaData sdkUploadMetaData) {
        DocType docType2;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        if (docType == null || (docType2 = OnfidoExtensionsKt.toDocType(docType)) == null) {
            docType2 = DocType.UNKNOWN;
        }
        String id10 = docType2.getId();
        OnfidoAPI onfidoAPI = this.onfidoApi;
        String strName = mediaType.name();
        String id11 = docSide != null ? docSide.getId() : null;
        if (validations != null) {
            int iB = q0.b(w.t(validations, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
            for (Validation validation : validations) {
                linkedHashMap2.put(ValidationType.a(validation.getType()), ValidationLevel.a(validation.getLevel()));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        Single<DocumentMediaUploadResponse> singleG = onfidoAPI.g(fileName, fileType, strName, id11, id10, linkedHashMap, data, sdkUploadMetaData);
        Intrinsics.checkNotNullExpressionValue(singleG, "uploadDocumentMedia(...)");
        return singleG;
    }

    @NotNull
    public Single<String> uploadDocumentVideo$onfido_capture_sdk_core_release(@NotNull String documentId, @NotNull String videoPath, @NotNull SdkUploadMetaData sdkUploadMetaData, @NotNull InternalDocSide docSide, @NotNull DocType docType, String issuingCountry) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        Intrinsics.checkNotNullParameter(docType, "docType");
        Single<String> singleE = this.onfidoApi.e(documentId, videoPath, sdkUploadMetaData, toMediaIntegrity(m.d(new File(videoPath))), docSide, docType, issuingCountry);
        Intrinsics.checkNotNullExpressionValue(singleE, "uploadDocumentVideo(...)");
        return singleE;
    }

    public void uploadLivePhoto$onfido_capture_sdk_core_release(final String fileName, final String fileType, final byte[] data, final boolean advancedValidation, @NotNull final PayloadIntegrity payloadIntegrity, @NotNull final OnfidoApiServiceListener<LivePhotoUpload> listener) {
        Intrinsics.checkNotNullParameter(payloadIntegrity, "payloadIntegrity");
        Intrinsics.checkNotNullParameter(listener, "listener");
        uploadLivePhoto$uploadPhoto(this, fileName, fileType, data, advancedValidation, payloadIntegrity, new OnfidoApiListener<LivePhotoUpload>(listener) { // from class: com.onfido.android.sdk.capture.network.OnfidoApiService$uploadLivePhoto$photoUploadListener$1
            @Override // com.onfido.android.sdk.capture.network.OnfidoApiService.OnfidoApiListener
            public void onTokenRefreshed() {
                OnfidoApiService.uploadLivePhoto$uploadPhoto(this.this$0, fileName, fileType, data, advancedValidation, payloadIntegrity, this);
            }
        });
    }

    @NotNull
    public Observable uploadLiveVideo$onfido_capture_sdk_core_release(@NotNull VideoUploadParams params, @NotNull PayloadIntegrity payloadIntegrity) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(payloadIntegrity, "payloadIntegrity");
        Observable observableL = this.onfidoApi.d(params.getFileName(), params.getFileType(), params.getData(), params.getChallengeId(), params.getChallengeList(), params.getChallengeSwitchTimestamp(), params.getLanguages(), this.sdkUploadMetadataHelper.create(), payloadIntegrity).l();
        Intrinsics.checkNotNullExpressionValue(observableL, "toObservable(...)");
        return observableL;
    }

    @NotNull
    public Single<PoaDocumentUpload> uploadPoaDocument$onfido_capture_sdk_core_release(@NotNull PoaDocumentUploadParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Single<PoaDocumentUpload> singleI = this.onfidoApi.i(params.getFileName(), params.getPoaDocumentType(), params.getFileType(), params.getData(), params.getIssuingCountry(), this.sdkUploadMetadataHelper.create());
        Intrinsics.checkNotNullExpressionValue(singleI, "with(...)");
        return singleI;
    }
}
