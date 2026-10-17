package com.revolut.feature.address.impl.data.network;

import ib.b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import no3.a;
import no3.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J<\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/address/impl/data/network/AddressAutocompleteService;", "", "", "text", "country", "parentId", "sessionId", "Lno3/d;", "searchAddresses", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "", "detailed", "Lno3/a;", "getFullAddressById", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "Lbj1/d;", "searchAddressesByLocation", "(DDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_address_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddressAutocompleteService {
    @GET("address-details/{id}")
    Object getFullAddressById(@Path("id") @NotNull String str, @Query("detailed") boolean z, @Query(b.Session) String str2, @NotNull Continuation<? super a> continuation);

    @GET("address-completions")
    Object searchAddresses(@NotNull @Query("text") String str, @NotNull @Query("country") String str2, @Query("parent") String str3, @Query(b.Session) String str4, @NotNull Continuation<? super d> continuation);

    @GET("address-reverse")
    Object searchAddressesByLocation(@Query("lat") double d, @Query("lon") double d5, @NotNull @Query("country") String str, @NotNull Continuation<? super bj1.d> continuation);
}
