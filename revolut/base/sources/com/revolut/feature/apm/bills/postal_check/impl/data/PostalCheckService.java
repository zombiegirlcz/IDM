package com.revolut.feature.apm.bills.postal_check.impl.data;

import gr1.b;
import gr1.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/data/PostalCheckService;", "", "Lgr1/b;", "body", "Lgr1/f;", "scanQr", "(Lgr1/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transactionId", "", "requestReceipt", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PostalCheckService {
    @POST("/transfer-confirmation/{transactionId}/confirmation-email")
    Object requestReceipt(@Path("transactionId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("/qr-code")
    Object scanQr(@Body @NotNull b bVar, @NotNull Continuation<? super f> continuation);
}
