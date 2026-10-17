package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzbv extends zzbw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f45850zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f45851zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbw f45852zzc;

    public zzbv(zzbw zzbwVar, int i, int i2) {
        Objects.requireNonNull(zzbwVar);
        this.f45852zzc = zzbwVar;
        this.f45850zza = i;
        this.f45851zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbj.zza(i, this.f45851zzb, "index");
        return this.f45852zzc.get(i + this.f45850zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45851zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int zzb() {
        return this.f45852zzc.zzc() + this.f45850zza + this.f45851zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int zzc() {
        return this.f45852zzc.zzc() + this.f45850zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final Object[] zzg() {
        return this.f45852zzc.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzbw subList(int i, int i2) {
        zzbj.zzd(i, i2, this.f45851zzb);
        int i3 = this.f45850zza;
        return this.f45852zzc.subList(i + i3, i2 + i3);
    }
}
