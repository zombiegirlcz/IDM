package com.revolut.feature.card_order_new.impl.delivery.api.repository.network;

import efm.d0;
import ib.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import v13.c;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0089\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH'¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/delivery/api/repository/network/DeliveryService;", "", "", "postcode", "country", "cardBrand", "cardDesignType", "replaceableCardId", "planId", "walletId", "", "customised", "cardProfileId", "", b.Features, "Lefm/d0;", "Lv13/c;", "getDeliveryDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)Lefm/d0;", "id", "getDeliveryMethods", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lno3/b;", "getDeliveryAddresses", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeliveryService {
    @GET("/my-card/delivery/addresses")
    Object getDeliveryAddresses(@Query("walletId") String str, @NotNull Continuation<? super List<no3.b>> continuation);

    @GET("delivery/methods")
    @NotNull
    d0<c> getDeliveryDetails(@NotNull @Query("postcode") String postcode, @NotNull @Query("country") String country, @NotNull @Query("brand") String cardBrand, @NotNull @Query("design") String cardDesignType, @Query("replaceableCardId") String replaceableCardId, @Query("planId") String planId, @Query("walletId") String walletId, @Query("customised") boolean customised, @Query("cardProfileId") String cardProfileId, @Query(b.Features) List<String> features);

    @GET("/my-card/{id}/delivery")
    @NotNull
    d0<c> getDeliveryMethods(@Path("id") @NotNull String id10, @NotNull @Query("postcode") String postcode, @NotNull @Query("country") String country);
}
