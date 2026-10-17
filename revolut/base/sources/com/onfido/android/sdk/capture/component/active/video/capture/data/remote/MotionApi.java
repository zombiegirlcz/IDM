package com.onfido.android.sdk.capture.component.active.video.capture.data.remote;

import com.onfido.android.sdk.capture.component.active.video.capture.data.remote.model.AVCUploadResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH'JJ\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\bH'¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionApi;", "", "uploadFaceScan", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/model/AVCUploadResponse;", "video", "Lokhttp3/MultipartBody$Part;", "type", "Lokhttp3/RequestBody;", "metadata", "signature", "clientNonce", "uploadFaceScanForAuth", "encryptedBiometricToken", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface MotionApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/data/remote/MotionApi$Companion;", "", "()V", "BIOMETRICS_AUTH_ENDPOINT", "", "BIOMETRICS_MEDIA_ENDPOINT", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        @NotNull
        private static final String BIOMETRICS_MEDIA_ENDPOINT = "biometrics/media";

        @NotNull
        private static final String BIOMETRICS_AUTH_ENDPOINT = "biometrics/authenticate";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @PUT("biometrics/media")
    @al.a(version = "v3.6")
    @NotNull
    @Multipart
    Single<AVCUploadResponse> uploadFaceScan(@NotNull @Part MultipartBody$Part video, @NotNull @Part("type") RequestBody type, @NotNull @Part("metadata") RequestBody metadata, @NotNull @Part("signature") RequestBody signature, @NotNull @Part("client_nonce") RequestBody clientNonce);

    @al.a(version = "v3.6")
    @NotNull
    @POST("biometrics/authenticate")
    @Multipart
    Single<AVCUploadResponse> uploadFaceScanForAuth(@NotNull @Part MultipartBody$Part video, @NotNull @Part("type") RequestBody type, @NotNull @Part("metadata") RequestBody metadata, @NotNull @Part("signature") RequestBody signature, @NotNull @Part("client_nonce") RequestBody clientNonce, @NotNull @Part("encrypted_biometric_token") RequestBody encryptedBiometricToken);
}
