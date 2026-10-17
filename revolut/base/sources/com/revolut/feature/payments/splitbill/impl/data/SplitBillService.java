package com.revolut.feature.payments.splitbill.impl.data;

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
import z0a.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/data/SplitBillService;", "", "Lz0a/a;", "request", "Lefm/d0;", "postSplitBill", "(Lz0a/a;)Lefm/d0;", "", "from", "", "getSplitBills", "(J)Lefm/d0;", "", "id", "Lefm/b;", "cancelSplitBill", "(Ljava/lang/String;)Lefm/b;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillService {
    @DELETE("split-bills/{id}")
    @NotNull
    b cancelSplitBill(@Path("id") @NotNull String id10);

    @GET("split-bills")
    @NotNull
    d0<List<Object>> getSplitBills(@Query("from") long from);

    @POST("split-bills")
    @NotNull
    d0<Object> postSplitBill(@Body @NotNull a request);
}
