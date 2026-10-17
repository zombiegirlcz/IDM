package com.revolut.feature.donations.impl.network.service;

import efm.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import va6.c;
import va6.d;
import va6.f;
import va6.g;
import va6.i;
import va6.j;
import va6.k;
import wa6.a;
import wj0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f0\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H'¢\u0006\u0004\b\u0013\u0010\u0006J%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00030\u0002H'¢\u0006\u0004\b\u001a\u0010\u0006J\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u0007H'¢\u0006\u0004\b\u001c\u0010\nJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u001e\u0010\nJ.\u0010!\u001a\u00020 2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b!\u0010\"J$\u0010%\u001a\u00020$2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&¨\u0006'À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/donations/impl/network/service/DonationsService;", "", "Lefm/d0;", "", "Lva6/g;", "getCharities", "()Lefm/d0;", "", "charityId", "getCharityDetails", "(Ljava/lang/String;)Lefm/d0;", "Lva6/i;", "request", "Lwj0/b;", "idempotencyTag", "Lretrofit2/Response;", "donate", "(Ljava/lang/String;Lva6/i;Lwj0/b;)Lefm/d0;", "Lva6/d;", "getCharitiesOverview", "", "count", "Lva6/k;", "getSuggestions", "(I)Lefm/d0;", "Lva6/c;", "getCharitiesCollections", "collectionId", "getCharityCollection", "Lva6/f;", "getCharityCampaigns", "currency", "Lva6/j;", "getSuggestedPointsAmounts", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwa6/a;", "Lwa6/b;", "quoteDonation", "(Ljava/lang/String;Lwa6/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DonationsService {
    @POST("charity/{charityId}/donation")
    @NotNull
    d0<Response<Object>> donate(@Path("charityId") @NotNull String charityId, @Body @NotNull i request, @Tag b idempotencyTag);

    @GET("charity")
    @NotNull
    d0<List<g>> getCharities();

    @GET("charities-collections")
    @NotNull
    d0<List<c>> getCharitiesCollections();

    @GET("charity/overview")
    @NotNull
    d0<d> getCharitiesOverview();

    @GET("charity/{charityId}/campaigns")
    @NotNull
    d0<f> getCharityCampaigns(@Path("charityId") @NotNull String charityId);

    @GET("charities-collections/{id}")
    @NotNull
    d0<c> getCharityCollection(@Path("id") @NotNull String collectionId);

    @GET("charity/{id}")
    @NotNull
    d0<g> getCharityDetails(@Path("id") @NotNull String charityId);

    @GET("charity/{charityId}/donation/suggested-points-amounts")
    Object getSuggestedPointsAmounts(@Path("charityId") @NotNull String str, @NotNull @Query("currency") String str2, @Query("count") int i, @NotNull Continuation<? super j> continuation);

    @GET("charity/donation/suggested-amounts")
    @NotNull
    d0<List<k>> getSuggestions(@Query("count") int count);

    @POST("charity/{charityId}/quote-donation")
    Object quoteDonation(@Path("charityId") @NotNull String str, @Body @NotNull a aVar, @NotNull Continuation<? super wa6.b> continuation);
}
