package com.revolut.feature.apm.upi.impl.data.network;

import df2.c;
import df2.f;
import df2.l;
import df2.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/data/network/UpiQrCodeService;", "", "Ldf2/c;", "body", "Ldf2/o;", "generateUpiIdQrCode", "(Ldf2/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ldf2/f;", "Ldf2/l;", "resolveUpiIdQrCode", "(Ldf2/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UpiQrCodeService {
    @POST("/qr-code/upi/encode")
    Object generateUpiIdQrCode(@Body @NotNull c cVar, @NotNull Continuation<? super o> continuation);

    @POST("/qr-code")
    Object resolveUpiIdQrCode(@Body @NotNull f fVar, @NotNull Continuation<? super l> continuation);
}
