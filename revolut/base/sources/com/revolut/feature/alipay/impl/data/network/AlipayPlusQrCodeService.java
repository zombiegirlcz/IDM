package com.revolut.feature.alipay.impl.data.network;

import java.util.List;
import jk1.a;
import jk1.b;
import jk1.f;
import jk1.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/alipay/impl/data/network/AlipayPlusQrCodeService;", "", "Ljk1/f;", "body", "Ljk1/g;", "scanQrCode", "(Ljk1/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljk1/b;", "", "Ljk1/a;", "encodePaymentCode", "(Ljk1/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AlipayPlusQrCodeService {
    @POST("qr-code/ALIPAY_PLUS/encode")
    Object encodePaymentCode(@Body @NotNull b bVar, @NotNull Continuation<? super List<a>> continuation);

    @POST("qr-code")
    Object scanQrCode(@Body @NotNull f fVar, @NotNull Continuation<? super g> continuation);
}
