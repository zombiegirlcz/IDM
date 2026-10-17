package com.revolut.feature.topup_screen.impl.data.network.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import uue.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b`\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/data/network/service/BrazilPixTopUpService;", "", "", "storedMethodId", "topupCurrency", "Luue/d;", "fetchLimits", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currency", "", "amount", "fetchCharges", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BrazilPixTopUpService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.f90579a;

    /* JADX INFO: renamed from: com.revolut.feature.topup_screen.impl.data.network.service.BrazilPixTopUpService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f90579a = new Companion();

        private Companion() {
        }
    }

    @GET("/topup/PIX_SMART_TRANSFER/charges")
    Object fetchCharges(@NotNull @Query("currency") String str, @Query("amount") long j2, @NotNull Continuation<Object> continuation);

    @GET("/topup/limits/PIX_SMART_TRANSFER/{storedMethodId}")
    Object fetchLimits(@Path("storedMethodId") @NotNull String str, @NotNull @Query("topupCurrency") String str2, @NotNull Continuation<? super d> continuation);
}
