package com.revolut.data.network.services;

import com.revolut.data.network.models.moneyrequest.SplitBillItemDto;
import com.revolut.data.network.models.moneyrequest.SplittedBillDto;
import com.revolut.data.network.models.moneyrequest.TransactionsMoneyDataToSplitDto;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rH'¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\rH'¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/SplitBillService;", "", "Lcom/revolut/data/network/models/moneyrequest/TransactionsMoneyDataToSplitDto;", "request", "Lefm/d0;", "Lcom/revolut/data/network/models/moneyrequest/SplittedBillDto;", "postSplitBillOld", "(Lcom/revolut/data/network/models/moneyrequest/TransactionsMoneyDataToSplitDto;)Lefm/d0;", "", "from", "", "getSplitBillsOld", "(J)Lefm/d0;", "", "id", "Lefm/b;", "cancelSplitBill", "(Ljava/lang/String;)Lefm/b;", "Lcom/revolut/data/network/models/moneyrequest/SplitBillItemDto;", "getSplitBillDetailsForPayer", "(Ljava/lang/String;)Lefm/d0;", "moneyRequestId", "getSplitBillDetailsForRequestor", "(Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "billId", "deleteSplitBillReceipt", "(Ljava/lang/String;Ljava/lang/String;)Lefm/b;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillService {
    @DELETE("split-bills/{id}")
    @NotNull
    b cancelSplitBill(@Path("id") @NotNull String id10);

    @DELETE("split-bills/{id}/bills/{billId}/receipt")
    @NotNull
    b deleteSplitBillReceipt(@Path("id") @NotNull String id10, @Path("billId") @NotNull String billId);

    @GET("user/current/split-bills/{id}")
    @NotNull
    d0<List<SplitBillItemDto>> getSplitBillDetailsForPayer(@Path("id") @NotNull String id10);

    @GET("split-bills/{id}/money-requests/{moneyRequestId}")
    @NotNull
    d0<List<SplitBillItemDto>> getSplitBillDetailsForRequestor(@Path("id") @NotNull String id10, @Path("moneyRequestId") @NotNull String moneyRequestId);

    @GET("split-bills")
    @NotNull
    d0<List<SplittedBillDto>> getSplitBillsOld(@Query("from") long from);

    @POST("split-bills")
    @NotNull
    d0<SplittedBillDto> postSplitBillOld(@Body @NotNull TransactionsMoneyDataToSplitDto request);
}
