package com.revolut.feature.apm.core.impl.data.network.transfer;

import hz1.a;
import hz1.c;
import hz1.d;
import hz1.e;
import hz1.f;
import hz1.g;
import hz1.h;
import hz1.o;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\f2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u000b\u001a\u00020\u00072\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00172\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0019\u0010\u001aJ0\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\u001d\u001a\u00020\u0007H§@¢\u0006\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/transfer/ApmTransferService;", "", "Lhz1/e;", "body", "Lwj0/b;", "idempotencyTag", "", "", "Lhz1/g;", "postInitiatePayment", "(Lhz1/e;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentIntentId", "Lhz1/a;", "Lhz1/b;", "postConfirmPayment", "(Ljava/lang/String;Lhz1/a;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhz1/h;", "Lhz1/o;", "quote", "(Lhz1/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "postSaveDraftPayment", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhz1/f;", "Lhz1/c;", "postPayDraftPayment", "(Ljava/lang/String;Lhz1/f;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patchPayment", "(Ljava/lang/String;Lhz1/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentMethod", "", "Lhz1/d;", "getDrafts", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmTransferService {
    @GET("payments/drafts")
    Object getDrafts(@NotNull @Query("paymentMethod") String str, @NotNull Continuation<? super List<d>> continuation);

    @PATCH("payments/drafts/{paymentIntentId}")
    Object patchPayment(@Path("paymentIntentId") @NotNull String str, @Body @NotNull e eVar, @NotNull Continuation<? super Map<String, g>> continuation);

    @POST("payments/{paymentIntentId}/confirm")
    Object postConfirmPayment(@Path("paymentIntentId") @NotNull String str, @Body @NotNull a aVar, @Tag b bVar, @NotNull Continuation<? super hz1.b> continuation);

    @POST("payments")
    Object postInitiatePayment(@Body @NotNull e eVar, @Tag b bVar, @NotNull Continuation<? super Map<String, g>> continuation);

    @POST("payments/drafts/{paymentIntentId}/pay")
    Object postPayDraftPayment(@Path("paymentIntentId") @NotNull String str, @Body @NotNull f fVar, @Tag b bVar, @NotNull Continuation<? super c> continuation);

    @POST("payments/drafts/{paymentIntentId}/save")
    Object postSaveDraftPayment(@Path("paymentIntentId") @NotNull String str, @Tag b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("payments/quote")
    Object quote(@Body @NotNull h hVar, @NotNull Continuation<? super o> continuation);
}
