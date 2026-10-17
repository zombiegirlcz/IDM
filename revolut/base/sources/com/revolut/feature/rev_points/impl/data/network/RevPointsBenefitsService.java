package com.revolut.feature.rev_points.impl.data.network;

import efm.d0;
import hxb.g;
import hxb.k;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H'¢\u0006\u0004\b\f\u0010\n¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/impl/data/network/RevPointsBenefitsService;", "", "", "plan", "Lefm/d0;", "Lhxb/g;", "getRevPointsAccountBenefits", "(Ljava/lang/String;)Lefm/d0;", "", "getRevPointsAccountBenefitsPreviews", "()Lefm/d0;", "Lhxb/k;", "getCardSpendBenefits", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsBenefitsService {
    @GET("point-account/benefits/card-spend")
    @NotNull
    d0<k> getCardSpendBenefits();

    @GET("point-account/benefits")
    @NotNull
    d0<g> getRevPointsAccountBenefits(@NotNull @Query("plan") String plan);

    @GET("point-account/benefits-previews")
    @NotNull
    d0<List<g>> getRevPointsAccountBenefitsPreviews();
}
