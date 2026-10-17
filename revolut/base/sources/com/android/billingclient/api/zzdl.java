package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzjp;
import com.google.android.gms.internal.play_billing.zzjr;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkf;
import com.google.android.gms.internal.play_billing.zzkh;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzkr;

/* JADX INFO: loaded from: classes16.dex */
final class zzdl implements zzcz {

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzjr f25993zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzdn f25994zzc;

    public zzdl(Context context, zzjr zzjrVar) {
        this.f25994zzc = new zzdn(context);
        this.f25993zzb = zzjrVar;
    }

    private final void zzl(zziw zziwVar, zzjr zzjrVar) {
        if (zziwVar == null) {
            return;
        }
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(zzjrVar);
            zzkfVarZza.zza(zziwVar);
            this.f25994zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    private final void zzm(zzja zzjaVar, zzjr zzjrVar) {
        if (zzjaVar == null) {
            return;
        }
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(zzjrVar);
            zzkfVarZza.zzb(zzjaVar);
            this.f25994zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zza(zziw zziwVar) {
        try {
            zzl(zziwVar, this.f25993zzb);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzb(zziw zziwVar, int i) {
        try {
            zzjp zzjpVar = (zzjp) this.f25993zzb.zzq();
            zzjpVar.zzc(i);
            this.f25993zzb = (zzjr) zzjpVar.zzi();
            zza(zziwVar);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzc(zziw zziwVar, int i, long j2) {
        try {
            zzjp zzjpVar = (zzjp) this.f25993zzb.zzq();
            zzjpVar.zzc(i);
            zzjr zzjrVar = (zzjr) zzjpVar.zzi();
            this.f25993zzb = zzjrVar;
            if (j2 != 0) {
                zzjp zzjpVar2 = (zzjp) zzjrVar.zzq();
                zzjpVar2.zze(j2);
                zzjrVar = (zzjr) zzjpVar2.zzi();
            }
            zzl(zziwVar, zzjrVar);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzd(zziw zziwVar, long j2, boolean z) {
        zzjr zzjrVar;
        try {
            zziu zziuVar = (zziu) zziwVar.zzq();
            zzjz zzjzVar = (zzjz) zziwVar.zze().zzq();
            zzjzVar.zza(z);
            zziuVar.zzd(zzjzVar);
            zziw zziwVar2 = (zziw) zziuVar.zzi();
            if (j2 == 0) {
                zzjrVar = this.f25993zzb;
            } else {
                zzjp zzjpVar = (zzjp) this.f25993zzb.zzq();
                zzjpVar.zze(j2);
                zzjrVar = (zzjr) zzjpVar.zzi();
            }
            zzl(zziwVar2, zzjrVar);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zze(zziw zziwVar, int i, long j2, boolean z) {
        zzjr zzjrVar;
        try {
            zzjp zzjpVar = (zzjp) this.f25993zzb.zzq();
            zzjpVar.zzc(i);
            this.f25993zzb = (zzjr) zzjpVar.zzi();
            zziu zziuVar = (zziu) zziwVar.zzq();
            zzjz zzjzVar = (zzjz) zziwVar.zze().zzq();
            zzjzVar.zza(z);
            zziuVar.zzd(zzjzVar);
            zziw zziwVar2 = (zziw) zziuVar.zzi();
            if (j2 == 0) {
                zzjrVar = this.f25993zzb;
            } else {
                zzjp zzjpVar2 = (zzjp) this.f25993zzb.zzq();
                zzjpVar2.zze(j2);
                zzjrVar = (zzjr) zzjpVar2.zzi();
            }
            zzl(zziwVar2, zzjrVar);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzf(zzja zzjaVar) {
        try {
            zzm(zzjaVar, this.f25993zzb);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzg(zzja zzjaVar, int i) {
        try {
            zzjp zzjpVar = (zzjp) this.f25993zzb.zzq();
            zzjpVar.zzc(i);
            this.f25993zzb = (zzjr) zzjpVar.zzi();
            zzf(zzjaVar);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzh(zzja zzjaVar, long j2, boolean z) {
        zzjr zzjrVar;
        try {
            zziy zziyVar = (zziy) zzjaVar.zzq();
            zzjz zzjzVar = (zzjz) zzjaVar.zzc().zzq();
            zzjzVar.zza(z);
            zziyVar.zzc(zzjzVar);
            zzja zzjaVar2 = (zzja) zziyVar.zzi();
            if (j2 == 0) {
                zzjrVar = this.f25993zzb;
            } else {
                zzjp zzjpVar = (zzjp) this.f25993zzb.zzq();
                zzjpVar.zze(j2);
                zzjrVar = (zzjr) zzjpVar.zzi();
            }
            zzm(zzjaVar2, zzjrVar);
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzi(zzji zzjiVar) {
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(this.f25993zzb);
            zzkfVarZza.zzc(zzjiVar);
            this.f25994zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzj(zzkn zzknVar) {
        try {
            zzdn zzdnVar = this.f25994zzc;
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(this.f25993zzb);
            zzkfVarZza.zze(zzknVar);
            zzdnVar.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }

    @Override // com.android.billingclient.api.zzcz
    public final void zzk(zzkr zzkrVar) {
        if (zzkrVar == null) {
            return;
        }
        try {
            zzkf zzkfVarZza = zzkh.zza();
            zzkfVarZza.zzd(this.f25993zzb);
            zzkfVarZza.zzp(zzkrVar);
            this.f25994zzc.zza((zzkh) zzkfVarZza.zzi());
        } catch (Throwable th10) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingLogger", "Unable to log.", th10);
        }
    }
}
