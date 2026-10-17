package com.revolut.retail.feature.airportlounges.impl.network;

import efm.b;
import efm.d0;
import gwi.b1;
import gwi.h1;
import gwi.k1;
import gwi.n1;
import gwi.p0;
import gwi.q1;
import gwi.v0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H'¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H'¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H'¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0002H'¢\u0006\u0004\b\u0015\u0010\u0006J\u0019\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/network/AirportLoungePassesService;", "", "Lefm/d0;", "Lretrofit2/Response;", "Lgwi/p0;", "getMembership", "()Lefm/d0;", "registerMembership", "Lgwi/v0;", "getLoungePassQrCode", "Lgwi/q1;", "getLoungePassesLimits", "Lgwi/k1;", "getLoungePassesPricing", "Lgwi/n1;", "body", "Lefm/b;", "purchasePassEntries", "(Lgwi/n1;)Lefm/b;", "", "Lgwi/b1;", "getRefundableLoungePasses", "Lgwi/h1;", "request", "postRefundRequest", "(Lgwi/h1;)Lefm/b;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AirportLoungePassesService {
    @GET("/lounges/v2/lounge-passes/qr-code")
    @NotNull
    d0<v0> getLoungePassQrCode();

    @GET("/lounges/v2/lounge-passes/limits")
    @NotNull
    d0<q1> getLoungePassesLimits();

    @GET("/lounges/v2/lounge-passes/pricing")
    @NotNull
    d0<k1> getLoungePassesPricing();

    @GET("/lounges/v2/membership")
    @NotNull
    d0<Response<p0>> getMembership();

    @GET("/lounges/v2/lounge-passes/refundable")
    @NotNull
    d0<List<b1>> getRefundableLoungePasses();

    @POST("/lounges/v2/lounge-passes/refund")
    @NotNull
    b postRefundRequest(@Body @NotNull h1 request);

    @POST("/lounges/v2/lounge-passes/purchase")
    @NotNull
    b purchasePassEntries(@Body @NotNull n1 body);

    @POST("/lounges/v2/membership")
    @NotNull
    d0<p0> registerMembership();
}
