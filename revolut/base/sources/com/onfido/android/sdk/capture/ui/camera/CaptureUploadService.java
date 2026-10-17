package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.OnfidoExtensionsKt;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.ErrorData;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.api.client.exception.TokenExpiredException;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 ;2\u00020\u0001:\u0002;<B5\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJU\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u0012¢\u0006\u0004\b\u001f\u0010 JA\u0010#\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b!\u0010\"J/\u0010,\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020$H\u0010¢\u0006\u0004\b*\u0010+J\u000f\u0010/\u001a\u00020\u0014H\u0010¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0014\u00106\u001a\u0002058\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService;", "", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "captureType", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "onfidoApiService", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadServiceListener;", "listener", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "payloadHelper", "<init>", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;Lcom/onfido/android/sdk/capture/network/OnfidoApiService;Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadServiceListener;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;)V", "", "documentId", "videoPath", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "sdkUploadMetaData", "Lkotlin/Function1;", "", "onDocumentUploaded", "Lcom/onfido/api/client/data/DocSide;", "docSide", "Lcom/onfido/android/sdk/capture/DocumentType;", "docType", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "issuingCountry", "uploadDocumentVideoForDocumentId", "(Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/SdkUploadMetaData;Lkotlin/jvm/functions/Function1;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "extraInfo", "getPictureFileName", "(Ljava/lang/String;)Ljava/lang/String;", "uploadDocumentVideo$onfido_capture_sdk_core_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/SdkUploadMetaData;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "uploadDocumentVideo", "", "shouldAttemptValidation", "", "data", "metadata", "isPayloadSignatureEnabled", "uploadSelfie$onfido_capture_sdk_core_release", "(Z[BLcom/onfido/api/client/data/SdkUploadMetaData;Z)V", "uploadSelfie", "stop$onfido_capture_sdk_core_release", "()V", "stop", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadServiceListener;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "Lcom/onfido/android/sdk/capture/ui/camera/IQSUploadErrorParser;", "iqsUploadParser", "Lcom/onfido/android/sdk/capture/ui/camera/IQSUploadErrorParser;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Companion", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CaptureUploadService {

    @NotNull
    private final CaptureType captureType;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final IQSUploadErrorParser iqsUploadParser;

    @NotNull
    private final CaptureUploadServiceListener listener;

    @NotNull
    private final OnfidoApiService onfidoApiService;

    @NotNull
    private final PayloadHelper payloadHelper;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @Deprecated
    @NotNull
    public static final String PICTURE_FILENAME = "onfido_captured_image";

    @Deprecated
    @NotNull
    public static final String FILE_TYPE_JPG = "image/jpeg";

    @Deprecated
    @NotNull
    public static final String PICTURE_FILE_EXTENSION = ".jpg";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService$Companion;", "", "()V", "FILE_TYPE_JPG", "", "PICTURE_FILENAME", "PICTURE_FILE_EXTENSION", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "listener", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadServiceListener;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CaptureUploadService create(@NotNull CaptureType captureType, @NotNull CaptureUploadServiceListener listener);
    }

    public CaptureUploadService(@NotNull CaptureType captureType, @NotNull OnfidoApiService onfidoApiService, @NotNull CaptureUploadServiceListener listener, @NotNull SchedulersProvider schedulersProvider, @NotNull PayloadHelper payloadHelper) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(onfidoApiService, "onfidoApiService");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(payloadHelper, "payloadHelper");
        this.captureType = captureType;
        this.onfidoApiService = onfidoApiService;
        this.listener = listener;
        this.schedulersProvider = schedulersProvider;
        this.payloadHelper = payloadHelper;
        this.iqsUploadParser = new IQSUploadErrorParser();
        this.compositeDisposable = new CompositeDisposable();
    }

    private String getPictureFileName(String extraInfo) {
        return extraInfo != null ? p.a.p("onfido_captured_image_", extraInfo, ".jpg") : "onfido_captured_image.jpg";
    }

    public static /* synthetic */ String getPictureFileName$default(CaptureUploadService captureUploadService, String str, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPictureFileName");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return captureUploadService.getPictureFileName(str);
    }

    private void uploadDocumentVideoForDocumentId(String documentId, String videoPath, SdkUploadMetaData sdkUploadMetaData, final Function1<? super String, Unit> onDocumentUploaded, DocSide docSide, DocumentType docType, CountryCode issuingCountry) {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableI = new tgm.d(this.onfidoApiService.uploadDocumentVideo$onfido_capture_sdk_core_release(documentId, videoPath, sdkUploadMetaData, OnfidoExtensionsKt.toInternalDocSide(docSide), OnfidoExtensionsKt.toDocType(docType), issuingCountry != null ? issuingCountry.getAlpha3() : null).k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()), new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(videoPath, 8), 1).i(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.CaptureUploadService.uploadDocumentVideoForDocumentId.2
            @Override // igm.g
            public final void accept(@NotNull String it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                onDocumentUploaded.invoke(it8);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.camera.CaptureUploadService.uploadDocumentVideoForDocumentId.3
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                ErrorType errorType;
                ErrorType network;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                if (throwable instanceof TokenExpiredException) {
                    errorType = ErrorType.TokenExpired.INSTANCE;
                } else {
                    if (throwable instanceof SSLPeerUnverifiedException) {
                        String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
                        network = new ErrorType.InvalidCertificate(localizedMessage != null ? localizedMessage : "");
                    } else if (throwable instanceof HttpException) {
                        String message = throwable.getMessage();
                        network = new ErrorType.Network(message != null ? message : "");
                    } else {
                        errorType = ErrorType.Generic.INSTANCE;
                    }
                    errorType = network;
                }
                CaptureUploadService.this.listener.onUploadError(errorType);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadDocumentVideoForDocumentId$lambda$0(String videoPath) {
        Intrinsics.checkNotNullParameter(videoPath, "$videoPath");
        new File(videoPath).delete();
    }

    public void stop$onfido_capture_sdk_core_release() {
        this.compositeDisposable.d();
    }

    public void uploadDocumentVideo$onfido_capture_sdk_core_release(@NotNull String documentId, @NotNull String videoPath, @NotNull SdkUploadMetaData sdkUploadMetaData, @NotNull DocSide docSide, @NotNull DocumentType docType, CountryCode issuingCountry) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(sdkUploadMetaData, "sdkUploadMetaData");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        Intrinsics.checkNotNullParameter(docType, "docType");
        uploadDocumentVideoForDocumentId(documentId, videoPath, sdkUploadMetaData, new CaptureUploadService$uploadDocumentVideo$1(this.listener), docSide, docType, issuingCountry);
    }

    public void uploadSelfie$onfido_capture_sdk_core_release(boolean shouldAttemptValidation, @NotNull byte[] data, @NotNull SdkUploadMetaData metadata, boolean isPayloadSignatureEnabled) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.onfidoApiService.uploadLivePhoto$onfido_capture_sdk_core_release(getPictureFileName$default(this, null, 1, null), "image/jpeg", data, shouldAttemptValidation, this.payloadHelper.getSignedPayload(data, metadata, isPayloadSignatureEnabled), new OnfidoApiService.OnfidoApiServiceListener<LivePhotoUpload>() { // from class: com.onfido.android.sdk.capture.ui.camera.CaptureUploadService$uploadSelfie$livePhotoSuccessListener$1
            @Override // com.onfido.android.sdk.capture.network.OnfidoApiService.OnfidoApiServiceListener
            public void onError(int errorCode, @NotNull String message, @NotNull ErrorData errorData) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(errorData, "errorData");
                this.this$0.listener.onUploadError(this.this$0.iqsUploadParser.parseUploadError(errorData, this.this$0.captureType));
            }

            @Override // com.onfido.android.sdk.capture.network.OnfidoApiService.OnfidoApiServiceListener
            public void onSuccess(@NotNull LivePhotoUpload uploadedDocument) {
                Intrinsics.checkNotNullParameter(uploadedDocument, "uploadedDocument");
                this.this$0.listener.onLivePhotoUploaded(uploadedDocument);
            }

            @Override // com.onfido.android.sdk.capture.network.OnfidoApiService.OnfidoApiServiceListener
            public void onUploadError(@NotNull ErrorType errorType) {
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                this.this$0.listener.onUploadError(errorType);
            }
        });
    }
}
