package com.revolut.feature.pricing_plans.upgrade_prompt.impl.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import xga.l;
import xga.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Jb\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/impl/network/PricingPlanContextualUpsellService;", "", "", "slot", "entityId", "chargeBearer", "routeType", "", "entityIds", "savingsCurrency", "Lretrofit2/Response;", "Lxga/l;", "getContextualBanner", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lxga/u;", "getContextualNudge", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_pricing_plans_upgrade_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanContextualUpsellService {
    @GET("/plans/contextual-entry-points")
    Object getContextualBanner(@NotNull @Query("slot") String str, @Query("entityId") String str2, @Query("chargeBearer") String str3, @Query("routeType") String str4, @Query("entityIds") List<String> list, @Query("savingsCurrency") String str5, @NotNull Continuation<? super Response<l>> continuation);

    @POST("/plans/contextual-nudges")
    Object getContextualNudge(@NotNull Continuation<? super Response<u>> continuation);
}
