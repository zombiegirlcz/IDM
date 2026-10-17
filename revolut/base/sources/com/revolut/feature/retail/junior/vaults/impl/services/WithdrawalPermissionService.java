package com.revolut.feature.retail.junior.vaults.impl.services;

import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import qab.a;
import qab.c;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/junior/vaults/impl/services/WithdrawalPermissionService;", "", "", "vaultId", "Lefm/d0;", "Lqab/a;", "getWithdrawalPermissions", "(Ljava/lang/String;)Lefm/d0;", "Lqab/c;", "body", "updateWithdrawalPermissions", "(Ljava/lang/String;Lqab/c;)Lefm/d0;", "feature_shared_junior_withdrawal_permission_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WithdrawalPermissionService {
    @GET("youth/savings/{vaultId}/permissions/withdrawals")
    @NotNull
    d0<a> getWithdrawalPermissions(@Path("vaultId") @NotNull String vaultId);

    @PUT("youth/savings/{vaultId}/permissions/withdrawals")
    @NotNull
    d0<a> updateWithdrawalPermissions(@Path("vaultId") @NotNull String vaultId, @Body @NotNull c body);
}
