package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public final class zzp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    Object f46285zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    zzt f46286zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzv f46287zzc = zzv.zze();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f46288zzd;

    public final void finalize() {
        zzv zzvVar;
        zzt zztVar = this.f46286zzb;
        if (zztVar != null && !zztVar.isDone()) {
            zztVar.zzc(new zzq("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f46285zza))));
        }
        if (this.f46288zzd || (zzvVar = this.f46287zzc) == null) {
            return;
        }
        zzvVar.zzd(null);
    }

    public final void zza() {
        this.f46285zza = null;
        this.f46286zzb = null;
        this.f46287zzc.zzd(null);
    }

    public final boolean zzb(Object obj2) {
        this.f46288zzd = true;
        zzt zztVar = this.f46286zzb;
        boolean z = zztVar != null && zztVar.zza(obj2);
        if (z) {
            this.f46285zza = null;
            this.f46286zzb = null;
            this.f46287zzc = null;
        }
        return z;
    }
}
