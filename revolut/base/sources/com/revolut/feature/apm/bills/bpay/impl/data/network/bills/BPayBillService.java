package com.revolut.feature.apm.bills.bpay.impl.data.network.bills;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import tn1.a;
import wj0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/data/network/bills/BPayBillService;", "", "Lun1/a;", "body", "Lvn1/b;", "searchBill", "(Lun1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ltn1/a;", "Lwj0/b;", "idempotencyTag", "Lwn1/a;", "payBill", "(Ltn1/a;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lvn1/a;", "verifyBill", "(Ltn1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BPayBillService {
    @POST("bills/pay")
    Object payBill(@Body @NotNull a aVar, @Tag @NotNull b bVar, @NotNull Continuation<? super wn1.a> continuation);

    @POST("bills/search")
    Object searchBill(@Body @NotNull un1.a aVar, @NotNull Continuation<? super vn1.b> continuation);

    @POST("bills/verify")
    Object verifyBill(@Body @NotNull a aVar, @NotNull Continuation<? super vn1.a> continuation);
}
