package com.revolut.retail.feature.pricing_plans.impl.network;

import gfk.l0;
import gfk.m0;
import gfk.n0;
import gfk.o0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.PATCH;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/impl/network/StudentPlanService;", "", "Lgfk/l0;", "request", "", "verifyStudentEmail", "(Lgfk/l0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgfk/n0;", "patchStudentVerificationCode", "(Lgfk/n0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgfk/o0;", "patchStudentVerificationResend", "(Lgfk/o0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgfk/m0;", "patchStudentStatus", "(Lgfk/m0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "reason", "deleteStudent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface StudentPlanService {
    @DELETE("/students")
    Object deleteStudent(@NotNull @Query("reason") String str, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/students")
    Object patchStudentStatus(@Body @NotNull m0 m0Var, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/students/verifications")
    Object patchStudentVerificationCode(@Body @NotNull n0 n0Var, @NotNull Continuation<? super Unit> continuation);

    @PATCH("/students/verifications")
    Object patchStudentVerificationResend(@Body @NotNull o0 o0Var, @NotNull Continuation<? super Unit> continuation);

    @PUT("/students/verifications")
    Object verifyStudentEmail(@Body @NotNull l0 l0Var, @NotNull Continuation<? super Unit> continuation);
}
