package com.revolut.feature.rev_points.buying.impl.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rub.m;
import rub.p;
import sub.c;
import sub.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0014\u001a\u00020\tH§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/buying/impl/data/network/RevPointsBuyingService;", "", "Lrub/m;", "getPointsBuyingPackages", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrub/c;", "getPointsBuyingActivePackage", "Lsub/c;", "buyPointsRequest", "", "idempotencyKey", "Lretrofit2/Response;", "", "buyPoints", "(Lsub/c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsub/f;", "recurringPurchaseRequest", "Lrub/p;", "createRecurringPurchase", "(Lsub/f;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "standingOrderId", "modifyRecurringPurchase", "(Ljava/lang/String;Lsub/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecurringPurchase", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_rev_points_buying_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsBuyingService {
    @POST("loyalty/points-buying/buy")
    Object buyPoints(@Body @NotNull c cVar, @Header("X-Idempotency-Key") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("loyalty/points-buying/recurring")
    Object createRecurringPurchase(@Body @NotNull f fVar, @Header("X-Idempotency-Key") @NotNull String str, @NotNull Continuation<? super Response<p>> continuation);

    @DELETE("loyalty/points-buying/recurring/{standingOrderId}")
    Object deleteRecurringPurchase(@Path("standingOrderId") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("loyalty/points-buying/packages/active")
    Object getPointsBuyingActivePackage(@NotNull Continuation<? super rub.c> continuation);

    @GET("loyalty/points-buying/packages")
    Object getPointsBuyingPackages(@NotNull Continuation<? super m> continuation);

    @PATCH("loyalty/points-buying/recurring/{standingOrderId}")
    Object modifyRecurringPurchase(@Path("standingOrderId") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<? super Response<p>> continuation);
}
