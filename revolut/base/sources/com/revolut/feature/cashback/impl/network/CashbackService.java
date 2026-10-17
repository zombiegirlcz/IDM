package com.revolut.feature.cashback.impl.network;

import efm.d0;
import fd3.b;
import fd3.c;
import fd3.d;
import fd3.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H'¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cashback/impl/network/CashbackService;", "", "", "rev10", "Lefm/d0;", "Lfd3/c;", "getTotalCashbackBySources", "(Z)Lefm/d0;", "Lfd3/b;", "getTotalCashbackByCurrencies", "()Lefm/d0;", "Lfd3/e;", "getCashbackCurrency", "Lfd3/d;", "changeCurrencyDto", "Lefm/b;", "postChangeCashbackCurrency", "(Lfd3/d;)Lefm/b;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashbackService {
    @GET("/cashback/currency")
    @NotNull
    d0<e> getCashbackCurrency();

    @GET("/cashback/plan/total-by-currencies")
    @NotNull
    d0<b> getTotalCashbackByCurrencies();

    @GET("/cashback/total")
    @NotNull
    d0<c> getTotalCashbackBySources(@Query("rev10") boolean rev10);

    @POST("/cashback/currency")
    @NotNull
    efm.b postChangeCashbackCurrency(@Body @NotNull d changeCurrencyDto);
}
