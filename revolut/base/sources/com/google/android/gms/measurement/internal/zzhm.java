package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzhm extends BroadcastReceiver {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzpv f47064zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean f47065zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f47066zzc;

    public zzhm(zzpv zzpvVar) {
        Preconditions.checkNotNull(zzpvVar);
        this.f47064zza = zzpvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzpv zzpvVar = this.f47064zza;
        zzpvVar.zzM();
        String action = intent.getAction();
        zzpvVar.zzaW().zzj().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpvVar.zzaW().zzk().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzd = zzpvVar.zzp().zzd();
        if (this.f47066zzc != zZzd) {
            this.f47066zzc = zZzd;
            zzpvVar.zzaX().zzq(new zzhl(this, zZzd));
        }
    }

    public final void zzb() {
        zzpv zzpvVar = this.f47064zza;
        zzpvVar.zzM();
        zzpvVar.zzaX().zzg();
        if (this.f47065zzb) {
            return;
        }
        zzpvVar.zzaT().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f47066zzc = zzpvVar.zzp().zzd();
        zzpvVar.zzaW().zzj().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f47066zzc));
        this.f47065zzb = true;
    }

    public final void zzc() {
        zzpv zzpvVar = this.f47064zza;
        zzpvVar.zzM();
        zzpvVar.zzaX().zzg();
        zzpvVar.zzaX().zzg();
        if (this.f47065zzb) {
            zzpvVar.zzaW().zzj().zza("Unregistering connectivity change receiver");
            this.f47065zzb = false;
            this.f47066zzc = false;
            try {
                zzpvVar.zzaT().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f47064zza.zzaW().zze().zzb("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
