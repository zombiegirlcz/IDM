package com.revolut.feature.trading.impl.data.network;

import gim.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import w3f.h0;
import w3f.k0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u009a\u0001\u0010\u0013\u001a\u00020\u00122\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/trading/impl/data/network/TradingTransactionsService;", "", "", "", "accountTypes", "portfolioId", "clientOrderId", "standingOrderId", "transferRequestId", "currencies", "", "unsettled", "", "from", "to", "startAfter", "", "limit", "Lw3f/k0;", "getTransactionsPage", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compoundId", "Lw3f/h0;", "getTransactionByCompoundId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingTransactionsService {
    static Object a(TradingTransactionsService tradingTransactionsService, ArrayList arrayList, String str, String str2, String str3, String str4, ArrayList arrayList2, Boolean bool, Long l2, Long l3, Long l4, int i, c cVar, int i2) {
        Long l5;
        TradingTransactionsService tradingTransactionsService2;
        int i3;
        c cVar2;
        List<String> list = (i2 & 1) != 0 ? f0.f322471a : arrayList;
        String str5 = (i2 & 2) != 0 ? null : str;
        String str6 = (i2 & 4) != 0 ? null : str2;
        String str7 = (i2 & 8) != 0 ? null : str3;
        String str8 = (i2 & 16) != 0 ? null : str4;
        List<String> list2 = (i2 & 32) != 0 ? f0.f322471a : arrayList2;
        Boolean bool2 = (i2 & 64) != 0 ? null : bool;
        Long l22 = (i2 & 128) != 0 ? null : l2;
        Long l31 = (i2 & 256) != 0 ? null : l3;
        if ((i2 & 512) != 0) {
            l5 = null;
            i3 = i;
            cVar2 = cVar;
            tradingTransactionsService2 = tradingTransactionsService;
        } else {
            l5 = l4;
            tradingTransactionsService2 = tradingTransactionsService;
            i3 = i;
            cVar2 = cVar;
        }
        return tradingTransactionsService2.getTransactionsPage(list, str5, str6, str7, str8, list2, bool2, l22, l31, l5, i3, cVar2);
    }

    @GET("/trading/transactions/{compoundId}")
    Object getTransactionByCompoundId(@Path("compoundId") @NotNull String str, @NotNull Continuation<? super h0> continuation);

    @GET("/trading/transactions")
    Object getTransactionsPage(@NotNull @Query("accountType") List<String> list, @Query("portfolioId") String str, @Query("clientOrderId") String str2, @Query("standingOrderId") String str3, @Query("transferRequestId") String str4, @NotNull @Query("ccy") List<String> list2, @Query("unsettled") Boolean bool, @Query("from") Long l2, @Query("to") Long l3, @Query("startAfter") Long l4, @Query("limit") int i, @NotNull Continuation<? super k0> continuation);
}
