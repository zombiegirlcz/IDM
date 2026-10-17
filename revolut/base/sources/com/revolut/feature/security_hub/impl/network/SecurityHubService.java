package com.revolut.feature.security_hub.impl.network;

import auc.a1;
import auc.c1;
import auc.d;
import auc.k;
import auc.m;
import auc.n;
import auc.u;
import efm.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000f2\b\b\u0001\u0010\u0007\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u001b\u001a\u00020\u001a2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u001b\u0010\u0015J#\u0010\u001e\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u001dH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u000bH'¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010\u0005¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/security_hub/impl/network/SecurityHubService;", "", "", "Lauc/n;", "getOutboundTransactionLimits", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lauc/m;", "body", "Lefm/b;", "changeOutboundTransactionLimit", "(Lauc/m;)Lefm/b;", "", "limitName", "", "jointAccount", "", "deleteOutboundTransactionLimit", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "featureName", "Lauc/a1;", "getWealthProtectionFeatureDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lauc/k;", "postLostDevice", "(Lauc/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "location", "Lauc/u;", "getSecurityLimits", "category", "Lauc/d;", "updateSecurityLimit", "(Ljava/lang/String;Lauc/d;)Lefm/b;", "deleteSecurityLimit", "(Ljava/lang/String;)Lefm/b;", "Lauc/c1;", "getWealthProtectionStatus", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SecurityHubService {
    @PUT("outbound-limits")
    @NotNull
    b changeOutboundTransactionLimit(@Body @NotNull m body);

    @DELETE("outbound-limits/{limitName}")
    Object deleteOutboundTransactionLimit(@Path("limitName") @NotNull String str, @Query("jointAccount") boolean z, @NotNull Continuation<? super Unit> continuation);

    @DELETE("/security-limits/{category}")
    @NotNull
    b deleteSecurityLimit(@Path("category") @NotNull String category);

    @GET("outbound-limits")
    Object getOutboundTransactionLimits(@NotNull Continuation<? super List<n>> continuation);

    @GET("security-limits")
    Object getSecurityLimits(@Header("X-Client-Geo-Location") String str, @NotNull Continuation<? super u> continuation);

    @GET("security-limits/{featureName}")
    Object getWealthProtectionFeatureDetails(@Path("featureName") @NotNull String str, @NotNull Continuation<? super a1> continuation);

    @GET("security-limits/status")
    Object getWealthProtectionStatus(@NotNull Continuation<? super c1> continuation);

    @POST("security-hub/lost-device")
    Object postLostDevice(@Body @NotNull k kVar, @NotNull Continuation<? super Unit> continuation);

    @PUT("/security-limits/{category}")
    @NotNull
    b updateSecurityLimit(@Path("category") @NotNull String category, @Body @NotNull d body);
}
