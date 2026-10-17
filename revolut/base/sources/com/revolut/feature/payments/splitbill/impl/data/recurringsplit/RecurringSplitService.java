package com.revolut.feature.payments.splitbill.impl.data.recurringsplit;

import com.revolut.feature.payments.splitbill.models.recurringsplit.RecurringSplit;
import com.revolut.feature.payments.splitbill.models.recurringsplit.b;
import com.revolut.feature.payments.splitbill.models.recurringsplit.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\tH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0015\u001a\u00020\tH§@¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0018\u0010\u0014¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/data/recurringsplit/RecurringSplitService;", "", "Lcom/revolut/feature/payments/splitbill/models/recurringsplit/b;", "params", "Lwj0/b;", "idempotencyTag", "Lcom/revolut/feature/payments/splitbill/models/recurringsplit/RecurringSplit;", "createRecurringSplit", "(Lcom/revolut/feature/payments/splitbill/models/recurringsplit/b;Lwj0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "id", "Lcom/revolut/feature/payments/splitbill/models/recurringsplit/c;", "updateRecurringSplit", "(Ljava/lang/String;Lcom/revolut/feature/payments/splitbill/models/recurringsplit/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceType", "sourceId", "", "getRecurringSplits", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecurringSplit", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "participantId", "", "removeRecurringSplitParticipant", "cancelRecurringSplit", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RecurringSplitService {
    @DELETE("recurring-splits/{id}")
    Object cancelRecurringSplit(@Path("id") @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @POST("recurring-splits")
    Object createRecurringSplit(@Body @NotNull b bVar, @Tag @NotNull wj0.b bVar2, @NotNull Continuation<? super RecurringSplit> continuation);

    @GET("recurring-splits/{id}")
    Object getRecurringSplit(@Path("id") @NotNull String str, @NotNull Continuation<? super RecurringSplit> continuation);

    @GET("recurring-splits")
    Object getRecurringSplits(@Query("sourceType") String str, @Query("sourceId") String str2, @NotNull Continuation<? super List<RecurringSplit>> continuation);

    @DELETE("recurring-splits/{id}/participants/{participantId}")
    Object removeRecurringSplitParticipant(@Path("id") @NotNull String str, @Path("participantId") @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @PUT("recurring-splits/{id}")
    Object updateRecurringSplit(@Path("id") @NotNull String str, @Body @NotNull c cVar, @NotNull Continuation<? super RecurringSplit> continuation);
}
