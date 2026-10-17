package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import wt6.b;
import wt6.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\tJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerTaxCalendarEventsService;", "", "", "Lwt6/b;", "getTaxCalendarEvents", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "taxCalendarEventId", "getTaxCalendarEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "", "completeTaxCalendarEvent", "stepId", "completeTaxCalendarEventStep", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwt6/e;", "getTaxCalendarEventVatSummary", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerTaxCalendarEventsService {
    @POST("/acquiring/merchant/tax-calendar-events/{taxCalendarEventId}/complete")
    Object completeTaxCalendarEvent(@Path("taxCalendarEventId") @NotNull String str, @NotNull Continuation<? super Response<Unit>> continuation);

    @POST("/acquiring/merchant/tax-calendar-events/{taxCalendarEventId}/steps/{stepId}/complete")
    Object completeTaxCalendarEventStep(@Path("taxCalendarEventId") @NotNull String str, @Path("stepId") @NotNull String str2, @NotNull Continuation<? super Response<Unit>> continuation);

    @GET("/acquiring/merchant/tax-calendar-events/{taxCalendarEventId}")
    Object getTaxCalendarEvent(@Path("taxCalendarEventId") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("/acquiring/merchant/tax-calendar-events/{taxCalendarEventId}/vat-summary")
    Object getTaxCalendarEventVatSummary(@Path("taxCalendarEventId") @NotNull String str, @NotNull Continuation<? super e> continuation);

    @GET("/acquiring/merchant/tax-calendar-events")
    Object getTaxCalendarEvents(@NotNull Continuation<? super List<b>> continuation);
}
