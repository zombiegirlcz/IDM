package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.util.concurrent.FutureCallback;

/* JADX INFO: loaded from: classes16.dex */
final class zzkt implements FutureCallback {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzov f47317zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47318zzb;

    public zzkt(zzlw zzlwVar, zzov zzovVar) {
        this.f47317zza = zzovVar;
        this.f47318zzb = zzlwVar;
    }

    private final void zza() {
        zzio zzioVar = this.f47318zzb.zzu;
        SparseArray sparseArrayZze = zzioVar.zzm().zze();
        zzov zzovVar = this.f47317zza;
        sparseArrayZze.put(zzovVar.f47634zzc, Long.valueOf(zzovVar.f47633zzb));
        zzht zzhtVarZzm = zzioVar.zzm();
        int[] iArr = new int[sparseArrayZze.size()];
        long[] jArr = new long[sparseArrayZze.size()];
        for (int i = 0; i < sparseArrayZze.size(); i++) {
            iArr[i] = sparseArrayZze.keyAt(i);
            jArr[i] = ((Long) sparseArrayZze.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhtVarZzm.f47098zzi.zzb(bundle);
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th10) {
        zzlw zzlwVar = this.f47318zzb;
        zzlwVar.zzg();
        zzlwVar.f47403zzi = false;
        zzio zzioVar = zzlwVar.zzu;
        int iZzaq = (zzioVar.zzf().zzx(null, zzgi.zzaZ) ? zzlw.zzaq(zzlwVar, th10) : 2) - 1;
        if (iZzaq == 0) {
            zzioVar.zzaW().zzk().zzc("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzhe.zzn(zzlwVar.zzu.zzh().zzm()), zzhe.zzn(th10.toString()));
            zzlwVar.f47404zzj = 1;
            zzlwVar.zzy().add(this.f47317zza);
            return;
        }
        if (iZzaq != 1) {
            zzioVar.zzaW().zze().zzc("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzhe.zzn(zzlwVar.zzu.zzh().zzm()), th10);
            zza();
            zzlwVar.f47404zzj = 1;
            zzlwVar.zzU();
            return;
        }
        zzlwVar.zzy().add(this.f47317zza);
        if (zzlwVar.f47404zzj > ((Integer) zzgi.zzav.zza(null)).intValue()) {
            zzlwVar.f47404zzj = 1;
            zzioVar.zzaW().zzk().zzc("registerTriggerAsync failed. May try later. App ID, throwable", zzhe.zzn(zzlwVar.zzu.zzh().zzm()), zzhe.zzn(th10.toString()));
        } else {
            zzioVar.zzaW().zzk().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzhe.zzn(zzlwVar.zzu.zzh().zzm()), zzhe.zzn(String.valueOf(zzlwVar.f47404zzj)), zzhe.zzn(th10.toString()));
            zzlw.zzF(zzlwVar, zzlwVar.f47404zzj);
            int i = zzlwVar.f47404zzj;
            zzlwVar.f47404zzj = i + i;
        }
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(Object obj2) {
        zzlw zzlwVar = this.f47318zzb;
        zzlwVar.zzg();
        zza();
        zzlwVar.f47403zzi = false;
        zzlwVar.f47404zzj = 1;
        zzlwVar.zzu.zzaW().zzd().zzb("Successfully registered trigger URI", this.f47317zza.f47632zza);
        zzlwVar.zzU();
    }
}
