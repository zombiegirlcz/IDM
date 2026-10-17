package com.revolut.feature.card_personalisation.generation.impl.network;

import g53.a;
import g53.c;
import g53.d;
import g53.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_personalisation/generation/impl/network/CustomisationImageGenerationService;", "", "Lg53/c;", "body", "", "idempotencyKey", "Lg53/d;", "generateImages", "(Lg53/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lg53/a;", "getGenerateImagesResult", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageId", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "getGeneratedImage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg53/f;", "getSuggestedPrompts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_card_personalisation_generation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CustomisationImageGenerationService {
    @POST("my-card/designs/customisation/request")
    Object generateImages(@Body @NotNull c cVar, @Header("X-Idempotency-Key") String str, @NotNull Continuation<? super d> continuation);

    @GET("my-card/designs/customisation/request/{id}")
    Object getGenerateImagesResult(@Path("id") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("my-card/designs/customisation/request/{id}/image/{imageId}")
    Object getGeneratedImage(@Path("id") @NotNull String str, @Path("imageId") @NotNull String str2, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("my-card/designs/customisation/request/prompts")
    Object getSuggestedPrompts(@NotNull Continuation<? super f> continuation);
}
