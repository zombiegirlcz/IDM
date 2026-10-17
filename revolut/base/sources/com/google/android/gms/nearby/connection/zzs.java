package com.google.android.gms.nearby.connection;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes16.dex */
public final class zzs {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private String f47880zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f47881zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private BluetoothDevice f47882zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private byte[] f47883zzd;

    public final zzs zza(BluetoothDevice bluetoothDevice) {
        this.f47882zzc = bluetoothDevice;
        this.f47881zzb = "__UNRECOGNIZED_BLUETOOTH_DEVICE__";
        this.f47883zzd = "__UNRECOGNIZED_BLUETOOTH_DEVICE__".getBytes();
        return this;
    }

    public final zzs zzb(byte[] bArr) {
        this.f47883zzd = bArr;
        return this;
    }

    public final zzs zzc(String str) {
        this.f47881zzb = str;
        return this;
    }

    public final zzs zzd(String str) {
        this.f47880zza = str;
        return this;
    }

    public final DiscoveredEndpointInfo zze() {
        return new DiscoveredEndpointInfo(this.f47880zza, this.f47881zzb, this.f47882zzc, this.f47883zzd, null);
    }
}
