package com.revolut.feature.insurance_credit.impl.data.network;

import bs7.c;
import bs7.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import zr7.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/data/network/InsuranceCreditService;", "", "", "policyId", "Lzr7/t;", "getInsuranceDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbs7/c;", "body", "Lbs7/f;", "cancelInsurance", "(Ljava/lang/String;Lbs7/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InsuranceCreditService {
    @POST("credit-insurance/policies/{id}/cancel")
    Object cancelInsurance(@Path("id") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super f> continuation);

    @GET("/credit-insurance/policies/{id}")
    Object getInsuranceDetails(@Path("id") @NotNull String str, @NotNull Continuation<? super t> continuation);
}
