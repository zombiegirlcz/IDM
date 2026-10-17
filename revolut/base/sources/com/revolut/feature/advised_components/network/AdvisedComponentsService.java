package com.revolut.feature.advised_components.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import uj1.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/advised_components/network/AdvisedComponentsService;", "", "", "exp", "Luj1/d;", "getAdvisedComponents", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_advised_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AdvisedComponentsService {
    @GET("/advised-components")
    Object getAdvisedComponents(@Query("exp") String str, @NotNull Continuation<? super d> continuation);
}
