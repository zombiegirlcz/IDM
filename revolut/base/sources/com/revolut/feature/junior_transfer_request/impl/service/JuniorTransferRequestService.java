package com.revolut.feature.junior_transfer_request.impl.service;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_transfer_request/impl/service/JuniorTransferRequestService;", "", "Lefm/d0;", "", "Lwr8/b;", "getTransferRequests", "()Lefm/d0;", "", "requestId", "Lefm/b;", "approveTransferRequest", "(Ljava/lang/String;)Lefm/b;", "rejectTransferRequest", "feature_junior_transfer_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorTransferRequestService {
    @POST("youth/transfer-requests/{requestId}/approve")
    @NotNull
    b approveTransferRequest(@Path("requestId") @NotNull String requestId);

    @GET("youth/transfer-requests")
    @NotNull
    d0<List<wr8.b>> getTransferRequests();

    @POST("youth/transfer-requests/{requestId}/reject")
    @NotNull
    b rejectTransferRequest(@Path("requestId") @NotNull String requestId);
}
