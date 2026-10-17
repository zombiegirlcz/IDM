package com.revolut.feature.credit.application.impl.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import lr3.a;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/impl/network/CreditEntryPointsService;", "", "", "type", "productTypes", "", "Llr3/a;", "getCreditEntryPoints", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditEntryPointsService {
    @GET("/credit-application/tile/entry-point")
    Object getCreditEntryPoints(@NotNull @Query("entryPointType") String str, @Query("productTypes") String str2, @NotNull Continuation<? super List<a>> continuation);
}
