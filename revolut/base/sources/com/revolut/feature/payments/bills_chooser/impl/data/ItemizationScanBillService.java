package com.revolut.feature.payments.bills_chooser.impl.data;

import jp9.k;
import jp9.r;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody$Part;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/data/ItemizationScanBillService;", "", "Lokhttp3/MultipartBody$Part;", "file", "Ljp9/r;", "submitFile", "(Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "taskId", "Ljp9/k;", "getTaskResult", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ItemizationScanBillService {
    @GET("scan-bill/{taskId}")
    Object getTaskResult(@Path("taskId") @NotNull String str, @NotNull Continuation<? super k> continuation);

    @POST("scan-bill")
    @Multipart
    Object submitFile(@NotNull @Part MultipartBody$Part multipartBody$Part, @NotNull Continuation<? super r> continuation);
}
