package com.revolut.feature.cashback.impl.network;

import efm.b;
import efm.d0;
import fd3.a;
import fd3.d;
import fd3.f;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H'¢\u0006\u0004\b\u000f\u0010\u0006¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/cashback/impl/network/CashbackBoxService;", "", "Lefm/d0;", "", "Lfd3/a;", "getCashbackBoxes", "()Lefm/d0;", "", "id", "Lfd3/d;", "changeCurrencyDto", "Lefm/b;", "changeCurrency", "(Ljava/lang/String;Lfd3/d;)Lefm/b;", "Lfd3/f;", "getCashbackLimit", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashbackBoxService {
    @POST("/cashback/{id}/currency")
    @NotNull
    b changeCurrency(@Path("id") @NotNull String id10, @Body @NotNull d changeCurrencyDto);

    @GET("/cashback")
    @NotNull
    d0<List<a>> getCashbackBoxes();

    @GET("/cashback/limit")
    @NotNull
    d0<f> getCashbackLimit();
}
