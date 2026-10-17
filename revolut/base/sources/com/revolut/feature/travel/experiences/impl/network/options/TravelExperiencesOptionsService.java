package com.revolut.feature.travel.experiences.impl.network.options;

import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qzf.j;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import tzf.b;
import tzf.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JO\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\f\u0010\rJ_\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\t2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/network/options/TravelExperiencesOptionsService;", "", "", "id", "date", "currency", "", "", "ageBandsCount", "Lefm/d0;", "", "Ltzf/c;", "getExperienceOptions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "experienceId", "optionId", "time", "Ltzf/b;", "getExperienceOptionAvailability", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "Lqzf/j;", "getQuestions", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelExperiencesOptionsService {
    @GET("travels/experiences/experiences/{experienceId}/options/{optionId}/availability")
    @NotNull
    d0<b> getExperienceOptionAvailability(@Path("experienceId") @NotNull String experienceId, @Path("optionId") @NotNull String optionId, @NotNull @Query("date") String date, @NotNull @Query("currency") String currency, @Query("time") String time, @QueryMap @NotNull Map<String, Integer> ageBandsCount);

    @GET("travels/experiences/experiences/{id}/options")
    @NotNull
    d0<List<c>> getExperienceOptions(@Path("id") @NotNull String id10, @NotNull @Query("date") String date, @NotNull @Query("currency") String currency, @QueryMap @NotNull Map<String, Integer> ageBandsCount);

    @GET("travels/experiences/experiences/{experienceId}/options/{optionId}/questions")
    @NotNull
    d0<List<j>> getQuestions(@Path("experienceId") @NotNull String experienceId, @Path("optionId") @NotNull String optionId);
}
