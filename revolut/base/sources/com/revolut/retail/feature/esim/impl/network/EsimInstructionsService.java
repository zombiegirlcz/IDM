package com.revolut.retail.feature.esim.impl.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mfj.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/network/EsimInstructionsService;", "", "", "osLayout", "osVersion", "simProfileId", "Lmfj/d;", "getInstructions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimInstructionsService {
    @GET("/connect/installation-instructions")
    Object getInstructions(@NotNull @Query("osLayout") String str, @NotNull @Query("osVersion") String str2, @Query("simProfileId") String str3, @NotNull Continuation<? super d> continuation);
}
