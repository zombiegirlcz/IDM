package com.revolut.feature.apm.core.impl.topup_requests.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import yz1.a;
import yz1.b;
import yz1.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000f\u0010\t¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/impl/topup_requests/network/ApmTopupRequestsService;", "", "", "Lyz1/c;", "getTopupRequests", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "getTopupRequest", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lyz1/a;", "body", "Lyz1/b;", "approveTopupRequest", "(Ljava/lang/String;Lyz1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rejectTopupRequest", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmTopupRequestsService {
    @POST("topup/{id}/accept")
    Object approveTopupRequest(@Path("id") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super b> continuation);

    @GET("topup/{id}")
    Object getTopupRequest(@Path("id") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @GET("topup/pending")
    Object getTopupRequests(@NotNull Continuation<? super List<c>> continuation);

    @POST("topup/{id}/reject")
    Object rejectTopupRequest(@Path("id") @NotNull String str, @NotNull Continuation<? super b> continuation);
}
