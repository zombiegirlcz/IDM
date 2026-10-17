package com.revolut.feature.pockets.impl.network;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import xda.c;
import xda.u;
import yda.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JK\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pockets/impl/network/PocketDetailsService;", "", "", "walletId", "currency", "pocketType", "externalAccountId", "country", "Lefm/d0;", "Lxda/u;", "getAccountDetails", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "Lxda/c;", "accountCreationBody", "createAccount", "(Lxda/c;)Lefm/d0;", "", "Lyda/d;", "getAllAccountsDetails", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PocketDetailsService {
    @POST("/bank-accounts/account-details")
    @NotNull
    d0<u> createAccount(@Body @NotNull c accountCreationBody);

    @GET("/bank-accounts/account-details")
    @NotNull
    d0<u> getAccountDetails(@NotNull @Query("walletId") String walletId, @NotNull @Query("currency") String currency, @NotNull @Query("pocketType") String pocketType, @Query("externalAccountId") String externalAccountId, @Query("country") String country);

    @GET("/bank-accounts/account-details/all")
    @NotNull
    d0<List<d>> getAllAccountsDetails(@NotNull @Query("walletId") String walletId, @NotNull @Query("pocketType") String pocketType);
}
