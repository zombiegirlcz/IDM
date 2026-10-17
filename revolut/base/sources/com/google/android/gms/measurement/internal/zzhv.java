package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import ch.qos.logback.core.util.a;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhv implements ServiceConnection {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzhw f47105zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f47106zzb;

    public zzhv(zzhw zzhwVar, String str) {
        this.f47105zza = zzhwVar;
        this.f47106zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            a.C(this.f47105zza.f47107zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzbrVarZzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                this.f47105zza.f47107zza.zzaW().zzk().zza("Install Referrer Service implementation was not found");
                return;
            }
            zzio zzioVar = this.f47105zza.f47107zza;
            zzioVar.zzaW().zzj().zza("Install Referrer Service connected");
            zzioVar.zzaX().zzq(new zzhu(this, zzbrVarZzb, this));
        } catch (RuntimeException e) {
            this.f47105zza.f47107zza.zzaW().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f47105zza.f47107zza.zzaW().zzj().zza("Install Referrer Service disconnected");
    }
}
