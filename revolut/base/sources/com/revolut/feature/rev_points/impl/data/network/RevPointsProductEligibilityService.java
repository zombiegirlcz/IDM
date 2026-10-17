package com.revolut.feature.rev_points.impl.data.network;

import efm.d0;
import ib.b;
import ixb.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/impl/data/network/RevPointsProductEligibilityService;", "", "", "plan", b.Flow, "Lefm/d0;", "Lixb/a;", "getProductEligibilities", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "product", "Lixb/b;", "getProductEligibility", "(Ljava/lang/String;)Lefm/d0;", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsProductEligibilityService {
    @GET("/point-account/eligibility")
    @NotNull
    d0<a> getProductEligibilities(@NotNull @Query("plan") String plan, @Query(b.Flow) String flow);

    @GET("/point-account/eligibility/{product}")
    @NotNull
    d0<ixb.b> getProductEligibility(@Path("product") @NotNull String product);
}
