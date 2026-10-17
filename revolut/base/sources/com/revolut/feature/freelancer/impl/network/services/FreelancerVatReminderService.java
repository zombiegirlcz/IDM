package com.revolut.feature.freelancer.impl.network.services;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import yt6.a;
import yt6.b;
import yt6.c;
import yt6.d;
import yt6.e;
import yt6.f;
import yt6.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0016\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0018\u0010\u0011¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerVatReminderService;", "", "Lyt6/a;", "body", "Lyt6/d;", "createVatReminder", "(Lyt6/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lyt6/c;", "updateVatReminderEnabled", "(Ljava/lang/String;Lyt6/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyt6/f;", "updateVatReminderSettings", "(Ljava/lang/String;Lyt6/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyt6/b;", "getVatReminder", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getVatReminders", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyt6/e;", "getVatReminderOptions", "Lyt6/g;", "getVatSummary", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerVatReminderService {
    @POST("/acquiring/merchant/tax-pockets/vat-reminders")
    Object createVatReminder(@Body @NotNull a aVar, @NotNull Continuation<? super d> continuation);

    @GET("/acquiring/merchant/tax-pockets/vat-reminders/{id}")
    Object getVatReminder(@Path("id") @NotNull String str, @NotNull Continuation<? super b> continuation);

    @GET("/acquiring/merchant/vat-reminder-options")
    Object getVatReminderOptions(@NotNull Continuation<? super e> continuation);

    @GET("/acquiring/merchant/tax-pockets/vat-reminders")
    Object getVatReminders(@NotNull Continuation<? super List<b>> continuation);

    @GET("/acquiring/merchant/tax-pockets/vat-reminders/{id}/summary")
    Object getVatSummary(@Path("id") @NotNull String str, @NotNull Continuation<? super g> continuation);

    @PATCH("/acquiring/merchant/tax-pockets/vat-reminders/{id}")
    Object updateVatReminderEnabled(@Path("id") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super d> continuation);

    @PATCH("/acquiring/merchant/tax-pockets/vat-reminders/{id}")
    Object updateVatReminderSettings(@Path("id") @NotNull String str, @Body @NotNull f fVar, @NotNull Continuation<? super d> continuation);
}
