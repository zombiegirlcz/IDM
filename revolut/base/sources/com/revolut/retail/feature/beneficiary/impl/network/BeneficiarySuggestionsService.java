package com.revolut.retail.feature.beneficiary.impl.network;

import f5j.i;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001JN\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/network/BeneficiarySuggestionsService;", "", "", "bankCountry", "currency", "context", "", "params", "", "Lf5j/i;", "getSuggestionsForNewBeneficiary", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beneficiaryId", "getSuggestionsForExistingBeneficiary", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BeneficiarySuggestionsService {
    @GET("/beneficiary/{BENEFICIARY_ID}/suggestions")
    Object getSuggestionsForExistingBeneficiary(@Path("BENEFICIARY_ID") @NotNull String str, @Query("context") String str2, @NotNull Continuation<? super List<i>> continuation);

    @GET("/beneficiary/suggestions")
    Object getSuggestionsForNewBeneficiary(@NotNull @Query("bankCountry") String str, @Query("currency") String str2, @Query("context") String str3, @QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super List<i>> continuation);
}
