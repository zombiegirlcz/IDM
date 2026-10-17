package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
final class zzl extends zzd {
    public zzl() {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zza(zzm zzmVar, zzm zzmVar2) {
        zzmVar.f46276zzc = zzmVar2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final void zzb(zzm zzmVar, Thread thread) {
        zzmVar.f46275zzb = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zzc(zzo zzoVar, zzh zzhVar, zzh zzhVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.f46283zzd != zzhVar) {
                    return false;
                }
                zzoVar.f46283zzd = zzhVar2;
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zzd(zzo zzoVar, Object obj2, Object obj3) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.f46282zzc != obj2) {
                    return false;
                }
                zzoVar.f46282zzc = obj3;
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    public final boolean zze(zzo zzoVar, zzm zzmVar, zzm zzmVar2) {
        synchronized (zzoVar) {
            try {
                if (zzoVar.f46284zze != zzmVar) {
                    return false;
                }
                zzoVar.f46284zze = zzmVar2;
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
