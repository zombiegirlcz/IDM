package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimHomeConfigService;", "", "getEsimHomeConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimHomeConfigService {
    @GET("connect/esim-home")
    Object getEsimHomeConfig(@NotNull Continuation<Object> continuation);
}
