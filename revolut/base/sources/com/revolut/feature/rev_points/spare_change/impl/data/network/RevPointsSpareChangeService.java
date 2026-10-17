package com.revolut.feature.rev_points.spare_change.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import r1c.a;
import r1c.d;
import r1c.e;
import r1c.g;
import r1c.h;
import r1c.i;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H'¢\u0006\u0004\b\r\u0010\u000bJ\u001b\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0004H'¢\u0006\u0004\b\u0010\u0010\u000bJ\u001b\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0\u0004H'¢\u0006\u0004\b\u0012\u0010\u000bJ%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/rev_points/spare_change/impl/data/network/RevPointsSpareChangeService;", "", "Lr1c/i;", "body", "Lefm/d0;", "Lr1c/e;", "setSpareChange", "(Lr1c/i;)Lefm/d0;", "editSpareChange", "Lr1c/d;", "getCalculations", "()Lefm/d0;", "Lr1c/g;", "getSpareChangeRefund", "Lretrofit2/Response;", "Lr1c/h;", "getSpareChangeRefundQuote", "Lr1c/a;", "getMaxRefundablePurchaseAge", "", "requestSpareChangeRefund", "(Lr1c/h;)Lefm/d0;", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RevPointsSpareChangeService {
    @PATCH("/loyalty/spare-change")
    @NotNull
    d0<e> editSpareChange(@Body @NotNull i body);

    @GET("/loyalty/spare-change/calculations")
    @NotNull
    d0<d> getCalculations();

    @GET("/loyalty/spare-change/refunds/max-refundable-purchase-age")
    @NotNull
    d0<Response<a>> getMaxRefundablePurchaseAge();

    @GET("/loyalty/spare-change/refunds/last")
    @NotNull
    d0<g> getSpareChangeRefund();

    @POST("/loyalty/spare-change/refunds/quote")
    @NotNull
    d0<Response<h>> getSpareChangeRefundQuote();

    @POST("/loyalty/spare-change/refunds")
    @NotNull
    d0<Response<Unit>> requestSpareChangeRefund(@Body @NotNull h body);

    @POST("/loyalty/spare-change")
    @NotNull
    d0<e> setSpareChange(@Body @NotNull i body);
}
