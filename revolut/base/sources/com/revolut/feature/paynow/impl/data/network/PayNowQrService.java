package com.revolut.feature.paynow.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import u6a.a;
import u6a.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/paynow/impl/data/network/PayNowQrService;", "", "Lu6a/a;", "body", "Lu6a/b;", "getPayNowQr", "(Lu6a/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_paynow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayNowQrService {
    @POST("/topup/qr-code/PAYNOW/encode")
    Object getPayNowQr(@Body @NotNull a aVar, @NotNull Continuation<? super b> continuation);
}
