package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import nt6.a;
import nt6.b;
import nt6.c;
import nt6.d;
import okhttp3.MultipartBody$Part;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerBrandingService;", "", "Lnt6/b;", "getBrandingSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnt6/c;", "request", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "updateBrandingSettings", "(Lnt6/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lokhttp3/MultipartBody$Part;", "data", "Lnt6/d;", "uploadImage", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "imageId", "Lnt6/a;", "getImageData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerBrandingService {
    @GET("/acquiring/checkout-branding")
    Object getBrandingSettings(@NotNull Continuation<? super b> continuation);

    @GET("/acquiring/checkout-branding-images/{imageId}")
    Object getImageData(@Path("imageId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @PATCH("/acquiring/checkout-branding")
    Object updateBrandingSettings(@Body @NotNull c cVar, @NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("/acquiring/checkout-branding-images")
    @Multipart
    Object uploadImage(@NotNull @Part List<MultipartBody$Part> list, @NotNull Continuation<? super d> continuation);
}
