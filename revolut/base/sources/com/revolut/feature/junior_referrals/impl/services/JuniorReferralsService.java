package com.revolut.feature.junior_referrals.impl.services;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import xk8.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_referrals/impl/services/JuniorReferralsService;", "", "", "juniorId", "Lefm/d0;", "Lxk8/b;", "getJuniorCampaign", "(Ljava/lang/String;)Lefm/d0;", "retail_feature_junior_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorReferralsService {
    @GET("youth/user/{id}/invite-campaigns/last-active")
    @NotNull
    d0<b> getJuniorCampaign(@Path("id") @NotNull String juniorId);
}
