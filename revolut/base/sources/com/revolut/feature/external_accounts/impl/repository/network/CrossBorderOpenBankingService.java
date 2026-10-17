package com.revolut.feature.external_accounts.impl.repository.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import se6.g;
import ze6.a;
import ze6.b;
import ze6.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\r\u001a\u00020\bH§@¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/CrossBorderOpenBankingService;", "", "Lse6/g;", "institutionTypeFilter", "", "Lze6/a;", "getInstitutions", "(Lse6/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "globalInstitutionId", "Lze6/c;", "getCountryDepartments", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "institutionId", "Lze6/b;", "getBranches", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CrossBorderOpenBankingService {
    @GET("/cross-border-external-institutions/{id}/branches")
    Object getBranches(@Path("id") @NotNull String str, @NotNull Continuation<? super List<b>> continuation);

    @GET("/cross-border-external-institutions/{id}/countries")
    Object getCountryDepartments(@Path("id") @NotNull String str, @NotNull Continuation<? super List<c>> continuation);

    @GET("/cross-border-external-institutions")
    Object getInstitutions(@NotNull @Query("filter") g gVar, @NotNull Continuation<? super List<a>> continuation);
}
