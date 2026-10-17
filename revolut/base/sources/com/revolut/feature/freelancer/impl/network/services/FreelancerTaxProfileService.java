package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import wt6.e;
import wt6.f;
import wt6.g;
import wt6.h;
import wt6.i;
import wt6.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0019\u0010\u000e¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerTaxProfileService;", "", "Lwt6/f;", "request", "Lwt6/h;", "createTaxProfile", "(Lwt6/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lwt6/g;", "getTaxProfiles", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "taxProfileId", "getTaxProfile", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwt6/i;", "taxProfileSchedule", "updateTaxProfileSchedule", "(Ljava/lang/String;Lwt6/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwt6/j;", "Lretrofit2/Response;", "", "updateTaxProfile", "(Ljava/lang/String;Lwt6/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwt6/e;", "getTaxCalendarEventVatSummary", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerTaxProfileService {
    @POST("/acquiring/merchant/tax-profiles")
    Object createTaxProfile(@Body @NotNull f fVar, @NotNull Continuation<? super h> continuation);

    @GET("/acquiring/merchant/tax-profiles/{taxProfileId}/vat-summary")
    Object getTaxCalendarEventVatSummary(@Path("taxProfileId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @GET("/acquiring/merchant/tax-profiles/{taxProfileId}")
    Object getTaxProfile(@Path("taxProfileId") @NotNull String str, @NotNull Continuation<? super g> continuation);

    @GET("/acquiring/merchant/tax-profiles")
    Object getTaxProfiles(@NotNull Continuation<? super List<g>> continuation);

    @PATCH("/acquiring/merchant/tax-profiles/{taxProfileId}")
    Object updateTaxProfile(@Path("taxProfileId") @NotNull String str, @Body @NotNull j jVar, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/acquiring/merchant/tax-profiles/{taxProfileId}/change-scheduling-option")
    Object updateTaxProfileSchedule(@Path("taxProfileId") @NotNull String str, @Body @NotNull i iVar, @NotNull Continuation<Object> continuation);
}
