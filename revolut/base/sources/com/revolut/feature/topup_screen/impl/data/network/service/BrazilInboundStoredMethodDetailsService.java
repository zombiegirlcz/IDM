package com.revolut.feature.topup_screen.impl.data.network.service;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import qo6.c;
import qo6.r;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0006¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/BrazilInboundStoredMethodDetailsService;", "", "", "accountId", "Lqo6/c;", "fetchStoredMethodDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqo6/r;", "params", "", "updateStoredMethod", "(Ljava/lang/String;Lqo6/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStoredMethod", "Companion", "a", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrazilInboundStoredMethodDetailsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f90578a;

    /* JADX INFO: renamed from: com.revolut.feature.topup_screen.impl.data.network.service.BrazilInboundStoredMethodDetailsService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f90578a = new Companion();

        private Companion() {
        }
    }

    @DELETE("/external-institutions/stored-methods/{accountId}?type=PIX_SMART_TRANSFER")
    Object deleteStoredMethod(@Path("accountId") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @GET("/external-institutions/stored-methods/{accountId}?type=PIX_SMART_TRANSFER")
    Object fetchStoredMethodDetails(@Path("accountId") @NotNull String str, @NotNull Continuation<? super c> continuation);

    @PATCH("/external-institutions/stored-methods/{accountId}?type=PIX_SMART_TRANSFER")
    Object updateStoredMethod(@Path("accountId") @NotNull String str, @Body @NotNull r rVar, @NotNull Continuation<? super Unit> continuation);
}
