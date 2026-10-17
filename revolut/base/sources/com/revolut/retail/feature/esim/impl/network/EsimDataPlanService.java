package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mfj.b;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JT\u0010\f\u001a\u00020\u00052\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimDataPlanService;", "", "", "changesFrom", "receiverUsername", "Lmfj/b;", "getDataPlans", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "mobilePlanIds", "simProfileIds", "upgradesFrom", "getMobilePlans", "([Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimDataPlanService {
    @GET("/connect/data-plans")
    Object getDataPlans(@Query("changesFrom") String str, @Query("receiverUsername") String str2, @NotNull Continuation<? super b> continuation);

    @GET("/connect/mobile-plans")
    Object getMobilePlans(@NotNull @Query("id") String[] strArr, @NotNull @Query("sim-profile-id") String[] strArr2, @Query("upgradesFrom") String str, @Query("changesFrom") String str2, @Query("receiverUsername") String str3, @NotNull Continuation<? super b> continuation);
}
