package com.revolut.feature.apm.bills.billers.impl.data.network;

import em1.a;
import em1.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JJ\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/billers/impl/data/network/BillersService;", "", "", "paymentMethod", "query", "", "limit", "offset", "type", "Lem1/b;", "getBillers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "billerId", "Lem1/a;", "getBillerById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_bills_billers_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BillersService {
    @GET("/billers/{billerId}")
    Object getBillerById(@Path("billerId") @NotNull String str, @NotNull Continuation<? super a> continuation);

    @GET("/billers")
    Object getBillers(@NotNull @Query("paymentMethod") String str, @Query("query") String str2, @Query("limit") Integer num, @Query("offset") Integer num2, @Query("billerType") String str3, @NotNull Continuation<? super b> continuation);
}
