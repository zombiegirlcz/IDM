package com.revolut.feature.apm.upi.impl.data.network;

import ef2.c;
import ef2.d;
import ef2.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/data/network/UpiService;", "", "Lef2/d;", "body", "Lwj0/b;", "idempotencyTag", "Lef2/e;", "createPayment", "(Lef2/d;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "paymentIntentId", "Lef2/c;", "postConfirmPayment", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UpiService {
    @POST("payments")
    Object createPayment(@Body @NotNull d dVar, @Tag b bVar, @NotNull Continuation<? super e> continuation);

    @POST("payments/{paymentIntentId}/confirm")
    Object postConfirmPayment(@Path("paymentIntentId") @NotNull String str, @Tag b bVar, @NotNull Continuation<? super c> continuation);
}
