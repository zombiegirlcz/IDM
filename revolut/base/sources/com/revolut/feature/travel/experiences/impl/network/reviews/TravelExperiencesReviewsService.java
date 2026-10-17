package com.revolut.feature.travel.experiences.impl.network.reviews;

import b0g.d;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/network/reviews/TravelExperiencesReviewsService;", "", "", "experienceId", "", "count", "paginatedToken", "Lefm/d0;", "Lb0g/d;", "getReviews", "(Ljava/lang/String;ILjava/lang/String;)Lefm/d0;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelExperiencesReviewsService {
    @GET("/travels/experiences/experiences/{id}/reviews")
    @NotNull
    d0<d> getReviews(@Path("id") @NotNull String experienceId, @Query("count") int count, @Query("paginatedToken") String paginatedToken);
}
