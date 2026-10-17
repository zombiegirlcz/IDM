package com.revolut.feature.devicemanagement.impl.data.service;

import efm.b;
import efm.d0;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p86.c;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/devicemanagement/impl/data/service/DeviceManagementService;", "", "", "activeOnly", "Lefm/d0;", "", "Lp86/c;", "getUserDevices", "(Z)Lefm/d0;", "", "id", "Lefm/b;", "signOutDevice", "(Ljava/lang/String;)Lefm/b;", "feature_device_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeviceManagementService {
    @GET("/devices")
    @NotNull
    d0<List<c>> getUserDevices(@Query("activeOnly") boolean activeOnly);

    @POST("/devices/{id}/signout")
    @NotNull
    b signOutDevice(@Path("id") @NotNull String id10);
}
