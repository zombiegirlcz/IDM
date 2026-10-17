package com.revolut.feature.shops.impl.service;

import efm.d0;
import eid.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shops/impl/service/ShopsService;", "", "", "campaignId", "Lefm/d0;", "Lretrofit2/Response;", "Leid/t;", "getInstructionByCampaignId", "(Ljava/lang/String;)Lefm/d0;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ShopsService {
    @GET("/shops/instructions")
    @NotNull
    d0<Response<t>> getInstructionByCampaignId(@NotNull @Query("campaignId") String campaignId);
}
