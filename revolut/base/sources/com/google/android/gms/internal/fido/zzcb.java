package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
final class zzcb extends zzcc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f39320zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f39321zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzcc f39322zzc;

    public zzcb(zzcc zzccVar, int i, int i2) {
        this.f39322zzc = zzccVar;
        this.f39320zza = i;
        this.f39321zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbm.zza(i, this.f39321zzb, "index");
        return this.f39322zzc.get(i + this.f39320zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39321zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzb() {
        return this.f39322zzc.zzc() + this.f39320zza + this.f39321zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int zzc() {
        return this.f39322zzc.zzc() + this.f39320zza;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final Object[] zze() {
        return this.f39322zzc.zze();
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* JADX INFO: renamed from: zzg */
    public final zzcc subList(int i, int i2) {
        zzbm.zze(i, i2, this.f39321zzb);
        int i3 = this.f39320zza;
        return this.f39322zzc.subList(i + i3, i2 + i3);
    }
}
