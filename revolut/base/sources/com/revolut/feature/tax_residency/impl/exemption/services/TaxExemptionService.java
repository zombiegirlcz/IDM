package com.revolut.feature.tax_residency.impl.exemption.services;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pne.e0;
import pne.u;
import pne.y;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/exemption/services/TaxExemptionService;", "", "", "productType", "Lpne/y;", "getExemptions", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpne/e0;", "getTaxProfiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpne/u;", "request", "", "updateLimitOrder", "(Lpne/u;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxExemptionService {
    @GET("/taxes/exemptions")
    Object getExemptions(@Query("productType") String str, @NotNull Continuation<? super y> continuation);

    @GET("/user/current/tax-profile")
    Object getTaxProfiles(@NotNull Continuation<? super e0> continuation);

    @POST("/user/current/tax-profile/exemptions")
    Object updateLimitOrder(@Body @NotNull u uVar, @NotNull Continuation<? super Unit> continuation);
}
