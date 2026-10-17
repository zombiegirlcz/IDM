package com.revolut.feature.apm.bills.pagopa.impl.data.network;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qq1.a;
import qq1.c;
import qq1.d;
import qq1.f;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u000bH'¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0007¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/impl/data/network/PagoPAService;", "", "", "qrCode", "Lefm/d0;", "Lqq1/d;", "initialiseBill", "(Ljava/lang/String;)Lefm/d0;", "Lqq1/c;", "bill", "(Lqq1/c;)Lefm/d0;", "Lqq1/f;", "initialiseCarTaxBill", "(Lqq1/f;)Lefm/d0;", "billId", "Lqq1/a;", "authoriseBill", "feature_apm_bills_pagopa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PagoPAService {
    @POST("/bill-payments/{billId}/authorise")
    @NotNull
    d0<a> authoriseBill(@Path("billId") @NotNull String billId);

    @GET("qr-code/{qrCode}")
    @NotNull
    d0<d> initialiseBill(@Path("qrCode") @NotNull String qrCode);

    @POST("/bill-payments")
    @NotNull
    d0<d> initialiseBill(@Body @NotNull c bill);

    @POST("/bill-payments")
    @NotNull
    d0<d> initialiseCarTaxBill(@Body @NotNull f bill);
}
