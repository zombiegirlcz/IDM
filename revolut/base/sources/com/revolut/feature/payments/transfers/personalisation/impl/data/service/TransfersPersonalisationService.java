package com.revolut.feature.payments.transfers.personalisation.impl.data.service;

import j2a.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/transfers/personalisation/impl/data/service/TransfersPersonalisationService;", "", "", "uuid", "Lj2a/h;", "getPersonalisation", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "include", "", "getPersonalisations", "feature_payments_transfers_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransfersPersonalisationService {
    @GET("/p2p-personalisations/{uuid}")
    Object getPersonalisation(@Path("uuid") @NotNull String str, @NotNull Continuation<? super h> continuation);

    @GET("/p2p-personalisations")
    Object getPersonalisations(@Query("include") String str, @NotNull Continuation<? super List<? extends h>> continuation);
}
