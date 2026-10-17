package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzio;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzkc;
import com.google.android.gms.measurement.internal.zzlw;
import com.google.android.gms.measurement.internal.zzqb;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zza extends zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzio f47765zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzlw f47766zzb;

    public zza(@NonNull zzio zzioVar) {
        super(null);
        Preconditions.checkNotNull(zzioVar);
        this.f47765zza = zzioVar;
        this.f47766zzb = zzioVar.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final int zza(String str) {
        this.f47766zzb.zzi(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final long zzb() {
        return this.f47765zza.zzw().zzs();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Boolean zzc() {
        return this.f47766zzb.zzl();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Double zzd() {
        return this.f47766zzb.zzm();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Integer zze() {
        return this.f47766zzb.zzp();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Long zzf() {
        return this.f47766zzb.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final Object zzg(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? this.f47766zzb.zzl() : this.f47766zzb.zzp() : this.f47766zzb.zzm() : this.f47766zzb.zzq() : this.f47766zzb.zzu();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzh() {
        return this.f47766zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzi() {
        return this.f47766zzb.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzj() {
        return this.f47766zzb.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzk() {
        return this.f47766zzb.zzr();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final String zzl() {
        return this.f47766zzb.zzu();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final List zzm(String str, String str2) {
        return this.f47766zzb.zzv(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Map zzn(boolean z) {
        List<zzqb> listZzw = this.f47766zzb.zzw(z);
        ArrayMap arrayMap = new ArrayMap(listZzw.size());
        for (zzqb zzqbVar : listZzw) {
            Object objZza = zzqbVar.zza();
            if (objZza != null) {
                arrayMap.put(zzqbVar.f47716zzb, objZza);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final Map zzo(String str, String str2, boolean z) {
        return this.f47766zzb.zzx(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzp(String str) {
        zzio zzioVar = this.f47765zza;
        zzioVar.zzd().zzd(str, zzioVar.zzaU().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzq(String str, String str2, Bundle bundle) {
        this.f47765zza.zzq().zzJ(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzr(String str) {
        zzio zzioVar = this.f47765zza;
        zzioVar.zzd().zze(str, zzioVar.zzaU().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f47766zzb.zzO(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzt(String str, String str2, Bundle bundle, long j2) {
        this.f47766zzb.zzP(str, str2, bundle, true, false, j2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzu(zzkc zzkcVar) {
        this.f47766zzb.zzV(zzkcVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzv(Bundle bundle) {
        this.f47766zzb.zzad(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzw(zzkb zzkbVar) {
        this.f47766zzb.zzah(zzkbVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzx(zzkc zzkcVar) {
        this.f47766zzb.zzao(zzkcVar);
    }
}
