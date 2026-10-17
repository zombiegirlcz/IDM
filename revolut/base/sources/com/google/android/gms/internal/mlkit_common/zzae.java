package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzae extends zzaf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f40710zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f40711zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzaf f40712zzc;

    public zzae(zzaf zzafVar, int i, int i2) {
        this.f40712zzc = zzafVar;
        this.f40710zza = i;
        this.f40711zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzt.zza(i, this.f40711zzb, "index");
        return this.f40712zzc.get(i + this.f40710zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40711zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzb() {
        return this.f40712zzc.zzc() + this.f40710zza + this.f40711zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zzc() {
        return this.f40712zzc.zzc() + this.f40710zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final Object[] zze() {
        return this.f40712zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzaf, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzaf subList(int i, int i2) {
        zzt.zzd(i, i2, this.f40711zzb);
        int i3 = this.f40710zza;
        return this.f40712zzc.subList(i + i3, i2 + i3);
    }
}
