package com.revolut.retail.feature.airportlounges.impl.network;

import efm.d0;
import gwi.i;
import gwi.s3;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\n¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/network/AirportSavedLoungesService;", "", "Lefm/d0;", "", "Lgwi/i;", "getSavedLounges", "()Lefm/d0;", "Lgwi/s3;", "request", "saveLounge", "(Lgwi/s3;)Lefm/d0;", "removeLounge", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportSavedLoungesService {
    @GET("/lounges/v2/favourites")
    @NotNull
    d0<List<i>> getSavedLounges();

    @NotNull
    @HTTP(hasBody = true, method = "DELETE", path = "/lounges/v2/favourites")
    d0<List<i>> removeLounge(@Body @NotNull s3 request);

    @POST("/lounges/v2/favourites")
    @NotNull
    d0<List<i>> saveLounge(@Body @NotNull s3 request);
}
