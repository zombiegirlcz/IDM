package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.nearby.uwb.UwbRangeDataNtfConfig;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes16.dex */
public interface UwbClient extends HasApiKey<zze> {
    @NonNull
    Task<Void> addControlee(@NonNull UwbAddress uwbAddress);

    @NonNull
    Task<Void> addControleeWithSessionParams(@NonNull RangingControleeParameters rangingControleeParameters);

    @NonNull
    Task<UwbComplexChannel> getComplexChannel();

    @NonNull
    Task<UwbAddress> getLocalAddress();

    @NonNull
    Task<RangingCapabilities> getRangingCapabilities();

    @NonNull
    Task<Boolean> isAvailable();

    @NonNull
    Task<Void> reconfigureRangeDataNtf(@UwbRangeDataNtfConfig.RangeDataNtfConfig int i, int i2, int i3);

    @NonNull
    Task<Void> reconfigureRangingInterval(int i);

    @NonNull
    Task<Void> removeControlee(@NonNull UwbAddress uwbAddress);

    @NonNull
    Task<Void> startRanging(@NonNull RangingParameters rangingParameters, @NonNull RangingSessionCallback rangingSessionCallback);

    @NonNull
    Task<Void> stopRanging(@NonNull RangingSessionCallback rangingSessionCallback);
}
