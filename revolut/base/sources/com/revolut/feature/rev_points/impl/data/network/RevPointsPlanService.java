package com.revolut.feature.rev_points.impl.data.network;

import efm.d0;
import hxb.c0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/impl/data/network/RevPointsPlanService;", "", "Lefm/d0;", "", "Lhxb/d0;", "getPlanRewards", "()Lefm/d0;", "", "product", "", "activeAt", "Lhxb/c0;", "getRevPointsPlanRates", "(Ljava/lang/String;Ljava/lang/Long;)Lefm/d0;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsPlanService {
    @GET("point-account/plan-rewards")
    @NotNull
    d0<List<hxb.d0>> getPlanRewards();

    @GET("point-account/rates")
    @NotNull
    d0<List<c0>> getRevPointsPlanRates(@Query("product") String product, @Query("activeAt") Long activeAt);
}
