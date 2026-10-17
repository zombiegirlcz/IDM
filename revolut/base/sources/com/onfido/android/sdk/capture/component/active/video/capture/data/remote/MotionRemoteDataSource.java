package com.onfido.android.sdk.capture.component.active.video.capture.data.remote;

import com.onfido.android.sdk.capture.common.cryptography.Cryptography;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.model.AVCUploadResponse;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.MotionDataSource;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import igm.q;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import okhttp3.c;
import org.jetbrains.annotations.NotNull;
import tgm.b;
import ulm.a1;
import ulm.b1;
import ulm.e1;
import ulm.k1;
import ulm.o1;
import ulm.p1;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionRemoteDataSource;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/repository/MotionDataSource;", "motionCaptureVariantOptions", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "motionApi", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionApi;", "payloadHelper", "Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "motionMetaDataHelper", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionMetaDataHelper;", "(Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionApi;Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionMetaDataHelper;)V", "uploadMotionCapture", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/model/AVCUploadResponse;", "videoFile", "Ljava/io/File;", "isAudioEnabled", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionRemoteDataSource implements MotionDataSource {

    @NotNull
    private final MotionApi motionApi;

    @NotNull
    private final MotionCaptureVariantOptions motionCaptureVariantOptions;

    @NotNull
    private final MotionMetaDataHelper motionMetaDataHelper;

    @NotNull
    private final PayloadHelper payloadHelper;

    @NotNull
    private static final String VIDEO_PART_NAME = "media";

    @NotNull
    private static final String MEDIA_TYPE_VIDEO = "video/mp4";

    @NotNull
    private static final String TYPE_PART_MOTION = "motion_capture";

    public MotionRemoteDataSource(@NotNull MotionCaptureVariantOptions motionCaptureVariantOptions, @NotNull MotionApi motionApi, @NotNull PayloadHelper payloadHelper, @NotNull MotionMetaDataHelper motionMetaDataHelper) {
        Intrinsics.checkNotNullParameter(motionCaptureVariantOptions, "motionCaptureVariantOptions");
        Intrinsics.checkNotNullParameter(motionApi, "motionApi");
        Intrinsics.checkNotNullParameter(payloadHelper, "payloadHelper");
        Intrinsics.checkNotNullParameter(motionMetaDataHelper, "motionMetaDataHelper");
        this.motionCaptureVariantOptions = motionCaptureVariantOptions;
        this.motionApi = motionApi;
        this.payloadHelper = payloadHelper;
        this.motionMetaDataHelper = motionMetaDataHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SingleSource uploadMotionCapture$lambda$0(File videoFile, MotionRemoteDataSource this$0, boolean z) {
        Intrinsics.checkNotNullParameter(videoFile, "$videoFile");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        e1 e1Var = MultipartBody$Part.Companion;
        String name = videoFile.getName();
        p1 p1Var = RequestBody.Companion;
        b1.Companion.getClass();
        b1 b1VarA = a1.a("video/mp4");
        p1Var.getClass();
        k1 k1VarA = p1.a(videoFile, b1VarA);
        e1Var.getClass();
        MultipartBody$Part multipartBody$PartC = e1.c("media", name, k1VarA);
        String metaData = this$0.motionMetaDataHelper.getMetaData(z);
        b1 b1Var = c.f226117n;
        o1 o1VarB = p1.b(metaData, b1Var);
        o1 o1VarB2 = p1.b("motion_capture", b1Var);
        Cryptography.Result signedPayload = this$0.payloadHelper.getSignedPayload(videoFile, metaData);
        String encryptedBiometricToken = this$0.motionCaptureVariantOptions.getEncryptedBiometricToken();
        o1 o1VarB3 = encryptedBiometricToken != null ? p1.b(encryptedBiometricToken, b1Var) : null;
        MotionApi motionApi = this$0.motionApi;
        RequestBody signaturePart = this$0.payloadHelper.getSignaturePart(signedPayload);
        RequestBody clientNoncePart = this$0.payloadHelper.getClientNoncePart(signedPayload);
        return o1VarB3 != null ? motionApi.uploadFaceScanForAuth(multipartBody$PartC, o1VarB2, o1VarB, signaturePart, clientNoncePart, o1VarB3) : motionApi.uploadFaceScan(multipartBody$PartC, o1VarB2, o1VarB, signaturePart, clientNoncePart);
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.data.repository.MotionDataSource
    @NotNull
    public Single<AVCUploadResponse> uploadMotionCapture(@NotNull final File videoFile, final boolean isAudioEnabled) {
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        b bVar = new b(new q() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.data.remote.a
            @Override // igm.q
            public final Object get() {
                return MotionRemoteDataSource.uploadMotionCapture$lambda$0(videoFile, this, isAudioEnabled);
            }
        }, 1);
        Intrinsics.checkNotNullExpressionValue(bVar, "defer(...)");
        return bVar;
    }
}
