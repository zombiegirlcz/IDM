package com.revolut.feature.transfer.core.impl.quotes.data.network;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import upf.c;
import upf.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer/core/impl/quotes/data/network/TransferQuoteService;", "", "", "registeredIdentityId", "priceQuoteTraceId", "Lupf/k;", "request", "Lefm/d0;", "Lupf/c;", "requestTransferQuotes", "(Ljava/lang/String;Ljava/lang/String;Lupf/k;)Lefm/d0;", "feature_transfer_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferQuoteService {
    @POST("/transfer/quote")
    @NotNull
    d0<c> requestTransferQuotes(@Header("X-Registered-Identity") String registeredIdentityId, @Header("X-Price-Quote-Trace-Id") String priceQuoteTraceId, @Body @NotNull k request);
}
