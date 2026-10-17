package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
final class zzgb implements zzgi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzfx f39082zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzgz f39083zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzem f39084zzc;

    private zzgb(zzgz zzgzVar, zzem zzemVar, zzfx zzfxVar) {
        this.f39083zzb = zzgzVar;
        this.f39084zzc = zzemVar;
        this.f39082zza = zzfxVar;
    }

    public static zzgb zzb(zzgz zzgzVar, zzem zzemVar, zzfx zzfxVar) {
        return new zzgb(zzgzVar, zzemVar, zzfxVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj2) {
        return this.f39083zzb.zzb(obj2).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        zzfx zzfxVar = this.f39082zza;
        return zzfxVar instanceof zzev ? ((zzev) zzfxVar).zzc() : ((zzet) ((zzev) zzfxVar).zzn(5, null, null)).zzd();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj2) {
        this.f39083zzb.zze(obj2);
        this.f39084zzc.zzb(obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj2, Object obj3) {
        zzgk.zzd(this.f39083zzb, obj2, obj3);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj2, byte[] bArr, int i, int i2, zzdt zzdtVar) throws IOException {
        zzev zzevVar = (zzev) obj2;
        if (zzevVar.f39040zzc == zzha.zza()) {
            zzevVar.f39040zzc = zzha.zzd();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj2, Object obj3) {
        return this.f39083zzb.zzb(obj2).equals(this.f39083zzb.zzb(obj3));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj2) {
        this.f39084zzc.zza(obj2);
        throw null;
    }
}
