package com.revolut.feature.apm.core.impl.data.network.disputes;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import zy1.a;
import zy1.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/data/network/disputes/ApmDisputesService;", "", "", "paymentId", "Lzy1/b;", "body", "Lzy1/a;", "fetchDispute", "(Ljava/lang/String;Lzy1/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmDisputesService {
    @POST("/payments/{paymentId}/dispute")
    Object fetchDispute(@Path("paymentId") @NotNull String str, @Body @NotNull b bVar, @NotNull Continuation<? super a> continuation);
}
