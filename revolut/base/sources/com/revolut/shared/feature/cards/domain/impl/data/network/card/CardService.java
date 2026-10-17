package com.revolut.shared.feature.cards.domain.impl.data.network.card;

import efm.d0;
import ib.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import n6l.a0;
import n6l.m;
import n6l.u;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00022\b\b\u0001\u0010\b\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJu\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0013\u0010\u0014J£\u0001\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u009f\u0001\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0003\u0010\u001e\u001a\u00020\u001c2\b\b\u0003\u0010\u001f\u001a\u00020\u001c2\b\b\u0003\u0010 \u001a\u00020\u001c2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b!\u0010\"J¹\u0001\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00042\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u001c2\b\b\u0003\u0010\u001e\u001a\u00020\u001c2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\b\u001a\u00020\u0004H'¢\u0006\u0004\b&\u0010\u000bJ\u0019\u0010(\u001a\u00020'2\b\b\u0001\u0010\b\u001a\u00020\u0004H'¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00022\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b-\u0010.¨\u0006/À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/cards/domain/impl/data/network/card/CardService;", "", "Lefm/d0;", "", "", "", "getCardFeatures", "()Lefm/d0;", "cardId", "Ln6l/a0;", "getVirtualCardDesignsForCard", "(Ljava/lang/String;)Lefm/d0;", "productType", "subProductType", "walletId", "brand", "designsForPlanId", b.Features, "enabledExperiments", "getVirtualCardDesigns", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lefm/d0;", "replaceableCardId", "planId", "upgradeDesignsForPlanId", b.Flow, "Ln6l/u;", "getPhysicalCardDesigns", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "credit", "acquiring", "instalment", "crypto", "getVirtualCardDesignsLegacy", "(Ljava/lang/String;Ljava/lang/Boolean;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lefm/d0;", "creditCardDesigns", "getPhysicalCardDesignsLegacy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "getPhysicalCardDesignByCardId", "Lefm/b;", "verifyAddingCardToGooglePay", "(Ljava/lang/String;)Lefm/b;", "", "totalPrice", "Ln6l/m;", "getCardIssueCheckoutQuotes", "(J)Lefm/d0;", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardService {
    @GET("my-card/features")
    @NotNull
    d0<Map<String, List<String>>> getCardFeatures();

    @GET("/my-card/issue/checkout-quotes")
    @NotNull
    d0<m> getCardIssueCheckoutQuotes(@Query("totalPrice") long totalPrice);

    @GET("/my-card/designs/{cardId}")
    @NotNull
    d0<u> getPhysicalCardDesignByCardId(@Path("cardId") @NotNull String cardId);

    @GET("/my-card/designs")
    @NotNull
    d0<List<u>> getPhysicalCardDesigns(@NotNull @Query("walletId") String walletId, @Query("productType") String productType, @Query("subProductType") String subProductType, @Query("replaceableCardId") String replaceableCardId, @Query("planId") String planId, @Query("upgradeDesignsForPlanId") String upgradeDesignsForPlanId, @Query("designsForPlanId") String designsForPlanId, @Query(b.Features) List<String> features, @Query(b.Flow) String flow, @Query("brand") String brand, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("/my-card/designs")
    @NotNull
    @d
    d0<List<u>> getPhysicalCardDesignsLegacy(@NotNull @Query("walletId") String walletId, @Query("credit") Boolean creditCardDesigns, @Query("acquiring") boolean acquiring, @Query("replaceableCardId") String replaceableCardId, @Query("planId") String planId, @Query("upgradeDesignsForPlanId") String upgradeDesignsForPlanId, @Query("designsForPlanId") String designsForPlanId, @Query("productType") String productType, @Query("subProductType") String subProductType, @Query(b.Features) List<String> features, @Query(b.Flow) String flow, @Query("brand") String brand, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("my-card/designs/virtual")
    @NotNull
    d0<List<a0>> getVirtualCardDesigns(@Query("productType") String productType, @Query("subProductType") String subProductType, @Query("walletId") String walletId, @Query("brand") String brand, @Query("designsForPlanId") String designsForPlanId, @Query(b.Features) List<String> features, @Header("X-Enabled-Experiments") String enabledExperiments);

    @GET("my-card/{id}/designs/virtual")
    @NotNull
    d0<List<a0>> getVirtualCardDesignsForCard(@Path("id") @NotNull String cardId);

    @GET("my-card/designs/virtual")
    @NotNull
    @d
    d0<List<a0>> getVirtualCardDesignsLegacy(@Query("walletId") String walletId, @Query("credit") Boolean credit, @Query("acquiring") boolean acquiring, @Query("instalment") boolean instalment, @Query("crypto") boolean crypto, @Query("productType") String productType, @Query("subProductType") String subProductType, @Query("brand") String brand, @Query("designsForPlanId") String designsForPlanId, @Query(b.Features) List<String> features, @Header("X-Enabled-Experiments") String enabledExperiments);

    @POST("my-card/{id}/digital-wallets/google-pay/verification")
    @NotNull
    efm.b verifyAddingCardToGooglePay(@Path("id") @NotNull String cardId);
}
