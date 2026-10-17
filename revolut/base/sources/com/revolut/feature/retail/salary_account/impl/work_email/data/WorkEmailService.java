package com.revolut.feature.retail.salary_account.impl.work_email.data;

import fib.c;
import fib.f;
import fib.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/work_email/data/WorkEmailService;", "", "Lfib/k;", "getWorkEmailVerification", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfib/c;", "body", "", "verifyWorkEmail", "(Lfib/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfib/f;", "verifyWorkEmailVerificationToken", "(Lfib/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WorkEmailService {
    @GET("incentives/plan-salary-promotion/work-email")
    Object getWorkEmailVerification(@NotNull Continuation<? super k> continuation);

    @POST("incentives/plan-salary-promotion/work-email/code")
    Object verifyWorkEmail(@Body @NotNull c cVar, @NotNull Continuation<? super Unit> continuation);

    @POST("incentives/plan-salary-promotion/work-email/verify")
    Object verifyWorkEmailVerificationToken(@Body @NotNull f fVar, @NotNull Continuation<? super Unit> continuation);
}
