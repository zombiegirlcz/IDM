package com.revolut.retail.feature.esim.impl.network;

import java.util.List;
import kfj.a4;
import kfj.b4;
import kfj.d2;
import kfj.h4;
import kfj.y;
import kfj.y3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mfj.e;
import mtj.k;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0006J$\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010$\u001a\u00020#2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010 \u001a\u00020\u00022\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b$\u0010%¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimPhoneNumberService;", "", "", "id", "Lkfj/a4;", "getPhoneNumber", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscriptionId", "mobilePlanId", "receiverUsername", "", "Lkfj/d2;", "getPhoneNumberSelections", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkfj/b4;", "esimSubscriptionPhoneNumberLabelRequestDto", "updatePhoneNumberLabel", "(Ljava/lang/String;Lkfj/b4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelPhoneNumber", "Lkfj/y3;", "getPhoneNumberCancellationPreview", "portingId", "phoneNumberId", "postPhoneNumberPortingCancellationRequest", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idempotencyKey", "Lkfj/h4;", "phoneNumberRequestDto", "Lretrofit2/Response;", "Lmfj/e;", "postSimPhones", "(Ljava/lang/String;Lkfj/h4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tierCode", "", "offset", "Lkfj/y;", "getFeaturedPhoneNumbers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimPhoneNumberService {
    static /* synthetic */ Object a(EsimPhoneNumberService esimPhoneNumberService, String str, String str2, String str3, k kVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return esimPhoneNumberService.getPhoneNumberSelections(str, str2, str3, kVar);
    }

    @POST("/connect/sim-phones/{id}/cancel")
    Object cancelPhoneNumber(@Path("id") @NotNull String str, @NotNull Continuation<? super a4> continuation);

    @GET("/connect/featured-phone-numbers")
    Object getFeaturedPhoneNumbers(@NotNull @Query("mobilePlanId") String str, @NotNull @Query("tierCode") String str2, @Query("offset") Long l2, @Query("receiverUsername") String str3, @NotNull Continuation<? super y> continuation);

    @GET("/connect/sim-phones/{id}")
    Object getPhoneNumber(@Path("id") @NotNull String str, @NotNull Continuation<? super a4> continuation);

    @GET("/connect/sim-phones/{id}/cancellation-preview")
    Object getPhoneNumberCancellationPreview(@Path("id") @NotNull String str, @NotNull Continuation<? super y3> continuation);

    @GET("/connect/phone-number-selections")
    Object getPhoneNumberSelections(@Query("subscriptionId") String str, @Query("mobilePlanId") String str2, @Query("receiverUsername") String str3, @NotNull Continuation<? super List<d2>> continuation);

    @POST("/connect/sim-phones/{phoneNumberId}/porting/{portingId}/cancel")
    Object postPhoneNumberPortingCancellationRequest(@Path("portingId") @NotNull String str, @Path("phoneNumberId") @NotNull String str2, @NotNull Continuation<? super a4> continuation);

    @POST("/connect/sim-phones")
    Object postSimPhones(@Header("X-Idempotency-Key") @NotNull String str, @Body @NotNull h4 h4Var, @NotNull Continuation<? super Response<e>> continuation);

    @PUT("/connect/sim-phones/{id}/label")
    Object updatePhoneNumberLabel(@Path("id") @NotNull String str, @Body @NotNull b4 b4Var, @NotNull Continuation<? super a4> continuation);
}
