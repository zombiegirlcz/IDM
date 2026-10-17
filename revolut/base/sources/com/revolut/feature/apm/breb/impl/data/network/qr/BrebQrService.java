package com.revolut.feature.apm.breb.impl.data.network.qr;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kv1.e;
import kv1.f;
import kv1.g;
import kv1.i;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/data/network/qr/BrebQrService;", "", "Lkv1/g;", "body", "Lkv1/i;", "encode", "(Lkv1/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkv1/e;", "Lkv1/f;", "decode", "(Lkv1/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrebQrService {
    @POST("/qr-code")
    Object decode(@Body @NotNull e eVar, @NotNull Continuation<? super f> continuation);

    @POST("/qr-code/breb/encode")
    Object encode(@Body @NotNull g gVar, @NotNull Continuation<? super i> continuation);
}
