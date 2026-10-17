package com.revolut.feature.subaccount.impl.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.Path;
import w6e.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/subaccount/impl/network/SubaccountsService;", "", "", "subaccountId", "", "Lw6e/c;", "data", "", "addRecurringPayments", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recurringPaymentsIds", "deleteRecurringPayments", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SubaccountsService {
    @POST("/money-boxes/{id}/recurring-payments")
    Object addRecurringPayments(@Path("id") @NotNull String str, @Body @NotNull List<c> list, @NotNull Continuation<? super Unit> continuation);

    @HTTP(hasBody = true, method = "DELETE", path = "/money-boxes/{id}/recurring-payments")
    Object deleteRecurringPayments(@Path("id") @NotNull String str, @Body @NotNull List<String> list, @NotNull Continuation<? super Unit> continuation);
}
