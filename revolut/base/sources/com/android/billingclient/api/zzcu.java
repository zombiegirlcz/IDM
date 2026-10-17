package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzcu implements ServiceConnection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzcw f25967zza;

    public /* synthetic */ zzcu(zzcw zzcwVar, zzcv zzcvVar) {
        Objects.requireNonNull(zzcwVar);
        this.f25967zza = zzcwVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClientTesting", "Billing Override Service connected.");
        zzcw zzcwVar = this.f25967zza;
        zzcwVar.f25970zzc = com.google.android.gms.internal.play_billing.zzax.zzb(iBinder);
        zzcwVar.f25969zzb = 2;
        zzcwVar.zzaO(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClientTesting", "Billing Override Service disconnected.");
        zzcw zzcwVar = this.f25967zza;
        zzcwVar.f25970zzc = null;
        zzcwVar.f25969zzb = 0;
    }
}
