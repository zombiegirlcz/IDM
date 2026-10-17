package com.revolut.feature.home.nps.data.network;

import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ub7.d;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/home/nps/data/network/HomeNPSService;", "", "Lefm/d0;", "Lub7/d;", "getSurveys", "()Lefm/d0;", "", "id", "Lub7/b;", "request", "Lefm/b;", "submitSurvey", "(Ljava/lang/String;Lub7/b;)Lefm/b;", "closeSurvey", "(Ljava/lang/String;)Lefm/b;", "surveyName", "surveyEntityId", "submitSurveyForEntity", "(Ljava/lang/String;Ljava/lang/String;Lub7/b;)Lefm/b;", "feature_home_nps_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HomeNPSService {
    @DELETE("surveys/{id}")
    @NotNull
    b closeSurvey(@Path("id") @NotNull String id10);

    @GET("surveys")
    @NotNull
    d0<d> getSurveys();

    @PUT("surveys/{id}")
    @NotNull
    b submitSurvey(@Path("id") @NotNull String id10, @Body @NotNull ub7.b request);

    @PUT("/surveys/{surveyName}/{surveyEntityId}")
    @NotNull
    b submitSurveyForEntity(@Path("surveyName") @NotNull String surveyName, @Path("surveyEntityId") @NotNull String surveyEntityId, @Body @NotNull ub7.b request);
}
