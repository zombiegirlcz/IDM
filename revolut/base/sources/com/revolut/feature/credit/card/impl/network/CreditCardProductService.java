package com.revolut.feature.credit.card.impl.network;

import java.util.Map;
import ko4.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import on4.e;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/card/impl/network/CreditCardProductService;", "", "", "", "headers", "Lon4/e;", "getCreditFacilities", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "countryCode", "Lko4/a;", "productDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardProductService {
    @GET("/credit/facilities")
    Object getCreditFacilities(@HeaderMap @NotNull Map<String, String> map, @NotNull Continuation<? super e> continuation);

    @GET("/credit/{countryCode}/product-details")
    Object productDetails(@Path("countryCode") @NotNull String str, @NotNull Continuation<? super a> continuation);
}
