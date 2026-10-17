package com.revolut.feature.kyc.core.impl.docs;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tt8.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/core/impl/docs/KycDocsService;", "", "", "scope", "citizenship", "workflowStepId", "issuingCountry", "Ltt8/g;", "getDocuments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_kyc_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KycDocsService {
    @GET("/kyc/applicable-documents")
    Object getDocuments(@NotNull @Query("scope") String str, @Query("citizenship") String str2, @Query("workflowStepId") String str3, @Query("issuingCountry") String str4, @NotNull Continuation<? super g> continuation);
}
