package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzmu implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47481zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47482zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzr f47483zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ boolean f47484zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47485zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    final /* synthetic */ zzny f47486zzf;

    public zzmu(zzny zznyVar, String str, String str2, zzr zzrVar, boolean z, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.f47481zza = str;
        this.f47482zzb = str2;
        this.f47483zzc = zzrVar;
        this.f47484zzd = z;
        this.f47485zze = zzcyVar;
        this.f47486zzf = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e;
        Bundle bundle2 = new Bundle();
        try {
            zzny zznyVar = this.f47486zzf;
            zzgl zzglVar = zznyVar.f47570zzb;
            if (zzglVar == null) {
                zzio zzioVar = zznyVar.zzu;
                zzioVar.zzaW().zze().zzc("Failed to get user properties; not connected to service", this.f47481zza, this.f47482zzb);
                zzioVar.zzw().zzV(this.f47485zze, bundle2);
                return;
            }
            zzr zzrVar = this.f47483zzc;
            Preconditions.checkNotNull(zzrVar);
            List<zzqb> listZzk = zzglVar.zzk(this.f47481zza, this.f47482zzb, this.f47484zzd, zzrVar);
            bundle = new Bundle();
            if (listZzk != null) {
                for (zzqb zzqbVar : listZzk) {
                    String str = zzqbVar.f47719zze;
                    if (str != null) {
                        bundle.putString(zzqbVar.f47716zzb, str);
                    } else {
                        Long l2 = zzqbVar.f47718zzd;
                        if (l2 != null) {
                            bundle.putLong(zzqbVar.f47716zzb, l2.longValue());
                        } else {
                            Double d = zzqbVar.f47721zzg;
                            if (d != null) {
                                bundle.putDouble(zzqbVar.f47716zzb, d.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    zznyVar.zzag();
                    zzio zzioVar2 = zznyVar.zzu;
                    zzioVar2.zzw().zzV(this.f47485zze, bundle);
                } catch (RemoteException e2) {
                    e = e2;
                    this.f47486zzf.zzu.zzaW().zze().zzc("Failed to get user properties; remote exception", this.f47481zza, e);
                    zzny zznyVar2 = this.f47486zzf;
                    zznyVar2.zzu.zzw().zzV(this.f47485zze, bundle);
                }
            } catch (Throwable th10) {
                th = th10;
                bundle2 = bundle;
                zzny zznyVar3 = this.f47486zzf;
                zznyVar3.zzu.zzw().zzV(this.f47485zze, bundle2);
                throw th;
            }
        } catch (RemoteException e4) {
            bundle = bundle2;
            e = e4;
        } catch (Throwable th11) {
            th = th11;
            zzny zznyVar32 = this.f47486zzf;
            zznyVar32.zzu.zzw().zzV(this.f47485zze, bundle2);
            throw th;
        }
    }
}
