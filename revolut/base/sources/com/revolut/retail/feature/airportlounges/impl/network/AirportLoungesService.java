package com.revolut.retail.feature.airportlounges.impl.network;

import efm.d0;
import gwi.c;
import gwi.f;
import gwi.i;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u0007H'¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/network/AirportLoungesService;", "", "Lefm/d0;", "", "Lgwi/c;", "getAirports", "()Lefm/d0;", "", "airportId", "Lgwi/i;", "getLounges", "(Ljava/lang/String;)Lefm/d0;", "loungeId", "Lgwi/f;", "getLoungeDetails", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportLoungesService {
    @GET("/lounges/v2/airports")
    @NotNull
    d0<List<c>> getAirports();

    @GET("/lounges/v2/lounges/{loungeId}/details")
    @NotNull
    d0<f> getLoungeDetails(@Path("loungeId") @NotNull String loungeId);

    @GET("/lounges/v2/airports/{airportId}/lounges")
    @NotNull
    d0<List<i>> getLounges(@Path("airportId") @NotNull String airportId);
}
