package com.revolut.feature.external_accounts.impl.repository.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import uh6.i;
import uh6.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J9\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/repository/network/InstitutionAccountsService;", "", "", "institutionId", "state", "authToken", "Lefm/d0;", "", "Luh6/i;", "getAccountsToSelect", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Luh6/n;", "request", "Lefm/b;", "selectAccount", "(Ljava/lang/String;Luh6/n;)Lefm/b;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstitutionAccountsService {
    @GET("/external-institutions/{institutionId}/accounts/selectable")
    @NotNull
    d0<List<i>> getAccountsToSelect(@Path("institutionId") @NotNull String institutionId, @NotNull @Query("state") String state, @NotNull @Query("authToken") String authToken);

    @POST("/external-institutions/{institutionId}/accounts/selectable")
    @NotNull
    b selectAccount(@Path("institutionId") @NotNull String institutionId, @Body @NotNull n request);
}
