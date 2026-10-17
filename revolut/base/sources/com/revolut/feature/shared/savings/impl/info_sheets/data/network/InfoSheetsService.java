package com.revolut.feature.shared.savings.impl.info_sheets.data.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ybd.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JJ\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/savings/impl/info_sheets/data/network/InfoSheetsService;", "", "", "productId", "accountType", "variation", "", "keys", "Lybd/q0;", "getInfoSheets", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_shared_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InfoSheetsService {
    @GET("/savings/info-sheets")
    Object getInfoSheets(@Query("productId") String str, @Query("accountType") String str2, @Query("variation") String str3, @NotNull @Query("keys") List<String> list, @NotNull Continuation<? super List<q0>> continuation);
}
