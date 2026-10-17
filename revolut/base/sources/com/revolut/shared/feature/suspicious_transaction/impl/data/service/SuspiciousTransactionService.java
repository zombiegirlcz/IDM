package com.revolut.shared.feature.suspicious_transaction.impl.data.service;

import efm.b;
import efm.d0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ral.h;
import ral.j;
import ral.n;
import ral.o;
import ral.q;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0010\u0010\bJ\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0005H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00112\b\b\u0001\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b\u001d\u0010\u0013J\u0019\u0010\u001e\u001a\u00020\u00112\b\b\u0001\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b\u001e\u0010\u0013J\u0019\u0010\u001f\u001a\u00020\u00112\b\b\u0001\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010\u0013J\u0019\u0010 \u001a\u00020\u00112\b\b\u0001\u0010\u001c\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010\u0013¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/data/service/SuspiciousTransactionService;", "", "", "id", "source", "Lefm/d0;", "Lral/j;", "getSuspiciousTransactionBanner", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "", "params", "Lral/q;", "getSuspiciousTransactionDialog", "(Ljava/lang/String;Ljava/util/Map;)Lefm/d0;", "alertId", "Lral/n;", "confirmSuspiciousTransactionViaDialog", "Lefm/b;", "cancelSuspiciousTransactionViaDialog", "(Ljava/lang/String;)Lefm/b;", "Lral/h;", "body", "postAnswers", "(Ljava/lang/String;Lral/h;)Lefm/b;", "", "Lral/o;", "getKnownSuspiciousTransactionIds", "()Lefm/d0;", "path", "executePostRequest", "executePutRequest", "executePatchRequest", "executeDeleteRequest", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SuspiciousTransactionService {
    @POST("/suspicious-transactions/{id}/cancel")
    @NotNull
    b cancelSuspiciousTransactionViaDialog(@Path("id") @NotNull String id10);

    @POST("/suspicious-transactions/{id}/confirm")
    @NotNull
    d0<n> confirmSuspiciousTransactionViaDialog(@Path("id") @NotNull String id10, @Query("alertId") String alertId);

    @DELETE("{path}")
    @NotNull
    b executeDeleteRequest(@Path(encoded = true, value = "path") @NotNull String path);

    @PATCH("{path}")
    @NotNull
    b executePatchRequest(@Path(encoded = true, value = "path") @NotNull String path);

    @POST("{path}")
    @NotNull
    b executePostRequest(@Path(encoded = true, value = "path") @NotNull String path);

    @PUT("{path}")
    @NotNull
    b executePutRequest(@Path(encoded = true, value = "path") @NotNull String path);

    @GET("/suspicious-transactions")
    @NotNull
    d0<List<o>> getKnownSuspiciousTransactionIds();

    @GET("/suspicious-transactions/{id}/banner")
    @NotNull
    d0<j> getSuspiciousTransactionBanner(@Path("id") @NotNull String id10, @NotNull @Query("source") String source);

    @GET("/suspicious-transactions/{id}/dialog")
    @NotNull
    d0<q> getSuspiciousTransactionDialog(@Path("id") @NotNull String id10, @QueryMap @NotNull Map<String, String> params);

    @POST("/suspicious-transactions/{id}/answers")
    @NotNull
    b postAnswers(@Path("id") @NotNull String id10, @Body @NotNull h body);
}
