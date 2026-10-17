package com.revolut.feature.defi.exchange.impl.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import n36.d0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import wj0.b;
import xhf.d1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/defi/exchange/impl/data/network/DeFiSwapSubmitService;", "", "Ln36/d0;", "request", "Lwj0/b;", "idempotencyTag", "", "Lxhf/d1;", "submitSwap", "(Ln36/d0;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_defi_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiSwapSubmitService {
    @POST("crypto/defi/v2/swap/submit")
    Object submitSwap(@Body @NotNull d0 d0Var, @Tag @NotNull b bVar, @NotNull Continuation<? super List<d1>> continuation);
}
