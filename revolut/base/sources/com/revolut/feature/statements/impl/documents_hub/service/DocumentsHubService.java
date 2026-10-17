package com.revolut.feature.statements.impl.documents_hub.service;

import hyd.c;
import hyd.f;
import hyd.p0;
import hyd.s0;
import hyd.y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0017\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/statements/impl/documents_hub/service/DocumentsHubService;", "", "", "pathType", "productId", "Lhyd/s0;", "getScreen", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgyd/d;", "Lhyd/p0;", "getProducts-uyEGvDs", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "", "getHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgyd/b;", "idempotencyKey", "Lkotlinx/serialization/json/JsonObject;", "payload", "Lhyd/f;", "generateDocument-J5x8xF4", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateDocument", "requestId", "", "emailNotification", "Lhyd/y0;", "getDocumentRequestStatus", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhyd/c;", "request", "", "acknowledgeOpened", "(Lhyd/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DocumentsHubService {
    @POST("user/current/documents-hub/acknowledge-opened")
    Object acknowledgeOpened(@Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @POST("user/current/documents-hub/{pathType}/generate")
    /* JADX INFO: renamed from: generateDocument-J5x8xF4, reason: not valid java name */
    Object m3778generateDocumentJ5x8xF4(@Path("pathType") @NotNull String str, @Header("Idempotency-Key") @NotNull String str2, @Body @NotNull JsonObject jsonObject, @NotNull Continuation<? super f> continuation);

    @GET("user/current/documents-hub/requests/{requestId}")
    Object getDocumentRequestStatus(@Path("requestId") @NotNull String str, @Query("emailNotification") boolean z, @NotNull Continuation<? super y0> continuation);

    @GET("user/current/documents-hub/history")
    Object getHistory(@NotNull Continuation<? super List<Object>> continuation);

    @GET("user/current/documents-hub/{pathType}/products")
    /* JADX INFO: renamed from: getProducts-uyEGvDs, reason: not valid java name */
    Object m3779getProductsuyEGvDs(@Path("pathType") @NotNull String str, @NotNull Continuation<? super p0> continuation);

    @GET("user/current/documents-hub/{pathType}")
    Object getScreen(@Path("pathType") @NotNull String str, @Query("productId") String str2, @NotNull Continuation<? super s0> continuation);
}
