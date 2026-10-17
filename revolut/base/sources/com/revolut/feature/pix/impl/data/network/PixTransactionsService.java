package com.revolut.feature.pix.impl.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import l8a.x0;
import l8a.y0;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pix/impl/data/network/PixTransactionsService;", "", "Ll8a/x0;", "body", "Ll8a/y0;", "resolvePixAlias", "(Ll8a/x0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixTransactionsService {
    @POST("/alias-beneficiaries/pix/resolve")
    Object resolvePixAlias(@Body @NotNull x0 x0Var, @NotNull Continuation<? super y0> continuation);
}
