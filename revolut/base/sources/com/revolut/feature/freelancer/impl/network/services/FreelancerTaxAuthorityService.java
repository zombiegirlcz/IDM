package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import wt6.a;
import wt6.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerTaxAuthorityService;", "", "", "type", "Lwt6/a;", "getAuthorityUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lwt6/c;", "getAuthorityPaymentDetails", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerTaxAuthorityService {
    @GET("/acquiring/merchant/tax-settings/payment-details")
    Object getAuthorityPaymentDetails(@NotNull @Query("type") String str, @NotNull Continuation<? super List<c>> continuation);

    @GET("/acquiring/merchant/tax-settings/authority")
    Object getAuthorityUrl(@NotNull @Query("type") String str, @NotNull Continuation<? super a> continuation);
}
