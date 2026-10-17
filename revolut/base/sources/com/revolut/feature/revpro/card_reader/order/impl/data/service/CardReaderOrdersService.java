package com.revolut.feature.revpro.card_reader.order.impl.data.service;

import efm.d0;
import ifc.b;
import ifc.d;
import ifc.f;
import ifc.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import za1.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J9\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revpro/card_reader/order/impl/data/service/CardReaderOrdersService;", "", "", "currency", "vatNumber", "", "vatRegistered", "Lefm/d0;", "Lza1/a;", "getCardReaderOrderInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lefm/d0;", "Lifc/f$a;", "body", "Lifc/f$b;", "getPrices", "(Lifc/f$a;)Lefm/d0;", "Lifc/b$a;", "Lifc/b$b;", "orderCardReaders", "(Lifc/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderId", "Lifc/d$a;", "Lifc/d$b;", "payForCardReaders", "(Ljava/lang/String;Lifc/d$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lifc/g;", "getCardReaderOrdersInfo", "()Lefm/d0;", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardReaderOrdersService {
    @GET("acquiring/merchant/card-present/terminal-orders/params")
    @NotNull
    d0<a> getCardReaderOrderInfo(@Query("currency") String currency, @Query("vatNumber") String vatNumber, @Query("vatRegistered") Boolean vatRegistered);

    @GET("acquiring/card-present/terminal-orders")
    @NotNull
    d0<g> getCardReaderOrdersInfo();

    @POST("acquiring/merchant/card-present/terminal-orders/calculate-prices")
    @NotNull
    d0<f.b> getPrices(@Body @NotNull f.a body);

    @POST("acquiring/merchant/card-present/terminal-orders")
    Object orderCardReaders(@Body @NotNull b.a aVar, @NotNull Continuation<? super b.C0918b> continuation);

    @POST("acquiring/merchant/card-present/terminal-orders/{orderId}/pay")
    Object payForCardReaders(@Path("orderId") @NotNull String str, @Body @NotNull d.a aVar, @NotNull Continuation<? super d.b> continuation);
}
