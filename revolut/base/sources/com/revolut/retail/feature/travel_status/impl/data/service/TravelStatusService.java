package com.revolut.retail.feature.travel_status.impl.data.service;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import p1l.c;
import q1l.a;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import s1l.a1;
import s1l.z0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000f\u0010\u000bJ0\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/data/service/TravelStatusService;", "", "Lq1l/a;", "getOverview", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1l/c;", "getProductArticleId", "", "partnerId", "Ls1l/z0;", "getPartnerLayout", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "acknowledge", "Ls1l/a1;", "validate", "", "fields", "linkAccount", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelStatusService {
    @POST("travel-status/{id}/acknowledge")
    Object acknowledge(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("travel-status")
    Object getOverview(@NotNull Continuation<? super a> continuation);

    @GET("travel-status/{id}")
    Object getPartnerLayout(@Path("id") @NotNull String str, @NotNull Continuation<? super z0> continuation);

    @GET("travel-status/product-article")
    Object getProductArticleId(@NotNull Continuation<? super c> continuation);

    @POST("travel-status/{id}/link-account")
    Object linkAccount(@Path("id") @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull Continuation<? super Unit> continuation);

    @POST("travel-status/{id}/validate")
    Object validate(@Path("id") @NotNull String str, @NotNull Continuation<? super a1> continuation);
}
