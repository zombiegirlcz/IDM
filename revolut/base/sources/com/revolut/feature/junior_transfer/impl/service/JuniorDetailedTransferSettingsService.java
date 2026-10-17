package com.revolut.feature.junior_transfer.impl.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PATCH;
import retrofit2.http.Query;
import tq8.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fJ*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u00020\u000b2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_transfer/impl/service/JuniorDetailedTransferSettingsService;", "", "", "juniorId", "enabledExperiments", "", "Ltq8/c;", "getTransfersCounterpartiesSettings", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lsq8/c;", "body", "", "updateTransferSettings", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "a", "feature_junior_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorDetailedTransferSettingsService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f77424a;

    /* JADX INFO: renamed from: com.revolut.feature.junior_transfer.impl.service.JuniorDetailedTransferSettingsService$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f77424a = new Companion();

        private Companion() {
        }
    }

    @GET("/youth/transfers/counterparties/settings")
    Object getTransfersCounterpartiesSettings(@NotNull @Query("childId") String str, @Header("X-Enabled-Experiments") @NotNull String str2, @NotNull Continuation<? super List<c>> continuation);

    @PATCH("/youth/transfers/counterparties/settings")
    Object updateTransferSettings(@Body @NotNull List<sq8.c> list, @Header("X-Enabled-Experiments") @NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
