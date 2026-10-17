package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzkb;
import com.google.android.gms.measurement.internal.zzkc;
import com.google.android.gms.measurement.internal.zzlx;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzb extends zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzlx f47767zza;

    public zzb(zzlx zzlxVar) {
        super(null);
        Preconditions.checkNotNull(zzlxVar);
        this.f47767zza = zzlxVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final int zza(String str) {
        return this.f47767zza.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final long zzb() {
        return this.f47767zza.zzb();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Boolean zzc() {
        return (Boolean) this.f47767zza.zzg(4);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Double zzd() {
        return (Double) this.f47767zza.zzg(2);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Integer zze() {
        return (Integer) this.f47767zza.zzg(3);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Long zzf() {
        return (Long) this.f47767zza.zzg(1);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final Object zzg(int i) {
        return this.f47767zza.zzg(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzh() {
        return this.f47767zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzi() {
        return this.f47767zza.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzj() {
        return this.f47767zza.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final String zzk() {
        return this.f47767zza.zzk();
    }

    @Override // com.google.android.gms.measurement.zzc
    public final String zzl() {
        return (String) this.f47767zza.zzg(0);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final List zzm(String str, String str2) {
        return this.f47767zza.zzm(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Map zzn(boolean z) {
        return this.f47767zza.zzo(null, null, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final Map zzo(String str, String str2, boolean z) {
        return this.f47767zza.zzo(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzp(String str) {
        this.f47767zza.zzp(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzq(String str, String str2, Bundle bundle) {
        this.f47767zza.zzq(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzr(String str) {
        this.f47767zza.zzr(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f47767zza.zzs(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzt(String str, String str2, Bundle bundle, long j2) {
        this.f47767zza.zzt(str, str2, bundle, j2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzu(zzkc zzkcVar) {
        this.f47767zza.zzu(zzkcVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzv(Bundle bundle) {
        this.f47767zza.zzv(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzw(zzkb zzkbVar) {
        this.f47767zza.zzw(zzkbVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlx
    public final void zzx(zzkc zzkcVar) {
        this.f47767zza.zzx(zzkcVar);
    }
}
