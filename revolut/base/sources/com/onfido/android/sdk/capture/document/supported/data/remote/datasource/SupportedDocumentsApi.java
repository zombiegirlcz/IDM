package com.onfido.android.sdk.capture.document.supported.data.remote.datasource;

import al.a;
import com.onfido.android.sdk.capture.document.supported.data.remote.model.SupportedDocumentsResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/document/supported/data/remote/datasource/SupportedDocumentsApi;", "", "getSupportedDocuments", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/document/supported/data/remote/model/SupportedDocumentsResponse;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SupportedDocumentsApi {
    @GET("supported_documents")
    @a(version = "v3.4")
    @NotNull
    Single<SupportedDocumentsResponse> getSupportedDocuments();
}
