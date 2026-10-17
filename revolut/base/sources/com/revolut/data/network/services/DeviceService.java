package com.revolut.data.network.services;

import efm.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.PATCH;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/data/network/services/DeviceService;", "", "Lefm/b;", "patchDeviceInfo", "()Lefm/b;", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeviceService {
    @PATCH("device")
    @NotNull
    b patchDeviceInfo();
}
