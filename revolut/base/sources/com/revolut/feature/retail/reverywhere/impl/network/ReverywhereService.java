package com.revolut.feature.retail.reverywhere.impl.network;

import efm.d0;
import gfb.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/network/ReverywhereService;", "", "Lefm/d0;", "Lxeb/d;", "getReverywhereToken", "()Lefm/d0;", "Lgfb/d;", "getReverywhereConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReverywhereService {
    @GET("lifestyle/reverywhere/config")
    Object getReverywhereConfig(@NotNull Continuation<? super d> continuation);

    @POST("lifestyle/reverywhere/token")
    @NotNull
    d0<xeb.d> getReverywhereToken();
}
