package com.revolut.feature.retail.salary_account.impl.switch_assistant.data;

import jhb.c;
import jhb.i;
import jhb.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import whb.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \u001f2\u00020\u0001:\u0001 J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001a\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001e\u0010\u000b¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/data/SalarySwitchAssistantService;", "", "Ljhb/c;", "emailPayrollManagerRequest", "Ljhb/i;", "emailPayrollManager", "(Ljhb/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requestId", "Ljhb/l;", "getFollowUpDraft", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendFollowUp", "Lwhb/f;", "updatePayrollPlatformInAppRequest", "updatePayrollPlatformInApp", "(Lwhb/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwhb/i;", "updateWorkEmailRequest", "updateWorkEmail", "(Lwhb/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwhb/c;", "accountToWorkEmailRequest", "sendAccountToWorkEmail", "(Ljava/lang/String;Lwhb/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markPayrollUpdateCompleted", "Lfhb/c;", "getCurrentRequestStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRequest", "Companion", "a", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SalarySwitchAssistantService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f83028a;

    /* JADX INFO: renamed from: com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f83028a = new Companion();

        private Companion() {
        }
    }

    @DELETE("salary-switch-requests/{requestId}")
    Object deleteRequest(@Path("requestId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("salary-switch-requests")
    Object emailPayrollManager(@Body @NotNull c cVar, @NotNull Continuation<? super i> continuation);

    @GET("salary-switch-requests/current")
    Object getCurrentRequestStatus(@NotNull Continuation<? super fhb.c> continuation);

    @GET("salary-switch-requests/{requestId}/follow-up-draft")
    Object getFollowUpDraft(@Path("requestId") @NotNull String str, @NotNull Continuation<? super l> continuation);

    @POST("salary-switch-requests/{requestId}/payroll-update-confirmation")
    Object markPayrollUpdateCompleted(@Path("requestId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("salary-switch-requests/{requestId}/account-to-work-email")
    Object sendAccountToWorkEmail(@Path("requestId") @NotNull String str, @Body @NotNull whb.c cVar, @NotNull Continuation<? super Unit> continuation);

    @POST("salary-switch-requests/{requestId}/follow-up")
    Object sendFollowUp(@Path("requestId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("salary-switch-requests")
    Object updatePayrollPlatformInApp(@Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);

    @POST("salary-switch-requests")
    Object updateWorkEmail(@Body @NotNull whb.i iVar, @NotNull Continuation<? super Unit> continuation);
}
