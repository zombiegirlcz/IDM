package com.revolut.feature.push_to_card.impl.flows.amount_common;

import efm.d0;
import kotlin.Metadata;
import lqa.f0;
import lqa.x;
import lqa.y;
import mqa.g;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import wj0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Ja\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/amount_common/Push2CardAmountService;", "", "", "fromCurrency", "toCurrency", "priceQuoteTraceId", "", "amount", "cardOwnerId", "sourcePocketId", "taxTreatment", "Lefm/d0;", "Llqa/x;", "getQuoteFees", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lmqa/g;", "body", "Lwj0/b;", "idempotencyTag", "Llqa/f0;", "submitPayment", "(Lmqa/g;Lwj0/b;)Lefm/d0;", "recipientCurrency", "Llqa/y;", "getProperties", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface Push2CardAmountService {
    @GET("/card-transfers/properties")
    @NotNull
    d0<y> getProperties(@NotNull @Query("cardOwnerId") String cardOwnerId, @NotNull @Query("recipientCurrency") String recipientCurrency);

    @GET("/card-transfers/quotes/{fromCurrency}-{toCurrency}")
    @NotNull
    d0<x> getQuoteFees(@Path("fromCurrency") @NotNull String fromCurrency, @Path("toCurrency") @NotNull String toCurrency, @Header("X-Price-Quote-Trace-Id") String priceQuoteTraceId, @Query("amount") long amount, @NotNull @Query("cardOwnerId") String cardOwnerId, @Query("sourcePocketId") String sourcePocketId, @Query("taxTreatment") String taxTreatment);

    @POST("/card-transfers")
    @NotNull
    d0<f0> submitPayment(@Body @NotNull g body, @Tag b idempotencyTag);
}
