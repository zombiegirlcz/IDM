package com.revolut.feature.salary_switch.impl.network;

import bqc.j;
import bqc.n;
import eqc.h;
import eqc.k;
import hqc.d;
import hqc.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0006J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/network/PayrollService;", "", "Leqc/d;", "body", "Leqc/h;", "requestPreview", "(Leqc/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhqc/d;", "Lhqc/g;", "getTerms", "(Lhqc/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leqc/k;", "submitRequest", "", "Lbqc/n;", "getRequestStatusHistory", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lbqc/j;", "getRequestStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayrollService {
    @GET("/payroll-switch/{id}")
    Object getRequestStatus(@Path("id") @NotNull String str, @NotNull Continuation<? super j> continuation);

    @GET("/payroll-switch")
    Object getRequestStatusHistory(@NotNull Continuation<? super List<n>> continuation);

    @POST("/payroll-switch/request-terms")
    Object getTerms(@Body @NotNull d dVar, @NotNull Continuation<? super g> continuation);

    @POST("/payroll-switch/preview")
    Object requestPreview(@Body @NotNull eqc.d dVar, @NotNull Continuation<? super h> continuation);

    @POST("/payroll-switch")
    Object submitRequest(@Body @NotNull eqc.d dVar, @NotNull Continuation<? super k> continuation);
}
