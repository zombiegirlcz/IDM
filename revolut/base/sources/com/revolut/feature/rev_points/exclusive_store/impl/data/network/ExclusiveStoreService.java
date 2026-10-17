package com.revolut.feature.rev_points.exclusive_store.impl.data.network;

import efm.d0;
import hvb.c;
import hvb.f;
import hvb.i;
import hvb.l;
import hvb.o;
import hvb.r;
import hvb.u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\r\u001a\u00020\bH'¢\u0006\u0004\b\u0014\u0010\fJ)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\bH'¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/exclusive_store/impl/data/network/ExclusiveStoreService;", "", "Lhvb/u;", "body", "Lefm/d0;", "Lhvb/o;", "postPurchase", "(Lhvb/u;)Lefm/d0;", "", "purchaseId", "Lhvb/r;", "getPurchaseStatus", "(Ljava/lang/String;)Lefm/d0;", "auctionId", "Lhvb/i;", "request", "Lhvb/l;", "placeBid", "(Ljava/lang/String;Lhvb/i;)Lefm/d0;", "Lhvb/c;", "getAuctionDetails", "bidId", "Lhvb/f;", "getBidDetails", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ExclusiveStoreService {
    @GET("exclusive-store/auctions/{auctionId}")
    @NotNull
    d0<c> getAuctionDetails(@Path("auctionId") @NotNull String auctionId);

    @GET("exclusive-store/auctions/{auctionId}/bids/{bidId}")
    @NotNull
    d0<f> getBidDetails(@Path("auctionId") @NotNull String auctionId, @Path("bidId") @NotNull String bidId);

    @GET("exclusive-store/purchases/{purchaseId}")
    @NotNull
    d0<r> getPurchaseStatus(@Path("purchaseId") @NotNull String purchaseId);

    @POST("exclusive-store/auctions/{auctionId}/bids")
    @NotNull
    d0<l> placeBid(@Path("auctionId") @NotNull String auctionId, @Body @NotNull i request);

    @POST("exclusive-store/purchases")
    @NotNull
    d0<o> postPurchase(@Body @NotNull u body);
}
