package com.revolut.feature.apm.aani.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ml1.a;
import ml1.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/aani/impl/data/network/AaniQrCodeService;", "", "Lml1/c;", "body", "Lml1/a;", "scanAaniQrCode", "(Lml1/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_aani_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AaniQrCodeService {
    @POST("/qr-code")
    Object scanAaniQrCode(@Body @NotNull c cVar, @NotNull Continuation<? super a> continuation);
}
