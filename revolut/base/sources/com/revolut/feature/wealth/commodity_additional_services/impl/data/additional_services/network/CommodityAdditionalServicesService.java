package com.revolut.feature.wealth.commodity_additional_services.impl.data.additional_services.network;

import j5h.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/commodity_additional_services/impl/data/additional_services/network/CommodityAdditionalServicesService;", "", "", "commodityCode", "", "Lj5h/a;", "getAdditionalServices", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_wealth_commodity_additional_services_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CommodityAdditionalServicesService {
    @GET("commodities/additionalservices/{commodity}")
    Object getAdditionalServices(@Path("commodity") @NotNull String str, @NotNull Continuation<? super List<a>> continuation);
}
