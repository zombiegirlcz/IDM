package com.revolut.data.network.services;

import com.revolut.data.network.models.threedstransactions.ThreeDSTransactionDto;
import com.revolut.data.network.models.threedstransactions.ThreeDSUpdateDto;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/ThreeDSService;", "", "Lefm/d0;", "", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSTransactionDto;", "getThreeDSTransactions", "()Lefm/d0;", "Lcom/revolut/data/network/models/threedstransactions/ThreeDSUpdateDto;", "body", "Lefm/b;", "update3DSTransaction", "(Lcom/revolut/data/network/models/threedstransactions/ThreeDSUpdateDto;)Lefm/b;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ThreeDSService {
    @GET("transaction/3ds")
    @NotNull
    d0<List<ThreeDSTransactionDto>> getThreeDSTransactions();

    @POST("transaction/3ds")
    @NotNull
    b update3DSTransaction(@Body @NotNull ThreeDSUpdateDto body);
}
