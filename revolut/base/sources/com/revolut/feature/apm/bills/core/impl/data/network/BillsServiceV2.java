package com.revolut.feature.apm.bills.core.impl.data.network;

import hp1.a;
import hp1.e;
import hp1.f;
import ip1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pp1.c;
import qp1.m;
import qp1.o;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JJ\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\rJ$\u0010\u0015\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u0012\u001a\u00020\u001c2\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0012\u001a\u00020 2\b\b\u0003\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020$2\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b%\u0010\r¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/core/impl/data/network/BillsServiceV2;", "", "", "paymentMethod", "paymentType", "billerId", "counterpartyId", "version", "Lip1/d;", "getFormFields", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhp1/e;", "getBills", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentIntentId", "Lhp1/b;", "getBill", "Lhp1/f;", "body", "Lwj0/b;", "idempotencyTag", "postBills", "(Lhp1/f;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putBills", "(Ljava/lang/String;Lhp1/f;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lhp1/a;", "copyBill", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqp1/m;", "Lqp1/o;", "verifyBill", "(Lqp1/m;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpp1/c;", "Lpp1/e;", "payBill", "(Lpp1/c;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteBill", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BillsServiceV2 {
    @POST("/bills/{id}/copy")
    Object copyBill(@Path("id") @NotNull String str, @Tag @NotNull b bVar, @NotNull Continuation<? super a> continuation);

    @DELETE("/bills/{id}")
    Object deleteBill(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/bills/{id}")
    Object getBill(@Path("id") @NotNull String str, @NotNull Continuation<? super hp1.b> continuation);

    @GET("/bills")
    Object getBills(@NotNull @Query("paymentMethod") String str, @NotNull Continuation<? super e> continuation);

    @GET("/bills/form-fields")
    Object getFormFields(@NotNull @Query("paymentMethod") String str, @Query("paymentType") String str2, @Query("billerId") String str3, @Query("counterpartyId") String str4, @Query("formFieldsVersion") String str5, @NotNull Continuation<? super d> continuation);

    @POST("/bills/pay")
    Object payBill(@Body @NotNull c cVar, @Tag @NotNull b bVar, @NotNull Continuation<? super pp1.e> continuation);

    @POST("/bills")
    Object postBills(@Body @NotNull f fVar, @Tag @NotNull b bVar, @NotNull Continuation<? super hp1.b> continuation);

    @PUT("/bills/{id}")
    Object putBills(@Path("id") @NotNull String str, @Body @NotNull f fVar, @Tag @NotNull b bVar, @NotNull Continuation<? super hp1.b> continuation);

    @POST("/bills/verify")
    Object verifyBill(@Body @NotNull m mVar, @Tag @NotNull b bVar, @NotNull Continuation<? super o> continuation);
}
