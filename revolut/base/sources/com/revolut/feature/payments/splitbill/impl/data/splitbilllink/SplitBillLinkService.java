package com.revolut.feature.payments.splitbill.impl.data.splitbilllink;

import f1a.c;
import f1a.f;
import f1a.l;
import f1a.r;
import f1a.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/data/splitbilllink/SplitBillLinkService;", "", "", "from", "", "count", "Lf1a/u;", "getSplitBillLinks", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "identifier", "Lf1a/f;", "getSplitBillLinkDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lf1a/c;", "params", "Lf1a/l;", "createSplitBillLink", "(Lf1a/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lf1a/r;", "updateSplitBillLink", "(Ljava/lang/String;Lf1a/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillLinkService {
    @POST("split-bill-links")
    Object createSplitBillLink(@Body @NotNull c cVar, @NotNull Continuation<? super l> continuation);

    @GET("split-bill-links/{identifier}")
    Object getSplitBillLinkDetails(@Path("identifier") @NotNull String str, @NotNull Continuation<? super f> continuation);

    @GET("split-bill-links")
    Object getSplitBillLinks(@Query("from") long j2, @Query("count") int i, @NotNull Continuation<? super u> continuation);

    @PATCH("split-bill-links/{id}")
    Object updateSplitBillLink(@Path("id") @NotNull String str, @Body @NotNull r rVar, @NotNull Continuation<? super l> continuation);
}
