package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mfj.f;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimPlanOffersService;", "", "", "upsell", "Lmfj/f;", "getDataPlanOffers", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimPlanOffersService {
    @GET("/connect/mobile-plan-offers")
    Object getDataPlanOffers(@Query("upsell") Boolean bool, @NotNull Continuation<? super f> continuation);
}
