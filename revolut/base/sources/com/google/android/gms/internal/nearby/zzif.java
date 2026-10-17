package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.BandwidthInfo;
import com.google.android.gms.nearby.connection.ConnectionInfo;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* JADX INFO: loaded from: classes16.dex */
final class zzif extends ConnectionLifecycleCallback {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzii f45293zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final ConnectionLifecycleCallback f45294zzb;

    public zzif(zzii zziiVar, ConnectionLifecycleCallback connectionLifecycleCallback) {
        this.f45293zza = zziiVar;
        this.f45294zzb = connectionLifecycleCallback;
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onBandwidthChanged(String str, BandwidthInfo bandwidthInfo) {
        this.f45294zzb.onBandwidthChanged(str, bandwidthInfo);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onConnectionInitiated(String str, ConnectionInfo connectionInfo) {
        if (connectionInfo.isIncomingConnection()) {
            this.f45293zza.zzj(str);
        }
        this.f45294zzb.onConnectionInitiated(str, connectionInfo);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onConnectionResult(String str, ConnectionResolution connectionResolution) {
        if (!connectionResolution.getStatus().isSuccess()) {
            this.f45293zza.zzk(str);
        }
        this.f45294zzb.onConnectionResult(str, connectionResolution);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onDisconnected(String str) {
        this.f45293zza.zzk(str);
        this.f45294zzb.onDisconnected(str);
    }
}
