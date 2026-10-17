package com.revolut.feature.wealth.impl.data.network.collections;

import com.revolut.feature.wealth.impl.data.network.collections.a;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o7h.d;
import o7h.e;
import o7h.h;
import o7h.k;
import o7h.n;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ¸\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H§@¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\b\b\u0001\u0010\u001c\u001a\u00020\u00022\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H§@¢\u0006\u0004\b\u001f\u0010\u0019J\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010\bJ)\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b&\u0010'J3\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020#H'¢\u0006\u0004\b*\u0010+J=\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\u0002H'¢\u0006\u0004\b0\u00101J?\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00050\u00042\u000e\b\u0001\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0001\u0010,\u001a\u00020\u00022\b\b\u0001\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b4\u00105¨\u00066À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/impl/data/network/collections/CollectionsService;", "", "", "assetType", "Lefm/d0;", "", "Lo7h/b;", "getCollections", "(Ljava/lang/String;)Lefm/d0;", "sort", "sortDirection", "issuerType", "creditQuality", "yieldToMaturityFrom", "yieldToMaturityTo", "maturityType", "", "maturityFrom", "maturityTo", "couponType", "issuerCountry", "Lo7h/n;", "getAllBondsInstrumentsCollection", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFundsInstrumentsCollection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEtfsInstrumentsCollection", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ref", "instrumentType", "getRelatedInstruments", "getRecommendedBuyCollection", "Lo7h/k;", "getConfiguration", "id", "Lcom/revolut/feature/wealth/impl/data/network/collections/a$a;", "collectionQuoteRequest", "Lcom/revolut/feature/wealth/impl/data/network/collections/a;", "getCollectionQuote", "(Ljava/lang/String;Lcom/revolut/feature/wealth/impl/data/network/collections/a$a;)Lefm/d0;", "idempotencyKey", "Lo7h/d;", "exchangeCollection", "(Ljava/lang/String;Ljava/lang/String;Lcom/revolut/feature/wealth/impl/data/network/collections/a$a;)Lefm/d0;", "baseCurrency", "range", "interval", "Lo7h/e;", "getCollectionPerformanceChart", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "collectionKeys", "Lo7h/h;", "getCollectionsPerformance", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lefm/d0;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CollectionsService {
    @POST("/crypto/collections/{id}/exchange ")
    @NotNull
    d0<d> exchangeCollection(@Path("id") @NotNull String id10, @Header("X-idempotency-key") @NotNull String idempotencyKey, @Body @NotNull a.C0583a collectionQuoteRequest);

    @GET("/instruments/collections/all-bonds")
    Object getAllBondsInstrumentsCollection(@Query("sort") String str, @Query("sort_direction") String str2, @Query("issuerType") List<String> list, @Query("creditQuality") List<String> list2, @Query("ytmFrom") String str3, @Query("ytmTo") String str4, @Query("maturityType") List<String> list3, @Query("maturityYearsFrom") Integer num, @Query("maturityYearsTo") Integer num2, @Query("couponType") List<String> list4, @Query("issuerCountry") List<String> list5, @NotNull Continuation<? super List<n>> continuation);

    @GET("/crypto/collections/{id}/chart")
    @NotNull
    d0<e> getCollectionPerformanceChart(@Path("id") @NotNull String id10, @NotNull @Query("baseCurrency") String baseCurrency, @NotNull @Query("range") String range, @NotNull @Query("interval") String interval);

    @POST("/assets/collections/{id}/quote")
    @NotNull
    d0<a> getCollectionQuote(@Path("id") @NotNull String id10, @Body @NotNull a.C0583a collectionQuoteRequest);

    @GET("/instruments/collections")
    @NotNull
    d0<List<o7h.b>> getCollections(@NotNull @Query("assetType") String assetType);

    @GET("/crypto/collections/performance")
    @NotNull
    d0<List<h>> getCollectionsPerformance(@NotNull @Query("collectionKeys") List<String> collectionKeys, @NotNull @Query("baseCurrency") String baseCurrency, @NotNull @Query("range") String range);

    @GET("/instruments/collections/config")
    @NotNull
    d0<k> getConfiguration(@NotNull @Query("assetType") String assetType);

    @GET("/instruments/collections/all-etfs")
    Object getEtfsInstrumentsCollection(@Query("sort") String str, @Query("sort_direction") String str2, @NotNull Continuation<? super List<n>> continuation);

    @GET("/instruments/collections/all-funds")
    Object getFundsInstrumentsCollection(@NotNull Continuation<? super List<n>> continuation);

    @GET("/instruments/collections/recommended-buy")
    @yhm.d
    Object getRecommendedBuyCollection(@NotNull Continuation<? super List<n>> continuation);

    @GET("/instruments/collections/related")
    Object getRelatedInstruments(@NotNull @Query("ref") String str, @Query("instrumentType") String str2, @NotNull Continuation<? super List<n>> continuation);
}
