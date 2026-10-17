package com.revolut.feature.apm.wero.impl.data;

import jh2.d;
import jh2.j;
import jh2.l;
import jh2.o;
import jh2.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/data/WeroPayService;", "", "Ljh2/d;", "body", "Ljh2/b;", "createQr", "(Ljh2/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljh2/l;", "Ljh2/j;", "scanQr", "(Ljh2/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljh2/o;", "Lwj0/b;", "idempotencyTag", "Ljh2/p;", "createMoneyRequest", "(Ljh2/o;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WeroPayService {
    @POST("apm/money-requests")
    Object createMoneyRequest(@Body @NotNull o oVar, @Tag @NotNull b bVar, @NotNull Continuation<? super p> continuation);

    @POST("/qr-code/wero/encode")
    Object createQr(@Body @NotNull d dVar, @NotNull Continuation<? super jh2.b> continuation);

    @POST("/qr-code")
    Object scanQr(@Body @NotNull l lVar, @NotNull Continuation<? super j> continuation);
}
