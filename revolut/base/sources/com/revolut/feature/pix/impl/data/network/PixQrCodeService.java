package com.revolut.feature.pix.impl.data.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import l8a.g0;
import l8a.h0;
import l8a.j;
import l8a.m0;
import l8a.n0;
import l8a.o0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00102\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00142\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/impl/data/network/PixQrCodeService;", "", "Ll8a/j;", "body", "Ll8a/h0;", "generateQrCode", "(Ll8a/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwj0/b;", "idempotencyTag", "Ll8a/g0;", "decodeQrCode", "(Ll8a/h0;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "transactionId", "getDecodedQrCode", "(Ljava/lang/String;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/n0;", "Ll8a/o0;", "transfer", "(Ll8a/n0;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll8a/m0;", "", "schedule", "(Ll8a/m0;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixQrCodeService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f80537a;

    /* JADX INFO: renamed from: com.revolut.feature.pix.impl.data.network.PixQrCodeService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f80537a = new Companion();

        private Companion() {
        }
    }

    @POST("/qr-code/emv/decode/PIX")
    Object decodeQrCode(@Body @NotNull h0 h0Var, @Tag @NotNull b bVar, @NotNull Continuation<? super g0> continuation);

    @POST("/qr-code/emv/encode/PIX")
    Object generateQrCode(@Body @NotNull j jVar, @NotNull Continuation<? super h0> continuation);

    @GET("/qr-code/emv/decode/PIX/{transactionId}")
    Object getDecodedQrCode(@Path("transactionId") @NotNull String str, @Tag @NotNull b bVar, @NotNull Continuation<? super g0> continuation);

    @POST("/pix-transfers/qr-code/schedule")
    Object schedule(@Body @NotNull m0 m0Var, @Tag @NotNull b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("/pix-transfers/qr-code")
    Object transfer(@Body @NotNull n0 n0Var, @Tag @NotNull b bVar, @NotNull Continuation<? super o0> continuation);
}
