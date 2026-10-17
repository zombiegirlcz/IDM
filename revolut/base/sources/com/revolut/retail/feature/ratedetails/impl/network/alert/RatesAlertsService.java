package com.revolut.retail.feature.ratedetails.impl.network.alert;

import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import spk.a;
import spk.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/ratedetails/impl/network/alert/RatesAlertsService;", "", "Lefm/d0;", "Lspk/c;", "getAlerts", "()Lefm/d0;", "Lspk/a;", "rateAlertCreationDto", "Lefm/b;", "create", "(Lspk/a;)Lefm/b;", "", "id", "delete", "(Ljava/lang/String;)Lefm/b;", "feature_rate_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RatesAlertsService {
    @POST("fx-rate-alerts")
    @NotNull
    b create(@Body @NotNull a rateAlertCreationDto);

    @DELETE("fx-rate-alerts/{id}")
    @NotNull
    b delete(@Path("id") @NotNull String id10);

    @GET("fx-rate-alerts")
    @NotNull
    d0<c> getAlerts();
}
