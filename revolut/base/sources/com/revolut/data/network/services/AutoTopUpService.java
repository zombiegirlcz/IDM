package com.revolut.data.network.services;

import com.revolut.data.network.models.topup.AutoTopUpPerPocketDto;
import com.revolut.data.network.models.topup.PutAutoTopUpDto;
import efm.b;
import efm.d0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/AutoTopUpService;", "", "Lefm/d0;", "Lcom/revolut/data/network/models/topup/AutoTopUpPerPocketDto;", "getAutoTopUp", "()Lefm/d0;", "Lcom/revolut/data/network/models/topup/PutAutoTopUpDto;", "body", "", "pocketType", "Lefm/b;", "putAutoTopUp", "(Lcom/revolut/data/network/models/topup/PutAutoTopUpDto;Ljava/lang/String;)Lefm/b;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AutoTopUpService {
    @GET("user/current/settings/auto-topup")
    @NotNull
    d0<AutoTopUpPerPocketDto> getAutoTopUp();

    @PUT("user/current/settings/auto-topup")
    @NotNull
    b putAutoTopUp(@Body @NotNull PutAutoTopUpDto body, @NotNull @Query("pocketType") String pocketType);
}
