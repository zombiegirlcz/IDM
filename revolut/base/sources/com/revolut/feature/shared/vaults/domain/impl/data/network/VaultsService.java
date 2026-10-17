package com.revolut.feature.shared.vaults.domain.impl.data.network;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import zdd.c;
import zdd.f;
import zdd.g;
import zdd.i;
import zdd.j;
import zdd.k;
import zdd.m;
import zdd.n;
import zdd.o;
import zdd.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\r\u001a\u00020\u00022\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005H'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0018H'¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u00022\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0005H'¢\u0006\u0004\b\u001f\u0010\u0016J\u001b\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\u0004H'¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b#\u0010\u0013J\u0019\u0010$\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u0002H'¢\u0006\u0004\b$\u0010\u0013J#\u0010&\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010(\u001a\u00020\u0002H'¢\u0006\u0004\b)\u0010\bJ#\u0010+\u001a\u00020\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020*H'¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010\b¨\u00060À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/vaults/domain/impl/data/network/VaultsService;", "", "", "accountType", "Lefm/d0;", "", "Lzdd/i;", "getMoneyBoxesByAccountType", "(Ljava/lang/String;)Lefm/d0;", "Lzdd/g;", "request", "createVault", "(Lzdd/g;)Lefm/d0;", "id", "Lzdd/j;", "editVault", "(Ljava/lang/String;Lzdd/j;)Lefm/d0;", "Lefm/b;", "deleteVault", "(Ljava/lang/String;)Lefm/b;", "Lzdd/m;", "inviteToVault", "(Ljava/lang/String;Ljava/util/List;)Lefm/b;", "vaultId", "Lzdd/k;", "remindInvitee", "(Ljava/lang/String;Lzdd/k;)Lefm/b;", "memberId", "removeMember", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "Lzdd/n;", "updatedMembers", "Lzdd/o;", "getPendingInvites", "()Lefm/d0;", "acceptInvite", "declineInvite", "Lzdd/f;", "contributeToSharedVault", "(Ljava/lang/String;Lzdd/f;)Lefm/b;", "moneyBoxId", "getMoneyBoxById", "Lzdd/q;", "withdraw", "(Ljava/lang/String;Lzdd/q;)Lefm/b;", "transactionId", "Lzdd/c;", "getTransactionExtraData", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface VaultsService {
    @POST("/money-boxes/{id}/invite/accept")
    @NotNull
    b acceptInvite(@Path("id") @NotNull String vaultId);

    @POST("/money-boxes/{id}/contribute")
    @NotNull
    b contributeToSharedVault(@Path("id") @NotNull String vaultId, @Body @NotNull f request);

    @POST("/money-boxes")
    @NotNull
    d0<i> createVault(@Body @NotNull g request);

    @POST("/money-boxes/{id}/invite/decline")
    @NotNull
    b declineInvite(@Path("id") @NotNull String vaultId);

    @DELETE("/money-boxes/{id}")
    @NotNull
    b deleteVault(@Path("id") @NotNull String id10);

    @PATCH("/money-boxes/{id}")
    @NotNull
    d0<i> editVault(@Path("id") @NotNull String id10, @Body @NotNull j request);

    @GET("/money-boxes/{id}")
    @NotNull
    d0<i> getMoneyBoxById(@Path("id") @NotNull String moneyBoxId);

    @GET("/money-boxes")
    @NotNull
    d0<List<i>> getMoneyBoxesByAccountType(@Query("accountType") String accountType);

    @GET("/user/current/money-boxes/pending")
    @NotNull
    d0<List<o>> getPendingInvites();

    @GET("/money-boxes/transactions/{transaction_id}")
    @NotNull
    d0<c> getTransactionExtraData(@Path("transaction_id") @NotNull String transactionId);

    @POST("/money-boxes/{id}/invite")
    @NotNull
    b inviteToVault(@Path("id") @NotNull String id10, @Body @NotNull List<m> request);

    @POST("/money-boxes/{id}/invite/remind")
    @NotNull
    b remindInvitee(@Path("id") @NotNull String vaultId, @Body @NotNull k request);

    @DELETE("/money-boxes/{id}/members/{memberId}")
    @NotNull
    b removeMember(@Path("id") @NotNull String vaultId, @Path("memberId") @NotNull String memberId);

    @PATCH("/money-boxes/{id}/members")
    @NotNull
    b updatedMembers(@Path("id") @NotNull String vaultId, @Body @NotNull List<n> request);

    @POST("/money-boxes/{id}/withdraw")
    @NotNull
    b withdraw(@Path("id") @NotNull String vaultId, @Body @NotNull q request);
}
