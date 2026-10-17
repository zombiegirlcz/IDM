package com.revolut.feature.apm.bills.core.impl.data.network;

import jp1.a;
import jp1.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import pp1.b;
import pp1.d;
import pp1.g;
import qp1.l;
import qp1.n;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import yo1.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001JJ\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\f\u001a\u00020\u00122\b\b\u0003\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\f\u001a\u00020\u00162\b\b\u0003\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\f\u001a\u00020\u001a2\b\b\u0003\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0010\u001a\u00020\u001f2\b\b\u0001\u0010\f\u001a\u00020\u001eH§@¢\u0006\u0004\b\u0010\u0010 J\u001a\u0010#\u001a\u00020\"2\b\b\u0001\u0010\f\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J$\u0010&\u001a\u00020%2\b\b\u0001\u0010\f\u001a\u00020!2\b\b\u0003\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0010\u001a\u00020)2\b\b\u0001\u0010\f\u001a\u00020(H§@¢\u0006\u0004\b\u0010\u0010*J\u001a\u0010\u0010\u001a\u00020+2\b\b\u0001\u0010\f\u001a\u00020!H§@¢\u0006\u0004\b\u0010\u0010$¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/core/impl/data/network/BillsService;", "", "", "paymentMethod", "paymentType", "billerId", "counterpartyId", "version", "Lyo1/e;", "getFormFields", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljp1/b;", "body", "Lwj0/b;", "idempotencyTag", "Ljp1/c;", "searchBill", "(Ljp1/b;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqp1/l;", "Lqp1/n;", "verifyBill", "(Lqp1/l;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpp1/b;", "Lpp1/d;", "payBill", "(Lpp1/b;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpp1/g;", "", "scheduleBill", "(Lpp1/g;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkp1/a;", "Lkp1/b;", "(Lkp1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljp1/a;", "Lkp1/c;", "searchBillBoleto", "(Ljp1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lnp1/a;", "searchBillTapi", "(Ljp1/a;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Llp1/a;", "Llp1/b;", "(Llp1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lop1/a;", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BillsService {
    @GET("/bills/form-fields")
    Object getFormFields(@NotNull @Query("paymentMethod") String str, @Query("paymentType") String str2, @Query("billerId") String str3, @Query("counterpartyId") String str4, @Query("formFieldsVersion") String str5, @NotNull Continuation<? super e> continuation);

    @POST("/bills/pay")
    Object payBill(@Body @NotNull b bVar, @Tag @NotNull wj0.b bVar2, @NotNull Continuation<? super d> continuation);

    @POST("/bills/schedule")
    Object scheduleBill(@Body @NotNull g gVar, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/bills/search")
    Object searchBill(@Body @NotNull a aVar, @NotNull Continuation<? super op1.a> continuation);

    @POST("/bills/search")
    Object searchBill(@Body @NotNull jp1.b bVar, @Tag @NotNull wj0.b bVar2, @NotNull Continuation<? super c> continuation);

    @POST("/bills/search")
    Object searchBill(@Body @NotNull kp1.a aVar, @NotNull Continuation<? super kp1.b> continuation);

    @POST("/bills/search")
    Object searchBill(@Body @NotNull lp1.a aVar, @NotNull Continuation<? super lp1.b> continuation);

    @POST("/bills/search")
    Object searchBillBoleto(@Body @NotNull a aVar, @NotNull Continuation<? super kp1.c> continuation);

    @POST("/bills/search")
    Object searchBillTapi(@Body @NotNull a aVar, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super np1.a> continuation);

    @POST("/bills/verify")
    Object verifyBill(@Body @NotNull l lVar, @Tag @NotNull wj0.b bVar, @NotNull Continuation<? super n> continuation);
}
