package com.revolut.feature.freelancer.impl.network.services;

import com.revolut.feature.freelancer.impl.network.models.h;
import com.revolut.feature.freelancer.impl.network.models.l;
import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0007H'¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/services/FreelancerCustomersService;", "", "Lefm/d0;", "", "Lcom/revolut/feature/freelancer/impl/network/models/l;", "getCustomers", "()Lefm/d0;", "", "id", "getCustomer", "(Ljava/lang/String;)Lefm/d0;", "email", "getCustomerByEmail", "Lcom/revolut/feature/freelancer/impl/network/models/h;", "customer", "postCustomer", "(Lcom/revolut/feature/freelancer/impl/network/models/h;)Lefm/d0;", "patchCustomer", "(Ljava/lang/String;Lcom/revolut/feature/freelancer/impl/network/models/h;)Lefm/d0;", "Lefm/b;", "deleteCustomer", "(Ljava/lang/String;)Lefm/b;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerCustomersService {
    @DELETE("/acquiring/merchant/customer/{customerId}")
    @NotNull
    b deleteCustomer(@Path("customerId") @NotNull String id10);

    @GET("/acquiring/merchant/customer/{customerId}")
    @NotNull
    d0<l> getCustomer(@Path("customerId") String id10);

    @GET("/acquiring/merchant/customer")
    @NotNull
    d0<l> getCustomerByEmail(@NotNull @Query("email") String email);

    @GET("/acquiring/merchant/customers")
    @NotNull
    d0<List<l>> getCustomers();

    @PATCH("/acquiring/merchant/customer/{customerId}")
    @NotNull
    d0<l> patchCustomer(@Path("customerId") @NotNull String id10, @Body @NotNull h customer);

    @POST("/acquiring/merchant/customer")
    @NotNull
    d0<l> postCustomer(@Body @NotNull h customer);
}
