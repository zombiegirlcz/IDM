package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public final class DiscoveredEndpointInfo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f47809zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47810zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final BluetoothDevice f47811zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final byte[] f47812zzd;

    public /* synthetic */ DiscoveredEndpointInfo(String str, String str2, BluetoothDevice bluetoothDevice, byte[] bArr, zzt zztVar) {
        this.f47809zza = str;
        this.f47810zzb = str2;
        this.f47811zzc = bluetoothDevice;
        this.f47812zzd = bArr;
    }

    @NonNull
    public byte[] getEndpointInfo() {
        return this.f47812zzd;
    }

    @NonNull
    public String getEndpointName() {
        return this.f47810zzb;
    }

    @NonNull
    public String getServiceId() {
        return this.f47809zza;
    }

    @Deprecated
    public DiscoveredEndpointInfo(@NonNull String str, @NonNull String str2) {
        this.f47809zza = str;
        this.f47810zzb = str2;
        this.f47812zzd = str2.getBytes();
        this.f47811zzc = null;
    }
}
