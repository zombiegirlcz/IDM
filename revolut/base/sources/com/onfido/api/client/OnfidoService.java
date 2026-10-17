package com.onfido.api.client;

import com.onfido.api.client.data.DocumentMediaUploadResponse;
import com.onfido.api.client.data.DocumentUpload;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.LiveVideoChallenges;
import com.onfido.api.client.data.LiveVideoUpload;
import com.onfido.api.client.data.NfcProperties;
import com.onfido.api.client.data.NfcPropertiesRequest;
import com.onfido.api.client.data.PoaDocumentUpload;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.api.client.data.SdkConfigurationRequestBody;
import com.onfido.api.client.data.SupportedDocuments;
import io.reactivex.rxjava3.core.Single;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes17.dex */
interface OnfidoService {
    @POST("live_video_challenge")
    @al.a(version = "v3.6")
    Single<LiveVideoChallenges> getLiveVideoChallenges();

    @POST("nfc_properties")
    @al.a(version = "v4")
    Single<NfcProperties> getNfcProperties(@Body NfcPropertiesRequest nfcPropertiesRequest);

    @POST("sdk/configurations")
    @al.a(version = "v3.5")
    Single<SdkConfiguration> getSdkConfiguration(@Body SdkConfigurationRequestBody sdkConfigurationRequestBody);

    @GET("sdk/documents")
    @al.a(version = "v3.6")
    Single<SupportedDocuments> getSupportedDocuments();

    @POST("documents")
    @al.a(version = "v3.6")
    Call<DocumentUpload> upload(@Header("x-onfido-sdk-media-signature") String str, @Header("x-onfido-sdk-client-nonce") String str2, @Body RequestBody requestBody);

    @POST("documents")
    @al.a(version = "v3.6")
    Single<DocumentUpload> uploadDocumentVideo(@Header("x-onfido-sdk-media-signature") String str, @Header("x-onfido-sdk-client-nonce") String str2, @Body RequestBody requestBody);

    @POST("live_photos")
    @al.a(version = "v3.6")
    Call<LivePhotoUpload> uploadLivePhoto(@Body RequestBody requestBody);

    @POST("live_videos")
    @al.a(version = "v3.6")
    Single<LiveVideoUpload> uploadLiveVideo(@Body RequestBody requestBody);

    @POST("documents/media")
    @al.a(version = "v4")
    Single<DocumentMediaUploadResponse> uploadMediaFile(@Header("X-Video-Auth") String str, @Body RequestBody requestBody);

    @POST("documents")
    @al.a(version = "v3.6")
    Single<PoaDocumentUpload> uploadPoa(@Body RequestBody requestBody);

    @POST("documents")
    @al.a(version = "v3.6")
    Single<DocumentUpload> uploadSingle(@Body RequestBody requestBody);
}
