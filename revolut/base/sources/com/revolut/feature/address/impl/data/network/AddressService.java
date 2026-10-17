package com.revolut.feature.address.impl.data.network;

import bj1.a;
import bj1.b;
import com.revolut.data.network.models.address.AddressModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJZ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u00072\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/address/impl/data/network/AddressService;", "", "Lno3/b;", "addressModel", "", "validate", "(Lno3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "postcode", "country", "getAddress", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCode", "region", "city", "street1", "street2", "", "Lcom/revolut/data/network/models/address/AddressModel;", "getAddressList", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lbj1/a;", "address", "Lbj1/b;", "getSuggestedAddressImprovement", "(Lbj1/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "useCase", "verifyAddress", "(Ljava/lang/String;Lno3/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature_address_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddressService {
    @GET("address/{postcode}")
    Object getAddress(@Path("postcode") @NotNull String str, @NotNull @Query("country") String str2, @NotNull Continuation<Object> continuation);

    @GET("address/{country}/{postcode}")
    Object getAddressList(@Path("country") @NotNull String str, @Path("postcode") @NotNull String str2, @Query("region") String str3, @Query("city") String str4, @Query("street1") String str5, @Query("street2") String str6, @NotNull Continuation<? super List<AddressModel>> continuation);

    @POST("address/verify")
    Object getSuggestedAddressImprovement(@Body @NotNull a aVar, @NotNull Continuation<? super b> continuation);

    @POST("address/validate")
    Object validate(@Body @NotNull no3.b bVar, @NotNull Continuation<? super Unit> continuation);

    @POST("address/verify/{useCase}")
    Object verifyAddress(@Path("useCase") @NotNull String str, @Body @NotNull no3.b bVar, @NotNull Continuation<? super b> continuation);
}
