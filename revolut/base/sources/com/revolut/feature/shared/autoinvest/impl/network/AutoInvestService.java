package com.revolut.feature.shared.autoinvest.impl.network;

import d6d.a;
import d6d.b;
import d6d.c;
import d6d.f;
import d6d.g;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\bH'¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/autoinvest/impl/network/AutoInvestService;", "", "Ld6d/a;", "autoInvestRequest", "Lefm/d0;", "Ld6d/b;", "setAutoInvestSetting", "(Ld6d/a;)Lefm/d0;", "", "id", "updateAutoInvest", "(Ljava/lang/String;Ld6d/a;)Lefm/d0;", "Ld6d/c;", "autoInvestStateRequest", "updateAutoInvestState", "(Ljava/lang/String;Ld6d/c;)Lefm/d0;", "ownerId", "", "getAutoInvest", "(Ljava/lang/String;)Lefm/d0;", "Ld6d/f;", "getCalculationStrategy", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "charityId", "Ld6d/g;", "request", "createCharityAutoInvest", "(Ljava/lang/String;Ld6d/g;)Lefm/d0;", "Lefm/b;", "deleteAutoInvest", "(Ljava/lang/String;)Lefm/b;", "feature_shared_autoinvest_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AutoInvestService {
    @POST("/auto-invest/charity/{id}")
    @NotNull
    d0<b> createCharityAutoInvest(@Path("id") @NotNull String charityId, @Body @NotNull g request);

    @DELETE("/auto-invest/{id}")
    @NotNull
    efm.b deleteAutoInvest(@Path("id") @NotNull String id10);

    @GET("/auto-invest")
    @NotNull
    d0<List<b>> getAutoInvest(@NotNull @Query("ownerId") String ownerId);

    @GET("/auto-invest/calculation-strategy")
    Object getCalculationStrategy(@NotNull Continuation<? super f> continuation);

    @POST("/auto-invest")
    @NotNull
    d0<b> setAutoInvestSetting(@Body @NotNull a autoInvestRequest);

    @PATCH("/auto-invest/{id}")
    @NotNull
    d0<b> updateAutoInvest(@Path("id") @NotNull String id10, @Body @NotNull a autoInvestRequest);

    @PATCH("/auto-invest/{id}")
    @NotNull
    d0<b> updateAutoInvestState(@Path("id") @NotNull String id10, @Body @NotNull c autoInvestStateRequest);
}
