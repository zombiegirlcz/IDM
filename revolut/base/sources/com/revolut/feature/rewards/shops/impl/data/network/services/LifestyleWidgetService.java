package com.revolut.feature.rewards.shops.impl.data.network.services;

import efm.d0;
import hkc.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rewards/shops/impl/data/network/services/LifestyleWidgetService;", "", "", "", "headers", "", "tilesQuantity", "Lefm/d0;", "", "Lhkc/a;", "getTopOffers", "(Ljava/util/Map;I)Lefm/d0;", "feature_retail_rewards_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LifestyleWidgetService {
    @GET("/lifestyle/top-offers-widget")
    @NotNull
    d0<List<a>> getTopOffers(@HeaderMap @NotNull Map<String, String> headers, @Query("tilesQuantity") int tilesQuantity);
}
