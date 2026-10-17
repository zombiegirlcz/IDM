package com.revolut.feature.travel.experiences.impl.network.experience;

import e0g.a;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ozf.d;
import qzf.f;
import qzf.f0;
import qzf.g0;
import qzf.o;
import qzf.o0;
import qzf.p;
import qzf.u;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import szf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\f\u0010\rJ¯\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b \u0010!J'\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00052\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0019H'¢\u0006\u0004\b$\u0010%J-\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00052\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00192\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\"0\u0005H'¢\u0006\u0004\b+\u0010,J7\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b.\u0010\rJ\u001b\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\"0\u0005H'¢\u0006\u0004\b0\u0010,J\u0019\u00104\u001a\u0002032\b\b\u0001\u00102\u001a\u000201H'¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0005H'¢\u0006\u0004\b7\u0010,¨\u00068À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/network/experience/TravelExperiencesService;", "", "", "id", "currency", "Lefm/d0;", "Lqzf/p;", "getExperience", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "startDate", "endDate", "Lqzf/f;", "getAvailableDatesForExperience", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "destinationId", "attractionId", "paginationToken", "", "freeCancellation", "categories", "durations", "", "minPrice", "maxPrice", "coordinates", "", "limit", "Lszf/b;", "getExperiencesSummary", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;)Lefm/d0;", "count", "Lqzf/o0;", "getTopExperiences", "(Ljava/lang/String;Ljava/lang/Integer;)Lefm/d0;", "", "Lqzf/f0;", "getPopularCategories", "(Ljava/lang/Integer;)Lefm/d0;", "currentLocation", "Lqzf/o;", "getRecommendedCategories", "(Ljava/lang/Integer;Ljava/lang/String;)Lefm/d0;", "Lqzf/g0;", "getPopularDestinations", "()Lefm/d0;", "Lqzf/u;", "getFilters", "Le0g/a;", "getProviders", "Lozf/b;", "dropOffRequestDto", "Lefm/b;", "postDropOff", "(Lozf/b;)Lefm/b;", "Lozf/d;", "getRecentlyViewed", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelExperiencesService {
    @GET("travels/experiences/experiences/{id}/calendar")
    @NotNull
    d0<f> getAvailableDatesForExperience(@Path("id") @NotNull String id10, @Query("startDate") String startDate, @Query("endDate") String endDate);

    @GET("travels/experiences/experiences/{id}")
    @NotNull
    d0<p> getExperience(@Path("id") @NotNull String id10, @NotNull @Query("currency") String currency);

    @GET("travels/experiences/experiences")
    @NotNull
    d0<b> getExperiencesSummary(@Query("destinationId") String destinationId, @Query("attractionId") String attractionId, @Query("startDate") String startDate, @Query("endDate") String endDate, @NotNull @Query("currency") String currency, @Query("paginationToken") String paginationToken, @Query("freeCancellation") Boolean freeCancellation, @Query("categories") String categories, @Query("durations") String durations, @Query("minPrice") Long minPrice, @Query("maxPrice") Long maxPrice, @Query("coordinates") String coordinates, @Query("limit") Integer limit);

    @GET("travels/experiences/experiences/filters")
    @NotNull
    d0<u> getFilters(@NotNull @Query("currency") String currency, @Query("destinationId") String destinationId, @Query("attractionId") String attractionId);

    @GET("travels/experiences/categories/popular")
    @NotNull
    d0<List<f0>> getPopularCategories(@Query("count") Integer count);

    @GET("travels/experiences/destinations/popular")
    @NotNull
    d0<List<g0>> getPopularDestinations();

    @GET("travels/experiences/providers")
    @NotNull
    d0<List<a>> getProviders();

    @GET("travels/experiences/recently-viewed")
    @NotNull
    d0<d> getRecentlyViewed();

    @GET("travels/experiences/categories/recommended")
    @NotNull
    d0<o> getRecommendedCategories(@Query("count") Integer count, @Query("currentLocation") String currentLocation);

    @GET("travels/experiences/experiences/top")
    @NotNull
    d0<o0> getTopExperiences(@NotNull @Query("currency") String currency, @Query("count") Integer count);

    @POST("travels/experiences/dropoffs")
    @NotNull
    efm.b postDropOff(@Body @NotNull ozf.b dropOffRequestDto);
}
