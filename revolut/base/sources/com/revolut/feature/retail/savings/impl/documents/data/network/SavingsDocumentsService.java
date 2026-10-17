package com.revolut.feature.retail.savings.impl.documents.data.network;

import cnb.f;
import cnb.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/documents/data/network/SavingsDocumentsService;", "", "", "Lcnb/i;", "getTaxForms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "code", "Lokhttp3/ResponseBody;", "getTaxFormByCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountType", "Lcnb/f;", "getStatementOptions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SavingsDocumentsService {
    @GET("/money-boxes/statements/options")
    Object getStatementOptions(@NotNull @Query("accountType") List<String> list, @NotNull Continuation<? super List<f>> continuation);

    @GET("/savings/tax-forms/{code}")
    Object getTaxFormByCode(@Path("code") @NotNull String str, @NotNull Continuation<? super ResponseBody> continuation);

    @GET("/savings/tax-forms")
    Object getTaxForms(@NotNull Continuation<? super List<i>> continuation);
}
