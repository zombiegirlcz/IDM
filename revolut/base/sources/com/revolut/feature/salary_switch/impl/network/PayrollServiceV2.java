package com.revolut.feature.salary_switch.impl.network;

import eqc.k;
import fqc.c;
import fqc.f;
import gqc.d0;
import gqc.g0;
import gqc.i;
import gqc.j0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0013\u0010\u000fJ$\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001a\u0010\u000fJ$\u0010\u001c\u001a\u00020\u00192\b\b\u0001\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u001b\u001a\u00020\u000bH§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/network/PayrollServiceV2;", "", "Lgqc/d0;", "body", "Leqc/k;", "createPayrollSwitch", "(Lgqc/d0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lgqc/g0;", "getPayrollSwitches", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lgqc/j0;", "getPayrollSwitch", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lgqc/i;", "getCounterparties", "", "cancelPayrollSwitch", "payrollSwitchId", "Lfqc/c;", "Lfqc/f;", "createDispute", "(Ljava/lang/String;Lfqc/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lfqc/i;", "getDisputes", "disputeId", "getDispute", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayrollServiceV2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f85265a;

    /* JADX INFO: renamed from: com.revolut.feature.salary_switch.impl.network.PayrollServiceV2$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f85265a = new Companion();

        private Companion() {
        }
    }

    @POST("/payroll-switch/{id}/cancel")
    Object cancelPayrollSwitch(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/payroll-switch/{id}/disputes")
    Object createDispute(@Path("id") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super f> continuation);

    @Headers({"X-Api-Version: 2"})
    @POST("/payroll-switch")
    Object createPayrollSwitch(@Body @NotNull d0 d0Var, @NotNull Continuation<? super k> continuation);

    @GET("/payroll-switch/inbound/counterparties")
    Object getCounterparties(@NotNull Continuation<? super i> continuation);

    @GET("/payroll-switch/{id}/disputes/{disputeId}")
    Object getDispute(@Path("id") @NotNull String str, @Path("disputeId") @NotNull String str2, @NotNull Continuation<? super fqc.i> continuation);

    @GET("/payroll-switch/{id}/disputes")
    Object getDisputes(@Path("id") @NotNull String str, @NotNull Continuation<? super List<fqc.i>> continuation);

    @Headers({"X-Api-Version: 2"})
    @GET("/payroll-switch/{id}")
    Object getPayrollSwitch(@Path("id") @NotNull String str, @NotNull Continuation<? super j0> continuation);

    @Headers({"X-Api-Version: 2"})
    @GET("/payroll-switch")
    Object getPayrollSwitches(@NotNull Continuation<? super List<g0>> continuation);
}
