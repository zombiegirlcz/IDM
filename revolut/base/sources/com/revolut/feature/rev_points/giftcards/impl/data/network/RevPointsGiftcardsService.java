package com.revolut.feature.rev_points.giftcards.impl.data.network;

import awb.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import zvb.b;
import zvb.c;
import zvb.d;
import zvb.g;
import zvb.h;
import zvb.j;
import zvb.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\f\u0010\tJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0015\u0010\tJ \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0016\u0010\tJ*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000fH§@¢\u0006\u0004\b\u001d\u0010\u0004J\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u001e\u001a\u00020\u0005H§@¢\u0006\u0004\b \u0010\t¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/data/network/RevPointsGiftcardsService;", "", "Lzvb/l;", "getVoucherProductGroups", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "groupId", "Lzvb/j;", "getVoucherProductGroupDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voucherProductGroup", "Lzvb/g;", "getUserVouchers", "Lawb/a;", "purchaseVoucherRequestDto", "Lretrofit2/Response;", "Lzvb/b;", "purchaseVoucher", "(Lawb/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lzvb/d;", "getUserVoucherDetails", "pollUserVoucherDetails", "Lzvb/h;", "usedDto", "", "updateUserVoucherDetails", "(Ljava/lang/String;Lzvb/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/ResponseBody;", "getStatement", "query", "Lzvb/c;", "search", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsGiftcardsService {
    @GET("/loyalty/giftcards/statement")
    Object getStatement(@NotNull Continuation<? super Response<ResponseBody>> continuation);

    @GET("/loyalty/giftcards/vouchers/{id}")
    Object getUserVoucherDetails(@Path("id") @NotNull String str, @NotNull Continuation<? super d> continuation);

    @GET("/loyalty/giftcards/vouchers")
    Object getUserVouchers(@Query("voucherProductGroupId") String str, @NotNull Continuation<? super g> continuation);

    @GET("/loyalty/giftcards/voucher-product-groups/{groupId}")
    Object getVoucherProductGroupDetails(@Path("groupId") @NotNull String str, @NotNull Continuation<? super j> continuation);

    @GET("/loyalty/giftcards/voucher-product-groups")
    Object getVoucherProductGroups(@NotNull Continuation<? super l> continuation);

    @GET("/loyalty/giftcards/vouchers/{id}")
    Object pollUserVoucherDetails(@Path("id") @NotNull String str, @NotNull Continuation<? super Response<d>> continuation);

    @POST("/loyalty/giftcards/vouchers")
    Object purchaseVoucher(@Body @NotNull a aVar, @NotNull Continuation<? super Response<b>> continuation);

    @GET("/loyalty/giftcards/search")
    Object search(@NotNull @Query("query") String str, @NotNull Continuation<? super c> continuation);

    @PATCH("/loyalty/giftcards/vouchers/{id}")
    Object updateUserVoucherDetails(@Path("id") @NotNull String str, @Body @NotNull h hVar, @NotNull Continuation<? super Response<Unit>> continuation);
}
